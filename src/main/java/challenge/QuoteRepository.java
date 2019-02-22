package challenge;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public interface QuoteRepository {
    @Autowired
    jdbcTemplate jdbcTemplate;      
}
