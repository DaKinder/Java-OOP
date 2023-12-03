package SOLID.HW6;

import SOLID.HW6.Documents.Document;
import SOLID.HW6.Reports.Interface.Reportable;

import java.util.Map;

class ReportProcessing {
    private Map<String, Reportable> reportsMap;

    public ReportProcessing(Map<String, Reportable> reportsMap){
        this.reportsMap = reportsMap;
    }
    public byte[] createReport(Document document, String reportType) {
        Reportable report = this.reportsMap.get(reportType);
        return report.createReport(document);
    }
}