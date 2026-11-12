package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tf0 {
    public final LinkedHashMap a;

    public tf0() {
        this.a = new LinkedHashMap();
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof tf0) == false) goto L8;
        LinkedHashMap r3 = ((tf0) r2).a;
        if (h12.c(this.a, r3) == false) goto L10;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.a + ")";
    }
}
