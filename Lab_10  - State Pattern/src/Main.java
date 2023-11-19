public class Main {
    public static void main(String[] args) {
        EditingState insertMode = new InsertMode();
        EditingState overwriteMode = new OverwriteMode();

        DocumentEditor editor = new DocumentEditor(insertMode);
        editor.type("Hello");

        editor.switchMode(overwriteMode);
        editor.type("World");
    }
}