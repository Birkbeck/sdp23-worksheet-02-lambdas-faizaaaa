import java.util.Arrays;

public class Outline {
  public static void main(String... args) { // varargs alternative to String[]
    Integer[] intArray = {1,7,3,4,8,2};
    System.out.println(Arrays.asList(intArray));
    // Arrays.sort(intArray,.......)
    question1_1();
    question1_2();
    question1_3();
    question1_4();
    question2();
    }
    public static String[] createList() {
      return new String[]{"all", "ball", "crawl", "apples", "bananas", "egg", "elephant"};
    }

    public static void question1_1(){
      String[] words = createList();
      Arrays.sort(words, (a, b) -> a.length() - b.length());
      System.out.println("1.1 " + Arrays.asList(words));
    }

  public static void question1_2(){
    String[] words = createList();
    Arrays.sort(words,(a,b) -> b.length()-a.length());
    System.out.println("1.2 " + Arrays.asList(words));
  }

  public static void question1_3(){
    String[] words = createList();
    Arrays.sort(words,(a,b) ->
      a.charAt(0) - b.charAt(0)
    );
    System.out.println("1.3 " + Arrays.asList(words));
  }

  public static void question1_4(){
    String[] words = createList();
    Arrays.sort(words,(a,b) -> {
            if (a.contains("e") && !b.contains("e")) return -1;
            if (!a.contains("e") && b.contains("e")) return 1;
            else return 0;
    }
    );
    System.out.println("1.4 " + Arrays.asList(words));
  }

  public static int eChecker(String a, String b) {
    if (a.contains("e") && !b.contains("e")) return -1;
    if (!a.contains("e") && b.contains("e")) return 1;
    else return 0;
  }

  public static void question2(){
    String[] words = createList();
    Arrays.sort(words,(a,b) -> eChecker(a,b)
    );
    System.out.println("2 " + Arrays.asList(words));
  }
  }

