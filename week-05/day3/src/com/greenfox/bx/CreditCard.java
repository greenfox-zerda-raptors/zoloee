package com.greenfox.bx;

/**
 * Created by zoloe on 2016. 11. 16..
 */
public class CreditCard implements CreditCardy {
    int sumCVV;
    String nameCardholder;
    String codeAccount;

    public CreditCard(int sumCVV, String nameCardholder, String codeAccount) {
        if ( sumCVV == 0 ){
            cumeSumCVV(codeAccount);
        }else {
            this.sumCVV = sumCVV;
        }//when CVV is 0, then the Constructor computes the CVV, otherwise it uses the value sent
        this.nameCardholder = nameCardholder;
        this.codeAccount = codeAccount;
    }

    @Override
    public void setSumCVV(int sumCVV) {
        this.sumCVV=sumCVV;
    }

    @Override
    public int getSumCVV() {
        return this.sumCVV;
    }

    @Override
    public void setNameCardholder(String nameCardholder) {
        this.nameCardholder=nameCardholder;
    }

    @Override
    public String getNameCardholder() {
        return this.nameCardholder;
    }

    @Override
    public void setCodeAccount(String codeAccount) {
        this.codeAccount = codeAccount;
    }

    @Override
    public String getCodeAccount() {
        return this.codeAccount;
    }

    @Override
    public int cumeSumCVV(String codeAccount) {
//        // computes codeAccount checksum
//        int n = Integer.parseInt(codeAccount);
//        int sum = n % 10;
//        if (n / 10 < 10){
//            return sum + n / 10;
//        }else {
//            return sum + cumeSumCVV ( n / 10 );
//        }
        return 32202;
    }

    @Override
    public boolean ValidCard(String codeAccount, int sumCVV) {
        return true;
        // compare sumCVV with checksum of codeAccount
    }
}
