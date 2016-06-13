package com.micles92.dao;

import com.micles92.model.BaseEntity;
import com.micles92.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by lesiulol on 18.05.16.
 */
@Repository
public interface ExamDao extends JpaRepository<Exam, Long> {

}
