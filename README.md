# EmApp

This is just a design study. It is not pseudo code but the intent is the same: I just wanted to study the design of the creation of a user that receives in input also some roles that needs to be checked the existence for.

## Maven Lifecycle
To build and run the all the tests use:
```shell
$ mvn verify
```

While to launch only the unit tests:
```shell
$ mvn clean install -Punit-tests-only
```

While to launch only the integration tests:
```shell
$ mvn clean install -Pintegration-tests-only
```

## Running the application
To run the application, you need to build it using maven and then to launch the command:
```shell
$ java -jar emapp.jar
```