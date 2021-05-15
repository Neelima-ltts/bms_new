package com.ltts.movieticketbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltts.movieticketbooking.model.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Integer>{

}