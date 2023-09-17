package com.traktez.findfalconeproject.data;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class NetworkModule_ProvideBaseUrlFactory implements Factory<String> {
  private final NetworkModule module;

  public NetworkModule_ProvideBaseUrlFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideBaseUrl(module);
  }

  public static NetworkModule_ProvideBaseUrlFactory create(NetworkModule module) {
    return new NetworkModule_ProvideBaseUrlFactory(module);
  }

  public static String provideBaseUrl(NetworkModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideBaseUrl());
  }
}
