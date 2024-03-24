package Studying;

public class Account {
    private String accountNum;
    private String accountName;
    private int DepositAmount;

    public Account(String accountNum, String accountName, int DepositAmount){
        this.accountNum = accountNum;
        this.accountName = accountName;
        this.DepositAmount = DepositAmount;
    }

    public String getAccountNum(){
        return accountNum;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getDepositAmount() {
        return DepositAmount;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setDepositAmount(int DepositAmount) {
        this.DepositAmount = DepositAmount;
    }
}
