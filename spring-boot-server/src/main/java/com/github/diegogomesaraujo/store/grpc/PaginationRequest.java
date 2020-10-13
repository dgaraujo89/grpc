// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shopping.proto

package com.github.diegogomesaraujo.store.grpc;

/**
 * Protobuf type {@code com.github.diegogomesaraujo.store.grpc.PaginationRequest}
 */
public  final class PaginationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.github.diegogomesaraujo.store.grpc.PaginationRequest)
    PaginationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PaginationRequest.newBuilder() to construct.
  private PaginationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PaginationRequest() {
    page_ = 0;
    size_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PaginationRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            page_ = input.readInt32();
            break;
          }
          case 16: {

            size_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.diegogomesaraujo.store.grpc.Store.internal_static_com_github_diegogomesaraujo_store_grpc_PaginationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.diegogomesaraujo.store.grpc.Store.internal_static_com_github_diegogomesaraujo_store_grpc_PaginationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.diegogomesaraujo.store.grpc.PaginationRequest.class, com.github.diegogomesaraujo.store.grpc.PaginationRequest.Builder.class);
  }

  public static final int PAGE_FIELD_NUMBER = 1;
  private int page_;
  /**
   * <code>int32 page = 1;</code>
   */
  public int getPage() {
    return page_;
  }

  public static final int SIZE_FIELD_NUMBER = 2;
  private int size_;
  /**
   * <code>int32 size = 2;</code>
   */
  public int getSize() {
    return size_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (page_ != 0) {
      output.writeInt32(1, page_);
    }
    if (size_ != 0) {
      output.writeInt32(2, size_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (page_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, page_);
    }
    if (size_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, size_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.github.diegogomesaraujo.store.grpc.PaginationRequest)) {
      return super.equals(obj);
    }
    com.github.diegogomesaraujo.store.grpc.PaginationRequest other = (com.github.diegogomesaraujo.store.grpc.PaginationRequest) obj;

    boolean result = true;
    result = result && (getPage()
        == other.getPage());
    result = result && (getSize()
        == other.getSize());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PAGE_FIELD_NUMBER;
    hash = (53 * hash) + getPage();
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getSize();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.diegogomesaraujo.store.grpc.PaginationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.diegogomesaraujo.store.grpc.PaginationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.diegogomesaraujo.store.grpc.PaginationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.diegogomesaraujo.store.grpc.PaginationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.diegogomesaraujo.store.grpc.PaginationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.diegogomesaraujo.store.grpc.PaginationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.diegogomesaraujo.store.grpc.PaginationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.diegogomesaraujo.store.grpc.PaginationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.diegogomesaraujo.store.grpc.PaginationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.diegogomesaraujo.store.grpc.PaginationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.diegogomesaraujo.store.grpc.PaginationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.diegogomesaraujo.store.grpc.PaginationRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.diegogomesaraujo.store.grpc.PaginationRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.github.diegogomesaraujo.store.grpc.PaginationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.github.diegogomesaraujo.store.grpc.PaginationRequest)
      com.github.diegogomesaraujo.store.grpc.PaginationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.diegogomesaraujo.store.grpc.Store.internal_static_com_github_diegogomesaraujo_store_grpc_PaginationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.diegogomesaraujo.store.grpc.Store.internal_static_com_github_diegogomesaraujo_store_grpc_PaginationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.diegogomesaraujo.store.grpc.PaginationRequest.class, com.github.diegogomesaraujo.store.grpc.PaginationRequest.Builder.class);
    }

    // Construct using com.github.diegogomesaraujo.store.grpc.PaginationRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      page_ = 0;

      size_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.diegogomesaraujo.store.grpc.Store.internal_static_com_github_diegogomesaraujo_store_grpc_PaginationRequest_descriptor;
    }

    @java.lang.Override
    public com.github.diegogomesaraujo.store.grpc.PaginationRequest getDefaultInstanceForType() {
      return com.github.diegogomesaraujo.store.grpc.PaginationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.diegogomesaraujo.store.grpc.PaginationRequest build() {
      com.github.diegogomesaraujo.store.grpc.PaginationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.diegogomesaraujo.store.grpc.PaginationRequest buildPartial() {
      com.github.diegogomesaraujo.store.grpc.PaginationRequest result = new com.github.diegogomesaraujo.store.grpc.PaginationRequest(this);
      result.page_ = page_;
      result.size_ = size_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.diegogomesaraujo.store.grpc.PaginationRequest) {
        return mergeFrom((com.github.diegogomesaraujo.store.grpc.PaginationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.diegogomesaraujo.store.grpc.PaginationRequest other) {
      if (other == com.github.diegogomesaraujo.store.grpc.PaginationRequest.getDefaultInstance()) return this;
      if (other.getPage() != 0) {
        setPage(other.getPage());
      }
      if (other.getSize() != 0) {
        setSize(other.getSize());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.github.diegogomesaraujo.store.grpc.PaginationRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.diegogomesaraujo.store.grpc.PaginationRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int page_ ;
    /**
     * <code>int32 page = 1;</code>
     */
    public int getPage() {
      return page_;
    }
    /**
     * <code>int32 page = 1;</code>
     */
    public Builder setPage(int value) {
      
      page_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 page = 1;</code>
     */
    public Builder clearPage() {
      
      page_ = 0;
      onChanged();
      return this;
    }

    private int size_ ;
    /**
     * <code>int32 size = 2;</code>
     */
    public int getSize() {
      return size_;
    }
    /**
     * <code>int32 size = 2;</code>
     */
    public Builder setSize(int value) {
      
      size_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 size = 2;</code>
     */
    public Builder clearSize() {
      
      size_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.github.diegogomesaraujo.store.grpc.PaginationRequest)
  }

  // @@protoc_insertion_point(class_scope:com.github.diegogomesaraujo.store.grpc.PaginationRequest)
  private static final com.github.diegogomesaraujo.store.grpc.PaginationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.diegogomesaraujo.store.grpc.PaginationRequest();
  }

  public static com.github.diegogomesaraujo.store.grpc.PaginationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PaginationRequest>
      PARSER = new com.google.protobuf.AbstractParser<PaginationRequest>() {
    @java.lang.Override
    public PaginationRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PaginationRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PaginationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PaginationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.diegogomesaraujo.store.grpc.PaginationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
