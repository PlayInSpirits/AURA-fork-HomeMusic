package defpackage;

import androidx.work.impl.WorkDatabase_Impl;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j91 implements p81 {
    public final /* synthetic */ p81 n;
    public final /* synthetic */ WorkDatabase_Impl o;
    public final /* synthetic */ x p;

    public j91(p81 r1, WorkDatabase_Impl r2, x r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    @Override // defpackage.p81
    public final Object a(q81 r4, vd0 r5) {
        z81 r0 = new z81(r4, this.o, this.p);
        Object r3 = this.n.a(r0, r5);
        if (r3 != xe0.n) goto L6;
        return r3;
    L6:
        return j15.a;
    }
}
