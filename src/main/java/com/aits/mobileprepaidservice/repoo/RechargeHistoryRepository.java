package com.aits.mobileprepaidservice.repoo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aits.mobileprepaidservice.entity.RechargeHistory;

import java.util.List;

public interface RechargeHistoryRepository extends JpaRepository<RechargeHistory, Long> {

	List<RechargeHistory> findByUserId(Long userId);
}
