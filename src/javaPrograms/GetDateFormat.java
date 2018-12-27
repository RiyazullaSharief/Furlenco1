package javaPrograms;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class GetDateFormat
{
	public static void main(String[] args)
	{
		DateFormat formatDate=new SimpleDateFormat("dd/MM/YYYY");
		Date date=new Date();
		String date1=formatDate.format(date);
		System.out.println("Today's Date is: "+date1);
	}
}
