package pk.edu.nust.seecs.gradebook;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;
import java.util.Date;
import java.util.Scanner;

import pk.edu.nust.seecs.gradebook.dao.CloDao;
import pk.edu.nust.seecs.gradebook.dao.ContentDao;
import pk.edu.nust.seecs.gradebook.dao.CourseDao;
import pk.edu.nust.seecs.gradebook.dao.GradeDao;
import pk.edu.nust.seecs.gradebook.dao.StudentDao;
import pk.edu.nust.seecs.gradebook.dao.TeacherDao;
import pk.edu.nust.seecs.gradebook.entity.Clo;
import pk.edu.nust.seecs.gradebook.entity.Content;
import pk.edu.nust.seecs.gradebook.entity.Course;
import pk.edu.nust.seecs.gradebook.entity.Grade;
import pk.edu.nust.seecs.gradebook.entity.Student;
import pk.edu.nust.seecs.gradebook.entity.Teacher;

/**
 * My main App. 
 * <p>
 This executes everything.
 */

public class App {

    public static void main(String[] args) {
        CloDao clodao = new CloDao();

        // Add new clo
        Clo clo = new Clo();
        clo.setName("CLO 1");
        clo.setDescription("Design efficient solutions for algorithmic problems");
        clo.setPlo("2");
        clodao.addClo(clo);

        clodao.updateClo(clo);

        // Delete an existing clo
        //dao.deleteClo(1);

        // Get all clos
        for (Clo iter : clodao.getAllClos()) {
            System.out.println(iter);
        }

        // Get clo by id
        System.out.println(clodao.getCloById(1));
        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        System.out.println("+---------------------------------------------------+");
        System.out.println("|                                                   |");
        System.out.println("|  Welcome to GradeBook Management System  |");
        System.out.println("|                                                   |");
        System.out.println("+---------------------------------------------------+");
        while(choice != 0){
        System.out.println("\n******************* MENU ************************");
        System.out.println("Enter 0 to Exit");
        System.out.println("Enter 1 to add data");
        System.out.println("Enter 2 to update data");
        System.out.println("Enter 3 to store data");
        System.out.println("Enter 4 to print data");
        
        choice = scanner.nextInt();
        if(choice == 1){
        }
        else if(choice == 2){
        }
        else if(choice == 3){
        }
        else if(choice == 4){
        }
        else if(choice == 5){
        }
        CourseDao Dao = new CourseDao();
        
        Course CD = new Course();
        CD.setClasstitle("AP");
        CD.setStartsOn(new Date(22, 12, 2016));
        CD.setCreditHours(3);
        CD.setEndsOn(new Date(22, 12, 2017));
        
        Course CD1 = new Course();
        CD1.setClasstitle("AI");
        CD.setStartsOn(new Date(22, 12, 2016));
        CD.setCreditHours(3);
        CD.setEndsOn(new Date(22, 12, 2017));
        
        Dao.addCourse(CD);
        Dao.addCourse(CD1);
        
        StudentDao sd = new StudentDao();
        
        Student s = new Student();
        Set<Course> Courses = new HashSet<>(2);
        Courses.add(CD);
        Courses.add(CD1);
        s.setName("Yasir");
        s.setCourses(Courses);
        
        Student s1 = new Student();
        Set<Course> Courses1 = new HashSet<>(2);
        Courses1.add(CD);
        Courses1.add(CD1);
        s.setName("Fahad");
        s.setCourses(Courses1);
        
        sd.addStudent(s1);
        sd.addStudent(s);
        
        TeacherDao t1 = new TeacherDao();
        Teacher t = new Teacher();
        t.setName("Satti");
        t.setCourses(Courses1);
        t1.addTeacher(t);
        
        Clo clo1 = new Clo();
        CloDao c = new CloDao();
        clo1.setName("Don't know");
        clo1.setPlo("psl");
        clo1.setDescription("Don't know either");
        clo1.setBtLevel("2");
        c.addClo(clo1);
        
        ContentDao cd = new ContentDao();
        Content ct = new Content();
        
        ct.setCourse(CD1);
        ct.setDescription("Don't know");
        ct.setEndtime(new Date(0));
        ct.setStarttime(new Date(0));
        ct.setTitle("Don't know Don't know");
        Set<Student> Student1 = new HashSet<>(2);
        Student1.add(s);
        Student1.add(s1);
        ct.setStudents(Student1);

        cd.addContent(ct);
        
        
        GradeDao g1 = new GradeDao();
        Grade g = new Grade();
        g.setContentItem(ct);
        g.setName("A");
        g.setScore(75);
        
        
    }

}

        
}

}