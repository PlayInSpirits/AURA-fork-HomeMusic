package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sl implements go4 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ sl(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.go4
    public final Object get() {
        int r0 = this.n;
        Object r2 = this.o;
        switch(r0) {
            case 0: goto L23;
            case 1: goto L24;
            case 2: goto L15;
            case 3: goto L13;
            case 4: goto L11;
            default: goto L4;
        };
    L4:
        pe4 r3 = (pe4) r2;
        oe4 r1 = r3.a();
        r1.f = null;
        if (r3.w.p() == false) goto L7;
        int r4 = 4;
    L8:
        r1.d = r4;
        return new pe4(r1);
    L7:
        r4 = 2;
        goto L8
    L11:
        return (zp) r2;
    L13:
        return (my0) r2;
    L15:
        return (os3) r2;
    L24:
        return (lt2) ((Class) r2).getConstructor(null).newInstance(null);
    L19:
        e = move-exception;
        throw new IllegalStateException(e);
    L23:
        return xl.n((Context) r2);
    }
}
