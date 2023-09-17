// Generated by view binder compiler. Do not edit!
package com.traktez.findfalconeproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.traktez.findfalconeproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemPlanetSelectionBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout ll;

  @NonNull
  public final AppCompatSpinner planetAutoComplete;

  @NonNull
  public final RecyclerView recyclerVehicle;

  private ItemPlanetSelectionBinding(@NonNull ConstraintLayout rootView, @NonNull LinearLayout ll,
      @NonNull AppCompatSpinner planetAutoComplete, @NonNull RecyclerView recyclerVehicle) {
    this.rootView = rootView;
    this.ll = ll;
    this.planetAutoComplete = planetAutoComplete;
    this.recyclerVehicle = recyclerVehicle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemPlanetSelectionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemPlanetSelectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_planet_selection, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemPlanetSelectionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ll;
      LinearLayout ll = ViewBindings.findChildViewById(rootView, id);
      if (ll == null) {
        break missingId;
      }

      id = R.id.planetAutoComplete;
      AppCompatSpinner planetAutoComplete = ViewBindings.findChildViewById(rootView, id);
      if (planetAutoComplete == null) {
        break missingId;
      }

      id = R.id.recyclerVehicle;
      RecyclerView recyclerVehicle = ViewBindings.findChildViewById(rootView, id);
      if (recyclerVehicle == null) {
        break missingId;
      }

      return new ItemPlanetSelectionBinding((ConstraintLayout) rootView, ll, planetAutoComplete,
          recyclerVehicle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}