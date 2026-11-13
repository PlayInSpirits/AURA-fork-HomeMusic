package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class yy2 {
    public yy2() {
        super();
    }

    public Class a;
    public Class b;
    public Class c;

    public yy2(Class cls, Class cls2, Class cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yy2.class != obj.getClass()) {
            return false;
        }
        yy2 yy2Var = (yy2) obj;
        return this.a.equals(yy2Var.a) && this.b.equals(yy2Var.b) && e35.n(this.c, yy2Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Class cls = this.c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.b + '}';
    }
}
