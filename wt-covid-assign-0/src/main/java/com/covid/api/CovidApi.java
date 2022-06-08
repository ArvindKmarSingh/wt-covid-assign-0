package com.covid.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.covid.entity.Slot;
import com.covid.service.SlotService;

@RestController
@RequestMapping("/api/covid/slot")
public class CovidApi {

	@Autowired
	private SlotService service;

	/**
	 * 
	 * this API is used to get all the available slots
	 * 
	 * @return
	 */
	@GetMapping(value = "/all", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Slot> getSlots() {
		return service.getSlots();
	}

	/**
	 * 
	 * This API is only used by system Admins to create the slots
	 * 
	 * @param slot
	 * @return
	 */
	@PostMapping(value = "/create-slot", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE })
	public Slot CreateSlot(@RequestBody Slot slot) {
		return service.save(slot);
	}

	/**
	 * 
	 * This API is used to book the slot
	 * 
	 * @param slot
	 * @return
	 */
	
	@PostMapping(value = "/book", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE })
	public String bookSlot(@RequestBody Slot slot) {
		return service.bookSlot(slot);
	}


	/**
	 * 
	 * This API is used to cancel the slot
	 * 
	 * @param slot
	 * @return
	 */
	
	@PostMapping(value = "/cancel", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE })
	public String cancelSlot(@RequestBody Slot slot) {
		return service.cancelSlot(slot);
	}

	
	/**
	 * This API is used to get the single slot details
	 * @param srno
	 * @return
	 */
	
	@GetMapping(value = "/get", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Slot getSlot(@RequestParam("srno") int srno) {
		return service.getSlot(srno);
	}

	
	/**
	 * This API is used to get all booked slots
	 * @return
	 */
	@GetMapping(value = "/booked", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Slot> getBookedSlots() {
		return service.getBookedSlots();
	}

	/**
	 * This API is used to get all available slots
	 * @return
	 */
	@GetMapping(value = "/available", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Slot> getAvailableSlots() {
		return service.getAvailableSlots();
	}
	
	
	
}
