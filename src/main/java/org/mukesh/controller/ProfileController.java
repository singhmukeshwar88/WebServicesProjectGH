package org.mukesh.controller;

import java.util.List;

import org.mukesh.entity.Profile;
import org.mukesh.service.ProfileService;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/profiles")
public class ProfileController {
	
	ProfileService profileService = new ProfileService();
	@RequestMapping(value="/profile", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Profile> getAllProfiles(@RequestParam("year") int year){
		
		if(year>0){
			return profileService.getAllProfilesForYear(year);
		}
				
		return profileService.getAllProfiles();
	}
	
/*	@RequestMapping(value="/profile", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Profile> getAllProfiles(@RequestParam("start") int start,@RequestParam("size") int size){
		
		if(size>=0 && start>=0){
			return profileService.getAllProfilesPaginated(start, size);
		}
		
		return profileService.getAllProfiles();
	}
	
	@RequestMapping(value="/profile", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Profile> getAllProfiles(){
		
		return profileService.getAllProfiles();
	}*/
	
	@RequestMapping(value="/profile/{profileName}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Profile getProfile(@PathVariable("profileName") String profileName){

		return profileService.getProfile(profileName);
	}
	
	@RequestMapping(value="/profile", method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public Profile addProfile(@RequestBody Profile profile){
		
		return profileService.addProfile(profile);
	}
	
}
