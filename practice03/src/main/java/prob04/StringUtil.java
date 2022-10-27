package prob04;

import java.util.Arrays;

public class StringUtil {

	public static String concatenate(String[] strArr) {
		String result=Arrays.toString(strArr);
		result=strArr[0]+strArr[1]+strArr[2];
		
		return result;
	}
}
