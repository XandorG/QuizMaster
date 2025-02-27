package com.github.xandorg.dao;

import com.github.xandorg.entity.Answer;

import java.util.List;
import java.util.Optional;

public interface AnswerDAO {
    void save(Answer answer);
    Optional<Answer> findById(Long id);
    List<Answer> findAll();
    void update(Answer answer);
    void delete(Answer answer);
    List<Answer> findByQuestionId(Long departmentId);
}
