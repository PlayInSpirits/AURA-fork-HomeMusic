package com.eddyizm.tempus.model;

import defpackage.b11;
import defpackage.f34;
import defpackage.h12;
import defpackage.xa3;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class HomeSector {
    public static final int $stable = 8;
    private final String id;
    private boolean isVisible;
    private final int order;
    private final String sectorTitle;

    public HomeSector(String r1, String r2, boolean r3, int r4) {
        r1.getClass();
        r2.getClass();
        this.id = r1;
        this.sectorTitle = r2;
        this.isVisible = r3;
        this.order = r4;
    }

    public static /* synthetic */ HomeSector copy$default(HomeSector r0, String r1, String r2, boolean r3, int r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.id;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.sectorTitle;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.isVisible;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.order;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.sectorTitle;
    }

    public final boolean component3() {
        return this.isVisible;
    }

    public final int component4() {
        return this.order;
    }

    public final HomeSector copy(String r1, String r2, boolean r3, int r4) {
        r1.getClass();
        r2.getClass();
        return new HomeSector(r1, r2, r3, r4);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof HomeSector) == true) goto L8;
        return false;
    L8:
        HomeSector r6 = (HomeSector) r5;
        if (h12.c(this.id, r6.id) == true) goto L12;
        return false;
    L12:
        if (h12.c(this.sectorTitle, r6.sectorTitle) == true) goto L15;
        return false;
    L15:
        if (this.isVisible == r6.isVisible) goto L18;
        return false;
    L18:
        if (this.order == r6.order) goto L20;
        return false;
    L20:
        return true;
    }

    public final String getId() {
        return this.id;
    }

    public final int getOrder() {
        return this.order;
    }

    public final String getSectorTitle() {
        return this.sectorTitle;
    }

    public int hashCode() {
        int r0 = this.id.hashCode() * 31;
        int r1 = xa3.c(f34.e(this.sectorTitle, r0, 31), 31, this.isVisible);
        return Integer.hashCode(this.order) + r1;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setVisible(boolean r1) {
        this.isVisible = r1;
    }

    public String toString() {
        String r0 = this.id;
        String r1 = this.sectorTitle;
        boolean r2 = this.isVisible;
        int r6 = this.order;
        StringBuilder r3 = b11.u("HomeSector(id=", r0, ", sectorTitle=", r1, ", isVisible=");
        r3.append(r2);
        r3.append(", order=");
        r3.append(r6);
        r3.append(")");
        return r3.toString();
    }
}
