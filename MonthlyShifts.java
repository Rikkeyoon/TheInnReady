public class MonthlyShifts
{
   //Attributter
   private String day;
   private int week;
   private String month;
   private String hours;
   //Dummie
   public MonthlyShifts()
   {
      this.day = "";
      this.week = 0;
      this.month = "";   
      this.hours = "";
   }
   //Konstruktør
   public MonthlyShifts(String day, int week, String month, String hours)
   {
      this.day = day;
      this.week = week;
      this.month = month; 
      this.hours = hours;
   }
   //Setter
   public void setDay(String day)
   {
      this.day = day;
   }
   
   public void setWeek(int week)
   {
      this.week = week;
   }
   
   public void setMonth(String month)
   {
      this.month = month;
   }
   
   public void setHours(String hours)
   {
      this.hours = hours;
   }
   //Getter
   public String getDay()
   {
      return day;
   }
   
   public int getWeek()
   {
      return week;
   }
   
   public String getMonth()
   {
      return month;
   }
   
   public String getHours()
   {
      return hours;
   }
   //Print
   public String toString()
   {
      String a = "";
      a += "Dage: "+day+"\n";
      a += "Uge: "+week+"\n";
      a += "Måned: "+month+"\n";
      a += "Timer: "+hours+"\n";
      return a;      
   }
}