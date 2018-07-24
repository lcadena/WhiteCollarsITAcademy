package domain;

import java.util.List;
import java.util.ArrayList;

public class Shop {
	public int shopID;
	public String shopName;
	public int capacity;
	public List<Picture> allPictures = new ArrayList<Picture>();
	
	public Shop (int shopID, String shopName, int capacity) throws Exception {
		if(shopID < -1) throw new Exception();
		if(shopName.trim().equals("")) throw new Exception();
		if(capacity < 1) throw new Exception();
		this.shopName = shopName;
		this.capacity = capacity;
	}
	
	public String getShopName() {
		return shopName;
	}

	public int getShopID() {
		return shopID;
	}
	
	public void addPicture(Picture p) {
		int counter = this.capacity;
		if (counter == 0) {
			System.out.println("Shop full");
		} else {
			this.allPictures.add(p);
			this.capacity = this.capacity - 1;
		}
		
	}
	
	public int getCapacity() {
		return capacity;
	}

	public void burntAll() throws Exception{
		System.out.println("Collars???");
		this.allPictures.removeAll(allPictures);	
	}
	
	public List<Picture> getAllPictures() {
		return new ArrayList<>(allPictures);
	}

}
