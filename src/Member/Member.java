package Member;

public class Member {
    String MemberName;
    String MemberId;
    String MemberPw;
    int MemberAge;

    //회원이름을 변경하는 메소드
    public void setMemberName(String memberName1){
        MemberName=memberName1;
    }

    //회원ID를 변경하는 메소드
    public void setMemberId(String memberId1){
        MemberId=memberId1;
    }

    //회원PW를 변경하는 메소드
    public void setMemberPw(String memberPw1){
        MemberPw=memberPw1;
    }

    //회원나이를 변경하는 메소드
    public void setMemberAge(int memberAge1){
        MemberAge=memberAge1;
    }

    //회원정보를 변경하는 메소드
    public void setMemberInfo(String memberName1,
                              String memberId1,
                              String memberPw1,
                              int memberAge1 ){
        MemberName=memberName1;
        MemberId=memberId1;
        MemberPw=memberPw1;
        MemberAge=memberAge1;
    }

    //회원이름을 출력하는 메소드
    public void printmemberName(){
        System.out.println("회원이름은 : "+MemberName);
    }

    public void printMemberInfo(){
        System.out.println("회원이름 : "+MemberName);
        System.out.println("회원ID : "+MemberId);
        System.out.println("회원PW : "+MemberPw);
        System.out.println("회원나이 : "+MemberAge);
    }

}
