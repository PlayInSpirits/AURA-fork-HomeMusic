package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e55 {
    public final ok2 a;
    public final k55 b;
    public final long c;
    public boolean d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public boolean j;
    public float k;
    public vp4 l;
    public boolean m;
    public boolean n;

    public e55(Context r1, ok2 r2, long r3) {
        this.a = r2;
        this.c = r3;
        this.b = new k55(r1);
        this.e = 0;
        this.f = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.k = 1.0f;
        this.l = vp4.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final int a(long r31, long r33, long r35, long r37, boolean r39, boolean r40, pu r41) {
        r41.a = -9223372036854775807L;
        r41.b = -9223372036854775807L;
        if (this.d == false) goto L8;
        if (this.f != (-9223372036854775807L)) goto L8;
        this.f = r33;
    L8:
        if (this.h == r31) goto L36;
        k55 r3 = this.b;
        long r18 = -9223372036854775807L;
        long r6 = r3.n;
        if (r6 == (-1)) goto L12;
        r3.q = r6;
        r3.r = r3.o;
        r3.s = r3.p;
        r3.k = r3.l;
    L12:
        r3.m++;
        n71 r7 = r3.a;
        long r22 = 1000;
        long r14 = r31 * 1000;
        r7.a.b(r14);
        if (r7.a.a() == false) goto L15;
        r7.c = false;
        long r24 = 0;
    L27:
        if (r7.c == true) goto L29;
    L31:
        r7.d = r14;
        if (r7.a.a() == false) goto L34;
        int r8 = 0;
    L35:
        r7.e = r8;
        r3.c();
        this.h = r31;
    L37:
        long r9 = (long) ((r31 - r33) / ((double) this.k));
        if (this.d == false) goto L40;
        this.l.getClass();
        r9 = r9 - (f35.Q(SystemClock.elapsedRealtime()) - r35);
    L40:
        r41.a = r9;
        if (r39 == false) goto L45;
        if (r40 == true) goto L45;
    L156:
        return 3;
    L45:
        if (this.m == false) goto L47;
        long r15 = -30000;
        if (this.i != r18) goto L59;
    L62:
        int r4 = this.e;
        if (r4 == 0) goto L84;
        if (r4 == 1) goto L83;
        if (r4 == 2) goto L80;
        if (r4 != 3) goto L78;
        this.l.getClass();
        int r36 = 3;
        int r38 = 5;
        long r5 = f35.Q(SystemClock.elapsedRealtime()) - this.g;
        if (this.d == true) goto L69;
    L61:
        boolean r10 = false;
    L85:
        if (r10 == false) goto L88;
        return 0;
    L88:
        if (this.d == true) goto L90;
    L162:
        return r38;
    L90:
        if (r33 == this.f) goto L162;
        this.l.getClass();
        long r11 = System.nanoTime();
        k55 r12 = this.b;
        long r13 = (r41.a * r22) + r11;
        if (r12.q != (-1)) goto L95;
        int r310 = 1;
        int r311 = 2;
        r15 = -30000;
    L112:
        r12.n = r12.m;
        r12.o = r13;
        r12.p = r31;
        g55 r1 = r12.c;
        if (r1 != null) goto L115;
    L114:
        long r20 = r11;
    L142:
        r41.b = r13;
        long r2 = (r13 - r20) / r22;
        r41.a = r2;
        if (this.i != r18) goto L145;
    L147:
        boolean r16 = 0;
    L149:
        if (this.a.P0(r2, r33, r40, r16) == false) goto L152;
        return 4;
    L152:
        long r0 = r41.a;
        if (r0 >= r15) goto L159;
        if (r40 == true) goto L159;
        if (r16 != 0) goto L163;
        return r311;
    L163:
        return r36;
    L159:
        if (r0 > 50000) goto L162;
        return r310;
    L145:
        if (this.j == true) goto L147;
        r16 = r310;
        goto L149
    L115:
        long r17 = r1.p;
        long r19 = r12.c.q;
        if (r17 == r18) goto L114;
        if (r19 == r18) goto L114;
        long r110 = (((r13 - r17) / r19) * r19) + r17;
        if (r13 > r110) goto L123;
        long r21 = r110 - r19;
    L124:
        long r111 = r110 - r13;
        long r23 = r13 - r21;
        long r25 = Math.abs(r111 - r23);
        if (r25 >= (r19 / 2)) goto L136;
        long r32 = r21;
        long r26 = r19 / 4;
        if (r25 >= r26) goto L135;
        r20 = r11;
        long r27 = r12.k;
        if (r27 == r24) goto L132;
        r12.l = r27;
    L138:
        if ((r111 + r12.l) < r23) goto L141;
        r110 = r32;
    L141:
        r13 = r110 - ((r19 * 80) / 100);
        goto L142
    L132:
        if (r111 >= r23) goto L134;
        r26 = -r26;
    L134:
        r12.l = r26;
        goto L138
    L135:
        r20 = r11;
        r12.l = r24;
        goto L138
    L136:
        r32 = r21;
        r20 = r11;
        r12.l = r12.k;
        goto L138
    L123:
        r110 = r110 + r19;
        r21 = r110;
        goto L124
    L95:
        if (r12.a.a.a() == false) goto L106;
        n71 r28 = r12.a;
        if (r28.a.a() == false) goto L103;
        m71 r29 = r28.a;
        r311 = 2;
        long r112 = r29.e;
        r310 = 1;
        if (r112 != r24) goto L101;
        long r113 = r24;
    L104:
        float r30 = (r12.m - r12.q) * r113;
        float r114 = r12.i;
    L107:
        long r115 = r12.r + ((long) (r30 / r114));
        if (Math.abs(r13 - r115) > 20000000) goto L110;
        r13 = r115;
        goto L112
    L110:
        r12.b();
        goto L112
    L101:
        r113 = r29.f / r112;
        goto L104
    L103:
        r310 = 1;
        r311 = 2;
        r113 = r18;
        goto L104
    L106:
        r310 = 1;
        r311 = 2;
        r30 = (r31 - r12.s) * r22;
        r114 = r12.i;
        goto L107
    L69:
        long r34 = this.f;
        if (r34 == r18) goto L61;
        if (r34 == r33) goto L61;
        if (r9 >= (-30000)) goto L61;
        if (r5 <= 100000) goto L61;
    L77:
        r10 = true;
        goto L85
    L78:
        tb4.a();
        return 0;
    L80:
        r36 = 3;
        r38 = 5;
        if (r33 < r37) goto L61;
    L83:
        r36 = 3;
        r38 = 5;
        goto L77
    L84:
        r36 = 3;
        r38 = 5;
        r10 = this.d;
        goto L85
    L59:
        if (this.j == true) goto L62;
        r36 = 3;
        r38 = 5;
        goto L61
    L47:
        if (this.a.P0(r9, r33, r40, true) == false) goto L50;
        return 4;
    L50:
        if (this.d == true) goto L52;
    L54:
        this.n = true;
        return 5;
    L52:
        if (r41.a >= 30000) goto L54;
    L34:
        r8 = r7.e + 1;
        goto L35
    L29:
        if (r7.b.a() == false) goto L31;
        m71 r42 = r7.a;
        r7.a = r7.b;
        r7.b = r42;
        r7.c = false;
        goto L31
    L15:
        r24 = 0;
        if (r7.d == (-9223372036854775807L)) goto L27;
        if (r7.c == false) goto L24;
        m71 r43 = r7.b;
        long r44 = r43.d;
        if (r44 != 0) goto L22;
        boolean r45 = false;
    L23:
        if (r45 == true) goto L24;
    L25:
        r7.c = true;
        r7.b.b(r14);
        goto L27
    L22:
        r45 = r43.g[(int) ((r44 - 1) % 15)];
    L24:
        r7.b.c();
        r7.b.b(r7.d);
        goto L25
    L36:
        r18 = -9223372036854775807L;
        r22 = 1000;
        r24 = 0;
        goto L37
    }

    public final boolean b(boolean r9) {
        if (r9 == false) goto L13;
        if (this.e != 3) goto L7;
    L10:
        this.i = -9223372036854775807L;
        return true;
    L7:
        if (this.m == true) goto L13;
        if (this.n == true) goto L10;
    L13:
        if (this.i != (-9223372036854775807L)) goto L15;
        return false;
    L15:
        this.l.getClass();
        if (SystemClock.elapsedRealtime() >= this.i) goto L18;
        return true;
    L18:
        this.i = -9223372036854775807L;
        return false;
    }

    public final void c(boolean r5) {
        this.j = r5;
        long r2 = this.c;
        if (r2 <= 0) goto L5;
        this.l.getClass();
        long r0 = SystemClock.elapsedRealtime() + r2;
    L6:
        this.i = r0;
        return;
    L5:
        r0 = -9223372036854775807L;
        goto L6
    }

    public final void d() {
        this.d = true;
        this.l.getClass();
        this.g = f35.Q(SystemClock.elapsedRealtime());
        k55 r4 = this.b;
        r4.d = true;
        r4.b();
        DisplayManager r0 = (DisplayManager) r4.b.getSystemService("display");
        g55 r1 = null;
        if (r0 != null) goto L18;
    L13:
        r4.c = r1;
        if (r1 == null) goto L16;
        r1.a();
    L16:
        r4.d(false);
        return;
    L18:
        Choreographer r2 = Choreographer.getInstance();     // Catch: RuntimeException -> L11
        if (Build.VERSION.SDK_INT < 33) goto L10;
        g55 r3 = new j55(r2, r0);
    L9:
        r1 = r3;
        goto L13
    L10:
        r3 = new h55(r2, r0);
    L11:
        e = move-exception;
        l93.r0("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
        goto L13
    }

    public final void e(int r2) {
        if (r2 == 0) goto L11;
        if (r2 != 1) goto L6;
        this.e = 0;
    L12:
        this.b.b();
        return;
    L6:
        if (r2 != 2) goto L8;
        this.e = Math.min(this.e, 2);
        goto L12
    L8:
        tb4.a();
        return;
    L11:
        this.e = 1;
        goto L12
    }

    public final void f(float r4) {
        k55 r3 = this.b;
        r3.f = r4;
        n71 r5 = r3.a;
        r5.a.c();
        r5.b.c();
        r5.c = false;
        r5.d = -9223372036854775807L;
        r5.e = 0;
        r3.c();
    }

    public final void g(Surface r4) {
        if (r4 == null) goto L5;
        boolean r2 = true;
    L6:
        this.m = r2;
        this.n = false;
        k55 r0 = this.b;
        if (r0.e == r4) goto L10;
        r0.a();
        r0.e = r4;
        r0.d(true);
    L10:
        this.e = Math.min(this.e, 1);
        return;
    L5:
        r2 = false;
        goto L6
    }

    public final void h(float r3) {
        if (r3 <= 0.0f) goto L5;
        boolean r0 = true;
    L6:
        rr2.l(r0);
        if (r3 != this.k) goto L9;
        return;
    L9:
        this.k = r3;
        k55 r2 = this.b;
        r2.i = r3;
        r2.d(false);
        return;
    L5:
        r0 = false;
        goto L6
    }
}
