package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import com.bumptech.glide.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class vz3 extends lq {
    public final Context I;
    public final c04 J;
    public final Class K;
    public final ii1 L;
    public jx4 M;
    public Object N;
    public ArrayList O;
    public vz3 P;
    public vz3 Q;
    public boolean R;
    public boolean S;
    public boolean T;

    static {
        g04 r0 = (g04) ((g04) ((g04) new g04().e(xq0.d)).s()).y(true);
    }

    public vz3(a r4, c04 r5, Class r6, Context r7) {
        this.R = true;
        this.J = r5;
        this.K = r6;
        this.I = r7;
        oi r8 = r5.n.p.f;
        jx4 r0 = (jx4) r8.get(r6);
        if (r0 != null) goto L10;
        Iterator r9 = ((n60) r8.entrySet()).iterator();
    L6:
        if (r9.hasNext() == false) goto L10;
        Map.Entry r1 = (Map.Entry) r9.next();
        if (((Class) r1.getKey()).isAssignableFrom(r6) == false) goto L6;
        r0 = (jx4) r1.getValue();
    L10:
        if (r0 != null) goto L12;
        r0 = ii1.k;
    L12:
        this.M = r0;
        this.L = r4.p;
        Iterator r10 = r5.v.iterator();
    L14:
        if (r10.hasNext() == false) goto L16;
        F((zz3) r10.next());
        goto L14
    L16:
        monitor-enter(r5);
        g04 r11 = r5.w;     // Catch: Throwable -> L21
        monitor-exit(r5);
        G(r11);
        return;
    L21:
        th = move-exception;
        throw th;
    }

    public vz3 F(zz3 r2) {
        if (this.E == true) goto L5;
        if (r2 != null) goto L8;
    L11:
        u();
        return this;
    L8:
        if (this.O != null) goto L10;
        this.O = new ArrayList();
    L10:
        this.O.add(r2);
        goto L11
    L5:
        return I().F(r2);
    }

    public vz3 G(lq r1) {
        h12.e(r1);
        return (vz3) super.a(r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final pz3 H(Object r24, wq4 r25, zz3 r26, wz3 r27, jx4 r28, eq3 r29, int r30, int r31, lq r32, Executor r33) {
        if (this.Q == null) goto L5;
        wz3 r14 = new e21(r24, r27);
        wz3 r18 = r14;
    L6:
        vz3 r2 = this.P;
        if (r2 != null) goto L9;
        Context r3 = this.I;
        ii1 r4 = this.L;
        lq r7 = r32;
        pz3 r15 = new cf4(r3, r4, r24, this.N, this.K, r7, r30, r31, r29, r25, r26, this.O, r14, r4.g, r28.n, r33);
    L39:
        if (r18 != null) goto L41;
        return r15;
    L41:
        vz3 r1 = this.Q;
        int r5 = r1.v;
        int r6 = r1.u;
        if (e35.I(r30, r31) == false) goto L46;
        vz3 r8 = this.Q;
        if (e35.I(r8.v, r8.u) == true) goto L46;
        r5 = r7.v;
        r6 = r7.u;
    L46:
        vz3 r0 = this.Q;
        jx4 r9 = r0.M;
        eq3 r10 = r0.q;
        e21 r11 = r18;
        pz3 r12 = r0.H(r24, r25, r26, r11, r9, r10, r5, r6, r0, r33);
        r11.c = r15;
        r11.d = r12;
        return r11;
    L9:
        if (this.T == true) goto L36;
        jx4 r13 = r2.M;
        if (r2.R == false) goto L13;
        jx4 r19 = r28;
    L15:
        if (lq.j(r2.n, 8) == false) goto L18;
        eq3 r16 = this.P.q;
    L17:
        eq3 r20 = r16;
        vz3 r17 = this.P;
        int r21 = r17.v;
        int r22 = r17.u;
        if (e35.I(r30, r31) == false) goto L35;
        vz3 r23 = this.P;
        if (e35.I(r23.v, r23.u) == true) goto L35;
        r21 = r32.v;
        r22 = r32.u;
    L35:
        int r210 = r22;
        int r211 = r21;
        tt4 r110 = new tt4(r24, r14);
        Context r34 = this.I;
        ii1 r35 = this.L;
        cf4 r36 = new cf4(r34, r35, r24, this.N, this.K, r32, r30, r31, r29, r25, r26, this.O, r110, r35.g, r28.n, r33);
        this.T = true;
        vz3 r37 = this.P;
        pz3 r38 = r37.H(r24, r25, r26, r110, r19, r20, r211, r210, r37, r33);
        this.T = false;
        r110.c = r36;
        r110.d = r38;
        r7 = r32;
        r15 = r110;
        goto L39
    L18:
        int r39 = r29.ordinal();
        if (r39 == 0) goto L29;
        if (r39 == 1) goto L29;
        if (r39 != 2) goto L24;
        r16 = eq3.o;
        goto L17
    L24:
        if (r39 != 3) goto L26;
        r16 = eq3.p;
        goto L17
    L26:
        kf2.l(this.q, "unknown priority: ");
        return null;
    L29:
        r16 = eq3.n;
        goto L17
    L13:
        r19 = r13;
        goto L15
    L36:
        kf2.o("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        return null;
    L5:
        r18 = null;
        r14 = r27;
        goto L6
    }

    public vz3 I() {
        vz3 r2 = (vz3) super.c();
        r2.M = r2.M.a();
        if (r2.O == null) goto L5;
        r2.O = new ArrayList(r2.O);
    L5:
        vz3 r0 = r2.P;
        if (r0 == null) goto L8;
        r2.P = r0.I();
    L8:
        vz3 r1 = r2.Q;
        if (r1 == null) goto L11;
        r2.Q = r1.I();
    L11:
        return r2;
    }

    public final void J(wq4 r12, yz3 r13, lq r14, Executor r15) {
        h12.e(r12);
        if (this.S == false) goto L29;
        pz3 r1 = H(new Object(), r12, r13, null, this.M, r14.q, r14.v, r14.u, r14, r15);
        pz3 r3 = r12.l();
        if (r1.e(r3) == true) goto L7;
    L15:
        this.J.q(r12);
        r12.e(r1);
        c04 r4 = this.J;
        monitor-enter(r4);
        r4.s.n.add(r12);     // Catch: Throwable -> L26
        mf4 r0 = r4.q;     // Catch: Throwable -> L26
        ((Set) r0.p).add(r1);     // Catch: Throwable -> L26
        if (r0.o == true) goto L20;
        r1.k();     // Catch: Throwable -> L26
    L24:
        monitor-exit(r4);
        return;
    L20:
        r1.clear();     // Catch: Throwable -> L26
        if (Log.isLoggable("RequestTracker", 2) == false) goto L23;
        Log.v("RequestTracker", "Paused, delaying request");     // Catch: Throwable -> L26
    L23:
        ((HashSet) r0.q).add(r1);     // Catch: Throwable -> L26
    L26:
        th = move-exception;
        throw th;
    L7:
        if (r14.t == false) goto L9;
    L11:
        h12.f(r3, "Argument must not be null");
        if (r3.isRunning() == true) goto L32;
        r3.k();
        return;
    L32:
        return;
    L9:
        if (r3.d() == false) goto L11;
    L29:
        kf2.n("You must call #load() before calling #into()");
    }

    public final void K(ImageView r4) {
        e35.m();
        h12.e(r4);
        if (lq.j(this.n, 2048) == false) goto L5;
        lq r0 = this;
    L14:
        this.L.c.getClass();
        Class r2 = this.K;
        if (Bitmap.class.equals(r2) == false) goto L18;
        wq4 r1 = new ws(r4, 0);
    L20:
        J(r1, null, r0, fh0.g);
        return;
    L18:
        if (Drawable.class.isAssignableFrom(r2) == false) goto L22;
        r1 = new ws(r4, 1);
        goto L20
    L22:
        nz2.A(r2, ", try .as*(Class).transcode(ResourceTranscoder)", "Unhandled class: ");
        return;
    L5:
        if (r4.getScaleType() != null) goto L7;
        r0 = this;
        goto L14
    L7:
        switch(uz3.a[r4.getScaleType().ordinal()]) {
            case 1: goto L12;
            case 2: goto L11;
            case 3: goto L10;
            case 4: goto L10;
            case 5: goto L10;
            case 6: goto L9;
            default: goto L25;
        };
    L9:
        r0 = c().n();
        goto L14
    L10:
        r0 = c().o();
        goto L14
    L11:
        r0 = c().n();
        goto L14
    L12:
        r0 = c().m();
        goto L14
    L25:
        r0 = this;
        goto L14
    }

    public vz3 L(rj r2) {
        if (this.E == true) goto L5;
        this.O = null;
        return F(r2);
    L5:
        return I().L(r2);
    }

    public vz3 M(vk4 r1) {
        return Q(r1);
    }

    public vz3 N(Uri r6) {
        vz3 r0 = Q(r6);
        if (r6 != null) goto L5;
    L22:
        return r0;
    L5:
        if ("android.resource".equals(r6.getScheme()) == false) goto L22;
        Context r5 = this.I;
        vz3 r7 = (vz3) r0.z(r5.getTheme());
        ConcurrentHashMap r1 = ai.a;
        String r2 = r5.getPackageName();
        ConcurrentHashMap r3 = ai.a;
        f42 r4 = (f42) r3.get(r2);
        if (r4 != null) goto L21;
        PackageInfo r8 = r5.getPackageManager().getPackageInfo(r5.getPackageName(), 0);     // Catch: PackageManager.NameNotFoundException -> L11
    L13:
        if (r8 == null) goto L15;
        String r9 = String.valueOf(r8.versionCode);
    L16:
        s73 r10 = new s73(r9);
        f42 r11 = (f42) r3.putIfAbsent(r2, r10);
        if (r11 != null) goto L19;
        r4 = r10;
        goto L21
    L19:
        r4 = r11;
        goto L21
    L15:
        r9 = UUID.randomUUID().toString();
    L11:
        e = move-exception;
        Log.e("AppVersionSignature", "Cannot resolve info for" + r5.getPackageName(), e);
        r8 = null;
    L21:
        return (vz3) r7.w(new tc(r5.getResources().getConfiguration().uiMode & 48, r4));
    }

    public vz3 O(File r1) {
        return Q(r1);
    }

    public vz3 P(String r1) {
        return Q(r1);
    }

    public final vz3 Q(Object r2) {
        if (this.E == true) goto L5;
        this.N = r2;
        this.S = true;
        u();
        return this;
    L5:
        return I().Q(r2);
    }

    public final yz3 R(int r2, int r3) {
        yz3 r0 = new yz3(r2, r3);
        J(r0, r0, this, fh0.h);
        return r0;
    }

    public vz3 S(vz3 r2) {
        if (this.E == true) goto L5;
        this.P = r2;
        u();
        return this;
    L5:
        return I().S(r2);
    }

    public vz3 T(xv0 r2) {
        if (this.E == true) goto L5;
        this.M = r2;
        this.R = false;
        u();
        return this;
    L5:
        return I().T(r2);
    }

    @Override // defpackage.lq
    public /* bridge */ /* synthetic */ lq a(lq r1) {
        return G(r1);
    }

    @Override // defpackage.lq
    public /* bridge */ /* synthetic */ lq c() {
        return I();
    }

    @Override // defpackage.lq
    public /* bridge */ /* synthetic */ Object clone() {
        return I();
    }

    @Override // defpackage.lq
    public final boolean equals(Object r3) {
        if ((r3 instanceof vz3) == false) goto L24;
        vz3 r4 = (vz3) r3;
        if (super.equals(r4) == true) goto L7;
        return false;
    L7:
        if (Objects.equals(this.K, r4.K) == true) goto L9;
        return false;
    L9:
        if (this.M.equals(r4.M) == true) goto L11;
        return false;
    L11:
        if (Objects.equals(this.N, r4.N) == true) goto L13;
        return false;
    L13:
        if (Objects.equals(this.O, r4.O) == true) goto L15;
        return false;
    L15:
        if (Objects.equals(this.P, r4.P) == true) goto L17;
        return false;
    L17:
        if (Objects.equals(this.Q, r4.Q) == true) goto L19;
        return false;
    L19:
        if (this.R == r4.R) goto L21;
        return false;
    L21:
        if (this.S != r4.S) goto L34;
        return true;
    L34:
        return false;
    L24:
        return false;
    }

    @Override // defpackage.lq
    public final int hashCode() {
        int r0 = e35.F(e35.F(e35.F(e35.F(e35.F(e35.F(e35.F(super.hashCode(), this.K), this.M), this.N), this.O), this.P), this.Q), null);
        int r1 = e35.E(this.R ? 1 : 0, r0);
        return e35.E(this.S ? 1 : 0, r1);
    }
}
