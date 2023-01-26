package Person;

//사람은 이름, 나이, 주소 데이터를 가짐.
public class Person {
    String name;
    int age;
    String location;

    //매개변수로 들어온 값으로 이름을 변경하는 메소드
    public void setName(String name1){
        name=name1;
    }

    //매개변수로 들어온 값으로 나이를 변경하는 메소드
    public void setAge(int age1){
        age=age1;
    }

    //이름, 나이, 주소 정보를 모두 출력하는 메소드
    public void printPersonInfo(){
        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age);
        System.out.println("주소 : "+location);
    }


}
