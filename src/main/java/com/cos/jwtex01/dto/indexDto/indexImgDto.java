package com.cos.jwtex01.dto.indexDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//여긴 인덱스메인에 걸리는 dto입니다.

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class indexImgDto {
private int id;
private String bgImg;
}
