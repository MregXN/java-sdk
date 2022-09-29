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

package io.dapr.actors.runtime;

import io.dapr.actors.ActorId;
import io.dapr.actors.ActorTrace;
import io.dapr.actors.runtime.AbstractActorRuntime;
import io.dapr.actors.runtime.ActorManager;
import io.dapr.actors.runtime.ActorObjectSerializer;
import io.dapr.actors.runtime.ActorRuntimeConfig;
import io.dapr.actors.runtime.DaprClient;
import io.dapr.client.DaprApiProtocol;
import io.dapr.client.DaprHttpBuilder;
import io.dapr.config.Properties;
import io.dapr.serializer.DaprObjectSerializer;
import io.dapr.serializer.DefaultObjectSerializer;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import reactor.core.publisher.Mono;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Contains methods to register actor types. Registering the types allows the
 * runtime to create instances of the actor.
 */
public class AbstractActorRuntime implements Closeable {

  public static AbstractActorRuntime getInstance() {
    return null;
  }

  public ActorRuntimeConfig getConfig() {
    return null;
  }

  public byte[] serializeConfig() throws IOException {
    return null;
  }

  public Mono<byte[]> invoke(String actorTypeName, String actorId, String actorMethodName, byte[] payload) {
    return null;

  }

  public Mono<Void> invokeReminder(String actorTypeName, String actorId, String reminderName, byte[] params) {
    return null;

  }

  public Mono<Void> invokeTimer(String actorTypeName, String actorId, String timerName, byte[] params) {
    return null;

  }

  public Mono<Void> deactivate(String actorTypeName, String actorId) {
    return null;
  }

  @Override
  public void close() {
  }
}
