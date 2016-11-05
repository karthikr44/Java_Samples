import java.util.*; 

public class MyClass {
  
  public static String[] vehicles = {"ambulance", "helicopter", "lifeboat"}; 
  
  public static String[][] drivers = {  {"Fred", "Tom", "Nancy"},  
                                        {"Larry", "David"}, 
                                        {"Kathy", "Russel", "Kevin"}
                                     };
  									
  public static void main(String[] args) {
   	Map<String, LinkedHashSet<String>> personnel = new HashMap<String, LinkedHashSet<String>>(); 
    
    for(int i=0; i < vehicles.length; i++) {
      String vehicle = vehicles[i]; 
      
      String[] driverList = drivers[i]; 
      
      LinkedHashSet<String> driverSet = new LinkedHashSet<String>(); 
      
      for(String driver:driverList) {
        driverSet.add(driver); 
      }
      
      personnel.put(vehicle, driverSet); 
    }
    
    
    for(String key: personnel.keySet()) {
      System.out.print(key+": "); 
      System.out.println(personnel.get(key)); 
    }
  }
}