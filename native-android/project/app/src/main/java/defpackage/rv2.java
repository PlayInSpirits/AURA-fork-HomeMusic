package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.eddyizm.tempus.App;
import com.google.common.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rv2 implements me0, th4, as4, d14, l65, dc5, fv2, s41, Callback, f3, y30 {
    public final /* synthetic */ int n;
    public static final rv2 o = new rv2(0);
    public static final /* synthetic */ rv2 p = new rv2(1);
    public static final /* synthetic */ rv2 q = new rv2(2);
    public static final rv2 r = new rv2(3);
    public static final rv2 s = new rv2(4);
    public static final rv2 t = new rv2(5);
    public static final rv2 u = new rv2(6);
    public static final qa3 v = new qa3(1);
    public static final qa3 w = new qa3(0);
    public static final rv2 x = new rv2(8);
    public static final /* synthetic */ rv2 y = new rv2(9);
    public static final rv2 z = new rv2(10);
    public static final rv2 A = new rv2(11);
    public static final rv2 B = new rv2(12);
    public static final rv2 C = new rv2(13);
    public static final rv2 D = new rv2(14);
    public static final rv2 E = new rv2(15);
    public static final rv2 F = new rv2(16);
    public static final rv2 G = new rv2(17);
    public static final rv2 H = new rv2(18);
    public static final rv2 I = new rv2(19);
    public static final rv2 J = new rv2(20);
    public static final rv2 K = new rv2(21);
    public static final rv2 L = new rv2(22);
    public static final ec5 M = new ec5();

    public /* synthetic */ rv2(int i) {
        this.n = i;
    }

    public static k03 j(String str) {
        k03 k03Var = new k03();
        App.f(false).c().e(str).enqueue(new p8(k03Var, 0));
        return k03Var;
    }

    public static k03 l(String str) {
        k03 k03Var = new k03();
        App.f(false).c().e(str).enqueue(new gp3(1, new d7(2, k03Var), str));
        return k03Var;
    }

    public static k03 m(String str, int i, Integer num, Integer num2) {
        k03 k03Var = new k03(new ArrayList());
        App.f(false).a().q(str, i, 0, num, num2).enqueue(new ew4(k03Var, str, i, num, num2));
        return k03Var;
    }

    public static k03 o(int i, boolean z2) {
        k03 k03Var = new k03(new ArrayList());
        App.f(false).a().s().enqueue(new o8(z2, k03Var, i, 0));
        return k03Var;
    }

    @Override // defpackage.fv2
    public void a(qu2 qu2Var, boolean z2) {
    }

    @Override // defpackage.as4
    public float b() {
        return Float.NaN;
    }

    @Override // defpackage.as4
    public long c() {
        int i = x40.h;
        return x40.g;
    }

    @Override // defpackage.l65
    public gf1 d(b0 b0Var) {
        if (!b0Var.isAttachedToWindow()) {
            jx3 jx3Var = new jx3();
            vc1 vc1Var = new vc1(1, b0Var, jx3Var);
            b0Var.addOnAttachStateChangeListener(vc1Var);
            jx3Var.n = new fa(16, b0Var, vc1Var);
            return new e25(2, jx3Var);
        }
        ba2 ba2VarU = j51.u(b0Var);
        if (ba2VarU != null) {
            return fu.c(b0Var, ba2VarU.h());
        }
        cz1.c("View tree for " + b0Var + " has no ViewTreeLifecycleOwner");
        er1.a();
        return null;
    }

    @Override // defpackage.dc5
    public zb5 e(Context context, po0 po0Var) {
        ju juVar;
        po0Var.getClass();
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = context;
                break;
            }
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper.getBaseContext();
            baseContext.getClass();
        }
        if (baseContext instanceof Activity) {
            Activity activity = (Activity) baseContext;
            ju.b.getClass();
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                juVar = ku.n;
            } else if (i >= 29) {
                juVar = fz0.D;
            } else {
                juVar = i >= 28 ? fz0.C : fz0.B;
            }
            return new zb5(new hu(juVar.a(activity)), po0Var.c(activity));
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            kf2.n("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new zb5(new Rect(0, 0, point.x, point.y), po0Var.c(context));
    }

    @Override // defpackage.as4
    public uo f() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int g(Object obj, HashMap map) {
        Integer num = (Integer) map.get(obj);
        if (num != null) {
            return num.intValue();
        }
        boolean zIsInterface = ((TypeToken) obj).getRawType().isInterface();
        Iterator<E> it = ((TypeToken) obj).getGenericInterfaces().iterator();
        int iMax = zIsInterface;
        while (it.hasNext()) {
            iMax = Math.max(iMax, g(it.next(), map));
        }
        TypeToken genericSuperclass = ((TypeToken) obj).getGenericSuperclass();
        int iMax2 = iMax;
        if (genericSuperclass != null) {
            iMax2 = Math.max(iMax, g(genericSuperclass, map));
        }
        int i = iMax2 + 1;
        map.put(obj, Integer.valueOf(i));
        return i;
    }

    public zz1 h(tb1 tb1Var) {
        String str = tb1Var.n;
        if (str != null) {
            int i = 1;
            int i2 = 0;
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new wh(i2);
                case "application/x-icy":
                    return new hv1();
                case "application/id3":
                    return new mv1(null);
                case "application/x-emsg":
                    return new wh(i);
                case "application/x-scte35":
                    return new vj4();
            }
        }
        kf2.n(xa3.g("Attempted to create decoder for unsupported MIME type: ", str));
        return null;
    }

    public boolean i(Object obj, Object obj2) {
        switch (this.n) {
            case 4:
                return false;
            case 11:
                return obj == obj2;
            default:
                return h12.c(obj, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0185  */
    @Override // defpackage.s41
    public t41[] k(r41[] r41VarArr, cp cpVar) {
        int i;
        long j;
        int i2;
        t41 e6Var;
        long j2;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= r41VarArr.length) {
                break;
            }
            r41 r41Var = r41VarArr[i4];
            if (r41Var == null || r41Var.b.length <= 1) {
                arrayList.add(null);
            } else {
                uw1 uw1VarJ = yw1.j();
                uw1VarJ.c(new d6(0L, 0L));
                arrayList.add(uw1VarJ);
            }
            i4++;
        }
        int length = r41VarArr.length;
        long[][] jArr = new long[length][];
        int i5 = 0;
        while (true) {
            j = -1;
            if (i5 >= r41VarArr.length) {
                break;
            }
            r41 r41Var2 = r41VarArr[i5];
            if (r41Var2 == null) {
                jArr[i5] = new long[0];
            } else {
                int[] iArr = r41Var2.b;
                jArr[i5] = new long[iArr.length];
                for (int i6 = 0; i6 < iArr.length; i6++) {
                    long j3 = r41Var2.a.d[iArr[i6]].j;
                    long[] jArr2 = jArr[i5];
                    if (j3 == -1) {
                        j3 = 0;
                    }
                    jArr2[i6] = j3;
                }
                Arrays.sort(jArr[i5]);
            }
            i5++;
        }
        int[] iArr2 = new int[length];
        long[] jArr3 = new long[length];
        for (int i7 = 0; i7 < length; i7++) {
            long[] jArr4 = jArr[i7];
            jArr3[i7] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        e6.u(arrayList, jArr3);
        uc5.f(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(x13.o);
        rz2 rz2Var = new rz2();
        sz2 sz2Var = new sz2(treeMap);
        sz2Var.t = rz2Var;
        int i8 = 0;
        while (i8 < length) {
            long[] jArr5 = jArr[i8];
            if (jArr5.length <= 1) {
                j2 = j;
            } else {
                int length2 = jArr5.length;
                double[] dArr = new double[length2];
                int i9 = i3;
                while (true) {
                    long[] jArr6 = jArr[i8];
                    j2 = j;
                    double dLog = 0.0d;
                    if (i9 >= jArr6.length) {
                        break;
                    }
                    long j4 = jArr6[i9];
                    if (j4 != j2) {
                        dLog = Math.log(j4);
                    }
                    dArr[i9] = dLog;
                    i9++;
                    j = j2;
                }
                int i10 = length2 - 1;
                double d = dArr[i10] - dArr[i3];
                int i11 = i3;
                while (i11 < i10) {
                    double d2 = dArr[i11];
                    i11++;
                    sz2Var.j(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i11]) * 0.5d) - dArr[i3]) / d), Integer.valueOf(i8));
                    i3 = i3;
                }
            }
            i8++;
            i3 = i3;
            j = j2;
        }
        int i12 = i3;
        Collection s1Var = sz2Var.p;
        if (s1Var == null) {
            s1Var = new s1(i, sz2Var);
            sz2Var.p = s1Var;
        }
        yw1 yw1VarK = yw1.k(s1Var);
        for (int i13 = i12; i13 < yw1VarK.size(); i13++) {
            int iIntValue = ((Integer) yw1VarK.get(i13)).intValue();
            int i14 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i14;
            jArr3[iIntValue] = jArr[iIntValue][i14];
            e6.u(arrayList, jArr3);
        }
        for (int i15 = i12; i15 < r41VarArr.length; i15++) {
            if (arrayList.get(i15) != null) {
                jArr3[i15] = jArr3[i15] * 2;
            }
        }
        e6.u(arrayList, jArr3);
        uw1 uw1VarJ2 = yw1.j();
        for (int i16 = i12; i16 < arrayList.size(); i16++) {
            uw1 uw1Var = (uw1) arrayList.get(i16);
            uw1VarJ2.c(uw1Var == null ? gy3.r : uw1Var.f());
        }
        gy3 gy3VarF = uw1VarJ2.f();
        t41[] t41VarArr = new t41[r41VarArr.length];
        int i17 = i12;
        while (i17 < r41VarArr.length) {
            r41 r41Var3 = r41VarArr[i17];
            if (r41Var3 != null) {
                int[] iArr3 = r41Var3.b;
                if (iArr3.length == 0) {
                    i2 = i12;
                } else {
                    int length3 = iArr3.length;
                    sv4 sv4Var = r41Var3.a;
                    if (length3 == 1) {
                        i2 = i12;
                        e6Var = new ys0(sv4Var, new int[]{iArr3[i12]}, i2, i);
                    } else {
                        i2 = i12;
                        e6Var = new e6(sv4Var, iArr3, cpVar, (yw1) gy3VarF.get(i17));
                    }
                    t41VarArr[i17] = e6Var;
                }
            } else {
                i2 = i12;
            }
            i17++;
            i12 = i2;
        }
        return t41VarArr;
    }

    public k03 n() {
        k03 k03Var = new k03();
        App.f(false).a().q("byYear", 1, 0, 1900, Integer.valueOf(Calendar.getInstance().get(1))).enqueue(new d34(5, new r8(this, k03Var, 0)));
        return k03Var;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
    }

    public boolean p(tb1 tb1Var) {
        String str = tb1Var.n;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    @Override // defpackage.d14
    public q04 q(q04 q04Var, db3 db3Var) {
        return q04Var;
    }

    public String toString() {
        switch (this.n) {
            case 4:
                return "NeverEqualPolicy";
            case 5:
                return "NoDeclaredBrand";
            case 11:
                return "ReferentialEqualityPolicy";
            case 13:
                return "Start";
            case 14:
                return "StructuralEqualityPolicy";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.fv2
    public boolean w(qu2 qu2Var) {
        return false;
    }
}
