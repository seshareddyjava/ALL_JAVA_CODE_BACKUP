package com.slokam.healthcare.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.healthcare.entity.Visiting;

@Repository
public abstract interface IVisitingRepo extends JpaRepository<Visiting, Integer> {

	@Query("select p.name from Visiting v join v.appointment a join a.patient p where p.id=?1 ")
	public List<String> getPatientsById(Integer id);
	
}
