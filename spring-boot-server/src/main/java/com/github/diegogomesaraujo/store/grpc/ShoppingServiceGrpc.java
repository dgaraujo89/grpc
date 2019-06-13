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
  private static volatile io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.ProductRequestRPC,
      com.github.diegogomesaraujo.store.grpc.ProductResponseRPC> getListProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProducts",
      requestType = com.github.diegogomesaraujo.store.grpc.ProductRequestRPC.class,
      responseType = com.github.diegogomesaraujo.store.grpc.ProductResponseRPC.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.ProductRequestRPC,
      com.github.diegogomesaraujo.store.grpc.ProductResponseRPC> getListProductsMethod() {
    io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.ProductRequestRPC, com.github.diegogomesaraujo.store.grpc.ProductResponseRPC> getListProductsMethod;
    if ((getListProductsMethod = ShoppingServiceGrpc.getListProductsMethod) == null) {
      synchronized (ShoppingServiceGrpc.class) {
        if ((getListProductsMethod = ShoppingServiceGrpc.getListProductsMethod) == null) {
          ShoppingServiceGrpc.getListProductsMethod = getListProductsMethod = 
              io.grpc.MethodDescriptor.<com.github.diegogomesaraujo.store.grpc.ProductRequestRPC, com.github.diegogomesaraujo.store.grpc.ProductResponseRPC>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.github.diegogomesaraujo.store.grpc.ShoppingService", "ListProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.store.grpc.ProductRequestRPC.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.store.grpc.ProductResponseRPC.getDefaultInstance()))
                  .setSchemaDescriptor(new ShoppingServiceMethodDescriptorSupplier("ListProducts"))
                  .build();
          }
        }
     }
     return getListProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.ProductRPC,
      com.github.diegogomesaraujo.store.grpc.CartRPC> getAddToCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddToCart",
      requestType = com.github.diegogomesaraujo.store.grpc.ProductRPC.class,
      responseType = com.github.diegogomesaraujo.store.grpc.CartRPC.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.ProductRPC,
      com.github.diegogomesaraujo.store.grpc.CartRPC> getAddToCartMethod() {
    io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.ProductRPC, com.github.diegogomesaraujo.store.grpc.CartRPC> getAddToCartMethod;
    if ((getAddToCartMethod = ShoppingServiceGrpc.getAddToCartMethod) == null) {
      synchronized (ShoppingServiceGrpc.class) {
        if ((getAddToCartMethod = ShoppingServiceGrpc.getAddToCartMethod) == null) {
          ShoppingServiceGrpc.getAddToCartMethod = getAddToCartMethod = 
              io.grpc.MethodDescriptor.<com.github.diegogomesaraujo.store.grpc.ProductRPC, com.github.diegogomesaraujo.store.grpc.CartRPC>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.github.diegogomesaraujo.store.grpc.ShoppingService", "AddToCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.store.grpc.ProductRPC.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.store.grpc.CartRPC.getDefaultInstance()))
                  .setSchemaDescriptor(new ShoppingServiceMethodDescriptorSupplier("AddToCart"))
                  .build();
          }
        }
     }
     return getAddToCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.ProductRPC,
      com.github.diegogomesaraujo.store.grpc.CartRPC> getRemoveFromCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveFromCart",
      requestType = com.github.diegogomesaraujo.store.grpc.ProductRPC.class,
      responseType = com.github.diegogomesaraujo.store.grpc.CartRPC.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.ProductRPC,
      com.github.diegogomesaraujo.store.grpc.CartRPC> getRemoveFromCartMethod() {
    io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.ProductRPC, com.github.diegogomesaraujo.store.grpc.CartRPC> getRemoveFromCartMethod;
    if ((getRemoveFromCartMethod = ShoppingServiceGrpc.getRemoveFromCartMethod) == null) {
      synchronized (ShoppingServiceGrpc.class) {
        if ((getRemoveFromCartMethod = ShoppingServiceGrpc.getRemoveFromCartMethod) == null) {
          ShoppingServiceGrpc.getRemoveFromCartMethod = getRemoveFromCartMethod = 
              io.grpc.MethodDescriptor.<com.github.diegogomesaraujo.store.grpc.ProductRPC, com.github.diegogomesaraujo.store.grpc.CartRPC>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.github.diegogomesaraujo.store.grpc.ShoppingService", "RemoveFromCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.store.grpc.ProductRPC.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.store.grpc.CartRPC.getDefaultInstance()))
                  .setSchemaDescriptor(new ShoppingServiceMethodDescriptorSupplier("RemoveFromCart"))
                  .build();
          }
        }
     }
     return getRemoveFromCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.diegogomesaraujo.store.grpc.CartRPC> getGetCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCart",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.github.diegogomesaraujo.store.grpc.CartRPC.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.diegogomesaraujo.store.grpc.CartRPC> getGetCartMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.github.diegogomesaraujo.store.grpc.CartRPC> getGetCartMethod;
    if ((getGetCartMethod = ShoppingServiceGrpc.getGetCartMethod) == null) {
      synchronized (ShoppingServiceGrpc.class) {
        if ((getGetCartMethod = ShoppingServiceGrpc.getGetCartMethod) == null) {
          ShoppingServiceGrpc.getGetCartMethod = getGetCartMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.github.diegogomesaraujo.store.grpc.CartRPC>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.github.diegogomesaraujo.store.grpc.ShoppingService", "GetCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.store.grpc.CartRPC.getDefaultInstance()))
                  .setSchemaDescriptor(new ShoppingServiceMethodDescriptorSupplier("GetCart"))
                  .build();
          }
        }
     }
     return getGetCartMethod;
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
    public void listProducts(com.github.diegogomesaraujo.store.grpc.ProductRequestRPC request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.ProductResponseRPC> responseObserver) {
      asyncUnimplementedUnaryCall(getListProductsMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.ProductRPC> addToCart(
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.CartRPC> responseObserver) {
      return asyncUnimplementedStreamingCall(getAddToCartMethod(), responseObserver);
    }

    /**
     */
    public void removeFromCart(com.github.diegogomesaraujo.store.grpc.ProductRPC request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.CartRPC> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveFromCartMethod(), responseObserver);
    }

    /**
     */
    public void getCart(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.CartRPC> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCartMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListProductsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.diegogomesaraujo.store.grpc.ProductRequestRPC,
                com.github.diegogomesaraujo.store.grpc.ProductResponseRPC>(
                  this, METHODID_LIST_PRODUCTS)))
          .addMethod(
            getAddToCartMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.github.diegogomesaraujo.store.grpc.ProductRPC,
                com.github.diegogomesaraujo.store.grpc.CartRPC>(
                  this, METHODID_ADD_TO_CART)))
          .addMethod(
            getRemoveFromCartMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.diegogomesaraujo.store.grpc.ProductRPC,
                com.github.diegogomesaraujo.store.grpc.CartRPC>(
                  this, METHODID_REMOVE_FROM_CART)))
          .addMethod(
            getGetCartMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.github.diegogomesaraujo.store.grpc.CartRPC>(
                  this, METHODID_GET_CART)))
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
    public void listProducts(com.github.diegogomesaraujo.store.grpc.ProductRequestRPC request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.ProductResponseRPC> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.ProductRPC> addToCart(
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.CartRPC> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAddToCartMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void removeFromCart(com.github.diegogomesaraujo.store.grpc.ProductRPC request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.CartRPC> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveFromCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCart(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.CartRPC> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCartMethod(), getCallOptions()), request, responseObserver);
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
    public com.github.diegogomesaraujo.store.grpc.ProductResponseRPC listProducts(com.github.diegogomesaraujo.store.grpc.ProductRequestRPC request) {
      return blockingUnaryCall(
          getChannel(), getListProductsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.diegogomesaraujo.store.grpc.CartRPC removeFromCart(com.github.diegogomesaraujo.store.grpc.ProductRPC request) {
      return blockingUnaryCall(
          getChannel(), getRemoveFromCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.diegogomesaraujo.store.grpc.CartRPC getCart(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetCartMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.github.diegogomesaraujo.store.grpc.ProductResponseRPC> listProducts(
        com.github.diegogomesaraujo.store.grpc.ProductRequestRPC request) {
      return futureUnaryCall(
          getChannel().newCall(getListProductsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.diegogomesaraujo.store.grpc.CartRPC> removeFromCart(
        com.github.diegogomesaraujo.store.grpc.ProductRPC request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveFromCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.diegogomesaraujo.store.grpc.CartRPC> getCart(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCartMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_PRODUCTS = 0;
  private static final int METHODID_REMOVE_FROM_CART = 1;
  private static final int METHODID_GET_CART = 2;
  private static final int METHODID_ADD_TO_CART = 3;

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
          serviceImpl.listProducts((com.github.diegogomesaraujo.store.grpc.ProductRequestRPC) request,
              (io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.ProductResponseRPC>) responseObserver);
          break;
        case METHODID_REMOVE_FROM_CART:
          serviceImpl.removeFromCart((com.github.diegogomesaraujo.store.grpc.ProductRPC) request,
              (io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.CartRPC>) responseObserver);
          break;
        case METHODID_GET_CART:
          serviceImpl.getCart((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.CartRPC>) responseObserver);
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
        case METHODID_ADD_TO_CART:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.addToCart(
              (io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.CartRPC>) responseObserver);
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
              .addMethod(getAddToCartMethod())
              .addMethod(getRemoveFromCartMethod())
              .addMethod(getGetCartMethod())
              .build();
        }
      }
    }
    return result;
  }
}
