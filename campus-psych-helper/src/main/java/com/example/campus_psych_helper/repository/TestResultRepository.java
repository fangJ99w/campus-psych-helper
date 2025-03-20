package com.example.campus_psych_helper.repository;

import com.example.campus_psych_helper.entity.TestResult;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TestResultRepository extends JpaRepository<TestResult, Long> {
    List<TestResult> findByUserId(Long userId);
    List<TestResult> findByTestId(Long testId);
}