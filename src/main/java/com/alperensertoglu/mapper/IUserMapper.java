package com.alperensertoglu.alperensertoglu.mapper;

import com.alperensertoglu.alperensertoglu.dto.request.UserSaveRequestDto;
import com.alperensertoglu.alperensertoglu.dto.response.UserFindAllResponseDto;
import com.alperensertoglu.alperensertoglu.repository.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IUserMapper {
    IUserMapper INSTANCE = Mappers.getMapper(IUserMapper.class);
    UserFindAllResponseDto fromUser(final User user);
    // User'dan dto'ya mapleme işlemi önemli olan parantez içi
    User fromDto(final UserSaveRequestDto dto);
    // Dto'dan User'a save işlemi için mapleme
}
