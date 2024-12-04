public class DigitalVideoDisc extends Media {
    private String director;
    private int length;

    // Constructor
    public DigitalVideoDisc(int id, String title, String category, float cost, String director, int length) {
        super(id, title, category, cost);  // Gọi constructor của Media
        this.director = director;
        this.length = length;
    }

    // Getters
    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    // Ghi đè phương thức toString() để thêm thông tin DVD
    @Override
    public String toString() {
        return super.toString() + ", Director=" + director + ", Length=" + length + " minutes";
    }

    // Ghi đè equals() để so sánh đối tượng DigitalVideoDisc dựa trên title
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        DigitalVideoDisc that = (DigitalVideoDisc) obj;
        return length == that.length && title.equalsIgnoreCase(that.title);  // So sánh title và length
    }

    // Ghi đè hashCode() để đảm bảo tính duy nhất
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + length;  // Tính hashCode dựa trên length
        return result;
    }
}
