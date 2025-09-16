package State_Machine;

public abstract class AbstractState implements State {
    @Override
    public void enter(NPC npc) { }
    @Override
    public void exit(NPC npc) { }
}