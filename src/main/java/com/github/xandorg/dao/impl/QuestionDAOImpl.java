package com.github.xandorg.dao.impl;

import com.github.xandorg.dao.QuestionDAO;
import com.github.xandorg.entity.Answer;
import com.github.xandorg.entity.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Optional;

public class QuestionDAOImpl implements QuestionDAO {
    private final SessionFactory sessionFactory;

    public QuestionDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Question question) {
        try (Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();
            session.persist(question);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Optional<Question> findById(Long id) {
        try (Session session = sessionFactory.openSession()){
            return Optional.ofNullable(session.get(Question.class, id));
        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public List<Question> findAll() {
        try (Session session = sessionFactory.openSession()){
            return session.createQuery("from Question", Question.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return List.of();
        }
    }

    @Override
    public void update(Question question) {
        try (Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();
            session.merge(question);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Question question) {
        try (Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();
            String query = "FROM Answer WHERE question.id = :questionId";
            List<Answer> answers = session.createQuery(query, Answer.class)
                    .setParameter("questionId", question.getId())
                    .list();
            if (!answers.isEmpty()) {
                throw new IllegalStateException("Cannot delete question before answers have been deleted");
            }
            session.remove(question);
            transaction.commit();
        }
    }
}
