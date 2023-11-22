public class SprintRace extends Race{
    public SprintRace(Car car, Track track) {
        super(car, track);
    }

    @Override
    protected void showRaceInfo() {
        System.out.println("\n\n");
        car.showCarInfo();
        showRaceType();
        track.showTrackInfo();
    }

    @Override
    protected void showRaceType() {
        System.out.println("Race Type: Sprint");
    }

    @Override
    protected void startLine(Track track) {
        track.startLine();
    }

    @Override
    protected void finishLine(Track track) {
        track.finishingLine();
    }
}
