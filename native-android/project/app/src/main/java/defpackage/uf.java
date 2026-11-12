package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uf {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static wd2 b(Configuration configuration) {
        return wd2.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(wd2 wd2Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(wd2Var.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, wd2 wd2Var) {
        configuration.setLocales(LocaleList.forLanguageTags(wd2Var.a.a.toLanguageTags()));
    }
}
