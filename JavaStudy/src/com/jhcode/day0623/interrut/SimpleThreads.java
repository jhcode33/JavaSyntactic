package com.jhcode.day0623.interrut;

public class SimpleThreads {
	
	   // Display a message, preceded by
    // the name of the current thread
    static void threadMessage(String message) {
        String threadName =
            Thread.currentThread().getName();
        System.out.format("%s: %s%n",
                          threadName,
                          message);
    }

    private static class MessageLoop implements Runnable {
        
    	public void run() {
            String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
            };
            
            try {
                for (int i = 0;
                     i < importantInfo.length;
                     i++) {
                    // Pause for 4 seconds
                    Thread.sleep(4000);
                    // Print a message
                    threadMessage(importantInfo[i]);
                }
            } catch (InterruptedException e) {
                threadMessage("I wasn't done!");
            }
        }
    }

    public static void main(String args[]) throws InterruptedException {

        // Delay, in milliseconds before
        // we interrupt MessageLoop
        // thread (default one hour).
        long patience = 1000;

        // If command line argument
        // present, gives patience
        // in seconds.
        if (args.length > 0) {
            try {
                patience = Long.parseLong(args[0]) * 1000;
                
            } catch (NumberFormatException e) {
                System.err.println("Argument must be an integer.");
                System.exit(1);
            }
        }

        threadMessage("Starting MessageLoop thread");
        long startTime = System.currentTimeMillis();
        
        Thread t = new Thread(new MessageLoop());
        t.start();

        threadMessage("Waiting for MessageLoop thread to finish");
        // loop until MessageLoop
        // thread exits -> thread가 살아 있는 여부를 나타냄.
        while (t.isAlive()) {
            threadMessage("Still waiting...");
            // Wait maximum of 1 second
            // for MessageLoop thread
            // to finish.
            t.join(1000); //t.start() 메소드가 실행을 끝난 것을 다 기다릴 순 없고, 1초 동안 기다리겠다.
            //t.join();을 하면 t.start() 메소드로 실행한 MessageLope의 run() 메소드가 끝날 때가지 멈춘다.
            //이를 blocking이라고 한다.
            //
            
            
            //현재 시간이 1시간이 지나야 실행됨. -> 1초 동안 실행 되는 것으로 patience 값을 수정함.
            if (((System.currentTimeMillis() - startTime) > patience)
                  && t.isAlive()) {
                threadMessage("Tired of waiting!");
                t.interrupt(); 
                //run 메소드를 실행한 Thread가 sleep 상태에 있을 때, interrupt() 메소드를 호출되면,
                //해당 Thread의 sleep 상태가 해제됨. 이때 InterruptedException을 발생시킴.
                // Shouldn't be long now
                // -- wait indefinitely
                t.join();
            }
        }
        threadMessage("Finally!");
    }

}
