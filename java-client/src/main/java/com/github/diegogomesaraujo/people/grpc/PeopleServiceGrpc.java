package com.github.diegogomesaraujo.people.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: people.proto")
public final class PeopleServiceGrpc {

  private PeopleServiceGrpc() {}

  public static final String SERVICE_NAME = "com.github.diegogomesaraujo.people.grpc.PeopleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.diegogomesaraujo.people.grpc.Person,
      com.github.diegogomesaraujo.people.grpc.Response> getSendPersonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendPerson",
      requestType = com.github.diegogomesaraujo.people.grpc.Person.class,
      responseType = com.github.diegogomesaraujo.people.grpc.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.diegogomesaraujo.people.grpc.Person,
      com.github.diegogomesaraujo.people.grpc.Response> getSendPersonMethod() {
    io.grpc.MethodDescriptor<com.github.diegogomesaraujo.people.grpc.Person, com.github.diegogomesaraujo.people.grpc.Response> getSendPersonMethod;
    if ((getSendPersonMethod = PeopleServiceGrpc.getSendPersonMethod) == null) {
      synchronized (PeopleServiceGrpc.class) {
        if ((getSendPersonMethod = PeopleServiceGrpc.getSendPersonMethod) == null) {
          PeopleServiceGrpc.getSendPersonMethod = getSendPersonMethod = 
              io.grpc.MethodDescriptor.<com.github.diegogomesaraujo.people.grpc.Person, com.github.diegogomesaraujo.people.grpc.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.github.diegogomesaraujo.people.grpc.PeopleService", "SendPerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.people.grpc.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.people.grpc.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new PeopleServiceMethodDescriptorSupplier("SendPerson"))
                  .build();
          }
        }
     }
     return getSendPersonMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.diegogomesaraujo.people.grpc.Person> getListPeopleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPeople",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.github.diegogomesaraujo.people.grpc.Person.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.diegogomesaraujo.people.grpc.Person> getListPeopleMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.github.diegogomesaraujo.people.grpc.Person> getListPeopleMethod;
    if ((getListPeopleMethod = PeopleServiceGrpc.getListPeopleMethod) == null) {
      synchronized (PeopleServiceGrpc.class) {
        if ((getListPeopleMethod = PeopleServiceGrpc.getListPeopleMethod) == null) {
          PeopleServiceGrpc.getListPeopleMethod = getListPeopleMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.github.diegogomesaraujo.people.grpc.Person>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.github.diegogomesaraujo.people.grpc.PeopleService", "ListPeople"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.people.grpc.Person.getDefaultInstance()))
                  .setSchemaDescriptor(new PeopleServiceMethodDescriptorSupplier("ListPeople"))
                  .build();
          }
        }
     }
     return getListPeopleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.diegogomesaraujo.people.grpc.Person,
      com.github.diegogomesaraujo.people.grpc.PersonPhones> getListPhonesByPersonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPhonesByPerson",
      requestType = com.github.diegogomesaraujo.people.grpc.Person.class,
      responseType = com.github.diegogomesaraujo.people.grpc.PersonPhones.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.diegogomesaraujo.people.grpc.Person,
      com.github.diegogomesaraujo.people.grpc.PersonPhones> getListPhonesByPersonMethod() {
    io.grpc.MethodDescriptor<com.github.diegogomesaraujo.people.grpc.Person, com.github.diegogomesaraujo.people.grpc.PersonPhones> getListPhonesByPersonMethod;
    if ((getListPhonesByPersonMethod = PeopleServiceGrpc.getListPhonesByPersonMethod) == null) {
      synchronized (PeopleServiceGrpc.class) {
        if ((getListPhonesByPersonMethod = PeopleServiceGrpc.getListPhonesByPersonMethod) == null) {
          PeopleServiceGrpc.getListPhonesByPersonMethod = getListPhonesByPersonMethod = 
              io.grpc.MethodDescriptor.<com.github.diegogomesaraujo.people.grpc.Person, com.github.diegogomesaraujo.people.grpc.PersonPhones>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.github.diegogomesaraujo.people.grpc.PeopleService", "ListPhonesByPerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.people.grpc.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.people.grpc.PersonPhones.getDefaultInstance()))
                  .setSchemaDescriptor(new PeopleServiceMethodDescriptorSupplier("ListPhonesByPerson"))
                  .build();
          }
        }
     }
     return getListPhonesByPersonMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PeopleServiceStub newStub(io.grpc.Channel channel) {
    return new PeopleServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PeopleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PeopleServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PeopleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PeopleServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PeopleServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendPerson(com.github.diegogomesaraujo.people.grpc.Person request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.people.grpc.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSendPersonMethod(), responseObserver);
    }

    /**
     */
    public void listPeople(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.people.grpc.Person> responseObserver) {
      asyncUnimplementedUnaryCall(getListPeopleMethod(), responseObserver);
    }

    /**
     */
    public void listPhonesByPerson(com.github.diegogomesaraujo.people.grpc.Person request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.people.grpc.PersonPhones> responseObserver) {
      asyncUnimplementedUnaryCall(getListPhonesByPersonMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendPersonMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.diegogomesaraujo.people.grpc.Person,
                com.github.diegogomesaraujo.people.grpc.Response>(
                  this, METHODID_SEND_PERSON)))
          .addMethod(
            getListPeopleMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.github.diegogomesaraujo.people.grpc.Person>(
                  this, METHODID_LIST_PEOPLE)))
          .addMethod(
            getListPhonesByPersonMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.diegogomesaraujo.people.grpc.Person,
                com.github.diegogomesaraujo.people.grpc.PersonPhones>(
                  this, METHODID_LIST_PHONES_BY_PERSON)))
          .build();
    }
  }

  /**
   */
  public static final class PeopleServiceStub extends io.grpc.stub.AbstractStub<PeopleServiceStub> {
    private PeopleServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PeopleServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PeopleServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PeopleServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendPerson(com.github.diegogomesaraujo.people.grpc.Person request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.people.grpc.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendPersonMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPeople(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.people.grpc.Person> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListPeopleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPhonesByPerson(com.github.diegogomesaraujo.people.grpc.Person request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.people.grpc.PersonPhones> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPhonesByPersonMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PeopleServiceBlockingStub extends io.grpc.stub.AbstractStub<PeopleServiceBlockingStub> {
    private PeopleServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PeopleServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PeopleServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PeopleServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.github.diegogomesaraujo.people.grpc.Response sendPerson(com.github.diegogomesaraujo.people.grpc.Person request) {
      return blockingUnaryCall(
          getChannel(), getSendPersonMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.github.diegogomesaraujo.people.grpc.Person> listPeople(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getListPeopleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.diegogomesaraujo.people.grpc.PersonPhones listPhonesByPerson(com.github.diegogomesaraujo.people.grpc.Person request) {
      return blockingUnaryCall(
          getChannel(), getListPhonesByPersonMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PeopleServiceFutureStub extends io.grpc.stub.AbstractStub<PeopleServiceFutureStub> {
    private PeopleServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PeopleServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PeopleServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PeopleServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.diegogomesaraujo.people.grpc.Response> sendPerson(
        com.github.diegogomesaraujo.people.grpc.Person request) {
      return futureUnaryCall(
          getChannel().newCall(getSendPersonMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.diegogomesaraujo.people.grpc.PersonPhones> listPhonesByPerson(
        com.github.diegogomesaraujo.people.grpc.Person request) {
      return futureUnaryCall(
          getChannel().newCall(getListPhonesByPersonMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_PERSON = 0;
  private static final int METHODID_LIST_PEOPLE = 1;
  private static final int METHODID_LIST_PHONES_BY_PERSON = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PeopleServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PeopleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_PERSON:
          serviceImpl.sendPerson((com.github.diegogomesaraujo.people.grpc.Person) request,
              (io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.people.grpc.Response>) responseObserver);
          break;
        case METHODID_LIST_PEOPLE:
          serviceImpl.listPeople((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.people.grpc.Person>) responseObserver);
          break;
        case METHODID_LIST_PHONES_BY_PERSON:
          serviceImpl.listPhonesByPerson((com.github.diegogomesaraujo.people.grpc.Person) request,
              (io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.people.grpc.PersonPhones>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PeopleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PeopleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.diegogomesaraujo.people.grpc.People.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PeopleService");
    }
  }

  private static final class PeopleServiceFileDescriptorSupplier
      extends PeopleServiceBaseDescriptorSupplier {
    PeopleServiceFileDescriptorSupplier() {}
  }

  private static final class PeopleServiceMethodDescriptorSupplier
      extends PeopleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PeopleServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PeopleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PeopleServiceFileDescriptorSupplier())
              .addMethod(getSendPersonMethod())
              .addMethod(getListPeopleMethod())
              .addMethod(getListPhonesByPersonMethod())
              .build();
        }
      }
    }
    return result;
  }
}
