package com.covid.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.covid.entity.Slot;

public interface SlotRepository extends JpaRepository<Slot, Integer> {

	List<Slot> findAll();

	Slot save(Slot slot);

	@Modifying
	@Query(value = "update slot set status = true where slot.srno = ?1", nativeQuery = true)
	void bookSlot(int srno);

	@Modifying
	@Query(value = "update slot set status = false where slot.srno = ?1", nativeQuery = true)
	void cancelSlot(int srno);
	
	Slot findBySrno(int srno);

	List<Slot> findByIsBookedTrue();

	List<Slot> findByIsBookedFalse();

//	List<Slot> findSlotWhereStatusIsNull();

}
