package State_Machine;

public class NPC {

    int hunger = 0;
    int fatigue = 0;

    final int HUNGER_THRESHOLD = 10;
    final int FATIGUE_THRESHOLD = 50;

    private State state;

    public NPC() {
        this.state = new WorkingState(); // inicial
        this.state.enter(this);
        printStatus();
    }

    public void tick() {
        state.update(this);
    }

    public void changeState(State next) {
        System.out.printf("Transicao: %s -> %s%n", state.name(), next.name());
        state.exit(this);
        state = next;
        state.enter(this);
        printStatus();
    }

    public void clampNeeds() {
        hunger  = Math.max(0, Math.min(100, hunger));
        fatigue = Math.max(0, Math.min(100, fatigue));
    }

    public void printStatus() {
        System.out.printf("Estado=%s | Fome=%d | Sono=%d%n", state.name(), hunger, fatigue);
    }
}
