public class BlueMoonBaySpeedwayUSA implements Track{
    @Override
    public void showTrackInfo() {
        System.out.println("Track: Blue Moon Bay Speedway USA");
        startLine();
        finishingLine();
    }

    @Override
    public void startLine() {
        System.out.println("Start Line: Start of the track");
    }

    @Override
    public void finishingLine() {
        System.out.println("Finishing Line: End of the track");
    }
}
