package com.jhcode.day0616.di.collector;

import java.util.List;

import com.jhcode.day0616.di.export.ExportMetadata;
import com.jhcode.day0616.di.fetch.FetchMetadata;
import com.jhcode.day0616.di.fetch.JSONFetch;

public class CSVMetadataCollector implements MetadataCollector {
	
    private FetchMetadata fetchMetadata;
    private ExportMetadata exportMetadata;
    
    //인터페이스의 구현체를 받아서 저장함.
    @Override
	public void setMetadataCollector(FetchMetadata fetchMetadata, ExportMetadata exportMetadata) {
    	this.fetchMetadata = fetchMetadata;
    	this.exportMetadata = exportMetadata;
	}

	@Override
	public void collectMetadata() {
		//구현체를 구별해서 if문으로 실행하면 됨.
		//-> 어떤 타입의 Fetch와 Export를 쓸지 client에서 정하기 때문에 if문 안해됨
		List<Object> metatdata = fetchMetadata.fetchMetadata();
		exportMetadata.export(metatdata);
	}
    
    public void print() {
    	String inputTypeString;
    	if (fetchMetadata instanceof JSONFetch) {
    		inputTypeString = "JSON";
    	} else {
    		inputTypeString = "XML";
    	}
    		
    	System.out.println("CSV Exporting data to " + inputTypeString);
    	
    }
}
