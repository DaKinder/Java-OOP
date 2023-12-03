package SOLID.HW6;

import SOLID.HW6.Documents.PdfDocument;
import SOLID.HW6.Reports.ReportJson;
import SOLID.HW6.Reports.ReportPdf;
import SOLID.HW6.Reports.ReportXls;
import SOLID.HW6.Reports.ReportXml;

import java.util.Map;

public class Program {
    public static void main(String[] args) {
        ReportProcessing rp = new ReportProcessing( Map.of(
                "PDF", new ReportPdf(),
                "JSON", new ReportJson(),
                "XML", new ReportXml(),
                "XLS", new ReportXls()));

        System.out.println();
    }


}
