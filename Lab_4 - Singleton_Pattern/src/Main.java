public class Main {
    public static void main(String[] args) {
        StudentInfo studentInfo=new StudentInfo("Tahlil", "200042158","CSE","SWE");
        StudentInfo studentInfo1=new StudentInfo("Mahfuz", "200042159","CEE","CEE");

        Database studentDB=Database.getDatabaseInstance();
        studentDB.addStudent(studentInfo);
//        studentDB.showData();

        Database studentDB1=Database.getDatabaseInstance();
        studentDB1.addStudent(studentInfo1);
        studentDB1.showData();
    }
}