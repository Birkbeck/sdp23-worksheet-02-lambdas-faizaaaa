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
    question3();
    question4();
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


  public static void question2(){
    String[] words = createList();
    Arrays.sort(words, StringUtils::eChecker);
    System.out.println("2 " + Arrays.asList(words));
  }
  public static void question3() {
    String test1="Hello";
    String test2 = "Goodbye";
    System.out.println("q3: " + StringUtils.betterString(test1, test2, (s1, s2) -> s1.length() > s2.length()));
    System.out.println(StringUtils.betterString(test1, test2, (s1, s2) -> true));
  }

  public static void question4() {
    String test1="Hello";
    String test2 = "Goodbye";
    System.out.println("q4: " + StringUtils.betterElement(test1, test2, (s1, s2) -> s1.length() > s2.length()));
    System.out.println(StringUtils.betterElement(test1, test2, (s1, s2) -> true));

    int test3=1;
    int test4 = 40;
    System.out.println("q4: " + StringUtils.betterElement(test3, test4, (s1, s2) -> s1 > s2));
    System.out.println(StringUtils.betterElement(test3, test4, (s1, s2) -> true));
  }
  }

