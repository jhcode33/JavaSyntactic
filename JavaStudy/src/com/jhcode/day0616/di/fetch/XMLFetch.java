package com.jhcode.day0616.di.fetch;

import java.util.ArrayList;
import java.util.List;

public class XMLFetch implements FetchMetadata {
	
	//싱글톤
	private XMLFetch() {}
	public static XMLFetch xmlFetch;	
    
    public static XMLFetch getInstance() {
    	if(xmlFetch == null) xmlFetch = new XMLFetch();
    	return xmlFetch;
    }
    
    public List<Object> fetchMetadata() {
        List<Object> metadata = new ArrayList<>();
        System.out.println("XML Fetching data...");
        return metadata;
    }
}