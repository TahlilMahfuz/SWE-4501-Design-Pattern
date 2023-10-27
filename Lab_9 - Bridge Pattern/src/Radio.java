class Radio implements Device {
    private boolean isOn = false;
    private int currentChannel = 0;

    @Override
    public void turnOn() {
        System.out.println("Radio is ON");
        isOn = true;
    }

    @Override
    public void turnOff() {
        System.out.println("Radio is OFF");
        isOn = false;
    }

    @Override
    public void setChannel(int channel) {
        if (isOn) {
            currentChannel = channel;
            System.out.println("Frequency set to " + channel);
        } else {
            System.out.println("Cannot set the channel. Radio is OFF.");
        }
    }
}