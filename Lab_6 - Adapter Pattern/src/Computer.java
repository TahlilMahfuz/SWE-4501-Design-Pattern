public class Computer implements IWindows{
    public VirtualMachine virtualMachine;

    public Computer() {
        this.virtualMachine = new VirtualMachine(new LinuxBash());
    }
    public void executeCommandOnVM(String command) {
        virtualMachine.executeLinuxCommand(command);
    }

    public void accessTerminalOnVM() {
        virtualMachine.accessLinuxTerminal();
    }
    @Override
    public void browseFiles() {
        System.out.println("Browsing files in windows");
    }
}
