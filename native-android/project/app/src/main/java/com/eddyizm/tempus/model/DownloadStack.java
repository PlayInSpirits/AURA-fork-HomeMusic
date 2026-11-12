package com.eddyizm.tempus.model;

import defpackage.f34;
import defpackage.h12;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class DownloadStack {
    public static final int $stable = 8;
    private String id;
    private String view;

    public DownloadStack(String r1, String r2) {
        r1.getClass();
        this.id = r1;
        this.view = r2;
    }

    public static /* synthetic */ DownloadStack copy$default(DownloadStack r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.id;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.view;
    L9:
        return r0.copy(r1, r2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.view;
    }

    public final DownloadStack copy(String r1, String r2) {
        r1.getClass();
        return new DownloadStack(r1, r2);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DownloadStack) == true) goto L8;
        return false;
    L8:
        DownloadStack r6 = (DownloadStack) r5;
        if (h12.c(this.id, r6.id) == true) goto L12;
        return false;
    L12:
        if (h12.c(this.view, r6.view) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final String getId() {
        return this.id;
    }

    public final String getView() {
        return this.view;
    }

    public int hashCode() {
        int r0 = this.id.hashCode() * 31;
        String r1 = this.view;
        if (r1 != null) goto L5;
        int r2 = 0;
    L7:
        return r0 + r2;
    L5:
        r2 = r1.hashCode();
        goto L7
    }

    public final void setId(String r1) {
        r1.getClass();
        this.id = r1;
    }

    public final void setView(String r1) {
        this.view = r1;
    }

    public String toString() {
        return f34.h("DownloadStack(id=", this.id, ", view=", this.view, ")");
    }
}
