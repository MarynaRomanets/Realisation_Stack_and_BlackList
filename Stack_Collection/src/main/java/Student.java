public class Student extends Person {

    private int departmentNumber;
    private int groupNumber;
    private String groupName;
    private int studentCard;

    public Student(int departmentNumber, int groupNumber, String groupName, int studentCard) {
        this.departmentNumber = departmentNumber;
        this.groupNumber = groupNumber;
        this.groupName = groupName;
        this.studentCard = studentCard;
    }

    public Student(String lastName, String firstName, int age, boolean sex, int departmentNumber, int groupNumber,
                   String groupName, int studentCard) {
        super(lastName, firstName, age, sex);
        this.departmentNumber = departmentNumber;
        this.groupNumber = groupNumber;
        this.groupName = groupName;
        this.studentCard = studentCard;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getStudentCard() {
        return studentCard;
    }

    public void setStudentCard(int studentCard) {
        this.studentCard = studentCard;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                " departmentNumber=" + departmentNumber +
                ", groupNumber=" + groupNumber +
                ", groupName='" + groupName + '\'' +
                ", studentCard=" + studentCard +
                '}';
    }
}
