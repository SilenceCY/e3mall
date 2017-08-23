package com.cy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.mapper.TbItemMapper;
import com.cy.pojo.TbItem;
import com.cy.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private TbItemMapper ibItemMapper;

	@Override
	public TbItem findItemById(Long id) {
		TbItem item = ibItemMapper.selectByPrimaryKey(id);
		return item;
	}

}
