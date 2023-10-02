package com.alperensertoglu.alperensertoglu.controller;

import com.alperensertoglu.alperensertoglu.dto.request.PostSaveRequestDto;
import com.alperensertoglu.alperensertoglu.dto.response.PostFindAllResponseDto;
import com.alperensertoglu.alperensertoglu.repository.entity.Post;
import com.alperensertoglu.alperensertoglu.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.alperensertoglu.alperensertoglu.constant.EndPoints.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(POSTS+API+VERSION)
public class PostController {
 private final PostService service;
    @GetMapping(GETALL)
    public ResponseEntity<List<PostFindAllResponseDto>> findAll(){
        return ResponseEntity.ok(service.findAllPostDto());
    }

    @GetMapping(FINDBYID)
    public ResponseEntity<Post> findById(@PathVariable Long id){
        return ResponseEntity.ok(service.findById(id).get());
    }

    @PostMapping(POST)
    public ResponseEntity<String> savePostDto(PostSaveRequestDto dto){
        service.savePostDto(dto);
        return ResponseEntity.ok("Başarılı");
    }
    @PutMapping(UPDATE)
    public ResponseEntity<String> update(Post post){
        service.update(post);
       return ResponseEntity.ok("Güncelleme başarılı");
    }
    @DeleteMapping(DELETE)
    public ResponseEntity<String> delete(Post post){
        service.delete(post);
        return ResponseEntity.ok("Silme işlemi başarılı");
    }

    @GetMapping(USER+"/{id}")
    public ResponseEntity<List<Post>> getPostsWithUserId(@PathVariable Long id){
        return ResponseEntity.ok(service.findAllByUserId(id));
    }

    @GetMapping(CATEGORY+"/{id}")
    public ResponseEntity<List<Post>> getPostsWithCategoryId(@PathVariable Long id){
        return ResponseEntity.ok(service.findAllByCategoryId(id));
    }
}
