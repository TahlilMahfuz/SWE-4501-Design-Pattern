public class PartTime extends Staff{
    private final double workedHours;
    public PartTime(String name, String address, String phone, String email, String office,double salary, MyDate dateHired, String title,double workedHours) {
        super(name, address, phone, email, office, salary, dateHired, title);
        this.workedHours=workedHours;
    }

    @Override
    public double getSalary() {
        System.out.println(super.getSalary()+" "+this.workedHours);
        return (super.getSalary()/840)*this.workedHours;
    }
}
