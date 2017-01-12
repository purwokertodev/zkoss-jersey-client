package com.wury.app2.menu.vm;

import java.util.List;

import com.wury.app2.menu.model.SidebarPage;
import com.wury.app2.menu.service.SidebarPageConfig;
import com.wury.app2.menu.service.SidebarPageConfigAjaxImpl;

public class SidebarAjaxViewModel {

private SidebarPageConfig pageConfig = new SidebarPageConfigAjaxImpl();
	
	public List<SidebarPage> getSidebarPages() {
		return pageConfig.getPages();
	}
}
