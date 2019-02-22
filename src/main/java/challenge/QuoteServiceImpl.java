package challenge;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class QuoteServiceImpl implements QuoteService {
	@Autowired
    JdbcTemplate template;
    
    class QuoteRowMapper implements RowMapper<Quote> {
		@Override
		public Quote mapRow(ResultSet rs, int rowNum) throws SQLException {
			return Quote.of(rs.getInt("id"), rs.getString("actor"), rs.getString("detail"));
		}
    }

	@Override
	public Quote getQuote() {
		List<Quote> quotes = this.template.query("select id, actor, detail from scripts s where s.actor is not null", new QuoteRowMapper());
		return quotes.stream()
					.skip(new Random().nextInt(quotes.size()-1))
					.findFirst()
					.get();
	}

	@Override
	public Quote getQuoteByActor(String actor) {
		List<Quote> quotes = this.template.query(
				"select id, actor, detail from scripts s where s.actor = ? and s.actor is not null"
				, new Object[] { actor }
				, new QuoteRowMapper()
			);
		
		return quotes.stream()
				.skip(new Random().nextInt(quotes.size()-1))
				.findFirst()
				.get();
	}
}
