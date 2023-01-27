package 문법설명.Man;

//생성자 - 모든 멤버변수의 값을 초기화하는 작업
//생성자는 클래스에서 반드시 하나는 존재해야 함.
//개발자가 생성자를 구현하지 않으면,
//자동으로 기본생성자(default constructor)를 생성해 준다.
//기본생성자 : 생성자의 내용이 없고, 매개변수도 없는 생성자.

//좋은 class의 여건
//1.모든 멤버변수는 초기화 작업을 해준다.
//멤버변수는 기본적으로 자동 초기화되지만 따로 초기화 작업을 해주는게 좋다.
//2.멤버변수 선언과 동시에 초기화는 좋지 않다.

public class ManTest {
    public static void main(String[] args) {

        //클래스명 잠조변수명 = new 생성자호출;

        //Man() 이라는 생성자로 초기화된 값을 갖는
        //새로운 객체 m을 생성해주세요~
        Man m = new Man();          //오른쪽항에 있는 Man()이 생성자

        m.printManInfo();

        //이름 출력
//        System.out.println(m.manName);
//        System.out.println(m.getManName());




    }
}

