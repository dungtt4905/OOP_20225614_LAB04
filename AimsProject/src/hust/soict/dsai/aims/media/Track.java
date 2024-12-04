public class Track {
    private String title;
    private int length;

    // Constructor
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    // Ghi đè phương thức toString() để hiển thị thông tin track
    @Override
    public String toString() {
        return "Track [Title=" + title + ", Length=" + length + " seconds]";
    }

    // Ghi đè equals() để so sánh dựa trên title và length
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Track track = (Track) obj;
        return length == track.length && title.equalsIgnoreCase(track.title);  // So sánh title và length
    }

    // Ghi đè hashCode() để đảm bảo tính duy nhất
    @Override
    public int hashCode() {
        int result = title != null ? title.toLowerCase().hashCode() : 0;
        result = 31 * result + length;  // Tính hashCode dựa trên title và length
        return result;
    }
}
