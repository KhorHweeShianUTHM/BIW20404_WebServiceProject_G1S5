package com.khor.healthwebservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.WebServiceException;

/**
 *
 * @author Khor
 */
@WebService(serviceName = "HealthWebService")
public class HealthWebService {
    
    /**
     * Web service operation - get user's information
     * KHOR HWEE SHIAN
     * @param name
     * @param idNumber
     * @param gender
     * @param weight
     * @param height
     * @param met
     * @param duration
     * @return 
     */
    @WebMethod(operationName = "getUserInfo")
    public String getUserInfo(
            @WebParam(name = "name") String name, 
            @WebParam(name = "idNumber") String idNumber, 
            @WebParam(name = "gender") String gender, 
            @WebParam(name = "weight") double weight,
            @WebParam(name = "height") double height,
            @WebParam(name = "met") double met,
            @WebParam(name = "duration") double duration) {
        
        // Name validation - SOAP fault handing
        if (!name.matches("[A-Za-z\\s]+")) {
            throw new WebServiceException("Name must contain only letters and spaces.");
        }

        // ID validation - SOAP fault handing
        if (!idNumber.matches("\\d{12}")) {
            throw new WebServiceException("ID Number must contain exactly 12 digits.");
        }

        // Gender validation - SOAP fault handing
        int lastDigit = Character.getNumericValue(idNumber.charAt(11)); // count last digit
        boolean isMale = gender.equalsIgnoreCase("Male");
        boolean isFemale = gender.equalsIgnoreCase("Female");

        if ((lastDigit % 2 == 0 && isMale) || (lastDigit % 2 != 0 && isFemale)) {
            throw new WebServiceException("Gender does not match ID number.");
        }

        // Weight validation - SOAP fault handing
        if (weight <= 0 || weight > 500) {
            throw new WebServiceException("Weight must be between 0.1 kg and 500 kg.");
        }

        // Height validation - SOAP fault handing
        if (height < 30 || height > 300) {
            throw new WebServiceException("Height must be between 30 cm and 300 cm.");
        }

        // Return string 
        return name + "|" + idNumber + "|" + gender + "|" + weight + "|" + height + "|" + met + "|" + duration;
    }

    /**
     * Web service operation - calculate user's age
     * KHOR HWEE SHIAN
     * @param idNumber
     * @return 
     */
    @WebMethod(operationName = "calculateAge")
    public int calculateAge(
            @WebParam(name = "idNumber") String idNumber) {
        
        // valid - String cleanedId = idNumber.replace("-", "");

        String birthDatePart = idNumber.substring(0, 6); // YYMMDD - 010805
        int year = Integer.parseInt(birthDatePart.substring(0, 2)); // 01
        int month = Integer.parseInt(birthDatePart.substring(2, 4)); // 08
        int day = Integer.parseInt(birthDatePart.substring(4, 6)); // 05

        int currentYear = java.time.LocalDate.now().getYear(); // get current year - 2025
            
        int fullYear;
        if (year <= (currentYear % 100)) {
            fullYear = 2000 + year; // 23 → 2023
        } else {
            fullYear = 1900 + year; // 85 → 1985
        }
            
        // Date validation - SOAP fault handing
        try {
            java.time.LocalDate birthDate = java.time.LocalDate.of(fullYear, month, day);
            java.time.LocalDate today = java.time.LocalDate.now();
            java.time.Period period = java.time.Period.between(birthDate, today);
            int age = period.getYears();
            return age;
            } catch (java.time.DateTimeException e) {
                throw new WebServiceException("Invalid day in ID number. Please check the date format.");
            }
        }
    
    /**
     * Web service operation module 1 - Body Mass Index (BMI) Calculator
     * ARUN KUMAR A/L MANIMARAN
     * @param weight in kilograms
     * @param height in centimeters
     * @return BMI value and category
     * is a measures of body fat based on height and weight that applies to adult men and women.
     */
    @WebMethod(operationName = "calculateBMI")
    public String calculateBMI(
            @WebParam(name = "weight") double weight, 
            @WebParam(name = "height") double height) {

        double heightInMeters = height / 100.0; // convert cm to meters
        double bmi = weight / (heightInMeters * heightInMeters);
        String category;
        
        // BMI validation - SOAP fault handing
        if (bmi < 10 || bmi > 60) {
            throw new WebServiceException("BMI result out of expected range (10-60). Please check your inputs.");
        }
        
        if (bmi < 18.5) 
            category = "Underweight";
        else if (bmi < 24.9)
            category = "Normal weight";
        else if (bmi < 29.9)
            category = "Overweight";
        else
            category = "Obesity";
        
        return String.format("%.2f (%s)", bmi, category);
        
    }
    
