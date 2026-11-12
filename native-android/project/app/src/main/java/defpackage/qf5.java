package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.util.Set;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qf5 implements Runnable {
    public final /* synthetic */ int n;
    public final Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ qf5(int i, Object obj, Object obj2) {
        this.n = i;
        this.p = obj;
        this.o = obj2;
    }

    private final void a() {
        Exception exc;
        synchronized (((hk5) this.p).c) {
            e93 e93Var = (e93) ((hk5) this.p).d;
            jw jwVar = (jw) this.o;
            synchronized (jwVar.o) {
                exc = (Exception) jwVar.r;
            }
            ji2.m(exc);
            e93Var.a(exc);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        eu1 vk5Var = null;
        switch (this.n) {
            case 0:
                rf5 rf5Var = (rf5) this.p;
                dg5 dg5Var = (dg5) this.o;
                ka0 ka0Var = dg5Var.o;
                if (ka0Var.o == 0) {
                    ig5 ig5Var = dg5Var.p;
                    ji2.m(ig5Var);
                    ka0 ka0Var2 = ig5Var.p;
                    if (ka0Var2.o != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(ka0Var2)), new Exception());
                        rf5Var.l.a(ka0Var2);
                        rf5Var.k.b();
                        return;
                    }
                    nq nqVar = rf5Var.l;
                    IBinder iBinder = ig5Var.o;
                    if (iBinder != null) {
                        int i = g4.f;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        vk5Var = iInterfaceQueryLocalInterface instanceof eu1 ? (eu1) iInterfaceQueryLocalInterface : new vk5(iBinder);
                    }
                    Set set = rf5Var.i;
                    nqVar.getClass();
                    if (vk5Var == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        nqVar.a(new ka0(4));
                    } else {
                        nqVar.q = vk5Var;
                        nqVar.r = set;
                        if (nqVar.n) {
                            ((me) nqVar.o).j0(vk5Var, set);
                        }
                    }
                } else {
                    rf5Var.l.a(ka0Var);
                }
                rf5Var.k.b();
                return;
            case 1:
                if (((df5) this.p).o) {
                    ka0 ka0Var3 = ((eg5) this.o).b;
                    Object[] objArr = (ka0Var3.o == 0 || ka0Var3.p == null) ? false : true;
                    df5 df5Var = (df5) this.p;
                    if (objArr == true) {
                        x92 x92Var = df5Var.n;
                        Activity activityA = df5Var.a();
                        PendingIntent pendingIntent = ka0Var3.p;
                        ji2.m(pendingIntent);
                        int i2 = ((eg5) this.o).a;
                        int i3 = GoogleApiActivity.o;
                        Intent intent = new Intent(activityA, (Class<?>) GoogleApiActivity.class);
                        intent.putExtra("pending_intent", pendingIntent);
                        intent.putExtra("failing_client_id", i2);
                        intent.putExtra("notify_manager", false);
                        x92Var.startActivityForResult(intent, 1);
                        return;
                    }
                    if (df5Var.r.a(ka0Var3.o, df5Var.a(), null) != null) {
                        df5 df5Var2 = (df5) this.p;
                        df5Var2.r.g(df5Var2.a(), df5Var2.n, ka0Var3.o, (df5) this.p);
                        return;
                    }
                    int i4 = ka0Var3.o;
                    df5 df5Var3 = (df5) this.p;
                    if (i4 != 18) {
                        int i5 = ((eg5) this.o).a;
                        df5Var3.p.set(null);
                        df5Var3.t.g(ka0Var3, i5);
                        return;
                    }
                    ej1 ej1Var = df5Var3.r;
                    Activity activityA2 = df5Var3.a();
                    ej1Var.getClass();
                    ProgressBar progressBar = new ProgressBar(activityA2, null, R.attr.progressBarStyleLarge);
                    progressBar.setIndeterminate(true);
                    progressBar.setVisibility(0);
                    AlertDialog.Builder builder = new AlertDialog.Builder(activityA2);
                    builder.setView(progressBar);
                    builder.setMessage(lf5.b(activityA2, 18));
                    builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                    AlertDialog alertDialogCreate = builder.create();
                    ej1.e(activityA2, alertDialogCreate, "GooglePlayServicesUpdatingDialog", df5Var3);
                    df5 df5Var4 = (df5) this.p;
                    Context applicationContext = df5Var4.a().getApplicationContext();
                    wo0 wo0Var = new wo0();
                    wo0Var.o = this;
                    wo0Var.n = alertDialogCreate;
                    df5Var4.r.getClass();
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addDataScheme("package");
                    jf5 jf5Var = new jf5(wo0Var);
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 33) {
                        applicationContext.registerReceiver(jf5Var, intentFilter, i6 < 33 ? 0 : 2);
                    } else {
                        applicationContext.registerReceiver(jf5Var, intentFilter);
                    }
                    jf5Var.a = applicationContext;
                    if (lj1.a(applicationContext)) {
                        return;
                    }
                    df5 df5Var5 = (df5) this.p;
                    df5Var5.p.set(null);
                    zw2 zw2Var = df5Var5.t.A;
                    zw2Var.sendMessage(zw2Var.obtainMessage(3));
                    if (alertDialogCreate.isShowing()) {
                        alertDialogCreate.dismiss();
                    }
                    synchronized (jf5Var) {
                        try {
                            Context context = jf5Var.a;
                            if (context != null) {
                                context.unregisterReceiver(jf5Var);
                            }
                            jf5Var.a = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
            case 2:
                df5 df5Var6 = (df5) this.o;
                ph5 ph5Var = (ph5) this.p;
                if (ph5Var.o > 0) {
                    Bundle bundle = ph5Var.p;
                    df5Var6.c(bundle != null ? bundle.getBundle("ConnectionlessLifecycleHelper") : null);
                }
                if (ph5Var.o >= 2) {
                    df5Var6.f();
                }
                if (ph5Var.o >= 3) {
                    df5Var6.d();
                }
                if (ph5Var.o >= 4) {
                    df5Var6.g();
                    return;
                }
                return;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                df5 df5Var7 = (df5) this.o;
                vi5 vi5Var = (vi5) this.p;
                if (vi5Var.m0 > 0) {
                    Bundle bundle2 = vi5Var.n0;
                    df5Var7.c(bundle2 != null ? bundle2.getBundle("ConnectionlessLifecycleHelper") : null);
                }
                if (vi5Var.m0 >= 2) {
                    df5Var7.f();
                }
                if (vi5Var.m0 >= 3) {
                    df5Var7.d();
                }
                if (vi5Var.m0 >= 4) {
                    df5Var7.g();
                    return;
                }
                return;
            case 4:
                synchronized (((hk5) this.p).c) {
                    ((b93) ((hk5) this.p).d).a((jw) this.o);
                    break;
                }
                return;
            case 5:
                a();
                return;
            default:
                synchronized (((hk5) this.p).c) {
                    cg0 cg0Var = (cg0) ((hk5) this.p).d;
                    Object objN = ((jw) this.o).n();
                    switch (cg0Var.a) {
                        case 0:
                            cg0Var.b.invoke(objN);
                            break;
                        case 1:
                            cg0Var.b.invoke(objN);
                            break;
                        case 2:
                            cg0Var.b.invoke(objN);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            cg0Var.b.invoke(objN);
                            break;
                        case 4:
                            cg0Var.b.invoke(objN);
                            break;
                        default:
                            cg0Var.b.invoke(objN);
                            break;
                    }
                    break;
                }
                return;
        }
    }
}
