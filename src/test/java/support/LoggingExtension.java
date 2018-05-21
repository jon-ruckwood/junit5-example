package support;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

/**
 * A useless extension to  print to stdout before and after test execution.
 */
public class LoggingExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {
    @Override
    public void afterTestExecution(ExtensionContext testExtensionContext) {
        System.out.println("AFTER!");
    }

    @Override
    public void beforeTestExecution(ExtensionContext testExtensionContext) {
        System.out.println("BEFORE!");
    }
}
