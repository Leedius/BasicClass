package 문법설명.Car;

//자동차를 만들기 위한 설계도
//"class(설계도)->자료형"을 구성하는 요소
//1. 변수
//2. 메소드의 선언
//3. 생성자

//변수의 종류
//맴버변수 : 클래스 안에서 선언된 변수, 초기화는 필수는 아니지만
//기본적으로 숫자는 0으로 초기화 되어있고, 문자는 null으로 초기화되있다
//지역변수 : 메소드 안에서 선언된 변수, 초기화 필수!
//매개변수 : 메소드() 안에서 선언된 변수

public class Car {
    //차량명, 제조사, 가격 -> 변수
    String carName;     //맴버변수, 필드
    String brand;
    int price;

    //시동을 켜는 기능 : 접근제한자 리턴타입 메소드명
    public void powerOn(){
        System.out.println("시동을 켭니다.");
    }

    //차가 움직이는 기능
    public void moveCar(){
        System.out.println("차가 움직입니다.");
    }

    //차가 멈추는 기능
    public void stopCar(){
        System.out.println("차가 멈춥니다.");
    }
}