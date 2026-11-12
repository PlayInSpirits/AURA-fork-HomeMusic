package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class up2 {
    public final Bundle a;
    public rq2 b;

    public up2(rq2 r2, boolean r3) {
        if (r2 == null) goto L6;
        Bundle r0 = new Bundle();
        this.a = r0;
        this.b = r2;
        r0.putBundle("selector", r2.a);
        r0.putBoolean("activeScan", r3);
        return;
    L6:
        kf2.n("selector must not be null");
        throw null;
    }

    public final void a() {
        if (this.b != null) goto L12;
        Bundle r0 = this.a.getBundle("selector");
        rq2 r1 = null;
        if (r0 == null) goto L7;
        r1 = new rq2(r0, null);
    L8:
        this.b = r1;
        if (r1 != null) goto L13;
        this.b = rq2.c;
        return;
    L13:
        return;
    L7:
        rq2 r2 = rq2.c;
        goto L8
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof up2) == false) goto L10;
        up2 r5 = (up2) r4;
        a();
        rq2 r0 = this.b;
        r5.a();
        if (r0.equals(r5.b) == false) goto L10;
        if (b() != r5.b()) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        a();
        int r0 = this.b.hashCode();
        return (b() ? 1 : 0) ^ r0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        r0.append(this.b);
        r0.append(", activeScan=");
        r0.append(b());
        r0.append(", isValid=");
        a();
        rq2 r2 = this.b;
        r2.a();
        r0.append(!r2.b.contains(null));
        r0.append(" }");
        return r0.toString();
    }
}
