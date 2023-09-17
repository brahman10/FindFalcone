package com.traktez.findfalconeproject.ui.fragments;

import com.google.gson.Gson;
import com.traktez.findfalconeproject.data.api.CoroutineApiService;
import com.traktez.findfalconeproject.ui.adapters.PlanetSelectionAdapter;
import com.traktez.findfalconeproject.ui.base.BaseViewModel_MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class FindFalconViewModel_Factory implements Factory<FindFalconViewModel> {
  private final Provider<CoroutineApiService> apiServiceProvider;

  private final Provider<Gson> gsonProvider;

  private final Provider<PlanetSelectionAdapter> planetSelectionAdapterProvider;

  public FindFalconViewModel_Factory(Provider<CoroutineApiService> apiServiceProvider,
      Provider<Gson> gsonProvider,
      Provider<PlanetSelectionAdapter> planetSelectionAdapterProvider) {
    this.apiServiceProvider = apiServiceProvider;
    this.gsonProvider = gsonProvider;
    this.planetSelectionAdapterProvider = planetSelectionAdapterProvider;
  }

  @Override
  public FindFalconViewModel get() {
    FindFalconViewModel instance = newInstance(apiServiceProvider.get());
    BaseViewModel_MembersInjector.injectGson(instance, gsonProvider.get());
    FindFalconViewModel_MembersInjector.injectPlanetSelectionAdapter(instance, planetSelectionAdapterProvider.get());
    return instance;
  }

  public static FindFalconViewModel_Factory create(Provider<CoroutineApiService> apiServiceProvider,
      Provider<Gson> gsonProvider,
      Provider<PlanetSelectionAdapter> planetSelectionAdapterProvider) {
    return new FindFalconViewModel_Factory(apiServiceProvider, gsonProvider, planetSelectionAdapterProvider);
  }

  public static FindFalconViewModel newInstance(CoroutineApiService apiService) {
    return new FindFalconViewModel(apiService);
  }
}
