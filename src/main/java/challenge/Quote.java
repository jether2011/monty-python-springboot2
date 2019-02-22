package challenge;

import java.io.Serializable;

public final class Quote implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String actor;
	private String quote;

	/**
	 * Constructor to framework use
	 */
	public Quote() {}
	
	private Quote(Integer id, String actor, String quote){
		this.actor = actor;
		this.quote = quote;
	}

	public static Quote of(Integer id, String actor, String quote) {
		return new Quote(id, actor, quote);
	}

	public Integer getId() {
		return this.id;
	}

	public String getActor() {
		return this.actor;
	}
	
	public String getQuote() {
		return this.quote;
	}
	
	/**
	 * Need the Setters to use in Code:Nation test
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Quote [id=").append(id).append(", actor=").append(actor).append(", quote=").append(quote)
				.append("]");
		return builder.toString();
	}
}
