package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public final class BirthdayWithJavaUtilDate implements BirthdayCalculator<Date> {

    @Override
    public Date parseDate(String str){
        // TODO - return with the parsed date; format is: yyyy-MM-dd
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = df.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    @Override
    public String printMonthAndDay(Date date) {
        // TODO - return the date formatted: month & day (MM. dd.)
        DateFormat df = new SimpleDateFormat("MM. dd.");
        return df.format(date);
    }

    @Override
    public boolean isAnniversaryToday(Date date) {
        // TODO - return with true if today is the same month+day as date
        int dayOfToday, monthOfToday, dayOfDate, monthOfDate;
        Date today = new Date();
        Calendar todayCal= Calendar.getInstance();
        Calendar dateCal= Calendar.getInstance();
        todayCal.setTime(today);
        dateCal.setTime(date);

        dayOfToday = todayCal.get(Calendar.DAY_OF_MONTH);
        monthOfToday = todayCal.get(Calendar.MONTH);

        dayOfDate = dateCal.get(Calendar.DAY_OF_MONTH);
        monthOfDate = dateCal.get(Calendar.MONTH);

        if ( dayOfDate == dayOfToday && monthOfDate == monthOfToday ){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int calculateAgeInYears(Date birthday) {
        double birthdayLong, todayLong;
        Date today = new Date();
        Calendar myCalendar = Calendar.getInstance();
//        Calendar dateCal = Calendar.getInstance();
        myCalendar.setTime(today);
        todayLong = myCalendar.getTimeInMillis();
        myCalendar.setTime(birthday);
        birthdayLong = myCalendar.getTimeInMillis();

        return (int) ((todayLong-birthdayLong) / 3.154e+10);

        // TODO - return how many years age the input date 'birthday' was

    }

    @Override
    public int calculateDaysToNextAnniversary(Date date) {
        double dateLong, todayLong;
        Date today = new Date();
        Calendar todayCal = Calendar.getInstance();
        Calendar dateCal = Calendar.getInstance();
        todayCal.setTime(today);
        todayLong = todayCal.getTimeInMillis();
        dateCal.setTime(date);
        dateLong = dateCal.getTimeInMillis();

        if ( (dateLong - todayLong) < 8.64e+7 ) { //ha a date ma elotti
            if ((dateLong - todayLong) > 0) {
                return 0;//ha a date pont mai
            } else {
                dateCal.set(Calendar.YEAR, todayCal.get(Calendar.YEAR)); //az evekkel ne foglalkozzon
                if (!(dateCal.after(todayCal))) {    // ha a date.monthday < today.monthday -  adjon hozza +1 evet
                    dateCal.set(Calendar.YEAR, todayCal.get(Calendar.YEAR) + 1);
                }
                    dateLong = dateCal.getTimeInMillis();
                }
            }
        return (int) ((dateLong - todayLong) / 8.64e+7 );
    }// calculateDaysToNext...

    public static void main(String[] args) {
        new BirthdayWithJavaUtilDate().run();
    }

    private void run() {

        print("Birthday with java.util.Date.");
        String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

        Date birthdayDate = null;

            birthdayDate = parseDate(birthdayStr);

        print("Your birthday: " + printMonthAndDay(birthdayDate));

        if (isAnniversaryToday(birthdayDate)) {
            int ageInYears = calculateAgeInYears(birthdayDate);
            print("Congratulations! Today is your " + ageInYears + "th birthday!");
        } else {
            int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
            print("You have to wait only " + daysLeft + " days for your next birthday.");
        }
    }

    private void print(String line) {
        System.out.println(line);
    }

    private String readInput(String message) {
        System.out.print(message + ": ");
        return input.nextLine();
    }

    private final Scanner input = new Scanner(System.in, "UTF-8");

}
