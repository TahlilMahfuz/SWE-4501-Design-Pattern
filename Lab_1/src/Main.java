//Lab Exercise 1:
//        Implement a class named Person and two subclasses Student and Employee.
//        Employee has Faculty and Staff subclasses. A person has a name, address, phone
//        number and email address. A student has a status (freshman, sophomore, junior or
//        senior). An employee has an office, salary and date hired. Define a class named
//        MyDate that contains the fields year, month, and day. A faculty member has office
//        hours and a rank. A staff member has a title. Override the toString method in each
//        class to display the class name and person’s name. Make FullTime and PartTime
//        subclasses of staff. Full-time staff have a fixed salary whereas part time staff has
//        salary depending on worked hour. Implement this requirement that demonstrate the
//        earning of both staffs
public class Main {
    public static void main(String[] args) {
        Person person1=new Person("Tahlil","Dhaka","01*8*****8*","tahlilkfaiyaz@gmail.com");
        System.out.println(person1.toString());

        Student std1=new Student("Faruk","Barishal","01284102471","tah@gmail.com",StudentStatus.FRESHMAN);
        System.out.println(std1.toString());


        MyDate emp1date=new MyDate(2020,7,28);
        Faculty faculty1=new Faculty("Tawfiq","Dhaka","0014810491","tah@gmail.com","Dhaka",1000,emp1date,10,"Head");
        System.out.println(faculty1.toString());

        Employee employee1=new Employee("Mahfuz","Khulna","0121********","Kichu@gmail.com","Gulshan",10000,emp1date);
        System.out.println(employee1.toString());

        Staff staff1=new Staff("Mahf","Sirajganj","0121********","Kichuna@gmail.com","Gulshan",10000,emp1date,"Title1");
        System.out.println(staff1.toString());

        FullTime fullTime1=new FullTime("Mahf","Sirajganj","0121********","Kichuna@gmail.com","Gulshan",10000,emp1date,"Title1");
        System.out.println(fullTime1.toString());
        System.out.println(fullTime1.getSalary());

        System.out.println("PARTIME");
        PartTime partTime1=new PartTime("Mahfz","Sirajganj","0121********","Kichuna@gmail.com","Gulshan",10000,emp1date,"Title1",5);
        System.out.println(partTime1.toString());
        System.out.println(partTime1.getSalary());
    }
}