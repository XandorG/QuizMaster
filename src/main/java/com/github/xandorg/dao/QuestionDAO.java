package com.github.xandorg.dao;

import com.github.xandorg.entity.Question;

import java.util.List;
import java.util.Optional;

public interface QuestionDAO {
    void save(Question question);
    Optional<Question> findById(Long id);
    List<Question> findAll();
    void update(Question question);
    void delete(Question question);
}
