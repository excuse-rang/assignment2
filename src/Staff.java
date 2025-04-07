public class Staff extends Member{
    private String salary; // 
    private String yearofjoining; // 연차
    public Staff(String name, String sex, String birthyear, String salary, String yearofjoining ) {
        super(name, sex, birthyear); // 부모 클래스의 생성자 호출
        this.salary = salary;
        this.yearofjoining = yearofjoining;
    }

    public String getSalary() {
        return salary;
    }
    public String getYearofjoining() {
        return yearofjoining;
    }  

    @Override
    public String toString() {
        return super.toString() + ", Salary: " + salary + ", Year of Joining: " + yearofjoining;
    }
    
}
