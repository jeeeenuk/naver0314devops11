package ClassOverriding;

class MinusAccount extends BankAccount{
    protected long minusLimit;
    public MinusAccount(String number, String password, String name, long balance, long minusLimit) {
        super(number, password, name, balance);
        this.minusLimit = minusLimit;
    }

    @Override
    public void deposit(long balance) {
        super.deposit(balance);
    }

    @Override
    public void printAccount() {
        System.out.printf("(마이너스) 계좌번호: %s\n", number);
        System.out.printf("비밀번호: %s\n", password);
        System.out.printf("예금주: %s\n", name);
        System.out.printf("계좌 잔액: %s원\n", balance);
        System.out.printf("마이너스 한도: %d원\n", minusLimit);
    }

    @Override
    public void withdraw(long balance) {
        if (balance <= 0){
            System.out.println("-".repeat(25));
            System.out.println("0이하의 금액은 출금할 수 없습니다.");
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
