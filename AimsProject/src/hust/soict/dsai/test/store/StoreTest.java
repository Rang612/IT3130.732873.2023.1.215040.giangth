package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;
public class StoreTest {
    public static void main(String[] args) {
        Store dvdStore = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        dvdStore.addDvd(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geoge Lucas", 87, 24.95f);
        dvdStore.addDvd(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 23.65f);
        dvdStore.addDvd(dvd3);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Black Panther", "Science Action", "blabla",90 , 21.99f);
        dvdStore.addDvd(dvd4);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("No Back", "Science Action", "blabla",90 , 21.99f);
        dvdStore.addDvd(dvd5);

        dvdStore.removeDvd(dvd3);
    }
}