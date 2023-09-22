package co.com.bancodebogota.number.generation.grpc;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: v1/numberGeneration.proto")
public interface NumberGeneration extends MutinyService {

    /**
     * <pre>
     *  Unary
     * </pre>
     */
    io.smallrye.mutiny.Uni<co.com.bancodebogota.number.generation.grpc.GeneratedNumbersResponse> generatedNumbers(co.com.bancodebogota.number.generation.grpc.GeneratedNumbersRequest request);

    /**
     * <pre>
     *  Server Streaming
     * </pre>
     */
    io.smallrye.mutiny.Multi<co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomResponse> generatedMultipleSecureRandom(co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest request);
}
