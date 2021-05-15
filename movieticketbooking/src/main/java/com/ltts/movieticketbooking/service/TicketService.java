package com.ltts.movieticketbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.movieticketbooking.model.Ticket;
import com.ltts.movieticketbooking.repository.TicketRepository;

@Service
public class TicketService {

	@Autowired
	private TicketRepository r1;
	
	public List<Ticket> getAllTickets(){
		return r1.findAll();
	}
	public void save(Ticket ticket) {
		r1.save(ticket);
	}
	public Ticket get(int id) {
		return r1.findById(id).get();
	}
	public void delete(int id) {
		r1.deleteById(id);
}
}
