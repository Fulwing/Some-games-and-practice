
//Finished Code
public class Inventory {
 
    public static void main(String[] args) {
        String[] inventory = new String[5];        
        inventory[0] = "HP Potion";
        inventory[1] = "Magic Sword";
        inventory[2] = "Wooden Shield";
        inventory[3] = "Magic Key";
        printInventory(inventory);
 
        if(checkInventory(inventory, "Magic Key")) {
 
            System.out.println("You opened the locked door!");
 
        }
    }
     
    public static boolean checkInventory(String[] inventory, String toCheck){
        for(String item : inventory){
 
            if(item.equals(toCheck)){
 
               return true;
 
            }
 
        }
 
        return false;
    }
     
    public static void printInventory(String[] inventory){
       for(String item : inventory){
 
         System.out.println(item);
 
       }
    }
     
}