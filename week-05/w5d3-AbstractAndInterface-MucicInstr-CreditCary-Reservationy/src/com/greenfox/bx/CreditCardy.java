package com.greenfox.bx;

/**
 * Created by zoloe on 2016. 11. 16..
 */
public interface CreditCardy {
    void setSumCVV(int sumCVV);
    int getSumCVV();
    void setNameCardholder(String nameCardholder);
    String getNameCardholder();
    void setCodeAccount(String codeAccount);
    String getCodeAccount();

    int cumeSumCVV(String codeAccount); // computes codeAccount checksum (see below)
    boolean ValidCard (String codeAccount, int sumCVV); // compare sumCVV with checksum of codeAccount

    String toString (); //String.format("Name=%s CC#=%s CVV=%d");

}
