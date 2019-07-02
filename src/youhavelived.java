import java.util.Scanner;
public class youhavelived{
    public static void main(String[] args) {
        System.out.println("please enter the year of your birth");
        int birthyear;

        Scanner scnr=new Scanner (System.in);
        birthyear = scnr.nextInt();

        System.out.println("please enter the month of your birth");
        int birthmonth;
        birthmonth=scnr.nextInt();

        System.out.println("please enter the day of your birth");
        int birthday;
        birthday=scnr.nextInt();

        System.out.println("you have lived");
        System.out.print((2019-birthyear)*12+12-birthmonth+(30-birthday)/30);
        System.out.println("months");
        System.out.println("OR");
        System.out.print((2019-birthyear)*12*30+(12-birthmonth)*30+(30-birthday));
        System.out.println("days");
        System.out.println("OR");
        System.out.print((2019-birthyear)*12*30*24*60+(12-birthmonth)*30*24*60+(30-birthday)*24*60);
        System.out.println("minutes");

    }
}
