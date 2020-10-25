package algorithm.doit;

import java.sql.Date;
import java.util.Calendar;

public class Todo {
  
  public static void main(String[] args) {
    for (Date date : getCurWeek()) {
      System.out.println(date);
    }
  }
  
  public static Date[] getCurWeek() {
    Date[] thisWeek = new Date[7];
    java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
    Calendar c = Calendar.getInstance();
    
    for (int i = 0; i < 7; i++) {
      c.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY + i);
      thisWeek[i] = Date.valueOf(formatter.format(c.getTime()));      
    }
    return thisWeek;
  }
  
  public static String getCurMonday(){
      java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
      Calendar c = Calendar.getInstance();
      c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
      return formatter.format(c.getTime());
  }



  //현재 날짜 일요일

  public static String getCurSunday(){
      java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
      Calendar c = Calendar.getInstance();
      c.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);
      c.add(c.DATE,7);
      return formatter.format(c.getTime());
  }
  //현재 날짜 주차
  public static String getWeek(){
      Calendar c = Calendar.getInstance();
      String week = String.valueOf(c.get(Calendar.WEEK_OF_MONTH));
      return week;
  }

  private Date date;
  private String title;
  private String content;
  private boolean isDone = false;
  private Category category;


  enum Category {
    language {
      public String toString() {
        return "어학";
      }
    },
    reading {
      public String toString() {
        return "독서";
      }
    },
    workout {
      public String toString() {
        return "운동";
      }
    },
    coding {
      public String toString() {
        return "코딩";
      }
    },
  }

  @Override
  public String toString() {
    return  (isDone ? "● " : "○ ") + date + " | "+ category.toString() + " | " + title  ;
  }




}
