package com.alperensertoglu.alperensertoglu.service;

import com.alperensertoglu.alperensertoglu.dto.request.UserSaveRequestDto;
import com.alperensertoglu.alperensertoglu.dto.response.UserFindAllResponseDto;
import com.alperensertoglu.alperensertoglu.mapper.IUserMapper;
import com.alperensertoglu.alperensertoglu.repository.IUserRepository;
import com.alperensertoglu.alperensertoglu.repository.entity.User;
import com.alperensertoglu.alperensertoglu.utility.ServiceManager;
import org.mapstruct.factory.Mappers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService extends ServiceManager<User, Long> {

    private final IUserRepository repository;

    public UserService(IUserRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public User saveDto(UserSaveRequestDto dto) {
        return save(IUserMapper.INSTANCE.fromDto(dto));
    }


    public List<UserFindAllResponseDto> findAllDto() {
        List<UserFindAllResponseDto> list = new ArrayList<>();
        findAll().forEach(x -> {
            list.add(IUserMapper.INSTANCE.fromUser(x));
        });
        return list;
    }

    public Optional<User> findById(Long id) {
        return findById(id);

    }

    public User update(User user) {
        return super.update(user);
    }

    public void delete(User user) {
        delete(user);
    }

}
