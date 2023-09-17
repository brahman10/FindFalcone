package com.traktez.findfalconeproject.data.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u001e\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n0\u0003H\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\'J\u001e\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\bj\b\u0012\u0004\u0012\u00020\r`\n0\u0003H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/traktez/findfalconeproject/data/api/CoroutineApiService;", "", "findFalconeAsync", "Lkotlinx/coroutines/Deferred;", "Lcom/traktez/findfalconeproject/data/entity/FindFalconeResponse;", "requestBody", "Lcom/traktez/findfalconeproject/data/entity/FindFalconeRequest;", "getPlanetListAsync", "Ljava/util/ArrayList;", "Lcom/traktez/findfalconeproject/data/entity/PlanetEntity;", "Lkotlin/collections/ArrayList;", "getTokenAsync", "getVehicleListAsync", "Lcom/traktez/findfalconeproject/data/entity/VehicleEntity;", "app_debug"})
public abstract interface CoroutineApiService {
    
    @retrofit2.http.GET(value = "planets")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.Deferred<java.util.ArrayList<com.traktez.findfalconeproject.data.entity.PlanetEntity>> getPlanetListAsync();
    
    @retrofit2.http.GET(value = "vehicles")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.Deferred<java.util.ArrayList<com.traktez.findfalconeproject.data.entity.VehicleEntity>> getVehicleListAsync();
    
    @retrofit2.http.POST(value = "token")
    @retrofit2.http.Headers(value = {"Accept:application/json"})
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.Deferred<com.traktez.findfalconeproject.data.entity.FindFalconeRequest> getTokenAsync();
    
    @retrofit2.http.POST(value = "find")
    @retrofit2.http.Headers(value = {"Accept:application/json", "Content-Type:application/json"})
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.Deferred<com.traktez.findfalconeproject.data.entity.FindFalconeResponse> findFalconeAsync(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.traktez.findfalconeproject.data.entity.FindFalconeRequest requestBody);
}