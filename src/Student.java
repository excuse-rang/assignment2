public class Student extends Member {
    private String grade;
    private String yearofadmission;

    public Student(String name, String sex,String birthyear, String grade, String yearofadmission)
    {
        super(name, sex, birthyear); // 부모 클래스의 생성자 호출
        this.grade = grade;
        this.yearofadmission = yearofadmission;
    }
    public String getGrade()
    {
        return grade;
    }
    public String getYearofadmission()
    {
        return yearofadmission;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", Grade: " + grade + ", Year of Admission: " + yearofadmission;
    }
}
