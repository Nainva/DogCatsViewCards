// Generated by view binder compiler. Do not edit!
package com.example.dogglers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.dogglers.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class VerticalHorizontalListItem2Binding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final TextView catAge;

  @NonNull
  public final TextView catHobby;

  @NonNull
  public final ImageView catImage;

  @NonNull
  public final TextView catName;

  private VerticalHorizontalListItem2Binding(@NonNull MaterialCardView rootView,
      @NonNull TextView catAge, @NonNull TextView catHobby, @NonNull ImageView catImage,
      @NonNull TextView catName) {
    this.rootView = rootView;
    this.catAge = catAge;
    this.catHobby = catHobby;
    this.catImage = catImage;
    this.catName = catName;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static VerticalHorizontalListItem2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static VerticalHorizontalListItem2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.vertical_horizontal_list_item2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static VerticalHorizontalListItem2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cat_age;
      TextView catAge = ViewBindings.findChildViewById(rootView, id);
      if (catAge == null) {
        break missingId;
      }

      id = R.id.cat_hobby;
      TextView catHobby = ViewBindings.findChildViewById(rootView, id);
      if (catHobby == null) {
        break missingId;
      }

      id = R.id.cat_image;
      ImageView catImage = ViewBindings.findChildViewById(rootView, id);
      if (catImage == null) {
        break missingId;
      }

      id = R.id.cat_name;
      TextView catName = ViewBindings.findChildViewById(rootView, id);
      if (catName == null) {
        break missingId;
      }

      return new VerticalHorizontalListItem2Binding((MaterialCardView) rootView, catAge, catHobby,
          catImage, catName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}