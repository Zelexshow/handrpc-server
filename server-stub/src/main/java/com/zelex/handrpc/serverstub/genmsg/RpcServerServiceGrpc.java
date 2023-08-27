package com.zelex.handrpc.serverstub.genmsg;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * greeting服务定义
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: rpcService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RpcServerServiceGrpc {

  private RpcServerServiceGrpc() {}

  public static final String SERVICE_NAME = "RpcServerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zelex.handrpc.serverstub.genmsg.HelloRequest,
      com.zelex.handrpc.serverstub.genmsg.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = com.zelex.handrpc.serverstub.genmsg.HelloRequest.class,
      responseType = com.zelex.handrpc.serverstub.genmsg.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zelex.handrpc.serverstub.genmsg.HelloRequest,
      com.zelex.handrpc.serverstub.genmsg.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.zelex.handrpc.serverstub.genmsg.HelloRequest, com.zelex.handrpc.serverstub.genmsg.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = RpcServerServiceGrpc.getSayHelloMethod) == null) {
      synchronized (RpcServerServiceGrpc.class) {
        if ((getSayHelloMethod = RpcServerServiceGrpc.getSayHelloMethod) == null) {
          RpcServerServiceGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<com.zelex.handrpc.serverstub.genmsg.HelloRequest, com.zelex.handrpc.serverstub.genmsg.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zelex.handrpc.serverstub.genmsg.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zelex.handrpc.serverstub.genmsg.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcServerServiceMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RpcServerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcServerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcServerServiceStub>() {
        @java.lang.Override
        public RpcServerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcServerServiceStub(channel, callOptions);
        }
      };
    return RpcServerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RpcServerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcServerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcServerServiceBlockingStub>() {
        @java.lang.Override
        public RpcServerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcServerServiceBlockingStub(channel, callOptions);
        }
      };
    return RpcServerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RpcServerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcServerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcServerServiceFutureStub>() {
        @java.lang.Override
        public RpcServerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcServerServiceFutureStub(channel, callOptions);
        }
      };
    return RpcServerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * greeting服务定义
   * </pre>
   */
  public static abstract class RpcServerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * sayHello方法，格式为"方法名 请求参数 返回参数"
     * </pre>
     */
    public void sayHello(com.zelex.handrpc.serverstub.genmsg.HelloRequest request,
        io.grpc.stub.StreamObserver<com.zelex.handrpc.serverstub.genmsg.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.zelex.handrpc.serverstub.genmsg.HelloRequest,
                com.zelex.handrpc.serverstub.genmsg.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   * <pre>
   * greeting服务定义
   * </pre>
   */
  public static final class RpcServerServiceStub extends io.grpc.stub.AbstractAsyncStub<RpcServerServiceStub> {
    private RpcServerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcServerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcServerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * sayHello方法，格式为"方法名 请求参数 返回参数"
     * </pre>
     */
    public void sayHello(com.zelex.handrpc.serverstub.genmsg.HelloRequest request,
        io.grpc.stub.StreamObserver<com.zelex.handrpc.serverstub.genmsg.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * greeting服务定义
   * </pre>
   */
  public static final class RpcServerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RpcServerServiceBlockingStub> {
    private RpcServerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcServerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcServerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * sayHello方法，格式为"方法名 请求参数 返回参数"
     * </pre>
     */
    public com.zelex.handrpc.serverstub.genmsg.HelloReply sayHello(com.zelex.handrpc.serverstub.genmsg.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * greeting服务定义
   * </pre>
   */
  public static final class RpcServerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RpcServerServiceFutureStub> {
    private RpcServerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcServerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcServerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * sayHello方法，格式为"方法名 请求参数 返回参数"
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zelex.handrpc.serverstub.genmsg.HelloReply> sayHello(
        com.zelex.handrpc.serverstub.genmsg.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RpcServerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RpcServerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.zelex.handrpc.serverstub.genmsg.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.zelex.handrpc.serverstub.genmsg.HelloReply>) responseObserver);
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

  private static abstract class RpcServerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RpcServerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zelex.handrpc.serverstub.genmsg.RpcService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RpcServerService");
    }
  }

  private static final class RpcServerServiceFileDescriptorSupplier
      extends RpcServerServiceBaseDescriptorSupplier {
    RpcServerServiceFileDescriptorSupplier() {}
  }

  private static final class RpcServerServiceMethodDescriptorSupplier
      extends RpcServerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RpcServerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RpcServerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RpcServerServiceFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
