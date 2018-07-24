package domain;

import java.util.List;
import java.util.ArrayList;

public class Shop {
	public String shopName;
	public int capacity;
	public List<Picture> allPictures = new ArrayList<Picture>();
	
	public Shop (String shopName, int capacity) throws Exception {
		if(shopName.trim().equals("")) throw new Exception();
		if(capacity < 1) throw new Exception();
		this.shopName = shopName;
		this.capacity = capacity;
	}
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void addPicture(Picture p) throws Exception{
		int count = this.capacity;
		if (count == 0) {System.out.println("The shop is full");} 
			else {
				this.allPictures.add(p);
				this.capacity = this.capacity -1;
				}
	}

	public void burntAll() throws Exception{
		System.out.println("Collars???");
		this.allPictures.removeAll(allPictures);	
	}
	
	public List<Picture> getAllPictures() {
		return new ArrayList<>(allPictures);
	}
}
