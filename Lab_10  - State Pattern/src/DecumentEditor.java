class DocumentEditor {
    private EditingState currentMode;

    public DocumentEditor(EditingState mode) {
        this.currentMode = mode;
    }

    public void type(String text) {
        currentMode.write(text);
    }

    public void switchMode(EditingState newMode) {
        this.currentMode = newMode;
    }
}