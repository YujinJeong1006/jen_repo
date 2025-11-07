package com.yujin.bootproject.repository;

import com.yujin.bootproject.entity.CalculationHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CalculationHistoryRepository extends JpaRepository<CalculationHistory, Long> {
    List<CalculationHistory> findAllByOrderByCreatedAtDesc();
}
