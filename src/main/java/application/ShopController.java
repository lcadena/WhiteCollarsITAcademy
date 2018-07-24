package application;

import java.util.ArrayList;
import java.util.List;

import applicationDTO.PictureDTO;
import domain.Picture;
import domain.Shop;
import persistence.ShopRepository;

public class ShopController {
	public ShopRepository repository = new ShopRepository();
	
	public void createShop(String shopName, int capacity) throws Exception {
		Shop shop = new Shop(shopName, capacity);		
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
			Picture p1 = new Picture(p.getPictureName(),p.getPictureAuthor(),p.getPrice(),p.getInputDate());
			PictureDTO pDTO = new PictureDTO(p1);
			pictures.add(pDTO);
		}
		return pictures;
		
	}
}
