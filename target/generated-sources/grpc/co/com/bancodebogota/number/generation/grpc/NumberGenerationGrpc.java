package co.com.bancodebogota.number.generation.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.quarkus.grpc.common.Generated(value = "by gRPC proto compiler (version 1.56.0)", comments = "Source: v1/numberGeneration.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NumberGenerationGrpc {

    private NumberGenerationGrpc() {
    }

    public static final String SERVICE_NAME = "v1.NumberGeneration";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<co.com.bancodebogota.number.generation.grpc.GeneratedNumbersRequest, co.com.bancodebogota.number.generation.grpc.GeneratedNumbersResponse> getGeneratedNumbersMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "GeneratedNumbers", requestType = co.com.bancodebogota.number.generation.grpc.GeneratedNumbersRequest.class, responseType = co.com.bancodebogota.number.generation.grpc.GeneratedNumbersResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<co.com.bancodebogota.number.generation.grpc.GeneratedNumbersRequest, co.com.bancodebogota.number.generation.grpc.GeneratedNumbersResponse> getGeneratedNumbersMethod() {
        io.grpc.MethodDescriptor<co.com.bancodebogota.number.generation.grpc.GeneratedNumbersRequest, co.com.bancodebogota.number.generation.grpc.GeneratedNumbersResponse> getGeneratedNumbersMethod;
        if ((getGeneratedNumbersMethod = NumberGenerationGrpc.getGeneratedNumbersMethod) == null) {
            synchronized (NumberGenerationGrpc.class) {
                if ((getGeneratedNumbersMethod = NumberGenerationGrpc.getGeneratedNumbersMethod) == null) {
                    NumberGenerationGrpc.getGeneratedNumbersMethod = getGeneratedNumbersMethod = io.grpc.MethodDescriptor.<co.com.bancodebogota.number.generation.grpc.GeneratedNumbersRequest, co.com.bancodebogota.number.generation.grpc.GeneratedNumbersResponse>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "GeneratedNumbers")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(co.com.bancodebogota.number.generation.grpc.GeneratedNumbersRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(co.com.bancodebogota.number.generation.grpc.GeneratedNumbersResponse.getDefaultInstance())).setSchemaDescriptor(new NumberGenerationMethodDescriptorSupplier("GeneratedNumbers")).build();
                }
            }
        }
        return getGeneratedNumbersMethod;
    }

    private static volatile io.grpc.MethodDescriptor<co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest, co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomResponse> getGeneratedMultipleSecureRandomMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "GeneratedMultipleSecureRandom", requestType = co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest.class, responseType = co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
    public static io.grpc.MethodDescriptor<co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest, co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomResponse> getGeneratedMultipleSecureRandomMethod() {
        io.grpc.MethodDescriptor<co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest, co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomResponse> getGeneratedMultipleSecureRandomMethod;
        if ((getGeneratedMultipleSecureRandomMethod = NumberGenerationGrpc.getGeneratedMultipleSecureRandomMethod) == null) {
            synchronized (NumberGenerationGrpc.class) {
                if ((getGeneratedMultipleSecureRandomMethod = NumberGenerationGrpc.getGeneratedMultipleSecureRandomMethod) == null) {
                    NumberGenerationGrpc.getGeneratedMultipleSecureRandomMethod = getGeneratedMultipleSecureRandomMethod = io.grpc.MethodDescriptor.<co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest, co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomResponse>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING).setFullMethodName(generateFullMethodName(SERVICE_NAME, "GeneratedMultipleSecureRandom")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomResponse.getDefaultInstance())).setSchemaDescriptor(new NumberGenerationMethodDescriptorSupplier("GeneratedMultipleSecureRandom")).build();
                }
            }
        }
        return getGeneratedMultipleSecureRandomMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static NumberGenerationStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<NumberGenerationStub> factory = new io.grpc.stub.AbstractStub.StubFactory<NumberGenerationStub>() {

            @java.lang.Override
            public NumberGenerationStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new NumberGenerationStub(channel, callOptions);
            }
        };
        return NumberGenerationStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static NumberGenerationBlockingStub newBlockingStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<NumberGenerationBlockingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<NumberGenerationBlockingStub>() {

            @java.lang.Override
            public NumberGenerationBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new NumberGenerationBlockingStub(channel, callOptions);
            }
        };
        return NumberGenerationBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static NumberGenerationFutureStub newFutureStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<NumberGenerationFutureStub> factory = new io.grpc.stub.AbstractStub.StubFactory<NumberGenerationFutureStub>() {

            @java.lang.Override
            public NumberGenerationFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new NumberGenerationFutureStub(channel, callOptions);
            }
        };
        return NumberGenerationFutureStub.newStub(factory, channel);
    }

    /**
     */
    public interface AsyncService {

        /**
         * <pre>
         * Unary
         * </pre>
         */
        default void generatedNumbers(co.com.bancodebogota.number.generation.grpc.GeneratedNumbersRequest request, io.grpc.stub.StreamObserver<co.com.bancodebogota.number.generation.grpc.GeneratedNumbersResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGeneratedNumbersMethod(), responseObserver);
        }

        /**
         * <pre>
         * Server Streaming
         * </pre>
         */
        default void generatedMultipleSecureRandom(co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest request, io.grpc.stub.StreamObserver<co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGeneratedMultipleSecureRandomMethod(), responseObserver);
        }
    }

    /**
     * Base class for the server implementation of the service NumberGeneration.
     */
    public static abstract class NumberGenerationImplBase implements io.grpc.BindableService, AsyncService {

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return NumberGenerationGrpc.bindService(this);
        }
    }

    /**
     * A stub to allow clients to do asynchronous rpc calls to service NumberGeneration.
     */
    public static class NumberGenerationStub extends io.grpc.stub.AbstractAsyncStub<NumberGenerationStub> {

        private NumberGenerationStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected NumberGenerationStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new NumberGenerationStub(channel, callOptions);
        }

        /**
         * <pre>
         * Unary
         * </pre>
         */
        public void generatedNumbers(co.com.bancodebogota.number.generation.grpc.GeneratedNumbersRequest request, io.grpc.stub.StreamObserver<co.com.bancodebogota.number.generation.grpc.GeneratedNumbersResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGeneratedNumbersMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         * <pre>
         * Server Streaming
         * </pre>
         */
        public void generatedMultipleSecureRandom(co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest request, io.grpc.stub.StreamObserver<co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncServerStreamingCall(getChannel().newCall(getGeneratedMultipleSecureRandomMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * A stub to allow clients to do synchronous rpc calls to service NumberGeneration.
     */
    public static class NumberGenerationBlockingStub extends io.grpc.stub.AbstractBlockingStub<NumberGenerationBlockingStub> {

        private NumberGenerationBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected NumberGenerationBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new NumberGenerationBlockingStub(channel, callOptions);
        }

        /**
         * <pre>
         * Unary
         * </pre>
         */
        public co.com.bancodebogota.number.generation.grpc.GeneratedNumbersResponse generatedNumbers(co.com.bancodebogota.number.generation.grpc.GeneratedNumbersRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGeneratedNumbersMethod(), getCallOptions(), request);
        }

        /**
         * <pre>
         * Server Streaming
         * </pre>
         */
        public java.util.Iterator<co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomResponse> generatedMultipleSecureRandom(co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest request) {
            return io.grpc.stub.ClientCalls.blockingServerStreamingCall(getChannel(), getGeneratedMultipleSecureRandomMethod(), getCallOptions(), request);
        }
    }

    /**
     * A stub to allow clients to do ListenableFuture-style rpc calls to service NumberGeneration.
     */
    public static class NumberGenerationFutureStub extends io.grpc.stub.AbstractFutureStub<NumberGenerationFutureStub> {

        private NumberGenerationFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected NumberGenerationFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new NumberGenerationFutureStub(channel, callOptions);
        }

        /**
         * <pre>
         * Unary
         * </pre>
         */
        public com.google.common.util.concurrent.ListenableFuture<co.com.bancodebogota.number.generation.grpc.GeneratedNumbersResponse> generatedNumbers(co.com.bancodebogota.number.generation.grpc.GeneratedNumbersRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getGeneratedNumbersMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_GENERATED_NUMBERS = 0;

    private static final int METHODID_GENERATED_MULTIPLE_SECURE_RANDOM = 1;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>, io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final AsyncService serviceImpl;

        private final int methodId;

        MethodHandlers(AsyncService serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_GENERATED_NUMBERS:
                    serviceImpl.generatedNumbers((co.com.bancodebogota.number.generation.grpc.GeneratedNumbersRequest) request, (io.grpc.stub.StreamObserver<co.com.bancodebogota.number.generation.grpc.GeneratedNumbersResponse>) responseObserver);
                    break;
                case METHODID_GENERATED_MULTIPLE_SECURE_RANDOM:
                    serviceImpl.generatedMultipleSecureRandom((co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest) request, (io.grpc.stub.StreamObserver<co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomResponse>) responseObserver);
                    break;
                default:
                    throw new AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                default:
                    throw new AssertionError();
            }
        }
    }

    public static io.grpc.ServerServiceDefinition bindService(AsyncService service) {
        return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(getGeneratedNumbersMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<co.com.bancodebogota.number.generation.grpc.GeneratedNumbersRequest, co.com.bancodebogota.number.generation.grpc.GeneratedNumbersResponse>(service, METHODID_GENERATED_NUMBERS))).addMethod(getGeneratedMultipleSecureRandomMethod(), io.grpc.stub.ServerCalls.asyncServerStreamingCall(new MethodHandlers<co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest, co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomResponse>(service, METHODID_GENERATED_MULTIPLE_SECURE_RANDOM))).build();
    }

    private static abstract class NumberGenerationBaseDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {

        NumberGenerationBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return co.com.bancodebogota.number.generation.grpc.NumberGenerationOuterClass.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("NumberGeneration");
        }
    }

    private static final class NumberGenerationFileDescriptorSupplier extends NumberGenerationBaseDescriptorSupplier {

        NumberGenerationFileDescriptorSupplier() {
        }
    }

    private static final class NumberGenerationMethodDescriptorSupplier extends NumberGenerationBaseDescriptorSupplier implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

        private final String methodName;

        NumberGenerationMethodDescriptorSupplier(String methodName) {
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
            synchronized (NumberGenerationGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME).setSchemaDescriptor(new NumberGenerationFileDescriptorSupplier()).addMethod(getGeneratedNumbersMethod()).addMethod(getGeneratedMultipleSecureRandomMethod()).build();
                }
            }
        }
        return result;
    }
}
