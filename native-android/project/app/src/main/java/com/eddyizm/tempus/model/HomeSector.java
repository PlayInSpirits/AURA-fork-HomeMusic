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

    public HomeSector(String str, String str2, boolean z, int i) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.sectorTitle = str2;
        this.isVisible = z;
        this.order = i;
    }

    public static /* synthetic */ HomeSector copy$default(HomeSector homeSector, String str, String str2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = homeSector.id;
        }
        if ((i2 & 2) != 0) {
            str2 = homeSector.sectorTitle;
        }
        if ((i2 & 4) != 0) {
            z = homeSector.isVisible;
        }
        if ((i2 & 8) != 0) {
            i = homeSector.order;
        }
        return homeSector.copy(str, str2, z, i);
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

    public final HomeSector copy(String str, String str2, boolean z, int i) {
        str.getClass();
        str2.getClass();
        return new HomeSector(str, str2, z, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeSector)) {
            return false;
        }
        HomeSector homeSector = (HomeSector) obj;
        return h12.c(this.id, homeSector.id) && h12.c(this.sectorTitle, homeSector.sectorTitle) && this.isVisible == homeSector.isVisible && this.order == homeSector.order;
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
        return Integer.hashCode(this.order) + xa3.c(f34.e(this.sectorTitle, this.id.hashCode() * 31, 31), 31, this.isVisible);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.sectorTitle;
        boolean z = this.isVisible;
        int i = this.order;
        StringBuilder sbU = b11.u("HomeSector(id=", str, ", sectorTitle=", str2, ", isVisible=");
        sbU.append(z);
        sbU.append(", order=");
        sbU.append(i);
        sbU.append(")");
        return sbU.toString();
    }
}
