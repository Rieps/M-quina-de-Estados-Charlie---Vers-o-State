package State_Machine;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        NPC charlie = new NPC();

        for (int i = 0; i < 60; i++) {
            charlie.tick();
            Thread.sleep(800);
        }
    }
}
