//Tran Huong Giang 20215040
package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public class MediaComparatorByCost implements Comparator<Media> {

	@Override
	public int compare(Media o1, Media o2) {
		return Float.floatToIntBits(o2.getCost()) - Float.floatToIntBits(o1.getCost());
	}

}
