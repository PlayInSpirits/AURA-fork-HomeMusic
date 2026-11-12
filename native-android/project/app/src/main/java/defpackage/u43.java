package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u43 {
    public static final LinkedHashMap b = null;
    public final LinkedHashMap a;

    static {
        b = new LinkedHashMap();
    }

    public u43() {
        this.a = new LinkedHashMap();
    }

    public final void a(t43 r6) {
        String r0 = bu.n(r6.getClass());
        if (r0.length() <= 0) goto L20;
        LinkedHashMap r5 = this.a;
        t43 r1 = (t43) r5.get(r0);
        if (h12.c(r1, r6) == false) goto L8;
        return;
    L8:
        if (r1 == null) goto L15;
        if (r1.b != true) goto L15;
        nz2.o("Navigator ", r6, " is replacing an already attached ", r1);
        return;
    L15:
        if (r6.b == true) goto L18;
        t43 r7 = (t43) r5.put(r0, r6);
        return;
    L18:
        nz2.z(r6, " is already attached to another NavController", "Navigator ");
        return;
    L20:
        kf2.n("navigator name cannot be an empty string");
    }

    public final t43 b(String r3) {
        r3.getClass();
        if (r3.length() <= 0) goto L9;
        t43 r2 = (t43) this.a.get(r3);
        if (r2 == null) goto L7;
        return r2;
    L7:
        kf2.o(xa3.h("Could not find Navigator with name \"", r3, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    L9:
        kf2.n("navigator name cannot be an empty string");
        return null;
    }
}
