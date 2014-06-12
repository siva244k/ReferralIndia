package com.ric.persistence.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class UserProfile implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6561921759548148534L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "pic")
	private String pic;

	@Column(name = "notice_period")
	private String noticePeriod;

	@Column(name = "cctc")
	private String cctc;

	@Column(name = "ectc")
	private String ectc;

	@Column(name = "resume")
	private String resume;

	@Column(name = "domain")
	private String domain;

	@Column(name = "exp")
	private String exp;

	@OneToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
	@JoinColumn(name = "user_profile_id", nullable = false)
	private List<Company> companies = new ArrayList<Company>();

	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private SearchPreference searchPreference;

	public UserProfile() {

	}

	public UserProfile(String pic, String noticePeriod, String cctc,
			String ectc, String resume, String domain, String exp,
			List<Company> companies, SearchPreference searchPreference) {
		super();
		this.pic = pic;
		this.noticePeriod = noticePeriod;
		this.cctc = cctc;
		this.ectc = ectc;
		this.resume = resume;
		this.domain = domain;
		this.exp = exp;
		this.companies = companies;
		this.searchPreference = searchPreference;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the pic
	 */
	public String getPic() {
		return pic;
	}

	/**
	 * @param pic
	 *            the pic to set
	 */
	public void setPic(String pic) {
		this.pic = pic;
	}

	/**
	 * @return the noticePeriod
	 */
	public String getNoticePeriod() {
		return noticePeriod;
	}

	/**
	 * @param noticePeriod
	 *            the noticePeriod to set
	 */
	public void setNoticePeriod(String noticePeriod) {
		this.noticePeriod = noticePeriod;
	}

	/**
	 * @return the cctc
	 */
	public String getCctc() {
		return cctc;
	}

	/**
	 * @param cctc
	 *            the cctc to set
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
	 * @param ectc
	 *            the ectc to set
	 */
	public void setEctc(String ectc) {
		this.ectc = ectc;
	}

	/**
	 * @return the resume
	 */
	public String getResume() {
		return resume;
	}

	/**
	 * @param resume
	 *            the resume to set
	 */
	public void setResume(String resume) {
		this.resume = resume;
	}

	/**
	 * @return the domain
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * @param domain
	 *            the domain to set
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}

	/**
	 * @return the exp
	 */
	public String getExp() {
		return exp;
	}

	/**
	 * @param exp
	 *            the exp to set
	 */
	public void setExp(String exp) {
		this.exp = exp;
	}

	/**
	 * @return the companies
	 */
	public List<Company> getCompanies() {
		return companies;
	}

	/**
	 * @param companies
	 *            the companies to set
	 */
	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}
	
	/**
	 * @return the searchPreference
	 */
	public SearchPreference getSearchPreference() {
		return searchPreference;
	}

	/**
	 * @param searchPreference the searchPreference to set
	 */
	public void setSearchPreference(SearchPreference searchPreference) {
		this.searchPreference = searchPreference;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserProfile [id=" + id + ", pic=" + pic + ", noticePeriod="
				+ noticePeriod + ", cctc=" + cctc + ", ectc=" + ectc
				+ ", resume=" + resume + ", domain=" + domain + ", exp=" + exp
				+ ", companies=" + companies + ", searchPreference="
				+ searchPreference + "]";
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
		final UserProfile other = (UserProfile) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
