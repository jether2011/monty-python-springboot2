package challenge;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author jether.rodrigues
 */
@Entity
@Table(name = "scripts")
public final class Scripts implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "episode")
	private Integer episode;
	@Column(name = "episode_name")
	private String episodeName;
	@Column(name = "segment")
	private String segment;
	@Column(name = "type")
	private String type;
	@Column(name = "actor")
	private String actor;
	@Column(name = "character")
	private String character;
	@Column(name = "detail")
	private String detail;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "record_date")
	private Timestamp recordDate;
	@Column(name = "series")
	private String series;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "transmission_date")
	private Timestamp transmissionDate;

	@Override
	public int hashCode() {
		return Objects.hash(actor, episodeName, id, recordDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Scripts other = (Scripts) obj;
		return Objects.equals(actor, other.actor) && Objects.equals(episodeName, other.episodeName)
				&& Objects.equals(id, other.id) && Objects.equals(recordDate, other.recordDate);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Scripts [id=").append(id).append(", episode=").append(episode).append(", episodeName=")
				.append(episodeName).append(", segment=").append(segment).append(", type=").append(type)
				.append(", actor=").append(actor).append(", character=").append(character).append(", detail=")
				.append(detail).append(", recordDate=").append(recordDate).append(", series=").append(series)
				.append(", transmissionDate=").append(transmissionDate).append("]");
		return builder.toString();
	}
}