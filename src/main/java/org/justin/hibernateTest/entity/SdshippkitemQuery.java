package org.justin.hibernateTest.entity;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

@Entity
//@Table(name="test7")
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "getDnSp", 
            procedureName = "querydn", 
            resultClasses = { SdshippkitemQuery.class },
            parameters = {
                    @StoredProcedureParameter(
                            mode = ParameterMode.IN, 
                            name = "dninput", //参数需要和存储过程对上
                            type = String.class)
            }
        )
//    ,  @NamedStoredProcedureQuery(
//                name = "getDnSp1", 
//                procedureName = "querydn1", 
//                resultClasses = { SdshippkitemQuery.class },
//                parameters = {
//                        @StoredProcedureParameter(
//                                mode = ParameterMode.IN, 
//                                name = "dninput", 
//                                type = String.class
//                                ), 
//                        @StoredProcedureParameter(
//                                        mode = ParameterMode.OUT, 
//                                        name = "outs", 
//                                        type = List.class
//                                        )
//                }
//            )
    
})
public class SdshippkitemQuery implements Serializable{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private String orderno;
	private String shiporderno ;
	private String sysserialno;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrderno() {
		return orderno;
	}
	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}
	public String getShiporderno() {
		return shiporderno;
	}
	public void setShiporderno(String shiporderno) {
		this.shiporderno = shiporderno;
	}
	public String getSysserialno() {
		return sysserialno;
	}
	public void setSysserialno(String sysserialno) {
		this.sysserialno = sysserialno;
	}
	
}
