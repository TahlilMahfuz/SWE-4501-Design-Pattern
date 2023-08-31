public class SoftMusic extends MusicAttributes implements IMusicMode{
    public SoftMusic(){
        this.bass="70";
        this.treble="80";
        this.volume="14";
    }
    public SoftMusic(String bass,String treble,String volume){
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
