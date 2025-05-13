public class Breaststroke extends Swimmer {
    @Override
    public void giveRecommendation() {
        System.out.println("Breaststroke recommendations:");

        if (goal.equalsIgnoreCase("speed")) {
            System.out.println("- Improve arm pull speed and minimize resistance.");
        }
        if (goal.equalsIgnoreCase("endurance")) {
            System.out.println("- Train longer sets with smooth glides.");
        }
        if (goal.equalsIgnoreCase("technique")) {
            System.out.println("- Focus on timing between arm pull and kick.");
        }

        if (time > 55) {
            System.out.println("- Work on streamline and leg propulsion.");
        } else if (time > 45) {
            System.out.println("- Refine kick and keep a narrow pull.");
        } else {
            System.out.println("- Excellent rhythm and coordination!");
        }

        compareToTarget();
    }
}