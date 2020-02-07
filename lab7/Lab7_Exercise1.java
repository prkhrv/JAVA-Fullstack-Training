import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/**
 * Lab7_Exercise1
 */
public class Lab7_Exercise1 {

    public static void main(String[] args) {
        Lab7_Exercise1 mObject = new Lab7_Exercise1();
        HashMap<String, String> mMap = new HashMap<String, String>();
        mMap.put("a", "z");
        mMap.put("b", "x");
        mMap.put("c", "y");


        System.out.println(mObject.acceptHash(mMap));

        
    }

    public ArrayList<String> acceptHash(HashMap<String, String> hm) {

        Collection<String> values = hm.values();
        ArrayList<String> list = new ArrayList<String>(values);

        Collections.sort(list);

        return list;


        
    }
}