// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc.proto

package org.remo.api;

public final class RPCDateServiceApi {
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_org_remo_api_RPCDateRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_org_remo_api_RPCDateRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_org_remo_api_RPCDateResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_org_remo_api_RPCDateResponse_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        String[] descriptorData = {
                "\n\ngrpc.proto\022\014org.remo.api\"\"\n\016RPCDateReq" +
                        "uest\022\020\n\010userName\030\001 \001(\t\"%\n\017RPCDateRespons" +
                        "e\022\022\n\nserverDate\030\001 \001(\t2Z\n\016RPCDateService\022" +
                        "H\n\007getDate\022\034.org.remo.api.RPCDateRequest" +
                        "\032\035.org.remo.api.RPCDateResponse\"\000B#\n\014org" +
                        ".remo.apiB\021RPCDateServiceApiP\001b\006proto3"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                        }, assigner);
        internal_static_org_remo_api_RPCDateRequest_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_org_remo_api_RPCDateRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_org_remo_api_RPCDateRequest_descriptor,
                new String[]{"UserName",});
        internal_static_org_remo_api_RPCDateResponse_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_org_remo_api_RPCDateResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_org_remo_api_RPCDateResponse_descriptor,
                new String[]{"ServerDate",});
    }

    private RPCDateServiceApi() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    // @@protoc_insertion_point(outer_class_scope)
}
