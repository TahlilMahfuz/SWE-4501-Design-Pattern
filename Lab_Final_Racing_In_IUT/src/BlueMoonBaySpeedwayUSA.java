public class BlueMoonBaySpeedwayUSA implements Track{
    @Override
    public void showTrackInfo() {
        System.out.println("Track: Blue Moon Bay Speedway USA");
        finishingLine();
    }

    @Override
    public void finishingLine() {
        System.out.println("Finishing Line: End of the track");
    }
}
