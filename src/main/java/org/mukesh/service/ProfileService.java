package org.mukesh.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.mukesh.database.DatabaseClass;
import org.mukesh.entity.Profile;

public class ProfileService {
	
	private Map<String, Profile> profiles = DatabaseClass.getProfiles();
		
	public ProfileService(){
		
		profiles.put("mukesh", new Profile(1,"mukesh","mukeshwar","singh"));
		
	}
	public List<Profile> getAllProfiles(){
		
		return new ArrayList<Profile>(profiles.values());
	}
	
	public List<Profile> getAllProfilesForYear(int year){
		
		List<Profile> profilesForYear = new ArrayList<Profile>();
		Calendar cal = Calendar.getInstance();
		for(Profile profile:profiles.values()){
			cal.setTime(profile.getJoined());
			if(cal.get(Calendar.YEAR)==year){
				profilesForYear.add(profile);
			}
		}		
		return profilesForYear;		
	}
	
	public List<Profile> getAllProfilesPaginated(int start,int size){
		
		List<Profile> profilesPaginated = new ArrayList<Profile>(profiles.values());
		
		if(start+size>profilesPaginated.size()){
			
			return new ArrayList<Profile>();
		}
		
		return profilesPaginated.subList(start, start+size);
		
	}
	
	public Profile getProfile(String profileName){
		
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile){
		profile.setId(profiles.size()+1);
		profiles.put(profile.getProfileName(),profile);
		return profile;
	}
	
	
	
	
	
	
	
	
	

}
