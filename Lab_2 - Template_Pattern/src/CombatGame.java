abstract class CombatGame{
    Icharacter myCharacter,opponent;
    // Template method
    protected final void startGame(Icharacter myCharacter,Icharacter opponent) {
        initialize();
        chooseCharacter(myCharacter);
        selectOpponent(opponent);
        System.out.println(myCharacter + " vs "+opponent);
        fight();
    }

    abstract void initialize();
    abstract void fight();
    abstract void endGame(String result);




    // Hook method
    private void chooseCharacter(Icharacter myCharacter) {
        this.myCharacter=myCharacter;
    }
    private void selectOpponent(Icharacter opponent) {
        this.opponent=opponent;
    }
    protected void showResult(String result) {
        System.out.println(result);
    }
}
