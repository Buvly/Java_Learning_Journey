public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.setCustName("Buvly");
        acc1.setAccNumber(1);
        acc1.setAccBalance(1000);
        acc1.setCustEmail("bolla@gmail.com");
        acc1.setCustPhoneNum("+201551707087");

        System.out.println("Welcome: " + acc1.getCustName());
        System.out.println("Your account number is: " + acc1.getAccNumber());
        System.out.println("Your account balance is: " + acc1.getAccBalance());
        System.out.println("Your registered email is: " + acc1.getCustEmail());
        System.out.println("Your registered Phone Number is: " + acc1.getCustPhoneNum());

        acc1.withdrawFund(200);
        acc1.depositeFund(1000);
    }
}
