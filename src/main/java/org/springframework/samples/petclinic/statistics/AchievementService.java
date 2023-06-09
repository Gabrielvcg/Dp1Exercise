package org.springframework.samples.petclinic.statistics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AchievementService {
    AchievementRepository repo;

@Autowired
public AchievementService(AchievementRepository repo){
    this.repo=repo;
}
List<Achievement> getAchievements(){
    return repo.findAll();
}
public Achievement getById(Integer id){
    return repo.findById(id).get();
    }

public void save(Achievement achievement){
    repo.save(achievement);
    
}
public void deleteAchievementById(Integer id){
   repo.deleteById(id);
   
}

}
