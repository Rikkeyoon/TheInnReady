import java.util.*;

public class TheInn
{
   public static void main (String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      TheInnInfo theInnInfo = new TheInnInfo();
      StaffInfo[] staff = new StaffInfo[4];
      Recipies[] recipe = new Recipies[2];
      CommodityStorage2[] storages = new CommodityStorage2[8];   
      MonthlyShifts[] shift = new MonthlyShifts[4];    
      int[] password = new int[4];      
      
      boolean running = true;
      boolean runningRecipies = true;
      boolean runningStaff = true;
      boolean runningPasswords = true;
         //Staff
      EditStaffInfo mrBrown = new EditStaffInfo("Henrik", "Brown", "Kroenvej 132", 2740, "+45 70801415", "HenrikBrown@Kroen.dk");
      EditStaffInfo servant = new EditStaffInfo("Ulla", "Gaard", "Jonasvej 23", 3050, "+45 666123321", "UllaGaard@hotmail.dk");
      EditStaffInfo chef = new EditStaffInfo("Chef", "El Dende", "Michellinvej 3", 3000, "+45 10020030", "thechef@chef.dk");
      EditStaffInfo mrsBrown = new EditStaffInfo("Hanne", "Brown", "Kroenvej 132", 2740, "+45 80701415", "HanneBrown@Kroen.dk");
         //Recipies
      Recipies hamRecipe = new Recipies("Gluten", 35, "Ham, potatoes", "2 pieces of ham, 10 potatoes");
      Recipies salmonRecipe = new Recipies("None", 35, "Baked salmon with persille", "1 salmon, 1 branch of persille");
      Recipies angusRecipe = new Recipies("Lactose", 35, "250g Black Angus Steak, potatoes", "1 beeg Angus, 10 potatoes");
         //StaffInfo
      TheInnInfo info = new TheInnInfo("Kroen", "Kroenvej 132", 2740, 20677620, "Kroen@kroen.dk", 10, 4, "10-18", "10-20");   
         //Storage
      CommodityStorage2 ham = new CommodityStorage2("Ham", 20.50, "Dinner");   
      CommodityStorage2 potatoes = new CommodityStorage2("Potatoes", 250.00, "Dinner");   
      CommodityStorage2 salmon = new CommodityStorage2("Salmon", 15.00, "Dinner");
      CommodityStorage2 persille = new CommodityStorage2("Persille", 12.00, "Dinner");
      CommodityStorage2 angus = new CommodityStorage2("Beef Angus", 18.00, "Dinner");
      CommodityStorage2 plates = new CommodityStorage2("Dinner plates", 50.00, "Restaurant");
      CommodityStorage2 knives1 = new CommodityStorage2("Knives", 10.00, "Kitchen");
      CommodityStorage2 knives2 = new CommodityStorage2("Knives", 50.00, "Restaurant");
         //StaffShift
      MonthlyShifts mrBrownShifts = new MonthlyShifts("Fredag", 42, "October", "10-18");    
      MonthlyShifts servantShifts = new MonthlyShifts("Fredag", 42, "October", "16-24");
      MonthlyShifts chefShifts = new MonthlyShifts("Fredag", 42, "October", "15-23");
      MonthlyShifts mrsBrownShifts = new MonthlyShifts("Fredag", 42, "October", "07-15");
      
         //StaffShiftPasswords
      password[0] = 1;
      password[1] = 2;
      password[2] = 3;
      password[3] = 4;
      
           
         //Menu               
      while (running)
      {  
         hovedMenu();
         int menu = userInput.nextInt();
         //TheInnInfo
         if (menu == 1) 
         {       
         System.out.println(info);
         System.out.println("Tryk 1 for at vende tilbage til hovedmenu");
         int returns = userInput.nextInt();
            if (returns == 1)
            {
            running = true;
            }
         }
         //StaffInfo
         else if(menu == 2)
         {
            runningStaff = true;
            
            while (runningStaff)
            {
            allStaff();
            int staffs = userInput.nextInt();
            
            if (staffs == 1)
            {
               System.out.println(mrBrown);  
               returnStaff();
               
               int returns = userInput.nextInt();
                  if(returns == 1)
                  {
                     runningStaff = true;
                  }
                  else 
                  {
                     runningStaff = false;
                  }                                   
            }
            else if (staffs == 2)
            {
               System.out.println(servant);  
               returnStaff();
               
               int returns = userInput.nextInt();
                  if(returns == 1)
                  {
                     running = true;
                  }  
                  else 
                  {
                     runningStaff = false;
                  }                
            }
            else if (staffs == 3)
            {
               System.out.println(chef);  
               returnStaff();
               
               int returns = userInput.nextInt();
                  if(returns == 1)
                  {
                     running = true;
                  } 
                  else 
                  {
                     runningStaff = false;
                  }        
            }
            else if (staffs == 4)
            {
               System.out.println(mrsBrown);  
               returnStaff();
               
               int returns = userInput.nextInt();
                  if(returns == 1)
                  {
                     running = true;
                  }
                  else 
                  {
                     runningStaff = false;
                  }     
            }   
         } 
         }
         //StaffShifts
         else if (menu == 3)  
         {
            runningPasswords = true;
            System.out.println("Insert password");
            while (runningPasswords)
            {
               int pass = userInput.nextInt();
               if (pass == password[0])
               {
                  System.out.println(mrBrownShifts);
                  System.out.println("Tryk 1 for at vende tilbage til hovedmenu");
                  int returns = userInput.nextInt();
                     if (returns == 1)
                     {
                        runningPasswords = false;
                     }
               }
               else if (pass == password[1])
               {
                  System.out.println(servantShifts);
                  System.out.println("Tryk 1 for at vende tilbage til hovedmenu");
                  int returns = userInput.nextInt();
                     if (returns == 1)
                     {
                        runningPasswords = false;
                     }
               }
               else if (pass == password[2])
               {
                  System.out.println(chefShifts);
                  System.out.println("Tryk 1 for at vende tilbage til hovedmenu");
                  int returns = userInput.nextInt();
                     if (returns == 1)
                     {
                        runningPasswords = false;
                     }
               }
               else if (pass == password[3])
               {
                  System.out.println(mrsBrownShifts);
                  int returns = userInput.nextInt();
                     if (returns == 1)
                     {
                        runningPasswords = false;
                     }
               }
               else
               {
                  System.out.println("This is not an option");
                  int returns = userInput.nextInt();
                     if (returns == 1)
                     {
                        runningPasswords = false;
                     }
               }
            }
         }
         //Commodity Storage
         else if (menu == 4)  
         {  
            System.out.println(ham);
            System.out.println(potatoes);
            System.out.println(salmon);
            System.out.println(persille);
            System.out.println(angus);
            System.out.println(plates);
            System.out.println(knives1);
            System.out.println(knives2); 
            
            System.out.println("Tryk 1 for at vende tilbage til hovedmenu");
            int returns = userInput.nextInt();
            if (returns == 1)
            {
               running = true;
            }   
         }
         //Recipies                 
         else if (menu == 5)  
         {  
            runningRecipies = true;
            
            while (runningRecipies)
            {
            menuCard();
            int b = userInput.nextInt();
               if (b == 1)
               {
                  System.out.println(hamRecipe);
                  returnMenu();
                  int returns = userInput.nextInt();
                  if(returns == 1)
                  {
                     runningRecipies = true;
                  }
                  else
                  {
                     runningRecipies = false;
                  }
               }
               else if (b == 2)
               {
                  System.out.println(salmonRecipe);
                  returnMenu();
                  int returns = userInput.nextInt();
                  if(returns == 1)
                  {
                     runningRecipies = true;
                  }
                  else
                  {
                     runningRecipies = false;
                  }
               }
               else if (b == 3)
               {
                  System.out.println(angusRecipe);
                  returnMenu();
                  int returns = userInput.nextInt();
                  if(returns == 1)
                  {
                     runningRecipies = true;
                  }
                  else
                  {
                     runningRecipies = false;
                  }
               }
         }
      }
      else if(menu == 0)
      {
         System.out.println("Exit program");
         running = false;
      }
      }  
   }  
  
