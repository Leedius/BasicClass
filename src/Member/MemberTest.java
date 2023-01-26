package Member;

import java.util.Scanner;

public class MemberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.print("회원수를 입력하여 주세요 : ");
        x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            Member m1 = new Member();

            System.out.print((i) + "번째 회원 이름을 입력하세요 : ");
            m1.setMemberName(sc.next());
            System.out.print((i) + "번째 회원 ID를 입력하세요 : ");
            m1.setMemberId(sc.next());
            System.out.print((i) + "번째 회원 PW를 입력하세요 : ");
            m1.setMemberPw(sc.next());
            System.out.print((i) + "번째 회원 나이를 입력하세요 : ");
            m1.setMemberAge(sc.nextInt());

            System.out.println("====================");

            m1.printMemberInfo();

            System.out.println("====================");

        }

    }
}
