package com.wury.app2.menu.vm;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Executions;

import com.wury.app2.menu.model.SidebarPage;

public class NavigationViewModel {

	private String includeSrc = "/WEB-INF/page/home.zul";

	@GlobalCommand("onNavigate")
	@NotifyChange("includeSrc")
	public void onNavigate(@BindingParam("page") SidebarPage page) {
		String locationUri = page.getUri();
		String name = page.getName();
		
		//redirect current url to new location
		if(locationUri.startsWith("http")){
			//open a new browser tab
			Executions.getCurrent().sendRedirect(locationUri);
		} else {
			includeSrc = locationUri;
			
			//advance bookmark control, 
			//bookmark with a prefix
			if(name!=null){
				Executions.getCurrent().getDesktop().setBookmark("p_"+name);
			}
		}
	}

	public String getIncludeSrc() {
		return includeSrc;
	}

}
