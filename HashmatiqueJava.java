import java.util.HashMap;
import java.util.Set;

public class HashmatiqueJava{

    // how to call without printing twice
    public HashMap<String, String> examineList(){
        HashMap<String, String> trackList = new HashMap<String, String>();
            trackList.put("Texas", "The stars at night are big and bright");
            trackList.put("California", "The stars at night are expensive in California");
            trackList.put("Ohio", "The stars at night are lame in Ohio");
            trackList.put("Washington", "Too cloudy to see stars");
            Set<String> keys = trackList.keySet();
            System.out.println(trackList.get("Ohio"));
            for(String key : keys) {
                    System.out.println(key+" : ");
                    System.out.println(trackList.get(key)); 
            }
            return trackList;
            
    }
}