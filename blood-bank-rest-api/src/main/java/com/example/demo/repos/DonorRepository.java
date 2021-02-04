package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BloodDonor;
@Repository
public interface DonorRepository extends JpaRepository<BloodDonor, Integer>{

     List<BloodDonor> findByBloodGroup(String bloodGroup);
	
	 List<BloodDonor> findByCity(String city);
	 
	 
	 
	 @Query(value="select *from donor_table where bloodGroup=:srchCondtion",nativeQuery=true)
	 List<BloodDonor> findEligibleDonorByBloodGroup(@Param("srchCondtion") String bloodGroup);
	 BloodDonor findByDonorId(int id);
	 
	 @Query(value = "select *from donor_table where  dateOfBirth > date(now()-interval 6 month)",nativeQuery=true)
     List<BloodDonor> findEligibleDonorByCity(@Param("srchCondtion") String city);
}
