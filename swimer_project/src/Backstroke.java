public class Backstroke extends Swimmer {
    @Override
    public void giveRecommendation() {
        System.out.println("Backstroke recommendations:");

        if (goal.equalsIgnoreCase("speed")) {
            System.out.println("- Strengthen your leg drive and streamline turns.");
        }
        if (goal.equalsIgnoreCase("endurance")) {
            System.out.println("- Focus on rhythm and efficient arm recovery.");
        }
        if (goal.equalsIgnoreCase("technique")) {
            System.out.println("- Keep your head steady and improve rotation timing.");
        }

        if (time > 50) {
            System.out.println("- Improve underwater phase and wall push-off.");
        } else if (time > 40) {
            System.out.println("- Maintain consistent tempo and strong pull.");
        } else {
            System.out.println("- Great form and efficiency!");
        }

        compareToTarget();
    }
}