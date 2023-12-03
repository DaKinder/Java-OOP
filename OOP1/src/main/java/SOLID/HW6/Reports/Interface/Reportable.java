package SOLID.HW6.Reports.Interface;

import SOLID.HW6.Documents.Document;

public interface Reportable {
    public byte[] createReport(Document document);
}
