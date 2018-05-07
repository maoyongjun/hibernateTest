package org.justin.hibernateTest.dao;

import java.util.List;

import org.justin.hibernateTest.entity.tdmac.Mfsysproduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MfsysproductDao extends JpaRepository<Mfsysproduct, String>{
//	@Query(name="SELECT t FROM Mfsysproduct t WHERE t.sysserialno )
//	public List<Mfsysproduct> findModelBySysserialno(@Param("sns")String sns);
}
