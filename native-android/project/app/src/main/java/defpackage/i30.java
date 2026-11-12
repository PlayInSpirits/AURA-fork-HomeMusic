package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i30 implements h30, v32, t32 {
    public static final Map o = null;
    public final Class n;

    static {
        List r0 = gb.P(new Class[]{gf1.class, if1.class, wf1.class, xf1.class, yf1.class, zf1.class, ag1.class, bg1.class, cg1.class, dg1.class, hf1.class, jf1.class, kf1.class, lf1.class, mf1.class, nf1.class, of1.class, pf1.class, qf1.class, rf1.class, tf1.class, uf1.class, vf1.class});
        ArrayList r1 = new ArrayList(r40.k0(r0, 10));
        Iterator r2 = r0.iterator();
        int r3 = 0;
    L4:
        if (r2.hasNext() == false) goto L10;
        Object r4 = r2.next();
        int r5 = r3 + 1;
        if (r3 < 0) goto L8;
        r1.add(new kd3((Class) r4, Integer.valueOf(r3)));
        r3 = r5;
        goto L4
    L8:
        gb.c0();
        throw null;
    L10:
        o = lg2.Z(r1);
    }

    public i30(Class r1) {
        r1.getClass();
        this.n = r1;
    }

    @Override // defpackage.h30
    public final Class a() {
        return this.n;
    }

    public final String b() {
        Class r2 = this.n;
        r2.getClass();
        String r1 = null;
        if (r2.isAnonymousClass() == false) goto L6;
    L7:
        return null;
    L6:
        if (r2.isLocalClass() == true) goto L7;
        if (r2.isArray() == false) goto L19;
        Class<?> r3 = r2.getComponentType();
        if (r3.isPrimitive() == false) goto L15;
        String r4 = jz4.n(r3.getName());
        if (r4 == null) goto L15;
        r1 = r4.concat("Array");
    L15:
        if (r1 != null) goto L18;
        return "kotlin.Array";
    L18:
        return r1;
    L19:
        String r0 = jz4.n(r2.getName());
        if (r0 == null) goto L22;
        return r0;
    L22:
        return r2.getCanonicalName();
    }

    public final String c() {
        Class r3 = this.n;
        r3.getClass();
        String r1 = null;
        if (r3.isAnonymousClass() == false) goto L6;
        return null;
    L6:
        if (r3.isLocalClass() == false) goto L18;
        String r0 = r3.getSimpleName();
        Method r2 = r3.getEnclosingMethod();
        if (r2 != null) goto L10;
        Constructor<?> r4 = r3.getEnclosingConstructor();
        if (r4 == null) goto L16;
        return qm4.F0(r0, r4.getName() + '$');
    L16:
        return qm4.E0(r0, '$');
    L10:
        return qm4.F0(r0, r2.getName() + '$');
    L18:
        if (r3.isArray() == false) goto L27;
        Class<?> r5 = r3.getComponentType();
        if (r5.isPrimitive() == false) goto L24;
        String r6 = jz4.K(r5.getName());
        if (r6 == null) goto L24;
        r1 = r6.concat("Array");
    L24:
        if (r1 != null) goto L26;
        return "Array";
    L26:
        return r1;
    L27:
        String r7 = jz4.K(r3.getName());
        if (r7 == null) goto L30;
        return r7;
    L30:
        return r3.getSimpleName();
    }

    public final boolean d(Object r2) {
        Class r1 = this.n;
        r1.getClass();
        Map r0 = o;
        r0.getClass();
        Integer r3 = (Integer) r0.get(r1);
        if (r3 == null) goto L7;
        return jz4.A(r3.intValue(), r2);
    L7:
        if (r1.isPrimitive() == false) goto L10;
        r1 = uo.v(kx3.a(r1));
    L10:
        return r1.isInstance(r2);
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof i30) == true) goto L5;
        return false;
    L5:
        if (uo.v(this).equals(uo.v((i30) r2)) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        return uo.v(this).hashCode();
    }

    public final String toString() {
        return this.n.toString() + " (Kotlin reflection is not available)";
    }
}
