public class Bank {
    private int balance;
    private String bankName;
    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return balance;
    }
    public void setBankName(String bankName){
        this.bankName = bankName;
    }
    public String getBankName(){
        return bankName;
    }
}
class Main{
    public static void main(String[] args) {
        Bank s = new Bank();
        s.setBalance(1000);
        System.out.println(s.getBalance());
        s.setBankName("SBI");
        System.out.println(s.getBankName());
    }
}
