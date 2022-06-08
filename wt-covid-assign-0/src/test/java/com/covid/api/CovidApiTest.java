package com.covid.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.covid.entity.Slot;
import com.covid.service.SlotService;

@WebMvcTest(value = CovidApi.class)
public class CovidApiTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private SlotService service;

	/**
	 * For Rest API's which is the best way to write the test cases?( getSlotsTest() or getSlotsRestTest() )
	 * @throws Exception
	 */
	
//	@Test
//	public void getSlotsTest() {
//		Slot[] array = new Slot[] { new Slot(1, new Date(2022, 06, 15), true),
//				new Slot(1, new Date(2022, 06, 15), true), new Slot(1, new Date(2022, 06, 15), true) };
//		List<Slot> slots = Arrays.asList(array);
//		
//		when(service.getSlots()).thenReturn(slots);
//		List<Slot> actual = service.getSlots();
//		assertEquals(slots, actual);
//
//	}

	
	
//	@Test
//	public void getSlotsRestTest() throws Exception {
//		Slot[] array = new Slot[] { new Slot(1, new Date(2022, 06, 15), true),
//				new Slot(1, new Date(2022, 06, 15), true), new Slot(1, new Date(2022, 06, 15), true) };
//		List<Slot> slots = Arrays.asList(array);
//		when(service.getSlots()).thenReturn(slots);
//		MockHttpServletRequestBuilder builder  = MockMvcRequestBuilders.get("/api/covid/slot/all");
//		MvcResult result = mockMvc.perform(builder).andReturn();
//		int status = result.getResponse().getStatus();
//		
//		assertEquals(200, status);
//		
//	}

}
