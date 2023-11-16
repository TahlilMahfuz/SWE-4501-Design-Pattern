public class CircuitDeSpaFrancorchampsGermany implements Track{
    @Override
    public void showTrackInfo() {
        System.out.println("Track: Circuit De Spa Francorchamps Germany");
        startLine();
        finishingLine();
    }

    @Override
    public void startLine() {
        System.out.println("Start Line: Start of the track");
    }

    @Override
    public void finishingLine() {
        System.out.println("Finishing Line: Start of the track");
    }
}
