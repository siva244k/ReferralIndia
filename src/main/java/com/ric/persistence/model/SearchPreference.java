package com.ric.persistence.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SearchPreference implements Serializable {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6561921759548148534L;
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
	
	@Column(name = "keywords")
	private String keywords;
	
	@Column(name = "exp")
	private String exp;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "company")
	private String company;
	
	public SearchPreference()  {
		
	}
    
	public SearchPreference(String keywords, String exp, String location,
			String company) {
		super();
		this.keywords = keywords;
		this.exp = exp;
		this.location = location;
		this.company = company;
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
	 * @return the keywords
	 */
	public String getKeywords() {
		return keywords;
	}

	/**
	 * @param keywords the keywords to set
	 */
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	/**
	 * @return the exp
	 */
	public String getExp() {
		return exp;
	}

	/**
	 * @param exp the exp to set
	 */
	public void setExp(String exp) {
		this.exp = exp;
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

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SearchPreference [id=" + id + ", keywords=" + keywords
				+ ", exp=" + exp + ", location=" + location + ", company="
				+ company + "]";
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
        final SearchPreference other = (SearchPreference) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
