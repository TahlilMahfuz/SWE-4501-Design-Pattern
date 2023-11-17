class InsertMode implements EditingState {
    @Override
    public void write(String text) {
        System.out.println("Insert Mode: " + text);
    }
}