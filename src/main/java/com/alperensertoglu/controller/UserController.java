package com.alperensertoglu.alperensertoglu.controller;

import com.alperensertoglu.alperensertoglu.dto.request.UserSaveRequestDto;
import com.alperensertoglu.alperensertoglu.dto.response.UserFindAllResponseDto;
import com.alperensertoglu.alperensertoglu.repository.entity.User;
import com.alperensertoglu.alperensertoglu.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.alperensertoglu.alperensertoglu.constant.EndPoints.*;

import java.util.List;

@RestController
@RequestMapping(USERS+API+VERSION)
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @PostMapping(SAVE)
    public ResponseEntity<String> save(UserSaveRequestDto dto) {
        service.saveDto(dto);
        return ResponseEntity.ok("Kayıt başarılı");
    }

    @GetMapping(GETALL)
    public ResponseEntity<List<UserFindAllResponseDto>> findAllDto(){
       return ResponseEntity.ok(service.findAllDto());
    }

    @GetMapping(FINDBYID)
    public ResponseEntity<User> findById(@PathVariable Long id){
        return ResponseEntity.ok(service.findById(id).get());
    }

    @PutMapping(UPDATE)
    public ResponseEntity<String> update(User user){
    service.update(user);
    return ResponseEntity.ok("Güncelleme başarılı");
    }

    @DeleteMapping(DELETE)
    public ResponseEntity<String> delete(User user){
        service.delete(user);
        return ResponseEntity.ok("Silme işlemi başarılı");
    }
}
