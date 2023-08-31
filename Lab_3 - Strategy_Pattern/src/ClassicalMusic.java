public class ClassicalMusic extends MusicAttributes implements IMusicMode{
    public ClassicalMusic(){
        this.bass="40";
        this.treble="90";
        this.volume="70";
    }
    public ClassicalMusic(String bass,String treble, String volume){
        this.bass=bass;
        this.treble=treble;
        this.volume=volume;
    }
    @Override
    public String showBass() {
        return bass;
    }

    @Override
    public String showTreble() {
        return treble;
    }

    @Override
    public String showVolume() {
        return volume;
    }
}
