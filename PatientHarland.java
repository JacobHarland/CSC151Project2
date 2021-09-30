public class PatientHarland
{
   private String firstName, lastName;
   private double patientTemperature, patientOxygen;
   
   //no arg constructor
   public PatientHarland()
   {
      firstName = "";
      lastName = "";
      patientTemperature = 0.0;
      patientOxygen = 0.0;
   }
   
   //constructor
   public PatientHarland(String firstN, String lastN, double patientTemp, double patientOxy)
   {
      firstName = firstN;
      lastName = lastN;
      patientTemperature = patientTemp;
      patientOxygen = patientOxy;
   }
   
   public void setFirstName(String firstN) 
   {
      firstName = firstN;
   }
   
   public void setLastName(String lastN) 
   {
      lastName = lastN;
   }
   
   public void setPatientTemperature(double patientTemp) 
   {
      patientTemperature = patientTemp;
   }
   
   public void setpatientOxygen(double patientOxy) 
   {
      patientOxygen = patientOxy;
   }
   
   public String getFirstName()
   {
      return firstName;
   }
   
   public String getLastName()
   {
      return lastName;
   }

   public double getpatientTemperature()
   {
      return patientTemperature;
   }

   public double getpatientOxygen()
   {
      return patientOxygen;
   }
   
   public String determineOxygenRange()
   {
      String oxygenRange="";
      
      if (getpatientOxygen() >= 95)
      {
         oxygenRange = "Normal";
      }
      else if (getpatientOxygen() >= 85)
      {
         oxygenRange = "Hypoxic";
      }
      else
      {
         oxygenRange = "Severely Hypoxic";
      }
      
      return oxygenRange;  
   }
      
   public String determineTemperatureRange()
   {
      String temperatureRange="";
      
      if (getpatientTemperature() > 100.4)
      {
         temperatureRange = "Fever";
      }
      else if (getpatientTemperature() >= 97.5)
      {
         temperatureRange = "Normal";
      }
      else
      {
         temperatureRange = "Low";
      }
      
      return temperatureRange;  
   }



   
   

}
