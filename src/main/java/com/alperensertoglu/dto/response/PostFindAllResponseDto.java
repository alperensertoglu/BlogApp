package com.alperensertoglu.alperensertoglu.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostFindAllResponseDto {
    String title;
    String content;
    Long userId;
    Long categoryId;

}
