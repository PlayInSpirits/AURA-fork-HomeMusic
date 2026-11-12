package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zy1 implements b75 {
    public final z65[] a;

    public zy1(z65... r1) {
        this.a = r1;
    }

    @Override // defpackage.b75
    public final x65 b(Class r5, f03 r6) {
        i30 r7 = kx3.a(r5);
        z65[] r4 = this.a;
        z65[] r8 = (z65[]) Arrays.copyOf(r4, r4.length);
        int r9 = r8.length;
        int r0 = 0;
    L4:
        if (r0 >= r9) goto L9;
        z65 r2 = r8[r0];
        if (r2.a.equals(r7) == true) goto L10;
        r0 = r0 + 1;
    L10:
        if (r2 == null) goto L12;
        rd1.a r10 = new rd1.a();
    L13:
        if (r10 == null) goto L15;
        return r10;
    L15:
        kf2.e(xa3.g("No initializer set for given class ", r7.b()));
        return null;
    L12:
        r10 = null;
        goto L13
    L9:
        r2 = null;
        goto L10
    }
}
