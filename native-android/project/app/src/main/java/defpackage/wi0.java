package defpackage;

import com.bumptech.glide.Registry$NoSourceEncoderAvailableException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wi0 {
    public final ArrayList a;
    public final ArrayList b;
    public ii1 c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public sd0 h;
    public db3 i;
    public Map j;
    public Class k;
    public boolean l;
    public boolean m;
    public f42 n;
    public eq3 o;
    public xq0 p;
    public boolean q;
    public boolean r;

    public wi0() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public final ArrayList a() {
        boolean r0 = this.m;
        ArrayList r1 = this.b;
        if (r0 == true) goto L17;
        this.m = true;
        r1.clear();
        ArrayList r7 = b();
        int r2 = r7.size();
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L17;
        tw2 r4 = (tw2) r7.get(r3);
        f42 r5 = r4.a;
        List r6 = r4.b;
        if (r1.contains(r5) == true) goto L9;
        r1.add(r4.a);
    L9:
        int r8 = 0;
    L11:
        if (r8 >= r6.size()) goto L16;
        if (r1.contains(r6.get(r8)) == true) goto L15;
        r1.add(r6.get(r8));
    L15:
        r8 = r8 + 1;
        goto L11
    L16:
        r3 = r3 + 1;
    L17:
        return r1;
    }

    public final ArrayList b() {
        boolean r0 = this.l;
        ArrayList r1 = this.a;
        if (r0 == true) goto L10;
        this.l = true;
        r1.clear();
        List r2 = this.c.a().f(this.d);
        int r3 = r2.size();
        int r4 = 0;
    L5:
        if (r4 >= r3) goto L10;
        tw2 r5 = ((uw2) r2.get(r4)).b(this.d, this.e, this.f, this.i);
        if (r5 == null) goto L9;
        r1.add(r5);
    L9:
        r4 = r4 + 1;
    L10:
        return r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fd2 c(Class r24) {
        Class r1 = r24;
        ey3 r7 = this.c.a();
        Class r8 = this.g;
        Class r9 = this.k;
        gd2 r0 = r7.i;
        yy2 r2 = (yy2) r0.b.getAndSet(null);
        if (r2 != null) goto L5;
        r2 = new yy2();
    L5:
        r2.a = r1;
        r2.b = r8;
        r2.c = r9;
        oi r3 = r0.a;
        monitor-enter(r3);
        fd2 r4 = (fd2) r0.a.get(r2);     // Catch: Throwable -> L88
        monitor-exit(r3);     // Catch: Throwable -> L88
        r0.b.set(r2);
        r7.i.getClass();
        if (gd2.c.equals(r4) == false) goto L12;
        return null;
    L12:
        if (r4 != null) goto L87;
        ArrayList r11 = new ArrayList();
        ArrayList r12 = r7.c.f(r1, r8);
        int r13 = r12.size();
        int r5 = 0;
    L14:
        if (r5 >= r13) goto L72;
        int r15 = r5 + 1;
        Class<?> r6 = (Class) r12.get(r5);
        ArrayList r10 = r7.f.e(r6, r9);
        int r14 = r10.size();
        int r16 = 0;
    L16:
        if (r16 >= r14) goto L70;
        int r17 = r16 + 1;
        Class r18 = (Class) r10.get(r16);
        rf2 r19 = r7.c;
        monitor-enter(r19);
        ArrayList r20 = new ArrayList();     // Catch: Throwable -> L37
        ArrayList r110 = (ArrayList) r19.n;     // Catch: Throwable -> L37
        int r111 = r110.size();     // Catch: Throwable -> L37
        ArrayList r112 = r10;
        int r21 = 0;
    L21:
        if (r21 >= r111) goto L40;
        Object r113 = r110.get(r21);     // Catch: Throwable -> L37
        int r22 = r21 + 1;     // Catch: Throwable -> L37
        String r23 = (String) r113;     // Catch: Throwable -> L37
        int r114 = r14;
        List r25 = (List) ((HashMap) r19.o).get(r23);     // Catch: Throwable -> L37
        if (r25 == null) goto L24;
        Iterator r26 = r25.iterator();     // Catch: Throwable -> L37
    L27:
        if (r26.hasNext() == false) goto L24;
        u04 r27 = (u04) r26.next();     // Catch: Throwable -> L37
        Iterator r28 = r26;
        if (r27.a.isAssignableFrom(r1) == true) goto L31;
    L33:
        boolean r29 = false;
    L34:
        if (r29 == false) goto L39;
        r20.add(r27.c);     // Catch: Throwable -> L37
    L39:
        r26 = r28;
        goto L27
    L31:
        if (r6.isAssignableFrom(r27.b) == false) goto L33;
        r29 = true;
    L24:
        r14 = r114;
        r21 = r22;
        goto L21
    L40:
        int r115 = r14;
        monitor-exit(r19);
        c52 r30 = r7.f;
        monitor-enter(r30);
    L49:
        th = move-exception;
        throw th;
    L45:
        if (r18.isAssignableFrom(r6) == false) goto L51;
        d14 r31 = rv2.I;     // Catch: Throwable -> L49
        monitor-exit(r30);
    L62:
        r11.add(new yi0(r1, r6, r18, r20, r31, r7.j));
        r1 = r24;
        r16 = r17;
        r10 = r112;
        r14 = r115;
        goto L16
    L51:
        ArrayList r32 = r30.a;     // Catch: Throwable -> L49
        int r33 = r32.size();     // Catch: Throwable -> L49
        int r116 = 0;
    L52:
        if (r116 >= r33) goto L65;
        Object r117 = r32.get(r116);     // Catch: Throwable -> L49
        r116 = r116 + 1;     // Catch: Throwable -> L49
        nw4 r118 = (nw4) r117;     // Catch: Throwable -> L49
        ArrayList r210 = r32;
        if (r118.a.isAssignableFrom(r6) == true) goto L56;
    L58:
        boolean r34 = false;
    L59:
        if (r34 == true) goto L60;
        r1 = r24;
        r32 = r210;
        goto L52
    L60:
        r31 = r118.c;     // Catch: Throwable -> L49
        monitor-exit(r30);
        goto L62
    L56:
        if (r18.isAssignableFrom(r118.b) == false) goto L58;
        r34 = true;
        goto L59
    L65:
        throw new IllegalArgumentException("No transcoder registered to transcode from " + r6 + " to " + r18);     // Catch: Throwable -> L49
    L37:
        th = move-exception;
        throw th;
    L70:
        r1 = r24;
        r5 = r15;
        goto L14
    L72:
        if (r11.isEmpty() == false) goto L74;
        Class r35 = r24;
        Class r36 = r8;
        Class r37 = r9;
        fd2 r119 = null;
    L75:
        gd2 r38 = r7.i;
        oi r39 = r38.a;
        monitor-enter(r39);
        oi r40 = r38.a;     // Catch: Throwable -> L84
        yy2 r41 = new yy2(r35, r36, r37);     // Catch: Throwable -> L84
        if (r119 == null) goto L80;
        fd2 r42 = r119;
    L81:
        r40.put(r41, r42);     // Catch: Throwable -> L84
        monitor-exit(r39);     // Catch: Throwable -> L84
        return r119;
    L80:
        r42 = gd2.c;     // Catch: Throwable -> L84
    L84:
        th = move-exception;
        throw th;
    L74:
        r35 = r24;
        r36 = r8;
        r37 = r9;
        r119 = new fd2(r35, r36, r37, r11, r7.j);
        goto L75
    L87:
        return r4;
    L88:
        th = move-exception;
        throw th;
    }

    public final c11 d(Object r7) {
        hg3 r6 = this.c.a().b;
        Class<?> r0 = r7.getClass();
        monitor-enter(r6);
        ArrayList r1 = (ArrayList) r6.o;     // Catch: Throwable -> L11
        int r2 = r1.size();     // Catch: Throwable -> L11
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L13;
        Object r4 = r1.get(r3);     // Catch: Throwable -> L11
        r3 = r3 + 1;     // Catch: Throwable -> L11
        d11 r5 = (d11) r4;     // Catch: Throwable -> L11
        if (r5.a.isAssignableFrom(r0) == false) goto L5;
        c11 r8 = r5.b;     // Catch: Throwable -> L11
        monitor-exit(r6);
    L15:
        if (r8 == null) goto L18;
        return r8;
    L18:
        throw new Registry$NoSourceEncoderAvailableException("Failed to find source encoder for data class: " + r7.getClass());
    L13:
        monitor-exit(r6);
        r8 = null;
    L11:
        th = move-exception;
        throw th;
    }

    public final uw4 e(Class r5) {
        uw4 r0 = (uw4) this.j.get(r5);
        if (r0 != null) goto L10;
        Iterator r1 = this.j.entrySet().iterator();
    L6:
        if (r1.hasNext() == false) goto L10;
        Map.Entry r2 = (Map.Entry) r1.next();
        if (((Class) r2.getKey()).isAssignableFrom(r5) == false) goto L6;
        r0 = (uw4) r2.getValue();
    L10:
        if (r0 == null) goto L12;
        return r0;
    L12:
        if (this.j.isEmpty() == false) goto L19;
        if (this.q == false) goto L19;
        nz2.A(r5, ". If you wish to ignore unknown resource types, use the optional transformation methods.", "Missing transformation for ");
        return null;
    L19:
        return m15.b;
    }
}
