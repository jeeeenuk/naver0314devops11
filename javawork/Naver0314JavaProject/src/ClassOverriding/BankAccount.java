package ClassOverriding;

class BankAccount {
    protected String number;
    protected String password;
    protected String name;
    protected long balance;
    public BankAccount(String number, String password, String name, long balance) {
        this.number = number;
        this.password = password;
        this.name = name;
        this.balance = balance;
        System.out.printf("%s님의 계좌가 개설되었습니다.\n", name);
        System.out.println("-".repeat(25));
    }
    public void printAccount(){
        System.out.printf("(일반) 계좌번호: %s\n", number);
        System.out.printf("비밀번호: %s\n", password);
        System.out.printf("예금주: %s\n", name);
        System.out.printf("계좌 잔액: %s원\n", balance);
    }
    public void deposit(long balance){
        if (balance <= 0){
            System.out.println("0이하의 금액을 입금할 수 없습니다.");
        }
        else {
            this.balance += balance;
            System.out.println("-".repeat(25));
            System.out.printf("%s원이 입금되었습니다.\n", balance);
            System.out.println("-".repeat(25));
        }
    }
    public void withdraw(long balance){
        if (balance <= 0){
            System.out.println("-".repeat(25));
            System.out.println("0이하의 금액은 출금할 수 없습니다.");
            System.out.println("-".repeat(25));
        }
        else if (this.balance < balance){
            System.out.println("-".repeat(25));
            System.out.println("잔액이 부족합니다.");
            System.out.println("-".repeat(25));
        }
        else{
            this.balance -= balance;
            System.out.println("-".repeat(25));
            System.out.printf("%s원이 출금되었습니다.\n", balance);
            System.out.println("-".repeat(25));
        }
    }
}
