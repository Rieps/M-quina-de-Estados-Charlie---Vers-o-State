package State_Machine;
public interface State {
    void enter(NPC npc);
    void update(NPC npc);
    void exit(NPC npc);
    String name();
}