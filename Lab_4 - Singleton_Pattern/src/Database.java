import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class Database {
    List<StudentInfo> studentInfos = new ArrayList<>();
    private static final Database databaseInstance=new Database();
    //Restrict the constructor
    private Database(){}
    //Create an instance
    public static Database getDatabaseInstance(){
        return databaseInstance;
    }
    public void addStudent(StudentInfo student){
        studentInfos.add(student);
    }
    public void showData(){
        for (StudentInfo studentInfo : studentInfos) {
            System.out.println(studentInfo.name+"\t"+studentInfo.ID+"\t"+studentInfo.department+"\t"+studentInfo.program);
        }
    }
}
