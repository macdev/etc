import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UseLogback {
	
	private static Logger logger = LoggerFactory.getLogger(UseLogback.class);
	
	public static void main(String[] args) {
		logger.trace("main trace");
		logger.debug("main debug");
		logger.info("main info");
		logger.warn("main warn");
		logger.error("main error");
		System.out.println("---");
		UseLogback.SubClass.printLog();
	}
	
	static class SubClass {
		private static Logger logger2 = LoggerFactory.getLogger("UseLogback.SubClass");
		private static void printLog() {
			logger2.trace("sub trace");
			logger2.debug("sub debug");
			logger2.info("sub info");
			logger2.warn("sub warn");
			logger2.error("sub error");
		}
	}
}
