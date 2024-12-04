import java.util.ArrayList;

public class CompactDisc extends Media {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    // Constructor
    public CompactDisc(int id, String title, String category, float cost, String artist) {
        super(id, title, category, cost);  // Gọi constructor của Media
        this.artist = artist;
    }

    // Getter và Setter cho artist và tracks
    public String getArtist() {
        return artist;
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    // Thêm track vào danh sách
    public void addTrack(Track track) {
        tracks.add(track);
    }

    // Ghi đè phương thức toString() để thêm thông tin về artist và tracks
    @Override
    public String toString() {
        return super.toString() + ", Artist=" + artist + ", Tracks=" + tracks.size();
    }

    // Ghi đè equals() để so sánh đối tượng CompactDisc dựa trên title
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        CompactDisc that = (CompactDisc) obj;
        return title.equalsIgnoreCase(that.title);  // So sánh title
    }

    // Ghi đè hashCode() để đảm bảo tính duy nhất
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
