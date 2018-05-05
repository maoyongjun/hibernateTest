package org.justin.hibernateTest.dao;

import java.util.List;

import org.justin.hibernateTest.entity.tdmac.Mfsyscserial;
import org.justin.hibernateTest.entity.tdmac.MfsyscserialKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MfsyscserialDao extends JpaRepository<Mfsyscserial, MfsyscserialKey>{
	
	@Query(name="SELECT f FROM Mfsysproduct t LEFT JOIN t.sns f WHERE t.sysserialno :sn")
	public List<Mfsyscserial> findModelBySysserialno(@Param("sn")String sn);
}
