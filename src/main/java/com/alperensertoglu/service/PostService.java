package com.alperensertoglu.alperensertoglu.service;

import com.alperensertoglu.alperensertoglu.dto.request.PostSaveRequestDto;
import com.alperensertoglu.alperensertoglu.dto.response.PostFindAllResponseDto;
import com.alperensertoglu.alperensertoglu.mapper.IPostMapper;
import com.alperensertoglu.alperensertoglu.repository.IPostRepository;
import com.alperensertoglu.alperensertoglu.repository.entity.Post;
import com.alperensertoglu.alperensertoglu.repository.entity.User;
import com.alperensertoglu.alperensertoglu.utility.ServiceManager;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService extends ServiceManager<Post,Long> {
    private final IPostRepository repository;
    public PostService(IPostRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public List<PostFindAllResponseDto> findAllPostDto() {
        List<PostFindAllResponseDto> list = new ArrayList<>();
        findAll().forEach(x->{
            list.add(IPostMapper.INSTANCE.fromPost(x));
        });
    return list;
    }


    public Post savePostDto(PostSaveRequestDto dto) {
      return save(IPostMapper.INSTANCE.fromDto(dto));
    }

    public List<Post> findAllByUserId(Long id) {
        return findAllByUserId(id);
    }

    public List<Post> findAllByCategoryId(Long id) {
        return findAllByCategoryId(id);
    }

    /*

    */
}
