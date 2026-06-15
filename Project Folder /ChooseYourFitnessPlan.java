import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


/* This is the Main Game Engine
Which handles the console, user choices, and updates the data*/

public class ChooseYourFitnessPlan{
    private static Scanner inputReader = new Scanner(System.in);
    private static ArrayList<WorkoutPlan> databaseCatalog = new ArrayList <>();
    private static User profileHero = null;
    
    public static void main(String[] args){
        loadStarterWorkouts();
        System.out.println("=================================================");
        System.out.println("   🎮 CHOOSE YOUR FITNESS PLAN: RPG EDITION 🎮   ");
        System.out.println("=================================================");
        
        setupNewUser();

        boolean systemIsRunning = true;
        while (systemIsRunning) {
            printDashboardMenu();
            int selectedOption = readIntegerFromUser(1, 7); 
            
            // Clearing Console: 
            // https://stackoverflow.com/questions/10241217/how-to-clear-console-in-java
            // Handle execution selection blocks
            if (selectedOption == 1) {
                // Clears Console
                System.out.print("\033[H\033[2J");
                System.out.flush();
                browseAndExecuteRoutines();
            } 
            else if (selectedOption == 2) {
                // Clears Console
                System.out.print("\033[H\033[2J");
                 System.out.flush();
                forgeCustomRoutine();
            } 
            else if (selectedOption == 3) {
                // Clears Console
                System.out.print("\033[H\033[2J");
                System.out.flush();
                displayExerciseGuideList(); // Updated Option 3 to present lists
            } 
            else if (selectedOption == 4) {
                // Clears Console
                System.out.print("\033[H\033[2J");
                System.out.flush();
                viewProfileStats();
            } 
            else if (selectedOption == 5) {
                // Clears Console
                System.out.print("\033[H\033[2J");
                System.out.flush();
                profileHero.displayHistoryLog();
            } 
            else if (selectedOption == 6) {
                System.out.println("\n👋 Logging off system. Fantastic session today, " + profileHero.getName() + "!");
                systemIsRunning = false; 
            } 
            else if (selectedOption == 7) {
                // Clears Console
                System.out.print("\033[H\033[2J");
                System.out.flush();
                showHowToPlayWalkthrough(); 
            }
            else {
                System.out.println("Error: Unknown action route selected.");
            }
        }
        inputReader.close();
    }
    
    // Has a set of exercises (A catalog of them, a new one may be added when custom maded)
    private static void loadStarterWorkouts() {
        WorkoutPlan cardioShred = new WorkoutPlan("Fast Cardio Shred");
        cardioShred.addExercise(new CardioExercise("Treadmill Running Sprints", 15, 12.0));
        cardioShred.addExercise(new CardioExercise("Speed Rope Jumping", 10, 10.0));
        databaseCatalog.add(cardioShred);

        WorkoutPlan weightLifting = new WorkoutPlan("Heavy Weight Core Build");
        weightLifting.addExercise(new StrengthTraining("Barbell Deadlifts", 20, 4, 6, 100.0));
        databaseCatalog.add(weightLifting);
    }

    // Asking the user for data to enhance their workouts
    private static void setupNewUser() {
        System.out.println("\n✨ CREATE YOUR FITNESS HERO PROFILE");
        System.out.print("Enter your character name: ");
        String chosenName = inputReader.nextLine().trim();
        while (chosenName.isEmpty()) {
            System.out.print("Name choice cannot be empty! Enter name: ");
            chosenName = inputReader.nextLine().trim();
        }

        System.out.print("Enter your weight in kilograms (e.g. 74.2): ");
        double userWeight = readDoubleFromUser(30.0, 250.0);

        System.out.print("Enter your height in meters (e.g. 1.75): ");
        double userHeight = readDoubleFromUser(1.0, 2.5);

        profileHero = new User(chosenName, userWeight, userHeight);
        System.out.println("\n🎉 Profile synced up successfully! Welcome to the game simulation.");
        profileHero.earnXP(100); 
    }

    // Main Menu (Dashboard)
    private static void printDashboardMenu() {
        System.out.println("\n🕹️ =============== HERO DASHBOARD MENU =============== 🕹️");
        System.out.println(" Character Rank: " + profileHero.getFitnessRankTitle() + " | Level: " + profileHero.getFitnessLevel());
        System.out.println(" Continuous Workout Streak: " + profileHero.getActiveStreak() + " 🔥");
        System.out.println("---------------------------------------------------------");
        System.out.println("1) 🚀 Browse and Complete Preset Workouts");
        System.out.println("2) 🛠️ Create a Brand New Custom Plan");
        System.out.println("3) 🔍 View Available Exercise Reference Guide"); // Updated menu text
        System.out.println("4) 📊 Check Personal BMI and Fitness Stats");
        System.out.println("5) 📜 View Completed Training Logs");
        System.out.println("6) 🌌 Exit Simulation Suite");
        System.out.println("7) 📖 How to Play & Create a Fitness Plan"); 
        System.out.print("Select an option number [1-7]: ");
    }

