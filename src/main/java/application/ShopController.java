package application;

import java.util.ArrayList;
import java.util.List;

import applicationDTO.PictureDTO;
import domain.Picture;
import domain.Shop;
import persistence.ShopRepository;


public class ShopController {
	public ShopRepository repository = new ShopRepository();
	
	public ShopController() {
		
	}
	
	public void createShop(int id, String shopName, int capacity) throws Exception {
		Shop shop = new Shop(id, shopName, capacity);		
		repository.saveShop(shop);
	}
	
	public void addPicture(String pictureName, String pictureAuthor, double price, String inputDate) throws Exception {
		Picture p = new Picture(pictureName, pictureAuthor, price, inputDate);
		Shop s = repository.getShop();
		s.addPicture(p);
	}
	
	public List<PictureDTO> getAllPictures() throws Exception{
		Shop s = repository.getShop();
		List<PictureDTO> pictures = new ArrayList<>();
		for(Picture p : s.getAllPictures()) {
			pictures.add(new PictureDTO(p));
		}
		return pictures;
		
	}
	
	/*public List<PictureDTO> getAllPicturesFromShop(int id) {
		Shop s2 = repository.getShop(id);
		List<PictureDTO> pictures = new ArrayList<>();
		for(Picture p : s2.getAllPictures(id)) {
			pictures.add(new PictureDTO(p));
		}
		return pictures;
		
	}*/
	
	public String getShopName() throws Exception {
		return repository.getShop().getShopName();
	}
	
	public Shop getArtGallery() throws Exception {
		Shop s = repository.getShop();
		return s;
		
	}
	
}
