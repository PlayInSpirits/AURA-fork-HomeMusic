package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ex extends n14 {
    public final fr0 n;
    public final String o;
    public final String p;
    public final xu3 q;

    public ex(fr0 fr0Var, String str, String str2) {
        this.n = fr0Var;
        this.o = str;
        this.p = str2;
        this.q = new xu3(new dx((ej4) fr0Var.p.get(1), this));
    }

    @Override // defpackage.n14
    public final long contentLength() {
        String str = this.p;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = xe5.a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // defpackage.n14
    public final hu2 contentType() {
        String str = this.o;
        if (str == null) {
            return null;
        }
        try {
            return ve5.a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // defpackage.n14
    public final fw source() {
        return this.q;
    }
}
