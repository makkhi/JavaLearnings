package java8;

interface Converter<T, F> {

    T convert(F t);
}
public class FunctionalInterfaces {

  public static void main(String[] args) {

      Converter<Integer, String> converter = t -> Integer.parseInt(t);

      System.out.println(converter.convert("123"));

  }
}
