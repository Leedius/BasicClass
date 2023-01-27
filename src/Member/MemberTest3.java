package Member;

public class MemberTest3 {
    public static void main(String[] args) {
        Member m = new Member();

        //회원의 모든 정보를 세팅
        m.setMemberInfo("홍길동", "java", "1234", 20);
        m.printmemberName();

        m.setMemberName("이순신");
        m.printmemberName();

    }
}
