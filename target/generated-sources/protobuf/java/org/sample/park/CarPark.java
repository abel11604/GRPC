// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CarPark.proto

package org.sample.park;

public final class CarPark {
  private CarPark() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_sample_park_Vehicle_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_sample_park_Vehicle_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_sample_park_ParkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_sample_park_ParkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_sample_park_ParkResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_sample_park_ParkResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_sample_park_ParkResponseManyTimes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_sample_park_ParkResponseManyTimes_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rCarPark.proto\022\017org.sample.park\"7\n\007Vehi" +
      "cle\022\026\n\016vehicle_number\030\001 \001(\t\022\024\n\014vehicle_t" +
      "ype\030\002 \001(\t\"8\n\013ParkRequest\022)\n\007vehicle\030\001 \001(" +
      "\0132\030.org.sample.park.Vehicle\"\036\n\014ParkRespo" +
      "nse\022\016\n\006result\030\001 \001(\t\"\'\n\025ParkResponseManyT" +
      "imes\022\016\n\006result\030\001 \001(\t2\274\001\n\016CarParkService\022" +
      "J\n\013parkVehicle\022\034.org.sample.park.ParkReq" +
      "uest\032\035.org.sample.park.ParkResponse\022^\n\024p" +
      "arkVehicleManyTimes\022\034.org.sample.park.Pa" +
      "rkRequest\032&.org.sample.park.ParkResponse",
      "ManyTimes0\001B\002P\001b\006proto3"
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
        }, assigner);
    internal_static_org_sample_park_Vehicle_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_sample_park_Vehicle_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_sample_park_Vehicle_descriptor,
        new java.lang.String[] { "VehicleNumber", "VehicleType", });
    internal_static_org_sample_park_ParkRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_sample_park_ParkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_sample_park_ParkRequest_descriptor,
        new java.lang.String[] { "Vehicle", });
    internal_static_org_sample_park_ParkResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_org_sample_park_ParkResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_sample_park_ParkResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_org_sample_park_ParkResponseManyTimes_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_org_sample_park_ParkResponseManyTimes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_sample_park_ParkResponseManyTimes_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
