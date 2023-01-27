package Member;

import java.util.Scanner;

public class MemberTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("회원 수를 입력해주세요 : ");
        int x = sc.nextInt();
        Member[] members = new Member[x];

        System.out.println("==============================");

        for (int i = 0; i < x; i++) {
            members[i] = new Member();
            System.out.print("회원 " + (i + 1) + " 의 이름을 입력해주세요 : ");
            String memberName = sc.next();
            System.out.print("회원 " + (i + 1) + " 의 ID를 입력해주세요 : ");
            String memberId = sc.next();
            System.out.print("회원 " + (i + 1) + " 의 PW를 입력해주세요 : ");
            String memberPw = sc.next();
            System.out.print("회원 " + (i + 1) + " 의 나이를 입력해주세요 : ");
            int memberAge = sc.nextInt();
            members[i].setMemberInfo(memberName, memberId, memberPw, memberAge);

            System.out.println("==============================");

        }
        for (int i = 0; i < x; i++) {
            System.out.print("회원 " + (i + 1) + " 의 정보:");
            members[i].printMemberInfo();

            System.out.println("==============================");
        }
    }
}


