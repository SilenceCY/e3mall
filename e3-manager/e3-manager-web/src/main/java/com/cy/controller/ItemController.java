package com.cy.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cy.pojo.TbItem;
import com.cy.service.ItemService;

@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value="/item/{itemId}")
	@ResponseBody
	public TbItem findTbItemById(@PathVariable Long itemId){
		TbItem item = itemService.findItemById(itemId);
		return item;
	}

}
