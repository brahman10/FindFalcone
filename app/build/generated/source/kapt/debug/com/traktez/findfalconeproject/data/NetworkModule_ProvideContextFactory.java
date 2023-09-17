package com.traktez.findfalconeproject.data;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class NetworkModule_ProvideContextFactory implements Factory<Context> {
  private final NetworkModule module;

  private final Provider<Context> contextProvider;

  public NetworkModule_ProvideContextFactory(NetworkModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public Context get() {
    return provideContext(module, contextProvider.get());
  }

  public static NetworkModule_ProvideContextFactory create(NetworkModule module,
      Provider<Context> contextProvider) {
    return new NetworkModule_ProvideContextFactory(module, contextProvider);
  }

  public static Context provideContext(NetworkModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideContext(context));
  }
}
