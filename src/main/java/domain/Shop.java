package domain;

import java.util.List;
import java.util.ArrayList;

public class Shop {
	public String shopName;
	public int capacityMax;
	public List<Picture> allPictures = new ArrayList<Picture>();
	
	public Shop (String shopName, int capacityMax) throws Exception {
		if(shopName.trim().equals("")) throw new Exception();
		if(capacityMax < 1) throw new Exception();
		this.shopName = shopName;
		this.capacityMax = capacityMax;
	}
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public int getCapacityMax() {
		return capacityMax;
	}
	public void setCapacityMax(int capacityMax) {
		this.capacityMax = capacityMax;
	}
	
	public void addPicture(Picture p) {
		this.allPictures.add(p);
	}

	public List<Picture> getAllPictures() {
		return new ArrayList<>(allPictures);
	}
	
	
	
	
}
