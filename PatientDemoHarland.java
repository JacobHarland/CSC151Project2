/**
Jacob Harland
03/24/2021
CSC 151
*/

import java.util.Scanner;//for reading user input
import java.util.ArrayList;

public class PatientDemoHarland
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);//gets users input
      ArrayList<PatientHarland> patientHarlandList = new ArrayList<PatientHarland>();//to hold circle object
      
      String firstName, lastName;
      double patientTemperature, patientOxygen;
      char goAgain;
      int intValueOfNonNormalTemps=0, intValueOfNonNormalOxygen=0;
      
      do
      {
         System.out.print ("Enter the patient’s first name: ");
         firstName = keyboard.next();
         
         System.out.print ("Enter the patient’s last name: ");
         lastName = keyboard.next();
         
         System.out.print ("Enter the patient’s temperature: ");
         patientTemperature = keyboard.nextDouble();
         //validates the user input, not letting them enter BELOW 80 degree or ABOVE 115 degrees
         while(patientTemperature < 80 || patientTemperature > 115)
            {
               System.out.print ("Temperature must be greater than 80 and less than 115. Enter the patient’s temperature: ");
               patientTemperature = keyboard.nextDouble();
            }
         
         
         System.out.print ("Enter the patient’s oxygen level: ");
         patientOxygen = keyboard.nextDouble();
         //validates the user input, not letting them enter BELOW 80% or ABOVE 100%
         while(patientOxygen < 80 || patientOxygen > 100)
            {
               System.out.print ("Oxygen must be within the range of 80 to 100. Enter the patient’s temperature: ");
               patientOxygen = keyboard.nextDouble();
            }
         
         PatientHarland patientHarland = new PatientHarland();
         patientHarland.setFirstName(firstName);
         patientHarland.setLastName(lastName);
         patientHarland.setPatientTemperature(patientTemperature);
         patientHarland.setpatientOxygen(patientOxygen);
   
         patientHarlandList.add(patientHarland);
         
         //clears the buffer
         System.out.println();
         
         System.out.print ("Do you wish to enter information for another patient (Y/N)? ");
         goAgain = keyboard.next().charAt(0);
         System.out.println();
      }
      while(goAgain == 'Y' || goAgain == 'y');
      
      System.out.println ("Patient Report:\n");
      
      //iterate over the arraylist to print out info 
      for (int index = 0; index< patientHarlandList.size(); index++)
      {
         System.out.println ("Patient Name: " + patientHarlandList.get(index).getFirstName() + " " + patientHarlandList.get(index).getLastName());
         System.out.println ("Temperature Range: " + patientHarlandList.get(index).determineTemperatureRange());
         System.out.println ("Oxygen Range: " + patientHarlandList.get(index).determineOxygenRange());
         System.out.println();
         
         if (patientHarlandList.get(index).determineTemperatureRange().equals("Normal"))
         {
         }           
         else
         {
            intValueOfNonNormalTemps += 1;
         }
         
         if (patientHarlandList.get(index).determineOxygenRange().equals("Normal"))
         {
         }           
         else
         {
            intValueOfNonNormalOxygen += 1;
         }
      }     
      System.out.println ("Number of patients with non-normal temperature range: " + intValueOfNonNormalTemps);
      System.out.println ("Number of patients with non-normal oxygen range: " + intValueOfNonNormalOxygen);
   }
}