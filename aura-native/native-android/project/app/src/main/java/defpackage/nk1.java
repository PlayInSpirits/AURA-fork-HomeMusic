package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nk1 {
    public final ThreadLocal a;
    public final ConcurrentHashMap b;
    public final mf4 c;
    public final p40 d;
    public final List e;
    public final boolean f;
    public final boolean g;

    public nk1(u21 u21Var, int i, Map map, boolean z, boolean z2, boolean z3, int i2, List list, int i3, int i4, List list2) {
        this.a = new ThreadLocal();
        this.b = new ConcurrentHashMap();
        mf4 mf4Var = new mf4(map, z3, list2);
        this.c = mf4Var;
        this.f = z;
        this.g = z2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(hz4.A);
        int i5 = 1;
        arrayList.add(i3 == 1 ? w73.c : new v73(i3));
        arrayList.add(u21Var);
        arrayList.addAll(list);
        arrayList.add(hz4.p);
        arrayList.add(hz4.g);
        arrayList.add(hz4.d);
        arrayList.add(hz4.e);
        arrayList.add(hz4.f);
        int i6 = 2;
        lk1 lk1Var = i2 == 1 ? hz4.k : new lk1(i6);
        arrayList.add(new ez4(Long.TYPE, Long.class, lk1Var));
        int i7 = 0;
        arrayList.add(new ez4(Double.TYPE, Double.class, new lk1(i7)));
        arrayList.add(new ez4(Float.TYPE, Float.class, new lk1(i5)));
        arrayList.add(i4 == 2 ? n73.b : new m73(new n73(i4), i7));
        arrayList.add(hz4.h);
        arrayList.add(hz4.i);
        int i8 = 3;
        arrayList.add(new dz4(AtomicLong.class, new ek4(new ek4(lk1Var, i5), i8), i7));
        arrayList.add(new dz4(AtomicLongArray.class, new ek4(new ek4(lk1Var, i6), i8), i7));
        arrayList.add(hz4.j);
        arrayList.add(hz4.l);
        arrayList.add(hz4.q);
        arrayList.add(hz4.r);
        arrayList.add(new dz4(BigDecimal.class, hz4.m, i7));
        arrayList.add(new dz4(BigInteger.class, hz4.n, i7));
        arrayList.add(new dz4(q72.class, hz4.o, i7));
        arrayList.add(hz4.s);
        arrayList.add(hz4.t);
        arrayList.add(hz4.v);
        arrayList.add(hz4.w);
        arrayList.add(hz4.y);
        arrayList.add(hz4.u);
        arrayList.add(hz4.b);
        arrayList.add(dk4.e);
        arrayList.add(hz4.x);
        if (gk4.a) {
            arrayList.add(gk4.e);
            arrayList.add(gk4.d);
            arrayList.add(gk4.f);
        }
        arrayList.add(si.d);
        arrayList.add(hz4.a);
        arrayList.add(new p40(mf4Var, i7));
        arrayList.add(new p40(mf4Var, i6));
        p40 p40Var = new p40(mf4Var, i5);
        this.d = p40Var;
        arrayList.add(p40Var);
        arrayList.add(hz4.B);
        arrayList.add(new tx3(mf4Var, i, u21Var, p40Var, list2));
        this.e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(h32 h32Var, TypeToken typeToken) {
        if (h32Var == null) {
            return null;
        }
        n32 n32Var = new n32(n32.G);
        n32Var.C = new Object[32];
        n32Var.D = 0;
        n32Var.E = new String[32];
        n32Var.F = new int[32];
        n32Var.s0(h32Var);
        return c(n32Var, typeToken);
    }

    public final Object c(l32 l32Var, TypeToken typeToken) {
        boolean z = l32Var.o;
        boolean z2 = true;
        l32Var.o = true;
        try {
            try {
                try {
                    try {
                        l32Var.e0();
                        z2 = false;
                        Object objA = g(typeToken).a(l32Var);
                        l32Var.o = z;
                        return objA;
                    } catch (EOFException e) {
                        if (!z2) {
                            throw new JsonSyntaxException(e);
                        }
                        l32Var.o = z;
                        return null;
                    }
                } catch (IllegalStateException e2) {
                    throw new JsonSyntaxException(e2);
                }
            } catch (IOException e3) {
                throw new JsonSyntaxException(e3);
            } catch (AssertionError e4) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e4.getMessage(), e4);
            }
        } catch (Throwable th) {
            l32Var.o = z;
            throw th;
        }
    }

    public final Object d(Class cls, String str) {
        return su3.I(cls).cast(e(str, TypeToken.get(cls)));
    }

    public final Object e(String str, TypeToken typeToken) {
        if (str == null) {
            return null;
        }
        l32 l32Var = new l32(new StringReader(str));
        l32Var.o = this.g;
        Object objC = c(l32Var, typeToken);
        if (objC != null) {
            try {
                if (l32Var.e0() != 10) {
                    throw new JsonSyntaxException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException(e);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        }
        return objC;
    }

    public final Object f(String str, Type type) {
        return e(str, TypeToken.get(type));
    }

    public final bz4 g(TypeToken typeToken) {
        boolean z;
        Objects.requireNonNull(typeToken, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.b;
        bz4 bz4Var = (bz4) concurrentHashMap.get(typeToken);
        if (bz4Var != null) {
            return bz4Var;
        }
        ThreadLocal threadLocal = this.a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            bz4 bz4Var2 = (bz4) map.get(typeToken);
            if (bz4Var2 != null) {
                return bz4Var2;
            }
            z = false;
        }
        try {
            mk1 mk1Var = new mk1();
            mk1Var.a = null;
            map.put(typeToken, mk1Var);
            Iterator it = this.e.iterator();
            bz4 bz4VarA = null;
            while (it.hasNext()) {
                bz4VarA = ((cz4) it.next()).a(this, typeToken);
                if (bz4VarA != null) {
                    if (mk1Var.a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    mk1Var.a = bz4VarA;
                    map.put(typeToken, bz4VarA);
                    break;
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (bz4VarA == null) {
                mj0.l(typeToken, "GSON (2.10.1) cannot handle ");
                return null;
            }
            if (z) {
                concurrentHashMap.putAll(map);
            }
            return bz4VarA;
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final bz4 h(cz4 cz4Var, TypeToken typeToken) {
        List<cz4> list = this.e;
        if (!list.contains(cz4Var)) {
            cz4Var = this.d;
        }
        boolean z = false;
        for (cz4 cz4Var2 : list) {
            if (z) {
                bz4 bz4VarA = cz4Var2.a(this, typeToken);
                if (bz4VarA != null) {
                    return bz4VarA;
                }
            } else if (cz4Var2 == cz4Var) {
                z = true;
            }
        }
        mj0.l(typeToken, "GSON cannot serialize ");
        return null;
    }

    public final q32 i(Writer writer) {
        q32 q32Var = new q32(writer);
        q32Var.s = this.f;
        q32Var.r = this.g;
        q32Var.u = false;
        return q32Var;
    }

    public final String j(Object obj) {
        if (obj == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                k(i(stringWriter));
                return stringWriter.toString();
            } catch (IOException e) {
                throw new JsonIOException(e);
            }
        }
        Class cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            l(obj, cls, i(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        }
    }

    public final void k(q32 q32Var) {
        i32 i32Var = i32.n;
        boolean z = q32Var.r;
        q32Var.r = true;
        boolean z2 = q32Var.s;
        q32Var.s = this.f;
        boolean z3 = q32Var.u;
        q32Var.u = false;
        try {
            try {
                dz4 dz4Var = hz4.a;
                lk1.d(q32Var, i32Var);
                q32Var.r = z;
                q32Var.s = z2;
                q32Var.u = z3;
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            q32Var.r = z;
            q32Var.s = z2;
            q32Var.u = z3;
            throw th;
        }
    }

    public final void l(Object obj, Class cls, q32 q32Var) {
        bz4 bz4VarG = g(TypeToken.get((Type) cls));
        boolean z = q32Var.r;
        q32Var.r = true;
        boolean z2 = q32Var.s;
        q32Var.s = this.f;
        boolean z3 = q32Var.u;
        q32Var.u = false;
        try {
            try {
                try {
                    bz4VarG.b(q32Var, obj);
                    q32Var.r = z;
                    q32Var.s = z2;
                    q32Var.u = z3;
                } catch (IOException e) {
                    throw new JsonIOException(e);
                }
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            q32Var.r = z;
            q32Var.s = z2;
            q32Var.u = z3;
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public nk1() {
        u21 u21Var = u21.p;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this(u21Var, 1, map, true, false, true, 1, list, 1, 2, list);
    }
}
