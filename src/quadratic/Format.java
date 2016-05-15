package quadratic;

/**
 * Class there is all methods for formating  quadratic equations in string.
 */

public class Format {
	private String[] names = new String[0];
	private String[] inNames =  new String[0];
	private Double[] inValues = new Double[0];
	private Double[] values = new Double[0];
	private String error = "";
	private int cursor = 0;
	private char separator = '=';


	//Public method for seting lenght and names formating
	public void setNames(String[] names) {
		this.setLength(names.length);
		for(int i=0;i < names.length;i++) {
			this.names[i] = names[i];
		}
	}

	//private method for set length of arrays
	private void setLength(int length) {
		this.names = new String[length];
		this.inNames = new String[length];
		this.inValues = new Double[length];
		this.values = new Double[length];
	}

	//private method for finding names in line
	private String findNames(String line) throws IdentifyFormatException {
		int length = line.length();
		int strIx = this.cursor;
		for(;strIx < length;strIx++){
			if(!isSpace(line.charAt(strIx)))break;
		}
		if(strIx == length)return null;
		int endIx = strIx;
		for(;endIx < length;endIx++){
			if(isSpace(line.charAt(endIx))||line.charAt(endIx) == this.separator)break;
		}
		for(int i=endIx;i < length;i++) {
			if(!isSpace(line.charAt(i))) throw new IdentifyFormatException();
			else if(line.charAt(i) == this.separator) break;
		}
		this.cursor = endIx;
		return line.substring(strIx,endIx);
	}

	//private method for finding value in line
	private Double findValue(String line) {
		int length = line.length();
		int strIx = this.cursor;
		for(;strIx < length;strIx++) {
			if(!isSpace(line.charAt(strIx)))break;
		}
		if(strIx == length) return null;
		int endIx = strIx;
		for(;endIx < length;endIx++) {
			if(isSpace(line.charAt(endIx)))break;
		}
		line = line.substring(strIx,endIx);
		try {
			return Double.parseDouble(line);
		}catch (NumberFormatException e){
			this.error = "Not rigth value at position " + this.cursor;
			return null;
		}
	}

	//private methods for checking values , returns true or false
	private boolean isSpace(char ch) { if(ch == ' ')return true;else return false; }

	//methods for get values of private fields of class
	public String[] getNames(){	return this.names;	}
	public char getSeparator() { return this.separator; }

	//methods for set values of private fields of class
	public void setSeparator(char separator){ this.separator = separator; }
}