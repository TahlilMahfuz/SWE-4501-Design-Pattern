public class BBRacewayJapan implements Track{
    @Override
    public void showTrackInfo() {
        System.out.println("Track: BB Raceway Japan");
        finishingLine();
    }

    @Override
    public void finishingLine() {
        System.out.println("Finishing Line: End of the track");
    }
}
