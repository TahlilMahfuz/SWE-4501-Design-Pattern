public class CallOfDuty extends CombatGame {
    @Override
    protected void fight() {
        shoot();
        hide();
        heal();
        throwingGranade();
    }
    private void shoot(){
        System.out.println("Player is shooting");
    }
    private void hide(){
        System.out.println("Player is hiding");
    }
    private void heal() {
        System.out.println("Player is Healing");
    }
    private void throwingGranade() {
        System.out.println("Player is throwing granade");
    }
    @Override
    protected void initialize() {
        System.out.println("CallOfDuty initializing");
    }



    @Override
    protected void endGame(String result) {
        System.out.println("Fight ended.");
        showResult(result);
    }
}
