package org.haileab.waaaug2023springdata.repository;

import org.haileab.waaaug2023springdata.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
