public class CommodityStorage2
{
      Recipies[] recipe = new Recipies[5];
      
      Recipies ham = new Recipies("Gluten", 35, "Ham, potatoes, beans", "2 pieces of ham, 10 potatoes, 200g beans");
      Recipies salmon = new Recipies("None", 35, "Baked salmon with persille", "1 salmon, 1 branch of persille");
      Recipies angus = new Recipies("Lactose, peanuts", 35, "250g Black Angus Steak, potatoes, beans, peanuts", "2 pieces of ham, 10 potatoes, 200g beans, 10g peanuts");

      private String description;
      private double amount;
      private String usedFor;
   
      // DUMMIE
   public CommodityStorage2()
   {
      this.description = "";
      this.amount = 0.0;
      this.usedFor = "";
   }
      // KONSTRUKTØR
   public CommodityStorage2(String description, double amount, String usedFor)
   {
      this.description = description;
      this.amount = amount;
      this.usedFor = usedFor;
   }
      // SETTERS
   public void setDescription(String description)
   {
      this.description = description;
   }
   
   public void setAmount(double amount)
   {
      this.amount = amount;
   }
   
   public void setUsedFor(String usedFor)
   {
      this.usedFor = usedFor;
   }
         // GETTERS
      
   public String getDescription()
   {
      return description;
   }
   
   public double getAmount()
   {
      return amount;
   }
      
   public String getUsedFor()
   {
      return usedFor;
   }
      
   public String toString()
   {
      String a = "";
      a += "Description: "+description+"\n";
      a += "Amount: "+amount+"\n";
      a += "Used For: "+usedFor+"\n";
      return a;
   } 
}

