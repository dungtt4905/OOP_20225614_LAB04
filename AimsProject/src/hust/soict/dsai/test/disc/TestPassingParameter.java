package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims1.disc.DigitalVideoDisc;

public class TestPassingParameter {
	public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        DigitalVideoDisc[] dvds = {jungleDVD, cinderellaDVD};
        swap(dvds);

        System.out.println("jungle dvd title: " + dvds[0].getTitle());
        System.out.println("cinderella dvd title: " + dvds[1].getTitle());

        changeTitle(dvds[0], dvds[1].getTitle());
        System.out.println("jungle dvd title after title change: " + dvds[0].getTitle());
    }

    public static void swap(DigitalVideoDisc[] discs) {
        DigitalVideoDisc tmp = discs[0];
        discs[0] = discs[1];
        discs[1] = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle); 
    }
}
