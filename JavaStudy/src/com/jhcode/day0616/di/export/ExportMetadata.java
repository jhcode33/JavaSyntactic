package com.jhcode.day0616.di.export;

import java.io.File;
import java.util.List;

public interface ExportMetadata {
	
	public File export(List<Object> metadata);
	
}
