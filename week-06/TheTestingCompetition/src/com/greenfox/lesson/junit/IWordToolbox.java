package com.greenfox.lesson.junit;

/**
 * Created by zoloe on 2016. 11. 21..
 */
public interface IWordToolbox {
    public int countHowMany(char c);
    public void setS(String s);
    public String getS();
    public boolean isAnAnagram(String stringToCheck) throws Exception ;
    public void WaitingItOut();


}