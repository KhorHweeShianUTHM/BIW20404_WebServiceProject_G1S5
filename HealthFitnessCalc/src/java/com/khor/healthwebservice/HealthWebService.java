package com.khor.healthwebservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.WebServiceException;

@WebService(serviceName = "HealthWebService")
public class HealthWebService {
    
    /**
     * Web service operation - get user's information
     * KHOR HWEE SHIAN
     * @param name
     * @param idNumber
     * @param gender
     * @return 
     */
    @WebMethod(operationName = "getUserInfo")
    public String getUserInfo(
            @WebParam(name = "name") String name, 
            @WebParam(name = "idNumber") String idNumber, 
            @WebParam(name = "gender") String gender) {
        
        // name validate that the name contains only letters (A-Z, a-z) and spaces
        if (!name.matches("[A-Za-z\\s]+")) {
            throw new WebServiceException("Name must contain only letters and spaces. \n");
        }

        // id validate that the ID number is exactly 12 digits long
        if (!idNumber.matches("\\d{12}")) {
            throw new WebServiceException("ID Number must contain exactly 12 digits. \n");
        }
        
        // extract the last digit of the ID number
        int lastDigit = Character.getNumericValue(idNumber.charAt(11)); // count last digit
        boolean isMale = gender.equalsIgnoreCase("Male");
        boolean isFemale = gender.equalsIgnoreCase("Female");
        
        // gender validate that the gender matches the ID number: even last digit = female, odd = male
        if ((lastDigit % 2 == 0 && isMale) || (lastDigit % 2 != 0 && isFemale)) {
            throw new WebServiceException("Gender does not match ID number. \n");
        }

        // Return string 
        return name + "|" + idNumber + "|" + gender;
    }

