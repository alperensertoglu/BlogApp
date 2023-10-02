package com.alperensertoglu.alperensertoglu.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserSaveRequestDto {
    String firstName;
    String lastName;
    String email;
    String password;
}
