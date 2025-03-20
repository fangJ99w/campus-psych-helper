package com.example.campus_psych_helper.repository;


import com.example.campus_psych_helper.entity.PsychologicalTest;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PsychologicalTestRepository extends JpaRepository<PsychologicalTest, Long> {
    // 根据标题查找心理测评
    List<PsychologicalTest> findByTitle(String title);

    // 根据标题和描述查找心理测评
    List<PsychologicalTest> findByTitleAndDescription(String title, String description);

    // 根据描述包含特定关键词查找心理测评
    List<PsychologicalTest> findByDescriptionContaining(String keyword);
}
