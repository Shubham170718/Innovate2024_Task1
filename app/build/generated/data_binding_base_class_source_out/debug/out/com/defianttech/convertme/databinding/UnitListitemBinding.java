// Generated by view binder compiler. Do not edit!
package com.defianttech.convertme.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.defianttech.convertme.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UnitListitemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView chkSelected;

  @NonNull
  public final LinearLayout unitItemContainer;

  @NonNull
  public final TextView unitName;

  @NonNull
  public final TextView unitValue;

  private UnitListitemBinding(@NonNull LinearLayout rootView, @NonNull ImageView chkSelected,
      @NonNull LinearLayout unitItemContainer, @NonNull TextView unitName,
      @NonNull TextView unitValue) {
    this.rootView = rootView;
    this.chkSelected = chkSelected;
    this.unitItemContainer = unitItemContainer;
    this.unitName = unitName;
    this.unitValue = unitValue;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static UnitListitemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static UnitListitemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.unit_listitem, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static UnitListitemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.chkSelected;
      ImageView chkSelected = ViewBindings.findChildViewById(rootView, id);
      if (chkSelected == null) {
        break missingId;
      }

      LinearLayout unitItemContainer = (LinearLayout) rootView;

      id = R.id.unitName;
      TextView unitName = ViewBindings.findChildViewById(rootView, id);
      if (unitName == null) {
        break missingId;
      }

      id = R.id.unitValue;
      TextView unitValue = ViewBindings.findChildViewById(rootView, id);
      if (unitValue == null) {
        break missingId;
      }

      return new UnitListitemBinding((LinearLayout) rootView, chkSelected, unitItemContainer,
          unitName, unitValue);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
