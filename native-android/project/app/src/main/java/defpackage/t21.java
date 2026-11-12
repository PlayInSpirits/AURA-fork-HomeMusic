package defpackage;

import com.google.gson.reflect.TypeToken;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t21 extends bz4 {
    public bz4 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ nk1 d;
    public final /* synthetic */ TypeToken e;
    public final /* synthetic */ u21 f;

    public t21(u21 r1, boolean r2, boolean r3, nk1 r4, TypeToken r5) {
        this.f = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
    }

    @Override // defpackage.bz4
    public final Object a(l32 r4) {
        if (this.b == false) goto L6;
        r4.k0();
        return null;
    L6:
        bz4 r0 = this.a;
        if (r0 != null) goto L11;
        u21 r1 = this.f;
        TypeToken r2 = this.e;
        r0 = this.d.h(r1, r2);
        this.a = r0;
    L11:
        return r0.a(r4);
    }

    @Override // defpackage.bz4
    public final void b(q32 r4, Object r5) {
        if (this.c == false) goto L6;
        r4.F();
        return;
    L6:
        bz4 r0 = this.a;
        if (r0 != null) goto L10;
        u21 r1 = this.f;
        TypeToken r2 = this.e;
        r0 = this.d.h(r1, r2);
        this.a = r0;
    L10:
        r0.b(r4, r5);
    }
}
