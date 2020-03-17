// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import ai.verta.modeldb.ModelDBException;
import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.diff.*;
import ai.verta.modeldb.versioning.blob.diff.Function3;
import ai.verta.modeldb.versioning.blob.visitors.Visitor;
import java.util.*;
import java.util.function.Function;

public class HyperparameterSetConfigDiff implements ProtoType {
  public Optional<DiffStatusEnumDiffStatus> Status;
  public Optional<String> Name;
  public Optional<ContinuousHyperparameterSetConfigBlob> ContinuousA;
  public Optional<DiscreteHyperparameterSetConfigBlob> DiscreteA;
  public Optional<ContinuousHyperparameterSetConfigBlob> ContinuousB;
  public Optional<DiscreteHyperparameterSetConfigBlob> DiscreteB;

  public HyperparameterSetConfigDiff() {
    this.Status = Optional.empty();
    this.Name = Optional.empty();
    this.ContinuousA = Optional.empty();
    this.DiscreteA = Optional.empty();
    this.ContinuousB = Optional.empty();
    this.DiscreteB = Optional.empty();
  }

  public Boolean isEmpty() {
    if (this.Status.isPresent()) {
      return false;
    }
    if (this.Name.isPresent()) {
      return false;
    }
    if (this.ContinuousA.isPresent()) {
      return false;
    }
    if (this.DiscreteA.isPresent()) {
      return false;
    }
    if (this.ContinuousB.isPresent()) {
      return false;
    }
    if (this.DiscreteB.isPresent()) {
      return false;
    }
    return true;
  }

