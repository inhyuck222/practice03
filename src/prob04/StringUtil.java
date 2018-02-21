package prob04;

public class StringUtil {
	public static String concatenate( String[] str ) {
		if(str == null) {
			return "";
		}
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<str.length;i++) {
			sb.append(str[i]);
		}
		
		return sb.toString();
	}
	
}
