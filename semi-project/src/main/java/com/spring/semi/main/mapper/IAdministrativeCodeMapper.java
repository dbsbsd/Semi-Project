package com.spring.semi.main.mapper;

import com.spring.semi.main.Entity.AdministrativeCode;

//������ �ڵ� Mapper
public interface IAdministrativeCodeMapper {
	int getCode(AdministrativeCode code);
	int getCode(String eupMyeongDong);
}
