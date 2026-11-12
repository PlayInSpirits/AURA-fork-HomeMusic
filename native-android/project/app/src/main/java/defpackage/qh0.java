package defpackage;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qh0 implements f42 {
    public final f42 b;
    public final f42 c;

    public qh0(f42 r1, f42 r2) {
        this.b = r1;
        this.c = r2;
    }

    @Override // defpackage.f42
    public final void b(MessageDigest r2) {
        this.b.b(r2);
        this.c.b(r2);
    }

    @Override // defpackage.f42
    public final boolean equals(Object r4) {
        if ((r4 instanceof qh0) == false) goto L10;
        qh0 r5 = (qh0) r4;
        if (this.b.equals(r5.b) == false) goto L10;
        if (this.c.equals(r5.c) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.f42
    public final int hashCode() {
        int r0 = this.b.hashCode() * 31;
        return this.c.hashCode() + r0;
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + '}';
    }
}
