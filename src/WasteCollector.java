// Handler Interface
public interface WasteCollector {
    public void setNextCollector(WasteCollector next);
    public void processWaste(WasteContainer container);
}