package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class iz implements le0, me0 {
    public static final pa o = null;
    public static final iz p = null;
    public final /* synthetic */ int n;

    static {
        o = new pa(27);
        p = new iz(1);
    }

    public /* synthetic */ iz(int r1) {
        this.n = r1;
    }

    @Override // defpackage.ne0
    public final ne0 J(ne0 r2) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ya4.F(this, r2);
    L7:
        return ya4.F(this, r2);
    }

    @Override // defpackage.ne0
    public final le0 K(me0 r2) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ya4.r(this, r2);
    L7:
        return ya4.r(this, r2);
    }

    @Override // defpackage.le0
    public final me0 getKey() {
        switch(this.n) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return this;
    L6:
        return o;
    }

    @Override // defpackage.ne0
    public final Object s(wf1 r2, Object r3) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r2.invoke(r3, this);
    L7:
        return r2.invoke(r3, this);
    }

    @Override // defpackage.ne0
    public final ne0 u(me0 r2) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ya4.C(this, r2);
    L7:
        return ya4.C(this, r2);
    }
}
