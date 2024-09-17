/*2.Design and implement a class named Logger to manage logging
 *  messages for an application. The class should be implemented as a
 *   singleton to ensure that only one instance of the Logger exists 
 *   throughout the application.

The class should include the following methods:
•	getInstance(): Returns the unique instance of the Logger class.
•	log(String message): Adds a log message to the logger.
•	getLog(): Returns the current log messages as a String.
•	clearLog(): Clears all log messages
*/
package org.assignments.questions;

class Logger{
	String log;
	
	private Logger() {}
	
	private static Logger instance=null;

	public static Logger getInstance() {
		if(instance ==null)
			instance=new Logger();
		return instance;
	}
	
	public void log(String message) {
		this.log=message;
	}
	
	public String getLog() {
		return this.log;
	}
	
	public void clearLog() {
		this.log=null;
	}

	

	
}

public class Main {

	public static void main(String[] args) {
		Logger logger=Logger.getInstance();
		logger.log("Log1");
		logger.log("Log2");
		logger.log("Log3");
		
		
		System.out.println(logger.getLog());
		logger.clearLog();
	}

}
