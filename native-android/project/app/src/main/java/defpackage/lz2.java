package defpackage;

import android.content.Context;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lz2 implements uw4 {
    public final List b;

    public lz2(uw4... r2) {
        if (r2.length == 0) goto L6;
        this.b = Arrays.asList(r2);
        return;
    L6:
        kf2.n("MultiTransformation must contain at least one Transformation");
        throw null;
    }

    @Override // defpackage.uw4
    public final q04 a(Context r4, q04 r5, int r6, int r7) {
        Iterator r3 = this.b.iterator();
        q04 r0 = r5;
    L4:
        if (r3.hasNext() == false) goto L13;
        q04 r1 = ((uw4) r3.next()).a(r4, r0, r6, r7);
        if (r0 == null) goto L12;
        if (r0.equals(r5) == true) goto L12;
        if (r0.equals(r1) == true) goto L12;
        r0.b();
    L12:
        r0 = r1;
        goto L4
    L13:
        return r0;
    }

    @Override // defpackage.f42
    public final void b(MessageDigest r2) {
        Iterator r1 = this.b.iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((uw4) r1.next()).b(r2);
        goto L4
    }

    @Override // defpackage.f42
    public final boolean equals(Object r2) {
        if ((r2 instanceof lz2) == true) goto L5;
        return false;
    L5:
        return this.b.equals(((lz2) r2).b);
    }

    @Override // defpackage.f42
    public final int hashCode() {
        return this.b.hashCode();
    }
}
