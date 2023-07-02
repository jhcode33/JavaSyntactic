package com.jhcode.day0623;

public class SleepMessages {
	
	public static void main(String args[]) /*throws InterruptedException*/ {
	        String importantInfo[] = {
	            "Mares eat oats",
	            "Does eat oats",
	            "Little lambs eat ivy",
	            "A kid will eat ivy too"
	        };

	        for (int i = 0;
	             i < importantInfo.length;
	             i++) {
	        	
	            //Pause for 4 seconds
	        	long bef = 0;
	        	
	        	try {
	        		//시작 시간
	        		bef = System.currentTimeMillis();
	        		
	        		//Thread Class의 sleep() 메소드가 실행될 때 
	        		//InterruptedException을 던질 수도 있기 때문에 예외처리를 해줘야 한다.
	        		 Thread.sleep(4000);
	        		 
				} catch (InterruptedException e) {
					 
				}
	        	//끝난 시간
	        	long aft = System.currentTimeMillis();
	        	
	        	//경과 시간
	        	System.out.println("경과 시간: " + (aft - bef));
	        	
	            //Print a message
	            System.out.println(importantInfo[i]);
	        }
	    }
}
