// This class handles all the Cardio exercises
// It is a sub-class that copies from the main Exercise class

public class CardioExercise extends Exercise {
    private double intensityFactor; // Measures how hard the cardio activity is

    public CardioExercise(String name, int durationInMinutes, double intensityFactor) {
        // super() passes the name and time back up to the parent blueprint
        super(name, durationInMinutes);
        this.intensityFactor = intensityFactor;
    }

    // This calculates how many calories you burn doing cardio
    @Override
    public double calculateCaloriesBurned(double userWeightKg) {
        // Cardio Formula: (Intensity * 3.5 * weight / 200) * total minutes
        return (intensityFactor * 3.5 * userWeightKg / 200.0) * getDurationInMinutes();
    }

    @Override
    public String getExerciseType() {
        return "Cardio";
    }

    @Override
    public String toString() {
        return super.toString() + " [⚡ Cardio | Difficulty Level: " + intensityFactor + "]";
    }
}
