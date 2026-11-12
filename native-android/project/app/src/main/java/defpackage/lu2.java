package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lu2 extends k03 {
    public i44 l;

    public lu2() {
        this.l = new i44();
    }

    @Override // defpackage.ad2
    public final void g() {
        Iterator r2 = this.l.iterator();
    L3:
        e44 r0 = (e44) r2;
        if (r0.hasNext() == false) goto L6;
        ku2 r1 = (ku2) ((Map.Entry) r0.next()).getValue();
        r1.a.f(r1);
        goto L3
    }

    @Override // defpackage.ad2
    public final void h() {
        Iterator r2 = this.l.iterator();
    L3:
        e44 r0 = (e44) r2;
        if (r0.hasNext() == false) goto L6;
        ku2 r1 = (ku2) ((Map.Entry) r0.next()).getValue();
        r1.a.j(r1);
        goto L3
    }

    public final void l(ad2 r4, ht1 r5) {
        if (r4 == null) goto L16;
        ku2 r0 = new ku2(r4, r5);
        ku2 r1 = (ku2) this.l.a(r4, r0);
        if (r1 != null) goto L6;
    L10:
        if (r1 == null) goto L13;
        return;
    L13:
        if (this.c <= 0) goto L18;
        r4.f(r0);
        return;
    L18:
        return;
    L6:
        if (r1.b == r5) goto L10;
        kf2.n("This source was already added with the different observer");
        return;
    L16:
        nz2.n("source cannot be null");
    }
}
