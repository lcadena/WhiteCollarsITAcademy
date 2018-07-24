package persistence;

import domain.Shop;

public class ShopRepository {
	private Shop shop;

	public Shop getShop() throws Exception{
		if (shop == null) throw new Exception("Shop not created");
		return shop;
	}
	
	public void saveShop(Shop shop) throws Exception {
		if (shop == null) throw new Exception("Shop not created");
		this.shop = shop;
	}
}
