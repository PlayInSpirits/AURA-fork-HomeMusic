package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.model.LyricsCache;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pb0 implements Runnable {
    public final /* synthetic */ int n;
    public Object o;
    public Object p;
    public Object q;

    public pb0(Intent r2, Context r3, BroadcastReceiver.PendingResult r4) {
        this.n = 0;
        this.o = r2;
        this.p = r3;
        this.q = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r1 = 1;
        switch(this.n) {
            case 0: goto L37;
            case 1: goto L35;
            case 2: goto L24;
            case 3: goto L22;
            case 4: goto L17;
            case 5: goto L46;
            default: goto L5;
        };
    L17:
        bq4 r0 = (bq4) this.q;
        pn2 r2 = (pn2) r0.q;
        Iterator r3 = ((li) r2.r.keySet()).iterator();
    L18:
        ki r4 = (ki) r3;
        if (r4.hasNext() == false) goto L21;
        oj2 r5 = (oj2) r2.r.get((IBinder) r4.next());
        r5.getClass();
        r0.o(r5, (String) this.o, (Bundle) this.p);
        goto L18
    L21:
        return;
    L22:
        this.q = (LyricsCache) xl.E((s24) ((rf2) this.o).n, true, false, new rs0(10, (String) this.p));
        return;
    L24:
        CoordinatorLayout r6 = (CoordinatorLayout) this.o;
        ql1 r7 = (ql1) this.q;
        View r8 = (View) this.p;
        if (r8 == null) goto L51;
        OverScroller r9 = r7.q;
        if (r9 != null) goto L29;
        return;
    L29:
        if (r9.computeScrollOffset() == false) goto L31;
        r7.A(r6, r8, r7.q.getCurrY());
        r8.postOnAnimation(this);
        return;
    L31:
        AppBarLayout r10 = (AppBarLayout) r8;
        ((AppBarLayout.BaseBehavior) r7).F(r6, r10);
        if (r10.y == false) goto L54;
        r10.g(r10.h(AppBarLayout.BaseBehavior.C(r6)));
        return;
    L54:
        return;
    L51:
        return;
    L35:
        ss0 r11 = (ss0) this.o;
        this.q = (Download) xl.E((s24) r11.n, true, false, new rs0(r11, (String) this.p));
        return;
    L37:
        BroadcastReceiver.PendingResult r12 = (BroadcastReceiver.PendingResult) this.q;
        Context r13 = (Context) this.p;
        Intent r14 = (Intent) this.o;
        boolean r15 = r14.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);     // Catch: Throwable -> L41
        boolean r16 = r14.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);     // Catch: Throwable -> L41
        boolean r17 = r14.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);     // Catch: Throwable -> L41
        boolean r18 = r14.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);     // Catch: Throwable -> L41
        cx.f().b(ConstraintProxyUpdateReceiver.a, "Updating proxies: (BatteryNotLowProxy (" + r15 + "), BatteryChargingProxy (" + r16 + "), StorageNotLowProxy (" + r17 + "), NetworkStateProxy (" + r18 + "), ");     // Catch: Throwable -> L41
        yb3.a(r13, ConstraintProxy$BatteryNotLowProxy.class, r15);     // Catch: Throwable -> L41
        yb3.a(r13, ConstraintProxy$BatteryChargingProxy.class, r16);     // Catch: Throwable -> L41
        yb3.a(r13, ConstraintProxy$StorageNotLowProxy.class, r17);     // Catch: Throwable -> L41
        yb3.a(r13, ConstraintProxy$NetworkStateProxy.class, r18);     // Catch: Throwable -> L41
        r12.finish();
        return;
    L41:
        th = move-exception;
        r12.finish();
        throw th;
    L46:
        Object r19 = ((ta1) this.o).call();     // Catch: Exception -> L14
    L15:
        ((Handler) this.q).post(new lg1(24, (ua1) this.p, r19));
        return;
    L14:
        r19 = null;
        goto L15
    L5:
        if (((yf4) this.q).c == false) goto L7;
        ((qi3) this.o).R(1.0f);
        return;
    L7:
        float[] r20 = (float[]) this.p;
        r20[0] = Math.max(0.0f, r20[0] - 0.025f);
        ((qi3) this.o).R(((float[]) this.p)[0]);
        float r21 = ((float[]) this.p)[0];
        yf4 r22 = (yf4) this.q;
        if (r21 <= 0.0f) goto L10;
        r22.a.postDelayed(this, 250);
        return;
    L10:
        r22.a(true);
        ((qi3) this.o).c();
        ((yf4) this.q).a.postDelayed(new at1((qi3) this.o, r1), 300);
    }

    public /* synthetic */ pb0(Object r1, Object r2, Object r3, int r4) {
        this.n = r4;
        this.q = r1;
        this.o = r2;
        this.p = r3;
    }

    public /* synthetic */ pb0(Object r1, String r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    public /* synthetic */ pb0() {
        this.n = 5;
    }
}
