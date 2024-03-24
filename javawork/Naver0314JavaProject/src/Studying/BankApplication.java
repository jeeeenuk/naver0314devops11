package Studying;

import java.util.Scanner;

public class BankApplication {
    private static final Account[] accountArray = new Account[100]; // 길이 100 account 배열 생성.
    //Account 배열에서 accountNum 과 동일한 Account 객체 찾기 ..
    private static Account findAccount(String accountNum){
        Account account = null;
        for (int i = 0; i < accountArray.length; i++) {                     // 0 부터 accountArray 의 길이만큼 반복
            if (accountArray[i] != null){                                   // 만약 accountArray 의 i 번째가 null 값이 아닌 경우
                if (accountArray[i].getAccountNum().equals(accountNum)){    // 만약 accountArray i 번째에서 가지고 온 값이 accountNum 의 값과 같을 경우
                    account = accountArray[i];                              // account 에 accountArray 의 i 를 할당
                    break;
                }
            }
        }
        return account;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Exit:
        while(true){
            System.out.println("-".repeat(43));
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("-".repeat(43));
            System.out.print("선택> ");
            int selectNum = Integer.parseInt(sc.nextLine());

            switch(selectNum){
                case 1:{
                    System.out.println("-".repeat(6));
                    System.out.println("계좌생성");
                    System.out.println("-".repeat(6));
                    
                    System.out.print("계좌번호: ");
                    String accountNum = sc.nextLine();

                    System.out.print("계좌주: ");
                    String accountName = sc.nextLine();

                    System.out.print("초기입금액: ");
                    int depositAmount = Integer.parseInt(sc.nextLine());
                    
                    Account account = new Account(accountNum, accountName, depositAmount);

                    for (int i = 0; i < accountArray.length; i++) {
                        if (accountArray[i] == null){
                            accountArray[i] = account;
                            System.out.println("결과: 계좌가 생성되었습니다.");
                            break;
                        }
                    }
                    break;
                }
                case 2:{
                    System.out.println("-".repeat(6));
                    System.out.println("계좌목록");
                    System.out.println("-".repeat(6));

                    for (int i = 0; i < accountArray.length; i++) {
                        if(accountArray[i] == null) break;
                        System.out.printf("%s\t%s\t%s\t\n",
                                accountArray[i].getAccountNum(),
                                accountArray[i].getAccountName(),
                                accountArray[i].getDepositAmount());
                    }
                    break;
                }
                case 3:{
                    System.out.println("-".repeat(6));
                    System.out.println("예금");
                    System.out.println("-".repeat(6));

                    System.out.print("계좌번호: ");
                    String accountNum = sc.nextLine();

                    System.out.print("예금액: ");
                    int DepositAmount = Integer.parseInt(sc.nextLine());

                    Account account = findAccount(accountNum);

                    if (account == null){
                        System.out.println("존재하지 않는 계좌번호 입니다.");
                        break;
                    }

                    account.setDepositAmount(account.getDepositAmount() + DepositAmount);
                    System.out.println("결과: 예금이 성공되었습니다.");
                    break;
                }
                case 4:{
                    System.out.println("-".repeat(6));
                    System.out.println("출금");
                    System.out.println("-".repeat(6));

                    System.out.print("계좌번호: ");
                    String accountNum = sc.nextLine();

                    System.out.print("출금액: ");
                    int depositAmount = Integer.parseInt(sc.nextLine());

                    Account account = findAccount(accountNum);

                    if (account == null){
                        System.out.println("존재하지 않는 계좌번호 입니다.");
                        break;
                    }

                    if (account.getDepositAmount() < depositAmount){
                        System.out.println("예금액보다 많은 금액을 출금할 수 없습니다.");
                        break;
                    }

                    account.setDepositAmount(account.getDepositAmount() - depositAmount);
                    System.out.println("결과: 출금이 성공되었습니다.");
                    break;
                }
                case 5:{
                    System.out.println("프로그램 종료");
                    break Exit;
                }
            }
        }
    }
}
