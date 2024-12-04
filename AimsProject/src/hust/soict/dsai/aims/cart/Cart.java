import java.util.ArrayList;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    // Add a Media to the cart
    public void addMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            itemsOrdered.add(media);
            System.out.println("The media \"" + media.getTitle() + "\" has been added to the cart.");
        } else {
            System.out.println("The media \"" + media.getTitle() + "\" is already in the cart.");
        }
    }

    // Add multiple Media items to the cart
    public void addMedia(Media... mediaList) {
        for (Media media : mediaList) {
            addMedia(media); // Gọi phương thức addMedia để kiểm tra và thêm
        }
    }

    // Remove a Media from the cart
    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("The media \"" + media.getTitle() + "\" has been removed from the cart.");
        } else {
            System.out.println("The media \"" + media.getTitle() + "\" was not found in the cart.");
        }
    }

    // Calculate total cost of all Media in the cart
    public double totalCost() {
        double total = 0.0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    // Display ordered items and total price
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        int itemNumber = 1;
        for (Media media : itemsOrdered) {
            System.out.println(itemNumber + ". " + media.toString());
            itemNumber++;
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("***************************************************");
    }

    // Search for a Media by ID
    public void searchCart(int id) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                found = true;
                System.out.println("Item found: " + media.toString());
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found.");
        }
    }

    // Search for a Media by title
    public void searchCart(String title) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                found = true;
                System.out.println("Item found: " + media.toString());
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found.");
        }
    }
}
