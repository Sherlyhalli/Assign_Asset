package com.itaim.app.service;

import java.util.List;
import java.util.Optional;

import com.itaim.app.domain.AssignAsset;


public interface AssignAssetService {

	public void saveAssignedAsset(AssignAsset asset);
	
	
    public List<AssignAsset> getAssignedAsset(); 
    
    
    public Optional<AssignAsset> getAssetById(int id);
      
    
    public AssignAsset updateAssignAsset(AssignAsset asset);
    
   
    public void deleteAssetById(int id);
    
   
    public void deleteAllAsset();
	
	 
}
