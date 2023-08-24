public class Main {
    public static void main(String[] args) {
        MortalKombat mortalKombat=new MortalKombat();
        mortalKombat.startGame(MortalKombatCharacters.IRONMAN,MortalKombatCharacters.LIUKANG);
        mortalKombat.attack();
        mortalKombat.defense();
        mortalKombat.endGame("You win!");

        System.out.println();

        CallOfDuty callOfDuty=new CallOfDuty();
        callOfDuty.startGame(CallOfDutyCharacters.TAHLIL,CallOfDutyCharacters.FARUK);
        callOfDuty.endGame("You lose");
    }
}