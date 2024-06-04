package com.SpringJPA.AyushSharma.user.repository;

import com.SpringJPA.AyushSharma.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long>  {
}
