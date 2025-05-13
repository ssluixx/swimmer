public class Butterfly extends Swimmer {
    @Override
    public void giveRecommendation() {
        System.out.println("Butterfly recommendations:");

        if (goal.equalsIgnoreCase("speed")) {
            System.out.println("- Explosive dolphin kicks and strong entry.");
        }
        if (goal.equalsIgnoreCase("endurance")) {
            System.out.println("- Build aerobic base with short rest intervals.");
        }
        if (goal.equalsIgnoreCase("technique")) {
            System.out.println("- Improve body undulation and timing.");
        }

        if (time > 55) {
            System.out.println("- Focus on efficient breathing and recovery.");
        } else if (time > 45) {
            System.out.println("- Improve arm entry and maintain rhythm.");
        } else {
            System.out.println("- Powerful and smooth technique!");
        }

        compareToTarget();
    }
}
