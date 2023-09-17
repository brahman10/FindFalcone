// Generated by view binder compiler. Do not edit!
package com.traktez.findfalconeproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.traktez.findfalconeproject.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ItemVehicleSelectionBinding implements ViewBinding {
  @NonNull
  private final RadioButton rootView;

  @NonNull
  public final RadioButton radioVehicle;

  private ItemVehicleSelectionBinding(@NonNull RadioButton rootView,
      @NonNull RadioButton radioVehicle) {
    this.rootView = rootView;
    this.radioVehicle = radioVehicle;
  }

  @Override
  @NonNull
  public RadioButton getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemVehicleSelectionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemVehicleSelectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_vehicle_selection, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemVehicleSelectionBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    RadioButton radioVehicle = (RadioButton) rootView;

    return new ItemVehicleSelectionBinding((RadioButton) rootView, radioVehicle);
  }
}