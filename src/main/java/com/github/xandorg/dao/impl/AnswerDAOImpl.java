package com.github.xandorg.dao.impl;

import com.github.xandorg.dao.AnswerDAO;
import com.github.xandorg.entity.Answer;

import java.util.List;
import java.util.Optional;

public class AnswerDAOImpl implements AnswerDAO {
    @Override
    public void save(Answer answer) {

    }

    @Override
    public Optional<Answer> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Answer> findAll() {
        return List.of();
    }

    @Override
    public void update(Answer answer) {

    }

    @Override
    public void delete(Answer answer) {

    }

    @Override
    public List<Answer> findByQuestionId(Long departmentId) {
        return List.of();
    }
}
