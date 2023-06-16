package com.jhcode.day0616.di.fetch;

import java.util.ArrayList;
import java.util.List;

public class JSONFetch implements FetchMetadata {
	
	private JSONFetch() {}
	private static JSONFetch jsonFetch;
	
	public static JSONFetch getInstance() {
		if (jsonFetch == null) jsonFetch = new JSONFetch();
		return jsonFetch;
	}

    public List<Object> fetchMetadata() {
        List<Object> metadata = new ArrayList<>();
        System.out.println("JSON Fetching data...");
        return metadata;
    }
}
