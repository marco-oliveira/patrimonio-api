package com.marco.patrimonio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marco.patrimonio.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
 
}
