package com.wury.app2.menu.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import com.wury.app2.menu.model.SidebarPage;

public class SidebarPageConfigAjaxImpl implements SidebarPageConfig {
	
	private HashMap<String, SidebarPage> pageMap = new LinkedHashMap<String, SidebarPage>();
	
	public SidebarPageConfigAjaxImpl(){
		pageMap.put("gh",new SidebarPage("zk","wury's github","/images/facebook-logo.png","https://github.com/wuriyanto48"));
		pageMap.put("demo",new SidebarPage("demo","ZK Demo","/images/facebook-logo.png","http://www.zkoss.org/zkdemo"));
		
		pageMap.put("fn1",new SidebarPage("fn1","Post","/images/facebook-logo.png","/WEB-INF/page/posts_list.zul"));
		pageMap.put("fn2",new SidebarPage("fn2","Albums","/images/facebook-logo.png","/WEB-INF/page/posts_list.zul"));
		pageMap.put("fn3",new SidebarPage("fn3","Photos","/images/facebook-logo.png","/WEB-INF/page/photo_list.zul"));
	}

	public List<SidebarPage> getPages() {
		return new ArrayList<SidebarPage>(pageMap.values());
	}

	public SidebarPage getPage(String name) {
		return pageMap.get(name);
	}

}
