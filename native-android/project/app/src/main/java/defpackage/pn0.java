package defpackage;

import android.content.Context;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import com.eddyizm.tempus.service.MediaService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pn0 {
    public static final gb3 k = null;
    public dw4 a;
    public cp b;
    public final Object c;
    public final Context d;
    public final s41 e;
    public jn0 f;
    public Thread g;
    public ll h;
    public il i;
    public Boolean j;

    static {
        k = new s60(new n7(4));
    }

    public pn0(cw4 r2, s41 r3, MediaService r4) {
        this.c = new Object();
        if (r4 == null) goto L5;
        Context r0 = r4.getApplicationContext();
    L6:
        this.d = r0;
        this.e = r3;
        if ((r2 instanceof jn0) == false) goto L9;
        this.f = (jn0) r2;
    L10:
        this.i = il.i;
        if (this.f.A0 == false) goto L15;
        if (r4 != null) goto L16;
        l93.q0("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        return;
    L16:
        return;
    L15:
        return;
    L9:
        jn0 r5 = jn0.F0;
        r5.getClass();
        in0 r1 = new in0(r5);
        r1.e(r2);
        this.f = new jn0(r1);
        goto L10
    L5:
        r0 = null;
        goto L6
    }

    public static int a(tb1 r5, yw1 r6) {
        int r1 = 0;
    L4:
        if (r1 >= r6.size()) goto L13;
        int r2 = 0;
    L7:
        if (r2 >= r5.c.size()) goto L12;
        if (((o42) r5.c.get(r2)).b.equals(r6.get(r1)) == true) goto L10;
        r2 = r2 + 1;
        goto L7
    L10:
        return r1;
    L12:
        r1 = r1 + 1;
        goto L4
    L13:
        return Integer.MAX_VALUE;
    }

    public static void b(tv4 r4, jn0 r5, HashMap r6) {
        int r0 = 0;
    L4:
        if (r0 >= r4.a) goto L16;
        sv4 r1 = r4.a(r0);
        yv4 r2 = (yv4) r5.H.get(r1);
        if (r2 == null) goto L15;
        sv4 r3 = r2.a;
        yv4 r7 = (yv4) r6.get(Integer.valueOf(r3.c));
        if (r7 != null) goto L11;
    L14:
        r6.put(Integer.valueOf(r3.c), r2);
        goto L15
    L11:
        if (r7.b.isEmpty() == false) goto L15;
        if (r2.b.isEmpty() == false) goto L14;
    L15:
        r0 = r0 + 1;
        goto L4
    }

    public static int c(tb1 r2, String r3, boolean r4) {
        if (TextUtils.isEmpty(r3) == false) goto L5;
    L8:
        String r5 = f(r3);
        String r6 = f(r2.d);
        if (r6 == null) goto L23;
        if (r5 == null) goto L23;
        if (r6.startsWith(r5) == false) goto L15;
        return 3;
    L15:
        if (r5.startsWith(r6) == true) goto L28;
        String r7 = f35.a;
        if (r6.split("-", 2)[0].equals(r5.split("-", 2)[0]) == false) goto L20;
        return 2;
    L20:
        return 0;
    L28:
        return 3;
    L23:
        if (r4 == false) goto L27;
        if (r6 != null) goto L27;
        return 1;
    L27:
        return 0;
    L5:
        if (r3.equals(r2.d) == false) goto L8;
        return 4;
    }

    public static String f(String r1) {
        if (TextUtils.isEmpty(r1) == false) goto L5;
        return null;
    L5:
        if (TextUtils.equals(r1, "und") == true) goto L10;
        return r1;
    L10:
        return null;
    }

    public static boolean h(jn0 r2, int r3, tb1 r4) {
        if ((r3 & 3584) != 0) goto L5;
        return false;
    L5:
        aw4 r5 = r2.w;
        if (r5.c == false) goto L11;
        if ((r3 & 2048) != 0) goto L11;
        return false;
    L11:
        if (r5.b == true) goto L13;
    L27:
        return true;
    L13:
        if (r4.I == 0) goto L15;
    L18:
        boolean r6 = true;
    L20:
        if ((r3 & 1024) == 0) goto L22;
        boolean r7 = true;
    L23:
        if (r6 == false) goto L27;
        if (r7 == true) goto L27;
        return false;
    L22:
        r7 = false;
        goto L23
    L15:
        if (r4.J != 0) goto L18;
        r6 = false;
        goto L20
    }

    public static Pair i(int r18, gg2 r19, int[][][] r20, mn0 r21, Comparator r22) {
        gg2 r0 = r19;
        ArrayList r1 = new ArrayList();
        int r2 = r0.a;
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L33;
        if (r18 != r0.b[r4]) goto L31;
        tv4 r5 = r0.c[r4];
        int r7 = 0;
    L8:
        if (r7 >= r5.a) goto L31;
        sv4 r8 = r5.a(r7);
        gy3 r9 = r21.g(r4, r8, r20[r4][r7]);
        int r10 = r8.a;
        boolean[] r11 = new boolean[r10];
        int r12 = 0;
    L10:
        if (r12 >= r10) goto L30;
        nn0 r13 = (nn0) r9.get(r12);
        int r14 = r13.a();
        if (r11[r12] == true) goto L14;
        if (r14 == 0) goto L14;
        if (r14 != 1) goto L19;
        RandomAccess r15 = yw1.o(r13);
    L18:
        int r16 = r2;
        r1.add(r15);
    L29:
        r12 = r12 + 1;
        r2 = r16;
        goto L10
    L19:
        ArrayList r17 = new ArrayList();
        r17.add(r13);
        int r110 = r12 + 1;
    L20:
        if (r110 >= r10) goto L27;
        nn0 r3 = (nn0) r9.get(r110);
        int r111 = r2;
        if (r3.a() != 2) goto L26;
        if (r13.b(r3) == false) goto L26;
        r17.add(r3);
        r11[r110] = true;
    L26:
        r110 = r110 + 1;
        r2 = r111;
        goto L20
    L27:
        r15 = r17;
    L14:
        r16 = r2;
        goto L29
    L30:
        r7 = r7 + 1;
    L31:
        r4 = r4 + 1;
        r0 = r19;
        r2 = r2;
        goto L3
    L33:
        if (r1.isEmpty() == false) goto L36;
        return null;
    L36:
        List r6 = (List) Collections.max(r1, r22);
        int[] r23 = new int[r6.size()];
        int r24 = 0;
    L38:
        if (r24 >= r6.size()) goto L40;
        r23[r24] = ((nn0) r6.get(r24)).p;
        r24 = r24 + 1;
        goto L38
    L40:
        nn0 r25 = (nn0) r6.get(0);
        return Pair.create(new r41(r25.o, r23), Integer.valueOf(r25.n));
    }

    public final jn0 d() {
        Object r0 = this.c;
        monitor-enter(r0);
        jn0 r1 = this.f;     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public final void e() {
        Object r0 = this.c;
        monitor-enter(r0);
    L13:
        th = move-exception;
        throw th;
    L5:
        if (this.f.A0 == true) goto L7;
    L15:
        boolean r1 = false;
    L16:
        monitor-exit(r0);     // Catch: Throwable -> L13
        if (r1 == false) goto L26;
        dw4 r3 = this.a;
        if (r3 == null) goto L27;
        r3.c();
        return;
    L27:
        return;
    L26:
        return;
    L7:
        if (Build.VERSION.SDK_INT < 32) goto L15;
        ll r2 = this.h;     // Catch: Throwable -> L13
        if (r2 == null) goto L15;
        if (r2.o == false) goto L15;
        r1 = true;
        goto L16
    }

    public final void g() {
        Object r0 = this.c;
        monitor-enter(r0);
        Thread r1 = this.g;     // Catch: Throwable -> L11
        if (r1 != null) goto L7;
    L13:
        monitor-exit(r0);     // Catch: Throwable -> L11
        if (Build.VERSION.SDK_INT < 32) goto L26;
        ll r2 = this.h;
        if (r2 == null) goto L26;
        Handler r3 = (Handler) r2.q;
        Spatializer r4 = (Spatializer) r2.p;
        if (r4 == null) goto L25;
        kn0 r5 = (kn0) r2.r;
        if (r5 == null) goto L25;
        if (r3 == null) goto L25;
        m3.i(r4, r5);
        r3.removeCallbacksAndMessages(null);
    L25:
        this.h = null;
    L26:
        this.a = null;
        this.b = null;
        return;
    L7:
        if (r1 != Thread.currentThread()) goto L9;
        boolean r6 = true;
    L10:
        rr2.v("DefaultTrackSelector is accessed on the wrong thread.", r6);     // Catch: Throwable -> L11
        goto L13
    L9:
        r6 = false;
    L11:
        th = move-exception;
        throw th;
    }

    public final void j(cw4 r3) {
        if ((r3 instanceof jn0) == false) goto L5;
        k((jn0) r3);
    L5:
        in0 r0 = new in0(d());
        r0.e(r3);
        k(new jn0(r0));
    }

    public final void k(jn0 r3) {
        Object r0 = this.c;
        monitor-enter(r0);
        boolean r1 = this.f.equals(r3);     // Catch: Throwable -> L16
        this.f = r3;     // Catch: Throwable -> L16
        monitor-exit(r0);     // Catch: Throwable -> L16
        if (r1 == false) goto L8;
        return;
    L8:
        if (r3.A0 == true) goto L10;
    L12:
        dw4 r2 = this.a;
        if (r2 == null) goto L22;
        r2.c();
        return;
    L22:
        return;
    L10:
        if (this.d != null) goto L12;
        l93.q0("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
    L16:
        th = move-exception;
        throw th;
    }
}
