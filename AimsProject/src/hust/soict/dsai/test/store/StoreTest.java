package hust.soict.test.store;

import hust.soict.aims.disc.DigitalVideoDisc;
import hust.soict.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        // Create a Store object
        Store store = new Store();

        // Create some DigitalVideoDisc objects
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 89, 19.99);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Godfather", "Crime", "Francis Ford Coppola", 175, 24.99);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 121, 22.99);

        // Add DVDs to the store
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Display the store's inventory
        store.displayStore();

        // Remove a DVD from the store
        store.removeDVD(dvd2);

        // Display the store's inventory after removal
        store.displayStore();

        // Attempt to remove a DVD not in the store
        store.removeDVD(dvd2);
    }
}
