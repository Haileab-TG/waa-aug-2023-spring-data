package org.haileab.waaaug2023springdata.repository;

import org.haileab.waaaug2023springdata.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Integer> {
}
