package api;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import application.ShopController;
import applicationDTO.PictureDTO;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;


@RestController
@RequestMapping("shops/{shopId}/pictures")
public class ShopRestController {

/*	@RequestMapping(method=RequestMethod.GET)	
	public String getAllPictures(@PathVariable String shopId) throws Exception{		
		List<PictureDTO> allPictures= new ShopController().getAllPicturesFromShop(shopId);
	
		
		Gson gson=new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		return gson.toJson(allPictures);
	}*/
}
