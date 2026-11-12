package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gx1 extends jx1 {
    public final /* synthetic */ int q;
    public final /* synthetic */ hx1 r;

    public /* synthetic */ gx1(hx1 r1, int r2) {
        this.q = r2;
        this.r = r1;
    }

    @Override // defpackage.rw1
    public final int b(int r1, Object[] r2) {
        return a().b(r1, r2);
    }

    @Override // defpackage.rw1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object r2) {
        int r0 = this.q;
        hx1 r1 = this.r;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((my3) r1).contains(r2);
    L7:
        if ((r2 instanceof p73) == false) goto L14;
        p73 r3 = (p73) r2;
        if (r3.a() <= 0) goto L14;
        Object r4 = r3.a;
        if (((my3) r1).r.b(r4) != r3.a()) goto L14;
        return true;
    L14:
        return false;
    }

    @Override // defpackage.rw1
    public final boolean g() {
        switch(this.q) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return true;
    L6:
        return false;
    }

    @Override // defpackage.rw1
    public final o15 h() {
        return a().m(0);
    }

    @Override // defpackage.jx1, java.util.Collection, java.util.Set
    public int hashCode() {
        switch(this.q) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return super.hashCode();
    L7:
        return this.r.hashCode();
    }

    @Override // defpackage.jx1
    public final yw1 l() {
        return new xx1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int r0 = this.q;
        hx1 r1 = this.r;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((my3) r1).r.c;
    L7:
        return r1.i().size();
    }
}
