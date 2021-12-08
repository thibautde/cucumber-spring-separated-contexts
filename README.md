Sample project showing how to run Cucumber tests with JUnit Vintage and with separated Spring contexts.

Launch tests with maven to see each one creating a different Spring context:

```bash
mvn test
```

Each context has a `RunXXXCucumberTests` configuring the Spring test configuration to use.
