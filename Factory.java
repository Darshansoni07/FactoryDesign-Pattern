package com.phone;




public class Factory {
	
	public OS getInstance(String st) {
		
		if(st.equals("open"))
			return new Android();
		else if(st.equals("close"))
			return new IOS();
		else
			return new Windows();
			
	}

}
