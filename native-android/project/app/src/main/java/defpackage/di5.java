package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class di5 extends ei5 {
    public final transient int p;
    public final transient int q;
    public final /* synthetic */ ei5 r;

    public di5(ei5 ei5Var, int i, int i2) {
        this.r = ei5Var;
        this.p = i;
        this.q = i2;
    }

    @Override // defpackage.wh5
    public final int b() {
        return this.r.d() + this.p + this.q;
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
    public final Object get(int i) {
        fu.Q(i, this.q);
        return this.r.get(i + this.p);
    }

    @Override // defpackage.ei5, java.util.List
    /* JADX INFO: renamed from: h */
    public final ei5 subList(int i, int i2) {
        fu.R(i, i2, this.q);
        int i3 = this.p;
        return this.r.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.q;
    }
}
