package defpackage;

import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u83 {
    public final w83 a;
    public boolean b;
    public bq4 c;
    public final v83 d;
    public boolean e;

    public u83(v83 r2, w83 r3) {
        r2.getClass();
        boolean r0 = r2.b;
        this.a = r3;
        this.b = r0;
        this.d = r2;
        this.e = true;
    }

    public final void a() {
        bq4 r0 = this.c;
        if (r0 != null) goto L5;
        return;
    L5:
        if (((LinkedHashSet) r0.p).remove(this) == false) goto L17;
        w33 r1 = (w33) r0.o;
        r1.getClass();
        if (this == r1.f) goto L10;
    L14:
        r1.d.remove(this);
        r1.e.remove(this);
        this.c = null;
        r1.b();
        return;
    L10:
        if (r1.g != (-1)) goto L13;
        this.d.getClass();
    L13:
        r1.f = null;
        r1.g = 0;
        r1.h = null;
        goto L14
    }

    public final void b(boolean r2) {
        this.e = r2;
        if (r2 == true) goto L5;
    L7:
        boolean r3 = false;
    L9:
        if (this.b == r3) goto L19;
        this.b = r3;
        bq4 r1 = this.c;
        if (r1 == null) goto L17;
        w33 r4 = (w33) r1.o;
        if (r4 == null) goto L18;
        r4.b();
        return;
    L18:
        return;
    L17:
        return;
    L19:
        return;
    L5:
        if (this.d.b == false) goto L7;
        r3 = true;
        goto L9
    }
}
