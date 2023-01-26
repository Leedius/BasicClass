package Car1;

import java.io.ObjectOutputStream;

public class Car1 {
    String carMaker;
    String carName;
    String carNum;
    int carPrice;
    String ownerName;


    //제조사를 변경하는 메소드
    public void setCarMaker(String carMaker1) {
        carMaker = carMaker1;
    }

    //차량이름을 변경하는 메소드
    public void setCarName(String carName1) {
        carName = carName1;
    }

    //차량넘버를 변경하는 메소드
    public void setCarNum(String carNum1) {
        carNum = carNum1;
    }

    //차량가격을 변경하는 메소드
    public void setCarPrice(int carPrice1) {
        carPrice = carPrice1;
    }

    //소유주를 변경하는 메소드
    public void setOwnerName(String ownerName1) {
        ownerName = ownerName1;

    }

    //모든정보를 변경하는 메소드
    public void setCarInfo(String carMaker1,
                           String carName1,
                           String carNum1,
                           int carPrice1,
                           String ownerName1){
        carMaker = carMaker1;
        carName = carName1;
        carNum = carNum1;
        carPrice = carPrice1;
        ownerName = ownerName1;
    }

    public void printCarInfo(){
        System.out.println("제조사 : "+carMaker);
        System.out.println("차이름 : "+carName);
        System.out.println("차량번호 : "+carNum);
        System.out.println("가격 : "+carPrice);
        System.out.println("소유주 : "+ownerName);

    }
}
