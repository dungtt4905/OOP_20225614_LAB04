public abstract class Media implements Comparable<Media> {
    private int id;
    private String title;
    private String category;
    private float cost;

    // Constructor
    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    // Phương thức toString() chung cho tất cả các lớp con
    @Override
    public String toString() {
        return "Media [ID=" + id + ", Title=" + title + ", Category=" + category + ", Cost=" + cost + "]";
    }

    // Ghi đè equals() để so sánh đối tượng dựa trên title
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Media media = (Media) obj;
        return title != null && title.equalsIgnoreCase(media.title);  // So sánh theo title
    }

    // Ghi đè hashCode() để đảm bảo tính duy nhất
    @Override
    public int hashCode() {
        return title != null ? title.toLowerCase().hashCode() : 0;
    }

    // Triển khai phương thức compareTo từ Comparable để sắp xếp theo title
    @Override
    public int compareTo(Media other) {
        return this.title.compareToIgnoreCase(other.title); // Sắp xếp theo title
    }
}
