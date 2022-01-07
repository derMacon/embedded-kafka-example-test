# embedded-kafka-example-test
Example unit test with an embedded kafka broker for spring 2.6.x

The unit tests use an embedded broker while the production environment communicates via an external. The spring release 2.6.x does not support the embedded broker under windows. The workaround: downgrade version in testing environment (see [docs](https://docs.spring.io/spring-kafka/docs/2.8.1-SNAPSHOT/reference/html/#update-deps)).
