package applicationDTO;

import domain.Picture;

public class PictureDTO {
	public String pictureName;
	public String pictureAuthor;
	public double price;
	public String inputDate;
	
	public PictureDTO(Picture p) throws Exception {
		if(p == null) throw new Exception();
		this.pictureName = p.getPictureName();
		this.pictureAuthor = p.getPictureAuthor();
		this.price = p.getPrice();
		this.inputDate = p.getInputDate();
	}

	public String getPictureName() {
		return pictureName;
	}

	public String getPictureAuthor() {
		return pictureAuthor;
	}

	public double getPrice() {
		return price;
	}

	public String getInputDate() {
		return inputDate;
	}

	public String getValues() {
		return "Picture Name: "+ getPictureName() + "\nAuthor: "+ getPictureAuthor()+
		"\nPrice: "+ getPrice()+"\nDate: "+ getInputDate();
	}

	
}
