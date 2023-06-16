package com.jhcode.day0616.di.export;

import java.io.File;
import java.util.List;

public class CSVExport implements ExportMetadata {
	
	private CSVExport() {}
	public static CSVExport csvExport;
	
	public static CSVExport getInstance() {
		if(csvExport == null) csvExport = new CSVExport();
		return csvExport;
	}

    public File export(List<Object> metadata) {
        System.out.println("CSV Exporting data...");
        // Export Metadata
        File outputCSV = null;
        return outputCSV;
    }
}
