package com.traktez.findfalconeproject.ui.fragments;

import com.google.gson.Gson;
import com.traktez.findfalconeproject.ui.adapters.PlanetSelectionAdapter;
import com.traktez.findfalconeproject.ui.base.BaseViewModel_MembersInjector;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class FindFalconViewModel_MembersInjector implements MembersInjector<FindFalconViewModel> {
  private final Provider<Gson> gsonProvider;

  private final Provider<PlanetSelectionAdapter> planetSelectionAdapterProvider;

  public FindFalconViewModel_MembersInjector(Provider<Gson> gsonProvider,
      Provider<PlanetSelectionAdapter> planetSelectionAdapterProvider) {
    this.gsonProvider = gsonProvider;
    this.planetSelectionAdapterProvider = planetSelectionAdapterProvider;
  }

  public static MembersInjector<FindFalconViewModel> create(Provider<Gson> gsonProvider,
      Provider<PlanetSelectionAdapter> planetSelectionAdapterProvider) {
    return new FindFalconViewModel_MembersInjector(gsonProvider, planetSelectionAdapterProvider);
  }

  @Override
  public void injectMembers(FindFalconViewModel instance) {
    BaseViewModel_MembersInjector.injectGson(instance, gsonProvider.get());
    injectPlanetSelectionAdapter(instance, planetSelectionAdapterProvider.get());
  }

  @InjectedFieldSignature("com.traktez.findfalconeproject.ui.fragments.FindFalconViewModel.planetSelectionAdapter")
  public static void injectPlanetSelectionAdapter(FindFalconViewModel instance,
      PlanetSelectionAdapter planetSelectionAdapter) {
    instance.planetSelectionAdapter = planetSelectionAdapter;
  }
}
