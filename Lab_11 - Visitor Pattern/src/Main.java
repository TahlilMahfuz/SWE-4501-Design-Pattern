public class Main {
    public static void main(String[] args) {
        Paragraph paragraph = new Paragraph("This is a paragraph.");
        Hyperlink hyperlink = new Hyperlink("https://example.com", "Example Website");

        TextExtractor textExtractor = new TextExtractor();

        paragraph.accept(textExtractor);
        hyperlink.accept(textExtractor);

        System.out.println("Extracted Text: " + textExtractor.getExtractedText());
    }
}