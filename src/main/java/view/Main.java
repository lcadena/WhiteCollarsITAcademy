package view;

import java.util.List;

import application.ShopController;
import applicationDTO.PictureDTO;

public class Main {
	public static ShopController controller = new ShopController();
	
	public static void main(String[] args) throws Exception {
		controller.createShop(1,"Louvre Gallery", 10);
		controller.createShop(2,"MammaMia Gallery", 16);
		controller.addPicture("Las Meninas", "Velazquez", 1.0, "18/2/2010", 1);
		controller.addPicture("Madonna of the rocks", "Da Vinci", 12.0, "18/2/2010", 1);
		List<PictureDTO> pictures = controller.getAllPictures(1);
		for(PictureDTO p : pictures) {
			System.out.println("---------------------");
			System.out.println(p.getValues());
		}
		System.out.println("\n" + controller.getShopName(2));
		
		/*System.out.println(controller.getShopName());
		System.out.println("Gallery Name: " + controller.getArtGallery().getShopName() + "\nCapacity: " + controller.getArtGallery().getCapacity());
		
		controller.createShop(2,"MammaMia Gallery", 16);
		controller.addPicture("La Mona Lisa", "Da Vinci", 100.5, "18/2/2010",2);
		controller.addPicture("El Grito", "Munch", 89.99, "18/2/2010",2);*/

	}
}

