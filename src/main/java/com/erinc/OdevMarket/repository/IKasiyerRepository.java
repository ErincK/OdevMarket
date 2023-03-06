package com.erinc.OdevMarket.repository;

import com.erinc.OdevMarket.repository.entity.Kasiyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IKasiyerRepository extends JpaRepository<Kasiyer,Long> {
}
