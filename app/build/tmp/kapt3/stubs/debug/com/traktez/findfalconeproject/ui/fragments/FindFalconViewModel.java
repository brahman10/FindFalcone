package com.traktez.findfalconeproject.ui.fragments;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\rJ\u0006\u0010:\u001a\u000208J\u0006\u0010;\u001a\u000208R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R#\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b#\u0010\u0017R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001d\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b1\u0010\u0017R \u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001f\"\u0004\b4\u0010!R#\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b6\u0010\u0017\u00a8\u0006<"}, d2 = {"Lcom/traktez/findfalconeproject/ui/fragments/FindFalconViewModel;", "Lcom/traktez/findfalconeproject/ui/base/BaseViewModel;", "apiService", "Lcom/traktez/findfalconeproject/data/api/CoroutineApiService;", "(Lcom/traktez/findfalconeproject/data/api/CoroutineApiService;)V", "_falconeResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/traktez/findfalconeproject/data/entity/State;", "Lcom/traktez/findfalconeproject/data/entity/FindFalconeResponse;", "_planetListLiveData", "Ljava/util/ArrayList;", "Lcom/traktez/findfalconeproject/data/entity/PlanetEntity;", "_tokenResponse", "Lcom/traktez/findfalconeproject/data/entity/FindFalconeRequest;", "_vehicleLiveData", "Lcom/traktez/findfalconeproject/data/entity/VehicleEntity;", "currentplanet", "getCurrentplanet", "()Lcom/traktez/findfalconeproject/data/entity/PlanetEntity;", "setCurrentplanet", "(Lcom/traktez/findfalconeproject/data/entity/PlanetEntity;)V", "falconeResponse", "getFalconeResponse", "()Landroidx/lifecycle/MutableLiveData;", "hashMap", "Ljava/util/HashMap;", "", "getHashMap", "()Ljava/util/HashMap;", "planetList", "getPlanetList", "()Ljava/util/ArrayList;", "setPlanetList", "(Ljava/util/ArrayList;)V", "planetListLiveData", "getPlanetListLiveData", "planetSelectionAdapter", "Lcom/traktez/findfalconeproject/ui/adapters/PlanetSelectionAdapter;", "getPlanetSelectionAdapter", "()Lcom/traktez/findfalconeproject/ui/adapters/PlanetSelectionAdapter;", "setPlanetSelectionAdapter", "(Lcom/traktez/findfalconeproject/ui/adapters/PlanetSelectionAdapter;)V", "timeTaken", "", "getTimeTaken", "()I", "setTimeTaken", "(I)V", "tokenResponse", "getTokenResponse", "vehicleList", "getVehicleList", "setVehicleList", "vehicleLiveData", "getVehicleLiveData", "findFalcone", "", "request", "getData", "getToken", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class FindFalconViewModel extends com.traktez.findfalconeproject.ui.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.traktez.findfalconeproject.data.api.CoroutineApiService apiService = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.traktez.findfalconeproject.data.entity.State<java.util.ArrayList<com.traktez.findfalconeproject.data.entity.PlanetEntity>>> _planetListLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.traktez.findfalconeproject.data.entity.State<java.util.ArrayList<com.traktez.findfalconeproject.data.entity.VehicleEntity>>> _vehicleLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.traktez.findfalconeproject.data.entity.State<com.traktez.findfalconeproject.data.entity.FindFalconeRequest>> _tokenResponse = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.traktez.findfalconeproject.data.entity.State<com.traktez.findfalconeproject.data.entity.FindFalconeResponse>> _falconeResponse = null;
    @javax.inject.Inject
    public com.traktez.findfalconeproject.ui.adapters.PlanetSelectionAdapter planetSelectionAdapter;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.traktez.findfalconeproject.data.entity.VehicleEntity> vehicleList;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.traktez.findfalconeproject.data.entity.PlanetEntity> planetList;
    @org.jetbrains.annotations.NotNull
    private final java.util.HashMap<java.lang.String, com.traktez.findfalconeproject.data.entity.VehicleEntity> hashMap = null;
    public com.traktez.findfalconeproject.data.entity.PlanetEntity currentplanet;
    private int timeTaken = 0;
    
    @javax.inject.Inject
    public FindFalconViewModel(@org.jetbrains.annotations.NotNull
    com.traktez.findfalconeproject.data.api.CoroutineApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.traktez.findfalconeproject.data.entity.State<java.util.ArrayList<com.traktez.findfalconeproject.data.entity.PlanetEntity>>> getPlanetListLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.traktez.findfalconeproject.data.entity.State<java.util.ArrayList<com.traktez.findfalconeproject.data.entity.VehicleEntity>>> getVehicleLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.traktez.findfalconeproject.data.entity.State<com.traktez.findfalconeproject.data.entity.FindFalconeRequest>> getTokenResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.traktez.findfalconeproject.data.entity.State<com.traktez.findfalconeproject.data.entity.FindFalconeResponse>> getFalconeResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.traktez.findfalconeproject.ui.adapters.PlanetSelectionAdapter getPlanetSelectionAdapter() {
        return null;
    }
    
    public final void setPlanetSelectionAdapter(@org.jetbrains.annotations.NotNull
    com.traktez.findfalconeproject.ui.adapters.PlanetSelectionAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.traktez.findfalconeproject.data.entity.VehicleEntity> getVehicleList() {
        return null;
    }
    
    public final void setVehicleList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.traktez.findfalconeproject.data.entity.VehicleEntity> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.traktez.findfalconeproject.data.entity.PlanetEntity> getPlanetList() {
        return null;
    }
    
    public final void setPlanetList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.traktez.findfalconeproject.data.entity.PlanetEntity> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.HashMap<java.lang.String, com.traktez.findfalconeproject.data.entity.VehicleEntity> getHashMap() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.traktez.findfalconeproject.data.entity.PlanetEntity getCurrentplanet() {
        return null;
    }
    
    public final void setCurrentplanet(@org.jetbrains.annotations.NotNull
    com.traktez.findfalconeproject.data.entity.PlanetEntity p0) {
    }
    
    public final int getTimeTaken() {
        return 0;
    }
    
    public final void setTimeTaken(int p0) {
    }
    
    /**
     * api call for planets and vehicles are calling asynchronously
     * both apis are independent to each other
     */
    public final void getData() {
    }
    
    public final void getToken() {
    }
    
    public final void findFalcone(@org.jetbrains.annotations.NotNull
    com.traktez.findfalconeproject.data.entity.FindFalconeRequest request) {
    }
}