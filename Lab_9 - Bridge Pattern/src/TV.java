class TV implements Device {
    private boolean isOn = false;
    private int currentChannel = 0;

    @Override
    public void turnOn() {
        System.out.println("TV is ON");
        isOn = true;
    }

    @Override
    public void turnOff() {
        System.out.println("TV is OFF");
        isOn = false;
    }

    @Override
    public void setChannel(int channel) {
        if (isOn) {
            currentChannel = channel;
            System.out.println("Channel set to " + channel);
        } else {
            System.out.println("Cannot set the channel. TV is OFF.");
        }
    }
}