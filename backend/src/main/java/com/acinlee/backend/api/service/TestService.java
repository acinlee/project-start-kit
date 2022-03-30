package com.acinlee.backend.api.service;

import com.acinlee.backend.api.entity.TestEntity;
import com.acinlee.backend.api.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestRepository testRepository;

    public TestEntity join(String userId, String userPw) {
        TestEntity test = TestEntity.builder()
                .userId(userId)
                .userPw(userPw)
                .build();
        return testRepository.save(test);
    }

    public boolean login(String userId, String userPw) {
        TestEntity test = this.getUser(userId);
        if( test != null ) {
            if ( (userPw).equals(test.getUserPw())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public TestEntity getUser(String userId) {
        TestEntity user = testRepository.findById(userId).orElse(null);
        return user;
    }
}
