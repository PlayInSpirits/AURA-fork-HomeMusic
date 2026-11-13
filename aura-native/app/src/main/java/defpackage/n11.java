package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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

    public n11(Object obj, f42 f42Var, int i, int i2, Map map, Class cls, Class cls2, db3 db3Var) {
        h12.f(obj, "Argument must not be null");
        this.b = obj;
        this.g = f42Var;
        this.c = i;
        this.d = i2;
        h12.f(map, "Argument must not be null");
        this.h = map;
        h12.f(cls, "Resource class must not be null");
        this.e = cls;
        h12.f(cls2, "Transcode class must not be null");
        this.f = cls2;
        h12.f(db3Var, "Argument must not be null");
        this.i = db3Var;
    }

    @Override // defpackage.f42
    public final void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.f42
    public final boolean equals(Object obj) {
        if (obj instanceof n11) {
            n11 n11Var = (n11) obj;
            if (this.b.equals(n11Var.b) && this.g.equals(n11Var.g) && this.d == n11Var.d && this.c == n11Var.c && this.h.equals(n11Var.h) && this.e.equals(n11Var.e) && this.f.equals(n11Var.f) && this.i.equals(n11Var.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.f42
    public final int hashCode() {
        if (this.j == 0) {
            int hashCode = this.b.hashCode();
            this.j = hashCode;
            int hashCode2 = ((((this.g.hashCode() + (hashCode * 31)) * 31) + this.c) * 31) + this.d;
            this.j = hashCode2;
            int hashCode3 = this.h.hashCode() + (hashCode2 * 31);
            this.j = hashCode3;
            int hashCode4 = this.e.hashCode() + (hashCode3 * 31);
            this.j = hashCode4;
            int hashCode5 = this.f.hashCode() + (hashCode4 * 31);
            this.j = hashCode5;
            this.j = this.i.b.hashCode() + (hashCode5 * 31);
        }
        return this.j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + '}';
    }
}
