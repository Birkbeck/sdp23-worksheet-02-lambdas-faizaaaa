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
}
