package com.zelex.handrpc.serverstarter.service.impl;


import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcController;
import com.zelex.handrpc.serverstub.genmsg.*;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@Slf4j
@GrpcService
public class RpcSeverServiceImpl extends RpcServerServiceGrpc.RpcServerServiceImplBase {

    private final String REPLY_SUFFIX = ",你好!";
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {

        String name = request.getName();
        log.info("request come in, name: {}", name);
        HelloReply.Builder builder = HelloReply.newBuilder();
        builder.setMessage(name + REPLY_SUFFIX);
        HelloReply reply = builder.build();
        // 返回
        responseObserver.onNext(reply);
        responseObserver.onCompleted();

    }
}

