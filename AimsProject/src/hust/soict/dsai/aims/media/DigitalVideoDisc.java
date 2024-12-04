package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    // Constructor
    public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
        super(id, title, category, cost, length, director);
    }

    // Implement the play() method from Playable interface
    @Override
    public void play() {
        if (getLength() > 0) { // Kiểm tra nếu độ dài hợp lệ
            System.out.println("Playing DVD: " + getTitle());
            System.out.println("DVD length: " + getLength() + " minutes");
        } else {
            System.out.println("Cannot play this DVD. Length is invalid.");
        }
    }

    // Optional: Override toString() for better display
    @Override
    public String toString() {
        return "DigitalVideoDisc [ID=" + getId() + ", Title=" + getTitle() + 
               ", Category=" + getCategory() + ", Director=" + getDirector() +
               ", Length=" + getLength() + " minutes, Cost=$" + getCost() + "]";
    }
}
