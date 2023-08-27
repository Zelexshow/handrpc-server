// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpcService.proto

package com.zelex.handrpc.serverstub.genmsg;

/**
 * <pre>
 * greeting服务定义
 * </pre>
 *
 * Protobuf service {@code RpcServerService}
 */
public  abstract class RpcServerService
    implements com.google.protobuf.Service {
  protected RpcServerService() {}

  public interface Interface {
    /**
     * <pre>
     * sayHello方法，格式为"方法名 请求参数 返回参数"
     * </pre>
     *
     * <code>rpc SayHello(.HelloRequest) returns (.HelloReply);</code>
     */
    public abstract void sayHello(
        com.google.protobuf.RpcController controller,
        com.zelex.handrpc.serverstub.genmsg.HelloRequest request,
        com.google.protobuf.RpcCallback<com.zelex.handrpc.serverstub.genmsg.HelloReply> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new RpcServerService() {
      @java.lang.Override
      public  void sayHello(
          com.google.protobuf.RpcController controller,
          com.zelex.handrpc.serverstub.genmsg.HelloRequest request,
          com.google.protobuf.RpcCallback<com.zelex.handrpc.serverstub.genmsg.HelloReply> done) {
        impl.sayHello(controller, request, done);
      }

    };
  }

  public static com.google.protobuf.BlockingService
      newReflectiveBlockingService(final BlockingInterface impl) {
    return new com.google.protobuf.BlockingService() {
      public final com.google.protobuf.Descriptors.ServiceDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }

      public final com.google.protobuf.Message callBlockingMethod(
          com.google.protobuf.Descriptors.MethodDescriptor method,
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Message request)
          throws com.google.protobuf.ServiceException {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.callBlockingMethod() given method descriptor for " +
            "wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return impl.sayHello(controller, (com.zelex.handrpc.serverstub.genmsg.HelloRequest)request);
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getRequestPrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getRequestPrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return com.zelex.handrpc.serverstub.genmsg.HelloRequest.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getResponsePrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getResponsePrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return com.zelex.handrpc.serverstub.genmsg.HelloReply.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <pre>
   * sayHello方法，格式为"方法名 请求参数 返回参数"
   * </pre>
   *
   * <code>rpc SayHello(.HelloRequest) returns (.HelloReply);</code>
   */
  public abstract void sayHello(
      com.google.protobuf.RpcController controller,
      com.zelex.handrpc.serverstub.genmsg.HelloRequest request,
      com.google.protobuf.RpcCallback<com.zelex.handrpc.serverstub.genmsg.HelloReply> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return com.zelex.handrpc.serverstub.genmsg.RpcService.getDescriptor().getServices().get(0);
  }
  public final com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }

  public final void callMethod(
      com.google.protobuf.Descriptors.MethodDescriptor method,
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Message request,
      com.google.protobuf.RpcCallback<
        com.google.protobuf.Message> done) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.callMethod() given method descriptor for wrong " +
        "service type.");
    }
    switch(method.getIndex()) {
      case 0:
        this.sayHello(controller, (com.zelex.handrpc.serverstub.genmsg.HelloRequest)request,
          com.google.protobuf.RpcUtil.<com.zelex.handrpc.serverstub.genmsg.HelloReply>specializeCallback(
            done));
        return;
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getRequestPrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getRequestPrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return com.zelex.handrpc.serverstub.genmsg.HelloRequest.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getResponsePrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getResponsePrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return com.zelex.handrpc.serverstub.genmsg.HelloReply.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends com.zelex.handrpc.serverstub.genmsg.RpcServerService implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void sayHello(
        com.google.protobuf.RpcController controller,
        com.zelex.handrpc.serverstub.genmsg.HelloRequest request,
        com.google.protobuf.RpcCallback<com.zelex.handrpc.serverstub.genmsg.HelloReply> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        com.zelex.handrpc.serverstub.genmsg.HelloReply.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.zelex.handrpc.serverstub.genmsg.HelloReply.class,
          com.zelex.handrpc.serverstub.genmsg.HelloReply.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public com.zelex.handrpc.serverstub.genmsg.HelloReply sayHello(
        com.google.protobuf.RpcController controller,
        com.zelex.handrpc.serverstub.genmsg.HelloRequest request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public com.zelex.handrpc.serverstub.genmsg.HelloReply sayHello(
        com.google.protobuf.RpcController controller,
        com.zelex.handrpc.serverstub.genmsg.HelloRequest request)
        throws com.google.protobuf.ServiceException {
      return (com.zelex.handrpc.serverstub.genmsg.HelloReply) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        com.zelex.handrpc.serverstub.genmsg.HelloReply.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:RpcServerService)
}

