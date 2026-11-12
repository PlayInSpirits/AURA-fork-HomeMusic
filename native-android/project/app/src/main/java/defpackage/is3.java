package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.homemusic.b;
import com.eddyizm.tempus.service.MediaService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class is3 {
    public static MediaService c;
    public static boolean d;
    public static final Handler a = new Handler(Looper.getMainLooper());
    public static final WeakHashMap b = new WeakHashMap();
    public static final k03 e = new k03(Boolean.FALSE);
    public static final u6 f = new u6(17);

    public static final void a(qi3 qi3Var, ao2 ao2Var) {
        qi3Var.getClass();
        ao2Var.getClass();
        Handler handler = a;
        u6 u6Var = f;
        handler.removeCallbacks(u6Var);
        gn2 gn2VarA = qi3Var.a();
        int iE = e(qi3Var);
        boolean zH = b.h(qi3Var);
        k03 k03Var = e;
        if (zH || a.j(qi3Var)) {
            if (iE > 0) {
                k03Var.k(Boolean.FALSE);
                return;
            }
            return;
        }
        if (gn2VarA != null) {
            boolean zU = xa3.u("continuous_play", true);
            int iH = qi3Var.h();
            boolean zC = c(gn2VarA);
            if (zU && zC && iH == 0 && iE < 7) {
                if (bo2.c.get()) {
                    return;
                }
                if (d) {
                    k03Var.k(Boolean.FALSE);
                    return;
                }
                gn2 gn2VarA2 = qi3Var.a();
                if (gn2VarA2 == null) {
                    gn2VarA2 = null;
                } else {
                    int[] iArrD = d(qi3Var);
                    int iL0 = ti.l0(iArrD, qi3Var.o0());
                    ArrayList arrayList = new ArrayList(iArrD.length);
                    for (int i : iArrD) {
                        arrayList.add(qi3Var.Y(i).a);
                    }
                    int i2 = -1;
                    if (iL0 >= 0 && iL0 < arrayList.size()) {
                        while (-1 < iL0) {
                            if (!ot1.c((String) arrayList.get(iL0))) {
                                i2 = iL0;
                                break;
                            }
                            iL0--;
                        }
                    }
                    if (i2 >= 0) {
                        gn2VarA2 = qi3Var.Y(iArrD[i2]);
                    }
                }
                if (gn2VarA2 == null) {
                    return;
                }
                if (!ud3.T()) {
                    handler.postDelayed(u6Var, 11000L);
                    return;
                }
                Log.d("QueueAhead", iE + " track(s) ahead: continuous play from " + gn2VarA2.a);
                bo2.c(gn2VarA2, ao2Var, null);
                return;
            }
        }
        if (iE > 0 || gn2VarA == null) {
            k03Var.k(Boolean.FALSE);
        }
    }

    public static final void b(qi3 qi3Var, int i, int i2) {
        d = i2 <= 0;
        k03 k03Var = e;
        if (qi3Var != null && i2 > 0 && i >= 0 && i < qi3Var.Q0() && (h12.c(k03Var.d(), Boolean.TRUE) || qi3Var.g() == 4)) {
            qi3Var.n(i, 0L);
            qi3Var.b();
            qi3Var.m0();
        }
        k03Var.k(Boolean.FALSE);
    }

    public static boolean c(gn2 gn2Var) {
        Bundle bundle = gn2Var.d.I;
        String string = bundle != null ? bundle.getString("type") : null;
        if (!h12.c(string, WaveOrigin.RADIO) && !h12.c(string, "podcast") && !h12.c(string, "audiobook")) {
            String str = gn2Var.a;
            str.getClass();
            if (!xm4.k0(str, "ir-", false)) {
                return true;
            }
        }
        return false;
    }

    public static final int[] d(qi3 qi3Var) {
        qi3Var.getClass();
        cu4 cu4VarX0 = qi3Var.x0();
        cu4VarX0.getClass();
        if (cu4VarX0.p()) {
            return new int[0];
        }
        boolean zD0 = qi3Var.D0();
        int iO = cu4VarX0.o();
        int[] iArr = new int[iO];
        int iA = cu4VarX0.a(zD0);
        int i = 0;
        while (iA != -1 && i < iO) {
            iArr[i] = iA;
            iA = cu4VarX0.e(iA, 0, zD0);
            i++;
        }
        return i == iO ? iArr : Arrays.copyOf(iArr, i);
    }

    public static final int e(qi3 qi3Var) {
        qi3Var.getClass();
        cu4 cu4VarX0 = qi3Var.x0();
        cu4VarX0.getClass();
        int iO0 = qi3Var.o0();
        if (cu4VarX0.p() || iO0 == -1 || iO0 >= cu4VarX0.o()) {
            return 0;
        }
        int i = 0;
        while (i < 7 && (iO0 = cu4VarX0.e(iO0, 0, qi3Var.D0())) != -1) {
            i++;
        }
        return i;
    }
}
