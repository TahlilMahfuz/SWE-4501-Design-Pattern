public class MortalKombat extends CombatGame {
    // Template method
    protected final void attack(){
        uppercut();
        punch();
    }

    protected final void defense(){
        shield();
        dodge();
    }
    private void uppercut() {
        System.out.println("You thrown an uppercut");
    }

    private void punch() {
        System.out.println("You are punching");
    }


    private void shield() {
        System.out.println("Blocking Attacks");
    }

    private void dodge() {
        System.out.println("Dodged a hit");
    }

    @Override
    protected void initialize() {
        System.out.println("Mortal Kombat initializing");
    }

    @Override
    protected void fight() {
        System.out.println("Mortal kombat fighting started");
    }

    //Template Pattern
    @Override
    protected void endGame(String result) {
        System.out.println("Fight ended.");
        showResult(result);
    }
}
