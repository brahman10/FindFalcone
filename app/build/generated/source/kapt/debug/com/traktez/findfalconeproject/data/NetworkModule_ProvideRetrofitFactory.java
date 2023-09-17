package com.traktez.findfalconeproject.data;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
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
public final class NetworkModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final NetworkModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<String> bASE_URLProvider;

  public NetworkModule_ProvideRetrofitFactory(NetworkModule module,
      Provider<OkHttpClient> okHttpClientProvider, Provider<String> bASE_URLProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
    this.bASE_URLProvider = bASE_URLProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(module, okHttpClientProvider.get(), bASE_URLProvider.get());
  }

  public static NetworkModule_ProvideRetrofitFactory create(NetworkModule module,
      Provider<OkHttpClient> okHttpClientProvider, Provider<String> bASE_URLProvider) {
    return new NetworkModule_ProvideRetrofitFactory(module, okHttpClientProvider, bASE_URLProvider);
  }

  public static Retrofit provideRetrofit(NetworkModule instance, OkHttpClient okHttpClient,
      String BASE_URL) {
    return Preconditions.checkNotNullFromProvides(instance.provideRetrofit(okHttpClient, BASE_URL));
  }
}
