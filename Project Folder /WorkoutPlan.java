/* This class acts like a fitness platlist where it
holds a list of exercises together under one custom name */

import java.util.ArrayList;

public class WorkoutPlan{
    private String planName;
    private ArrayList<Exercise> exerciseList;
    // The list "exerciseList" stores all the varieties of exercises
    
    public WorkoutPlan(String planName){
        this.planName = planName;
        this.exerciseList = new ArrayList<>(); // Creates an empty list
    }
    
    public String getPlanName(){
        return planName;
    }
    
    // Adds a new exercise to the Playlist Folder
    public void addExercise(Exercise exercise){
        exerciseList.add(exercise);
    }
    
    // This allows the other exercises to read the current exercises
    public ArrayList<Exercise> getExercises(){
        return exerciseList;
    }
    
    // This loops through the list and adds up the calories into one single exercise
    public double calculateTotalCalories(double userWeightKg){
        double grandTotal = 0;
        for (Exercise singleExercise : exerciseList){
            grandTotal = grandTotal + singleExercise.calculateCaloriesBurned(userWeightKg);
        }
        return grandTotal;
    }
    
    // This prints out all the details of the workout plan neatly
    public void displayPlanDetails(double userWeightKg) {
        System.out.println("\n------------------------------------------------");
        System.out.println("📋 WORKOUT PLAN DETAILS: " + planName.toUpperCase());
        System.out.println("------------------------------------------------");
        
        if (exerciseList.isEmpty()) {
            System.out.println("⚠️ This plan is currently empty! No movements inside.");
            return;
        }
        
        // Loop through the list to print every exercise line by line
        for (int i = 0; i < exerciseList.size(); i++) {
            Exercise singleExercise = exerciseList.get(i);
            long roundedCalories = Math.round(singleExercise.calculateCaloriesBurned(userWeightKg));
            System.out.println(" 👉 " + (i + 1) + ". " + singleExercise.toString() + " | Est. Burn: " + roundedCalories + " kcal");
        }
    }
}
