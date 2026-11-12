package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s04 implements f42 {
    public static final sj0 j = new sj0(50);
    public final qj0 b;
    public final f42 c;
    public final f42 d;
    public final int e;
    public final int f;
    public final Class g;
    public final db3 h;
    public final uw4 i;

    public s04(qj0 qj0Var, f42 f42Var, f42 f42Var2, int i, int i2, uw4 uw4Var, Class cls, db3 db3Var) {
        this.b = qj0Var;
        this.c = f42Var;
        this.d = f42Var2;
        this.e = i;
        this.f = i2;
        this.i = uw4Var;
        this.g = cls;
        this.h = db3Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.f42
    public final void b(MessageDigest messageDigest) {
        Object objF;
        qj0 qj0Var = this.b;
        synchronized (qj0Var) {
            mf2 mf2Var = (mf2) qj0Var.d;
            xn3 xn3VarU = (xn3) ((ArrayDeque) mf2Var.a).poll();
            if (xn3VarU == null) {
                xn3VarU = mf2Var.u();
            }
            lf2 lf2Var = (lf2) xn3VarU;
            lf2Var.b = 8;
            lf2Var.c = byte[].class;
            objF = qj0Var.f(lf2Var, byte[].class);
        }
        byte[] bArr = (byte[]) objF;
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.b(messageDigest);
        this.c.b(messageDigest);
        messageDigest.update(bArr);
        uw4 uw4Var = this.i;
        if (uw4Var != null) {
            uw4Var.b(messageDigest);
        }
        this.h.b(messageDigest);
        sj0 sj0Var = j;
        Class cls = this.g;
        byte[] bytes = (byte[]) sj0Var.a(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(f42.a);
            sj0Var.d(cls, bytes);
        }
        messageDigest.update(bytes);
        this.b.h(bArr);
    }

    @Override // defpackage.f42
    public final boolean equals(Object obj) {
        if (obj instanceof s04) {
            s04 s04Var = (s04) obj;
            if (this.f == s04Var.f && this.e == s04Var.e && e35.n(this.i, s04Var.i) && this.g.equals(s04Var.g) && this.c.equals(s04Var.c) && this.d.equals(s04Var.d) && this.h.equals(s04Var.h)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.f42
    public final int hashCode() {
        int iHashCode = ((((this.d.hashCode() + (this.c.hashCode() * 31)) * 31) + this.e) * 31) + this.f;
        uw4 uw4Var = this.i;
        if (uw4Var != null) {
            iHashCode = (iHashCode * 31) + uw4Var.hashCode();
        }
        int iHashCode2 = this.g.hashCode();
        return this.h.b.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation='" + this.i + "', options=" + this.h + '}';
    }
}
