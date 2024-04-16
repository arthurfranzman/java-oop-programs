import java.util.LinkedHashMap;
import java.util.Map;

public class Leet {
    // Schritt 1: Implementierung von toLeet(...)
    public static String toLeet(String normal) {
        // Wir verwenden LinkedHashMap, um die Reihenfolge der Einsätze zu bewahren
        Map<String, String> conversions = new LinkedHashMap<>();
        conversions.put("elite", "1337");
        conversions.put("cool", "k3wl");
        conversions.put("!", "!!!11");
        conversions.put("ck", "xx");
        conversions.put("ers", "0rz");
        conversions.put("er", "0rz");
        conversions.put("en", "n");
        conversions.put("e", "3");
        conversions.put("t", "7");
        conversions.put("o", "0");
        conversions.put("a", "@");
        String leet = normal;
        for (Map.Entry<String, String> entry : conversions.entrySet()) {
            leet = leet.replace(entry.getKey(), entry.getValue());
        }
        return leet;
    }
    // Schritt 2: Implementierung von allToLeet(...)
    public static String[] allToLeet(String[] normals) {
        String[] leetArray = new String[normals.length];
        for (int i = 0; i < normals.length; i++) {
            leetArray[i] = toLeet(normals[i]);
        }
        return leetArray;
    }
}