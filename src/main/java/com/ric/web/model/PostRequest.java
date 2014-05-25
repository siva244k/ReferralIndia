package com.ric.web.model;

public class PostRequest {

	private String skill;
	
	private String position;
	
	private int expTo;
	
	/**
	 * @return the skill
	 */
	public String getSkill() {
		return skill;
	}

	/**
	 * @param skill the skill to set
	 */
	public void setSkill(String skill) {
		this.skill = skill;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return the expTo
	 */
	public int getExpTo() {
		return expTo;
	}

	/**
	 * @param expTo the expTo to set
	 */
	public void setExpTo(final String expTo) {
		this.expTo = Integer.parseInt(expTo);
	}

}
