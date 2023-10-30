package com.spring.semi.main.Entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
// ���� �Һз� ��ƼƼ
public class JobCategory {
	
	private String smallCategoryCode;
	private String smallCategoryName;
}
