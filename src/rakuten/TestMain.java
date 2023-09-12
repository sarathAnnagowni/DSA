package rakuten;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestMain {

    public static final String ENGLISH = "English";

    public static void main(String[] args) {
        Course kannada = new Course(1,"Kannada");
        Course english = new Course(2, ENGLISH);
        Course hindi = new Course(3,"Hindi");
        Course maths = new Course(4,"Maths");
        Course science = new Course(5,"Science");
        Course social = new Course(6,"Social");
        List<Course> allCourses = Arrays.asList(kannada, english, hindi,
                maths, science, social);

        List<Course> languageCourses = Arrays.asList(kannada, english, hindi);

        List<Course> subjectCourses = Arrays.asList(maths, science, social);

        Student st1 = new Student("St1", allCourses);
        Student st2 = new Student("St2", languageCourses);
        Student st3 = new Student("St3", subjectCourses);

         List<Student> students = Arrays.asList(st1, st2, st3);
        List<Student> englishCourseStudents = students.stream().filter(student -> {
            return student.getCourses().stream().anyMatch(course -> course.getName().equalsIgnoreCase(ENGLISH));
        }).collect(Collectors.toList());
        englishCourseStudents.stream().forEach(System.out::println);


        //I need all the students whose course is English
       //TestNG,Mockito
    }
}

