package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v91 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;

    public /* synthetic */ v91(int r2, jx3 r3) {
        this.n = 0;
        this.p = r3;
        this.o = r2;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r3) {
        int r0 = this.n;
        Object r1 = this.p;
        int r2 = this.o;
        switch(r0) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        List r4 = (List) r3;
        boolean r5 = r4.addAll(r2, (Collection) r1);
    L6:
        return Boolean.valueOf(r5);
    L7:
        r5 = ((ba1) r3).y0(r2);
        Boolean r6 = Boolean.valueOf(r5);
        ((jx3) r1).n = r6;
        goto L6
    }

    public /* synthetic */ v91(int r2, Collection r3) {
        this.n = 1;
        this.o = r2;
        this.p = r3;
    }
}
