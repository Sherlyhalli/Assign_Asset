package com.itaim.app.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itaim.app.domain.AssignAsset;
import com.itaim.app.repository.AssignAssetRepository;
import com.itaim.app.service.AssignAssetService;


@Service
public class AssignAssetServiceImpl  implements AssignAssetService{
	
	@Autowired
	private AssignAssetRepository repository;
	
	@Override
	public void saveAssignedAsset(AssignAsset asset) {
		repository.save(asset);
		
	}

	@Override
	public List<AssignAsset> getAssignedAsset() {
		return repository.findAll();
	}

	@Override
	public Optional<AssignAsset> getAssetById(int id) {
		return repository.findById(id);
	}

	@Override
	public AssignAsset updateAssignAsset(AssignAsset asset) {
		return repository.save(asset);
	}

	@Override
	public void deleteAssetById(int id) {
		repository.deleteById(id);
		
	}

	@Override
	public void deleteAllAsset() {
		repository.deleteAll();
		
	}



	
}
