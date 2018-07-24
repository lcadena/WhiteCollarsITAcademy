package api;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import application.ShopController;
import applicationDTO.PictureDTO;


/*
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.unify.application.SongController;
import com.unify.application.dto.SongDTO;
import com.unify.domain.Song;
import com.unify.utilities.InvalidActionException;
import com.unify.utilities.InvalidParamException;
import com.unify.utilities.NoSongToPlayException;
import com.unify.utilities.ResourceNotFoundException;
import com.unify.utilities.UniversityAlreadyExistsException;*/

@RestController
@RequestMapping("shops/{shopId}/pictures")
public class ShopRestController {

	/*@RequestMapping(method=RequestMethod.GET)	
	public String getAllPictures(@PathVariable String shopId){		
		List<PictureDTO> allPictures= new ShopController().getAllPictures();
	
		/*Gson gson = 
		Gson gson=new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		return gson.toJson(allPictures);
	}*/
}
