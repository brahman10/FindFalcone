package com.traktez.findfalconeproject.ui.fragments;

/**
 * we can create BaseFragment as well to do some common work
 * we can use to inflate views directly in base fragment and so on.
 * I'm not using base fragment in this project as its just two fragment project
 */
@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001dH\u0016J\b\u0010!\u001a\u00020\u001dH\u0002J\b\u0010\"\u001a\u00020\u001dH\u0002J\b\u0010#\u001a\u00020\u001dH\u0002J$\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0010\u0010,\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010-\u001a\u00020\u001dH\u0016J\u0018\u0010.\u001a\u0012\u0012\u0004\u0012\u0002000/j\b\u0012\u0004\u0012\u000200`1H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\u001a\u00a8\u00062"}, d2 = {"Lcom/traktez/findfalconeproject/ui/fragments/FindFalconFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/traktez/findfalconeproject/ui/adapters/PlanetSelectionAdapter$PlanetChoiceHandler;", "()V", "_binding", "Lcom/traktez/findfalconeproject/databinding/FragmentFindFalconBinding;", "binding", "getBinding", "()Lcom/traktez/findfalconeproject/databinding/FragmentFindFalconBinding;", "dialog", "Landroid/app/Dialog;", "dialogBinding", "Lcom/traktez/findfalconeproject/databinding/ShipSelectViewBinding;", "getDialogBinding", "()Lcom/traktez/findfalconeproject/databinding/ShipSelectViewBinding;", "dialogBinding$delegate", "Lkotlin/Lazy;", "networkUtil", "Lcom/traktez/findfalconeproject/util/NetworkUtil;", "getNetworkUtil", "()Lcom/traktez/findfalconeproject/util/NetworkUtil;", "setNetworkUtil", "(Lcom/traktez/findfalconeproject/util/NetworkUtil;)V", "viewModel", "Lcom/traktez/findfalconeproject/ui/fragments/FindFalconViewModel;", "getViewModel", "()Lcom/traktez/findfalconeproject/ui/fragments/FindFalconViewModel;", "viewModel$delegate", "deselectedPlanet", "", "planet", "Lcom/traktez/findfalconeproject/data/entity/PlanetEntity;", "findFalcone", "getData", "initListeners", "initObservers", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "selectedPlanet", "sendNoMoreResAlert", "updateVehicleChoices", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "app_debug"})
public final class FindFalconFragment extends androidx.fragment.app.Fragment implements com.traktez.findfalconeproject.ui.adapters.PlanetSelectionAdapter.PlanetChoiceHandler {
    private com.traktez.findfalconeproject.databinding.FragmentFindFalconBinding _binding;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    private android.app.Dialog dialog;
    @javax.inject.Inject
    public com.traktez.findfalconeproject.util.NetworkUtil networkUtil;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy dialogBinding$delegate = null;
    
    public FindFalconFragment() {
        super();
    }
    
    private final com.traktez.findfalconeproject.databinding.FragmentFindFalconBinding getBinding() {
        return null;
    }
    
    private final com.traktez.findfalconeproject.ui.fragments.FindFalconViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.traktez.findfalconeproject.util.NetworkUtil getNetworkUtil() {
        return null;
    }
    
    public final void setNetworkUtil(@org.jetbrains.annotations.NotNull
    com.traktez.findfalconeproject.util.NetworkUtil p0) {
    }
    
    private final com.traktez.findfalconeproject.databinding.ShipSelectViewBinding getDialogBinding() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void getData() {
    }
    
    private final void initListeners() {
    }
    
    private final void initObservers() {
    }
    
    @java.lang.Override
    public void selectedPlanet(@org.jetbrains.annotations.NotNull
    com.traktez.findfalconeproject.data.entity.PlanetEntity planet) {
    }
    
    @java.lang.Override
    public void deselectedPlanet(@org.jetbrains.annotations.NotNull
    com.traktez.findfalconeproject.data.entity.PlanetEntity planet) {
    }
    
    private final java.util.ArrayList<java.lang.String> updateVehicleChoices() {
        return null;
    }
    
    @java.lang.Override
    public void findFalcone() {
    }
    
    @java.lang.Override
    public void sendNoMoreResAlert() {
    }
}