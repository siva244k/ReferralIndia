package com.ric.persistence.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReferrMe implements Serializable {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6561921759548148534L;
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
	
	@Column(name = "total_exp")
	private String totalExp;
	
	@Column(name = "cctc")
	private String cctc;
	
	@Column(name = "ectc")
	private String ectc;
	
	@Column(name = "company1")
	private String company1;
	
	@Column(name = "company2")
	private String company2;
	
	@Column(name = "company3")
	private String company3;
	
	public ReferrMe()  {
		
	}
    
	public ReferrMe(String totalExp, String cctc, String ectc, String company1,
			String company2, String company3) {
		super();
		this.totalExp = totalExp;
		this.cctc = cctc;
		this.ectc = ectc;
		this.company1 = company1;
		this.company2 = company2;
		this.company3 = company3;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the totalExp
	 */
	public String getTotalExp() {
		return totalExp;
	}

	/**
	 * @param totalExp the totalExp to set
	 */
	public void setTotalExp(String totalExp) {
		this.totalExp = totalExp;
	}

	/**
	 * @return the cctc
	 */
	public String getCctc() {
		return cctc;
	}

	/**
	 * @param cctc the cctc to set
	 */
	public void setCctc(String cctc) {
		this.cctc = cctc;
	}

	/**
	 * @return the ectc
	 */
	public String getEctc() {
		return ectc;
	}

	/**
	 * @param ectc the ectc to set
	 */
	public void setEctc(String ectc) {
		this.ectc = ectc;
	}

	/**
	 * @return the company1
	 */
	public String getCompany1() {
		return company1;
	}

	/**
	 * @param company1 the company1 to set
	 */
	public void setCompany1(String company1) {
		this.company1 = company1;
	}

	/**
	 * @return the company2
	 */
	public String getCompany2() {
		return company2;
	}

	/**
	 * @param company2 the company2 to set
	 */
	public void setCompany2(String company2) {
		this.company2 = company2;
	}

	/**
	 * @return the company3
	 */
	public String getCompany3() {
		return company3;
	}

	/**
	 * @param company3 the company3 to set
	 */
	public void setCompany3(String company3) {
		this.company3 = company3;
	}
	
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ReferrMe other = (ReferrMe) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
