import java.util.HashMap;

/**
 * Practice1
 */
public class Practice1 {


    public static void main(String[] args) {
        Practice1 mObject = new Practice1();
        mObject.hashMap();
        
    }

    public void hashMap() {

        HashMap<String, String> map = new HashMap<>();
        map.put("Bank", "HDFC");
        map.put("01-01-2020","date");
        print(map);
        
    }

    private void print(HashMap<String, String> map) {

        if(map.isEmpty()){
            System.out.println("map is empty");
        }else{
            System.out.println(map);
        }
    }
}