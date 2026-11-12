package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i30 implements h30, v32, t32 {
    public static final Map o;
    public final Class n;

    static {
        List listP = gb.P(gf1.class, if1.class, wf1.class, xf1.class, yf1.class, zf1.class, ag1.class, bg1.class, cg1.class, dg1.class, hf1.class, jf1.class, kf1.class, lf1.class, mf1.class, nf1.class, of1.class, pf1.class, qf1.class, rf1.class, tf1.class, uf1.class, vf1.class);
        ArrayList arrayList = new ArrayList(r40.k0(listP, 10));
        int i = 0;
        for (Object obj : listP) {
            int i2 = i + 1;
            if (i < 0) {
                gb.c0();
                throw null;
            }
            arrayList.add(new kd3((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        o = lg2.Z(arrayList);
    }

    public i30(Class cls) {
        cls.getClass();
        this.n = cls;
    }

    @Override // defpackage.h30
    public final Class a() {
        return this.n;
    }

    public final String b() {
        String strN;
        Class cls = this.n;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strN2 = jz4.n(cls.getName());
            return strN2 == null ? cls.getCanonicalName() : strN2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strN = jz4.n(componentType.getName())) != null) {
            strConcat = strN.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final String c() {
        String strK;
        Class cls = this.n;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strK2 = jz4.K(cls.getName());
                return strK2 == null ? cls.getSimpleName() : strK2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strK = jz4.K(componentType.getName())) != null) {
                strConcat = strK.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return qm4.F0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return qm4.E0(simpleName, '$');
        }
        return qm4.F0(simpleName, enclosingConstructor.getName() + '$');
    }

    public final boolean d(Object obj) {
        Class clsV = this.n;
        clsV.getClass();
        Map map = o;
        map.getClass();
        Integer num = (Integer) map.get(clsV);
        if (num != null) {
            return jz4.A(num.intValue(), obj);
        }
        if (clsV.isPrimitive()) {
            clsV = uo.v(kx3.a(clsV));
        }
        return clsV.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i30) && uo.v(this).equals(uo.v((i30) obj));
    }

    public final int hashCode() {
        return uo.v(this).hashCode();
    }

    public final String toString() {
        return this.n.toString() + " (Kotlin reflection is not available)";
    }
}
