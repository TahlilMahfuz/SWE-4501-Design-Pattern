public class TrackFactory {
    public Track getTrack(String trackType){
        if(trackType == null){
            return null;
        }
        else if(trackType.equalsIgnoreCase("BlueMoonBaySpeedwayUSA")){
            return new BlueMoonBaySpeedwayUSA();
        }
        else if(trackType.equalsIgnoreCase("CircuitDeSpaFrancorchampsGermany")){
            return new CircuitDeSpaFrancorchampsGermany();
        }
        else if(trackType.equalsIgnoreCase("BBRacewayJapan")){
            return new BBRacewayJapan();
        }
        return null;
    }
}
