package swager.appli;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/tickets")
public class Controller1 {
    private static List<Ticket> tickets = new ArrayList<Ticket>();
	
	@GetMapping
	public List<Ticket> getticket(){
		return tickets;
		
	}
	
	@PostMapping
	public Ticket addticket(@RequestBody Ticket ticket) {
		tickets.add(ticket);
		return ticket;
	}
    
    
}
