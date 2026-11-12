package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class km0 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ List o;

    public /* synthetic */ km0(List r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int r0 = this.n;
        List r1 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        Object r2 = r1.get(2);
        r2.getClass();
        return (Integer) r2;
    L5:
        return rr1.r(r1);
    }
}
