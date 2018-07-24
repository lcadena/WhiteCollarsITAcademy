package applicationDTO;

import domain.Picture;

public class PictureDTO {
	public String pictureName;
	public String pictureAuthor;

	public PictureDTO(Picture p) throws Exception {
		if(p == null) throw new Exception();
		this.pictureName = p.getPictureName();
		this.pictureAuthor = p.getPictureAuthor();
		
	}

	public String getPictureName() {
		return pictureName;
	}

	public String getPictureAuthor() {
		return pictureAuthor;
	}
	
	public String pictureNameAuthor() {
		return "Picture Name: " + getPictureName() + " Author: " + getPictureAuthor();
		
	}
	
	
}
