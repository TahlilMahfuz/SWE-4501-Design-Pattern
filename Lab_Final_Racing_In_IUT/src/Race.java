import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;

public abstract class Race {
    protected final Car car;
    protected final Track track;
    public Race(Car car, Track track) {
        this.car=car;
        this.track=track;
    }
    protected abstract void showRaceInfo();
    protected abstract void showRaceType();
    protected abstract void startLine(Track track);
    protected abstract void finishLine(Track track);
    //Hook Method
    //Private methods are implicitly final in java
    private void startCar(Car car){
        car.start();
    }
    private void accelerateCar(Car car){
        car.accelerate();
    }
    private void applyNOS(Car car,NOS nos){
        NOSCarDecorator.setNos(car,nos);
    }
    private void stopCar(Car car){
        car.stop();
    }
    private void pitStop(Car car){
        System.out.println("Pit Stop...................");
        NOS nos=null;
        System.out.println("Select NOS: 1.Resonac 2.Sema");
        Scanner sc = new Scanner(System.in);
        int nosChoice=sc.nextInt();
        switch(nosChoice){
            case 1:
                nos=new Resonac();
                break;
            case 2:
                nos=new Sema();
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
        assert nos != null;
        System.out.println("Applying NOS : "+nos.getClass().getSimpleName());
        applyNOS(car,nos);
        System.out.println("NOS is applied successfully.Exiting Pit Stop...................");
        accelerateCar(car);
    }
    private void lapTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Random random = new Random();
        long milliseconds = random.nextLong() % 3600000;
        String formattedTime = sdf.format(milliseconds);
        System.out.println("Lap Time: " + formattedTime);
    }
    //Template Pattern
    public final void startRace(){
        showRaceInfo();
        startCar(this.car);
        startLine(this.track);
        accelerateCar(this.car);
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you want to pitstop to apply NOS? (Y/N)");
        String choice=sc.next();
        if(choice.equalsIgnoreCase("Y")){
            pitStop(car);
        }
        showRaceInfo();
        stopCar(this.car);
        lapTime();
    }
}
