/**
 * Created by User on 09.02.2016.
 */
public class MyFirstClass {
    public static void main(String args[]) {
        String message = "Hello World!";
        int birthYear = 1985;
        int age = 2016 - birthYear;

        message = "Hello " + "world! I'm " + age;
        System.out.println(message);

        long years = 2016L;
        long days = 365;
        long hours = 24;
        long seconds = 3600;
        long milliseconds = 1000;

        long millisecondsFromBC = (long) 2016 * 365 * 3600 * 1000 * 24;
        // long millisecondsFromBC = 2016L * 365 * 3600 * 1000 * 24;

        int intYears = (int) years;

        System.out.println(millisecondsFromBC);
    }
}
