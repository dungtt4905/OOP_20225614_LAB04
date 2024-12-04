import java.util.Scanner;

public class Aims {
    public static void main(String[] args) {
        // Tạo cửa hàng và giỏ hàng
        Store store = new Store();
        Cart cart = new Cart();

        // Tạo một số media để thêm vào cửa hàng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "Movie A", "Action", 19.99f, "Director X", 120);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Movie B", "Action", 15.99f, "Director Y", 110);
        Book book1 = new Book(3, "Book A", "Fiction", 9.99f);
        ((Book) book1).addAuthor("Author 1");
        CompactDisc cd1 = new CompactDisc(4, "Album A", "Music", 12.99f, "Artist A");

        // Thêm media vào cửa hàng
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(book1);
        store.addMedia(cd1);

        // Hiển thị menu và yêu cầu người dùng chọn thao tác
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n------ AIMS ------");
            System.out.println("1. Display Store");
            System.out.println("2. Add media to Cart");
            System.out.println("3. Remove media from Cart");
            System.out.println("4. Display Cart");
            System.out.println("5. Sort Cart by Title");
            System.out.println("6. Sort Cart by Cost");
            System.out.println("7. Play media in Cart");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Clear the buffer

            switch (choice) {
                case 1:
                    // Hiển thị cửa hàng
                    store.displayStore();
                    break;
                case 2:
                    // Thêm media vào giỏ hàng
                    System.out.print("Enter the title of media to add to Cart: ");
                    String titleToAdd = scanner.nextLine();
                    Media mediaToAdd = store.findMediaByTitle(titleToAdd);
                    if (mediaToAdd != null) {
                        cart.addMedia(mediaToAdd);
                    } else {
                        System.out.println("Media not found in store.");
                    }
                    break;
                case 3:
                    // Xóa media khỏi giỏ hàng
                    System.out.print("Enter the title of media to remove from Cart: ");
                    String titleToRemove = scanner.nextLine();
                    Media mediaToRemove = store.findMediaByTitle(titleToRemove);
                    if (mediaToRemove != null) {
                        cart.removeMedia(mediaToRemove);
                    } else {
                        System.out.println("Media not found in cart.");
                    }
                    break;
                case 4:
                    // Hiển thị giỏ hàng
                    cart.printCart();
                    break;
                case 5:
                    // Sắp xếp giỏ hàng theo title
                    cart.sortByTitle();
                    break;
                case 6:
                    // Sắp xếp giỏ hàng theo cost
                    cart.sortByCost();
                    break;
                case 7:
                    // Phát media trong giỏ hàng
                    System.out.print("Enter the title of media to play: ");
                    String titleToPlay = scanner.nextLine();
                    Media mediaToPlay = store.findMediaByTitle(titleToPlay);
                    if (mediaToPlay != null && mediaToPlay instanceof Playable) {
                        ((Playable) mediaToPlay).play();
                    } else {
                        System.out.println("This media cannot be played or not found.");
                    }
                    break;
                case 8:
                    // Thoát
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 8);

        scanner.close();
    }
}
