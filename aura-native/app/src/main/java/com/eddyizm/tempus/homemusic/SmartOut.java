package com.eddyizm.tempus.homemusic;

import defpackage.ka4;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class SmartOut {
    public static final int $stable = 8;
    private String context;
    private List<String> own;
    private boolean pending;
    private List<SmartRec> recs;

    @ka4("session_id")
    private String sessionId;
    private String title;

    public final String getContext() {
        return this.context;
    }

    public final List<String> getOwn() {
        return this.own;
    }

    public final boolean getPending() {
        return this.pending;
    }

    public final List<SmartRec> getRecs() {
        return this.recs;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setContext(String str) {
        this.context = str;
    }

    public final void setOwn(List<String> list) {
        this.own = list;
    }

    public final void setPending(boolean z) {
        this.pending = z;
    }

    public final void setRecs(List<SmartRec> list) {
        this.recs = list;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