    /**
     * Web service operation - calculate user's age
     * KHOR HWEE SHIAN
     * @param idNumber
     * @return 
     */
    @WebMethod(operationName = "calcAge")
    public int calcAge(
            @WebParam(name = "idNumber") String idNumber) {

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
            
        // calculate the age from the id's birth date
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
     * @param weight
     * @param height
     * @return
     */
    @WebMethod(operationName = "calcBMIValue")
    public double calcBMIValue(
            @WebParam(name = "weight") double weight, 
            @WebParam(name = "height") double height) {
        
       // validate that the weight and height within a reasonable range
        if (weight <= 0 || weight > 500) {
            throw new WebServiceException("Weight must be between 0.1 kg and 500 kg.");
        }
        if (height < 30 || height > 300) {
            throw new WebServiceException("Height must be between 30 cm and 300 cm.");
        }
        
        double heightInMeters = height / 100.0; // convert cm to meters
        double bmi = weight / (heightInMeters * heightInMeters);
        
        // validate that the BMI value is within a reasonable range 
        if (bmi < 10 || bmi > 60) {
            throw new WebServiceException("BMI result out of expected range (10-60). Please check your inputs.");
        }
        
        return bmi;     
    }
    
    /**
     * Web service operation module 1.5 - Body Mass Index (BMI) Categories
     * ARUN KUMAR A/L MANIMARAN
     * @param bmi
     * @return
     */
    @WebMethod(operationName = "getBMICategories")
    public String getBMICategories(
            @WebParam(name = "bmi") double bmi) {
        
        String category;
        
        if (bmi < 18.5) 
            category = "Your Body Mass Index (BMI) value is in the Underweight category.\nConsider a balanced diet rich in healthy fats, proteins, and whole grains. Include strength-building exercises to improve muscle mass. Consult a nutritionist if needed.";
        else if (bmi < 24.9)
            category = "Your Body Mass Index (BMI) value is in the Normal weight category.\nMaintain a healthy lifestyle by eating nutritious meals and staying physically active. Regular check-ups and monitoring your health can help maintain your current weight.";
        else if (bmi < 29.9)
            category = "Your Body Mass Index (BMI) value is in the Overweight category.\nFocus on portion control, reduce processed food intake, and add regular exercise like brisk walking or cycling. Small changes can lead to sustainable weight loss.";
        else
            category = "Your Body Mass Index (BMI) value is in the Obesity category.\nConsider a comprehensive lifestyle change. Adopt a healthy, low-calorie diet, increase physical activity, and seek medical advice or support groups if necessary. Managing weight is important for long-term health.";
        return category;
    }
    
    /**
     * Web service operation module 2 - Body Fat Percentage Calculator
     * SITI NUR ESYA BINTI BUWANG
     * @param age
     * @param gender
     * @param bmi
     * @return 
     */
    @WebMethod(operationName = "calcBFPValue")
    public double calcBFPValue(
            @WebParam(name = "age") int age,
            @WebParam(name = "gender") String gender,
            @WebParam(name = "bmi") double bmi) {

        int genderFactor = gender.equalsIgnoreCase("male") ? 1 : 0;

        double bfp = (1.39 * bmi) + (0.16 * age) - (10.34 * genderFactor) - 9;
        bfp = Math.round(bfp * 100.0) / 100.0;  // Round to 2 decimals
        
        // validate that the BFP value is within a reasonable range 
        if (bfp < 2 || bfp > 50) {
            throw new WebServiceException("BFP value out of reasonable range (2%–50%). Please check your inputs.");
        }

        return bfp;
    }
    
    /**
     * Web service operation module 2.5 - Body Fat Percentage Categories
     * SITI NUR ESYA BINTI BUWANG
     * @param bfp
     * @param gender
     * @return 
     */
    @WebMethod(operationName = "getBFPCategories")
    public String getBFPCategories(
            @WebParam(name = "gender") String gender,
            @WebParam(name = "bfpValue") double bfp) {

        String category;
        if (gender.equalsIgnoreCase("male")) {
            // Male categories
            if (bfp < 8) 
                category = "Your Body Fat Percentage is in the Underfat category.\nConsider a nutrient-rich diet and muscle-building exercises to support healthy fat levels.";
            else if (bfp <= 20) 
                category = "Your Body Fat Percentage is in the Healthy category.\nMaintain a balanced diet and regular exercise to stay in the healthy range.";
            else if (bfp <= 25) 
                category = "Your Body Fat Percentage is in the Overfat category.\nReduce processed foods and include more physical activity to manage fat levels.";
            else 
                category = "Your Body Fat Percentage is in the Obese category.\nAdopt a healthy eating plan and regular exercise, seek medical guidance if needed.";
        } else {
            // Female categories
            if (bfp < 21) 
                category = "Your Body Fat Percentage is in the Underfat category.\nAdd healthy fats and proteins to your diet; strength training can help improve body composition.";
            else if (bfp <= 32) 
                category = "Your Body Fat Percentage is in the Healthy category.\nKeep up your balanced diet and regular exercise routine to maintain a healthy fat level.";
            else if (bfp <= 38) 
                category = "Your Body Fat Percentage is in the Overfat category.\nConsider reducing calorie intake and increasing physical activity for better fat management.";
            else 
                category = "Your Body Fat Percentage is in the Obese category.\nFocus on a healthy, balanced diet and regular exercise, consult a healthcare provider if needed.";
        }

        return category;
    }
    
    /**
     * Web service operation module 3 - Calories Burn Rate Calculator
     * YUVANESH A/L SHANMUGAM
     * @param weight
     * @param duration
     * @param met
     * @return 
     */
    @WebMethod(operationName = "calcCaloriesValue")
    public double calcCaloriesValue(
            @WebParam(name = "weight") double weight,
            @WebParam(name = "duration") double duration,
            @WebParam(name = "met") double met) {
        
        // validate that the weight within a reasonable range
        if (weight <= 0 || weight > 500) {
            throw new WebServiceException("Weight must be between 0.1 kg and 500 kg.");
        }
        
        // validate that the duration within reasonable range
        if (duration <= 0 || duration > 300) {
            throw new WebServiceException("Duration must be between 0.1 and 300 minutes.");
        } 
        
        // validate that the met within reasonable range
        if (met <= 0 || met > 20) {
            throw new WebServiceException("MET must be between 0.1 and 20.");
        }  
        
        double caloriesPerMinute = (met * weight * 3.5) / 200;
        double totalCalories = caloriesPerMinute * duration;

        return Math.round(totalCalories * 100.0) / 100.0; // Round to 2 decimals
    }
    
    /**
     * Web service operation module 3.5 - Calories Burn Rate Categories
     * YUVANESH A/L SHANMUGAM
     * @param caloriesBurned
     * @return 
     */
    @WebMethod(operationName = "getCaloriesCategories")
    public String getCaloriesCategories(
            @WebParam(name = "caloriesBurned") double caloriesBurned) {
        String category;

        if (caloriesBurned < 100) {
            category = "Your calories burned is in the Low category.\nTry to be more active, even light walks or stretching can help burn more calories.";
        } else if (caloriesBurned < 300) {
            category = "Your calories burned is in the Moderate category.\nGood effort! You can increase intensity or duration for greater benefits.";
        } else if (caloriesBurned < 500) {
            category = "Your calories burned is in the High category.\nGreat job! Maintain this activity level for improved fitness and health.";
        } else {
            category = "Your calories burned is in the Very High category.\nExcellent work! Be sure to hydrate well and fuel your body with balanced meals.";
        }

        return category;
    }
    
    /**
     * Web service operation module 4 - Basal Metabolic Rate (BMR) Calculator
     * VIVETHAN A/L MURUGAN 
     * @param gender
     * @param weight
     * @param height
     * @param age
     * @return 
     */
    @WebMethod(operationName = "calcBMRValue")
    public double calcBMRValue(
            @WebParam(name = "gender") String gender,
            @WebParam(name = "weight") double weight,
            @WebParam(name = "height") double height,
            @WebParam(name = "age") int age) {
        
        // validate that the weight and height within a reasonable range
        if (weight <= 0 || weight > 500) {
            throw new WebServiceException("Weight must be between 0.1 kg and 500 kg.");
        }
        if (height < 30 || height > 300) {
            throw new WebServiceException("Height must be between 30 cm and 300 cm.");
        }
        
        double bmr;

        if (gender.equalsIgnoreCase("male")) {
            bmr = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
        } else if (gender.equalsIgnoreCase("female")) {
            bmr = 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age);
        } else {
            throw new WebServiceException("Invalid gender input. Please provide 'male' or 'female'.");
        }

        return Math.round(bmr * 100.0) / 100.0; // Round to 2 decimals
    }
    
