package com.github.xandorg.dao.impl;

import com.github.xandorg.dao.AnswerDAO;
import com.github.xandorg.entity.Answer;
import com.github.xandorg.entity.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Optional;

public class AnswerDAOImpl implements AnswerDAO {
    private final SessionFactory sessionFactory;

    public AnswerDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Answer answer) {
        try (Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();
            session.persist(answer);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Optional<Answer> findById(Long id) {
        try (Session session = sessionFactory.openSession()){
            return Optional.ofNullable(session.get(Answer.class, id));
        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public List<Answer> findAll() {
        try (Session session = sessionFactory.openSession()){
            return session.createQuery("from Answer", Answer.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return List.of();
        }
    }

    @Override
    public void update(Answer answer) {
        try (Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();
            session.merge(answer);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Answer answer) {
        try (Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();
            session.remove(answer);
            transaction.commit();
        }
    }

    @Override
    public List<Answer> findByQuestionId(Long questionId) {
        try (Session session = sessionFactory.openSession()) {
            String query = "FROM Answer WHERE question.id = :questionId";
            return session.createQuery(query, Answer.class)
                    .setParameter("questionId", questionId)
                    .list();
        } catch (Exception e) {
            e.printStackTrace();
            return List.of();
        }
    }
}
