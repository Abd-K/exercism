import java.util.HashMap;
import java.util.Map;

public class PangramChecker {
        Map<Character, Integer> alphaFrequency = new HashMap<Character, Integer>();

    public boolean isPangram(String input) {
        initMap();
        input.toLowerCase().chars().filter(e ->alphaFrequency.containsKey((char) e)).forEach( e -> { alphaFrequency.put((char)e, Integer.valueOf(alphaFrequency.get((char) e)+1));});
        return !alphaFrequency.containsValue(0);
    }

    private void initMap() {
        alphaFrequency.put('a', 0);
        alphaFrequency.put('b', 0);
        alphaFrequency.put('c', 0);
        alphaFrequency.put('d', 0);
        alphaFrequency.put('e', 0);
        alphaFrequency.put('f', 0);
        alphaFrequency.put('g', 0);
        alphaFrequency.put('h', 0);
        alphaFrequency.put('i', 0);
        alphaFrequency.put('j', 0);
        alphaFrequency.put('k', 0);
        alphaFrequency.put('l', 0);
        alphaFrequency.put('m', 0);
        alphaFrequency.put('n', 0);
        alphaFrequency.put('o', 0);
        alphaFrequency.put('p', 0);
        alphaFrequency.put('q', 0);
        alphaFrequency.put('r', 0);
        alphaFrequency.put('s', 0);
        alphaFrequency.put('t', 0);
        alphaFrequency.put('u', 0);
        alphaFrequency.put('v', 0);
        alphaFrequency.put('w', 0);
        alphaFrequency.put('x', 0);
        alphaFrequency.put('y', 0);
        alphaFrequency.put('z', 0);
    }

}