    /**
     * Web service operation module 2 - Body Fat Percentage Calculator
     * SITI NUR ESYA BINTI BUWANG
     * @param age
     * @param gender
     * @param bmi
     * @return 
     * the proportion of your body weight that is made up of fat, compared to muscle and bone.
     */
    @WebMethod(operationName = "calculateBFP")
    public String calculateBFP(
            @WebParam(name = "age") int age,
            @WebParam(name = "gender") String gender,
            @WebParam(name = "bmi") double bmi) {

        int genderFactor = gender.equalsIgnoreCase("male") ? 1 : 0;

        double bfp = (1.39 * bmi) + (0.16 * age) - (10.34 * genderFactor) - 9;
        bfp = Math.round(bfp * 100.0) / 100.0;  // Round to 2 decimals
        
        if (bfp < 2 || bfp > 50) {
            throw new WebServiceException("BFP value out of reasonable range (2%–50%). Please check your inputs.");
        }
        
        // Determine category based on gender and bfp
        String category;
        if (gender.equalsIgnoreCase("male")) {
            if (bfp < 8) 
                category = "Underfat";
            else if (bfp <= 20) 
                category = "Healthy";
            else if (bfp <= 25) 
                category = "Overfat";
            else 
                category = "Obese";
        } else {
            // Female categories
            if (bfp < 21) 
                category = "Underfat";
            else if (bfp <= 32) 
                category = "Healthy";
            else if (bfp <= 38) 
                category = "Overfat";
            else 
                category = "Obese";
        }

        return String.format("%.2f (%s)", bfp, category);
    }
    
    /**
     * Web service operation module 3 - Calories Burn Rate Calculator
     * YUVANESH A/L SHANMUGAM
     * @param weight
     * @param duration
     * @param met
     * @return 
     * the speed at which your body uses energy.
     */
        @WebMethod(operationName = "calculateCBR")
        public String calculateCBR(
                @WebParam(name = "weight") double weight,
                @WebParam(name = "duration") double duration,
                @WebParam(name = "met") double met) {

            // Calories Burned formula
            double caloriesPerMinute = (met * weight * 3.5) / 200;
            double totalCalories = caloriesPerMinute * duration;

            // Return a formatted result
            return String.format("%.2f kcal", totalCalories);
        }

    /**
     * Web service operation module 4 - Basal Metabolic Rate (BMR) Calculator
     * VIVETHAN A/L MURUGAN 
     * @param gender
     * @param weight
     * @param height
     * @param age
     * @return 
     * the number of calories your body needs to accomplish its most basic (basal) life-sustaining function.
     */
        @WebMethod(operationName = "calculateBMR")
    public String calculateBMR(
            @WebParam(name = "gender") String gender, 
            @WebParam(name = "weight") double weight, 
            @WebParam(name = "height") double height, 
            @WebParam(name = "age") int age) {
        
        // Variable to hold the BMR result
        double bmr = 0;
        
        // BMR calculation logic based on gender
        if (gender.equalsIgnoreCase("male")) {
            // Harris-Benedict equation for men
            bmr = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
        } else if (gender.equalsIgnoreCase("female")) {
            // Harris-Benedict equation for women
            bmr = 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age);
        } else {
            return "Invalid gender input. Please provide 'M' for male or 'F' for female.";
        }
        
        // Return the calculated BMR value
        return "Your BMR is: " + bmr + " calories/day";
    }

    /**
     * Web service operation module 5  - Lean Body Mass (LBM)
     * KUGAAN RAAJ A/L GOBALAN
     * @param weight
     * @param height
     * @param gender
     * @return 
     * the weight of your body excluding fat tissue.
     */
          @WebMethod(operationName = "calculateLBM")
      public String calculateLBM(
        @WebParam(name = "weight") double weight,
        @WebParam(name = "height") double height,
        @WebParam(name = "gender") String gender) {

        if (weight <= 0 || weight > 635)
            return "Invalid weight value";
        if (height <= 0 || height > 272)
            return "Invalid height value";
        if (!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female"))
            return "Invalid gender value";

        double lbm;
        if (gender.equalsIgnoreCase("male")) {
            lbm = 0.407 * weight + 0.267 * height - 19.2;
        } else {
            lbm = 0.252 * weight + 0.473 * height - 48.3;
        }

        double fatMass = weight - lbm;

        return String.format("LBM: %.2f kg, Fat Mass: %.2f kg", lbm, fatMass);
    }

}