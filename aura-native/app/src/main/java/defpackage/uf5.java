package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class uf5 extends zw2 {
    public final Context b;
    public final /* synthetic */ ej1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf5(ej1 ej1Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 2);
        this.c = ej1Var;
        this.b = context.getApplicationContext();
    }

    @Override // defpackage.zw2, android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        int i2 = fj1.a;
        ej1 ej1Var = this.c;
        Context context = this.b;
        int b = ej1Var.b(context, i2);
        int i3 = lj1.e;
        if (b == 1 || b == 2 || b == 3 || b == 9) {
            Intent a = ej1Var.a(b, context, "n");
            ej1Var.f(context, b, a == null ? null : PendingIntent.getActivity(context, 0, a, 201326592));
        }
    }
}
