class OverwriteMode implements EditingState {
    @Override
    public void write(String text) {
        System.out.println("Overwrite Mode: " + text);
    }
}