interface DocumentVisitor {
    void visit(Paragraph paragraph);
    void visit(Hyperlink hyperlink);
}