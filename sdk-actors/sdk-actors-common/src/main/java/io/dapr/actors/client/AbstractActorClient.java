/*
 * Copyright 2021 The Dapr Authors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
limitations under the License.
*/

package io.dapr.actors.client;

import io.dapr.client.DaprApiProtocol;
import io.dapr.config.Properties;
import reactor.core.publisher.Mono;

/**
 * Holds a client for Dapr sidecar communication. ActorClient should be reused.
 */
public class AbstractActorClient implements AutoCloseable {

  /**
   * Dapr's client.
   */
  private final DaprClient daprClient;

  /**
   * Instantiates a new channel for Dapr sidecar communication.
   */
  public AbstractActorClient() {
    this(Properties.API_PROTOCOL.get());
  }

  /**
   * Instantiates a new channel for Dapr sidecar communication.
   *
   * @param apiProtocol Dapr's API protocol.
   */
  private AbstractActorClient(DaprApiProtocol apiProtocol) {
    this.daprClient = buildDaprClient(apiProtocol);
  }

  /**
   * Invokes an Actor method on Dapr.
   *
   * @param actorType   Type of actor.
   * @param actorId     Actor Identifier.
   * @param methodName  Method name to invoke.
   * @param jsonPayload Serialized body.
   * @return Asynchronous result with the Actor's response.
   */
  Mono<byte[]> invoke(String actorType, String actorId, String methodName, byte[] jsonPayload) {
    return daprClient.invoke(actorType, actorId, methodName, jsonPayload);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void close() {
  }

  /**
   * Build an instance of the Client based on the provided setup.
   *
   * @return an instance of the setup Client
   * @throws java.lang.IllegalStateException if any required field is missing
   */

  private static DaprClient buildDaprClient(DaprApiProtocol apiProtocol) {
    return null;
  }
}
