public class Person {
    private String name,address,phone,email;
    public Person(String name,String address,String phone,String email){
        this.address=address;
        this.email=email;
        this.name=name;
        this.phone=phone;
    }

    @Override
    public String toString() {
        return getClass().getName()+" "+name;
    }
}
