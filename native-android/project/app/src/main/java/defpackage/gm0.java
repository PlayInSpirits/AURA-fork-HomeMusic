package defpackage;

import android.app.NotificationChannel;
import android.view.autofill.AutofillManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class gm0 {
    public static /* synthetic */ NotificationChannel C(String str) {
        return new NotificationChannel("lan_receiver", str, 2);
    }

    public static /* synthetic */ NotificationChannel c(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* synthetic */ NotificationChannel d(String str, String str2) {
        return new NotificationChannel(str, str2, 2);
    }

    public static /* bridge */ /* synthetic */ AutofillManager j(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class l() {
        return AutofillManager.class;
    }

    public static /* synthetic */ void n() {
    }

    public static /* synthetic */ NotificationChannel y(String str) {
        return new NotificationChannel("homemusic_hub", str, 3);
    }
}
