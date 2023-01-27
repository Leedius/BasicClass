package 문법설명.Account;

public class AccountTest1 {
    public static void main(String[] args) {
        Account acc = new Account();
        Account acc1 = new Account(10000);
        acc.showAccountInfo();

        acc.setAccountInfo("홍길동", "111-222");
        acc.depositBalance(10000);
        acc.withdrawBalance(6000);

        acc.showAccountInfo();
    }
}

