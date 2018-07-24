package persistence;



import java.util.ArrayList;
import java.util.List;

import applicationDTO.ShopDTO;
import domain.Shop;

public class ShopRepository {
	private Shop shop;
	public List<Shop> shops = new ArrayList<>();

	public Shop getShop() throws Exception{
		if (shop == null) throw new Exception("Shop not created");
		return shop;
	}
	
	public void saveShop(Shop shop) throws Exception {
		if (shop == null) throw new Exception("Shop not created");
		this.shop = shop;
		shops.add(shop);
	}
	
	public List<ShopDTO> getAllShops() throws Exception{
		Shop s = getShop();
		
		return null;
		
	}
	
	/*public Shop findShop(String shopId) {					
		return datastore.find(University.class).field("id").equal(uniId).get();
	}*/

}
