package com.ric.persistence.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company implements Serializable {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6561921759548148534L;
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "duration_from")
	private String durationFrom;
	
	@Column(name = "duration_to")
	private String durationTo;
	
	@Column(name = "designation")
	private String designation;
	
	@Column(name = "location")
	private String location;
	
	public Company()  {
		
	}
    
	public Company(String companyName, String durationFrom, String durationTo,
			String designation, String location) {
		super();
		this.companyName = companyName;
		this.durationFrom = durationFrom;
		this.durationTo = durationTo;
		this.designation = designation;
		this.location = location;
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
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the durationFrom
	 */
	public String getDurationFrom() {
		return durationFrom;
	}

	/**
	 * @param durationFrom the durationFrom to set
	 */
	public void setDurationFrom(String durationFrom) {
		this.durationFrom = durationFrom;
	}

	/**
	 * @return the durationTo
	 */
	public String getDurationTo() {
		return durationTo;
	}

	/**
	 * @param durationTo the durationTo to set
	 */
	public void setDurationTo(String durationTo) {
		this.durationTo = durationTo;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Company [id=" + id + ", companyName=" + companyName
				+ ", durationFrom=" + durationFrom + ", durationTo="
				+ durationTo + ", designation=" + designation + ", location="
				+ location + "]";
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
        final Company other = (Company) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
