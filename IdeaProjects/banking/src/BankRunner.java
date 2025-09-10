import com.xworks.bankaccount.bankAccount.BankAccount;
import com.xworks.bankaccount.current.CurrentAccount;
import com.xworks.bankaccount.savings.SavingsAccount;

import java.net.SocketOption;

public class BankRunner {

    public static void main(String[] args) {
        BankAccount  LekhanaAccount=new BankAccount();

        LekhanaAccount.credit(9923232.8);
        LekhanaAccount.getBalance();


        //transfer: parameter is of bankacc type,arg can be bankacc or any of its child type

        CurrentAccount FirmAcc=new CurrentAccount();
        LekhanaAccount.transfer(FirmAcc, 970);

        BankAccount FriendsAcc=new BankAccount();
        LekhanaAccount.transfer(FriendsAcc,15588.98);

        SavingsAccount savingsAcc=new SavingsAccount();
        LekhanaAccount.transfer(savingsAcc,890);

        SavingsAccount momsAcc=new SavingsAccount();
        LekhanaAccount.transfer(momsAcc,1000);

        BankAccount brothersAcc=new BankAccount();
        LekhanaAccount.transfer(brothersAcc,25000);

        CurrentAccount sistersAcc=new CurrentAccount();
        LekhanaAccount.transfer(sistersAcc,900);

        SavingsAccount savingsAccount=new SavingsAccount();
        savingsAccount.credit(900);



        //




        BankAccount leksCurrentAcc=new CurrentAccount();
        leksCurrentAcc.credit(80000);
        leksCurrentAcc.transfer(leksCurrentAcc,9);

        BankAccount lekhsSavingsAcc=new SavingsAccount();
        lekhsSavingsAcc.transfer(lekhsSavingsAcc,80);

        BankAccount IMLcurrentAcc=new CurrentAccount();
        IMLcurrentAcc.transfer(IMLcurrentAcc,20);

        BankAccount IMLsavingsAcc=new SavingsAccount();
        IMLsavingsAcc.transfer(IMLsavingsAcc,30);

        BankAccount imCurrentAcc=new CurrentAccount();
        imCurrentAcc.transfer(imCurrentAcc,80);

        BankAccount IMLCurrentAcc=new CurrentAccount();
        LekhanaAccount.transfer(IMLCurrentAcc,3000);

        BankAccount lekhanaCurrentAcc=new CurrentAccount();
        LekhanaAccount.transfer(lekhanaCurrentAcc,100);

        BankAccount IMLSavingsAcc= new SavingsAccount();
        LekhanaAccount.transfer(IMLSavingsAcc,400);

        BankAccount imsavingsAcc=new SavingsAccount();
        LekhanaAccount.transfer(imsavingsAcc,700);



        System.out.println("main started");

        System.out.println("available bal in leks acc is:"+LekhanaAccount.getBalance());
        System.out.println("available bal in friends acc is:"+FriendsAcc.getBalance());
        System.out.println("available bal in firm acc is:"+FirmAcc.getBalance());
        System.out.println("available bal in momsacc is:"+momsAcc.getBalance());
        System.out.println("available bal in savingsacc is:"+savingsAcc.getBalance());
        System.out.println("available bal in brothers acc is:"+brothersAcc.getBalance());
        System.out.println("available bal in sistersacc is:"+sistersAcc.getBalance());
        System.out.println("available bal in leksCurrentAcc is:"+leksCurrentAcc.getBalance());
        System.out.println("available bal in lekhsSavingsAcc is:"+lekhsSavingsAcc.getBalance());
        System.out.println("available bal in IMLcurrentAcc is:"+IMLcurrentAcc.getBalance());
        System.out.println("available bal in IMLsavingsAcc is:"+IMLsavingsAcc.getBalance());
        System.out.println("available bal in imCurrentAcc is:"+imCurrentAcc.getBalance());
        System.out.println("available bal in IMLCurrentAcc is:"+IMLCurrentAcc.getBalance());
        System.out.println("available bal in lekhanaCurrentAcc is:"+lekhanaCurrentAcc.getBalance());
        System.out.println("available bal in IMLSavingsAcc is:"+IMLSavingsAcc.getBalance());
        System.out.println("available bal in imsavingsAcc is:"+imsavingsAcc.getBalance());



        System.out.println("main ended");


    }
}

