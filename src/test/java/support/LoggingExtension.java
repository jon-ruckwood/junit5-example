package support;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.TestExtensionContext;

/**
 * Simple extension to (uselessly) print to stdout before and after test execution.
 */
public class LoggingExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {
    @Override
    public void afterTestExecution(TestExtensionContext testExtensionContext) throws Exception {
        System.out.println("AFTER!");
    }

    @Override
    public void beforeTestExecution(TestExtensionContext testExtensionContext) throws Exception {
        System.out.println("BEFORE!");
    }
}
