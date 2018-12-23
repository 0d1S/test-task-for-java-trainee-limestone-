// tast shouldn’t take more than 30 minutes
// There are 3 classes: Student, Subject and Mark
// - Fill the data according to the following conditions (use lists)
// 1. It is known that there are such students in the group: Valery Popov, Semyon Korzhev, Peter Ivanov, Maria Semenova and Kolya Nesterenko
// 2. Mathematics, Physics, Astronomy, History and Ethics are learned by this group and all subjects are mandatory excluding Ethics. It is optional.
// 3. Fill the data about marks if it is known that students have mark 3 for mandatory subjects and Maria has mark 5 for History and Ethics.
// 4. Please print results in a such way:
//   Popova Valeria Mathematics-1 Physics-2 Astronomy-0 History-1 Ethics-3 (do not display the subject info if there is no data about it)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(5);

        studentList.add(new Student("Valery","Popov",null));
        studentList.add(new Student("Semyon","Korzhev",null));
        studentList.add(new Student("Peter","Ivanov",null));
        studentList.add(new Student("Maria","Semenova",null));
        studentList.add(new Student("Kolya","Nesterenko",null));

        for (Student student : studentList) {
            List<Subject> subjects = new ArrayList<>(5);
            subjects.add(new Subject("Mathematics",true, new Mark(3)));
            subjects.add(new Subject("Physics",true, new Mark(3)));
            subjects.add(new Subject("Astronomy",true, new Mark(3)));
            subjects.add(new Subject("History",true, new Mark(3)));
            subjects.add(new Subject("Ethics",false, null));
            student.setSubjects(subjects);
        }

        studentList.get(3).getSubjects().get(3).setMark(new Mark(5));
        studentList.get(3).getSubjects().get(4).setMark(new Mark(5));

        for (Student student : studentList)
            System.out.println(student);
    }
}
