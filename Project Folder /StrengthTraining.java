// This class handles lifting weights (Strength Training)
// A sub-class that copies from the parent Exercise class

public class StrengthTraining extends Exercise {
    private int sets;
    private int reps;
    private double weightKg;
    
    public StrengthTraining(String name, int durationInMinutes, int sets, int reps, double weightKg) {
    // Transfers the name and time into the parent class to show in console
    super(name, durationInMinutes);
        this.sets = sets;
        this.reps = reps;
        this.weightKg = weightKg;
    }
    
    // Calculates how many calories are burned from weights
     @Override
    public double calculateCaloriesBurned(double userWeightKg) {
        double baseRate = 5.0; 
        double timeFactor = (baseRate * 3.5 * userWeightKg / 200.0) * getDurationInMinutes();
        
        // Bonus Points for lifting more heavier weights
        double totalWeightLiftedBonus = (sets * reps * weightKg) * 0.015; 
        
        return timeFactor + totalWeightLiftedBonus;
    }
    
    // Exercise Type:
        @Override
    public String getExerciseType() {
        return "Strength";
    }

    @Override
    public String toString() {
        return super.toString() + " [💪 Strength | " + sets + " sets x " + reps + " reps at " + weightKg + "kg]";
    }
}
