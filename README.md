# Example Java AWS Lambda function for Eventuate

This is a simple [Serverless framework](http://serverless.com/)-based AWS lambda function that illustrates how to subscribe to events published by [Eventuate SaaS](http://eventuate.io/).

To install the [Eventuate AWS Gateway plugin for Serverless](https://github.com/eventuate-clients/eventuate-aws-gateway-serverless-plugin):

```
npm install
```

When the lambda is deployed, this plugin registers it with Eventuate.
When the lambda undeployed, the plugin unregisters it.
See the `serverless.yml` for the details of how the events of interest are specified.

This particular lambda subscribes to events published by the [Todo List Application](https://github.com/eventuate-examples/eventuate-examples-java-spring-todo-list).

To build the lambda:

```
./gradlew buildZip
```

Set the Eventuate environment variables: `EVENTUATE_API_KEY_ID` and `EVENTUATE_API_KEY_SECRET`.


To deploy the lambda:

```
serverless deploy
```

Events published by the [Todo List Application](https://github.com/eventuate-examples/eventuate-examples-java-spring-todo-list) will now be delivered to  this lambda.
You could, for example, run `build-and-test-all.sh` to generate events.

You can verify that the lambda has been invoked by looking at the logs:

```
serverless logs -f todoEchoLambda
```
