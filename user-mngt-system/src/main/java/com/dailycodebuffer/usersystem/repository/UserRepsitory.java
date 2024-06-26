package com.dailycodebuffer.usersystem.repository;

import com.dailycodebuffer.usersystem.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepsitory extends JpaRepository<UserEntity, Long> {
}
