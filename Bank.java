public class Bank {
    private int account;
    protected final int MAX_ACCOUNT_VALUE = 2000;
    protected final int MIN_ACCOUNT_VALUE = 1;

    public int getAccount() {

        return account;
    }

    public void setAccount(int account) {
        if (account < 1)
            throw new IllegalArgumentException("Uncorrect account value!");
        this.account = account;
    }

    public Bank(int account) {
        if (account < 1)
            throw new IllegalArgumentException("Uncorrect account value!");
        this.account = account;
    }

    public  void inc(){
        System.out.println("Inc start: " + account);
        for(; account < MAX_ACCOUNT_VALUE; account += 2){
            System.out.println("inc: " + account);
        }
        System.out.println("Inc finish: " + account);
    }

    public  void dec(){
        System.out.println("Dec start: " + account);
        for(; account > MIN_ACCOUNT_VALUE; account--){
            System.out.println("dec: " + account);
        }
        System.out.println("Dec finish: " + account);
    }
}
