package com.alperensertoglu.alperensertoglu.mapper;

import com.alperensertoglu.alperensertoglu.dto.request.PostSaveRequestDto;
import com.alperensertoglu.alperensertoglu.dto.response.PostFindAllResponseDto;
import com.alperensertoglu.alperensertoglu.repository.entity.Post;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IPostMapper {

    IPostMapper INSTANCE = Mappers.getMapper(IPostMapper.class);

    Post fromDto (final PostSaveRequestDto dto);
    PostFindAllResponseDto fromPost(final Post post);
}
