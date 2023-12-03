package SOLID.HW6.Reports;

import SOLID.HW6.Documents.Document;
import SOLID.HW6.Reports.Interface.Reportable;

public class ReportXml implements Reportable {
    @Override
    public byte[] createReport(Document document) {
        byte[] xmlDocument = new byte[2];
        //Код создания XML документа
        return xmlDocument;
    }
}
