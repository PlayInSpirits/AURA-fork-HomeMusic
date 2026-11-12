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

    public nk1(u21 r4, int r5, Map r6, boolean r7, boolean r8, boolean r9, int r10, List r11, int r12, int r13, List r14) {
        this.a = new ThreadLocal();
        this.b = new ConcurrentHashMap();
        mf4 r15 = new mf4(r6, r9, r14);
        this.c = r15;
        this.f = r7;
        this.g = r8;
        ArrayList r0 = new ArrayList();
        r0.add(hz4.A);
        int r16 = 1;
        if (r12 != 1) goto L5;
        v73 r17 = w73.c;
    L6:
        r0.add(r17);
        r0.add(r4);
        r0.addAll(r11);
        r0.add(hz4.p);
        r0.add(hz4.g);
        r0.add(hz4.d);
        r0.add(hz4.e);
        r0.add(hz4.f);
        int r18 = 2;
        if (r10 != 1) goto L9;
        lk1 r19 = hz4.k;
    L10:
        r0.add(new ez4(Long.TYPE, Long.class, r19));
        int r110 = 0;
        lk1 r111 = new lk1(r110);
        r0.add(new ez4(Double.TYPE, Double.class, r111));
        lk1 r112 = new lk1(r16);
        r0.add(new ez4(Float.TYPE, Float.class, r112));
        if (r13 != 2) goto L13;
        m73 r113 = n73.b;
    L14:
        r0.add(r113);
        r0.add(hz4.h);
        r0.add(hz4.i);
        int r114 = 3;
        Class<AtomicLong> r1 = AtomicLong.class;
        r0.add(new dz4(r1, new ek4(new ek4(r19, r16), r114), r110));
        Class<AtomicLongArray> r115 = AtomicLongArray.class;
        r0.add(new dz4(r115, new ek4(new ek4(r19, r18), r114), r110));
        r0.add(hz4.j);
        r0.add(hz4.l);
        r0.add(hz4.q);
        r0.add(hz4.r);
        Class<BigDecimal> r116 = BigDecimal.class;
        r0.add(new dz4(r116, hz4.m, r110));
        Class<BigInteger> r117 = BigInteger.class;
        r0.add(new dz4(r117, hz4.n, r110));
        Class<q72> r118 = q72.class;
        r0.add(new dz4(r118, hz4.o, r110));
        r0.add(hz4.s);
        r0.add(hz4.t);
        r0.add(hz4.v);
        r0.add(hz4.w);
        r0.add(hz4.y);
        r0.add(hz4.u);
        r0.add(hz4.b);
        r0.add(dk4.e);
        r0.add(hz4.x);
        if (gk4.a == false) goto L17;
        r0.add(gk4.e);
        r0.add(gk4.d);
        r0.add(gk4.f);
    L17:
        r0.add(si.d);
        r0.add(hz4.a);
        r0.add(new p40(r15, r110));
        r0.add(new p40(r15, r18));
        p40 r20 = new p40(r15, r16);
        this.d = r20;
        r0.add(r20);
        r0.add(hz4.B);
        r0.add(new tx3(r15, r5, r4, r20, r14));
        this.e = Collections.unmodifiableList(r0);
        return;
    L13:
        r113 = new m73(new n73(r13), r110);
        goto L14
    L9:
        r19 = new lk1(r18);
        goto L10
    L5:
        r17 = new v73(r12);
        goto L6
    }

    public static void a(double r2) {
        if (Double.isNaN(r2) == true) goto L8;
        if (Double.isInfinite(r2) == true) goto L8;
        return;
    L8:
        throw new IllegalArgumentException(r2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    public final Object b(h32 r4, TypeToken r5) {
        if (r4 != null) goto L5;
        return null;
    L5:
        n32 r0 = new n32(n32.G);
        r0.C = new Object[32];
        r0.D = 0;
        r0.E = new String[32];
        r0.F = new int[32];
        r0.s0(r4);
        return c(r0, r5);
    }

    public final Object c(l32 r4, TypeToken r5) {
        boolean r1 = r4.o;
        boolean r2 = true;
        r4.o = true;
        r4.e0();     // Catch: Throwable -> L6 AssertionError -> L8 IOException -> L10 IllegalStateException -> L12 EOFException -> L14
        r2 = false;
        Object r3 = g(r5).a(r4);     // Catch: Throwable -> L6 AssertionError -> L8 IOException -> L10 IllegalStateException -> L12 EOFException -> L14
        r4.o = r1;
        return r3;
    L6:
        th = move-exception;
        r4.o = r1;
        throw th;
    L14:
        e = move-exception;
        if (r2 == false) goto L26;
        r4.o = r1;
        return null;
    L26:
        throw new JsonSyntaxException(e);     // Catch: Throwable -> L6
    L12:
        e = move-exception;
        throw new JsonSyntaxException(e);     // Catch: Throwable -> L6
    L10:
        e = move-exception;
        throw new JsonSyntaxException(e);     // Catch: Throwable -> L6
    L8:
        e = move-exception;
        throw new AssertionError("AssertionError (GSON 2.10.1): " + e.getMessage(), e);     // Catch: Throwable -> L6
    }

    public final Object d(Class r2, String r3) {
        Object r1 = e(r3, TypeToken.get(r2));
        return su3.I(r2).cast(r1);
    }

    public final Object e(String r2, TypeToken r3) {
        /*  JADX ERROR: Simple mode code generation failed
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:361)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:354)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:316)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:279)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            */
        /*
            this = this;
            if (r2 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.io.StringReader r0 = new java.io.StringReader
            r0.<init>(r2)
            l32 r2 = new l32
            r2.<init>(r0)
            boolean r0 = r1.g
            r2.o = r0
            java.lang.Object r1 = r1.c(r2, r3)
            if (r1 == 0) goto L37
            int r2 = r2.e0()     // Catch: java.io.IOException -> L29 com.google.gson.stream.MalformedJsonException -> L30
            r3 = 10
            if (r2 != r3) goto L21
            goto L37
        L21:
            com.google.gson.JsonSyntaxException r1 = new com.google.gson.JsonSyntaxException     // Catch: java.io.IOException -> L29 com.google.gson.stream.MalformedJsonException -> L30
            java.lang.String r2 = "JSON document was not fully consumed."
            r1.<init>(r2)     // Catch: java.io.IOException -> L29 com.google.gson.stream.MalformedJsonException -> L30
            throw r1     // Catch: java.io.IOException -> L29 com.google.gson.stream.MalformedJsonException -> L30
        L29:
            r1 = move-exception
            com.google.gson.JsonIOException r2 = new com.google.gson.JsonIOException
            r2.<init>(r1)
            throw r2
        L30:
            r1 = move-exception
            com.google.gson.JsonSyntaxException r2 = new com.google.gson.JsonSyntaxException
            r2.<init>(r1)
            throw r2
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk1.e(java.lang.String, com.google.gson.reflect.TypeToken):java.lang.Object");
    }

    public final Object f(String r1, Type r2) {
        return e(r1, TypeToken.get(r2));
    }

    public final bz4 g(TypeToken r10) {
        Objects.requireNonNull(r10, "type must not be null");
        ConcurrentHashMap r0 = this.b;
        bz4 r1 = (bz4) r0.get(r10);
        if (r1 == null) goto L5;
        return r1;
    L5:
        ThreadLocal r2 = this.a;
        Map r3 = (Map) r2.get();
        if (r3 != null) goto L8;
        r3 = new HashMap();
        r2.set(r3);
        boolean r4 = true;
    L35:
        mk1 r5 = new mk1();     // Catch: Throwable -> L20
        r5.a = null;     // Catch: Throwable -> L20
        r3.put(r10, r5);     // Catch: Throwable -> L20
        Iterator r6 = this.e.iterator();     // Catch: Throwable -> L20
        bz4 r7 = null;
    L14:
        if (r6.hasNext() == false) goto L24;
        r7 = ((cz4) r6.next()).a(this, r10);     // Catch: Throwable -> L20
        if (r7 == null) goto L14;
        if (r5.a != null) goto L23;
        r5.a = r7;     // Catch: Throwable -> L20
        r3.put(r10, r7);     // Catch: Throwable -> L20
        goto L24
    L23:
        throw new AssertionError("Delegate is already set");     // Catch: Throwable -> L20
    L24:
        if (r4 == false) goto L26;
        r2.remove();
    L26:
        if (r7 == null) goto L30;
        if (r4 == false) goto L29;
        r0.putAll(r3);
    L29:
        return r7;
    L30:
        mj0.l(r10, "GSON (2.10.1) cannot handle ");
        return null;
    L20:
        th = move-exception;
        if (r4 == false) goto L34;
        r2.remove();
    L34:
        throw th;
    L8:
        bz4 r8 = (bz4) r3.get(r10);
        if (r8 == null) goto L11;
        return r8;
    L11:
        r4 = false;
        goto L35
    }

    public final bz4 h(cz4 r4, TypeToken r5) {
        List r0 = this.e;
        if (r0.contains(r4) == true) goto L5;
        r4 = this.d;
    L5:
        Iterator r1 = r0.iterator();
        boolean r2 = false;
    L7:
        if (r1.hasNext() == false) goto L15;
        cz4 r3 = (cz4) r1.next();
        if (r2 == false) goto L10;
        bz4 r6 = r3.a(this, r5);
        if (r6 == null) goto L7;
        return r6;
    L10:
        if (r3 != r4) goto L7;
        r2 = true;
        goto L7
    L15:
        mj0.l(r5, "GSON cannot serialize ");
        return null;
    }

    public final q32 i(Writer r2) {
        q32 r0 = new q32(r2);
        r0.s = this.f;
        r0.r = this.g;
        r0.u = false;
        return r0;
    }

    public final String j(Object r4) {
        if (r4 != null) goto L10;
        StringWriter r5 = new StringWriter();
        k(i(r5));     // Catch: IOException -> L7
        return r5.toString();
    L7:
        e = move-exception;
        throw new JsonIOException(e);
    L10:
        Class r0 = r4.getClass();
        StringWriter r1 = new StringWriter();
        l(r4, r0, i(r1));     // Catch: IOException -> L14
        return r1.toString();
    L14:
        e = move-exception;
        throw new JsonIOException(e);
    }

    public final void k(q32 r7) {
        i32 r0 = i32.n;
        boolean r2 = r7.r;
        r7.r = true;
        boolean r3 = r7.s;
        r7.s = this.f;
        boolean r6 = r7.u;
        r7.u = false;
        dz4 r4 = hz4.a;     // Catch: AssertionError -> L6 IOException -> L8 Throwable -> L12
        lk1.d(r7, r0);     // Catch: AssertionError -> L6 IOException -> L8 Throwable -> L12
        r7.r = r2;
        r7.s = r3;
        r7.u = r6;
        return;
    L12:
        th = move-exception;
        r7.r = r2;
        r7.s = r3;
        r7.u = r6;
        throw th;
    L8:
        e = move-exception;
        throw new JsonIOException(e);     // Catch: Throwable -> L12
    L6:
        e = move-exception;
        throw new AssertionError("AssertionError (GSON 2.10.1): " + e.getMessage(), e);     // Catch: Throwable -> L12
    }

    public final void l(Object r5, Class r6, q32 r7) {
        bz4 r8 = g(TypeToken.get(r6));
        boolean r1 = r7.r;
        r7.r = true;
        boolean r2 = r7.s;
        r7.s = this.f;
        boolean r4 = r7.u;
        r7.u = false;
        r8.b(r7, r5);     // Catch: Throwable -> L6 AssertionError -> L8 IOException -> L11
        r7.r = r1;
        r7.s = r2;
        r7.u = r4;
        return;
    L6:
        th = move-exception;
        r7.r = r1;
        r7.s = r2;
        r7.u = r4;
        throw th;
    L11:
        e = move-exception;
        throw new JsonIOException(e);     // Catch: Throwable -> L6
    L8:
        e = move-exception;
        throw new AssertionError("AssertionError (GSON 2.10.1): " + e.getMessage(), e);     // Catch: Throwable -> L6
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }

    public nk1() {
        u21 r1 = u21.p;
        Map r3 = Collections.EMPTY_MAP;
        List r8 = Collections.EMPTY_LIST;
        this(r1, 1, r3, true, false, true, 1, r8, 1, 2, r8);
    }
}
