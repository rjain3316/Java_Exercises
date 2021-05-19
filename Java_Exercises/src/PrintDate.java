import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintDate {

	public static void main(String[] args) {
		
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("d/M/yyyy");
		SimpleDateFormat sdf1=new SimpleDateFormat("d/M/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(sdf1.format(d));
		System.out.println(d.toString());
		
	}

}
