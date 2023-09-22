package co.com.bancodebogota.number.generation.grpc;

import static co.com.bancodebogota.number.generation.grpc.NumberGenerationGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: v1/numberGeneration.proto")
public final class MutinyNumberGenerationGrpc implements io.quarkus.grpc.MutinyGrpc {

    private MutinyNumberGenerationGrpc() {
    }

    public static MutinyNumberGenerationStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyNumberGenerationStub(channel);
    }

    public static class MutinyNumberGenerationStub extends io.grpc.stub.AbstractStub<MutinyNumberGenerationStub> implements io.quarkus.grpc.MutinyStub {

        private NumberGenerationGrpc.NumberGenerationStub delegateStub;

        private MutinyNumberGenerationStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = NumberGenerationGrpc.newStub(channel);
        }

        private MutinyNumberGenerationStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = NumberGenerationGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyNumberGenerationStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyNumberGenerationStub(channel, callOptions);
        }

        /**
         * <pre>
         *  Unary
         * </pre>
         */
        public io.smallrye.mutiny.Uni<co.com.bancodebogota.number.generation.grpc.GeneratedNumbersResponse> generatedNumbers(co.com.bancodebogota.number.generation.grpc.GeneratedNumbersRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::generatedNumbers);
        }

        /**
         * <pre>
         *  Server Streaming
         * </pre>
         */
        public io.smallrye.mutiny.Multi<co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomResponse> generatedMultipleSecureRandom(co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToMany(request, delegateStub::generatedMultipleSecureRandom);
        }
    }

    public static abstract class NumberGenerationImplBase implements io.grpc.BindableService {

        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public NumberGenerationImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        /**
         * <pre>
         *  Unary
         * </pre>
         */
        public io.smallrye.mutiny.Uni<co.com.bancodebogota.number.generation.grpc.GeneratedNumbersResponse> generatedNumbers(co.com.bancodebogota.number.generation.grpc.GeneratedNumbersRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Server Streaming
         * </pre>
         */
        public io.smallrye.mutiny.Multi<co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomResponse> generatedMultipleSecureRandom(co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(co.com.bancodebogota.number.generation.grpc.NumberGenerationGrpc.getGeneratedNumbersMethod(), asyncUnaryCall(new MethodHandlers<co.com.bancodebogota.number.generation.grpc.GeneratedNumbersRequest, co.com.bancodebogota.number.generation.grpc.GeneratedNumbersResponse>(this, METHODID_GENERATED_NUMBERS, compression))).addMethod(co.com.bancodebogota.number.generation.grpc.NumberGenerationGrpc.getGeneratedMultipleSecureRandomMethod(), asyncServerStreamingCall(new MethodHandlers<co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest, co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomResponse>(this, METHODID_GENERATED_MULTIPLE_SECURE_RANDOM, compression))).build();
        }
    }

    private static final int METHODID_GENERATED_NUMBERS = 0;

    private static final int METHODID_GENERATED_MULTIPLE_SECURE_RANDOM = 1;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>, io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final NumberGenerationImplBase serviceImpl;

        private final int methodId;

        private final String compression;

        MethodHandlers(NumberGenerationImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_GENERATED_NUMBERS:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((co.com.bancodebogota.number.generation.grpc.GeneratedNumbersRequest) request, (io.grpc.stub.StreamObserver<co.com.bancodebogota.number.generation.grpc.GeneratedNumbersResponse>) responseObserver, compression, serviceImpl::generatedNumbers);
                    break;
                case METHODID_GENERATED_MULTIPLE_SECURE_RANDOM:
                    io.quarkus.grpc.stubs.ServerCalls.oneToMany((co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest) request, (io.grpc.stub.StreamObserver<co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomResponse>) responseObserver, compression, serviceImpl::generatedMultipleSecureRandom);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }
}
