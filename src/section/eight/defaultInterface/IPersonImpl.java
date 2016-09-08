package section.eight.defaultInterface;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by cravo on 08/09/2016.
 */
public class IPersonImpl implements IPerson {

	public static void main(String... args){
		IPersonImpl iPerson = new IPersonImpl();
		Date age = iPerson.getAge(new Date());
		System.out.println(age);
	}

	@Override
	public Date getAge(Date birthday) {
		Calendar instance = Calendar.getInstance();
		instance.set(Calendar.YEAR, 1987);
		return instance.getTime();
	}
}
