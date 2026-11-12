package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class on2 implements er2 {
    public final Object n;
    public final ms2 o;
    public final ArrayList p;
    public final /* synthetic */ pn2 q;

    public on2(pn2 r1, ms2 r2) {
        this.q = r1;
        this.n = new Object();
        this.p = new ArrayList();
        this.o = r2;
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof on2) == true) goto L10;
        return false;
    L10:
        return Objects.equals(this.o, ((on2) r2).o);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.o});
    }

    @Override // defpackage.er2
    public final void z(int r7, String r8, jn2 r9) {
        if (r9 == null) goto L4;
        Bundle r10 = r9.a;
    L5:
        if (r10 == null) goto L7;
    L6:
        Bundle r4 = r10;
        ms2 r2 = this.o;
        if (r2 == null) goto L18;
        if (r8 == null) goto L16;
        if (r4 == null) goto L14;
        bq4 r1 = this.q.n;
        r1.getClass();
        ((pn2) r1.q).t.post(new sz(r1, r2, r8, r4, 1));
        return;
    L14:
        kf2.n("options cannot be null in notifyChildrenChanged");
        return;
    L16:
        kf2.n("parentId cannot be null in notifyChildrenChanged");
        return;
    L18:
        kf2.n("remoteUserInfo cannot be null in notifyChildrenChanged");
        return;
    L7:
        r10 = Bundle.EMPTY;
        goto L6
    L4:
        r10 = null;
        goto L5
    }
}
