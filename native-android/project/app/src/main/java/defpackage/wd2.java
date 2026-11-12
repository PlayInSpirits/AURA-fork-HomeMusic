package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wd2 {
    public static final wd2 b = new wd2(new xd2(new LocaleList(new Locale[0])));
    public final xd2 a;

    public wd2(xd2 xd2Var) {
        this.a = xd2Var;
    }

    public static wd2 a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(strArrSplit[i]);
        }
        return new wd2(new xd2(new LocaleList(localeArr)));
    }

    public final int b() {
        return this.a.a.size();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wd2) {
            return this.a.equals(((wd2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
