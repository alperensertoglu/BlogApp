package com.alperensertoglu.alperensertoglu.repository;

import com.alperensertoglu.alperensertoglu.repository.entity.Category;
import com.alperensertoglu.alperensertoglu.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category,Long> {
}
