package com.alperensertoglu.alperensertoglu.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostSaveRequestDto {
    String title;
    String content;
    Long userId;
    Long categoryId;
}
