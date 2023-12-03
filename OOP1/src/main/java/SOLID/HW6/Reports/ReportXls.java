package SOLID.HW6.Reports;

import SOLID.HW6.Documents.Document;
import SOLID.HW6.Reports.Interface.Reportable;

public class ReportXls implements Reportable {
    @Override
    public byte[] createReport(Document document) {
        return new byte[0];
    }
}
