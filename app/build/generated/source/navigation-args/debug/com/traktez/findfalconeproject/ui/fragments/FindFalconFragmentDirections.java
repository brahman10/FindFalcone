package com.traktez.findfalconeproject.ui.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.traktez.findfalconeproject.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class FindFalconFragmentDirections {
  private FindFalconFragmentDirections() {
  }

  @NonNull
  public static ToResultFragment toResultFragment(@NonNull String timeTaken,
      @NonNull String planetName) {
    return new ToResultFragment(timeTaken, planetName);
  }

  public static class ToResultFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ToResultFragment(@NonNull String timeTaken, @NonNull String planetName) {
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
    @SuppressWarnings("unchecked")
    public ToResultFragment setTimeTaken(@NonNull String timeTaken) {
      if (timeTaken == null) {
        throw new IllegalArgumentException("Argument \"time_taken\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("time_taken", timeTaken);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ToResultFragment setPlanetName(@NonNull String planetName) {
      if (planetName == null) {
        throw new IllegalArgumentException("Argument \"planet_name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("planet_name", planetName);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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

    @Override
    public int getActionId() {
      return R.id.toResultFragment;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ToResultFragment that = (ToResultFragment) object;
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
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getTimeTaken() != null ? getTimeTaken().hashCode() : 0);
      result = 31 * result + (getPlanetName() != null ? getPlanetName().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ToResultFragment(actionId=" + getActionId() + "){"
          + "timeTaken=" + getTimeTaken()
          + ", planetName=" + getPlanetName()
          + "}";
    }
  }
}
