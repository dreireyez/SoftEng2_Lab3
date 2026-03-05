// Concrete Handler
public class ElectronicsCollector implements WasteCollector {
    private WasteCollector next;

    @Override
    public void setNextCollector(WasteCollector next) {
        this.next = next;
    }

    @Override
    public void processWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Electronics")) {
            System.out.printf("[Electronics Collector] Disposing of %dL of %s waste.\n", container.getCapacity(), container.getType().toLowerCase());
        } else if (next != null) {
            System.out.printf("[Electronics Collector] Cannot handle %s waste. Passing to next...\n", container.getType().toLowerCase());
            next.processWaste(container);
        } else {
            System.out.println("End of chain. Unhandled waste type.");
        }
    }

}