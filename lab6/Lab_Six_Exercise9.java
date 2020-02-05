import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;

/**
 * Lab_Six_Exercise9
 */
public class Lab_Six_Exercise9 {

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    public static void main(String[] args) {
        String date;
        Lab_Six_Exercise9 mObject = new Lab_Six_Exercise9();
        System.out.println("Enter the - separated date month and year");
        try {
            date = mObject.br.readLine();
            String[] dateArray = date.split("-");
            int dateA = Integer.parseInt(dateArray[0]);
            int monthA = Integer.parseInt(dateArray[1]);
            int yearA = Integer.parseInt(dateArray[2]);
            mObject.dateDifference(dateA, monthA, yearA);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // TEST
        // mObject.dateDifference(26, 9, 2020);
        
    }

    public void dateDifference(int day,int month, int year) {

        LocalDate userDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();

        Period difference = Period.between(currentDate, userDate);

        System.out.println("The differnce is "+difference.getYears() + " years "+ difference.getMonths()+ " months "+ difference.getDays()+" days ");
        
    }
}