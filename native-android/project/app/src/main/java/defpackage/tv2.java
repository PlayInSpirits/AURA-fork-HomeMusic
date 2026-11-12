package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tv2 extends be5 {
    public final long l;

    public tv2(kr3 r5) {
        super(r5);
        Bundle r6 = r5.h().d.I;
        int r0 = 0;
        if (r6 == null) goto L5;
        r0 = r6.getInt("duration", 0);
    L5:
        if (r0 <= 0) goto L7;
        long r1 = f35.Q(((long) r0) * 1000);
    L8:
        this.l = r1;
        return;
    L7:
        r1 = -9223372036854775807L;
        goto L8
    }

    @Override // defpackage.be5
    public final void A(cu4 r10) {
        r10.getClass();
        if (r10.o() != 0) goto L6;
        m(r10);
        return;
    L6:
        bu4 r0 = r10.m(0, new bu4(), 0);
        r0.getClass();
        long r1 = r0.l;
        boolean r2 = r0.j;
        long r4 = this.l;
        if (r4 != (-9223372036854775807L)) goto L9;
    L12:
        m(r10);
        return;
    L9:
        if (r1 != (-9223372036854775807L)) goto L12;
        if (r2 == true) goto L12;
        r10 = new sv2(0, r4, r10);
        goto L12
    }
}
