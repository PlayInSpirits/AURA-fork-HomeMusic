package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g22 extends m91 {
    public final /* synthetic */ int o;
    public final /* synthetic */ Iterable p;
    public final /* synthetic */ Object q;

    public /* synthetic */ g22(Iterable r1, Object r2, int r3) {
        this.o = r3;
        this.p = r1;
        this.q = r2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int r0 = this.o;
        Object r1 = this.q;
        Iterable r2 = this.p;
        switch(r0) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        Iterator r3 = r2.iterator();
        r3.getClass();
        return new h22(r3, (ro3) r1);
    L5:
        return new i22(r2.iterator(), (ss2) r1);
    }
}
