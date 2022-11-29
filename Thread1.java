public class Thread1 extends Thread{
    private Bank bank;

    public Thread1(Bank b){
        bank = b;
    }

    @Override
    public synchronized void run(){
        for (int i = bank.MIN_ACCOUNT_VALUE; i <= bank.MAX_ACCOUNT_VALUE; i++){
            bank.setAccount(bank.getAccount() + 2);
        }
        System.out.println("Increment thread: " + bank.getAccount());
    }
}
