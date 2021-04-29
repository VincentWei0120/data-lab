//https://codehs.com/uploads/723d014802de541f4506f37fd010afdf

import core.data.*;

public class Welcome01 {
   //public static void main(String[] args) {
   public void runWelcome01() {
      String id = "KHWD";
      DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/" + id + ".xml"); 
      ds.setCacheTimeout(15 * 60);  
      ds.load();
      //ds.printUsageString();
      float temp = ds.fetchFloat("temp_f");
      String loc = ds.fetchString("location");
      System.out.println("The temperature at " + loc + " is " + temp + "F");
   }
}