package defpackage;

import android.app.LocaleManager;
import android.os.LocaleList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nf {
    public static LocaleList a(Object r0) {
        return ((LocaleManager) r0).getApplicationLocales();
    }

    public static void b(Object r0, LocaleList r1) {
        ((LocaleManager) r0).setApplicationLocales(r1);
    }
}
