package com.aits.mobileprepaidservice.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aits.mobileprepaidservice.entity.RechargePlan;
import com.aits.mobileprepaidservice.repoo.RechargePlanRepository;
@Service
public class RechargePlanService {
 
	@Autowired
	private RechargePlanRepository repository;
    public List<RechargePlan> getAllPlans(){
    	return repository.findAll();
    }
 
    public List<RechargePlan> getPlansByCategory(String category) {
        return repository.findByCategory(category);
    }
 
	public RechargePlan insert(RechargePlan rechargeplan) {
		// TODO Auto-generated method stub
		
		return repository.save(rechargeplan);
    }
}