    // Searching Up Workout Plans 
    private static void browseAndExecuteRoutines() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\n📖 AVAILABLE PLANS IN CATALOG DATABASE:");
        for (int i = 0; i < databaseCatalog.size(); i++) {
            long calorieBurn = Math.round(databaseCatalog.get(i).calculateTotalCalories(profileHero.getWeightKg()));
            System.out.println("  [" + (i + 1) + "] " + databaseCatalog.get(i).getPlanName() + " (Total: " + calorieBurn + " kcal)");
        }
        int returnHomeOption = databaseCatalog.size() + 1;
        System.out.println("  [" + returnHomeOption + "] ↩ Return to Dashboard Menu");
        System.out.print("Choose an option number: ");
        
        int userChoice = readIntegerFromUser(1, returnHomeOption);
        if (userChoice == returnHomeOption) {
            return;
        }

        WorkoutPlan chosenPlan = databaseCatalog.get(userChoice - 1);
        chosenPlan.displayPlanDetails(profileHero.getWeightKg());

        System.out.print("\nDo you want to run and log this workout now? (1 = Yes / 2 = No): ");
        int confirmation = readIntegerFromUser(1, 2);
        if (confirmation == 1) {
            profileHero.logWorkout(chosenPlan);
        }
    }

    // Create your custom rountine/workout
    private static void forgeCustomRoutine() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\n🛠️ FORGE A CUSTOM WORKOUT DESIGN");
        System.out.print("Give your custom workout routine a name: ");
        String customName = inputReader.nextLine().trim();
        while (customName.isEmpty()) {
            System.out.print("Name can't be blank! Try again: ");
            customName = inputReader.nextLine().trim();
        }

        WorkoutPlan customPlan = new WorkoutPlan(customName);
        boolean keepsAdding = true;

        while (keepsAdding) {
            System.out.println("\nAdd Exercise Item Block:");
            System.out.println(" 1 - Append Cardio Exercise");
            System.out.println(" 2 - Append Strength Exercise");
            System.out.println(" 3 - Finish and Save Custom Plan");
            System.out.print("Choose an option number: ");
            int typeChoice = readIntegerFromUser(1, 3);

            if (typeChoice == 3) {
                if (customPlan.getExercises().isEmpty()) {
                    System.out.println("⚠️ You cannot save an empty plan. Please add an exercise first!");
                    continue;
                }
                keepsAdding = false;
                break;
            }

            System.out.print("Enter exercise name (e.g. Pullups): ");
            String actionName = inputReader.nextLine().trim();
            while (actionName.isEmpty()) {
                System.out.print("Name field cannot be blank: ");
                actionName = inputReader.nextLine().trim();
            }

            System.out.print("Enter exercise duration (in minutes): ");
            int dynamicTime = readIntegerFromUser(1, 240);

            if (typeChoice == 1) {
                System.out.print("Enter intensity speed level on a scale of 1.0 to 25.0: ");
                double cardioIntensity = readDoubleFromUser(1.0, 25.0);
                customPlan.addExercise(new CardioExercise(actionName, dynamicTime, cardioIntensity));
            } else if (typeChoice == 2) {
                System.out.print("Enter number of sets completed: ");
                int setAmount = readIntegerFromUser(1, 20);
                System.out.print("Enter number of repetitions per set: ");
                int repAmount = readIntegerFromUser(1, 100);
                System.out.print("Enter weight mass load used (in kilograms): ");
                double loadMass = readDoubleFromUser(0.0, 500.0);
                customPlan.addExercise(new StrengthTraining(actionName, dynamicTime, setAmount, repAmount, loadMass));
            }
            System.out.println("✓ Exercise segment integrated.");
        }

        databaseCatalog.add(customPlan);
        System.out.println("\n💾 Plan successfully added to the catalog system folder!");
        profileHero.logWorkout(customPlan);
    }

    // Giving the user instructions on how this roleplay game works
    private static void displayExerciseGuideList() {
        System.out.println("\n📖 ================= EXERCISE MOVEMENT GUIDE REFERENCE ================= 📖");
        System.out.println("Browse single movements found in our catalog routines to inspire your custom builds:\n");
        
        int movementCounter = 1;
        boolean recordsExist = false;

        for (int i = 0; i < databaseCatalog.size(); i++) {
            WorkoutPlan currentPlan = databaseCatalog.get(i);
            ArrayList<Exercise> internalList = currentPlan.getExercises();
            
            for (int j = 0; j < internalList.size(); j++) {
                Exercise movement = internalList.get(j);
                System.out.println("  📍 Movement #" + movementCounter + " [" + movement.getExerciseType() + "]");
                System.out.println("     Name       : " + movement.getName());
                System.out.println("     Base Time  : " + movement.getDurationInMinutes() + " mins");
                System.out.println("     Found In   : Routine -> \"" + currentPlan.getPlanName() + "\"");
                System.out.println("     ---------------------------------------------------");
                movementCounter++;
                recordsExist = true;
            }
        }

        if (!recordsExist) {
            System.out.println("⚠️ Database Catalog is currently empty! Create custom plans to populate your guide.");
        }
        System.out.println("=========================================================================");
    }

    private static void viewProfileStats() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\n📊 ================= CORE PROFILE HEALTH ATTRIBUTES ================= 📊");
        System.out.println(" User Hero Callsign  : " + profileHero.getName());
        System.out.println(" Registered Weight   : " + profileHero.getWeightKg() + " kg");
        System.out.printf(" Evaluated BMI Score : %.2f\n", profileHero.calculateBMI());
        System.out.println(" Physical Inferred Status  : " + profileHero.getBMICategory());
        System.out.println("=====================================================================");
    }

    // Printed Console (How To Play)
    private static void showHowToPlayWalkthrough() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\n📖 ================= HOW TO PLAY & DESIGN FITNESS PLANS ================= 📖");
        System.out.println("Welcome to the Fitness Tracker RPG! Here is your quick tutorial on how to use the game:");
        
        System.out.println("\n🌟 STEP 1: UNDERSTAND YOUR OBJECTIVE");
        System.out.println("   - Your goal is to earn Experience Points (XP), increase your Fitness Level,");
        System.out.println("     and unlock cool level titles like 'Champion' or 'Ultimate Fitness Champion'.");
        System.out.println("   - You earn XP every time you complete a fitness routine plan!");
        
        System.out.println("\n🛠️ STEP 2: FORGING A CUSTOM ROUTINE (SAMPLE GUIDE)");
        System.out.println("   - To make your own plan, select option 2 from the main menu.");
        System.out.println("   - Give your routine a name (Example: 'My Morning Power Session').");
        System.out.println("   - Now, choose what type of custom actions to add inside your routine playlist:");
        System.out.println("     * Choose 1 (Cardio Segments): Type 'Running Sprints', 15 minutes, intensity 12.0.");
        System.out.println("     * Choose 2 (Strength Resistance Blocks): Type 'Pushups', 10 minutes, 3 sets, 15 reps, 0kg.");
        System.out.println("   - Choose 3 to lock it in! The game automatically saves your routine and logs it.");
        
        System.out.println("\n🚀 STEP 3: RUNNING PRESET WORKOUTS & INCREASING STREAKS");
        System.out.println("   - Select Option 1 to browse built-in plans or check out your newly forged custom creations.");
        System.out.println("   - If you run them back-to-back without closing the game, your continuous workout streak grows!");
        System.out.println("   - Higher streaks apply multiplier bonuses, giving you massive amounts of bonus XP points.");
        
        System.out.println("\n🔍 STEP 4: TRACKING LOGS & SEARCHING STUFF");
        System.out.println("   - Use Option 3 to see an organized list of all reference exercises inside the game database.");
        System.out.println("   - Use Option 5 to read through your chronological history logs to see total cumulative burnt calories.");
        System.out.println("=========================================================================================");
    }

    // Parameters and Scopes (Limit)
    private static int readIntegerFromUser(int floor, int ceiling) {
        while (true) {
            if (inputReader.hasNextInt()) {
                int validatedNumber = inputReader.nextInt();
                inputReader.nextLine();
                if (validatedNumber >= floor && validatedNumber <= ceiling) {
                    return validatedNumber;
                }
                System.out.print("Selection out of bounds. Pick a number between [" + floor + " and " + ceiling + "]: ");
            } else {
                System.out.print("Type format error! Please pass standard whole numbers: ");
                inputReader.nextLine();
            }
        }
    }

    private static double readDoubleFromUser(double floor, double ceiling) {
        while (true) {
            if (inputReader.hasNextDouble()) {
                double validatedNumber = inputReader.nextDouble();
                inputReader.nextLine();
                if (validatedNumber >= floor && validatedNumber <= ceiling) {
                    return validatedNumber;
                }
                System.out.print("Value out of scope bounds parameter. Re-enter number between [" + floor + " and " + ceiling + "]: ");
            } else {
                System.out.print("Formatting layout error! Please pass numbers or decimal values: ");
                inputReader.nextLine();
            }
        }
    }
}
