public class Player {
    String name;
    private static final Player player= new Player();
    private Player(){}
    public static Player getInstance(){
        return player;
    }
}
