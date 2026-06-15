import java.util.ArrayList;

// This class is storage for the player's information
/* This includes stats, profile, and data (Workout Logs) 
It calculates health values like BMI and keeps track of the players
level and experience points (XP).
*/
public class User {
    private String name;
    private double weightKg;
    private double heightMeters;
    private int currentXP; // Level points
    private int activeStreak; // Count of workouts completed in a row
    private ArrayList<WorkoutPlan> workoutHistory; // A log book of past workouts
    
    public User(String name, double weightKg, double heightMeters) {
        this.name = name;
        this.weightKg = weightKg;
        this.heightMeters = heightMeters;
        this.currentXP = 0;
        this.activeStreak = 0;
        this.workoutHistory = new ArrayList<>();
    }
    
    public String getName(){
        return name;
    }
    
    public double getWeightKg(){
        return weightKg;
    }
    
    public int getActiveStreak(){
        return activeStreak;
    }
    
    // Math formula that calculates the users XP by examining user's current level
    public int getFitnessLevel() {
    if (currentXP < 100) {
        return 1;
    }
     return (int) (1 + Math.floor(0.2 * Math.sqrt(currentXP)));
    }
    
    // Title (Ranking For Each Level)
     public String getFitnessRankTitle() {
        int level = getFitnessLevel();
        if (level >= 1 && level < 5){
             return "Newbie 💫";
        }
        if (level >= 5 && level < 10){
            return "Starter 👟";
        }
        if (level >= 10 && level < 25){
            return "Gym Trainee 🏋️";
        } 
        if (level >= 25 && level < 50){
            return "Intermediate 🏋️";
        }
        if (level >= 50 && level < 100){
            return "Althete 💪️";
        }
        if (level >= 100 && level < 200){
            return "Althete Pro 💪💫️";
        }
        if (level >= 200 && level < 500){
            return "Experienced Althete 💪🏋💫️";
        }
        if (level >= 500 && level < 1000){
            return "💪 Champion⚡️";
        }
        if (level >= 1000 && level < 1500){
            return "❤️ Fitness Lover ❤️ ";
        }
        else {
            return "👑 Ultimate Fitness Champion 👑";
        }
    }
    
    // Standard metric Body Mass Index formula
    public double calculateBMI() {
        return weightKg / Math.pow(heightMeters, 2);
    }

    public String getBMICategory() {
        double bmiValue = calculateBMI();
        if (bmiValue < 18.5){
            return "Underweight Category";
        } 
        if (bmiValue < 25.0){
            return "Healthy and Balanced Weight";
        } 
        else{
            return "Heavy Powerweight Category";
        }
    }

    // Increases user XP points
    public void earnXP(int amount) {
        this.currentXP = this.currentXP + amount;
        System.out.println("⭐ +" + amount + " FITNESS XP EARNED! (Total: " + currentXP + " XP)");
    }
    
    // Saves a completed workout to the user's history log book
    public void logWorkout(WorkoutPlan plan) {
        workoutHistory.add(plan);
        activeStreak = activeStreak + 1; // Increase streak count
        
        // Give the player level points. You get extra points for having a high workout streak!
        int pointsAwarded = 50 + (activeStreak * 10);
        System.out.println("\n🔥 Awesome job! You completed the workout.");
        earnXP(pointsAwarded);
    }

    public void displayHistoryLog() {
        System.out.println("\n📜 === COMPLETED WORKOUT HISTORY LOG FOR " + name.toUpperCase() + " ===");
        if (workoutHistory.isEmpty()) {
            System.out.println(" 🚫 No history logs found. Complete a workout to fill your history book!");
            return;
        }
        for (int i = 0; i < workoutHistory.size(); i++) {
            WorkoutPlan plan = workoutHistory.get(i);
            long totalBurned = Math.round(plan.calculateTotalCalories(this.weightKg));
            System.out.println("  ✓ [" + (i + 1) + "] " + plan.getPlanName() + " ➔ Net Burned: " + totalBurned + " kcal");
        }
        System.out.println(" Active Training Streak: " + activeStreak + " sessions in a row!");
    }
}
