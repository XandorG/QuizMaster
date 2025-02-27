package com.github.xandorg.dao.impl;

import com.github.xandorg.dao.QuestionDAO;
import com.github.xandorg.entity.Question;

import java.util.List;
import java.util.Optional;

public class QuestionDAOImpl implements QuestionDAO {
    @Override
    public void save(Question question) {

    }

    @Override
    public Optional<Question> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Question> findAll() {
        return List.of();
    }

    @Override
    public void update(Question question) {

    }

    @Override
    public void delete(Question question) {

    }
}
