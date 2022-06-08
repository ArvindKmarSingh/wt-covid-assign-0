package com.covid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.covid.entity.Slot;
import com.covid.repository.SlotRepository;

@Service
public class SlotService {

	@Autowired
	private SlotRepository repository;

	@Transactional(readOnly = true)
	public List<Slot> getSlots() {
		return repository.findAll();
	}

	@Transactional(readOnly = false)
	public Slot save(Slot slot) {
		return repository.save(slot);
	}

	@Transactional(readOnly = false)
	public String bookSlot(Slot slot) {
		repository.bookSlot(slot.getSrno());
		return "Your slot booked successfully";
	}

	@Transactional(readOnly = false)
	public String cancelSlot(Slot slot) {
		repository.cancelSlot(slot.getSrno());
		return "Your slot canceled successfully";
	}
	
	
	@Transactional(readOnly = true)
	public Slot getSlot(int srno) {
		return repository.findBySrno(srno);
	}

	@Transactional(readOnly = true)
	public List<Slot> getBookedSlots() {
		return repository.findByIsBookedTrue();
	}

	@Transactional(readOnly = true)
	public List<Slot> getAvailableSlots() {
		return repository.findByIsBookedFalse();
	}

}
