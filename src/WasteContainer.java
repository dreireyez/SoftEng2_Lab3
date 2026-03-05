// Request Object
public class WasteContainer {
    private String type;
    private int capacity;

    public WasteContainer(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    // Getters and Setters
    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}