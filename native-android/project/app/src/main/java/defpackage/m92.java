package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m92 {
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public final int a;
    public final long b;
    public final Object c;
    public final int d;
    public final jn2 e;
    public final xa4 f;

    static {
        String str = f35.a;
        g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
        l = Integer.toString(5, 36);
    }

    public m92(int i2, long j2, jn2 jn2Var, xa4 xa4Var, Object obj, int i3) {
        this.a = i2;
        this.b = j2;
        this.e = jn2Var;
        this.f = xa4Var;
        this.c = obj;
        this.d = i3;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0068 A[LOOP:0: B:28:0x0062->B:30:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    public static m92 a(Bundle bundle) {
        xa4 xa4Var;
        xa4 xa4Var2;
        int i2;
        String str;
        Bundle bundle2;
        IBinder binder;
        yw1 yw1VarA;
        uw1 uw1VarJ;
        int i3 = bundle.getInt(g, 0);
        long j2 = bundle.getLong(h, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(i);
        Object objB = null;
        jn2 jn2VarA = bundle3 == null ? null : jn2.a(bundle3);
        Bundle bundle4 = bundle.getBundle(l);
        if (bundle4 == null) {
            if (i3 != 0) {
                xa4Var2 = new xa4(i3, "no error message provided");
            } else {
                xa4Var = null;
            }
            i2 = bundle.getInt(k);
            if (i2 != 1) {
                str = j;
                if (i2 != 2) {
                    bundle2 = bundle.getBundle(str);
                    if (bundle2 != null) {
                        objB = gn2.b(bundle2);
                    }
                } else if (i2 != 3) {
                    binder = bundle.getBinder(str);
                    if (binder != null) {
                        yw1VarA = iw.a(binder);
                        uw1VarJ = yw1.j();
                        for (int i4 = 0; i4 < yw1VarA.size(); i4++) {
                            Bundle bundle5 = (Bundle) yw1VarA.get(i4);
                            bundle5.getClass();
                            uw1VarJ.c(gn2.b(bundle5));
                        }
                        objB = uw1VarJ.f();
                    }
                } else if (i2 != 4) {
                    tb4.a();
                    return null;
                }
            }
            return new m92(i3, j2, jn2VarA, xa4Var, objB, i2);
        }
        xa4Var2 = xa4.a(bundle4);
        xa4Var = xa4Var2;
        i2 = bundle.getInt(k);
        if (i2 != 1) {
            str = j;
            if (i2 != 2) {
                bundle2 = bundle.getBundle(str);
                if (bundle2 != null) {
                    objB = gn2.b(bundle2);
                }
            } else if (i2 != 3) {
                binder = bundle.getBinder(str);
                if (binder != null) {
                    yw1VarA = iw.a(binder);
                    uw1VarJ = yw1.j();
                    while (i4 < yw1VarA.size()) {
                        Bundle bundle6 = (Bundle) yw1VarA.get(i4);
                        bundle6.getClass();
                        uw1VarJ.c(gn2.b(bundle6));
                    }
                    objB = uw1VarJ.f();
                }
            } else if (i2 != 4) {
                tb4.a();
                return null;
            }
        }
        return new m92(i3, j2, jn2VarA, xa4Var, objB, i2);
    }

    public static m92 b(int i2) {
        xa4 xa4Var = new xa4("no error message provided", i2, Bundle.EMPTY);
        return new m92(xa4Var.a, SystemClock.elapsedRealtime(), null, xa4Var, null, 4);
    }

    public static m92 c(gy3 gy3Var, jn2 jn2Var) {
        vw1 vw1VarListIterator = gy3Var.listIterator(0);
        while (vw1VarListIterator.hasNext()) {
            d((gn2) vw1VarListIterator.next());
        }
        return new m92(0, SystemClock.elapsedRealtime(), jn2Var, null, yw1.k(gy3Var), 3);
    }

    public static void d(gn2 gn2Var) {
        rr2.k("mediaId must not be empty", !TextUtils.isEmpty(gn2Var.a));
        do2 do2Var = gn2Var.d;
        rr2.k("mediaMetadata must specify isBrowsable", do2Var.q != null);
        rr2.k("mediaMetadata must specify isPlayable", do2Var.r != null);
    }
}
