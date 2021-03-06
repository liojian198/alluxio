// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/file_system_master.proto

package alluxio.grpc;

public interface LoadMetadataPOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.file.LoadMetadataPOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   ** whether to load metadata recursively 
   * </pre>
   *
   * <code>optional bool recursive = 1;</code>
   */
  boolean hasRecursive();
  /**
   * <pre>
   ** whether to load metadata recursively 
   * </pre>
   *
   * <code>optional bool recursive = 1;</code>
   */
  boolean getRecursive();

  /**
   * <code>optional bool createAncestors = 2;</code>
   */
  boolean hasCreateAncestors();
  /**
   * <code>optional bool createAncestors = 2;</code>
   */
  boolean getCreateAncestors();

  /**
   * <code>optional .alluxio.grpc.fscommon.LoadDescendantPType loadDescendantType = 3;</code>
   */
  boolean hasLoadDescendantType();
  /**
   * <code>optional .alluxio.grpc.fscommon.LoadDescendantPType loadDescendantType = 3;</code>
   */
  alluxio.grpc.LoadDescendantPType getLoadDescendantType();

  /**
   * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 4;</code>
   */
  boolean hasCommonOptions();
  /**
   * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 4;</code>
   */
  alluxio.grpc.FileSystemMasterCommonPOptions getCommonOptions();
  /**
   * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 4;</code>
   */
  alluxio.grpc.FileSystemMasterCommonPOptionsOrBuilder getCommonOptionsOrBuilder();
}
