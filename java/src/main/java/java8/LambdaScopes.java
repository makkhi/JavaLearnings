package java8;

public class LambdaScopes {

  int instance;
  static int staticVar;

  /**
   * Static and Instance variables can be modified from lambda scope in contrast to local variables
   */
  public void accessInstanceAndStatic() {

    Converter<String, Integer> converter1 =
        i -> {
          instance = 22;
          return String.valueOf(i);
        };

    Converter<String, Integer> converter2 =
        i -> {
          staticVar = 22;
          return String.valueOf(i);
        };

    converter1.convert(1);
  }

  public static void main(String[] args) {
        // Num should be effectively final or effectively final
        String num = "1";
        Converter<String, Integer> converter = i -> String.valueOf(num + i);
        System.out.println(converter.convert(2));
        // num = "4" gives compilation error as it should be effectively final

    }
}
