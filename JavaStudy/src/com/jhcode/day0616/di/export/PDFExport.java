package com.jhcode.day0616.di.export;

import java.io.File;
import java.util.List;

public class PDFExport implements ExportMetadata {
	
	private PDFExport() {}
	public static PDFExport pdfExport;
	
	public static PDFExport getInstance() {
		if(pdfExport == null) pdfExport = new PDFExport();
		return pdfExport;
	}
	
    public File export(List<Object> metadata) {
        System.out.println("PDFExport Exporting data...");
        // Export Metadata
        File outputPDF = null;
        return outputPDF;
    }
}
