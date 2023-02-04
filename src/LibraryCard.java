
import java.text.*;
import java.util.*;

public class LibraryCard {
    private static GregorianCalendar yes;
    private String Ownername;
    private int Age;
    public GregorianCalendar ExpirationDate;

    public LibraryCard(){
        Ownername = "Unassigned";
        Age = 0;
        //
        ExpirationDate = new GregorianCalendar();
    }//GregorianCalendar yes = new GregorianCalendar();

    public void setExirDate(GregorianCalendar
                                    date){

        ExpirationDate = new GregorianCalendar(5,8,9);

    }
    public GregorianCalendar getExpiredDate(){
        return ExpirationDate;
    }
      //return the Expiration Year
    public int getExpYear() {
        return ExpirationDate.get(Calendar.YEAR);
    }
     //return the Expiration Day
    public int getExpDay(){
        return ExpirationDate.get(Calendar.DAY_OF_MONTH);
    }
    //return the Expiration month
    public int getExpMonth(){
        return ExpirationDate.get(Calendar.MONTH);
    }


    public static void main(String[] args){
        LibraryCard  IdCard = new LibraryCard();
      IdCard.setExirDate(new GregorianCalendar(5,9,9));
        System.out.println(IdCard.getExpiredDate());
    }
}
