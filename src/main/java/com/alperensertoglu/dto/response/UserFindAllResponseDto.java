package com.alperensertoglu.alperensertoglu.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserFindAllResponseDto {
    Long id;
    String firstName;
    String lastName;
    String email;
}
