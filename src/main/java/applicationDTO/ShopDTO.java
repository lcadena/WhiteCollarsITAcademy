package applicationDTO;

import domain.Shop;

public class ShopDTO {
	public String shopName;
	public int capacity;
	public ShopDTO(Shop s) throws Exception {
		if(s == null) throw new Exception();
		this.shopName = s.getShopName();
		this.capacity = s.getCapacity();			
	}
	public String getShopName() {
		return shopName;
	}
	public int getCapacity() {
		return capacity;
	}	
}
