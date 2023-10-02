package com.alperensertoglu.alperensertoglu.controller;

import com.alperensertoglu.alperensertoglu.repository.entity.Category;
import com.alperensertoglu.alperensertoglu.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.alperensertoglu.alperensertoglu.constant.EndPoints.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(CATEGORIES)
public class CategoryController {
    private final CategoryService service;

    @GetMapping(GETALL)
    public ResponseEntity<List<Category>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(FINDBYID)
    public ResponseEntity<Category> findById(Long id) {
        return ResponseEntity.ok(service.findById(id).get());
    }

    @PostMapping(SAVE)
    public ResponseEntity<String> save(Category category) {
        service.save(category);
        return ResponseEntity.ok("Kaydetme başarılı");
    }
    @PutMapping(UPDATE)
    public ResponseEntity<String> update(Category category){
        service.update(category);
        return ResponseEntity.ok("Güncelleme başarılı");
    }
    @DeleteMapping(DELETE)
    public ResponseEntity<String> delete(Category category){
        service.delete(category);
        return ResponseEntity.ok("Silme işlemi başarılı");
    }

}

