package ionsoft.pt.textalay;

/**
 * @author hendrawd on 29/04/18
 */
public class AlayHelper {

    public static String alaynize(String input) {
        String result = input;
        result = result.replaceAll("I", "1");
        result = result.replaceAll("i", "1");
        result = result.replaceAll("E", "3");
        result = result.replaceAll("e", "3");
        result = result.replaceAll("A", "4");
        result = result.replaceAll("a", "4");
        result = result.replaceAll("S", "5");
        result = result.replaceAll("s", "5");
        result = result.replaceAll("G", "6");
        result = result.replaceAll("g", "6");
        result = result.replaceAll("J", "7");
        result = result.replaceAll("j", "7");
        result = result.replaceAll("B", "8");
        result = result.replaceAll("b", "8");
        return result;
    }
}
