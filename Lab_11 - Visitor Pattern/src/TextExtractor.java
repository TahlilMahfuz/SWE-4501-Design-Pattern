class TextExtractor implements DocumentVisitor {
    private StringBuilder extractedText = new StringBuilder();

    public String getExtractedText() {
        return extractedText.toString();
    }

    @Override
    public void visit(Paragraph paragraph) {
        extractedText.append(paragraph.getText()).append(" ");
    }

    @Override
    public void visit(Hyperlink hyperlink) {
        extractedText.append(hyperlink.getText()).append(" (").append(hyperlink.getUrl()).append(") ");
    }
}