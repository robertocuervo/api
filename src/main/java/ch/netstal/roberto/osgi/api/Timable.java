package ch.netstal.roberto.osgi.api;

/**
 * @author alvr Defines a time printer service. A Timable service prints the
 *         current date and time
 */
public interface Timable {

	/**
	 * @return Prints current date and time
	 */
	public String getCurrentTime();

	/**
	 * Dummy Method in order to test
	 * 
	 * @return Hello as string
	 */
	public String getHello();

}
