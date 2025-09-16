package State_Machine;

public class EatingState extends AbstractState {
    @Override public String name() { return "Comendo"; }

    @Override
    public void enter(NPC npc) { System.out.println("Comecou a comer."); }

    @Override
    public void update(NPC npc) {
        npc.hunger -= 5;
        npc.clampNeeds();
        npc.printStatus();

        if (npc.hunger <= 0) {
            npc.hunger = 0;
            npc.changeState(new WorkingState());
        }
    }
}
