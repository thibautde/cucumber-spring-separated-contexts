## Cucumber tests with separated Spring contexts

Sample project showing how to run Cucumber tests with JUnit Vintage and with separated Spring contexts.

Launch tests with maven to see each one creating a different Spring context:

```bash
mvn test
```

Each context has a `RunXXXCucumberTests` configuring the Spring test configuration to use.

### Junit Vintage and JUnit Platform

The main branch execute Cucumber tests using Junit Vintage. You can see usage of JUnit Platform in the `junit-platform`
branch.

More info on [Cucumber Spring doc](https://github.com/cucumber/cucumber-jvm/tree/main/junit-platform-engine).
