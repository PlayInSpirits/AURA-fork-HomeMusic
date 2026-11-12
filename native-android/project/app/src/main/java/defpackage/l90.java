package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l90 extends qr3 {
    public final /* synthetic */ int b;
    public final Object c;

    public l90(if1 r3) {
        this.b = 0;
        super(new e90(3));
        this.c = new m90(r3);
    }

    @Override // defpackage.qr3
    public final rr3 a(Object r12) {
        switch(this.b) {
            case 0: goto L11;
            default: goto L5;
        };
    L5:
        if (r12 != null) goto L7;
        boolean r6 = true;
    L9:
        return new rr3(this, r12, r6, (rv2) this.c, null, true);
    L7:
        r6 = false;
        goto L9
    L11:
        if (r12 != null) goto L13;
        boolean r7 = true;
    L15:
        return new rr3(this, r12, r7, null, null, true);
    L13:
        r7 = false;
        goto L15
    }

    @Override // defpackage.qr3
    public j35 b() {
        switch(this.b) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return super.b();
    L7:
        return (m90) this.c;
    }

    public l90(gf1 r2) {
        this.b = 1;
        rv2 r0 = rv2.D;
        super(r2);
        this.c = r0;
    }
}
