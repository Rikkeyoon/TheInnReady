public class Recipies
{
   private String allergies;
   private int prepareTime;
   private String ingrediens;
   private String ingrediensAmount;
   
   public Recipies()
   {
      this.allergies = "";
      this.prepareTime = 0;
      this.ingrediens = "";
      this.ingrediensAmount = "";
   }
   
   public Recipies(String allergies, int prepareTime, String ingrediens, String ingrediensAmount)
   {
      this.allergies = allergies;
      this.prepareTime = prepareTime;
      this.ingrediens = ingrediens;
      this.ingrediensAmount = ingrediensAmount;
   }
   
   public String toString()
   {
      String a = "";
      a += "Allergies: "+allergies+"\n";
      a += "Prepare time: "+prepareTime+"\n";
      a += "Ingrediens: "+ingrediens+"\n";
      a += "IngrediensAmount: "+ingrediensAmount+"\n";
      return a;   
   }
}