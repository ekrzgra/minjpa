package minjpa.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Video {

	private long id;
	private String name;
	private Date createdOn;
	private Set<DailyStatistics> dailyStatistics;
	private Boolean userHasAccess;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public Boolean isUserHasAccess() {
		return userHasAccess;
	}

	@OneToMany
	public Set<DailyStatistics> getDailyStatistics() {
		return dailyStatistics;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public void setDailyStatistics(Set<DailyStatistics> dailyStatistics) {
		this.dailyStatistics = dailyStatistics;
	}

	public void setUserHasAccess(Boolean userHasAccess) {
		this.userHasAccess = userHasAccess;
	}

}
