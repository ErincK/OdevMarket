package com.erinc.OdevMarket.repository;

import com.erinc.OdevMarket.repository.entity.Musteri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMusteriRepository extends JpaRepository<Musteri,Long> {
}
