Spring Boot Profile Examples
============================

This is a simple example of using profiles with Spring Boot.  It alters the configuration using annotations and
properties files.  The default profile, as defined in `src/main/resources/application.properties`, is `dev`.

External service integration
----------------------------

There is an example of an external service integration in the `com.adjectivecolournoun.bootprofiles.external`
package.  The interface `ExternalService` defines a simple request and response interaction.  There are three
implementations of the service, enabled in different profiles:

Implementation | Description
---------------|------------
`DevService`   | Enabled in the `dev` profile, this could represent an implementation that speaks to an on-premises version of the service for development purposes.
`LiveService`  | Enabled in the `live` profile, this could represent an implementation that speaks to the real remote service.
`TestService`  | Enabled in the `test` profile, this could represent an implementation that returns canned responses for use in tests.

Properties-configured service
-----------------------------

There is an example of a properties-configured service in `com.adjectivecolournoun.bootprofiles.message.MessageService`.
This uses the property `bootprofiles.message` to set the message it returns.

Running in production mode
--------------------------

Run the application from the root of the project with `./gradlew bootRun`.  The combination of `application.properties`
and `application-live.properties` in the root of the project sets the profile to `live` and sets the live configuration
of the `MessageService`.

Running tests
-------------

There are tests for the two services that use different mechanisms to set the test configuration.

`TestExternalService` uses the [`ActiveProfiles`](http://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/test/context/ActiveProfiles.html) annotation to set the profile to `test`.

`TestMessageService` relies on `src/test/resources/application.properties` to set the `bootprofiles.message` property.