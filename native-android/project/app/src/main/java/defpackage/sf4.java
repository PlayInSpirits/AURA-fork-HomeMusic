package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sf4 implements xn3 {
    public final mf2 a;
    public int b;
    public Bitmap.Config c;

    public sf4(mf2 r1) {
        this.a = r1;
    }

    @Override // defpackage.xn3
    public final void a() {
        this.a.k(this);
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof sf4) == false) goto L10;
        sf4 r5 = (sf4) r4;
        if (this.b != r5.b) goto L10;
        if (e35.n(this.c, r5.c) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        int r0 = this.b * 31;
        Bitmap.Config r1 = this.c;
        if (r1 == null) goto L5;
        int r2 = r1.hashCode();
    L7:
        return r0 + r2;
    L5:
        r2 = 0;
        goto L7
    }

    public final String toString() {
        return tf4.c(this.b, this.c);
    }
}
