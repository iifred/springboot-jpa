package com.itfred.springbootjpa.repository;

import com.itfred.springbootjpa.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo,Integer> {
}
