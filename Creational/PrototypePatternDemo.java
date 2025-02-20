// PrototypePatternExample.java

import java.util.HashMap;
import java.util.Map;

// Prototype Interface
interface Document {
    Document clone();
    void display();
}

// Concrete Prototype: PDFDocument
class PDFDocument implements Document {
    private String content;

    public PDFDocument(String content) {
        this.content = content;
    }

    @Override
    public Document clone() {
        return new PDFDocument(content);
    }

    @Override
    public void display() {
        System.out.println("Displaying PDF Document: " + content);
    }
}

// Concrete Prototype: ExcelDocument
class ExcelDocument implements Document {
    private String content;

    public ExcelDocument(String content) {
        this.content = content;
    }

    @Override
    public Document clone() {
        return new ExcelDocument(content);
    }

    @Override
    public void display() {
        System.out.println("Displaying Excel Document: " + content);
    }
}

// DocumentManager Class
class DocumentManager {
    private static Map<String, Document> documentMap = new HashMap<>();

    public static void loadCache() {
        PDFDocument pdfDocument = new PDFDocument("Sample PDF Content");
        documentMap.put("PDF", pdfDocument);

        ExcelDocument excelDocument = new ExcelDocument("Sample Excel Content");
        documentMap.put("Excel", excelDocument);
    }

    public static Document getDocument(String documentType) {
        Document cachedDocument = documentMap.get(documentType);
        return cachedDocument.clone();
    }
}

// Client Code
public class PrototypePatternDemo {
    public static void main(String[] args) {
        // Load the cache with documents
        DocumentManager.loadCache();

        // Get a PDF document from the cache and display it
        Document clonedPDF = DocumentManager.getDocument("PDF");
        clonedPDF.display();

        // Get an Excel document from the cache and display it
        Document clonedExcel = DocumentManager.getDocument("Excel");
        clonedExcel.display();
    }
}