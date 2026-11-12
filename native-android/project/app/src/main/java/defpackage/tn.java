package defpackage;

import android.app.NotificationChannel;
import android.view.autofill.AutofillId;
import java.lang.invoke.MethodHandles;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class tn {
    public static /* synthetic */ NotificationChannel b(String str) {
        return new NotificationChannel("default_channel_id", str, 2);
    }

    public static /* bridge */ /* synthetic */ AutofillId f(Object obj) {
        return (AutofillId) obj;
    }

    public static /* bridge */ /* synthetic */ Class j() {
        return MethodHandles.Lookup.class;
    }

    public static /* bridge */ /* synthetic */ MethodHandles.Lookup n(Object obj) {
        return (MethodHandles.Lookup) obj;
    }
}
