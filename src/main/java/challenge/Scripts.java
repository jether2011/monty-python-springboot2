package challenge;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jether.rodrigues
 */
@Entity
@Table(name="scripts")
public final class Scripts implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;
    @Column(name="episode")
    private Integer episode;
    @Column(name="episode_name")
    private String episodeName;
    @Column(name="segment")
    private String segment;
    @Column(name="type")
    private String type;
    @Column(name="actor")
    private String actor;
    @Column(name="character")
    private String character;
    @Column(name="detail")
    private String detail;
    @Column(name="record_date")    
    private LocalDateTime recordDate;
    @Column(name="series")
    private String series;
    @Column(name="transmission_date")    
    private LocalDateTime transmissionDate;

    

}