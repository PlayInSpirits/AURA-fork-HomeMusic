package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jr3 implements lt2 {
    public final bi0 a;
    public final ss2 b;
    public yc5 c;
    public final i80 d;
    public int e;

    public jr3(bi0 bi0Var, n51 n51Var) {
        ss2 ss2Var = new ss2(10, n51Var);
        yc5 yc5Var = new yc5(3);
        i80 i80Var = new i80(28);
        this.a = bi0Var;
        this.b = ss2Var;
        this.c = yc5Var;
        this.d = i80Var;
        this.e = 1048576;
    }

    @Override // defpackage.lt2
    public final lt2 e(yc5 yc5Var) {
        rr2.s(yc5Var, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.c = yc5Var;
        return this;
    }

    @Override // defpackage.lt2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final kr3 d(gn2 gn2Var) {
        gn2Var.b.getClass();
        return new kr3(gn2Var, this.a, this.b, this.c.b(gn2Var), this.d, this.e, null);
    }
}
