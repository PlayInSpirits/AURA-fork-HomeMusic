package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o03 extends dg2 implements z32 {
    public final rf3 q;
    public Object r;

    public o03(rf3 r2, Object r3, Object r4) {
        super(0, r3, r4);
        this.q = r2;
        this.r = r4;
    }

    @Override // defpackage.dg2, java.util.Map.Entry
    public final Object getValue() {
        return this.r;
    }

    @Override // defpackage.dg2, java.util.Map.Entry
    public final Object setValue(Object r6) {
        Object r0 = this.r;
        this.r = r6;
        pf3 r1 = (pf3) this.q.o;
        lf3 r2 = r1.q;
        Object r5 = this.o;
        if (r2.containsKey(r5) == true) goto L5;
        return r0;
    L5:
        boolean r3 = r1.p;
        if (r3 == false) goto L15;
        if (r3 == false) goto L13;
        yx4 r4 = r1.n[r1.o];
        Object r7 = r4.n[r4.p];
        r2.put(r5, r6);
        if (r7 == null) goto L11;
        int r8 = r7.hashCode();
    L12:
        r1.c(r8, r2.o, r7, 0);
    L16:
        r1.t = r2.q;
        return r0;
    L11:
        r8 = 0;
        goto L12
    L13:
        tb4.k();
        return null;
    L15:
        r2.put(r5, r6);
        goto L16
    }
}
