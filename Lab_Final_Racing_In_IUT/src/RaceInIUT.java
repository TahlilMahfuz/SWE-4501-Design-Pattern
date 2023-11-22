import java.util.Scanner;

public class RaceInIUT {
    public static Race createRace(Car car, Track track){
        return new Race(car, track);
    }
    public static Engine getv6Engine(){return new V6Engine();}
    public static Engine getv8Engine(){return new V8Engine();}
    public static Engine getv12Engine(){return new V12Engine();}
    public static TurboCharger getHoneywellTurboCharger(){return new Honeywell();}
    public static TurboCharger getCumminsTurboCharger(){return new Cummins();}
    public static TurboCharger getAlpineTurboCharger(){return new Alpine();}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            //create player
            System.out.println("Enter your name: ");
            String playerName = scanner.nextLine();
            Player player = Player.getInstance();
            player.name=playerName;
            System.out.println("Hello "+player.name+"!\n");


            //Create Car
            System.out.println("Choose a car: (1.Coupe 2.RoadStar)\n");
            int carCategory = scanner.nextInt();
            switch (carCategory){
                case 1 -> carCategory= 1;
                case 2 -> carCategory = 2;
                default -> throw new IllegalStateException("Unexpected value: " + carCategory);
            }
            CarAbstractFactory carFactory =carCategory == 1 ? CarFactoryProducer.getFactory("COUPE") : CarFactoryProducer.getFactory("ROADSTER");
            assert carFactory != null;
            int carType;
            String carName;
            if(carCategory == 1) {
                System.out.println("Choose a coupe car: (1.TOYOTA 2.SUBARUBRZ)\n");
                carType = scanner.nextInt();
                switch (carType){
                    case 1 -> carName = "TOYOTA";
                    case 2 -> carName = "SUBARUBRZ";
                    default -> throw new IllegalStateException("Unexpected value: " + carType);
                }
            }
            else {
                System.out.println("Choose a road star car: (3.PORSHE 4.FERRARI)\n");
                carType = scanner.nextInt();
                switch (carType){
                    case 3 -> carName = "PORSHE";
                    case 4 -> carName = "FERRARI";
                    default -> throw new IllegalStateException("Unexpected value: " + carType);
                }
            }


            //create a map of engines and turboChargers
            Engine engine = null;
            TurboCharger turboCharger = null;
            System.out.println("Choose an engine: (1.V6 2.V8 3.V12)\n");
            int engineCategory = scanner.nextInt();
            switch (engineCategory) {
                case 1 -> engine = getv6Engine();
                case 2 -> engine = getv8Engine();
                case 3 -> engine = getv12Engine();
                default -> throw new IllegalStateException("Unexpected value: " + engineCategory);
            }
            System.out.println("Choose a turbo charger: (1.Honeywell 2.Cummins 3.Alpine)\n");
            int turboChargerCategory = scanner.nextInt();
            switch (turboChargerCategory) {
                case 1 -> turboCharger = getHoneywellTurboCharger();
                case 2 -> turboCharger = getCumminsTurboCharger();
                case 3 -> turboCharger = getAlpineTurboCharger();
                default -> throw new IllegalStateException("Unexpected value: " + turboChargerCategory);
            }
            Car car = carFactory.getCar(carName, engine, turboCharger);
            car.showCarInfo();
            System.out.println('\n');


            //Create Track
            TrackFactory trackFactory= new TrackFactory();
            System.out.println("Choose a track: (1.Sprint 2.Circuit)\n");
            int trackCategory = scanner.nextInt();
            String trackName;
            if(trackCategory==1){
                System.out.println("Choose a sprint track: (1.BBRacewayJapan 2.BlueMoonBaySpeedwayUSA)\n");
                int sprintTrackCategory = scanner.nextInt();
                if(sprintTrackCategory==1){
                    trackName = "BBRacewayJapan";
                }
                else{
                    trackName = "BlueMoonBaySpeedwayUSA";
                }
            }
            else{
                System.out.println("Choose a circuit track: (1.CircuitDeSpaFrancorchampsGermany)\n");
                trackName = "CircuitDeSpaFrancorchampsGermany";
            }
            Track track = trackFactory.getTrack(trackName);
            track.showTrackInfo();


            //Create a race
            Race race = createRace(car, track);
            race.startRace();

            System.out.println("\n\nCongratulations! "+player.name+"\nYou have finished the race");
        }
        catch (Exception e){
            //print exception
            System.out.println(e);
            System.out.println("Your input was wrong!Let's try again.");
            main(args);
        }
    }
}