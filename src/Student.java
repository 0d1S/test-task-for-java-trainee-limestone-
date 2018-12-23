import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private List<Subject> subjects;

    public Student() {
    }

    public Student(String firstName, String lastName, List<Subject> subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        String subjectResults = "";
        for (Subject subject: subjects){
            if (subject.getMark()!=null)
                subjectResults = subjectResults + subject.getName() + "-" + subject.getMark().getRank() + " ";
        }
        return firstName + " " + lastName + " " + subjectResults;
    }
}
