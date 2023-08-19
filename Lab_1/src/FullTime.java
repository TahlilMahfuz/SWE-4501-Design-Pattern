public class FullTime extends Staff{
    public FullTime(String name, String address, String phone, String email, String office,double salary, MyDate dateHired, String title) {
        super(name, address, phone, email, office, salary, dateHired, title);
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }
}
