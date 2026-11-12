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
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pb0 implements Runnable {
    public final /* synthetic */ int n;
    public Object o;
    public Object p;
    public Object q;

    public pb0(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
        this.n = 0;
        this.o = intent;
        this.p = context;
        this.q = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        OverScroller overScroller;
        int i = 1;
        switch (this.n) {
            case 0:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.q;
                Context context = (Context) this.p;
                Intent intent = (Intent) this.o;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    cx.f().b(ConstraintProxyUpdateReceiver.a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                    yb3.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    yb3.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    yb3.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    yb3.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 1:
                ss0 ss0Var = (ss0) this.o;
                this.q = (Download) xl.E((s24) ss0Var.n, true, false, new rs0(ss0Var, (String) this.p));
                return;
            case 2:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.o;
                ql1 ql1Var = (ql1) this.q;
                View view = (View) this.p;
                if (view == null || (overScroller = ql1Var.q) == null) {
                    return;
                }
                if (overScroller.computeScrollOffset()) {
                    ql1Var.A(coordinatorLayout, view, ql1Var.q.getCurrY());
                    view.postOnAnimation(this);
                    return;
                }
                AppBarLayout appBarLayout = (AppBarLayout) view;
                ((AppBarLayout.BaseBehavior) ql1Var).F(coordinatorLayout, appBarLayout);
                if (appBarLayout.y) {
                    appBarLayout.g(appBarLayout.h(AppBarLayout.BaseBehavior.C(coordinatorLayout)));
                    return;
                }
                return;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                this.q = (LyricsCache) xl.E((s24) ((rf2) this.o).n, true, false, new rs0(10, (String) this.p));
                return;
            case 4:
                bq4 bq4Var = (bq4) this.q;
                pn2 pn2Var = (pn2) bq4Var.q;
                Iterator it = ((li) pn2Var.r.keySet()).iterator();
                while (true) {
                    ki kiVar = (ki) it;
                    if (!kiVar.hasNext()) {
                        return;
                    }
                    oj2 oj2Var = (oj2) pn2Var.r.get((IBinder) kiVar.next());
                    oj2Var.getClass();
                    bq4Var.o(oj2Var, (String) this.o, (Bundle) this.p);
                }
                break;
            case 5:
                try {
                    objCall = ((ta1) this.o).call();
                    break;
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.q).post(new lg1(24, (ua1) this.p, objCall));
                return;
            default:
                if (((yf4) this.q).c) {
                    ((qi3) this.o).R(1.0f);
                    return;
                }
                float[] fArr = (float[]) this.p;
                fArr[0] = Math.max(0.0f, fArr[0] - 0.025f);
                ((qi3) this.o).R(((float[]) this.p)[0]);
                float f = ((float[]) this.p)[0];
                yf4 yf4Var = (yf4) this.q;
                if (f > 0.0f) {
                    yf4Var.a.postDelayed(this, 250L);
                    return;
                }
                yf4Var.a(true);
                ((qi3) this.o).c();
                ((yf4) this.q).a.postDelayed(new at1((qi3) this.o, i), 300L);
                return;
        }
    }

    public /* synthetic */ pb0(Object obj, Object obj2, Object obj3, int i) {
        this.n = i;
        this.q = obj;
        this.o = obj2;
        this.p = obj3;
    }

    public /* synthetic */ pb0(Object obj, String str, int i) {
        this.n = i;
        this.o = obj;
        this.p = str;
    }

    public /* synthetic */ pb0() {
        this.n = 5;
    }
}
