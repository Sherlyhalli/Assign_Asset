package com.itaim.app.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itaim.app.domain.AssignAsset;

@Repository
public interface AssignAssetRepository extends JpaRepository<AssignAsset, Integer>{

	 
}
