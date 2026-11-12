package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.InputFilter;
import android.widget.EditText;
import androidx.preference.Preference;
import com.google.android.gms.internal.fido.zzhf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tb4 implements bp3, gz0, gs4, ky0, eg1 {
    public final /* synthetic */ int n;

    public /* synthetic */ tb4(int i) {
        this.n = i;
    }

    public static /* synthetic */ void a() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void b(long j, Object obj) throws zzhf {
        throw new zzhf("Integer value " + j + obj);
    }

    public static /* synthetic */ void c(Object obj, Object obj2, Object obj3) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void d(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void e(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void f(String str, float f) {
        throw new IllegalArgumentException(str + f);
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void k() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.ky0
    public void G(df dfVar) {
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0408  */
    /* JADX WARN: Code duplicated, block: B:109:0x040d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0416  */
    /* JADX WARN: Code duplicated, block: B:115:0x041f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0424  */
    /* JADX WARN: Code duplicated, block: B:120:0x0431  */
    /* JADX WARN: Code duplicated, block: B:122:0x0439  */
    /* JADX WARN: Code duplicated, block: B:123:0x043c  */
    @Override // defpackage.eg1
    /* JADX INFO: renamed from: apply */
    public Object mo77apply(Object obj) {
        z5 z5Var;
        x5[] x5VarArr;
        int i;
        gn2[] gn2VarArr;
        gn2 gn2Var;
        long[] jArr;
        String[] strArr;
        y5[] y5VarArr;
        int i2;
        Bundle bundle;
        y5 y5Var;
        gy3 gy3VarF;
        int i3 = 0;
        switch (this.n) {
            case 7:
                Bundle bundle2 = (Bundle) obj;
                Bundle bundle3 = bundle2.getBundle(bu4.s);
                gn2 gn2VarB = bundle3 != null ? gn2.b(bundle3) : gn2.g;
                long j = bundle2.getLong(bu4.t, -9223372036854775807L);
                long j2 = bundle2.getLong(bu4.u, -9223372036854775807L);
                long j3 = bundle2.getLong(bu4.v, -9223372036854775807L);
                boolean z = bundle2.getBoolean(bu4.w, false);
                boolean z2 = bundle2.getBoolean(bu4.x, false);
                Bundle bundle4 = bundle2.getBundle(bu4.y);
                an2 an2VarB = bundle4 != null ? an2.b(bundle4) : null;
                boolean z3 = bundle2.getBoolean(bu4.z, false);
                long j4 = bundle2.getLong(bu4.A, 0L);
                long j5 = bundle2.getLong(bu4.B, -9223372036854775807L);
                int i4 = bundle2.getInt(bu4.C, 0);
                int i5 = bundle2.getInt(bu4.D, 0);
                long j6 = bundle2.getLong(bu4.E, 0L);
                bu4 bu4Var = new bu4();
                bu4Var.b(bu4.q, gn2VarB, null, j, j2, j3, z, z2, an2VarB, j4, j5, i4, i5, j6);
                bu4Var.j = z3;
                return bu4Var;
            case 8:
                Bundle bundle5 = (Bundle) obj;
                int i6 = bundle5.getInt(zt4.h, 0);
                long j7 = bundle5.getLong(zt4.i, -9223372036854775807L);
                long j8 = bundle5.getLong(zt4.j, 0L);
                boolean z4 = bundle5.getBoolean(zt4.k, false);
                Bundle bundle6 = bundle5.getBundle(zt4.l);
                if (bundle6 != null) {
                    ArrayList parcelableArrayList = bundle6.getParcelableArrayList(z5.h);
                    if (parcelableArrayList == null) {
                        x5VarArr = new x5[0];
                    } else {
                        x5[] x5VarArr2 = new x5[parcelableArrayList.size()];
                        for (int i7 = 0; i7 < parcelableArrayList.size(); i7++) {
                            Bundle bundle7 = (Bundle) parcelableArrayList.get(i7);
                            long j9 = bundle7.getLong(x5.m);
                            int i8 = bundle7.getInt(x5.n);
                            int i9 = bundle7.getInt(x5.t);
                            ArrayList parcelableArrayList2 = bundle7.getParcelableArrayList(x5.o);
                            ArrayList parcelableArrayList3 = bundle7.getParcelableArrayList(x5.u);
                            int[] intArray = bundle7.getIntArray(x5.p);
                            long[] longArray = bundle7.getLongArray(x5.q);
                            long j10 = bundle7.getLong(x5.r);
                            boolean z5 = bundle7.getBoolean(x5.s);
                            ArrayList<String> stringArrayList = bundle7.getStringArrayList(x5.v);
                            ArrayList parcelableArrayList4 = bundle7.getParcelableArrayList(x5.x);
                            boolean z6 = bundle7.getBoolean(x5.w);
                            if (intArray == null) {
                                intArray = new int[0];
                            }
                            int[] iArr = intArray;
                            if (parcelableArrayList3 != null) {
                                gn2[] gn2VarArr2 = new gn2[parcelableArrayList3.size()];
                                for (int i10 = 0; i10 < parcelableArrayList3.size(); i10++) {
                                    Bundle bundle8 = (Bundle) parcelableArrayList3.get(i10);
                                    gn2VarArr2[i10] = bundle8 == null ? null : gn2.b(bundle8);
                                }
                                gn2VarArr = gn2VarArr2;
                            } else {
                                if (parcelableArrayList2 != null) {
                                    gn2[] gn2VarArr3 = new gn2[parcelableArrayList2.size()];
                                    int i11 = 0;
                                    while (i11 < parcelableArrayList2.size()) {
                                        Uri uri = (Uri) parcelableArrayList2.get(i11);
                                        if (uri == null) {
                                            gn2Var = null;
                                        } else {
                                            gn2 gn2Var2 = gn2.g;
                                            um2 um2Var = new um2();
                                            xm2 xm2Var = new xm2();
                                            List list = Collections.EMPTY_LIST;
                                            gy3 gy3Var = gy3.r;
                                            zm2 zm2Var = new zm2();
                                            cn2 cn2Var = cn2.d;
                                            rr2.w(((Uri) xm2Var.e) == null || ((UUID) xm2Var.d) != null);
                                            gn2Var = new gn2("", new wm2(um2Var), new bn2(uri, null, ((UUID) xm2Var.d) != null ? new ym2(xm2Var) : null, null, list, null, gy3Var, -9223372036854775807L), new an2(zm2Var), do2.K, cn2Var);
                                        }
                                        gn2VarArr3[i11] = gn2Var;
                                        i11++;
                                        parcelableArrayList2 = parcelableArrayList2;
                                        gn2VarArr3 = gn2VarArr3;
                                    }
                                    gn2VarArr = gn2VarArr3;
                                } else {
                                    i = 0;
                                    gn2VarArr = new gn2[0];
                                }
                                if (longArray == null) {
                                    jArr = new long[i];
                                } else {
                                    jArr = longArray;
                                }
                                strArr = new String[i];
                                if (stringArrayList != null) {
                                    strArr = (String[]) stringArrayList.toArray(strArr);
                                }
                                String[] strArr2 = strArr;
                                if (parcelableArrayList4 == null) {
                                    y5VarArr = new y5[i];
                                } else {
                                    y5VarArr = new y5[parcelableArrayList4.size()];
                                    for (i2 = 0; i2 < parcelableArrayList4.size(); i2++) {
                                        bundle = (Bundle) parcelableArrayList4.get(i2);
                                        if (bundle == null) {
                                            y5Var = null;
                                        } else {
                                            y5Var = new y5(bundle.getLong(y5.d), bundle.getLong(y5.e), bundle.getString(y5.f));
                                        }
                                        y5VarArr[i2] = y5Var;
                                    }
                                }
                                x5VarArr2[i7] = new x5(j9, i8, i9, iArr, gn2VarArr, jArr, j10, z5, strArr2, y5VarArr, z6);
                            }
                            i = 0;
                            if (longArray == null) {
                                jArr = new long[i];
                            } else {
                                jArr = longArray;
                            }
                            strArr = new String[i];
                            if (stringArrayList != null) {
                                strArr = (String[]) stringArrayList.toArray(strArr);
                            }
                            String[] strArr3 = strArr;
                            if (parcelableArrayList4 == null) {
                                y5VarArr = new y5[i];
                            } else {
                                y5VarArr = new y5[parcelableArrayList4.size()];
                                while (i2 < parcelableArrayList4.size()) {
                                    bundle = (Bundle) parcelableArrayList4.get(i2);
                                    if (bundle == null) {
                                        y5Var = null;
                                    } else {
                                        y5Var = new y5(bundle.getLong(y5.d), bundle.getLong(y5.e), bundle.getString(y5.f));
                                    }
                                    y5VarArr[i2] = y5Var;
                                }
                            }
                            x5VarArr2[i7] = new x5(j9, i8, i9, iArr, gn2VarArr, jArr, j10, z5, strArr3, y5VarArr, z6);
                        }
                        x5VarArr = x5VarArr2;
                    }
                    z5Var = new z5(x5VarArr, bundle6.getLong(z5.i, 0L), bundle6.getLong(z5.j, -9223372036854775807L), bundle6.getInt(z5.k, 0));
                } else {
                    z5Var = z5.f;
                }
                z5 z5Var2 = z5Var;
                zt4 zt4Var = new zt4();
                zt4Var.i(null, null, i6, j7, j8, z5Var2, z4);
                return zt4Var;
            case 9:
                Bundle bundle9 = (Bundle) obj;
                tb1 tb1Var = tb1.Q;
                sb1 sb1Var = new sb1();
                if (bundle9 != null) {
                    ClassLoader classLoader = hw.class.getClassLoader();
                    String str = f35.a;
                    bundle9.setClassLoader(classLoader);
                }
                String string = bundle9.getString(tb1.R);
                String str2 = tb1Var.a;
                if (string == null) {
                    string = str2;
                }
                sb1Var.a = string;
                String string2 = bundle9.getString(tb1.S);
                String str3 = tb1Var.b;
                if (string2 == null) {
                    string2 = str3;
                }
                sb1Var.b = string2;
                ArrayList parcelableArrayList5 = bundle9.getParcelableArrayList(tb1.w0);
                if (parcelableArrayList5 == null) {
                    gy3VarF = gy3.r;
                } else {
                    uw1 uw1VarJ = yw1.j();
                    for (int i12 = 0; i12 < parcelableArrayList5.size(); i12++) {
                        Bundle bundle10 = (Bundle) parcelableArrayList5.get(i12);
                        bundle10.getClass();
                        String string3 = bundle10.getString(o42.c);
                        String string4 = bundle10.getString(o42.d);
                        string4.getClass();
                        uw1VarJ.c(new o42(string3, string4));
                    }
                    gy3VarF = uw1VarJ.f();
                }
                sb1Var.c = yw1.k(gy3VarF);
                String string5 = bundle9.getString(tb1.T);
                String str4 = tb1Var.d;
                if (string5 == null) {
                    string5 = str4;
                }
                sb1Var.d = string5;
                sb1Var.e = bundle9.getInt(tb1.U, tb1Var.e);
                sb1Var.f = bundle9.getInt(tb1.V, tb1Var.f);
                sb1Var.g = bundle9.getInt(tb1.x0, tb1Var.g);
                sb1Var.h = bundle9.getInt(tb1.W, tb1Var.h);
                sb1Var.i = bundle9.getInt(tb1.X, tb1Var.i);
                String string6 = bundle9.getString(tb1.Y);
                String str5 = tb1Var.k;
                if (string6 == null) {
                    string6 = str5;
                }
                sb1Var.j = string6;
                String string7 = bundle9.getString(tb1.Z);
                String str6 = tb1Var.m;
                if (string7 == null) {
                    string7 = str6;
                }
                sb1Var.l = lw2.m(string7);
                String string8 = bundle9.getString(tb1.a0);
                String str7 = tb1Var.n;
                if (string8 == null) {
                    string8 = str7;
                }
                sb1Var.m = lw2.m(string8);
                sb1Var.n = bundle9.getInt(tb1.b0, tb1Var.o);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle9.getByteArray(tb1.c0 + "_" + Integer.toString(i3, 36));
                    if (byteArray == null) {
                        sb1Var.p = arrayList;
                        sb1Var.q = (ow0) bundle9.getParcelable(tb1.d0);
                        sb1Var.r = bundle9.getLong(tb1.e0, tb1Var.s);
                        sb1Var.t = bundle9.getInt(tb1.f0, tb1Var.u);
                        sb1Var.u = bundle9.getInt(tb1.g0, tb1Var.v);
                        sb1Var.v = bundle9.getInt(tb1.z0, tb1Var.w);
                        sb1Var.w = bundle9.getInt(tb1.A0, tb1Var.x);
                        sb1Var.x = bundle9.getFloat(tb1.h0, tb1Var.y);
                        sb1Var.y = bundle9.getInt(tb1.i0, tb1Var.z);
                        sb1Var.z = bundle9.getFloat(tb1.j0, tb1Var.A);
                        sb1Var.A = bundle9.getByteArray(tb1.k0);
                        sb1Var.B = bundle9.getInt(tb1.l0, tb1Var.C);
                        sb1Var.D = bundle9.getInt(tb1.y0, tb1Var.E);
                        Bundle bundle11 = bundle9.getBundle(tb1.m0);
                        if (bundle11 != null) {
                            sb1Var.C = new c50(bundle11.getInt(c50.i, -1), bundle11.getInt(c50.j, -1), bundle11.getInt(c50.k, -1), bundle11.getByteArray(c50.l), bundle11.getInt(c50.m, -1), bundle11.getInt(c50.n, -1));
                        }
                        sb1Var.E = bundle9.getInt(tb1.n0, tb1Var.F);
                        sb1Var.F = bundle9.getInt(tb1.o0, tb1Var.G);
                        sb1Var.G = bundle9.getInt(tb1.p0, tb1Var.H);
                        sb1Var.H = bundle9.getInt(tb1.q0, tb1Var.I);
                        sb1Var.I = bundle9.getInt(tb1.r0, tb1Var.J);
                        sb1Var.J = bundle9.getInt(tb1.s0, tb1Var.K);
                        sb1Var.L = bundle9.getInt(tb1.u0, tb1Var.M);
                        sb1Var.M = bundle9.getInt(tb1.v0, tb1Var.N);
                        sb1Var.N = bundle9.getInt(tb1.t0, tb1Var.O);
                        return new tb1(sb1Var);
                    }
                    arrayList.add(byteArray);
                    i3++;
                }
                break;
            case 10:
                return Integer.valueOf(((sv4) obj).c);
            case 11:
                iw4 iw4Var = (iw4) obj;
                iw4Var.getClass();
                Bundle bundle12 = new Bundle();
                bundle12.putBundle(iw4.f, iw4Var.b.d());
                bundle12.putIntArray(iw4.g, iw4Var.d);
                bundle12.putBooleanArray(iw4.h, iw4Var.e);
                bundle12.putBoolean(iw4.i, iw4Var.c);
                return bundle12;
            default:
                Bundle bundle13 = (Bundle) obj;
                Bundle bundle14 = bundle13.getBundle(iw4.f);
                bundle14.getClass();
                sv4 sv4VarA = sv4.a(bundle14);
                int[] intArray2 = bundle13.getIntArray(iw4.g);
                int i13 = sv4VarA.a;
                int[] iArr2 = new int[i13];
                if (intArray2 == null) {
                    intArray2 = iArr2;
                }
                boolean[] booleanArray = bundle13.getBooleanArray(iw4.h);
                boolean[] zArr = new boolean[i13];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new iw4(sv4VarA, bundle13.getBoolean(iw4.i, false), intArray2, booleanArray);
        }
    }

    @Override // defpackage.bp3
    public boolean g(Preference preference, Object obj) {
        switch (this.n) {
            case 0:
                if (obj instanceof Boolean) {
                    xa3.t("mini_shuffle_button_visibility", ((Boolean) obj).booleanValue());
                }
                return true;
            default:
                String str = (String) obj;
                return (str == null || str.isEmpty()) ? false : true;
        }
    }

    @Override // defpackage.gz0
    public void i(EditText editText) {
        editText.setInputType(2);
        editText.setFilters(new InputFilter[]{new sb4()});
    }
}
