package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mf3 extends nf3 implements c90 {
    public static final mf3 q = null;

    static {
        q = new mf3(xx4.e, 0);
    }

    public final mf3 b(qr3 r4, j35 r5) {
        int r0 = r4.hashCode();
        x7 r6 = this.n.u(r4, r0, r5, 0);
        if (r6 != null) goto L6;
        return this;
    L6:
        return new mf3((xx4) r6.p, this.o + r6.o);
    }

    @Override // defpackage.nf3, java.util.Map
    public final /* bridge */ boolean containsKey(Object r2) {
        if ((r2 instanceof qr3) == true) goto L7;
        return false;
    L7:
        return super.containsKey((qr3) r2);
    }

    @Override // defpackage.nf3, java.util.Map
    public final /* bridge */ boolean containsValue(Object r2) {
        if ((r2 instanceof j35) == true) goto L7;
        return false;
    L7:
        return super.containsValue((j35) r2);
    }

    @Override // defpackage.nf3, java.util.Map
    public final /* bridge */ Object get(Object r2) {
        if ((r2 instanceof qr3) == true) goto L7;
        return null;
    L7:
        return (j35) super.get((qr3) r2);
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object r2, Object r3) {
        if ((r2 instanceof qr3) == true) goto L6;
        return r3;
    L6:
        return (j35) super.getOrDefault((qr3) r2, (j35) r3);
    }
}
