package Car1;

import Car.Car;

import java.util.Scanner;

public class Car1Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Car1 c1=new Car1();
        Car1 c2=new Car1();

        System.out.print("차의 제조사를 입력하세요 : ");
        c1.setCarMaker(sc.next());
        System.out.print("차의 이름을 입력하세요 : ");
        c1.setCarName(sc.next());
        System.out.print("차의 넘버를 입력하세요 : ");
        c1.setCarNum(sc.next());
        System.out.print("차의 가격을 입력하세요 : ");
        c1.setCarPrice(sc.nextInt());
        System.out.print("차의 주인을 입력하세요 : ");
        c1.setOwnerName(sc.next());

        System.out.println("==============================");

        System.out.print("차의 제조사를 입력하세요 : ");
        c2.setCarMaker(sc.next());
        System.out.print("차의 이름을 입력하세요 : ");
        c2.setCarName(sc.next());
        System.out.print("차의 넘버를 입력하세요 : ");
        c2.setCarNum(sc.next());
        System.out.print("차의 가격을 입력하세요 : ");
        c2.setCarPrice(sc.nextInt());
        System.out.print("차의 주인을 입력하세요 : ");
        c2.setOwnerName(sc.next());

        System.out.println("==============================");

        Car1 c3 = new Car1();
        c3.setCarInfo("현대","그랜져", "12다1234",3000, "이길동");

        c1.printCarInfo();

        System.out.println("==============================");

        c2.printCarInfo();

    }
}
