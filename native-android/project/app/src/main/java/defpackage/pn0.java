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
    public static final gb3 k = new s60(new n7(4));
    public dw4 a;
    public cp b;
    public final Object c = new Object();
    public final Context d;
    public final s41 e;
    public jn0 f;
    public Thread g;
    public ll h;
    public il i;
    public Boolean j;

    public pn0(cw4 cw4Var, s41 s41Var, MediaService mediaService) {
        this.d = mediaService != null ? mediaService.getApplicationContext() : null;
        this.e = s41Var;
        if (cw4Var instanceof jn0) {
            this.f = (jn0) cw4Var;
        } else {
            jn0 jn0Var = jn0.F0;
            jn0Var.getClass();
            in0 in0Var = new in0(jn0Var);
            in0Var.e(cw4Var);
            this.f = new jn0(in0Var);
        }
        this.i = il.i;
        if (this.f.A0 && mediaService == null) {
            l93.q0("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int a(tb1 tb1Var, yw1 yw1Var) {
        for (int i = 0; i < yw1Var.size(); i++) {
            for (int i2 = 0; i2 < tb1Var.c.size(); i2++) {
                if (((o42) tb1Var.c.get(i2)).b.equals(yw1Var.get(i))) {
                    return i;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void b(tv4 tv4Var, jn0 jn0Var, HashMap map) {
        for (int i = 0; i < tv4Var.a; i++) {
            yv4 yv4Var = (yv4) jn0Var.H.get(tv4Var.a(i));
            if (yv4Var != null) {
                sv4 sv4Var = yv4Var.a;
                yv4 yv4Var2 = (yv4) map.get(Integer.valueOf(sv4Var.c));
                if (yv4Var2 == null || (yv4Var2.b.isEmpty() && !yv4Var.b.isEmpty())) {
                    map.put(Integer.valueOf(sv4Var.c), yv4Var);
                }
            }
        }
    }

    public static int c(tb1 tb1Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(tb1Var.d)) {
            return 4;
        }
        String strF = f(str);
        String strF2 = f(tb1Var.d);
        if (strF2 == null || strF == null) {
            return (z && strF2 == null) ? 1 : 0;
        }
        if (strF2.startsWith(strF) || strF.startsWith(strF2)) {
            return 3;
        }
        String str2 = f35.a;
        return strF2.split("-", 2)[0].equals(strF.split("-", 2)[0]) ? 2 : 0;
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean h(jn0 jn0Var, int i, tb1 tb1Var) {
        if ((i & 3584) == 0) {
            return false;
        }
        aw4 aw4Var = jn0Var.w;
        if (aw4Var.c && (i & 2048) == 0) {
            return false;
        }
        if (aw4Var.b) {
            boolean z = (tb1Var.I == 0 && tb1Var.J == 0) ? false : true;
            boolean z2 = (i & 1024) != 0;
            if (z && !z2) {
                return false;
            }
        }
        return true;
    }

    public static Pair i(int i, gg2 gg2Var, int[][][] iArr, mn0 mn0Var, Comparator comparator) {
        int i2;
        RandomAccess randomAccessO;
        gg2 gg2Var2 = gg2Var;
        ArrayList arrayList = new ArrayList();
        int i3 = gg2Var2.a;
        int i4 = 0;
        while (i4 < i3) {
            if (i == gg2Var2.b[i4]) {
                tv4 tv4Var = gg2Var2.c[i4];
                for (int i5 = 0; i5 < tv4Var.a; i5++) {
                    sv4 sv4VarA = tv4Var.a(i5);
                    gy3 gy3VarG = mn0Var.g(i4, sv4VarA, iArr[i4][i5]);
                    int i6 = sv4VarA.a;
                    boolean[] zArr = new boolean[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        nn0 nn0Var = (nn0) gy3VarG.get(i7);
                        int iA = nn0Var.a();
                        if (zArr[i7] || iA == 0) {
                            i2 = i3;
                        } else {
                            if (iA == 1) {
                                randomAccessO = yw1.o(nn0Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(nn0Var);
                                int i8 = i7 + 1;
                                while (i8 < i6) {
                                    nn0 nn0Var2 = (nn0) gy3VarG.get(i8);
                                    int i9 = i3;
                                    if (nn0Var2.a() == 2 && nn0Var.b(nn0Var2)) {
                                        arrayList2.add(nn0Var2);
                                        zArr[i8] = true;
                                    }
                                    i8++;
                                    i3 = i9;
                                }
                                randomAccessO = arrayList2;
                            }
                            i2 = i3;
                            arrayList.add(randomAccessO);
                        }
                        i7++;
                        i3 = i2;
                    }
                }
            }
            i4++;
            gg2Var2 = gg2Var;
            i3 = i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((nn0) list.get(i10)).p;
        }
        nn0 nn0Var3 = (nn0) list.get(0);
        return Pair.create(new r41(nn0Var3.o, iArr2), Integer.valueOf(nn0Var3.n));
    }

    public final jn0 d() {
        jn0 jn0Var;
        synchronized (this.c) {
            jn0Var = this.f;
        }
        return jn0Var;
    }

    public final void e() {
        boolean z;
        dw4 dw4Var;
        ll llVar;
        synchronized (this.c) {
            try {
                z = this.f.A0 && Build.VERSION.SDK_INT >= 32 && (llVar = this.h) != null && llVar.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (dw4Var = this.a) == null) {
            return;
        }
        dw4Var.c();
    }

    public final void g() {
        ll llVar;
        kn0 kn0Var;
        synchronized (this.c) {
            try {
                Thread thread = this.g;
                if (thread != null) {
                    rr2.v("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (llVar = this.h) != null) {
            Handler handler = (Handler) llVar.q;
            Spatializer spatializer = (Spatializer) llVar.p;
            if (spatializer != null && (kn0Var = (kn0) llVar.r) != null && handler != null) {
                spatializer.removeOnSpatializerStateChangedListener(kn0Var);
                handler.removeCallbacksAndMessages(null);
            }
            this.h = null;
        }
        this.a = null;
        this.b = null;
    }

    public final void j(cw4 cw4Var) {
        if (cw4Var instanceof jn0) {
            k((jn0) cw4Var);
        }
        in0 in0Var = new in0(d());
        in0Var.e(cw4Var);
        k(new jn0(in0Var));
    }

    public final void k(jn0 jn0Var) {
        boolean zEquals;
        synchronized (this.c) {
            zEquals = this.f.equals(jn0Var);
            this.f = jn0Var;
        }
        if (zEquals) {
            return;
        }
        if (jn0Var.A0 && this.d == null) {
            l93.q0("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        dw4 dw4Var = this.a;
        if (dw4Var != null) {
            dw4Var.c();
        }
    }
}
