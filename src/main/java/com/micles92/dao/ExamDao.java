package com.micles92.dao;

import com.micles92.model.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by lesiulol on 18.05.16.
 */
public interface ExamDao extends JpaRepository<BaseEntity, Long> {
}
