
package com.abstraction;
import java.util.Arrays;
abstract class ReportGenerator{
	String samplereport;
	public ReportGenerator(String samplereport) {
		this.samplereport=samplereport;
	}
	public abstract void generateContent();
	public void displaydetails() {
	}
	
	public void openFile() {
		System.out.println("opening a pdf file");
		
	}
	
	public void writeContent() {
		System.out.println("writing to content to pdf file");
}
	public void saveFile() {
		System.out.println("saving a pdf file");
	}
}
	class PDFReport extends ReportGenerator{
		String blocktext;
		public PDFReport( String samplereport,String blocktext) {
			super(samplereport);
			this.blocktext=blocktext;	
		}
		public void displaydetails() {
			System.out.println(samplereport+blocktext);
		}
		public void generateContent() {
			System.out.println("Generating PDF content with block text");	
		}	
		
		}
			
		
	class ExcelReport extends ReportGenerator{
		String []tabulardata;
		public ExcelReport( String samplereport,String []tabulardata) {
			super(samplereport);
			this.tabulardata=tabulardata;
			
		}
		public void displaydetails() {
			 System.out.println(samplereport + " " + Arrays.toString(tabulardata));
		}
		public void generateContent() {
			System.out.println("Generating excel content with block text");
	}
	}
	class HtmlReport extends ReportGenerator{
		String markupContent;
		public HtmlReport(String samplereport,String markupContent) {
			super(samplereport);	
		}
		public void generateContent() {
			System.out.println("Generating html content with markuplanguage");
	}
		
	}
public class Example6{
	public static void main(String[] args) {
		ReportGenerator rep = new PDFReport
				("PDFformat:","This is a sample block text.");
		rep.displaydetails();
		rep.generateContent();
		rep.openFile();
		rep.writeContent();
		rep.saveFile();
		String[] tabular = new String[]{"name,age","rahul,45"};
		ReportGenerator rep1 = new ExcelReport("sample report", tabular);
		rep1.displaydetails();
		rep1.generateContent();
		rep1.openFile();
		rep1.writeContent();
		rep1.saveFile();
		
		

	}

}
