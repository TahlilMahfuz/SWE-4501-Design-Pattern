public class VirtualMachine implements IWindows{
    public ILinux linuxInstance;

    public VirtualMachine(ILinux linuxInstance) {
        this.linuxInstance = linuxInstance;
    }

    public void startLinux() {
        System.out.println("Launching linux....launched!");
    }

    public void executeLinuxCommand(String command) {
        linuxInstance.runCommand(command);
    }

    public void accessLinuxTerminal() {
        linuxInstance.openTerminal();
    }

    @Override
    public void browseFiles() {
        System.out.println("Browsing files in windows");
    }
}
