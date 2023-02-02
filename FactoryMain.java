import com.phone.Factory;
import com.phone.OS;
import com.phone.IOS;
import com.phone.Android;
import com.phone.Windows;

public class FactoryMain {
	public static void main(String[] args) {
		
		Factory of=new Factory();
		OS obj = of.getInstance("close");
		obj.spec();
	}

}
