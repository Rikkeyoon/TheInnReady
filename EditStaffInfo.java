public class EditStaffInfo
{
      private String firstName;
      private String lastName;
      private String adress;
      private int zipCode;
      private String phoneNumber;
      private String email;
      
      public EditStaffInfo()
      {
      this.firstName = " ";
      this.lastName = " ";
      this.adress = " ";
      this.zipCode = 0;
      this.phoneNumber = " ";       
      this.email = " ";
      }
      
      public EditStaffInfo(String firstName, String lastName, String adress, int zipCode, String phoneNumber, String email)
      {
      this.firstName = firstName;
      this.lastName = lastName;
      this.adress = adress;
      this.zipCode = zipCode;
      this.phoneNumber = phoneNumber;       
      this.email = email;
      }  
         //Setters
      public void setFirstName(String firstName)
      {
         this.firstName = firstName;
      }
      
      public void setLastName(String lastName)
      {
         this.lastName = lastName;
      }
      
      public void setAdress(String adress)
      {
         this.adress = adress;
      }
      
      public void setZipCode(int zipCode)
      {
         this.zipCode = zipCode;
      }
      
      public void setPhoneNumber(String phoneNumber)
      {
         this.phoneNumber = phoneNumber;
      }
      
      public void setEmail(String email)
      {
         this.email = email;
      }
      
         //Getters
      public String getFirstName()
      {
         return firstName;
      }
      
      public String getLastname()
      {
         return lastName;
      }
      
      public String getAdress()
      {
         return adress;
      }
      
      public int getZipCode()
      {
         return zipCode;
      }   
      
      public String getPhoneNumber()
      {
         return phoneNumber;
      } 
      
      public String getEmail()
      {
         return email;
      }
      
      // Print 
      public String toString()
      {
      String a = "";
      a += "Firstname: "+firstName+"\n";
      a += "Lastname: "+lastName+"\n";
      a += "Adress: "+adress+"\n";
      a += "Postnr: "+zipCode+"\n";
      a += "Tlf. Nr: "+phoneNumber+"\n";
      a += "Email: "+email+"\n";
      return a;
      }
}
 