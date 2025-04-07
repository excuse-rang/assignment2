import java.util.ArrayList;
import java.util.List;

public class School implements MemberManagerInterface {
    private List<Member> members = new ArrayList<>();// List to store members (students and staff)


    @Override
    public void addMember(Member member) {
        members.add(member);
        System.out.println("Added: " + member.getName());
    }

    @Override
    public void removeMember(String name) {
        members.removeIf(member -> member.getName().equals(name));
        System.out.println("Removed member with Name: " + name);
    }

    @Override
    public void listStudents() {
        for (Member member : members) {
            if (member instanceof Student) {
                System.out.println(member);
            }
        }
    }

    @Override
    public void listStaff() {
        for (Member member : members) {
            if (member instanceof Staff) {
                System.out.println(member);
            }
        }
    }
}
