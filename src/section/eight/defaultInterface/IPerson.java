package section.eight.defaultInterface;

import java.util.Date;

/**
 * Created by cravo on 08/09/2016.
 */
public interface IPerson {

	default public Date getAge(Date birthday) {
		return birthday;
	}
}
