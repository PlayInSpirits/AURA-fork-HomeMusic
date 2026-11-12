package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kh1 {
    public final List a;

    public kh1(List r3) {
        this.a = r3;
        if (r3.isEmpty() == false) goto L5;
        kf2.n("credentialOptions should not be empty");
        throw null;
    L5:
        if (r3.size() > 1) goto L7;
        return;
    L7:
        if (r3.isEmpty() == true) goto L13;
        Iterator r4 = r3.iterator();
    L11:
        if (r4.hasNext() == false) goto L13;
        xf0 r0 = (xf0) r4.next();
    L13:
        Iterator r2 = this.a.iterator();
    L15:
        if (r2.hasNext() == false) goto L22;
        xf0 r5 = (xf0) r2.next();
        goto L15
    }
}
