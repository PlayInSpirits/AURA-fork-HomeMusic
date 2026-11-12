package defpackage;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s73 implements f42 {
    public final Object b;

    public s73(Object obj) {
        h12.f(obj, "Argument must not be null");
        this.b = obj;
    }

    @Override // defpackage.f42
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(f42.a));
    }

    @Override // defpackage.f42
    public final boolean equals(Object obj) {
        if (obj instanceof s73) {
            return this.b.equals(((s73) obj).b);
        }
        return false;
    }

    @Override // defpackage.f42
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.b + '}';
    }
}
