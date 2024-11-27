package com.metacoding.authblog.user;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.util.Optional;

@DataJpaTest
@Import({ UserRepository.class })
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepo;

    @Test
    public void findByUsername_test() {
        //given
        String username = "ssar";

        //when
        User user = userRepo.findByUsername(username);

        //then
        Assertions.assertThat(user).isNotNull();
    }
}
