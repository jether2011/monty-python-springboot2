package challenge;

import static challenge.Constants.*;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {
		V1 + QUOTE
})
public class QuoteController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private QuoteService service;

	@GetMapping
	public ResponseEntity<Quote> getQuote() {
		return ResponseEntity.ok().body(this.service.getQuote());
	}

	@GetMapping("/{actor}")
	public ResponseEntity<Quote> getQuoteByActor(@PathVariable String actor) {
		return ResponseEntity.ok().body(this.service.getQuoteByActor(actor));
	}

}
