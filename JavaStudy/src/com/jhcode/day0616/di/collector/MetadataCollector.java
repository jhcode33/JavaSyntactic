package com.jhcode.day0616.di.collector;

import com.jhcode.day0616.di.export.ExportMetadata;
import com.jhcode.day0616.di.fetch.FetchMetadata;

public interface MetadataCollector {

	public void setMetadataCollector(FetchMetadata fetchMetadata, ExportMetadata exportMetadata);
	public void collectMetadata();
	public void print();
}
