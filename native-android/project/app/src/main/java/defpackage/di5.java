package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class di5 extends ei5 {
    public final transient int p;
    public final transient int q;
    public final /* synthetic */ ei5 r;

    public di5(ei5 r1, int r2, int r3) {
        this.r = r1;
        this.p = r2;
        this.q = r3;
    }

    @Override // defpackage.wh5
    public final int b() {
        return (this.r.d() + this.p) + this.q;
    }

    @Override // defpackage.wh5
    public final int d() {
        return this.r.d() + this.p;
    }

    @Override // defpackage.wh5
    public final Object[] f() {
        return this.r.f();
    }

    @Override // java.util.List
    public final Object get(int r2) {
        fu.Q(r2, this.q);
        int r3 = r2 + this.p;
        return this.r.get(r3);
    }

    @Override // defpackage.ei5
    public final ei5 h(int r2, int r3) {
        fu.R(r2, r3, this.q);
        int r0 = this.p;
        ei5 r1 = this.r;
        return r1.h(r2 + r0, r3 + r0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.q;
    }

    @Override // defpackage.ei5, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int r1, int r2) {
        return h(r1, r2);
    }
}
