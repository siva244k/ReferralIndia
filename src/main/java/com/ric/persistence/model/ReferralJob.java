package com.ric.persistence.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class ReferralJob implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6561921759548148534L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "posted_by")
	private String postedBy;

	@Column(name = "open_position")
	private String position;

	@Column(name = "skill")
	private String skill;

	@Column(name = "location")
	private String location;

	@Column(name = "exp_to")
	private Integer expTo;

	@Column(name = "exp_from")
	private Integer expFrom;

	@Column(name = "posted_date")
	private Date postedDate;

	@Column(name = "expire_date")
	private Date expireDate;

	@Column(name = "company")
	private String company;

	@ManyToMany(mappedBy = "referralJobs")
	private Set<User> referrers = new HashSet<User>();

	public ReferralJob() {

	}

	public ReferralJob(String postedBy, String position, String skill,
			String location, Integer expTo, Integer expFrom, Date postedDate,
			Date expireDate) {
		super();
		this.postedBy = postedBy;
		this.position = position;
		this.skill = skill;
		this.location = location;
		this.expTo = expTo;
		this.expFrom = expFrom;
		this.postedDate = postedDate;
		this.expireDate = expireDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public String getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(final String postedBy) {
		this.postedBy = postedBy;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(final String position) {
		this.position = position;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(final String skill) {
		this.skill = skill;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(final String location) {
		this.location = location;
	}

	public Integer getExpTo() {
		return expTo;
	}

	public void setExpTo(final Integer expTo) {
		this.expTo = expTo;
	}

	public Integer getExpFrom() {
		return expFrom;
	}

	public void setExpFrom(final Integer expFrom) {
		this.expFrom = expFrom;
	}

	public Date getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(final Date postedDate) {
		this.postedDate = postedDate;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(final Date expireDate) {
		this.expireDate = expireDate;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company
	 *            the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @return the referrers
	 */
	public Set<User> getReferrers() {
		return referrers;
	}

	/**
	 * @param referrers
	 *            the referrers to set
	 */
	public void setReferrers(Set<User> referrers) {
		this.referrers = referrers;
	}

	@Override
	public boolean equals(Object object) {
		boolean result = false;
		if (object == null || object.getClass() != getClass()) {
			result = false;
		} else {
			ReferralJob referralJob = (ReferralJob) object;
			if (this.skill == referralJob.getSkill()
					&& this.location == referralJob.getLocation()
					&& this.company == referralJob.getCompany()
					&& this.expTo.equals(referralJob.getExpTo())
					&& this.expFrom.equals(referralJob.getExpFrom())) {
				result = true;
			}
		}
		return result;
	}

	// just omitted null checks
	@Override
	public int hashCode() {
		int hash = 3;
		if(this.location != null) {
			hash = 7 * hash + this.company.hashCode();
		}
		if(this.location != null) {
			hash = 7 * hash + this.skill.hashCode();
		}
		if(this.location != null) {
			hash = 7 * hash + this.expTo.hashCode();
		}
		if(this.location != null) {
			hash = 7 * hash + this.expFrom.hashCode();
		}
		if(this.location != null) {
			hash = 7 * hash + this.location.hashCode();
		}
		return hash;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("ReferralJob [id=").append(id).append(", skill=")
				.append(skill).append("]");
		return builder.toString();
	}

}
