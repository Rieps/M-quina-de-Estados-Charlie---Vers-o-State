package State_Machine;

public class WorkingState extends AbstractState {
    @Override public String name() { return "Trabalhando"; }

    @Override
    public void enter(NPC npc) { System.out.println("Comecou a trabalhar."); }

    @Override
    public void update(NPC npc) {
        npc.hunger += 2;
        npc.fatigue += 5;
        npc.clampNeeds();
        npc.printStatus();

        // Sono tem prioridade sobre fome
        if (npc.fatigue >= npc.FATIGUE_THRESHOLD) {
            npc.changeState(new SleepingState());
        } else if (npc.hunger >= npc.HUNGER_THRESHOLD) {
            npc.changeState(new EatingState());
        }
    }
}
