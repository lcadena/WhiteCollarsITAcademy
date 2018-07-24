package view;

import application.ShopController;

public class Main {
	public static ShopController controller = new ShopController();
	
	public static void main(String[] args) throws Exception {
		controller.createShop("Shop1",10);
		controller.addPicture("Las Meninas", "Velazquez", 1.0, "18/2/2010");
		controller.addPicture("Madonna of the rocks", "Da Vinci", 12.0, "18/2/2010");
		System.out.println("Listado: "+PictureDTO.getValues);
	}
}

