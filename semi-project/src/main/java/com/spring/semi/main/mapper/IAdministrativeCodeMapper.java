package com.spring.semi.main.mapper;

import com.spring.semi.main.Entity.AdministrativeCode;

//행정명 코드 Mapper
public interface IAdministrativeCodeMapper {
	// 전체이름에서 행정동 코드 얻기
	int getCode(AdministrativeCode code);
	// 읍면동으로 행정동 코드 얻기
	int getCode(String eupMyeongDong);
}
