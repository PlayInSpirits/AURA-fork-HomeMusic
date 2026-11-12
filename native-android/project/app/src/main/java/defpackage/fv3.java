package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fv3 extends n14 {
    public final /* synthetic */ int n;
    public final long o;
    public final Object p;
    public final fw q;

    public /* synthetic */ fv3(Object r1, long r2, fw r4, int r5) {
        this.n = r5;
        this.p = r1;
        this.o = r2;
        this.q = r4;
    }

    @Override // defpackage.n14
    public final long contentLength() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.o;
    L7:
        return this.o;
    }

    @Override // defpackage.n14
    public final hu2 contentType() {
        int r0 = this.n;
        Object r1 = this.p;
        switch(r0) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        String r2 = (String) r1;
        if (r2 == null) goto L13;
        return ve5.a(r2);
    L14:
        return null;
    L13:
        return null;
    L5:
        return (hu2) r1;
    }

    @Override // defpackage.n14
    public final fw source() {
        int r0 = this.n;
        fw r1 = this.q;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return r1;
    L6:
        return (xu3) r1;
    }
}
