import java.util.regex.Pattern;

public class Test {


  public static void main(String[] args) {
    String data = "12000\t1200-34\td-sh\tte--as";
    String headerPattern = Pattern.quote("\t");

    for(String str : data.split(headerPattern, -1)){
      System.out.println(str);
    }
  }
}
