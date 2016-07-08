# junit5-quickstart

Reference project for getting started with [JUnit 5][0], [Mockito][1] and [AssertJ][2].

#### Notes

* Currently relies on a copy of [`MockitoExtension`][3] instead of official Mockito support.
* Uses `JUnitPlatform.class` runner (i.e. JUnit 4 functionality) for IDE integration (this doesn't support all JUnit 5 features)

#### Summary 

JUnit 5 support is promising but IDE integration from major testing libraries, e.g. Mockito, is required before jumping on board.

[0]: http://junit.org/junit5/
[1]: http://mockito.org
[2]: http://joel-costigliola.github.io/assertj/
[3]: https://github.com/junit-team/junit5-samples/blob/master/junit5-mockito-extension/src/main/java/com/example/mockito/MockitoExtension.java
