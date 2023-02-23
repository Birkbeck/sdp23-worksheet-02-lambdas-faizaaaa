import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StringUtils {

    public static int eChecker(String a, String b) {
        if (a.contains("e") && !b.contains("e")) return -1;
        if (!a.contains("e") && b.contains("e")) return 1;
        else return 0;
    }

    public static String betterString(String a, String b, TwoStringPredicate l) {
        return l.findbest(a,b) ? a: b;
    }

    public static <T> T betterElement(T a, T b, TwoElementPredicate<T> l) {
        return l.findbetter(a,b) ? a: b;
    }

    public static List<String> allMatches(List<String> List, Predicate<String> predicate){
        List<String> s = new ArrayList<>();
        for(String element : List) {
            if (predicate.test(element)) {
                s.add(element);
            }
        }
        return s;
    }
    public static <T> List<T> allMatchesV2 (List<T> List, Predicate<T> predicate){
        List<T> s = new ArrayList<>();
        for(T element : List) {
            if (predicate.test(element)) {
                s.add(element);
            }
        }
        return s;
    }

    public static List<String> transformedList(List<String> list, Function<String,String> f) {
        List<String> newList = new ArrayList<>();
        for(String element : list) {
            String s = f.apply(element);
                newList.add(s);
            }
        return newList;
    }

}
