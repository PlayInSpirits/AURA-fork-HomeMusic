package defpackage;

import android.view.autofill.AutofillId;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x9 implements sn {
    public final ra a;
    public final wn b;
    public final AutofillId c;

    public x9(ra r1, wn r2) {
        this.a = r1;
        this.b = r2;
        j3.o(r1);
        hg3 r3 = bu.l(r1);
        if (r3 == null) goto L5;
        AutofillId r4 = tn.f(r3.o);
    L6:
        if (r4 == null) goto L10;
        this.c = r4;
        return;
    L10:
        throw xa3.l("Required value was null.");
    L5:
        r4 = null;
        goto L6
    }
}
