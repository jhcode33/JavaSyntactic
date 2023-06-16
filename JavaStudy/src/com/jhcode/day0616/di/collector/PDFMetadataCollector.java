package com.jhcode.day0616.di.collector;

import java.util.List;

import com.jhcode.day0616.di.export.ExportMetadata;
import com.jhcode.day0616.di.fetch.FetchMetadata;
import com.jhcode.day0616.di.fetch.JSONFetch;

public class PDFMetadataCollector implements MetadataCollector {
	
	private FetchMetadata fetchMetadata;
	private ExportMetadata exportMetadata;
	
    @Override
	public void setMetadataCollector(FetchMetadata fetchMetadata, ExportMetadata exportMetadata) {
    	this.fetchMetadata = fetchMetadata;
    	this.exportMetadata = exportMetadata;
	}

	@Override
	public void collectMetadata() {
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
    	System.out.println("PDF Exporting data to " + inputTypeString);
    }

}
