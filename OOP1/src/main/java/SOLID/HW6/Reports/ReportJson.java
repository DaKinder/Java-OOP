package SOLID.HW6.Reports;

import SOLID.HW6.Documents.Document;
import SOLID.HW6.Reports.Interface.Reportable;

public class ReportJson implements Reportable {
    @Override
    public byte[] createReport(Document document) {
        byte[] jsonDocument = new byte[2];
        //Код создания JSON документа
        return jsonDocument;
    }
}
