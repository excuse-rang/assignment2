public abstract class Member {
    private String name;
    private String birthyear;
    private String sex;

    public Member(String name, String sex, String birthyear) {
        this.name = name;
        this.sex = sex;
        this.birthyear = birthyear;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getBirthyear() {
        return birthyear;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Sex: " + sex + ", Birth Year: " + birthyear;
    }
}
