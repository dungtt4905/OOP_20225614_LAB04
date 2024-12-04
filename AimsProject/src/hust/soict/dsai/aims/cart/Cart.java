import java.util.ArrayList;
import java.util.Collections;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    // Thêm một Media vào giỏ hàng
    public void addMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            itemsOrdered.add(media);
            System.out.println("The media \"" + media.getTitle() + "\" has been added to the cart.");
        } else {
            System.out.println("The media \"" + media.getTitle() + "\" is already in the cart.");
        }
    }

    // Tính tổng chi phí của các media trong giỏ hàng
    public double totalCost() {
        double total = 0.0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    // Hiển thị giỏ hàng
    public void printCart() {
        System.out.println("***********************CART***********************");
        if (itemsOrdered.isEmpty()) {
            System.out.println("The cart is currently empty.");
        } else {
            for (int i = 0; i < itemsOrdered.size(); i++) {
                Media media = itemsOrdered.get(i);
                System.out.println((i + 1) + ". " + media.toString());
            }
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("***************************************************");
    }

    // Sắp xếp giỏ hàng theo title
    public void sortByTitle() {
        Collections.sort(itemsOrdered);  // Sắp xếp theo title (dựa trên Comparable)
        System.out.println("Cart sorted by title.");
    }

    // Sắp xếp giỏ hàng theo cost
    public void sortByCost() {
        Collections.sort(itemsOrdered, new MediaCostComparator());  // Sắp xếp theo cost (dựa trên Comparator)
        System.out.println("Cart sorted by cost.");
    }
}
