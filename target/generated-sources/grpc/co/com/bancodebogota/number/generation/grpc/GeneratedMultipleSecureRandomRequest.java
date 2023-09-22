// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/numberGeneration.proto
package co.com.bancodebogota.number.generation.grpc;

/**
 * Protobuf type {@code v1.GeneratedMultipleSecureRandomRequest}
 */
public final class GeneratedMultipleSecureRandomRequest extends com.google.protobuf.GeneratedMessageV3 implements // @@protoc_insertion_point(message_implements:v1.GeneratedMultipleSecureRandomRequest)
GeneratedMultipleSecureRandomRequestOrBuilder {

    private static final long serialVersionUID = 0L;

    // Use GeneratedMultipleSecureRandomRequest.newBuilder() to construct.
    private GeneratedMultipleSecureRandomRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private GeneratedMultipleSecureRandomRequest() {
        requestId_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({ "unused" })
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
        return new GeneratedMultipleSecureRandomRequest();
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return co.com.bancodebogota.number.generation.grpc.NumberGenerationOuterClass.internal_static_v1_GeneratedMultipleSecureRandomRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return co.com.bancodebogota.number.generation.grpc.NumberGenerationOuterClass.internal_static_v1_GeneratedMultipleSecureRandomRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest.class, co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest.Builder.class);
    }

    public static final int REQUEST_ID_FIELD_NUMBER = 1;

    @SuppressWarnings("serial")
    private volatile java.lang.Object requestId_ = "";

    /**
     * <code>string request_id = 1;</code>
     * @return The requestId.
     */
    @java.lang.Override
    public java.lang.String getRequestId() {
        java.lang.Object ref = requestId_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            requestId_ = s;
            return s;
        }
    }

    /**
     * <code>string request_id = 1;</code>
     * @return The bytes for requestId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getRequestIdBytes() {
        java.lang.Object ref = requestId_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
            requestId_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1)
            return true;
        if (isInitialized == 0)
            return false;
        memoizedIsInitialized = 1;
        return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestId_)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 1, requestId_);
        }
        getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1)
            return size;
        size = 0;
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestId_)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, requestId_);
        }
        size += getUnknownFields().getSerializedSize();
        memoizedSize = size;
        return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest)) {
            return super.equals(obj);
        }
        co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest other = (co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest) obj;
        if (!getRequestId().equals(other.getRequestId()))
            return false;
        if (!getUnknownFields().equals(other.getUnknownFields()))
            return false;
        return true;
    }

    @java.lang.Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
        hash = (53 * hash) + getRequestId().hashCode();
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest parseFrom(java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    /**
     * Protobuf type {@code v1.GeneratedMultipleSecureRandomRequest}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements // @@protoc_insertion_point(builder_implements:v1.GeneratedMultipleSecureRandomRequest)
    co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequestOrBuilder {

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return co.com.bancodebogota.number.generation.grpc.NumberGenerationOuterClass.internal_static_v1_GeneratedMultipleSecureRandomRequest_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return co.com.bancodebogota.number.generation.grpc.NumberGenerationOuterClass.internal_static_v1_GeneratedMultipleSecureRandomRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest.class, co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest.Builder.class);
        }

        // Construct using co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest.newBuilder()
        private Builder() {
        }

        private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            super(parent);
        }

        @java.lang.Override
        public Builder clear() {
            super.clear();
            bitField0_ = 0;
            requestId_ = "";
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
            return co.com.bancodebogota.number.generation.grpc.NumberGenerationOuterClass.internal_static_v1_GeneratedMultipleSecureRandomRequest_descriptor;
        }

        @java.lang.Override
        public co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest getDefaultInstanceForType() {
            return co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest.getDefaultInstance();
        }

        @java.lang.Override
        public co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest build() {
            co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest buildPartial() {
            co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest result = new co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest(this);
            if (bitField0_ != 0) {
                buildPartial0(result);
            }
            onBuilt();
            return result;
        }

        private void buildPartial0(co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest result) {
            int from_bitField0_ = bitField0_;
            if (((from_bitField0_ & 0x00000001) != 0)) {
                result.requestId_ = requestId_;
            }
        }

        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest) {
                return mergeFrom((co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest other) {
            if (other == co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest.getDefaultInstance())
                return this;
            if (!other.getRequestId().isEmpty()) {
                requestId_ = other.requestId_;
                bitField0_ |= 0x00000001;
                onChanged();
            }
            this.mergeUnknownFields(other.getUnknownFields());
            onChanged();
            return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
            return true;
        }

        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch(tag) {
                        case 0:
                            done = true;
                            break;
                        case 10:
                            {
                                requestId_ = input.readStringRequireUtf8();
                                bitField0_ |= 0x00000001;
                                break;
                            }
                        // case 10
                        default:
                            {
                                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                                    // was an endgroup tag
                                    done = true;
                                }
                                break;
                            }
                    }
                    // switch (tag)
                }
                // while (!done)
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.unwrapIOException();
            } finally {
                onChanged();
            }
            // finally
            return this;
        }

        private int bitField0_;

        private java.lang.Object requestId_ = "";

        /**
         * <code>string request_id = 1;</code>
         * @return The requestId.
         */
        public java.lang.String getRequestId() {
            java.lang.Object ref = requestId_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                requestId_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <code>string request_id = 1;</code>
         * @return The bytes for requestId.
         */
        public com.google.protobuf.ByteString getRequestIdBytes() {
            java.lang.Object ref = requestId_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
                requestId_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string request_id = 1;</code>
         * @param value The requestId to set.
         * @return This builder for chaining.
         */
        public Builder setRequestId(java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            requestId_ = value;
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        /**
         * <code>string request_id = 1;</code>
         * @return This builder for chaining.
         */
        public Builder clearRequestId() {
            requestId_ = getDefaultInstance().getRequestId();
            bitField0_ = (bitField0_ & ~0x00000001);
            onChanged();
            return this;
        }

        /**
         * <code>string request_id = 1;</code>
         * @param value The bytes for requestId to set.
         * @return This builder for chaining.
         */
        public Builder setRequestIdBytes(com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);
            requestId_ = value;
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        @java.lang.Override
        public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }
        // @@protoc_insertion_point(builder_scope:v1.GeneratedMultipleSecureRandomRequest)
    }

    // @@protoc_insertion_point(class_scope:v1.GeneratedMultipleSecureRandomRequest)
    private static final co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest();
    }

    public static co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GeneratedMultipleSecureRandomRequest> PARSER = new com.google.protobuf.AbstractParser<GeneratedMultipleSecureRandomRequest>() {

        @java.lang.Override
        public GeneratedMultipleSecureRandomRequest parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            Builder builder = newBuilder();
            try {
                builder.mergeFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
            } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(builder.buildPartial());
            }
            return builder.buildPartial();
        }
    };

    public static com.google.protobuf.Parser<GeneratedMultipleSecureRandomRequest> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GeneratedMultipleSecureRandomRequest> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public co.com.bancodebogota.number.generation.grpc.GeneratedMultipleSecureRandomRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
