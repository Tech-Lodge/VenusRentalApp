package com.semicolon.africa.Go_Rent_App.repository;

import com.semicolon.africa.Go_Rent_App.models.EventProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventProductRepo extends JpaRepository<EventProduct, Long>{
    EventProduct findEventProductById(Long request);
//    List<EventProduct> findAllBy();
}
