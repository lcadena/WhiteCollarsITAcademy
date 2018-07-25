package persistence;



import java.util.ArrayList;
import java.util.List;

import applicationDTO.ShopDTO;
import domain.Shop;

public class ShopRepository {
	public List<Shop> shops = new ArrayList<>();
	
	public ShopRepository() {
		
	}

	public List<Shop> getAllShops() {
		return new ArrayList<>(shops);
	}

	public void addShop(Shop s) throws Exception {
		if(s == null) throw new Exception();
		shops.add(s);
	}
	
	public void deleteShop(Shop s) throws Exception {
		if(s == null) throw new Exception();
		shops.remove(s);
	}

	public Shop getShopById(int shopID) throws Exception {
		for (Shop s : shops) {
			if(s.getShopID() == shopID) {
				return s;
			} 
		}
		throw new Exception();
	
				
	}

/*	public Shop getShopName(Shop shop) throws Exception{
		if (shop == null) throw new Exception();
		return shop;
	}
	
	public void saveShop(Shop shop) throws Exception {
		if (shop == null) throw new Exception("Shop not created");
		this.shop = shop;
		shops.add(shop);
	}*/
	

}
