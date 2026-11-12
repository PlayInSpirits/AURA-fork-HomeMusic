package defpackage;

import com.google.gson.reflect.TypeToken;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vx4 extends ja4 {
    public final g32 a;
    public final nk1 b;
    public final TypeToken c;
    public final cz4 d;
    public final si1 e;
    public final boolean f;
    public volatile bz4 g;

    public vx4(g32 r3, nk1 r4, TypeToken r5, ux4 r6, boolean r7) {
        this.e = new si1(29, this);
        this.a = r3;
        this.b = r4;
        this.c = r5;
        this.d = r6;
        this.f = r7;
    }

    @Override // defpackage.bz4
    public final Object a(l32 r4) {
        g32 r0 = this.a;
        if (r0 != null) goto L10;
        bz4 r1 = this.g;
        if (r1 != null) goto L9;
        r1 = this.b.h(this.d, this.c);
        this.g = r1;
    L9:
        return r1.a(r4);
    L10:
        h32 r5 = fh0.q(r4);
        if (this.f == false) goto L17;
        r5.getClass();
        if ((r5 instanceof i32) == false) goto L17;
        return null;
    L17:
        return r0.a(r5, this.c.getType(), this.e);
    }

    @Override // defpackage.bz4
    public final void b(q32 r4, Object r5) {
        bz4 r0 = this.g;
        if (r0 != null) goto L6;
        r0 = this.b.h(this.d, this.c);
        this.g = r0;
    L6:
        r0.b(r4, r5);
    }

    @Override // defpackage.ja4
    public final bz4 c() {
        bz4 r0 = this.g;
        if (r0 == null) goto L5;
        return r0;
    L5:
        bz4 r1 = this.b.h(this.d, this.c);
        this.g = r1;
        return r1;
    }
}
