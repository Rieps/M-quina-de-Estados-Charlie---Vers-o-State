package State_Machine;

public class SleepingState extends AbstractState {
    @Override public String name() { return "Dormindo"; }

    @Override
    public void enter(NPC npc) { System.out.println("Indo dormir..."); }

    @Override
    public void update(NPC npc) {
        npc.fatigue -= 10;
        npc.hunger = Math.min(100, npc.hunger + 1);
        npc.clampNeeds();
        npc.printStatus();

        if (npc.fatigue <= 0) {
            npc.fatigue = 0;
            npc.changeState(new WorkingState());
        }
    }
}
