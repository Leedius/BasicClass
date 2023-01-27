package 문법설명.Account;

public class Account {
    //변수
    String owner;                   //계좌주
    String accountNumber;           //계좌번호
    int balance;                    //예금액

    //생성자
    //생성자는 매개변수의 정보가 다르면 여러개 생성 가능!
    //매개변수의 정보 : 매개변수의 개수, 자료형
    public Account(){
        owner = "";
        accountNumber = "";
        balance = 1000;
    }

    public Account(int balance){
        owner = "";
        accountNumber = "";
        this.balance = balance;

    }


    //메소드들...
    //계좌정보변경 메소드
    public void setAccountInfo(String owner,
                               String accountNumber){
        this.owner = owner;
        this.accountNumber = accountNumber;
    }

    //계좌정보조회 메소드
    public void showAccountInfo(){
        System.out.println("계좌주 : "+owner);
        System.out.println("계좌번호 : "+accountNumber);
        System.out.println("예금액 : "+balance);

    }

    //예금입금 매개변수로 들어온 값을 입출금.
    public void depositBalance(int money){
        this.balance+=money;
    }
    //예금출금
    public void withdrawBalance(int money){
        this.balance-=money;
    }
}