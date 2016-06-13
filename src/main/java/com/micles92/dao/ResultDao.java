package com.micles92.dao;

import com.micles92.model.Exam;
import com.micles92.model.Result;
import com.micles92.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lesiulol on 13.06.16.
 */
@Repository
public interface ResultDao extends JpaRepository<Result,Long> {
    Result findByUserAndExam(User user, Exam exam);
}
