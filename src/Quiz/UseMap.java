package Quiz;

import java.util.LinkedHashMap;

public class UseMap {
    import java.util.LinkedHashMap;
import java.util.Map;

    public static class UseMap {
        public static void main(String[] args) {
            Map<String, String> map = new LinkedHashMap<String, String>();
            map.put("USA", "NY");
            map.put("Canada", "Toronto");
            map.put("Bangladesh", "Dhaka");
            map.put("Japan", "Tokyo");
            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " :" + entry.getValue());
            }

        }

    }

}
