package co.com.bancodebogota.number.generation.grpc;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: v1/numberGeneration.proto")
public class NumberGenerationBean extends MutinyNumberGenerationGrpc.NumberGenerationImplBase implements BindableService, MutinyBean {

    private final NumberGeneration delegate;

    NumberGenerationBean(@GrpcService NumberGeneration delegate) {
        this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<co.com.bancodebogota.number.generation.grpc.GeneratedNumbersResponse> generatedNumbers(co.com.bancodebogota.number.generation.grpc.GeneratedNumbersRequest request) {
        try {
            return delegate.generatedNumbers(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Multi<co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomResponse> generatedMultipleSecureRandom(co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest request) {
        try {
            return delegate.generatedMultipleSecureRandom(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }
}