    /**
     * Web service operation module 4.5 - Basal Metabolic Rate (BMR) Categories
     * VIVETHAN A/L MURUGAN 
     * @param bmrValue
     * @return 
     */
    @WebMethod(operationName = "getBMRCategories")
    public String getBMRCategories(
            @WebParam(name = "bmrValue") double bmrValue) {
        String category;

        if (bmrValue < 1200) {
            category = "Your Basal Metabolic Rate (BMR) value is in the Low category.\nConsider a well-balanced diet with healthy calories, consult a nutritionist if necessary.";
        } else if (bmrValue <= 1800) {
            category = "Your Basal Metabolic Rate (BMR) value is in the Average category.\nMaintain a balanced lifestyle with proper diet and regular exercise.";
        } else if (bmrValue <= 2200) {
            category = "Your Basal Metabolic Rate (BMR) value is in the High category.\nGreat metabolism! Ensure adequate calorie intake and stay active.";
        } else {
            category = "Your Basal Metabolic Rate (BMR) value is in the Very High category.\nEVery active metabolism, fuel your body well with nutritious meals and stay hydrated.";
        }

        return category;
    }

    /**
     * Web service operation module 5  - Lean Body Mass (LBM) Calculator
     * KUGAAN RAAJ A/L GOBALAN
     * @param weight
     * @param height
     * @param gender
     * @return 
     */
    @WebMethod(operationName = "calcLBMValue")
    public double calcLBMValue(
            @WebParam(name = "weight") double weight,
            @WebParam(name = "height") double height,
            @WebParam(name = "gender") String gender) {
        
        // validate that the weight and height within a reasonable range
        if (weight <= 0 || weight > 500)
            throw new WebServiceException("Invalid weight value.");
        if (height <= 0 || height > 300)
            throw new WebServiceException("Invalid height value.");
        if (!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female"))
            throw new WebServiceException("Invalid gender value. Use 'male' or 'female'.");

        double lbm;
        if (gender.equalsIgnoreCase("male")) {
            lbm = 0.407 * weight + 0.267 * height - 19.2;
        } else {
            lbm = 0.252 * weight + 0.473 * height - 48.3;
        }

        return Math.round(lbm * 100.0) / 100.0; // Correct: return LBM rounded
    }
    
    /**
     * Web service operation module 5.5  - Lean Body Mass (LBM) Categories
     * KUGAAN RAAJ A/L GOBALAN
     * @param lbm
     * @param weight
     * @return 
     * the weight of your body excluding fat tissue.
     */
    @WebMethod(operationName = "getLBMCategories")
    public String getLBMCategories(
            @WebParam(name = "lbm") double lbm,
            @WebParam(name = "weight") double weight) {

        double lbmPercent = (lbm / weight) * 100;

        if (lbmPercent < 60) {
            return "Your Lean Body Mass (LBM) value is in the Low category.\nFocus on strength training and a protein-rich diet to increase muscle mass.";
        } else if (lbmPercent <= 75) {
            return "Your Lean Body Mass (LBM) value is in the Normal category.\nMaintain your current lifestyle with balanced nutrition and regular exercise.";
        } else {
            return "Your Lean Body Mass (LBM) value is in the High category.\nGreat metabolism! Ensure adequate calorie intake and stay active.";
        }
    }

}