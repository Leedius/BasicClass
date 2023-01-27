package 문법설명.Person;

public class PersonTest {
    public static void main(String[] args) {

        //Person 클래스에 대한 객체 p1 생성
        Person p1 = new Person();

        //p1의 이름, 나이 값을 변경하는 코드
        p1.name="홍길동";
        p1.age=20;

        //p1 객체의 모든 정보 출력
        System.out.println("이름은 : "+p1.name);
        System.out.println("나이는 : "+p1.age);
        System.out.println("주소는 : "+p1.location);

        System.out.println("=============================");

        //Person 클래스에 대한 객체 p2 생성
        Person p2 = new Person();

        //p2 객체의 이름, 나이를 변경
        p2.setName("김길동");
        p2.setAge(20);

        //p2 객체의 모든 정보 출력
        //Person class에 printPersonInfo()메소드에 출력문을 기능을 저장해놨기 때문에 p2에대한 정보가나온다.
        p2.printPersonInfo();

    }
}
