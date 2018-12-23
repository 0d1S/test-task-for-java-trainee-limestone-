public class Subject {
    private String name;
    private boolean isMandatory;
    private Mark mark;

    public Subject() {
    }

    public Subject(String name, boolean isMandatory, Mark mark) {
        this.name = name;
        this.isMandatory = isMandatory;
        this.mark = mark;
    }


    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMandatory() {
        return isMandatory;
    }

    public void setMandatory(boolean mandatory) {
        isMandatory = mandatory;
    }
}
