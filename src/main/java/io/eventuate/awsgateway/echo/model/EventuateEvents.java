package io.eventuate.awsgateway.echo.model;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.List;

public class EventuateEvents {
  private List<EventuateEvent> events;

  public EventuateEvents() {
  }

  public EventuateEvents(List<EventuateEvent> events) {
    this.events = events;
  }

  public List<EventuateEvent> getEvents() {
    return events;
  }

  public void setEvents(List<EventuateEvent> events) {
    this.events = events;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }
}
