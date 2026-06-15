/* This is the main exercise class that measures how much
calories are burned and how long it takes for the workout 
to be completed by asking the user.
*/

public abstract class Exercise {
    private String name;
    private int durationInMinutes;
    
    // The constructor sets up the name and time when an exercise is created
    public Exercise(String name, int durationInMinutes) {
        this.name = name;
        this.durationInMinutes = durationInMinutes;
    }

    public String getName() {
        return name;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }
    
    // Placeholders: Every sub-class MUST create its own formula for these tasks
    public abstract double calculateCaloriesBurned(double userWeightKg);
    public abstract String getExerciseType();

    @Override
    public String toString() {
        return name + " (" + durationInMinutes + " minutes)";
    }
}
