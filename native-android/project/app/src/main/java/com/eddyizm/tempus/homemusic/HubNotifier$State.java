package com.eddyizm.tempus.homemusic;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class HubNotifier$State {
    public static final int $stable = 8;
    private List<Long> doneItems;
    private boolean initialized;
    private Map<String, String> tasks;

    public HubNotifier$State() {
        this.doneItems = new ArrayList();
        this.tasks = new LinkedHashMap();
    }

    public final List<Long> getDoneItems() {
        return this.doneItems;
    }

    public final boolean getInitialized() {
        return this.initialized;
    }

    public final Map<String, String> getTasks() {
        return this.tasks;
    }

    public final void setDoneItems(List<Long> r1) {
        r1.getClass();
        this.doneItems = r1;
    }

    public final void setInitialized(boolean r1) {
        this.initialized = r1;
    }

    public final void setTasks(Map<String, String> r1) {
        r1.getClass();
        this.tasks = r1;
    }
}
