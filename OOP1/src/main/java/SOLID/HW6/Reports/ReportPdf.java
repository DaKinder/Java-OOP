package SOLID.HW6.Reports;

import SOLID.HW6.Documents.Document;
import SOLID.HW6.Documents.PdfDocument;
import SOLID.HW6.Reports.Interface.Reportable;

public class ReportPdf implements Reportable {
    @Override
    public byte[] createReport(Document document) {
        byte[] pdfDocument = new byte[2];
        //Код создания PDF документа
        return pdfDocument;
    }
}
