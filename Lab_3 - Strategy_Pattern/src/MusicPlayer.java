public class MusicPlayer {
    IMusicMode MusicMode;
    public MusicPlayer(IMusicMode musicMode) {
        this.MusicMode = musicMode;
    }
    public void play(){
        System.out.println("Music is playing and the attributes are: ");
        System.out.println("Bass: "+MusicMode.showBass());
        System.out.println("Treble: "+MusicMode.showTreble());
        System.out.println("Volume: "+MusicMode.showVolume());
        System.out.println("Music ended!Have a nice day!\n\n");
    }

}
