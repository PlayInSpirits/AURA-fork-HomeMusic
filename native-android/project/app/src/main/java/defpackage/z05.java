package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.SparseArray;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.EOFException;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z05 implements aw1, g84 {
    public final /* synthetic */ int n;
    public Object o;
    public Object p;
    public Object q;

    public z05(int r2) {
        this.n = r2;
        switch(r2) {
            case 9: goto L6;
            default: goto L4;
        };
    L4:
        this.q = new xi4(15);
        return;
    L6:
        this.o = new AtomicReference(l93.c);
        this.p = new Object();
    }

    public static z84 e(Class r1, kx r2) {
        return (z84) r1.getConstructor(new Class[]{kx.class}).newInstance(new Object[]{r2});
    L4:
        e = move-exception;
        mj0.j("Downloader factory missing", e);
        return null;
    }

    @Override // defpackage.g84
    public void a(be3 r14) {
        ((iu4) this.p).getClass();
        String r0 = f35.a;
        iu4 r1 = (iu4) this.p;
        monitor-enter(r1);
        long r2 = r1.c;     // Catch: Throwable -> L8
        if (r2 == (-9223372036854775807L)) goto L10;
        long r3 = r2 + r1.b;     // Catch: Throwable -> L8
    L7:
        long r7 = r3;
        monitor-exit(r1);
        iu4 r4 = (iu4) this.p;
        monitor-enter(r4);
        long r5 = r4.b;     // Catch: Throwable -> L27
        monitor-exit(r4);
        if (r7 != (-9223372036854775807L)) goto L20;
        return;
    L20:
        if (r5 == (-9223372036854775807L)) goto L37;
        tb1 r6 = (tb1) this.o;
        if (r5 == r6.s) goto L25;
        sb1 r8 = r6.a();
        r8.r = r5;
        tb1 r9 = new tb1(r8);
        this.o = r9;
        ((wv4) this.q).g(r9);
    L25:
        int r10 = r14.a();
        ((wv4) this.q).e(r10, r14);
        ((wv4) this.q).a(r7, 1, r10, 0, null);
        return;
    L37:
        return;
    L27:
        th = move-exception;
        throw th;
    L10:
        r3 = r1.d();     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.g84
    public void b(iu4 r1, m51 r2, sy4 r3) {
        this.p = r1;
        r3.a();
        r3.b();
        wv4 r4 = r2.t(r3.d, 5);
        this.q = r4;
        r4.g((tb1) this.o);
    }

    @Override // defpackage.aw1
    public int c() {
        List r0 = (List) this.p;
        ByteBuffer r1 = vw.c((ByteBuffer) this.o);
        qj0 r8 = (qj0) this.q;
        if (r1 == null) goto L16;
        int r3 = r0.size();
        int r5 = 0;
    L6:
        if (r5 >= r3) goto L16;
        int r6 = ((wv1) r0.get(r5)).c(r1, r8);     // Catch: Throwable -> L13
        ByteBuffer r7 = (ByteBuffer) r1.position(0);
        if (r6 != (-1)) goto L11;
        r5 = r5 + 1;
        goto L6
    L11:
        return r6;
    L13:
        th = move-exception;
        ByteBuffer r2 = (ByteBuffer) r1.position(0);
        throw th;
    L16:
        return -1;
    }

    public du0 d(tt0 r25) {
        kx r5 = (kx) this.o;
        Uri r7 = r25.o;
        int r2 = f35.J(r7, r25.p);
        boolean r4 = true;
        if (r2 == 0) goto L36;
        if (r2 == 1) goto L36;
        if (r2 == 2) goto L36;
        if (r2 != 4) goto L34;
        rt0 r3 = r25.u;
        um2 r9 = new um2();
        xm2 r10 = new xm2();
        List r11 = Collections.EMPTY_LIST;
        gy3 r13 = gy3.r;
        zm2 r12 = new zm2();
        cn2 r20 = cn2.d;
        String r14 = r25.s;
        if (((Uri) r10.e) != null) goto L12;
    L15:
        rr2.w(r4);
        if (r7 != null) goto L18;
        um2 r1 = r9;
        bn2 r17 = null;
    L23:
        gn2 r15 = new gn2("", new wm2(r1), r17, new an2(r12), do2.K, r20);
        Executor r6 = (Executor) this.p;
        if (r3 == null) goto L27;
        long r0 = r3.n;
    L26:
        long r8 = r0;
        if (r3 == null) goto L31;
        long r16 = r3.o;
    L33:
        return new zq3(r15, r5, r6, r8, r16);
    L31:
        r16 = -1;
        goto L33
    L27:
        r0 = 0;
        goto L26
    L18:
        if (((UUID) r10.d) == null) goto L20;
        ym2 r18 = new ym2(r10);
        r1 = r9;
    L21:
        r17 = new bn2(r7, null, r18, null, r11, r14, r13, -9223372036854775807L);
        goto L23
    L20:
        r1 = r9;
        r18 = null;
        goto L21
    L12:
        if (((UUID) r10.d) != null) goto L15;
        r4 = false;
        goto L15
    L34:
        kf2.n(f34.f(r2, "Unsupported type: "));
        return null;
    L36:
        SparseArray r19 = (SparseArray) this.q;
        if (f35.l(r19, r2) == false) goto L67;
        z84 r21 = (z84) r19.get(r2);
    L40:
        um2 r22 = new um2();
        xm2 r23 = new xm2();
        List r24 = Collections.EMPTY_LIST;
        gy3 r110 = gy3.r;
        zm2 r26 = new zm2();
        cn2 r27 = cn2.d;
        List r111 = r25.q;
        if (r111 != null) goto L43;
    L45:
        List r112 = r24;
        String r113 = r25.s;
        if (((Uri) r23.e) != null) goto L48;
    L51:
        rr2.w(r4);
        if (r7 != null) goto L54;
        zm2 r28 = r26;
        bn2 r114 = null;
    L59:
        gn2 r115 = new gn2("", new wm2(r22), r114, new an2(r28), do2.K, r27);
        st0 r29 = r25.v;
        if (r29 == null) goto L62;
        lm1 r30 = (lm1) r21;
        r30.d = r29.n;
        r30.e = r29.o;
    L62:
        Executor r31 = (Executor) this.p;
        lm1 r32 = (lm1) r21;
        r32.getClass();
        return new mm1(r115, r32.b, r32.a, r31, r32.c, r32.d, r32.e);
    L54:
        if (((UUID) r23.d) == null) goto L56;
        ym2 r33 = new ym2(r23);
        r28 = r26;
    L57:
        r114 = new bn2(r7, null, r33, null, r112, r113, r110, -9223372036854775807L);
        goto L59
    L56:
        r28 = r26;
        r33 = null;
        goto L57
    L48:
        if (((UUID) r23.d) != null) goto L51;
        r4 = false;
        goto L51
    L43:
        if (r111.isEmpty() == true) goto L45;
        r24 = Collections.unmodifiableList(new ArrayList(r111));
        goto L45
    L67:
        r21 = m(r2, r5);     // Catch: ClassNotFoundException -> L64
    L64:
        e = move-exception;
        mj0.j(f34.f(r2, "Module missing for content type "), e);
        return null;
    }

    public boolean equals(Object r4) {
        switch(this.n) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        GenericDeclaration r0 = (GenericDeclaration) this.o;
        String r1 = (String) this.p;
        if (y05.a == false) goto L21;
        if (r4 != null) goto L10;
    L27:
        return false;
    L10:
        if (Proxy.isProxyClass(r4.getClass()) == false) goto L27;
        if ((Proxy.getInvocationHandler(r4) instanceof a15) == false) goto L27;
        z05 r5 = ((a15) Proxy.getInvocationHandler(r4)).a;
        if (r1.equals((String) r5.p) == false) goto L27;
        if (r0.equals((GenericDeclaration) r5.o) == false) goto L27;
        if (((gy3) this.q).equals((gy3) r5.q) == false) goto L27;
    L26:
        return true;
    L21:
        if ((r4 instanceof TypeVariable) == false) goto L27;
        TypeVariable r6 = (TypeVariable) r4;
        if (r1.equals(r6.getName()) == false) goto L27;
        if (r0.equals(r6.getGenericDeclaration()) == false) goto L27;
    L5:
        return super.equals(r4);
    }

    public Object f() {
        long r0 = te5.m();
        if (r0 == nt4.a) goto L5;
        kt4 r4 = (kt4) ((AtomicReference) this.o).get();
        int r1 = r4.a(r0);
        if (r1 >= 0) goto L9;
        return null;
    L9:
        return r4.c[r1];
    L5:
        return this.q;
    }

    public long g() {
        rk0 r2 = (rk0) this.q;
        if (r2 != null) goto L5;
        return -1;
    L5:
        return r2.q;
    }

    public void h(ci0 r8, Uri r9, Map r10, long r11, long r13, hr3 r15) {
        rk0 r1 = new rk0(r8, r11, r13);
        this.q = r1;
        if (((k51) this.p) == null) goto L5;
        return;
    L5:
        k51[] r12 = ((n51) this.o).e(r9, r10);
        int r14 = r12.length;
        vw1 r16 = yw1.o;
        uc5.f(r14, "expectedSize");
        uw1 r17 = new uw1(r14);
        boolean r18 = true;
        if (r12.length != 1) goto L8;
        this.p = r12[0];
    L42:
        ((k51) this.p).f(r15);
        return;
    L8:
        int r19 = r12.length;
        int r110 = 0;
    L9:
        if (r110 >= r19) goto L41;
        k51 r0 = r12[r110];
    L15:
        th = move-exception;
        if (((k51) this.p) == null) goto L29;
    L32:
        rr2.w(r18);
        r1.s = 0;
        throw th;
    L29:
        if (r1.q == r11) goto L32;
        r18 = false;
        goto L32
    L12:
        if (r0.c(r1) == false) goto L17;
        this.p = r0;     // Catch: Throwable -> L15 EOFException -> L34
        goto L35
    L14:
        r1.s = 0;
        goto L41
    L17:
        r17.d(r0.e());     // Catch: Throwable -> L15 EOFException -> L34
        if (((k51) this.p) == null) goto L21;
    L24:
        boolean r2 = true;
    L25:
        rr2.w(r2);
        r1.s = 0;
        r110 = r110 + 1;
        goto L9
    L21:
        if (r1.q == r11) goto L24;
    L23:
        r2 = false;
    L35:
        if (((k51) this.p) != null) goto L24;
        if (r1.q != r11) goto L23;
    L41:
        if (((k51) this.p) != null) goto L42;
        StringBuilder r111 = new StringBuilder("None of the available extractors (");
        r111.append(new uc0(", ").b(hw.P(new kf2(14), yw1.l(r12))));
        r111.append(") could read the stream.");
        String r20 = r111.toString();
        r9.getClass();
        throw new UnrecognizedInputFormatException(r20, r17.f());
    }

    public int hashCode() {
        switch(this.n) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        int r0 = ((GenericDeclaration) this.o).hashCode();
        return ((String) this.p).hashCode() ^ r0;
    L5:
        return super.hashCode();
    }

    @Override // defpackage.aw1
    public Bitmap i(BitmapFactory.Options r2) {
        return BitmapFactory.decodeStream(new uw(vw.c((ByteBuffer) this.o)), null, r2);
    }

    public boolean j() {
        if (((kl4) this.o).getValue() != this.q) goto L11;
        z05 r2 = (z05) this.p;
        if (r2 != null) goto L7;
        return false;
    L7:
        if (r2.j() == true) goto L14;
        return false;
    L14:
        return true;
    L11:
        return true;
    }

    @Override // defpackage.aw1
    public void k() {
    }

    @Override // defpackage.aw1
    public ImageHeaderParser$ImageType l() {
        return kb4.C((List) this.p, vw.c((ByteBuffer) this.o));
    }

    public z84 m(int r3, kx r4) {
        if (r3 != 0) goto L5;
        z84 r5 = e(Class.forName("androidx.media3.exoplayer.dash.offline.DashDownloader$Factory").asSubclass(z84.class), r4);
    L13:
        ((SparseArray) this.q).put(r3, r5);
        return r5;
    L5:
        if (r3 != 1) goto L7;
        r5 = e(Class.forName("androidx.media3.exoplayer.smoothstreaming.offline.SsDownloader$Factory").asSubclass(z84.class), r4);
        goto L13
    L7:
        if (r3 != 2) goto L9;
        r5 = e(lm1.class.asSubclass(z84.class), r4);
        goto L13
    L9:
        kf2.n(f34.f(r3, "Unsupported type: "));
        return null;
    }

    public void n(Object r6) {
        long r0 = te5.m();
        if (r0 != nt4.a) goto L6;
        this.q = r6;
        return;
    L6:
        Object r2 = this.p;
        monitor-enter(r2);
        kt4 r3 = (kt4) ((AtomicReference) this.o).get();     // Catch: Throwable -> L13
        int r4 = r3.a(r0);     // Catch: Throwable -> L13
        if (r4 >= 0) goto L15;
        ((AtomicReference) this.o).set(r3.b(r0, r6));     // Catch: Throwable -> L13
        monitor-exit(r2);
        return;
    L15:
        r3.c[r4] = r6;     // Catch: Throwable -> L13
        monitor-exit(r2);
        return;
    L13:
        th = move-exception;
        throw th;
    }

    public String toString() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return (String) this.p;
    }

    public /* synthetic */ z05(Object r1, Object r2, Object r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }

    public z05(String r3) {
        this.n = 8;
        sb1 r0 = new sb1();
        r0.l = lw2.m("video/mp2t");
        r0.m = lw2.m(r3);
        this.o = new tb1(r0);
    }

    public z05(n51 r2) {
        this.n = 2;
        this.o = r2;
    }

    public z05(kx r2, Executor r3) {
        this.n = 3;
        this.o = r2;
        r3.getClass();
        this.p = r3;
        this.q = new SparseArray();
    }

    public z05(n05 r2, z05 r3) {
        this.n = 10;
        this.o = r2;
        this.p = r3;
        this.q = r2.n;
    }

    public z05(GenericDeclaration r2, String r3, Type[] r4) {
        this.n = 0;
        b15.b(r4, "bound for type variable");
        r2.getClass();
        this.o = r2;
        r3.getClass();
        this.p = r3;
        this.q = yw1.l(r4);
    }

    public z05(i11 r2, cf4 r3, m11 r4) {
        this.n = 4;
        this.q = r2;
        this.p = r3;
        this.o = r4;
    }

    public z05(im2 r2) {
        this.n = 7;
        this.q = r2;
        this.o = new dj2(this);
    }
}
