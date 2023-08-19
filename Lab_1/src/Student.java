public class Student extends Person{
    private final StudentStatus status;
    public Student(String name, String address, String phone, String email,StudentStatus status) {
        super(name, address, phone, email);
        this.status=status;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
