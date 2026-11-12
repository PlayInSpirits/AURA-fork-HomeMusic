package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ex extends n14 {
    public final fr0 n;
    public final String o;
    public final String p;
    public final xu3 q;

    public ex(fr0 r1, String r2, String r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = new xu3(new dx((ej4) r1.p.get(1), this));
    }

    @Override // defpackage.n14
    public final long contentLength() {
        String r3 = this.p;
        if (r3 == null) goto L10;
        byte[] r2 = xe5.a;
        return Long.parseLong(r3);
    L11:
        return -1;
    L10:
        return -1;
    }

    @Override // defpackage.n14
    public final hu2 contentType() {
        String r1 = this.o;
        if (r1 == null) goto L9;
        return ve5.a(r1);
    L10:
        return null;
    L9:
        return null;
    }

    @Override // defpackage.n14
    public final fw source() {
        return this.q;
    }
}
