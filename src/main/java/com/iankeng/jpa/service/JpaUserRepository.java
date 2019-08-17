package com.iankeng.jpa.service;

import com.iankeng.jpa.data.JpaUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ian
 * @date 2019/8/17 17:46
 */
public interface JpaUserRepository extends JpaRepository<JpaUser, Integer> {
}
