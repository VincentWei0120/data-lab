// https://codehs.com/uploads/efd0a818c1548520c7a61435770b9d0a

/*
 * Arrays of objects
 */

import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Welcome03_List {
   //public static void main(String[] args) {
   public void runWelcome03() {
      DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/index.xml").load();
      ArrayList<WeatherStation> allstns = ds.fetchList("WeatherStation", "station/station_name", 
             "station/station_id", "station/state",
             "station/latitude", "station/longitude");
      System.out.println("Total stations: " + allstns.size());
      
      double lowestLatitude=0.0;
      String name =" ";
      for(int i=0; i<allstns.size()-1; i++){
          if(allstns.get(i).getLat()<allstns.get(i+1).getLat()&&allstns.get(i).getLat()<lowestLatitude){
              lowestLatitude = allstns.get(i).getLat();
              name=allstns.get(i).getName();
          }
      }
      for (WeatherStation station : allstns) {
            System.out.println(station.getLat()+ " " +station.getName());
         }
      System.out.println("The southmost station is: "+ name + " at "+ lowestLatitude);
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a state abbreviation: ");
      String state = sc.next();
      System.out.println("Stations in " + state);
      int StationInState=0;
      for (WeatherStation ws : allstns) {
         if (ws.isLocatedInState(state)) {
            System.out.println("  " + ws.getId() + ": " + ws.getName());
            StationInState++;
         }
         
      }
      System.out.println(StationInState+" stations in "+state);
   }
}