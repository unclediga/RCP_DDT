package ddt.model;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.equinox.log.Logger;

import javax.inject.Inject;

public class Root  extends PlatformObject{
	
	Dept rootDept;
	
	@Inject Logger logger;
	
	public Object[] getChildren(){
		
		logger.log(IStatus.ERROR,"getCh() Root");
		System.out.println("getCh() Root");
		
		if (rootDept == null){
			rootDept = Model.getDeptTree();
		}
		return new Object[] {rootDept}; 
	}

	public Root() {
		super();
		System.out.println("!!!Root");
		logger.log(IStatus.ERROR,"Root ()");
	}
	
	
	

	
}
