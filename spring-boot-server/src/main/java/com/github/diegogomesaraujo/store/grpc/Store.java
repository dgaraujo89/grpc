// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shopping.proto

package com.github.diegogomesaraujo.store.grpc;

public final class Store {
  private Store() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_diegogomesaraujo_store_grpc_Product_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_github_diegogomesaraujo_store_grpc_Product_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_diegogomesaraujo_store_grpc_Cart_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_github_diegogomesaraujo_store_grpc_Cart_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_diegogomesaraujo_store_grpc_ProductRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_github_diegogomesaraujo_store_grpc_ProductRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_diegogomesaraujo_store_grpc_ProductResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_github_diegogomesaraujo_store_grpc_ProductResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_diegogomesaraujo_store_grpc_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_github_diegogomesaraujo_store_grpc_Response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016shopping.proto\022&com.github.diegogomesa" +
      "raujo.store.grpc\032\033google/protobuf/empty." +
      "proto\"G\n\007Product\022\n\n\002id\030\001 \001(\t\022\014\n\004name\030\002 \001" +
      "(\t\022\023\n\013description\030\003 \001(\t\022\r\n\005price\030\004 \001(\t\"I" +
      "\n\004Cart\022A\n\010products\030\001 \003(\0132/.com.github.di" +
      "egogomesaraujo.store.grpc.Product\"8\n\016Pro" +
      "ductRequest\022\014\n\004page\030\001 \001(\005\022\014\n\004size\030\002 \001(\005\022" +
      "\n\n\002id\030\003 \001(\t\"T\n\017ProductResponse\022A\n\010produc" +
      "ts\030\001 \003(\0132/.com.github.diegogomesaraujo.s" +
      "tore.grpc.Product\")\n\010Response\022\014\n\004code\030\001 " +
      "\001(\t\022\017\n\007message\030\002 \001(\t2\304\003\n\010Shopping\022\201\001\n\014Li" +
      "stProducts\0226.com.github.diegogomesaraujo" +
      ".store.grpc.ProductRequest\0327.com.github." +
      "diegogomesaraujo.store.grpc.ProductRespo" +
      "nse\"\000\022n\n\tAddToCart\022/.com.github.diegogom" +
      "esaraujo.store.grpc.Product\032,.com.github" +
      ".diegogomesaraujo.store.grpc.Cart\"\000(\001\022q\n" +
      "\016RemoveFromCart\022/.com.github.diegogomesa" +
      "raujo.store.grpc.Product\032,.com.github.di" +
      "egogomesaraujo.store.grpc.Cart\"\000\022Q\n\007GetC" +
      "art\022\026.google.protobuf.Empty\032,.com.github" +
      ".diegogomesaraujo.store.grpc.Cart\"\0002\360\002\n\014" +
      "StoreService\022t\n\rCreateProduct\022/.com.gith" +
      "ub.diegogomesaraujo.store.grpc.Product\0320" +
      ".com.github.diegogomesaraujo.store.grpc." +
      "Response\"\000\022t\n\rUpdateProduct\022/.com.github" +
      ".diegogomesaraujo.store.grpc.Product\0320.c" +
      "om.github.diegogomesaraujo.store.grpc.Re" +
      "sponse\"\000\022t\n\rDeleteProduct\022/.com.github.d" +
      "iegogomesaraujo.store.grpc.Product\0320.com" +
      ".github.diegogomesaraujo.store.grpc.Resp" +
      "onse\"\000B\013B\005StoreH\001P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        }, assigner);
    internal_static_com_github_diegogomesaraujo_store_grpc_Product_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_github_diegogomesaraujo_store_grpc_Product_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_github_diegogomesaraujo_store_grpc_Product_descriptor,
        new java.lang.String[] { "Id", "Name", "Description", "Price", });
    internal_static_com_github_diegogomesaraujo_store_grpc_Cart_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_github_diegogomesaraujo_store_grpc_Cart_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_github_diegogomesaraujo_store_grpc_Cart_descriptor,
        new java.lang.String[] { "Products", });
    internal_static_com_github_diegogomesaraujo_store_grpc_ProductRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_github_diegogomesaraujo_store_grpc_ProductRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_github_diegogomesaraujo_store_grpc_ProductRequest_descriptor,
        new java.lang.String[] { "Page", "Size", "Id", });
    internal_static_com_github_diegogomesaraujo_store_grpc_ProductResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_github_diegogomesaraujo_store_grpc_ProductResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_github_diegogomesaraujo_store_grpc_ProductResponse_descriptor,
        new java.lang.String[] { "Products", });
    internal_static_com_github_diegogomesaraujo_store_grpc_Response_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_github_diegogomesaraujo_store_grpc_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_github_diegogomesaraujo_store_grpc_Response_descriptor,
        new java.lang.String[] { "Code", "Message", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
