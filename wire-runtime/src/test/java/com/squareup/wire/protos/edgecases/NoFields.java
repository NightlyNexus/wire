/**
 * Code generated by Wire protobuf compiler, do not edit.
 * Source file: ../wire-runtime/src/test/proto/edge_cases.proto
 */
package com.squareup.wire.protos.edgecases;

import com.squareup.wire.Message;

public final class NoFields
    implements Message {

  private NoFields(Builder builder) {
  }

  @Override
  public boolean equals(Object other) {
    return other instanceof NoFields;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public String toString() {
    return "NoFields{}";
  }

  public static final class Builder
      implements Message.Builder<NoFields> {

    public Builder() {
    }

    public Builder(NoFields message) {
    }

    @Override
    public boolean isInitialized() {
      return true;
    }

    @Override
    public NoFields build() {
      return new NoFields(this);
    }
  }
}