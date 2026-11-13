package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class u9 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ w9 o;

    public /* synthetic */ u9(w9 w9Var, int i) {
        this.n = i;
        this.o = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        w9 w9Var = this.o;
        switch (i) {
            case 0:
                w9Var.a.unregisterReceiver(w9Var.d);
                break;
            case 1:
                v9 v9Var = w9Var.d;
                IntentFilter intentFilter = new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED");
                int i2 = Build.VERSION.SDK_INT;
                Context context = w9Var.a;
                if (i2 >= 33) {
                    context.registerReceiver(v9Var, intentFilter, 2);
                } else {
                    context.registerReceiver(v9Var, intentFilter);
                }
                w9Var.a();
                break;
            default:
                Uri uri = w9.g;
                w9Var.a();
                break;
        }
    }
}
