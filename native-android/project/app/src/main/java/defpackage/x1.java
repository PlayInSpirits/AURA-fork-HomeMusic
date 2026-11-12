package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x1 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Collection o;

    public /* synthetic */ x1(int r1, Collection r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r2) {
        int r0 = this.n;
        Collection<?> r1 = this.o;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L7;
            default: goto L4;
        };
    L4:
        boolean r3 = ((List) r2).retainAll(r1);
    L6:
        return Boolean.valueOf(r3);
    L7:
        r3 = r1.contains(r2);
        goto L6
    L8:
        r3 = r1.contains(r2);
        goto L6
    }
}
