public class Faculty extends Employee{
    private String rank;private double officeHours;
    public Faculty(String name, String address, String phone, String email, String office, double salary, MyDate dateHired,double officeHours,String rank) {
        super(name, address, phone, email, office, salary, dateHired);
        this.officeHours=officeHours;
        this.rank=rank;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }
}
