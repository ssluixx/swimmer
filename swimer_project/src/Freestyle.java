public class Freestyle extends Swimmer {
    @Override
    public void giveRecommendation() {
        System.out.println("Freestyle recommendations:");

        if (goal.equalsIgnoreCase("speed")) {
            System.out.println("- Work on explosive starts and powerful kicks.");
        }
        if (goal.equalsIgnoreCase("endurance")) {
            System.out.println("- Practice interval training and steady pace swimming.");
        }
        if (goal.equalsIgnoreCase("technique")) {
            System.out.println("- Focus on hand entry and body roll.");
        }

        if (time > 45) {
            System.out.println("- Consider improving your streamline and reducing drag.");
        } else if (time > 35) {
            System.out.println("- You're on track, now optimize stroke frequency.");
        } else {
            System.out.println("- Excellent performance for your level.");
        }

        compareToTarget();
    }
}