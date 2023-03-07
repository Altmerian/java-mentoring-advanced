package com.pshakhlovich.javamentoringadv.repository;

import com.pshakhlovich.javamentoringadv.config.DataSourceConfig;
import com.pshakhlovich.javamentoringadv.entity.UserInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = DataSourceConfig.class)
class UserInfoRepositoryTest {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Test
    public void whenCalledSave_thenCorrectNumberOfUsers() {

        // given when
        userInfoRepository.save(
                UserInfo.builder()
                        .name("John")
                        .surname("Doe")
                        .birthday(LocalDate.of(2000, 1, 10))
                        .build());
        List<UserInfo> userInfos = (List<UserInfo>) userInfoRepository.findAll();

        // then
        assertThat(userInfos.size()).isEqualTo(1);
    }
}