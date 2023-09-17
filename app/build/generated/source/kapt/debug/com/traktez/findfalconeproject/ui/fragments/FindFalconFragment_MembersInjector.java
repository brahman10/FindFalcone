package com.traktez.findfalconeproject.ui.fragments;

import com.traktez.findfalconeproject.util.NetworkUtil;
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
public final class FindFalconFragment_MembersInjector implements MembersInjector<FindFalconFragment> {
  private final Provider<NetworkUtil> networkUtilProvider;

  public FindFalconFragment_MembersInjector(Provider<NetworkUtil> networkUtilProvider) {
    this.networkUtilProvider = networkUtilProvider;
  }

  public static MembersInjector<FindFalconFragment> create(
      Provider<NetworkUtil> networkUtilProvider) {
    return new FindFalconFragment_MembersInjector(networkUtilProvider);
  }

  @Override
  public void injectMembers(FindFalconFragment instance) {
    injectNetworkUtil(instance, networkUtilProvider.get());
  }

  @InjectedFieldSignature("com.traktez.findfalconeproject.ui.fragments.FindFalconFragment.networkUtil")
  public static void injectNetworkUtil(FindFalconFragment instance, NetworkUtil networkUtil) {
    instance.networkUtil = networkUtil;
  }
}
