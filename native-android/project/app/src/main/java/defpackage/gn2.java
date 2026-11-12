package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gn2 {
    public static final gn2 g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public final String a;
    public final bn2 b;
    public final an2 c;
    public final do2 d;
    public final wm2 e;
    public final cn2 f;

    static {
        um2 um2Var = new um2();
        vw1 vw1Var = yw1.o;
        gy3 gy3Var = gy3.r;
        List list = Collections.EMPTY_LIST;
        gy3 gy3Var2 = gy3.r;
        zm2 zm2Var = new zm2();
        g = new gn2("", new wm2(um2Var), null, new an2(zm2Var), do2.K, cn2.d);
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = Integer.toString(5, 36);
    }

    public gn2(String str, wm2 wm2Var, bn2 bn2Var, an2 an2Var, do2 do2Var, cn2 cn2Var) {
        this.a = str;
        this.b = bn2Var;
        this.c = an2Var;
        this.d = do2Var;
        this.e = wm2Var;
        this.f = cn2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Cloneable] */
    /* JADX WARN: Type inference failed for: r1v59 */
    public static gn2 b(Bundle bundle) {
        wm2 wm2Var;
        cn2 cn2Var;
        Map mapB;
        ym2 ym2Var;
        sm2 sm2Var;
        gy3 gy3VarF;
        gy3 gy3VarF2;
        bn2 bn2Var;
        String string = bundle.getString(h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(i);
        an2 an2VarB = bundle2 == null ? an2.f : an2.b(bundle2);
        Bundle bundle3 = bundle.getBundle(j);
        do2 do2VarB = bundle3 == null ? do2.K : do2.b(bundle3);
        Bundle bundle4 = bundle.getBundle(k);
        int i2 = 0;
        boolean z = false;
        if (bundle4 == null) {
            wm2Var = wm2.r;
        } else {
            um2 um2Var = new um2();
            String str = vm2.j;
            vm2 vm2Var = vm2.i;
            long j2 = vm2Var.a;
            long j3 = vm2Var.d;
            long j4 = vm2Var.b;
            long jQ = f35.Q(bundle4.getLong(str, j2));
            boolean z2 = true;
            rr2.l(jQ >= 0);
            um2Var.a = jQ;
            long jQ2 = f35.Q(bundle4.getLong(vm2.k, vm2Var.c));
            rr2.l(jQ2 == Long.MIN_VALUE || jQ2 >= 0);
            um2Var.b = jQ2;
            um2Var.c = bundle4.getBoolean(vm2.l, vm2Var.e);
            um2Var.d = bundle4.getBoolean(vm2.m, vm2Var.f);
            um2Var.e = bundle4.getBoolean(vm2.n, vm2Var.g);
            um2Var.f = bundle4.getBoolean(vm2.q, vm2Var.h);
            long j5 = bundle4.getLong(vm2.o, j4);
            if (j5 != j4) {
                rr2.l(j5 >= 0);
                um2Var.a = j5;
            }
            long j6 = bundle4.getLong(vm2.p, j3);
            if (j6 != j3) {
                if (j6 != Long.MIN_VALUE && j6 < 0) {
                    z2 = false;
                }
                rr2.l(z2);
                um2Var.b = j6;
            }
            wm2Var = new wm2(um2Var);
        }
        wm2 wm2Var2 = wm2Var;
        Bundle bundle5 = bundle.getBundle(l);
        if (bundle5 == null) {
            cn2Var = cn2.d;
        } else {
            yc5 yc5Var = new yc5();
            yc5Var.n = (Uri) bundle5.getParcelable(cn2.e);
            yc5Var.o = bundle5.getString(cn2.f);
            yc5Var.p = f35.n(bundle5.getBundle(cn2.g));
            cn2Var = new cn2(yc5Var);
        }
        cn2 cn2Var2 = cn2Var;
        Bundle bundle6 = bundle.getBundle(m);
        if (bundle6 == null) {
            bn2Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(bn2.k);
            if (bundle7 == null) {
                ym2Var = null;
            } else {
                String string2 = bundle7.getString(ym2.i);
                string2.getClass();
                UUID uuidFromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(ym2.j);
                String str2 = ym2.k;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str2);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    mapB = ly3.t;
                } else {
                    HashMap map = new HashMap();
                    if (bundle9 != bundle8) {
                        for (String str3 : bundle9.keySet()) {
                            String string3 = bundle9.getString(str3);
                            if (string3 != null) {
                                map.put(str3, string3);
                            }
                        }
                    }
                    mapB = bx1.b(map);
                }
                boolean z3 = bundle7.getBoolean(ym2.l, false);
                boolean z4 = bundle7.getBoolean(ym2.m, false);
                boolean z5 = bundle7.getBoolean(ym2.n, false);
                String str4 = ym2.o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str4);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                yw1 yw1VarK = yw1.k(arrayList);
                byte[] byteArray = bundle7.getByteArray(ym2.p);
                xm2 xm2Var = new xm2();
                xm2Var.d = uuidFromString;
                xm2Var.e = uri;
                xm2Var.f = bx1.b(mapB);
                xm2Var.a = z3;
                xm2Var.c = z5;
                xm2Var.b = z4;
                xm2Var.g = yw1.k(yw1VarK);
                xm2Var.h = byteArray != null ? Arrays.copyOf(byteArray, byteArray.length) : 0;
                ym2Var = new ym2(xm2Var);
            }
            Bundle bundle10 = bundle6.getBundle(bn2.l);
            if (bundle10 == null) {
                sm2Var = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(sm2.b);
                uri2.getClass();
                rm2 rm2Var = new rm2(i2, z ? 1 : 0);
                rm2Var.o = uri2;
                sm2Var = new sm2(rm2Var);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(bn2.m);
            if (parcelableArrayList == null) {
                vw1 vw1Var = yw1.o;
                gy3VarF = gy3.r;
            } else {
                uw1 uw1VarJ = yw1.j();
                int i3 = 0;
                while (i3 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i3);
                    bundle11.getClass();
                    uw1VarJ.c(new fm4(bundle11.getInt(fm4.q, 0), bundle11.getInt(fm4.r, 0), bundle11.getInt(fm4.s, 0)));
                    i3++;
                    parcelableArrayList = parcelableArrayList;
                }
                gy3VarF = uw1VarJ.f();
            }
            gy3 gy3Var = gy3VarF;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(bn2.o);
            if (parcelableArrayList2 == null) {
                vw1 vw1Var2 = yw1.o;
                gy3VarF2 = gy3.r;
            } else {
                gy3VarF2 = hw.f(new er1(26), parcelableArrayList2);
            }
            gy3 gy3Var2 = gy3VarF2;
            long j7 = bundle6.getLong(bn2.p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(bn2.i);
            uri3.getClass();
            bn2Var = new bn2(uri3, bundle6.getString(bn2.j), ym2Var, sm2Var, gy3Var, bundle6.getString(bn2.n), gy3Var2, j7);
        }
        return new gn2(string, wm2Var2, bn2Var, an2VarB, do2VarB, cn2Var2);
    }

    /* JADX WARN: Type inference failed for: r1v21, types: [byte[], java.lang.Cloneable] */
    public final tm2 a() {
        xm2 xm2Var;
        tm2 tm2Var = new tm2();
        tm2Var.d = new um2();
        tm2Var.e = new xm2();
        tm2Var.f = Collections.EMPTY_LIST;
        tm2Var.h = gy3.r;
        tm2Var.l = new zm2();
        tm2Var.m = cn2.d;
        tm2Var.j = -9223372036854775807L;
        um2 um2Var = new um2();
        wm2 wm2Var = this.e;
        um2Var.a = wm2Var.b;
        um2Var.b = wm2Var.d;
        um2Var.c = wm2Var.e;
        um2Var.d = wm2Var.f;
        um2Var.e = wm2Var.g;
        um2Var.f = wm2Var.h;
        tm2Var.d = um2Var;
        tm2Var.a = this.a;
        tm2Var.k = this.d;
        tm2Var.l = this.c.a();
        tm2Var.m = this.f;
        bn2 bn2Var = this.b;
        if (bn2Var != null) {
            tm2Var.g = bn2Var.f;
            tm2Var.c = bn2Var.b;
            tm2Var.b = bn2Var.a;
            tm2Var.f = bn2Var.e;
            tm2Var.h = bn2Var.g;
            ym2 ym2Var = bn2Var.c;
            if (ym2Var != null) {
                xm2Var = new xm2();
                xm2Var.d = ym2Var.a;
                xm2Var.e = ym2Var.b;
                xm2Var.f = ym2Var.c;
                xm2Var.a = ym2Var.d;
                xm2Var.b = ym2Var.e;
                xm2Var.c = ym2Var.f;
                xm2Var.g = ym2Var.g;
                xm2Var.h = ym2Var.h;
            } else {
                xm2Var = new xm2();
            }
            tm2Var.e = xm2Var;
            tm2Var.i = bn2Var.d;
            tm2Var.j = bn2Var.h;
        }
        return tm2Var;
    }

    public final Bundle c(boolean z) {
        bn2 bn2Var;
        Bundle bundle = new Bundle();
        String str = this.a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        an2 an2Var = an2.f;
        an2 an2Var2 = this.c;
        if (!an2Var2.equals(an2Var)) {
            bundle.putBundle(i, an2Var2.c());
        }
        do2 do2Var = do2.K;
        do2 do2Var2 = this.d;
        if (!do2Var2.equals(do2Var)) {
            bundle.putBundle(j, do2Var2.c());
        }
        vm2 vm2Var = vm2.i;
        wm2 wm2Var = this.e;
        if (!wm2Var.equals(vm2Var)) {
            Bundle bundle2 = new Bundle();
            long j2 = wm2Var.a;
            if (j2 != vm2Var.a) {
                bundle2.putLong(vm2.j, j2);
            }
            long j3 = wm2Var.c;
            if (j3 != vm2Var.c) {
                bundle2.putLong(vm2.k, j3);
            }
            long j4 = wm2Var.b;
            if (j4 != vm2Var.b) {
                bundle2.putLong(vm2.o, j4);
            }
            long j5 = wm2Var.d;
            if (j5 != vm2Var.d) {
                bundle2.putLong(vm2.p, j5);
            }
            boolean z2 = wm2Var.e;
            if (z2 != vm2Var.e) {
                bundle2.putBoolean(vm2.l, z2);
            }
            boolean z3 = wm2Var.f;
            if (z3 != vm2Var.f) {
                bundle2.putBoolean(vm2.m, z3);
            }
            boolean z4 = wm2Var.g;
            if (z4 != vm2Var.g) {
                bundle2.putBoolean(vm2.n, z4);
            }
            boolean z5 = wm2Var.h;
            if (z5 != vm2Var.h) {
                bundle2.putBoolean(vm2.q, z5);
            }
            bundle.putBundle(k, bundle2);
        }
        cn2 cn2Var = cn2.d;
        cn2 cn2Var2 = this.f;
        if (!cn2Var2.equals(cn2Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = cn2Var2.a;
            if (uri != null) {
                bundle3.putParcelable(cn2.e, uri);
            }
            String str2 = cn2Var2.b;
            if (str2 != null) {
                bundle3.putString(cn2.f, str2);
            }
            Bundle bundle4 = cn2Var2.c;
            if (bundle4 != null) {
                bundle3.putBundle(cn2.g, bundle4);
            }
            bundle.putBundle(l, bundle3);
        }
        if (z && (bn2Var = this.b) != null) {
            yw1 yw1Var = bn2Var.g;
            List list = bn2Var.e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(bn2.i, bn2Var.a);
            String str3 = bn2Var.b;
            if (str3 != null) {
                bundle5.putString(bn2.j, str3);
            }
            ym2 ym2Var = bn2Var.c;
            if (ym2Var != null) {
                String str4 = bn2.k;
                yw1 yw1Var2 = ym2Var.g;
                bx1 bx1Var = ym2Var.c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(ym2.i, ym2Var.a.toString());
                Uri uri2 = ym2Var.b;
                if (uri2 != null) {
                    bundle6.putParcelable(ym2.j, uri2);
                }
                if (!bx1Var.isEmpty()) {
                    String str5 = ym2.k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : bx1Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z6 = ym2Var.d;
                if (z6) {
                    bundle6.putBoolean(ym2.l, z6);
                }
                boolean z7 = ym2Var.e;
                if (z7) {
                    bundle6.putBoolean(ym2.m, z7);
                }
                boolean z8 = ym2Var.f;
                if (z8) {
                    bundle6.putBoolean(ym2.n, z8);
                }
                if (!yw1Var2.isEmpty()) {
                    bundle6.putIntegerArrayList(ym2.o, new ArrayList<>(yw1Var2));
                }
                byte[] bArr = ym2Var.h;
                if (bArr != null) {
                    bundle6.putByteArray(ym2.p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            sm2 sm2Var = bn2Var.d;
            if (sm2Var != null) {
                String str6 = bn2.l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(sm2.b, sm2Var.a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(bn2.m, hw.N(list, new er1(24)));
            }
            String str7 = bn2Var.f;
            if (str7 != null) {
                bundle5.putString(bn2.n, str7);
            }
            if (!yw1Var.isEmpty()) {
                bundle5.putParcelableArrayList(bn2.o, hw.N(yw1Var, new er1(25)));
            }
            long j6 = bn2Var.h;
            if (j6 != -9223372036854775807L) {
                bundle5.putLong(bn2.p, j6);
            }
            bundle.putBundle(m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gn2)) {
            return false;
        }
        gn2 gn2Var = (gn2) obj;
        return Objects.equals(this.a, gn2Var.a) && this.e.equals(gn2Var.e) && Objects.equals(this.b, gn2Var.b) && Objects.equals(this.c, gn2Var.c) && Objects.equals(this.d, gn2Var.d) && Objects.equals(this.f, gn2Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        bn2 bn2Var = this.b;
        return this.f.hashCode() + ((this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((iHashCode + (bn2Var != null ? bn2Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
