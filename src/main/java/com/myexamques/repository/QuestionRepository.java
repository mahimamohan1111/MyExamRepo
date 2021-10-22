package com.myexamques.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.myexamques.entity.Question;

@Transactional
public interface QuestionRepository extends JpaRepository<Question,Integer> {
    //Question findByName(String name);
	
//	 @Query("SELECT new com.javatechie.jpa.dto.OrderResponse(c.name , p.productName) FROM Customer c JOIN c.products p")
//	    public List<OrderResponse> getJoinInformation();
}

