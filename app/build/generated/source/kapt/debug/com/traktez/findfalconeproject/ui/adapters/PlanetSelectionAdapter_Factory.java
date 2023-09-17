package com.traktez.findfalconeproject.ui.adapters;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class PlanetSelectionAdapter_Factory implements Factory<PlanetSelectionAdapter> {
  @Override
  public PlanetSelectionAdapter get() {
    return newInstance();
  }

  public static PlanetSelectionAdapter_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PlanetSelectionAdapter newInstance() {
    return new PlanetSelectionAdapter();
  }

  private static final class InstanceHolder {
    private static final PlanetSelectionAdapter_Factory INSTANCE = new PlanetSelectionAdapter_Factory();
  }
}
