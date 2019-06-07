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
public final class ShoppingGrpc {

  private ShoppingGrpc() {}

  public static final String SERVICE_NAME = "com.github.diegogomesaraujo.store.grpc.Shopping";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.ProductRequest,
      com.github.diegogomesaraujo.store.grpc.ProductResponse> getListProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProducts",
      requestType = com.github.diegogomesaraujo.store.grpc.ProductRequest.class,
      responseType = com.github.diegogomesaraujo.store.grpc.ProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.ProductRequest,
      com.github.diegogomesaraujo.store.grpc.ProductResponse> getListProductsMethod() {
    io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.ProductRequest, com.github.diegogomesaraujo.store.grpc.ProductResponse> getListProductsMethod;
    if ((getListProductsMethod = ShoppingGrpc.getListProductsMethod) == null) {
      synchronized (ShoppingGrpc.class) {
        if ((getListProductsMethod = ShoppingGrpc.getListProductsMethod) == null) {
          ShoppingGrpc.getListProductsMethod = getListProductsMethod = 
              io.grpc.MethodDescriptor.<com.github.diegogomesaraujo.store.grpc.ProductRequest, com.github.diegogomesaraujo.store.grpc.ProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.github.diegogomesaraujo.store.grpc.Shopping", "ListProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.store.grpc.ProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.store.grpc.ProductResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ShoppingMethodDescriptorSupplier("ListProducts"))
                  .build();
          }
        }
     }
     return getListProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.Product,
      com.github.diegogomesaraujo.store.grpc.Cart> getAddToCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddToCart",
      requestType = com.github.diegogomesaraujo.store.grpc.Product.class,
      responseType = com.github.diegogomesaraujo.store.grpc.Cart.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.Product,
      com.github.diegogomesaraujo.store.grpc.Cart> getAddToCartMethod() {
    io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.Product, com.github.diegogomesaraujo.store.grpc.Cart> getAddToCartMethod;
    if ((getAddToCartMethod = ShoppingGrpc.getAddToCartMethod) == null) {
      synchronized (ShoppingGrpc.class) {
        if ((getAddToCartMethod = ShoppingGrpc.getAddToCartMethod) == null) {
          ShoppingGrpc.getAddToCartMethod = getAddToCartMethod = 
              io.grpc.MethodDescriptor.<com.github.diegogomesaraujo.store.grpc.Product, com.github.diegogomesaraujo.store.grpc.Cart>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.github.diegogomesaraujo.store.grpc.Shopping", "AddToCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.store.grpc.Product.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.store.grpc.Cart.getDefaultInstance()))
                  .setSchemaDescriptor(new ShoppingMethodDescriptorSupplier("AddToCart"))
                  .build();
          }
        }
     }
     return getAddToCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.Product,
      com.github.diegogomesaraujo.store.grpc.Cart> getRemoveFromCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveFromCart",
      requestType = com.github.diegogomesaraujo.store.grpc.Product.class,
      responseType = com.github.diegogomesaraujo.store.grpc.Cart.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.Product,
      com.github.diegogomesaraujo.store.grpc.Cart> getRemoveFromCartMethod() {
    io.grpc.MethodDescriptor<com.github.diegogomesaraujo.store.grpc.Product, com.github.diegogomesaraujo.store.grpc.Cart> getRemoveFromCartMethod;
    if ((getRemoveFromCartMethod = ShoppingGrpc.getRemoveFromCartMethod) == null) {
      synchronized (ShoppingGrpc.class) {
        if ((getRemoveFromCartMethod = ShoppingGrpc.getRemoveFromCartMethod) == null) {
          ShoppingGrpc.getRemoveFromCartMethod = getRemoveFromCartMethod = 
              io.grpc.MethodDescriptor.<com.github.diegogomesaraujo.store.grpc.Product, com.github.diegogomesaraujo.store.grpc.Cart>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.github.diegogomesaraujo.store.grpc.Shopping", "RemoveFromCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.store.grpc.Product.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.store.grpc.Cart.getDefaultInstance()))
                  .setSchemaDescriptor(new ShoppingMethodDescriptorSupplier("RemoveFromCart"))
                  .build();
          }
        }
     }
     return getRemoveFromCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.diegogomesaraujo.store.grpc.Cart> getGetCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCart",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.github.diegogomesaraujo.store.grpc.Cart.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.diegogomesaraujo.store.grpc.Cart> getGetCartMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.github.diegogomesaraujo.store.grpc.Cart> getGetCartMethod;
    if ((getGetCartMethod = ShoppingGrpc.getGetCartMethod) == null) {
      synchronized (ShoppingGrpc.class) {
        if ((getGetCartMethod = ShoppingGrpc.getGetCartMethod) == null) {
          ShoppingGrpc.getGetCartMethod = getGetCartMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.github.diegogomesaraujo.store.grpc.Cart>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.github.diegogomesaraujo.store.grpc.Shopping", "GetCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.diegogomesaraujo.store.grpc.Cart.getDefaultInstance()))
                  .setSchemaDescriptor(new ShoppingMethodDescriptorSupplier("GetCart"))
                  .build();
          }
        }
     }
     return getGetCartMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ShoppingStub newStub(io.grpc.Channel channel) {
    return new ShoppingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ShoppingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ShoppingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ShoppingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ShoppingFutureStub(channel);
  }

  /**
   */
  public static abstract class ShoppingImplBase implements io.grpc.BindableService {

    /**
     */
    public void listProducts(com.github.diegogomesaraujo.store.grpc.ProductRequest request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.ProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListProductsMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.Product> addToCart(
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.Cart> responseObserver) {
      return asyncUnimplementedStreamingCall(getAddToCartMethod(), responseObserver);
    }

    /**
     */
    public void removeFromCart(com.github.diegogomesaraujo.store.grpc.Product request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.Cart> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveFromCartMethod(), responseObserver);
    }

    /**
     */
    public void getCart(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.Cart> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCartMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListProductsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.diegogomesaraujo.store.grpc.ProductRequest,
                com.github.diegogomesaraujo.store.grpc.ProductResponse>(
                  this, METHODID_LIST_PRODUCTS)))
          .addMethod(
            getAddToCartMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.github.diegogomesaraujo.store.grpc.Product,
                com.github.diegogomesaraujo.store.grpc.Cart>(
                  this, METHODID_ADD_TO_CART)))
          .addMethod(
            getRemoveFromCartMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.diegogomesaraujo.store.grpc.Product,
                com.github.diegogomesaraujo.store.grpc.Cart>(
                  this, METHODID_REMOVE_FROM_CART)))
          .addMethod(
            getGetCartMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.github.diegogomesaraujo.store.grpc.Cart>(
                  this, METHODID_GET_CART)))
          .build();
    }
  }

  /**
   */
  public static final class ShoppingStub extends io.grpc.stub.AbstractStub<ShoppingStub> {
    private ShoppingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ShoppingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShoppingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ShoppingStub(channel, callOptions);
    }

    /**
     */
    public void listProducts(com.github.diegogomesaraujo.store.grpc.ProductRequest request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.ProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.Product> addToCart(
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.Cart> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAddToCartMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void removeFromCart(com.github.diegogomesaraujo.store.grpc.Product request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.Cart> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveFromCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCart(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.Cart> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCartMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ShoppingBlockingStub extends io.grpc.stub.AbstractStub<ShoppingBlockingStub> {
    private ShoppingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ShoppingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShoppingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ShoppingBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.github.diegogomesaraujo.store.grpc.ProductResponse listProducts(com.github.diegogomesaraujo.store.grpc.ProductRequest request) {
      return blockingUnaryCall(
          getChannel(), getListProductsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.diegogomesaraujo.store.grpc.Cart removeFromCart(com.github.diegogomesaraujo.store.grpc.Product request) {
      return blockingUnaryCall(
          getChannel(), getRemoveFromCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.diegogomesaraujo.store.grpc.Cart getCart(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetCartMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ShoppingFutureStub extends io.grpc.stub.AbstractStub<ShoppingFutureStub> {
    private ShoppingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ShoppingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShoppingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ShoppingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.diegogomesaraujo.store.grpc.ProductResponse> listProducts(
        com.github.diegogomesaraujo.store.grpc.ProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListProductsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.diegogomesaraujo.store.grpc.Cart> removeFromCart(
        com.github.diegogomesaraujo.store.grpc.Product request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveFromCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.diegogomesaraujo.store.grpc.Cart> getCart(
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
    private final ShoppingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ShoppingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_PRODUCTS:
          serviceImpl.listProducts((com.github.diegogomesaraujo.store.grpc.ProductRequest) request,
              (io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.ProductResponse>) responseObserver);
          break;
        case METHODID_REMOVE_FROM_CART:
          serviceImpl.removeFromCart((com.github.diegogomesaraujo.store.grpc.Product) request,
              (io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.Cart>) responseObserver);
          break;
        case METHODID_GET_CART:
          serviceImpl.getCart((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.Cart>) responseObserver);
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
              (io.grpc.stub.StreamObserver<com.github.diegogomesaraujo.store.grpc.Cart>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ShoppingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ShoppingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.diegogomesaraujo.store.grpc.Store.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Shopping");
    }
  }

  private static final class ShoppingFileDescriptorSupplier
      extends ShoppingBaseDescriptorSupplier {
    ShoppingFileDescriptorSupplier() {}
  }

  private static final class ShoppingMethodDescriptorSupplier
      extends ShoppingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ShoppingMethodDescriptorSupplier(String methodName) {
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
      synchronized (ShoppingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ShoppingFileDescriptorSupplier())
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
