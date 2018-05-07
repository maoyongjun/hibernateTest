package org.justin.hibernateTest.dao;


import org.justin.hibernateTest.entity.tdmac.Mfsyscserial;
import org.justin.hibernateTest.entity.tdmac.MfsyscserialKey;
import org.justin.hibernateTest.entity.tdmac.Mfsysproduct;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MfsyscserialDao extends JpaRepository<Mfsyscserial, MfsyscserialKey>{
	
//	@Query(name="SELECT t FROM Mfsyscserial t WHERE t.sysserialno= :sn")
//	public Mfsyscserial findModelBySysserialno(@Param("sn")String sn);
//	
}
