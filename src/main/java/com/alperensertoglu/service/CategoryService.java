package com.alperensertoglu.alperensertoglu.service;

import com.alperensertoglu.alperensertoglu.repository.ICategoryRepository;
import com.alperensertoglu.alperensertoglu.repository.entity.Category;
import com.alperensertoglu.alperensertoglu.repository.entity.User;
import com.alperensertoglu.alperensertoglu.utility.ServiceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService extends ServiceManager<Category, Long> {
    private final ICategoryRepository repository;

    public CategoryService(ICategoryRepository repository) {
        super(repository);
        this.repository = repository;
    }

    @Override
    public Category save(Category category) {
        return save(category);
    }
}
