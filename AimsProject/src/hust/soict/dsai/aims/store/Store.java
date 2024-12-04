import java.util.ArrayList;
import java.util.Collections;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();

    // Thêm một Media vào cửa hàng
    public void addMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            itemsInStore.add(media);
            System.out.println("The media \"" + media.getTitle() + "\" has been added to the store.");
        } else {
            System.out.println("The media \"" + media.getTitle() + "\" is already in the store.");
        }
    }

    // Xóa một Media khỏi cửa hàng
    public void removeMedia(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println("The media \"" + media.getTitle() + "\" has been removed from the store.");
        } else {
            System.out.println("The media \"" + media.getTitle() + "\" was not found in the store.");
        }
    }

    // Hiển thị tất cả các media trong cửa hàng
    public void displayStore() {
        System.out.println("*********************STORE*********************");
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is currently empty.");
        } else {
            for (int i = 0; i < itemsInStore.size(); i++) {
                Media media = itemsInStore.get(i);
                System.out.println((i + 1) + ". " + media.toString());
            }
        }
        System.out.println("************************************************");
    }

    // Sắp xếp cửa hàng theo title
    public void sortByTitle() {
        Collections.sort(itemsInStore);  // Sắp xếp theo title (dựa trên Comparable)
        System.out.println("Store sorted by title.");
    }

    // Sắp xếp cửa hàng theo cost
    public void sortByCost() {
        Collections.sort(itemsInStore, new MediaCostComparator());  // Sắp xếp theo cost (dựa trên Comparator)
        System.out.println("Store sorted by cost.");
    }
}
