package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zh extends gx2 {
    public final if1 a;

    public zh(if1 r1) {
        this.a = r1;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        je0 r0 = new je0();
        r0.B = this.a;
        return r0;
    }

    @Override // defpackage.gx2
    public final void e(cx2 r1) {
        je0 r2 = (je0) r1;
        r2.getClass();
        r2.B = this.a;
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L5;
        return true;
    L5:
        if ((r2 instanceof zh) == true) goto L8;
        return false;
    L8:
        if (this.a == ((zh) r2).a) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        int r0 = Boolean.hashCode(false) * 31;
        return this.a.hashCode() + r0;
    }
}
