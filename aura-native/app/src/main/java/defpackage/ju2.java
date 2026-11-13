package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.SparseBooleanArray;
import androidx.media3.common.PlaybackException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class ju2 {
    public static final hd5 a = new hd5("androidx.media3.session.MediaLibraryService", (Bundle) null);

    public static boolean a(za4 za4Var, za4 za4Var2) {
        pi3 pi3Var = za4Var.a;
        int i = pi3Var.b;
        pi3 pi3Var2 = za4Var2.a;
        return i == pi3Var2.b && pi3Var.e == pi3Var2.e && pi3Var.h == pi3Var2.h && pi3Var.i == pi3Var2.i;
    }

    public static int b(long j, long j2) {
        if (j == -9223372036854775807L || j2 == -9223372036854775807L) {
            return 0;
        }
        if (j2 == 0) {
            return 100;
        }
        return f35.j(f35.V(j, j2), 0, 100);
    }

    public static long c(lk3 lk3Var, long j, long j2, long j3) {
        za4 za4Var = lk3Var.c;
        za4 za4Var2 = lk3Var.c;
        boolean z = za4Var.equals(za4.l) || j2 < za4Var2.c;
        if (lk3Var.x) {
            if (z || j == -9223372036854775807L) {
                if (j3 == -9223372036854775807L) {
                    j3 = SystemClock.elapsedRealtime() - za4Var2.c;
                }
                long j4 = za4Var2.a.f + ((long) (j3 * lk3Var.g.a));
                long j5 = za4Var2.d;
                return j5 != -9223372036854775807L ? Math.min(j4, j5) : j4;
            }
        } else if (z || j == -9223372036854775807L) {
            return za4Var2.a.f;
        }
        return j;
    }

    public static mi3 d(mi3 mi3Var, mi3 mi3Var2) {
        if (mi3Var != null) {
            w71 w71Var = mi3Var.a;
            if (mi3Var2 != null) {
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i = 0; i < w71Var.a.size(); i++) {
                    if (mi3Var2.a(w71Var.b(i))) {
                        int b = w71Var.b(i);
                        rr2.w(!false);
                        sparseBooleanArray.append(b, true);
                    }
                }
                rr2.w(!false);
                return new mi3(new w71(sparseBooleanArray));
            }
        }
        return mi3.b;
    }

    public static lk3 e(lk3 lk3Var, lk3 lk3Var2, jk3 jk3Var, mi3 mi3Var, boolean z, cb4 cb4Var) {
        lk3 lk3Var3;
        jw4 jw4Var;
        boolean z2;
        if (jk3Var.a && mi3Var.a(17)) {
            cu4 cu4Var = lk3Var.j;
            boolean z3 = cu4Var.p() || lk3Var2.c.a.b < cu4Var.o();
            String str = "Invalid PlayerInfo update, old index: " + lk3Var.c.a.b + " (count=" + cu4Var.o() + "), new index = " + lk3Var2.c.a.b + ", sent from " + cb4Var.a.g() + ", interface version=" + cb4Var.a.f();
            if (!z3) {
                kf2.o(str);
                return null;
            }
            lk3Var3 = lk3Var2.l(cu4Var);
        } else {
            lk3Var3 = lk3Var2;
        }
        if (jk3Var.b && mi3Var.a(30)) {
            lk3Var3 = lk3Var3.b(lk3Var.F);
        }
        if (!z || lk3Var2.n != 0.0f) {
            return lk3Var3;
        }
        float f = lk3Var.o;
        PlaybackException playbackException = lk3Var3.a;
        int i = lk3Var3.b;
        za4 za4Var = lk3Var3.c;
        pi3 pi3Var = lk3Var3.d;
        pi3 pi3Var2 = lk3Var3.e;
        int i2 = lk3Var3.f;
        qh3 qh3Var = lk3Var3.g;
        int i3 = lk3Var3.h;
        boolean z4 = lk3Var3.i;
        cu4 cu4Var2 = lk3Var3.j;
        int i4 = lk3Var3.k;
        s55 s55Var = lk3Var3.l;
        do2 do2Var = lk3Var3.m;
        float f2 = lk3Var3.n;
        int i5 = lk3Var3.p;
        il ilVar = lk3Var3.q;
        jg0 jg0Var = lk3Var3.r;
        hp0 hp0Var = lk3Var3.s;
        int i6 = lk3Var3.t;
        boolean z5 = lk3Var3.u;
        boolean z6 = lk3Var3.v;
        int i7 = lk3Var3.w;
        boolean z7 = lk3Var3.x;
        boolean z8 = lk3Var3.y;
        int i8 = lk3Var3.z;
        int i9 = lk3Var3.A;
        do2 do2Var2 = lk3Var3.B;
        long j = lk3Var3.C;
        long j2 = lk3Var3.D;
        long j3 = lk3Var3.E;
        jw4 jw4Var2 = lk3Var3.F;
        cw4 cw4Var = lk3Var3.G;
        if (cu4Var2.p()) {
            jw4Var = jw4Var2;
        } else {
            jw4Var = jw4Var2;
            if (za4Var.a.b >= cu4Var2.o()) {
                z2 = false;
                rr2.w(z2);
                return new lk3(playbackException, i, za4Var, pi3Var, pi3Var2, i2, qh3Var, i3, z4, s55Var, cu4Var2, i4, do2Var, f2, f, ilVar, i5, jg0Var, hp0Var, i6, z5, z6, i7, i8, i9, z7, z8, do2Var2, j, j2, j3, jw4Var, cw4Var);
            }
        }
        z2 = true;
        rr2.w(z2);
        return new lk3(playbackException, i, za4Var, pi3Var, pi3Var2, i2, qh3Var, i3, z4, s55Var, cu4Var2, i4, do2Var, f2, f, ilVar, i5, jg0Var, hp0Var, i6, z5, z6, i7, i8, i9, z7, z8, do2Var2, j, j2, j3, jw4Var, cw4Var);
    }

    public static void f(qi3 qi3Var, gr2 gr2Var) {
        int i = gr2Var.b;
        long j = gr2Var.c;
        yw1 yw1Var = gr2Var.a;
        if (i == -1) {
            if (qi3Var.S0(20)) {
                qi3Var.L0(yw1Var);
                return;
            } else {
                if (yw1Var.isEmpty()) {
                    return;
                }
                qi3Var.B0((gn2) yw1Var.get(0));
                return;
            }
        }
        if (qi3Var.S0(20)) {
            qi3Var.T(yw1Var, gr2Var.b, j);
        } else {
            if (yw1Var.isEmpty()) {
                return;
            }
            qi3Var.p((gn2) yw1Var.get(0), j);
        }
    }

    public static ArrayList g(List list) {
        ArrayList arrayList = new ArrayList();
        Parcel obtain = Parcel.obtain();
        for (int i = 0; i < list.size(); i++) {
            try {
                Parcelable parcelable = (Parcelable) list.get(i);
                obtain.writeParcelable(parcelable, 0);
                if (obtain.dataSize() >= 262144) {
                    break;
                }
                arrayList.add(parcelable);
            } finally {
                obtain.recycle();
            }
        }
        return arrayList;
    }
}
