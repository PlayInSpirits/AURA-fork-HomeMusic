package defpackage;

import android.os.Build;
import android.os.LocaleList;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class da implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ ra o;

    public /* synthetic */ da(ra r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int r0 = this.n;
        int r1 = 0;
        ra r9 = this.o;
        switch(r0) {
            case 0: goto L58;
            case 1: goto L27;
            case 2: goto L24;
            case 3: goto L16;
            default: goto L4;
        };
    L4:
        MotionEvent r2 = r9.z0;
        if (r2 == null) goto L14;
        boolean r3 = gb.P(new Integer[]{9, 7, 8}).contains(Integer.valueOf(r2.getActionMasked()));
        MotionEvent r4 = r9.z0;
        if (r4 != null) goto L9;
    L11:
        if (r3 == false) goto L14;
        if (r1 == 0) goto L14;
        r9.A0 = SystemClock.uptimeMillis();
        r9.post(r9.H0);
        goto L14
    L9:
        if (r4.getButtonState() != 0) goto L11;
        r1 = 1;
    L14:
        r9.N0.invoke();
        return j15.a;
    L16:
        LocaleList r10 = r9.getConfiguration().getLocales();
        wd2 r5 = new wd2(new xd2(r10));
        if (r10.isEmpty() == false) goto L19;
        r5 = new wd2(new xd2(LocaleList.getDefault()));
    L19:
        int r11 = r5.b();
        ArrayList r6 = new ArrayList(r11);
    L20:
        if (r1 >= r11) goto L23;
        Locale r7 = r5.a.a.get(r1);
        r7.getClass();
        r6.add(new ud2(r7));
        r1 = r1 + 1;
        goto L20
    L23:
        return new vd2(r6);
    L24:
        Boolean r12 = (Boolean) r9.C.getValue();
        r12.getClass();
        return r12;
    L58:
        id r13 = r9.c0;
        if (r13 == null) goto L64;
        int r8 = r13.getChildCount();
    L61:
        if (r1 >= r8) goto L64;
        r13.getChildAt(r1);
        r1 = r1 + 1;
    L64:
        return j15.a;
    L27:
        if (Build.VERSION.SDK_INT <= 28) goto L57;
        if (r9.isAttachedToWindow() == false) goto L57;
        if (ra.Y0 != null) goto L48;
        u6 r14 = new u6(1);
        ra.Y0 = r14;
        StrictMode.VmPolicy r15 = StrictMode.getVmPolicy();
        if (ra.U0 != null) goto L38;
        ra.U0 = Class.forName("android.os.SystemProperties");     // Catch: Throwable -> L65
    L38:
        if (ra.W0 != null) goto L44;
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);     // Catch: Throwable -> L65
        Class r16 = ra.U0;     // Catch: Throwable -> L65
        if (r16 == null) goto L42;
        Method r17 = r16.getDeclaredMethod("addChangeCallback", new Class[]{Runnable.class});     // Catch: Throwable -> L65
    L43:
        ra.W0 = r17;     // Catch: Throwable -> L65
        goto L44
    L42:
        r17 = null;
    L44:
        Method r18 = ra.W0;     // Catch: Throwable -> L65
        if (r18 == null) goto L47;
        r18.invoke(null, new Object[]{r14});     // Catch: Throwable -> L65
    L47:
        StrictMode.setVmPolicy(r15);
    L48:
        q03 r19 = ra.X0;
        monitor-enter(r19);
        r19.a(r9);     // Catch: Throwable -> L53
        monitor-exit(r19);
    L53:
        th = move-exception;
        throw th;
    L57:
        return j15.a;
    }
}
