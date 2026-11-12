package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.SparseBooleanArray;
import androidx.media3.common.PlaybackException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ju2 {
    public static final hd5 a = null;

    static {
        a = new hd5("androidx.media3.session.MediaLibraryService", null);
    }

    public static boolean a(za4 r2, za4 r3) {
        pi3 r4 = r2.a;
        int r0 = r4.b;
        pi3 r5 = r3.a;
        if (r0 == r5.b) goto L5;
        return false;
    L5:
        if (r4.e == r5.e) goto L7;
        return false;
    L7:
        if (r4.h == r5.h) goto L9;
        return false;
    L9:
        if (r4.i != r5.i) goto L16;
        return true;
    L16:
        return false;
    }

    public static int b(long r4, long r6) {
        if (r4 != (-9223372036854775807L)) goto L5;
    L12:
        return 0;
    L5:
        if (r6 == (-9223372036854775807L)) goto L12;
        if (r6 != 0) goto L11;
        return 100;
    L11:
        return f35.j(f35.V(r4, r6), 0, 100);
    }

    public static long c(lk3 r4, long r5, long r7, long r9) {
        za4 r0 = r4.c;
        za4 r1 = r4.c;
        if (r0.equals(za4.l) == false) goto L5;
    L8:
        boolean r8 = true;
    L10:
        if (r4.x == true) goto L16;
        if (r8 == true) goto L15;
        if (r5 == (-9223372036854775807L)) goto L15;
    L19:
        return r5;
    L15:
        return r1.a.f;
    L16:
        if (r8 == true) goto L21;
        if (r5 != (-9223372036854775807L)) goto L19;
    L21:
        if (r9 != (-9223372036854775807L)) goto L24;
        r9 = SystemClock.elapsedRealtime() - r1.c;
    L24:
        long r6 = r1.a.f + ((long) (r9 * r4.g.a));
        long r10 = r1.d;
        if (r10 != (-9223372036854775807L)) goto L27;
        return r6;
    L27:
        return Math.min(r6, r10);
    L5:
        if (r7 < r1.c) goto L8;
        r8 = false;
        goto L10
    }

    public static mi3 d(mi3 r6, mi3 r7) {
        if (r6 == null) goto L16;
        w71 r8 = r6.a;
        if (r7 == null) goto L16;
        SparseBooleanArray r0 = new SparseBooleanArray();
        int r2 = 0;
    L8:
        if (r2 >= r8.a.size()) goto L13;
        if (r7.a(r8.b(r2)) == false) goto L12;
        int r3 = r8.b(r2);
        rr2.w(!false);
        r0.append(r3, true);
    L12:
        r2 = r2 + 1;
        goto L8
    L13:
        rr2.w(!false);
        return new mi3(new w71(r0));
    L16:
        return mi3.b;
    }

    public static lk3 e(lk3 r45, lk3 r46, jk3 r47, mi3 r48, boolean r49, cb4 r50) {
        if (r47.a == true) goto L5;
    L18:
        lk3 r4 = r46;
    L20:
        if (r47.b == true) goto L22;
    L24:
        if (r49 == true) goto L26;
    L37:
        return r4;
    L26:
        if (r46.n != 0.0f) goto L37;
        float r0 = r45.o;
        PlaybackException r9 = r4.a;
        int r10 = r4.b;
        za4 r11 = r4.c;
        pi3 r12 = r4.d;
        pi3 r13 = r4.e;
        int r14 = r4.f;
        qh3 r15 = r4.g;
        int r1 = r4.h;
        boolean r2 = r4.i;
        cu4 r3 = r4.j;
        int r5 = r4.k;
        s55 r8 = r4.l;
        do2 r6 = r4.m;
        float r7 = r4.n;
        int r16 = r4.p;
        il r17 = r4.q;
        jg0 r18 = r4.r;
        hp0 r19 = r4.s;
        int r20 = r4.t;
        boolean r21 = r4.u;
        boolean r22 = r4.v;
        int r23 = r4.w;
        boolean r24 = r4.x;
        boolean r25 = r4.y;
        int r26 = r4.z;
        int r27 = r4.A;
        do2 r28 = r4.B;
        long r29 = r4.C;
        long r30 = r4.D;
        long r31 = r4.E;
        jw4 r32 = r4.F;
        cw4 r33 = r4.G;
        if (r3.p() == true) goto L33;
        jw4 r43 = r32;
        if (r11.a.b < r3.o()) goto L34;
        boolean r110 = false;
    L35:
        rr2.w(r110);
        return new lk3(r9, r10, r11, r12, r13, r14, r15, r1, r2, r8, r3, r5, r6, r7, r0, r17, r16, r18, r19, r20, r21, r22, r23, r26, r27, r24, r25, r28, r29, r30, r31, r43, r33);
    L34:
        r110 = true;
        goto L35
    L33:
        r43 = r32;
        goto L34
    L22:
        if (r48.a(30) == false) goto L24;
        r4 = r4.b(r45.F);
        goto L24
    L5:
        if (r48.a(17) == false) goto L18;
        cu4 r34 = r45.j;
        if (r34.p() == false) goto L9;
    L12:
        boolean r35 = true;
    L13:
        String r36 = "Invalid PlayerInfo update, old index: " + r45.c.a.b + " (count=" + r34.o() + "), new index = " + r46.c.a.b + ", sent from " + r50.a.g() + ", interface version=" + r50.a.f();
        if (r35 == false) goto L16;
        r4 = r46.l(r34);
        goto L20
    L16:
        kf2.o(r36);
        return null;
    L9:
        if (r46.c.a.b < r34.o()) goto L12;
        r35 = false;
        goto L13
    }

    public static void f(qi3 r7, gr2 r8) {
        int r0 = r8.b;
        long r1 = r8.c;
        yw1 r3 = r8.a;
        if (r0 != (-1)) goto L13;
        if (r7.S0(20) == false) goto L9;
        r7.L0(r3);
        return;
    L9:
        if (r3.isEmpty() == true) goto L20;
        r7.B0((gn2) r3.get(0));
        return;
    L20:
        return;
    L13:
        if (r7.S0(20) == false) goto L17;
        r7.T(r3, r8.b, r1);
        return;
    L17:
        if (r3.isEmpty() == true) goto L21;
        r7.p((gn2) r3.get(0), r1);
        return;
    }

    public static ArrayList g(List r7) {
        ArrayList r0 = new ArrayList();
        Parcel r1 = Parcel.obtain();
        int r3 = 0;
    L15:
    L9:
        th = move-exception;
        r1.recycle();
        throw th;
    L4:
        if (r3 >= r7.size()) goto L11;
        Parcelable r4 = (Parcelable) r7.get(r3);     // Catch: Throwable -> L9
        r1.writeParcelable(r4, 0);     // Catch: Throwable -> L9
        if (r1.dataSize() >= 262144) goto L11;
        r0.add(r4);     // Catch: Throwable -> L9
        r3 = r3 + 1;
    L11:
        r1.recycle();
        return r0;
    }
}
