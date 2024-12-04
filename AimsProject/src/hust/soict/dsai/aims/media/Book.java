import java.util.ArrayList;

public class Book extends Media {
    private ArrayList<String> authors = new ArrayList<>();

    // Constructor
    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost);  // Gọi constructor của Media
    }

    // Getter và Setter cho authors
    public ArrayList<String> getAuthors() {
        return authors;
    }

    // Phương thức để thêm tác giả
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        }
    }

    // Ghi đè phương thức toString() để thêm thông tin về tác giả
    @Override
    public String toString() {
        return super.toString() + ", Authors=" + authors;
    }

    // Ghi đè equals() để so sánh đối tượng Book dựa trên title
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Book book = (Book) obj;
        return title.equalsIgnoreCase(book.title);  // So sánh title
    }

    // Ghi đè hashCode() để đảm bảo tính duy nhất
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
