public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        RemoteControl basicRemoteTV = new BasicRemote(tv);
        RemoteControl basicRemoteRadio = new BasicRemote(radio);

        basicRemoteTV.powerOn();
        basicRemoteTV.setChannel(5);
        basicRemoteTV.powerOff();

        basicRemoteRadio.powerOn();
        basicRemoteRadio.setChannel(101);
        basicRemoteRadio.powerOff();
    }
}