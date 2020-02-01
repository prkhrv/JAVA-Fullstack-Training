package capgemini;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * TrafficLight
 */
public class TrafficLight {

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    public static void main(String[] args) {
        // TrafficLight mObject = new TrafficLight();
    }

    public TrafficLight() {
        int choice=0;
        System.out.println("Select Light\n 1: Red\n 2: Yellow\n 3: Green");
        try {
            choice = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(choice == 1){
            System.out.println("Stop");
        }else if(choice == 2){
            System.out.println("Wait");
        }else if(choice == 3){
            System.out.println("Go");
        }
        
    }
}