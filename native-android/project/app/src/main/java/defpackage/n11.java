package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n11 implements f42 {
    public final Object b;
    public final int c;
    public final int d;
    public final Class e;
    public final Class f;
    public final f42 g;
    public final Map h;
    public final db3 i;
    public int j;

    public n11(Object r2, f42 r3, int r4, int r5, Map r6, Class r7, Class r8, db3 r9) {
        h12.f(r2, "Argument must not be null");
        this.b = r2;
        this.g = r3;
        this.c = r4;
        this.d = r5;
        h12.f(r6, "Argument must not be null");
        this.h = r6;
        h12.f(r7, "Resource class must not be null");
        this.e = r7;
        h12.f(r8, "Transcode class must not be null");
        this.f = r8;
        h12.f(r9, "Argument must not be null");
        this.i = r9;
    }

    @Override // defpackage.f42
    public final void b(MessageDigest r1) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.f42
    public final boolean equals(Object r4) {
        if ((r4 instanceof n11) == false) goto L22;
        n11 r5 = (n11) r4;
        if (this.b.equals(r5.b) == false) goto L22;
        if (this.g.equals(r5.g) == false) goto L22;
        if (this.d != r5.d) goto L22;
        if (this.c != r5.c) goto L22;
        if (this.h.equals(r5.h) == false) goto L22;
        if (this.e.equals(r5.e) == false) goto L22;
        if (this.f.equals(r5.f) == false) goto L22;
        if (this.i.equals(r5.i) == false) goto L22;
        return true;
    L22:
        return false;
    }

    @Override // defpackage.f42
    public final int hashCode() {
        if (this.j != 0) goto L6;
        int r0 = this.b.hashCode();
        this.j = r0;
        int r1 = this.g.hashCode();
        int r2 = ((((r1 + (r0 * 31)) * 31) + this.c) * 31) + this.d;
        this.j = r2;
        int r3 = this.h.hashCode();
        int r4 = r3 + (r2 * 31);
        this.j = r4;
        int r5 = this.e.hashCode();
        int r6 = r5 + (r4 * 31);
        this.j = r6;
        int r7 = this.f.hashCode();
        int r8 = r7 + (r6 * 31);
        this.j = r8;
        int r9 = this.i.b.hashCode();
        this.j = r9 + (r8 * 31);
    L6:
        return this.j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + '}';
    }
}
