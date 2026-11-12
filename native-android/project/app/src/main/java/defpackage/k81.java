package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k81 extends l81 {
    public final /* synthetic */ int e;
    public final /* synthetic */ o81 f;

    public /* synthetic */ k81(o81 r1, int r2) {
        this.e = r2;
        this.f = r1;
        super(r1);
    }

    @Override // defpackage.l81
    public final float a() {
        int r0 = this.e;
        o81 r1 = this.f;
        switch(r0) {
            case 0: goto L9;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        float r2 = r1.h;
        float r3 = r1.j;
    L8:
        return r2 + r3;
    L9:
        r2 = r1.h;
        r3 = r1.i;
        goto L8
    L5:
        return r1.h;
    }
}
