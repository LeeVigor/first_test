import java.util.*;
import java.text.*;

class DateDemo 
{
	public static void main(String[] args) 
	{
		Date d=new Date();
		System.out.println(d);
		//将模式封装到SimpleDateFormat对象中
		SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss E a 第ww周");
		// E 表示星期中的天数 a  AM/PM标记 w 年中的周数
		//调用format方法让模式格式化指定Date对象
		String CurrentTime=s.format(d);
		System.out.println(CurrentTime);
	}
}
