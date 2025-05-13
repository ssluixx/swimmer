import java.util.Scanner;

public abstract class Swimmer {
    protected double time;
    protected int age;
    protected String gender;
    protected String level;
    protected String goal;

    public void inputData(String styleName) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your 50m time for " + styleName + " (in seconds): ");
        this.time = scanner.nextDouble();
        scanner.nextLine();  // clear newline

        System.out.print("Enter your age: ");
        this.age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your gender (M/F): ");
        this.gender = scanner.nextLine();

        System.out.print("Enter your level (beginner/amateur/professional): ");
        this.level = scanner.nextLine();

        System.out.print("Enter your training goal (speed/endurance/technique): ");
        this.goal = scanner.nextLine();
    }

    public abstract void giveRecommendation();

    public void estimateTargetTime() {
        double targetTime;
        if (level.equalsIgnoreCase("beginner")) targetTime = 60;
        else if (level.equalsIgnoreCase("amateur")) targetTime = 45;
        else targetTime = 35;

        System.out.printf("Your estimated target time for your level is %.1f seconds.%n", targetTime);
    }

    public void compareToTarget() {
        System.out.printf("Your current time: %.1f sec. ", time);
        estimateTargetTime();
    }
}