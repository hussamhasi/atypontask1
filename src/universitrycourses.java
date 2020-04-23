import java.util.ArrayList;
import java.util.List;

public class universitrycourses {
    List<String> students=new ArrayList();
     String instuctorname;
     String coursename;

     universitrycourses(String instructorname,String coursename){
         this.instuctorname=instructorname;
         this.coursename=coursename;
     }
     void registration(String studentname){
         students.add(studentname);
     }
    void drop(String studentName){
         students.remove(studentName);
    }

}
