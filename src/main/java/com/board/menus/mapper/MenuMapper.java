package com.board.menus.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.menus.domain.MenuVo;

@Mapper
public interface MenuMapper {

	// error
	// void insertMenu(String menu_id, String menu_name, int menu_seq);

	// menuMapper.xml 에서 id="insertMenu" SQL 문을 찾아서 실행
	void insertMenu( MenuVo menuVo );

	List<MenuVo> getMenuList();

	void deleteMenu(MenuVo menuVo);

<<<<<<< HEAD
	void insertMenuByName(MenuVo menuVo);

	MenuVo getMenu(String menu_id);
=======
	void insertMenuByname(MenuVo menuVo);
>>>>>>> 9b85d3e254b73402f1933fc7c891b4584f7eaef1

	
}