  // TODO: not consider order on lists
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null) return false;
    if (!(o instanceof HyperparameterSetConfigDiff)) return false;
    HyperparameterSetConfigDiff other = (HyperparameterSetConfigDiff) o;

    {
      Function3<DiffStatusEnumDiffStatus, DiffStatusEnumDiffStatus, Boolean> f =
          (x, y) -> x.equals(y);
      if (this.Status.isPresent() || other.Status.isPresent()) {
        if (!this.Status.isPresent()) return false;
        if (other.Status.isPresent()) return false;
        if (!f.apply(this.Status.get(), other.Status.get())) return false;
      }
    }
    {
      Function3<String, String, Boolean> f = (x, y) -> x.equals(y);
      if (this.Name.isPresent() || other.Name.isPresent()) {
        if (!this.Name.isPresent()) return false;
        if (other.Name.isPresent()) return false;
        if (!f.apply(this.Name.get(), other.Name.get())) return false;
      }
    }
    {
      Function3<
              ContinuousHyperparameterSetConfigBlob, ContinuousHyperparameterSetConfigBlob, Boolean>
          f = (x, y) -> x.equals(y);
      if (this.ContinuousA.isPresent() || other.ContinuousA.isPresent()) {
        if (!this.ContinuousA.isPresent()) return false;
        if (other.ContinuousA.isPresent()) return false;
        if (!f.apply(this.ContinuousA.get(), other.ContinuousA.get())) return false;
      }
    }
    {
      Function3<DiscreteHyperparameterSetConfigBlob, DiscreteHyperparameterSetConfigBlob, Boolean>
          f = (x, y) -> x.equals(y);
      if (this.DiscreteA.isPresent() || other.DiscreteA.isPresent()) {
        if (!this.DiscreteA.isPresent()) return false;
        if (other.DiscreteA.isPresent()) return false;
        if (!f.apply(this.DiscreteA.get(), other.DiscreteA.get())) return false;
      }
    }
    {
      Function3<
              ContinuousHyperparameterSetConfigBlob, ContinuousHyperparameterSetConfigBlob, Boolean>
          f = (x, y) -> x.equals(y);
      if (this.ContinuousB.isPresent() || other.ContinuousB.isPresent()) {
        if (!this.ContinuousB.isPresent()) return false;
        if (other.ContinuousB.isPresent()) return false;
        if (!f.apply(this.ContinuousB.get(), other.ContinuousB.get())) return false;
      }
    }
    {
      Function3<DiscreteHyperparameterSetConfigBlob, DiscreteHyperparameterSetConfigBlob, Boolean>
          f = (x, y) -> x.equals(y);
      if (this.DiscreteB.isPresent() || other.DiscreteB.isPresent()) {
        if (!this.DiscreteB.isPresent()) return false;
        if (other.DiscreteB.isPresent()) return false;
        if (!f.apply(this.DiscreteB.get(), other.DiscreteB.get())) return false;
      }
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        this.Status, this.Name, this.ContinuousA, this.DiscreteA, this.ContinuousB, this.DiscreteB);
  }

  public HyperparameterSetConfigDiff setStatus(Optional<DiffStatusEnumDiffStatus> value) {
    this.Status = value;
    return this;
  }

  public HyperparameterSetConfigDiff setStatus(DiffStatusEnumDiffStatus value) {
    if (value == null) this.Status = Optional.empty();
    else this.Status = Optional.of(value);
    return this;
  }

  public HyperparameterSetConfigDiff setName(Optional<String> value) {
    this.Name = value;
    return this;
  }

  public HyperparameterSetConfigDiff setName(String value) {
    if (value == null) this.Name = Optional.empty();
    else this.Name = Optional.of(value);
    return this;
  }

  public HyperparameterSetConfigDiff setContinuousA(
      Optional<ContinuousHyperparameterSetConfigBlob> value) {
    this.ContinuousA = value;
    return this;
  }

  public HyperparameterSetConfigDiff setContinuousA(ContinuousHyperparameterSetConfigBlob value) {
    if (value == null) this.ContinuousA = Optional.empty();
    else this.ContinuousA = Optional.of(value);
    return this;
  }

  public HyperparameterSetConfigDiff setDiscreteA(
      Optional<DiscreteHyperparameterSetConfigBlob> value) {
    this.DiscreteA = value;
    return this;
  }

  public HyperparameterSetConfigDiff setDiscreteA(DiscreteHyperparameterSetConfigBlob value) {
    if (value == null) this.DiscreteA = Optional.empty();
    else this.DiscreteA = Optional.of(value);
    return this;
  }

  public HyperparameterSetConfigDiff setContinuousB(
      Optional<ContinuousHyperparameterSetConfigBlob> value) {
    this.ContinuousB = value;
    return this;
  }

  public HyperparameterSetConfigDiff setContinuousB(ContinuousHyperparameterSetConfigBlob value) {
    if (value == null) this.ContinuousB = Optional.empty();
    else this.ContinuousB = Optional.of(value);
    return this;
  }

  public HyperparameterSetConfigDiff setDiscreteB(
      Optional<DiscreteHyperparameterSetConfigBlob> value) {
    this.DiscreteB = value;
    return this;
  }

  public HyperparameterSetConfigDiff setDiscreteB(DiscreteHyperparameterSetConfigBlob value) {
    if (value == null) this.DiscreteB = Optional.empty();
    else this.DiscreteB = Optional.of(value);
    return this;
  }

  public static HyperparameterSetConfigDiff fromProto(
      ai.verta.modeldb.versioning.HyperparameterSetConfigDiff blob) {
    if (blob == null) {
      return null;
    }

    HyperparameterSetConfigDiff obj = new HyperparameterSetConfigDiff();
    {
      Function<ai.verta.modeldb.versioning.HyperparameterSetConfigDiff, DiffStatusEnumDiffStatus>
          f = x -> DiffStatusEnumDiffStatus.fromProto(blob.getStatus());
      obj.Status = Utils.removeEmpty(f.apply(blob));
    }
    {
      Function<ai.verta.modeldb.versioning.HyperparameterSetConfigDiff, String> f =
          x -> (blob.getName());
      obj.Name = Utils.removeEmpty(f.apply(blob));
    }
    {
      Function<
              ai.verta.modeldb.versioning.HyperparameterSetConfigDiff,
              ContinuousHyperparameterSetConfigBlob>
          f = x -> ContinuousHyperparameterSetConfigBlob.fromProto(blob.getContinuousA());
      obj.ContinuousA = Utils.removeEmpty(f.apply(blob));
    }
    {
      Function<
              ai.verta.modeldb.versioning.HyperparameterSetConfigDiff,
              DiscreteHyperparameterSetConfigBlob>
          f = x -> DiscreteHyperparameterSetConfigBlob.fromProto(blob.getDiscreteA());
      obj.DiscreteA = Utils.removeEmpty(f.apply(blob));
    }
    {
      Function<
              ai.verta.modeldb.versioning.HyperparameterSetConfigDiff,
              ContinuousHyperparameterSetConfigBlob>
          f = x -> ContinuousHyperparameterSetConfigBlob.fromProto(blob.getContinuousB());
      obj.ContinuousB = Utils.removeEmpty(f.apply(blob));
    }
    {
      Function<
              ai.verta.modeldb.versioning.HyperparameterSetConfigDiff,
              DiscreteHyperparameterSetConfigBlob>
          f = x -> DiscreteHyperparameterSetConfigBlob.fromProto(blob.getDiscreteB());
      obj.DiscreteB = Utils.removeEmpty(f.apply(blob));
    }
    return obj;
  }

  public ai.verta.modeldb.versioning.HyperparameterSetConfigDiff.Builder toProto() {
    ai.verta.modeldb.versioning.HyperparameterSetConfigDiff.Builder builder =
        ai.verta.modeldb.versioning.HyperparameterSetConfigDiff.newBuilder();
    this.Status.ifPresent(x -> builder.setStatus(x.toProto()));
    this.Name.ifPresent(x -> builder.setName(x));
    this.ContinuousA.ifPresent(x -> builder.setContinuousA(x.toProto()));
    this.DiscreteA.ifPresent(x -> builder.setDiscreteA(x.toProto()));
    this.ContinuousB.ifPresent(x -> builder.setContinuousB(x.toProto()));
    this.DiscreteB.ifPresent(x -> builder.setDiscreteB(x.toProto()));
    return builder;
  }

  public void preVisitShallow(Visitor visitor) throws ModelDBException {
    visitor.preVisitHyperparameterSetConfigDiff(this);
  }

  public void preVisitDeep(Visitor visitor) throws ModelDBException {
    this.preVisitShallow(visitor);
    if (this.Status.isPresent()) visitor.preVisitDeepDiffStatusEnumDiffStatus(this.Status.get());
    if (this.Name.isPresent()) visitor.preVisitDeepString(this.Name.get());
    if (this.ContinuousA.isPresent())
      visitor.preVisitDeepContinuousHyperparameterSetConfigBlob(this.ContinuousA.get());
    if (this.DiscreteA.isPresent())
      visitor.preVisitDeepDiscreteHyperparameterSetConfigBlob(this.DiscreteA.get());
    if (this.ContinuousB.isPresent())
      visitor.preVisitDeepContinuousHyperparameterSetConfigBlob(this.ContinuousB.get());
    if (this.DiscreteB.isPresent())
      visitor.preVisitDeepDiscreteHyperparameterSetConfigBlob(this.DiscreteB.get());
  }

  public HyperparameterSetConfigDiff postVisitShallow(Visitor visitor) throws ModelDBException {
    return visitor.postVisitHyperparameterSetConfigDiff(this);
  }

  public HyperparameterSetConfigDiff postVisitDeep(Visitor visitor) throws ModelDBException {
    if (this.Status.isPresent())
      this.setStatus(visitor.postVisitDeepDiffStatusEnumDiffStatus(this.Status.get()));
    if (this.Name.isPresent()) this.setName(visitor.postVisitDeepString(this.Name.get()));
    if (this.ContinuousA.isPresent())
      this.setContinuousA(
          visitor.postVisitDeepContinuousHyperparameterSetConfigBlob(this.ContinuousA.get()));
    if (this.DiscreteA.isPresent())
      this.setDiscreteA(
          visitor.postVisitDeepDiscreteHyperparameterSetConfigBlob(this.DiscreteA.get()));
    if (this.ContinuousB.isPresent())
      this.setContinuousB(
          visitor.postVisitDeepContinuousHyperparameterSetConfigBlob(this.ContinuousB.get()));
    if (this.DiscreteB.isPresent())
      this.setDiscreteB(
          visitor.postVisitDeepDiscreteHyperparameterSetConfigBlob(this.DiscreteB.get()));
    return this.postVisitShallow(visitor);
  }
}