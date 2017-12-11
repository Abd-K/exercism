import static java.lang.String.format;

public class Twofer {

    public String twofer(String name) {
        String value = name == null ? "you" : name;
        return format("One for %s, one for me.", value);
    }

}