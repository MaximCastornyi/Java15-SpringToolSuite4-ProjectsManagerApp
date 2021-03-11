package com.jpr.pma.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.jpr.pma.entities.UserAccount;

public interface UserAccountRepository extends PagingAndSortingRepository<UserAccount, Long>{

}
