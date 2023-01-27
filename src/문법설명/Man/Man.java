package 문법설명.Man;

public class Man {
    String manName;
    String manAge;
    String manLocation;

    //생성자 constructor
    //리턴타입이 없음
    //반드시 클래스명과 동일해야 함!
    public Man(){
        manName = "지정되지 않음";
        manAge = "1";
        manLocation = "신원불명";


    }

    //!!중요 :매개변수를 알아보기 쉽게 만들어야
    //다른클래스에 매개변수를 입력할때 무엇을 입력 할지 알기 쉽다.

    //멤버 모두의 값을 초기화하는 메소드
    public void initMan(String manName,
                        String manAge,
                        String manLocation) {
        this.manName = manName;
        this.manAge = manAge;
        this.manLocation = manLocation;
    }


    //이름을 변경하는 메소드
    public void setManName(String manName) {
        //manName = manName;        //이상태에는 둘다 윗줄의 매개변수 manName을 가르킨다.
        this.manName = manName;     //왼쪽항을 멤버변수로 하기위해서는 왼쪽에 this.를 붙인다.
    }

    //이름 값 리턴하는 메소드
    //리턴할때 메소드명은 get(getter)을 붙인다.!!중요
    public String getManName() {
        return manName;             //return뒤에 있는 변수는 무조건 멤버변수를 사용한다.
    }

    //나이를 변경하는 메소드
    public void setManAge(String manAge){
        this.manAge = manAge;
    }

    //나이 값을 리턴하는 메소드
    public String getManAge(){
        return manAge;
    }

    //주소를 변경하는 메소드
    public void setManLocation(String manLocation){
        this.manLocation = manLocation;
    }

    //주소 값을 리턴하는 메소드
    public String getManLocation(){
        return manLocation;
    }

    //멤버의 모든 정보를 출력하는 메소드
    public void printManInfo(){
        System.out.println("이름 : "+manName);
        System.out.println("나이 : "+manAge);
        System.out.println("주소 : "+manLocation);
        //System.out.println("주소 : "+getManLocation());           //59번줄 내용과 똑같다.
    }

}

