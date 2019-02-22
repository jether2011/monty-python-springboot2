package challenge;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Quote implements Serializable {

	private static final long serialVersionUID = 1L;
	@JsonIgnore
	private Integer id;
	@JsonProperty("actor")
	private String actor;
	@JsonProperty("quote")
	private String quote;

	private Quote(Integer id, String actor, String quote){
		this.actor = actor;
		this.quote = quote;
	}

	public static Quote of(Integer id, String actor, String quote) {
		return new Quote(id, actor, quote);
	}

	/**
	 * Gettters
	 */
	public Integer getId() {
		return null;
	}

	// public void setId(Integer id) {

	// }

	public String getActor() {
		return null;
	}

	// public void setActor(String actor) {

	// }

	public String getQuote() {
		return null;
	}

	// public void setQuote(String quote) {

	// }
}
