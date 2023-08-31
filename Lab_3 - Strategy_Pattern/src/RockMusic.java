public class RockMusic extends MusicAttributes implements IMusicMode{
    public RockMusic(){
        this.bass="90";
        this.treble="10";
        this.volume="90";
    }
    public RockMusic(String bass,String treble, String volume){
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
