package defpackage;

import java.security.MessageDigest;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qh0 implements f42 {
    public final f42 b;
    public final f42 c;

    public qh0(f42 f42Var, f42 f42Var2) {
        this.b = f42Var;
        this.c = f42Var2;
    }

    @Override // defpackage.f42
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
        this.c.b(messageDigest);
    }

    @Override // defpackage.f42
    public final boolean equals(Object obj) {
        if (obj instanceof qh0) {
            qh0 qh0Var = (qh0) obj;
            if (this.b.equals(qh0Var.b) && this.c.equals(qh0Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.f42
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + '}';
    }
}
