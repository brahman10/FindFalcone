package com.traktez.findfalconeproject.ui.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u000eR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/traktez/findfalconeproject/ui/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "clearViewModel", "", "toState", "Lcom/traktez/findfalconeproject/data/entity/State;", "T", "Lcom/traktez/findfalconeproject/data/entity/SealedResult;", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    @javax.inject.Inject
    public com.google.gson.Gson gson;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    public final void setGson(@org.jetbrains.annotations.NotNull
    com.google.gson.Gson p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final <T extends java.lang.Object>com.traktez.findfalconeproject.data.entity.State<T> toState(@org.jetbrains.annotations.NotNull
    com.traktez.findfalconeproject.data.entity.SealedResult<? extends T> $this$toState) {
        return null;
    }
    
    /**
     * Use this function to clear viewModel manually if needed.
     * It will clear all the jobs inside viewModel
     */
    public final void clearViewModel() {
    }
}