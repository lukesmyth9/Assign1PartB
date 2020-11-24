
import com.mycompany.softwareengassignment1.*;
import com.mycompany.softwareengassignment1.Module;
//@author Luke Smyth
public class Tester {

    public static void main(String[] args) {
      //STUDENTS
      Student luke = new Student("Luke", 21, "2002-01-01", 173);
       Student chris = new Student("Chris", 22, "2002-01-01", 173);
       Student jake = new Student("Jake", 19, "2002-01-01", 173);
       Student salamon = new Student("Salamon", 27, "1996-02-17", 155);
       //Modules
       Module tele = new Module("Telecommunications", "EE445");
       Module circuits = new Module("Circuits", "EE440");
       Module mL = new Module("Machine Learning", "CT440");
       Module database = new Module("Database Systems", "CT441");
       Module sysonchip = new Module("System on Chip", "CT442");
       Module software = new Module("Software", "CT443");
       //Courses
       Course ece = new Course("Electronic and Computer Engineering", "2018-10-01", "2022-08-01");
       Course eee = new Course("Electronic and Electrical Engineering", "2018-10-01", "2022-08-01");
       Course cs = new Course("Computer Science", "2018-10-01", "2022-08-01");
       //adding students to modules
       luke.addModuleToStudent(mL);
       luke.addModuleToStudent(database);
       salamon.addModuleToStudent(sysonchip);
       salamon.addModuleToStudent(software);
       chris.addModuleToStudent(tele);
       chris.addModuleToStudent(circuits);
       jake.addModuleToStudent(circuits);
       //adding courses to students
       ece.addStudent(luke);
       eee.addStudent(chris);
       eee.addStudent(jake);
       cs.addStudent(salamon);
       
       //adding modules to courses
       ece.addModule(mL);
       ece.addModule(database);
       eee.addModule(tele);
       eee.addModule(circuits);
       cs.addModule(sysonchip);
       cs.addModule(software);
       //printing tests
       System.out.println("---------------------------------------------------------------------------------");
       ece.courseInformation(ece);
       
       System.out.println("---------------------------------------------------------------------------------");
       
       eee.courseInformation(eee);
       System.out.println("---------------------------------------------------------------------------------");
       
       cs.courseInformation(cs);
       System.out.println("---------------------------------------------------------------------------------");
    }
}
