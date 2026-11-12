package defpackage;

import android.os.Build;
import android.os.LocaleList;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class da implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ ra o;

    public /* synthetic */ da(ra raVar, int i) {
        this.n = i;
        this.o = raVar;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int i = this.n;
        int i2 = 0;
        ra raVar = this.o;
        switch (i) {
            case 0:
                id idVar = raVar.c0;
                if (idVar != null) {
                    int childCount = idVar.getChildCount();
                    while (i2 < childCount) {
                        idVar.getChildAt(i2);
                        i2++;
                    }
                }
                return j15.a;
            case 1:
                if (Build.VERSION.SDK_INT > 28 && raVar.isAttachedToWindow()) {
                    if (ra.Y0 == null) {
                        u6 u6Var = new u6(1);
                        ra.Y0 = u6Var;
                        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                        try {
                            if (ra.U0 == null) {
                                ra.U0 = Class.forName("android.os.SystemProperties");
                            }
                            if (ra.W0 == null) {
                                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                                Class cls = ra.U0;
                                ra.W0 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                            }
                            Method method = ra.W0;
                            if (method != null) {
                                method.invoke(null, u6Var);
                            }
                            break;
                        } catch (Throwable unused) {
                        }
                        StrictMode.setVmPolicy(vmPolicy);
                    }
                    q03 q03Var = ra.X0;
                    synchronized (q03Var) {
                        q03Var.a(raVar);
                    }
                }
                return j15.a;
            case 2:
                Boolean bool = (Boolean) raVar.C.getValue();
                bool.getClass();
                return bool;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                LocaleList locales = raVar.getConfiguration().getLocales();
                wd2 wd2Var = new wd2(new xd2(locales));
                if (locales.isEmpty()) {
                    wd2Var = new wd2(new xd2(LocaleList.getDefault()));
                }
                int iB = wd2Var.b();
                ArrayList arrayList = new ArrayList(iB);
                while (i2 < iB) {
                    Locale locale = wd2Var.a.a.get(i2);
                    locale.getClass();
                    arrayList.add(new ud2(locale));
                    i2++;
                }
                return new vd2(arrayList);
            default:
                MotionEvent motionEvent = raVar.z0;
                if (motionEvent != null) {
                    boolean zContains = gb.P(9, 7, 8).contains(Integer.valueOf(motionEvent.getActionMasked()));
                    MotionEvent motionEvent2 = raVar.z0;
                    if (motionEvent2 != null && motionEvent2.getButtonState() == 0) {
                        i2 = 1;
                    }
                    if (zContains && i2 != 0) {
                        raVar.A0 = SystemClock.uptimeMillis();
                        raVar.post(raVar.H0);
                    }
                }
                raVar.N0.invoke();
                return j15.a;
        }
    }
}
