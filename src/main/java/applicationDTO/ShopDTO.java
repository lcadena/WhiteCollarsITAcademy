package applicationDTO;

import java.util.ArrayList;
import java.util.List;

import domain.Shop;

public class ShopDTO {
	public String shopName;
	public int capacityMax;
	public List<PictureDTO> pictures = new ArrayList<>();
	public ShopDTO(Shop s) {
		this.shopName = s.getShopName();
		this.capacityMax = s.getCapacityMax();
		this.pictures = convertToDTO(s.getAllPictures());
	}
	
	
	
	
	
}
