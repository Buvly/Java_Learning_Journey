public class BankAccount {
    private int accNumber;
    private double accBalance;
    private String custName = "Unknown";
    private String custEmail = "Unknown@unknown.com";
    private String custPhoneNum = "Unknown";

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public void setCustPhoneNum(String custPhoneNum) {
        this.custPhoneNum = custPhoneNum;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public String getCustName() {
        return custName;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public String getCustPhoneNum() {
        return custPhoneNum;
    }

    public void depositeFund(int deposite) {
        this.accBalance += deposite;
        System.out.println("You have deposited " + deposite + " Remaining Balance: " + accBalance);
    }
    public void withdrawFund(double withdrawal) {
        if (withdrawal > accBalance) {
            System.out.println("Insufficient Funds");
        } else {
            this.accBalance -= withdrawal;
            System.out.println("You have withdraw " + withdrawal + " Remaining Balance: " + accBalance);
        }
    }
}
