package com.pshakhlovich.javamentoringadv.repository;

import com.pshakhlovich.javamentoringadv.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends CrudRepository<UserInfo, Long> {
}
