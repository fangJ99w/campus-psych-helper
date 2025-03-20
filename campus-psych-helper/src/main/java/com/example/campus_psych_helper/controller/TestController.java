package com.example.campus_psych_helper.controller;

import com.example.campus_psych_helper.entity.PsychologicalTest;
import com.example.campus_psych_helper.entity.TestResult;
import com.example.campus_psych_helper.repository.PsychologicalTestRepository;
import com.example.campus_psych_helper.repository.TestResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tests")
public class TestController {

    @Autowired
    private PsychologicalTestRepository testRepository;

    @Autowired
    private TestResultRepository resultRepository;

    @PostMapping("/create")
    public PsychologicalTest createTest(@RequestBody PsychologicalTest test) {
        return testRepository.save(test);
    }

    @PostMapping("/submit")
    public TestResult submitTestResult(@RequestBody TestResult result) {
        return resultRepository.save(result);
    }
}
