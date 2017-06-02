package io.eventuate.awsgateway.echo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import io.eventuate.awsgateway.echo.model.EventuateEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EchoLambdaHandler implements RequestHandler<EventuateEvents, Void> {
  private Logger logger = LoggerFactory.getLogger(this.getClass());

  @Override
  public Void handleRequest(EventuateEvents input, Context context) {
    logger.debug("Got request: {}", input.toString());
    return null;
  }
}
