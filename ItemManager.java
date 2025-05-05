import java.util.ArrayList;
import java.util.List;

public class ItemManager {
    private List<String> items;

    public void initialize() {
        items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public List<String> getItems() {
        return items;
    }

    public void clearItems() {
        items.clear();
    }
}
