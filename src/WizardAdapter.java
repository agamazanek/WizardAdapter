import java.util.concurrent.ThreadLocalRandom;

public class WizardAdapter implements Fighter {
    private Wizard wizard = new Wizard();
    @Override
    public void attack() {
        System.out.println("Attack:");
        if(System.nanoTime()%2 == 0) {
            wizard.portal();
        } else {
            wizard.castDestructionSpell();
        };
    }

    @Override
    public void defend() {
        System.out.println("Defend:");
        if(System.nanoTime()%3 == 0) {
            wizard.castProtectionSpell();
        } else if (System.nanoTime()%2 == 0) {
            wizard.pauseTime();
        } else {
            wizard.shield();
        };
    }

    @Override
    public void escape() {
        System.out.println("Escape:");
        int number = ThreadLocalRandom.current().nextInt(1, 3);
        if(number == 2) {
            wizard.justRun();
        } else {
            wizard.portal();
        };

    }
}
