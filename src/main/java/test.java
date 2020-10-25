import java.sql.Date;
import java.text.SimpleDateFormat;

public class test {
  public static void main(String[] args) {
    long time = System.currentTimeMillis(); 

    SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    String str = dayTime.format(new Date(time));

    System.out.println(str);
    
  }
  
  
  public static String getTime(long time) {
    SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    String str = dayTime.format(new Date(time));
    return str;
  }
}
