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
public final class ShoppingServiceGrpc {

  private ShoppingServiceGrpc() {}

  public static final String SERVICE_NAME = "com.github.diegogomesaraujo.store.grpc.ShoppingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.PaginationRequest,
      com.github.diegogomesaraujo.store.grpc.ProductResponse> getListProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProducts",
      requestType = com.github.diegogomesaraujo.store.grpc.PaginationRequest.class,
      responseType = com.github.diegogomesaraujo.store.grpc.ProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.PaginationRequest,
      com.github.diegogomesaraujo.store.grpc.ProductResponse> getListProductsMethod() {
    io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.PaginationRequest, com.github.diegogomesaraujo.store.grpc.ProductResponse> getListProductsMethod;
    if ((getListProductsMethod = ShoppingServiceGrpc.getListProductsMethod) == null) {
      synchronized (ShoppingServiceGrpc.class) {
        if ((getListProductsMethod = ShoppingServiceGrpc.getListProductsMethod) == null) {
          ShoppingServiceGrpc.getListProductsMethod = getListProductsMethod = 
              io.grpc.MethodDescriptor.<com.github.diegogomesaraujo.store.grpc.PaginationRequest, com.github.diegogomesaraujo.store.grpc.ProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.github.diegogomesaraujo.store.grpc.ShoppingService", "ListProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.store.grpc.PaginationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.store.grpc.ProductResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ShoppingServiceMethodDescriptorSupplier("ListProducts"))
                  .build();
          }
        }
     }
     return getListProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.PaymentRequest,
      com.github.diegogomesaraujo.store.grpc.MessageResponse> getCheckoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Checkout",
      requestType = com.github.diegogomesaraujo.store.grpc.PaymentRequest.class,
      responseType = com.github.diegogomesaraujo.store.grpc.MessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.PaymentRequest,
      com.github.diegogomesaraujo.store.grpc.MessageResponse> getCheckoutMethod() {
    io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.PaymentRequest, com.github.diegogomesaraujo.store.grpc.MessageResponse> getCheckoutMethod;
    if ((getCheckoutMethod = ShoppingServiceGrpc.getCheckoutMethod) == null) {
      synchronized (ShoppingServiceGrpc.class) {
        if ((getCheckoutMethod = ShoppingServiceGrpc.getCheckoutMethod) == null) {
          ShoppingServiceGrpc.getCheckoutMethod = getCheckoutMethod = 
              io.grpc.MethodDescriptor.<com.github.diegogomesaraujo.store.grpc.PaymentRequest, com.github.diegogomesaraujo.store.grpc.MessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.github.diegogomesaraujo.store.grpc.ShoppingService", "Checkout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.store.grpc.PaymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.store.grpc.MessageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ShoppingServiceMethodDescriptorSupplier("Checkout"))
                  .build();
          }
        }
     }
     return getCheckoutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ShoppingServiceStub newStub(io.grpc.Channel channel) {
    return new ShoppingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ShoppingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ShoppingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ShoppingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ShoppingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ShoppingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listProducts(com.github.diegogomesaraujo.store.grpc.PaginationRequest request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.ProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListProductsMethod(), responseObserver);
    }

    /**
     */
    public void checkout(com.github.diegogomesaraujo.store.grpc.PaymentRequest request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.MessageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckoutMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListProductsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.diegogomesaraujo.store.grpc.PaginationRequest,
                com.github.diegogomesaraujo.store.grpc.ProductResponse>(
                  this, METHODID_LIST_PRODUCTS)))
          .addMethod(
            getCheckoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.diegogomesaraujo.store.grpc.PaymentRequest,
                com.github.diegogomesaraujo.store.grpc.MessageResponse>(
                  this, METHODID_CHECKOUT)))
          .build();
    }
  }

  /**
   */
  public static final class ShoppingServiceStub extends io.grpc.stub.AbstractStub<ShoppingServiceStub> {
    private ShoppingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ShoppingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShoppingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ShoppingServiceStub(channel, callOptions);
    }

    /**
     */
    public void listProducts(com.github.diegogomesaraujo.store.grpc.PaginationRequest request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.ProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkout(com.github.diegogomesaraujo.store.grpc.PaymentRequest request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.MessageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckoutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ShoppingServiceBlockingStub extends io.grpc.stub.AbstractStub<ShoppingServiceBlockingStub> {
    private ShoppingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ShoppingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShoppingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ShoppingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.github.diegogomesaraujo.store.grpc.ProductResponse listProducts(com.github.diegogomesaraujo.store.grpc.PaginationRequest request) {
      return blockingUnaryCall(
          getChannel(), getListProductsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.diegogomesaraujo.store.grpc.MessageResponse checkout(com.github.diegogomesaraujo.store.grpc.PaymentRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckoutMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ShoppingServiceFutureStub extends io.grpc.stub.AbstractStub<ShoppingServiceFutureStub> {
    private ShoppingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ShoppingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShoppingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ShoppingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.diegogomesaraujo.store.grpc.ProductResponse> listProducts(
        com.github.diegogomesaraujo.store.grpc.PaginationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListProductsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.diegogomesaraujo.store.grpc.MessageResponse> checkout(
        com.github.diegogomesaraujo.store.grpc.PaymentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_PRODUCTS = 0;
  private static final int METHODID_CHECKOUT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ShoppingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ShoppingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_PRODUCTS:
          serviceImpl.listProducts((com.github.diegogomesaraujo.store.grpc.PaginationRequest) request,
              (io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.ProductResponse>) responseObserver);
          break;
        case METHODID_CHECKOUT:
          serviceImpl.checkout((com.github.diegogomesaraujo.store.grpc.PaymentRequest) request,
              (io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.MessageResponse>) responseObserver);
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

  private static abstract class ShoppingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ShoppingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.diegogomesaraujo.store.grpc.Store.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ShoppingService");
    }
  }

  private static final class ShoppingServiceFileDescriptorSupplier
      extends ShoppingServiceBaseDescriptorSupplier {
    ShoppingServiceFileDescriptorSupplier() {}
  }

  private static final class ShoppingServiceMethodDescriptorSupplier
      extends ShoppingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ShoppingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ShoppingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ShoppingServiceFileDescriptorSupplier())
              .addMethod(getListProductsMethod())
              .addMethod(getCheckoutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
