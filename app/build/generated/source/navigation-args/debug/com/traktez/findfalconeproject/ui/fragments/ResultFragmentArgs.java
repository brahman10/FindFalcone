package com.traktez.findfalconeproject.ui.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ResultFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ResultFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private ResultFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ResultFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ResultFragmentArgs __result = new ResultFragmentArgs();
    bundle.setClassLoader(ResultFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("time_taken")) {
      String timeTaken;
      timeTaken = bundle.getString("time_taken");
      if (timeTaken == null) {
        throw new IllegalArgumentException("Argument \"time_taken\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("time_taken", timeTaken);
    } else {
      throw new IllegalArgumentException("Required argument \"time_taken\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("planet_name")) {
      String planetName;
      planetName = bundle.getString("planet_name");
      if (planetName == null) {
        throw new IllegalArgumentException("Argument \"planet_name\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("planet_name", planetName);
    } else {
      throw new IllegalArgumentException("Required argument \"planet_name\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ResultFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    ResultFragmentArgs __result = new ResultFragmentArgs();
    if (savedStateHandle.contains("time_taken")) {
      String timeTaken;
      timeTaken = savedStateHandle.get("time_taken");
      if (timeTaken == null) {
        throw new IllegalArgumentException("Argument \"time_taken\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("time_taken", timeTaken);
    } else {
      throw new IllegalArgumentException("Required argument \"time_taken\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("planet_name")) {
      String planetName;
      planetName = savedStateHandle.get("planet_name");
      if (planetName == null) {
        throw new IllegalArgumentException("Argument \"planet_name\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("planet_name", planetName);
    } else {
      throw new IllegalArgumentException("Required argument \"planet_name\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getTimeTaken() {
    return (String) arguments.get("time_taken");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getPlanetName() {
    return (String) arguments.get("planet_name");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("time_taken")) {
      String timeTaken = (String) arguments.get("time_taken");
      __result.putString("time_taken", timeTaken);
    }
    if (arguments.containsKey("planet_name")) {
      String planetName = (String) arguments.get("planet_name");
      __result.putString("planet_name", planetName);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("time_taken")) {
      String timeTaken = (String) arguments.get("time_taken");
      __result.set("time_taken", timeTaken);
    }
    if (arguments.containsKey("planet_name")) {
      String planetName = (String) arguments.get("planet_name");
      __result.set("planet_name", planetName);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    ResultFragmentArgs that = (ResultFragmentArgs) object;
    if (arguments.containsKey("time_taken") != that.arguments.containsKey("time_taken")) {
      return false;
    }
    if (getTimeTaken() != null ? !getTimeTaken().equals(that.getTimeTaken()) : that.getTimeTaken() != null) {
      return false;
    }
    if (arguments.containsKey("planet_name") != that.arguments.containsKey("planet_name")) {
      return false;
    }
    if (getPlanetName() != null ? !getPlanetName().equals(that.getPlanetName()) : that.getPlanetName() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getTimeTaken() != null ? getTimeTaken().hashCode() : 0);
    result = 31 * result + (getPlanetName() != null ? getPlanetName().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ResultFragmentArgs{"
        + "timeTaken=" + getTimeTaken()
        + ", planetName=" + getPlanetName()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull ResultFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull String timeTaken, @NonNull String planetName) {
      if (timeTaken == null) {
        throw new IllegalArgumentException("Argument \"time_taken\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("time_taken", timeTaken);
      if (planetName == null) {
        throw new IllegalArgumentException("Argument \"planet_name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("planet_name", planetName);
    }

    @NonNull
    public ResultFragmentArgs build() {
      ResultFragmentArgs result = new ResultFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setTimeTaken(@NonNull String timeTaken) {
      if (timeTaken == null) {
        throw new IllegalArgumentException("Argument \"time_taken\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("time_taken", timeTaken);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setPlanetName(@NonNull String planetName) {
      if (planetName == null) {
        throw new IllegalArgumentException("Argument \"planet_name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("planet_name", planetName);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getTimeTaken() {
      return (String) arguments.get("time_taken");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getPlanetName() {
      return (String) arguments.get("planet_name");
    }
  }
}
