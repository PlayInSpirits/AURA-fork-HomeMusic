package com.eddyizm.tempus.homemusic;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class HubNotifier$State {
    public static final int $stable = 8;
    private boolean initialized;
    private List<Long> doneItems = new ArrayList();
    private Map<String, String> tasks = new LinkedHashMap();

    public final List<Long> getDoneItems() {
        return this.doneItems;
    }

    public final boolean getInitialized() {
        return this.initialized;
    }

    public final Map<String, String> getTasks() {
        return this.tasks;
    }

    public final void setDoneItems(List<Long> list) {
        list.getClass();
        this.doneItems = list;
    }

    public final void setInitialized(boolean z) {
        this.initialized = z;
    }

    public final void setTasks(Map<String, String> map) {
        map.getClass();
        this.tasks = map;
    }
}
