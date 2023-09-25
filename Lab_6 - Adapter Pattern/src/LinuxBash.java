public class LinuxBash implements ILinux {
    @Override
    public void openTerminal() {
        System.out.println("Linux opened its terminal");
    }

    @Override
    public void runCommand(String command) {
        System.out.println(command+"command executed");
    }

    @Override
    public void browseFiles() {
        System.out.println("Browsing files in linux");
    }
}
