// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: people.proto

package com.github.diegogomesaraujo.people.grpc;

/**
 * Protobuf type {@code com.github.diegogomesaraujo.people.grpc.Person}
 */
public  final class Person extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.github.diegogomesaraujo.people.grpc.Person)
    PersonOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Person.newBuilder() to construct.
  private Person(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Person() {
    id_ = 0L;
    name_ = "";
    age_ = 0;
    email_ = "";
    phones_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Person(
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

            id_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 24: {

            age_ = input.readInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            email_ = s;
            break;
          }
          case 42: {
            if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
              phones_ = new java.util.ArrayList<com.github.diegogomesaraujo.people.grpc.Phone>();
              mutable_bitField0_ |= 0x00000010;
            }
            phones_.add(
                input.readMessage(com.github.diegogomesaraujo.people.grpc.Phone.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
        phones_ = java.util.Collections.unmodifiableList(phones_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.diegogomesaraujo.people.grpc.People.internal_static_com_github_diegogomesaraujo_people_grpc_Person_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.diegogomesaraujo.people.grpc.People.internal_static_com_github_diegogomesaraujo_people_grpc_Person_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.diegogomesaraujo.people.grpc.Person.class, com.github.diegogomesaraujo.people.grpc.Person.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>int64 id = 1;</code>
   */
  public long getId() {
    return id_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AGE_FIELD_NUMBER = 3;
  private int age_;
  /**
   * <code>int32 age = 3;</code>
   */
  public int getAge() {
    return age_;
  }

  public static final int EMAIL_FIELD_NUMBER = 4;
  private volatile java.lang.Object email_;
  /**
   * <code>string email = 4;</code>
   */
  public java.lang.String getEmail() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      email_ = s;
      return s;
    }
  }
  /**
   * <code>string email = 4;</code>
   */
  public com.google.protobuf.ByteString
      getEmailBytes() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      email_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PHONES_FIELD_NUMBER = 5;
  private java.util.List<com.github.diegogomesaraujo.people.grpc.Phone> phones_;
  /**
   * <code>repeated .com.github.diegogomesaraujo.people.grpc.Phone phones = 5;</code>
   */
  public java.util.List<com.github.diegogomesaraujo.people.grpc.Phone> getPhonesList() {
    return phones_;
  }
  /**
   * <code>repeated .com.github.diegogomesaraujo.people.grpc.Phone phones = 5;</code>
   */
  public java.util.List<? extends com.github.diegogomesaraujo.people.grpc.PhoneOrBuilder> 
      getPhonesOrBuilderList() {
    return phones_;
  }
  /**
   * <code>repeated .com.github.diegogomesaraujo.people.grpc.Phone phones = 5;</code>
   */
  public int getPhonesCount() {
    return phones_.size();
  }
  /**
   * <code>repeated .com.github.diegogomesaraujo.people.grpc.Phone phones = 5;</code>
   */
  public com.github.diegogomesaraujo.people.grpc.Phone getPhones(int index) {
    return phones_.get(index);
  }
  /**
   * <code>repeated .com.github.diegogomesaraujo.people.grpc.Phone phones = 5;</code>
   */
  public com.github.diegogomesaraujo.people.grpc.PhoneOrBuilder getPhonesOrBuilder(
      int index) {
    return phones_.get(index);
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
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (age_ != 0) {
      output.writeInt32(3, age_);
    }
    if (!getEmailBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, email_);
    }
    for (int i = 0; i < phones_.size(); i++) {
      output.writeMessage(5, phones_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (age_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, age_);
    }
    if (!getEmailBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, email_);
    }
    for (int i = 0; i < phones_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, phones_.get(i));
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
    if (!(obj instanceof com.github.diegogomesaraujo.people.grpc.Person)) {
      return super.equals(obj);
    }
    com.github.diegogomesaraujo.people.grpc.Person other = (com.github.diegogomesaraujo.people.grpc.Person) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && getName()
        .equals(other.getName());
    result = result && (getAge()
        == other.getAge());
    result = result && getEmail()
        .equals(other.getEmail());
    result = result && getPhonesList()
        .equals(other.getPhonesList());
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + AGE_FIELD_NUMBER;
    hash = (53 * hash) + getAge();
    hash = (37 * hash) + EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getEmail().hashCode();
    if (getPhonesCount() > 0) {
      hash = (37 * hash) + PHONES_FIELD_NUMBER;
      hash = (53 * hash) + getPhonesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.diegogomesaraujo.people.grpc.Person parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.diegogomesaraujo.people.grpc.Person parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.diegogomesaraujo.people.grpc.Person parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.diegogomesaraujo.people.grpc.Person parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.diegogomesaraujo.people.grpc.Person parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.diegogomesaraujo.people.grpc.Person parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.diegogomesaraujo.people.grpc.Person parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.diegogomesaraujo.people.grpc.Person parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.diegogomesaraujo.people.grpc.Person parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.diegogomesaraujo.people.grpc.Person parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.diegogomesaraujo.people.grpc.Person parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.diegogomesaraujo.people.grpc.Person parseFrom(
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
  public static Builder newBuilder(com.github.diegogomesaraujo.people.grpc.Person prototype) {
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
   * Protobuf type {@code com.github.diegogomesaraujo.people.grpc.Person}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.github.diegogomesaraujo.people.grpc.Person)
      com.github.diegogomesaraujo.people.grpc.PersonOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.diegogomesaraujo.people.grpc.People.internal_static_com_github_diegogomesaraujo_people_grpc_Person_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.diegogomesaraujo.people.grpc.People.internal_static_com_github_diegogomesaraujo_people_grpc_Person_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.diegogomesaraujo.people.grpc.Person.class, com.github.diegogomesaraujo.people.grpc.Person.Builder.class);
    }

    // Construct using com.github.diegogomesaraujo.people.grpc.Person.newBuilder()
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
        getPhonesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0L;

      name_ = "";

      age_ = 0;

      email_ = "";

      if (phonesBuilder_ == null) {
        phones_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
      } else {
        phonesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.diegogomesaraujo.people.grpc.People.internal_static_com_github_diegogomesaraujo_people_grpc_Person_descriptor;
    }

    @java.lang.Override
    public com.github.diegogomesaraujo.people.grpc.Person getDefaultInstanceForType() {
      return com.github.diegogomesaraujo.people.grpc.Person.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.diegogomesaraujo.people.grpc.Person build() {
      com.github.diegogomesaraujo.people.grpc.Person result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.diegogomesaraujo.people.grpc.Person buildPartial() {
      com.github.diegogomesaraujo.people.grpc.Person result = new com.github.diegogomesaraujo.people.grpc.Person(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.id_ = id_;
      result.name_ = name_;
      result.age_ = age_;
      result.email_ = email_;
      if (phonesBuilder_ == null) {
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          phones_ = java.util.Collections.unmodifiableList(phones_);
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.phones_ = phones_;
      } else {
        result.phones_ = phonesBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.github.diegogomesaraujo.people.grpc.Person) {
        return mergeFrom((com.github.diegogomesaraujo.people.grpc.Person)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.diegogomesaraujo.people.grpc.Person other) {
      if (other == com.github.diegogomesaraujo.people.grpc.Person.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getAge() != 0) {
        setAge(other.getAge());
      }
      if (!other.getEmail().isEmpty()) {
        email_ = other.email_;
        onChanged();
      }
      if (phonesBuilder_ == null) {
        if (!other.phones_.isEmpty()) {
          if (phones_.isEmpty()) {
            phones_ = other.phones_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensurePhonesIsMutable();
            phones_.addAll(other.phones_);
          }
          onChanged();
        }
      } else {
        if (!other.phones_.isEmpty()) {
          if (phonesBuilder_.isEmpty()) {
            phonesBuilder_.dispose();
            phonesBuilder_ = null;
            phones_ = other.phones_;
            bitField0_ = (bitField0_ & ~0x00000010);
            phonesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPhonesFieldBuilder() : null;
          } else {
            phonesBuilder_.addAllMessages(other.phones_);
          }
        }
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
      com.github.diegogomesaraujo.people.grpc.Person parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.diegogomesaraujo.people.grpc.Person) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long id_ ;
    /**
     * <code>int64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 1;</code>
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int age_ ;
    /**
     * <code>int32 age = 3;</code>
     */
    public int getAge() {
      return age_;
    }
    /**
     * <code>int32 age = 3;</code>
     */
    public Builder setAge(int value) {
      
      age_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 age = 3;</code>
     */
    public Builder clearAge() {
      
      age_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object email_ = "";
    /**
     * <code>string email = 4;</code>
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string email = 4;</code>
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string email = 4;</code>
     */
    public Builder setEmail(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      email_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string email = 4;</code>
     */
    public Builder clearEmail() {
      
      email_ = getDefaultInstance().getEmail();
      onChanged();
      return this;
    }
    /**
     * <code>string email = 4;</code>
     */
    public Builder setEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      email_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.github.diegogomesaraujo.people.grpc.Phone> phones_ =
      java.util.Collections.emptyList();
    private void ensurePhonesIsMutable() {
      if (!((bitField0_ & 0x00000010) == 0x00000010)) {
        phones_ = new java.util.ArrayList<com.github.diegogomesaraujo.people.grpc.Phone>(phones_);
        bitField0_ |= 0x00000010;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.github.diegogomesaraujo.people.grpc.Phone, com.github.diegogomesaraujo.people.grpc.Phone.Builder, com.github.diegogomesaraujo.people.grpc.PhoneOrBuilder> phonesBuilder_;

    /**
     * <code>repeated .com.github.diegogomesaraujo.people.grpc.Phone phones = 5;</code>
     */
    public java.util.List<com.github.diegogomesaraujo.people.grpc.Phone> getPhonesList() {
      if (phonesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(phones_);
      } else {
        return phonesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.github.diegogomesaraujo.people.grpc.Phone phones = 5;</code>
     */
    public int getPhonesCount() {
      if (phonesBuilder_ == null) {
        return phones_.size();
      } else {
        return phonesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.github.diegogomesaraujo.people.grpc.Phone phones = 5;</code>
     */
    public com.github.diegogomesaraujo.people.grpc.Phone getPhones(int index) {
      if (phonesBuilder_ == null) {
        return phones_.get(index);
      } else {
        return phonesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.github.diegogomesaraujo.people.grpc.Phone phones = 5;</code>
     */
    public Builder setPhones(
        int index, com.github.diegogomesaraujo.people.grpc.Phone value) {
      if (phonesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePhonesIsMutable();
        phones_.set(index, value);
        onChanged();
      } else {
        phonesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.github.diegogomesaraujo.people.grpc.Phone phones = 5;</code>
     */
    public Builder setPhones(
        int index, com.github.diegogomesaraujo.people.grpc.Phone.Builder builderForValue) {
      if (phonesBuilder_ == null) {
        ensurePhonesIsMutable();
        phones_.set(index, builderForValue.build());
        onChanged();
      } else {
        phonesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.github.diegogomesaraujo.people.grpc.Phone phones = 5;</code>
     */
    public Builder addPhones(com.github.diegogomesaraujo.people.grpc.Phone value) {
      if (phonesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePhonesIsMutable();
        phones_.add(value);
        onChanged();
      } else {
        phonesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.github.diegogomesaraujo.people.grpc.Phone phones = 5;</code>
     */
    public Builder addPhones(
        int index, com.github.diegogomesaraujo.people.grpc.Phone value) {
      if (phonesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePhonesIsMutable();
        phones_.add(index, value);
        onChanged();
      } else {
        phonesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.github.diegogomesaraujo.people.grpc.Phone phones = 5;</code>
     */
    public Builder addPhones(
        com.github.diegogomesaraujo.people.grpc.Phone.Builder builderForValue) {
      if (phonesBuilder_ == null) {
        ensurePhonesIsMutable();
        phones_.add(builderForValue.build());
        onChanged();
      } else {
        phonesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.github.diegogomesaraujo.people.grpc.Phone phones = 5;</code>
     */
    public Builder addPhones(
        int index, com.github.diegogomesaraujo.people.grpc.Phone.Builder builderForValue) {
      if (phonesBuilder_ == null) {
        ensurePhonesIsMutable();
        phones_.add(index, builderForValue.build());
        onChanged();
      } else {
        phonesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.github.diegogomesaraujo.people.grpc.Phone phones = 5;</code>
     */
    public Builder addAllPhones(
        java.lang.Iterable<? extends com.github.diegogomesaraujo.people.grpc.Phone> values) {
      if (phonesBuilder_ == null) {
        ensurePhonesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, phones_);
        onChanged();
      } else {
        phonesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.github.diegogomesaraujo.people.grpc.Phone phones = 5;</code>
     */
    public Builder clearPhones() {
      if (phonesBuilder_ == null) {
        phones_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
      } else {
        phonesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.github.diegogomesaraujo.people.grpc.Phone phones = 5;</code>
     */
    public Builder removePhones(int index) {
      if (phonesBuilder_ == null) {
        ensurePhonesIsMutable();
        phones_.remove(index);
        onChanged();
      } else {
        phonesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.github.diegogomesaraujo.people.grpc.Phone phones = 5;</code>
     */
    public com.github.diegogomesaraujo.people.grpc.Phone.Builder getPhonesBuilder(
        int index) {
      return getPhonesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.github.diegogomesaraujo.people.grpc.Phone phones = 5;</code>
     */
    public com.github.diegogomesaraujo.people.grpc.PhoneOrBuilder getPhonesOrBuilder(
        int index) {
      if (phonesBuilder_ == null) {
        return phones_.get(index);  } else {
        return phonesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.github.diegogomesaraujo.people.grpc.Phone phones = 5;</code>
     */
    public java.util.List<? extends com.github.diegogomesaraujo.people.grpc.PhoneOrBuilder> 
         getPhonesOrBuilderList() {
      if (phonesBuilder_ != null) {
        return phonesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(phones_);
      }
    }
    /**
     * <code>repeated .com.github.diegogomesaraujo.people.grpc.Phone phones = 5;</code>
     */
    public com.github.diegogomesaraujo.people.grpc.Phone.Builder addPhonesBuilder() {
      return getPhonesFieldBuilder().addBuilder(
          com.github.diegogomesaraujo.people.grpc.Phone.getDefaultInstance());
    }
    /**
     * <code>repeated .com.github.diegogomesaraujo.people.grpc.Phone phones = 5;</code>
     */
    public com.github.diegogomesaraujo.people.grpc.Phone.Builder addPhonesBuilder(
        int index) {
      return getPhonesFieldBuilder().addBuilder(
          index, com.github.diegogomesaraujo.people.grpc.Phone.getDefaultInstance());
    }
    /**
     * <code>repeated .com.github.diegogomesaraujo.people.grpc.Phone phones = 5;</code>
     */
    public java.util.List<com.github.diegogomesaraujo.people.grpc.Phone.Builder> 
         getPhonesBuilderList() {
      return getPhonesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.github.diegogomesaraujo.people.grpc.Phone, com.github.diegogomesaraujo.people.grpc.Phone.Builder, com.github.diegogomesaraujo.people.grpc.PhoneOrBuilder> 
        getPhonesFieldBuilder() {
      if (phonesBuilder_ == null) {
        phonesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.github.diegogomesaraujo.people.grpc.Phone, com.github.diegogomesaraujo.people.grpc.Phone.Builder, com.github.diegogomesaraujo.people.grpc.PhoneOrBuilder>(
                phones_,
                ((bitField0_ & 0x00000010) == 0x00000010),
                getParentForChildren(),
                isClean());
        phones_ = null;
      }
      return phonesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.github.diegogomesaraujo.people.grpc.Person)
  }

  // @@protoc_insertion_point(class_scope:com.github.diegogomesaraujo.people.grpc.Person)
  private static final com.github.diegogomesaraujo.people.grpc.Person DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.diegogomesaraujo.people.grpc.Person();
  }

  public static com.github.diegogomesaraujo.people.grpc.Person getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Person>
      PARSER = new com.google.protobuf.AbstractParser<Person>() {
    @java.lang.Override
    public Person parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Person(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Person> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Person> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.diegogomesaraujo.people.grpc.Person getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

