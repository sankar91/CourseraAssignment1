package demo2;

import demo1.Methods;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Test extends Methods {
    public static void main(String args[])
    {
        Test sam = new Test();
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd");
        String formattedDate = myDateObj.format(myFormatObj);
        //sam.day1(formattedDate);
        day1(formattedDate);
        DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("MMMM");
        String formattedmonth = myDateObj.format(myFormatObj2);
        //sam.month1(formattedmonth);
        month1(formattedmonth);
        DateTimeFormatter myFormatObj3 = DateTimeFormatter.ofPattern("YYYY");
        String formattedyear = myDateObj.format(myFormatObj3);
       // sam.year1(formattedyear);
        year1(formattedyear);
    }
}
