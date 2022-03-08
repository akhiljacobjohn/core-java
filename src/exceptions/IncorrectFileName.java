package exceptions;

public class IncorrectFileName extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1513469665798651568L;

	public IncorrectFileName(String errmsg, Exception err) {

		super(errmsg, err);
	}
}
