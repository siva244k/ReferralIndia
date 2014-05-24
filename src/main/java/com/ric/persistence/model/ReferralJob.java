package com.ric.persistence.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	
	public ReferralJob() {
		
	}
	
	public ReferralJob(String postedBy, String position,
			String skill, String location, Integer expTo, Integer expFrom,
			Date postedDate, Date expireDate) {
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
    	
	// 

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
        final ReferralJob other = (ReferralJob) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("ReferralJob [id=").append(id).append(", skill=").append(skill).append("]");
        return builder.toString();
    }

}
