package com.jhcode.day0616.di.tc;

import com.jhcode.day0616.di.collector.CSVMetadataCollector;
import com.jhcode.day0616.di.collector.MetadataCollector;
import com.jhcode.day0616.di.collector.PDFMetadataCollector;
import com.jhcode.day0616.di.export.CSVExport;
import com.jhcode.day0616.di.export.ExportMetadata;
import com.jhcode.day0616.di.export.PDFExport;
import com.jhcode.day0616.di.fetch.FetchMetadata;
import com.jhcode.day0616.di.fetch.JSONFetch;
import com.jhcode.day0616.di.fetch.XMLFetch;

public class Program {
	 //== 제 3자 client ==//
	 public static void setMetadataCollector(MetadataCollector mdcollector,
	         FetchMetadata fetchMetadata, 
	         ExportMetadata exportMetadata) {
	      mdcollector.setMetadataCollector(fetchMetadata, exportMetadata);
	   }
	   
	   public static void collectMetadata(MetadataCollector mdcollector) {
	      mdcollector.collectMetadata();
	   }

	   public static void print(MetadataCollector mdcollector) {
	      mdcollector.print();
	   }
	   
	   //== main method ==//
	   public static void main(String[] args) {
		  //어떤 타입의 Fetch, Export를 사용할지 Client가 정한다.
	      FetchMetadata fetchMetadata1 = JSONFetch.getInstance();
	      ExportMetadata exportMetadata1 = PDFExport.getInstance();
	      
	      MetadataCollector mdcollector1 = new PDFMetadataCollector();
	      setMetadataCollector(mdcollector1, fetchMetadata1, exportMetadata1);
	      collectMetadata(mdcollector1);
	      print(mdcollector1);
	      
	      FetchMetadata fetchMetadata2 = XMLFetch.getInstance();
	      ExportMetadata exportMetadata2 = CSVExport.getInstance();
	      
	      MetadataCollector mdcollector2 = new CSVMetadataCollector();
	      setMetadataCollector(mdcollector2, fetchMetadata2, exportMetadata2);
	      collectMetadata(mdcollector2);
	      print(mdcollector2);
//	      mdcollector.setMetadataCollector(fetchMetadata, exportMetadata);
//	      mdcollector.collectMetadata();
//	      mdcollector.print();
	   }
	}
