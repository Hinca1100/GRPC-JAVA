package co.com.bancodebogota.number.generation.grpc;

import java.util.function.BiFunction;
import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: v1/numberGeneration.proto")
public class NumberGenerationClient implements NumberGeneration, MutinyClient<MutinyNumberGenerationGrpc.MutinyNumberGenerationStub> {

    private final MutinyNumberGenerationGrpc.MutinyNumberGenerationStub stub;

    public NumberGenerationClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyNumberGenerationGrpc.MutinyNumberGenerationStub, MutinyNumberGenerationGrpc.MutinyNumberGenerationStub> stubConfigurator) {
        this.stub = stubConfigurator.apply(name, MutinyNumberGenerationGrpc.newMutinyStub(channel));
    }

    private NumberGenerationClient(MutinyNumberGenerationGrpc.MutinyNumberGenerationStub stub) {
        this.stub = stub;
    }

    public NumberGenerationClient newInstanceWithStub(MutinyNumberGenerationGrpc.MutinyNumberGenerationStub stub) {
        return new NumberGenerationClient(stub);
    }

    @Override
    public MutinyNumberGenerationGrpc.MutinyNumberGenerationStub getStub() {
        return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<co.com.bancodebogota.number.generation.grpc.GeneratedNumbersResponse> generatedNumbers(co.com.bancodebogota.number.generation.grpc.GeneratedNumbersRequest request) {
        return stub.generatedNumbers(request);
    }

    @Override
    public io.smallrye.mutiny.Multi<co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomResponse> generatedMultipleSecureRandom(co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest request) {
        return stub.generatedMultipleSecureRandom(request);
    }
}
