package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uf {
    public static void a(Configuration r1, Configuration r2, Configuration r3) {
        LocaleList r4 = r1.getLocales();
        LocaleList r0 = r2.getLocales();
        if (r4.equals(r0) == true) goto L6;
        r3.setLocales(r0);
        r3.locale = r2.locale;
        return;
    }

    public static wd2 b(Configuration r0) {
        return wd2.a(r0.getLocales().toLanguageTags());
    }

    public static void c(wd2 r0) {
        LocaleList.setDefault(LocaleList.forLanguageTags(r0.a.a.toLanguageTags()));
    }

    public static void d(Configuration r0, wd2 r1) {
        r0.setLocales(LocaleList.forLanguageTags(r1.a.a.toLanguageTags()));
    }
}
