package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sv4 {
    public static final String f;
    public static final String g;
    public final int a;
    public final String b;
    public final int c;
    public final tb1[] d;
    public int e;

    static {
        String str = f35.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
    }

    public sv4(String str, tb1... tb1VarArr) {
        rr2.l(tb1VarArr.length > 0);
        this.b = str;
        this.d = tb1VarArr;
        this.a = tb1VarArr.length;
        String str2 = tb1VarArr[0].n;
        this.c = TextUtils.isEmpty(str2) ? lw2.h(tb1VarArr[0].m) : lw2.h(str2);
        String str3 = tb1VarArr[0].d;
        str3 = (str3 == null || str3.equals("und")) ? "" : str3;
        int i = tb1VarArr[0].f | 16384;
        for (int i2 = 1; i2 < tb1VarArr.length; i2++) {
            String str4 = tb1VarArr[i2].d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : str4)) {
                c("languages", tb1VarArr[0].d, tb1VarArr[i2].d, i2);
                return;
            } else {
                if (i != (tb1VarArr[i2].f | 16384)) {
                    c("role flags", Integer.toBinaryString(tb1VarArr[0].f), Integer.toBinaryString(tb1VarArr[i2].f), i2);
                    return;
                }
            }
        }
    }

    public static sv4 a(Bundle bundle) {
        gy3 gy3VarF;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f);
        if (parcelableArrayList == null) {
            vw1 vw1Var = yw1.o;
            gy3VarF = gy3.r;
        } else {
            gy3VarF = hw.f(new tb4(9), parcelableArrayList);
        }
        return new sv4(bundle.getString(g, ""), (tb1[]) gy3VarF.toArray(new tb1[0]));
    }

    public static void c(String str, String str2, String str3, int i) {
        StringBuilder sbU = b11.u("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbU.append(str3);
        sbU.append("' (track ");
        sbU.append(i);
        sbU.append(")");
        l93.G("TrackGroup", "", new IllegalStateException(sbU.toString()));
    }

    public final int b(tb1 tb1Var) {
        int i = 0;
        while (true) {
            tb1[] tb1VarArr = this.d;
            if (i >= tb1VarArr.length) {
                return -1;
            }
            if (tb1Var == tb1VarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        tb1[] tb1VarArr = this.d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(tb1VarArr.length);
        int length = tb1VarArr.length;
        int i = 0;
        while (i < length) {
            tb1 tb1Var = tb1VarArr[i];
            List list = tb1Var.q;
            Bundle bundle2 = new Bundle();
            bundle2.putString(tb1.R, tb1Var.a);
            bundle2.putString(tb1.S, tb1Var.b);
            String str = tb1.w0;
            yw1 yw1Var = tb1Var.c;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(yw1Var.size());
            int size = yw1Var.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = yw1Var.get(i2);
                i2++;
                o42 o42Var = (o42) obj;
                o42Var.getClass();
                Bundle bundle3 = new Bundle();
                tb1[] tb1VarArr2 = tb1VarArr;
                String str2 = o42Var.a;
                int i3 = length;
                if (str2 != null) {
                    bundle3.putString(o42.c, str2);
                }
                bundle3.putString(o42.d, o42Var.b);
                arrayList2.add(bundle3);
                tb1VarArr = tb1VarArr2;
                length = i3;
            }
            tb1[] tb1VarArr3 = tb1VarArr;
            int i4 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(tb1.T, tb1Var.d);
            bundle2.putInt(tb1.U, tb1Var.e);
            bundle2.putInt(tb1.V, tb1Var.f);
            int i5 = tb1Var.g;
            if (i5 != tb1.Q.g) {
                bundle2.putInt(tb1.x0, i5);
            }
            bundle2.putInt(tb1.W, tb1Var.h);
            bundle2.putInt(tb1.X, tb1Var.i);
            bundle2.putString(tb1.Y, tb1Var.k);
            bundle2.putString(tb1.Z, tb1Var.m);
            bundle2.putString(tb1.a0, tb1Var.n);
            bundle2.putInt(tb1.b0, tb1Var.o);
            for (int i6 = 0; i6 < list.size(); i6++) {
                bundle2.putByteArray(tb1.c0 + "_" + Integer.toString(i6, 36), (byte[]) list.get(i6));
            }
            bundle2.putParcelable(tb1.d0, tb1Var.r);
            bundle2.putLong(tb1.e0, tb1Var.s);
            bundle2.putInt(tb1.f0, tb1Var.u);
            bundle2.putInt(tb1.g0, tb1Var.v);
            bundle2.putInt(tb1.z0, tb1Var.w);
            bundle2.putInt(tb1.A0, tb1Var.x);
            bundle2.putFloat(tb1.h0, tb1Var.y);
            bundle2.putInt(tb1.i0, tb1Var.z);
            bundle2.putFloat(tb1.j0, tb1Var.A);
            bundle2.putByteArray(tb1.k0, tb1Var.B);
            bundle2.putInt(tb1.l0, tb1Var.C);
            c50 c50Var = tb1Var.D;
            if (c50Var != null) {
                String str3 = tb1.m0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(c50.i, c50Var.a);
                bundle4.putInt(c50.j, c50Var.b);
                bundle4.putInt(c50.k, c50Var.c);
                bundle4.putByteArray(c50.l, c50Var.d);
                bundle4.putInt(c50.m, c50Var.e);
                bundle4.putInt(c50.n, c50Var.f);
                bundle2.putBundle(str3, bundle4);
            }
            bundle2.putInt(tb1.y0, tb1Var.E);
            bundle2.putInt(tb1.n0, tb1Var.F);
            bundle2.putInt(tb1.o0, tb1Var.G);
            bundle2.putInt(tb1.p0, tb1Var.H);
            bundle2.putInt(tb1.q0, tb1Var.I);
            bundle2.putInt(tb1.r0, tb1Var.J);
            bundle2.putInt(tb1.s0, tb1Var.K);
            bundle2.putInt(tb1.u0, tb1Var.M);
            bundle2.putInt(tb1.v0, tb1Var.N);
            bundle2.putInt(tb1.t0, tb1Var.O);
            arrayList.add(bundle2);
            i++;
            tb1VarArr = tb1VarArr3;
            length = i4;
        }
        bundle.putParcelableArrayList(f, arrayList);
        bundle.putString(g, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sv4.class == obj.getClass()) {
            sv4 sv4Var = (sv4) obj;
            if (this.b.equals(sv4Var.b) && Arrays.equals(this.d, sv4Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + f34.e(this.b, 527, 31);
        }
        return this.e;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
