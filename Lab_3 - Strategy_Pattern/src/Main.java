public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer=new MusicPlayer(new RockMusic("10","20","30"));
        MusicPlayer musicPlayer2=new MusicPlayer(new RockMusic());
        musicPlayer.play();
        musicPlayer2.play();

        MusicPlayer musicPlayer1=new MusicPlayer(new ClassicalMusic());
        musicPlayer1.play();
    }
}