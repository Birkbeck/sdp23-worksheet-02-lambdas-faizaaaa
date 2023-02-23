import java.util.Arrays;
import java.util.List;

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
    question5();
    question6();
    question7();
    question8();
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

  public static void question5() {
    List<String> words = Arrays.asList("Hello", "eeee","book", "even");
    System.out.println("Q5: ");
    List<String> shortWords = StringUtils.allMatches(words, s -> s.length() < 4);
    shortWords.stream().forEach(System.out::println);
    List<String> wordsWithB = StringUtils.allMatches(words, s -> s.contains("b"));
    wordsWithB.stream().forEach(System.out::println);
    List<String> evenLengthWords = StringUtils.allMatches(words, s -> (s.length() % 2) == 0);
    evenLengthWords.stream().forEach(System.out::println);

  }

  public static void question6() {
    List<String> words = Arrays.asList("Hello", "eeee","book", "even");
    System.out.println("Q6: ");
    List<String> shortWords = StringUtils.allMatchesV2(words, s -> s.length() < 4);
    shortWords.stream().forEach(System.out::println);
    List<String> wordsWithB = StringUtils.allMatchesV2(words, s -> s.contains("b"));
    wordsWithB.stream().forEach(System.out::println);
    List<String> evenLengthWords = StringUtils.allMatchesV2(words, s -> (s.length() % 2) == 0);
    evenLengthWords.stream().forEach(System.out::println);

  }

  public static void question7() {
    List<String> words = Arrays.asList("Hello", "eeee","book", "even");
    System.out.println("Q7: ");
    List<String> excitingWords = StringUtils.transformedList(words, s -> s + "!");
    excitingWords.stream().forEach(System.out::println);
    List<String> eyeWords = StringUtils.transformedList(words, s -> s.replace("i", "eye"));
    eyeWords.stream().forEach(System.out::println);
    List<String> upperCaseWords = StringUtils.transformedList(words, String::toUpperCase);
    upperCaseWords.stream().forEach(System.out::println);
  }

  public static void question8() {
    List<String> words = Arrays.asList("Hello", "eeee","book", "even", "igloo");
    System.out.println("Q8: ");
    List<String> excitingWords = StringUtils.transformedList2(words, s -> s + "!");
    excitingWords.stream().forEach(System.out::println);
    List<String> eyeWords = StringUtils.transformedList2(words, s -> s.replace("i", "eye"));
    eyeWords.stream().forEach(System.out::println);
    List<String> upperCaseWords = StringUtils.transformedList2(words, String::toUpperCase);
    upperCaseWords.stream().forEach(System.out::println);
  }
  }