   public static void hovedMenu ()
   {
      System.out.println("Tryk følgende for at dirigere rundt"); 
      System.out.println("0: Exit program");
      System.out.println("1: TheInnInfo");
      System.out.println("2: StaffInfo ");
      System.out.println("3: StaffShift");
      System.out.println("4: Commodity Storage");
      System.out.println("5: Recipies");
   }
   
   public static void allStaff()
   {
      System.out.println("Tryk følgende for at dirigere rundt");
      System.out.println("1: Mr.Brown");
      System.out.println("2: Servant ");
      System.out.println("3: Chef ");
      System.out.println("4: Mrs. Brown");
   }
   
   public static void menuCard()
   {
      System.out.println("Tryk følgende for at dirigere rundt");
      System.out.println("1: Ham and Potatoes");
      System.out.println("2: Baked Salmon");
      System.out.println("3: Beef Angus"); 
   }
   
   public static void returnMenu()
   {
      System.out.println("Tryk 1 for at vende tilbage til menucard");
      System.out.println("Tryk 2 for at vende tilbage til hovedmenu");
   }   
   
   public static void returnStaff()
   {
      System.out.println("Tryk 1 for at vende tilbage til staffmenu");
      System.out.println("Tryk 2 for at vende tilbage til hovedmenu");
   }

   public static void storage()
   {    
   }
}