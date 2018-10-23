public class TheInnInfo
{
      private String name;
      private String adress;
      private int phoneNumber;
      private String email;
      private int amountOfRooms;
      private int stars;
      private String openingClosingHoursWeekdays;
      private String openingClosingHoursWeekends;
      private int zipCode;
 
      public TheInnInfo()
      {
      this.name = " ";
      this.adress = " ";
      this.zipCode = 0;
      this.phoneNumber = 0;       
      this.email = " ";
      this.amountOfRooms = 0;
      this.stars = 0;
      this.openingClosingHoursWeekdays = " ";
      this.openingClosingHoursWeekends = " "; 
      }
      
      public TheInnInfo(String name, String adress, int zipCode, int phoneNumber, String email, int amountOfRooms, int stars, String openingClosingHoursWeekdays, String openingClosingHoursWeekends)
      {
      this.name = name;
      this.adress = adress;
      this.zipCode = zipCode;
      this.phoneNumber = phoneNumber;       
      this.email = email;
      this.amountOfRooms = amountOfRooms;
      this.stars = stars;
      this.openingClosingHoursWeekdays = openingClosingHoursWeekdays;
      this.openingClosingHoursWeekends = openingClosingHoursWeekends; 
      }
      
      public String toString()
      {
      String a = "";
      a += "Name: "+name+"\n";
      a += "Adress: "+adress+"\n";
      a += "Postnr: "+zipCode+"\n";
      a += "PhoneNumber: "+phoneNumber+"\n";
      a += "Email: "+email+"\n";
      a += "Amount of Rooms: "+amountOfRooms+"\n";
      a += "Amount of Stars: "+stars+"\n";
      a += "openingClosingHoursWeekdays: "+openingClosingHoursWeekdays+"\n";
      a += "openingClosingHoursWeekends: "+openingClosingHoursWeekends+"\n";
      return a;
      }
}
