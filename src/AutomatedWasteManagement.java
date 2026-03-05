public class AutomatedWasteManagement {
    public static void main(String[] args) {
        WasteCollector organic = new OrganicCollector();
        WasteCollector recyclable = new RecyclableCollector();
        WasteCollector hazardous = new HazardousCollector();
        WasteCollector electronics = new ElectronicsCollector();

        organic.setNextCollector(recyclable);
        recyclable.setNextCollector(hazardous);
        hazardous.setNextCollector(electronics);

        // Create sample containers
        WasteContainer bin1 = new WasteContainer("Organic", 50);
        WasteContainer bin2 = new WasteContainer("Hazardous", 20);
        WasteContainer bin3 = new WasteContainer("Recyclable", 100);
        WasteContainer bin4 = new WasteContainer("Electronics", 15);

        // Start the waste collection process
        System.out.println("Emptying BIN 1");
        organic.processWaste(bin1);
        System.out.println();

        System.out.println("Emptying BIN 2");
        organic.processWaste(bin2);
        System.out.println();

        System.out.println("Emptying BIN 3");
        organic.processWaste(bin3);
        System.out.println();

        System.out.println("Emptying BIN 4");
        organic.processWaste(bin4);
        System.out.println();
    }
}