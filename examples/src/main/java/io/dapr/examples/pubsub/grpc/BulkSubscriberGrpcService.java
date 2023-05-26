// /*
//  * Copyright 2021 The Dapr Authors
//  * Licensed under the Apache License, Version 2.0 (the "License");
//  * you may not use this file except in compliance with the License.
//  * You may obtain a copy of the License at
//  *     http://www.apache.org/licenses/LICENSE-2.0
//  * Unless required by applicable law or agreed to in writing, software
//  * distributed under the License is distributed on an "AS IS" BASIS,
//  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  * See the License for the specific language governing permissions and
// limitations under the License.
// */

// package io.dapr.examples.pubsub.grpc;

// import com.google.protobuf.Empty;
// import io.dapr.v1.AppCallbackAlphaGrpc;
// import io.dapr.v1.DaprAppCallbackProtos;
// import io.grpc.stub.StreamObserver;

// import java.util.ArrayList;
// import java.util.List;

// /**
//  * Class that encapsulates all client-side logic for Grpc.
//  */
// public class BulkSubscriberGrpcService extends AppCallbackAlphaGrpc.AppCallbackAlphaImplBase {

//   @Override
//   public void onBulkTopicEventAlpha1(io.dapr.v1.DaprAppCallbackProtos.TopicEventBulkRequest request,
//       io.grpc.stub.StreamObserver<io.dapr.v1.DaprAppCallbackProtos.TopicEventBulkResponse> responseObserver) {

//     DaprAppCallbackProtos.TopicEventBulkResponse.Builder responseBuilder = DaprAppCallbackProtos.TopicEventBulkResponse.newBuilder();
//     if (request.getEntriesCount() == 0) {
//       responseObserver.onNext(responseBuilder.build());
//       responseObserver.onCompleted();
//     }

//     System.out.println("Bulk Subscriber received " + request.getEntriesCount() + " messages.");

//     for (DaprAppCallbackProtos.TopicEventBulkRequestEntry entry : request.getEntriesList()) {
//       System.out.printf("Bulk Subscriber message has entry ID: %s\n", entry.getEntryId());
//       System.out.printf("Bulk Subscriber got: %s\n", entry.getBytes());
//       DaprAppCallbackProtos.TopicEventBulkResponseEntry responseEntry = DaprAppCallbackProtos.TopicEventBulkResponseEntry.newBuilder(null).setEntryId(null) 
//       responseBuilder.addStatuses(entry.getEntryId(), null)
//     }





//     String data = request.getData().toStringUtf8().replace("\"", "");
//     System.out.println("Subscriber got: " + data);
//     DaprAppCallbackProtos.TopicEventResponse response = DaprAppCallbackProtos.TopicEventResponse.newBuilder()
//         .setStatus(DaprAppCallbackProtos.TopicEventResponse.TopicEventResponseStatus.SUCCESS)
//         .build();
//     responseObserver.onNext(response);
//     responseObserver.onCompleted();
//     try {


//     } catch (Throwable e) {
//       responseObserver.onError(e);
//     }
//   }

// }