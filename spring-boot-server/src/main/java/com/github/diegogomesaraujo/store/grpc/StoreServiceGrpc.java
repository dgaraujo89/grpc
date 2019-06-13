package com.github.diegogomesaraujo.store.grpc;

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
    comments = "Source: shopping.proto")
public final class StoreServiceGrpc {

  private StoreServiceGrpc() {}

  public static final String SERVICE_NAME = "com.github.diegogomesaraujo.store.grpc.StoreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.ProductRPC,
      com.github.diegogomesaraujo.store.grpc.ResponseRPC> getCreateProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProduct",
      requestType = com.github.diegogomesaraujo.store.grpc.ProductRPC.class,
      responseType = com.github.diegogomesaraujo.store.grpc.ResponseRPC.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.ProductRPC,
      com.github.diegogomesaraujo.store.grpc.ResponseRPC> getCreateProductMethod() {
    io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.ProductRPC, com.github.diegogomesaraujo.store.grpc.ResponseRPC> getCreateProductMethod;
    if ((getCreateProductMethod = StoreServiceGrpc.getCreateProductMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getCreateProductMethod = StoreServiceGrpc.getCreateProductMethod) == null) {
          StoreServiceGrpc.getCreateProductMethod = getCreateProductMethod = 
              io.grpc.MethodDescriptor.<com.github.diegogomesaraujo.store.grpc.ProductRPC, com.github.diegogomesaraujo.store.grpc.ResponseRPC>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.github.diegogomesaraujo.store.grpc.StoreService", "CreateProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.store.grpc.ProductRPC.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.store.grpc.ResponseRPC.getDefaultInstance()))
                  .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("CreateProduct"))
                  .build();
          }
        }
     }
     return getCreateProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.ProductRPC,
      com.github.diegogomesaraujo.store.grpc.ResponseRPC> getUpdateProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProduct",
      requestType = com.github.diegogomesaraujo.store.grpc.ProductRPC.class,
      responseType = com.github.diegogomesaraujo.store.grpc.ResponseRPC.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.ProductRPC,
      com.github.diegogomesaraujo.store.grpc.ResponseRPC> getUpdateProductMethod() {
    io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.ProductRPC, com.github.diegogomesaraujo.store.grpc.ResponseRPC> getUpdateProductMethod;
    if ((getUpdateProductMethod = StoreServiceGrpc.getUpdateProductMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getUpdateProductMethod = StoreServiceGrpc.getUpdateProductMethod) == null) {
          StoreServiceGrpc.getUpdateProductMethod = getUpdateProductMethod = 
              io.grpc.MethodDescriptor.<com.github.diegogomesaraujo.store.grpc.ProductRPC, com.github.diegogomesaraujo.store.grpc.ResponseRPC>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.github.diegogomesaraujo.store.grpc.StoreService", "UpdateProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.store.grpc.ProductRPC.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.store.grpc.ResponseRPC.getDefaultInstance()))
                  .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("UpdateProduct"))
                  .build();
          }
        }
     }
     return getUpdateProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.ProductRPC,
      com.github.diegogomesaraujo.store.grpc.ResponseRPC> getDeleteProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProduct",
      requestType = com.github.diegogomesaraujo.store.grpc.ProductRPC.class,
      responseType = com.github.diegogomesaraujo.store.grpc.ResponseRPC.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.ProductRPC,
      com.github.diegogomesaraujo.store.grpc.ResponseRPC> getDeleteProductMethod() {
    io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.ProductRPC, com.github.diegogomesaraujo.store.grpc.ResponseRPC> getDeleteProductMethod;
    if ((getDeleteProductMethod = StoreServiceGrpc.getDeleteProductMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getDeleteProductMethod = StoreServiceGrpc.getDeleteProductMethod) == null) {
          StoreServiceGrpc.getDeleteProductMethod = getDeleteProductMethod = 
              io.grpc.MethodDescriptor.<com.github.diegogomesaraujo.store.grpc.ProductRPC, com.github.diegogomesaraujo.store.grpc.ResponseRPC>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.github.diegogomesaraujo.store.grpc.StoreService", "DeleteProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.store.grpc.ProductRPC.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.store.grpc.ResponseRPC.getDefaultInstance()))
                  .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("DeleteProduct"))
                  .build();
          }
        }
     }
     return getDeleteProductMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StoreServiceStub newStub(io.grpc.Channel channel) {
    return new StoreServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StoreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StoreServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StoreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StoreServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class StoreServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createProduct(com.github.diegogomesaraujo.store.grpc.ProductRPC request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.ResponseRPC> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateProductMethod(), responseObserver);
    }

    /**
     */
    public void updateProduct(com.github.diegogomesaraujo.store.grpc.ProductRPC request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.ResponseRPC> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateProductMethod(), responseObserver);
    }

    /**
     */
    public void deleteProduct(com.github.diegogomesaraujo.store.grpc.ProductRPC request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.ResponseRPC> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteProductMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.diegogomesaraujo.store.grpc.ProductRPC,
                com.github.diegogomesaraujo.store.grpc.ResponseRPC>(
                  this, METHODID_CREATE_PRODUCT)))
          .addMethod(
            getUpdateProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.diegogomesaraujo.store.grpc.ProductRPC,
                com.github.diegogomesaraujo.store.grpc.ResponseRPC>(
                  this, METHODID_UPDATE_PRODUCT)))
          .addMethod(
            getDeleteProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.diegogomesaraujo.store.grpc.ProductRPC,
                com.github.diegogomesaraujo.store.grpc.ResponseRPC>(
                  this, METHODID_DELETE_PRODUCT)))
          .build();
    }
  }

  /**
   */
  public static final class StoreServiceStub extends io.grpc.stub.AbstractStub<StoreServiceStub> {
    private StoreServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StoreServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StoreServiceStub(channel, callOptions);
    }

    /**
     */
    public void createProduct(com.github.diegogomesaraujo.store.grpc.ProductRPC request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.ResponseRPC> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProduct(com.github.diegogomesaraujo.store.grpc.ProductRPC request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.ResponseRPC> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProduct(com.github.diegogomesaraujo.store.grpc.ProductRPC request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.ResponseRPC> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteProductMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StoreServiceBlockingStub extends io.grpc.stub.AbstractStub<StoreServiceBlockingStub> {
    private StoreServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StoreServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StoreServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.github.diegogomesaraujo.store.grpc.ResponseRPC createProduct(com.github.diegogomesaraujo.store.grpc.ProductRPC request) {
      return blockingUnaryCall(
          getChannel(), getCreateProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.diegogomesaraujo.store.grpc.ResponseRPC updateProduct(com.github.diegogomesaraujo.store.grpc.ProductRPC request) {
      return blockingUnaryCall(
          getChannel(), getUpdateProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.diegogomesaraujo.store.grpc.ResponseRPC deleteProduct(com.github.diegogomesaraujo.store.grpc.ProductRPC request) {
      return blockingUnaryCall(
          getChannel(), getDeleteProductMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StoreServiceFutureStub extends io.grpc.stub.AbstractStub<StoreServiceFutureStub> {
    private StoreServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StoreServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StoreServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.diegogomesaraujo.store.grpc.ResponseRPC> createProduct(
        com.github.diegogomesaraujo.store.grpc.ProductRPC request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.diegogomesaraujo.store.grpc.ResponseRPC> updateProduct(
        com.github.diegogomesaraujo.store.grpc.ProductRPC request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.diegogomesaraujo.store.grpc.ResponseRPC> deleteProduct(
        com.github.diegogomesaraujo.store.grpc.ProductRPC request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteProductMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PRODUCT = 0;
  private static final int METHODID_UPDATE_PRODUCT = 1;
  private static final int METHODID_DELETE_PRODUCT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StoreServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StoreServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PRODUCT:
          serviceImpl.createProduct((com.github.diegogomesaraujo.store.grpc.ProductRPC) request,
              (io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.ResponseRPC>) responseObserver);
          break;
        case METHODID_UPDATE_PRODUCT:
          serviceImpl.updateProduct((com.github.diegogomesaraujo.store.grpc.ProductRPC) request,
              (io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.ResponseRPC>) responseObserver);
          break;
        case METHODID_DELETE_PRODUCT:
          serviceImpl.deleteProduct((com.github.diegogomesaraujo.store.grpc.ProductRPC) request,
              (io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.ResponseRPC>) responseObserver);
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

  private static abstract class StoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StoreServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.diegogomesaraujo.store.grpc.Store.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StoreService");
    }
  }

  private static final class StoreServiceFileDescriptorSupplier
      extends StoreServiceBaseDescriptorSupplier {
    StoreServiceFileDescriptorSupplier() {}
  }

  private static final class StoreServiceMethodDescriptorSupplier
      extends StoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StoreServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StoreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StoreServiceFileDescriptorSupplier())
              .addMethod(getCreateProductMethod())
              .addMethod(getUpdateProductMethod())
              .addMethod(getDeleteProductMethod())
              .build();
        }
      }
    }
    return result;
  }
}
