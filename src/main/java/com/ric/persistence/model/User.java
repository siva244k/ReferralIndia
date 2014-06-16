package com.ric.persistence.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class User implements Serializable {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6561921759548148534L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
    @Column(name = "user_name")
    private String userName;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "p_email")
	private String perEmail;
	
	@Column(name = "o_email")
	private String ogrEmail;
	
	@Column(name = "password")
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private UserProfile profile;
	
	 @ManyToMany(cascade = {CascadeType.ALL})
	 @JoinTable(name="user_referralJobs", 
	                joinColumns={@JoinColumn(name="user_id")}, 
	                inverseJoinColumns={@JoinColumn(name="referraljob_id")})
    private Set<ReferralJob> referralJobs = new HashSet<ReferralJob>();
	
	public User()  {
		
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
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the perEmail
	 */
	public String getPerEmail() {
		return perEmail;
	}

	/**
	 * @param perEmail the perEmail to set
	 */
	public void setPerEmail(String perEmail) {
		this.perEmail = perEmail;
	}

	/**
	 * @return the ogrEmail
	 */
	public String getOgrEmail() {
		return ogrEmail;
	}

	/**
	 * @param ogrEmail the ogrEmail to set
	 */
	public void setOgrEmail(String ogrEmail) {
		this.ogrEmail = ogrEmail;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * @return the profile
	 */
	public UserProfile getProfile() {
		return profile;
	}

	/**
	 * @param profile the profile to set
	 */
	public void setProfile(UserProfile profile) {
		this.profile = profile;
	}
	
	/**
	 * @return the referralJobs
	 */
	public Set<ReferralJob> getReferralJobs() {
		return referralJobs;
	}

	/**
	 * @param referralJobs the referralJobs to set
	 */
	public void setReferralJobs(Set<ReferralJob> referralJobs) {
		this.referralJobs = referralJobs;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [userName=" + userName + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", perEmail=" + perEmail
				+ ", ogrEmail=" + ogrEmail + ", password=" + password
				+ ", profile=" + profile + "]";
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
        final User other = (User) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
