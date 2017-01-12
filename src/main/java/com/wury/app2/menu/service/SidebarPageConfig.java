package com.wury.app2.menu.service;

import java.util.List;

import com.wury.app2.menu.model.SidebarPage;

public interface SidebarPageConfig {
	
	public List<SidebarPage> getPages();
	
	public SidebarPage getPage(String name);
}
