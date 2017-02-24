package minjpa.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class DailyStatistics {

	private long id;
	private Date snapshotTime;
	private long views;
	private long comments;
	private Video releatedVideo;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public Date getSnapshotTime() {
		return snapshotTime;
	}

	public long getViews() {
		return views;
	}

	public long getComments() {
		return comments;
	}

	@ManyToOne
	public Video getReleatedVideo() {
		return releatedVideo;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setSnapshotTime(Date snapshotTime) {
		this.snapshotTime = snapshotTime;
	}

	public void setViews(long views) {
		this.views = views;
	}

	public void setComments(long comments) {
		this.comments = comments;
	}

	public void setReleatedVideo(Video releatedVideo) {
		this.releatedVideo = releatedVideo;
	}

}
