package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wd2 {
    public static final wd2 b = null;
    public final xd2 a;

    static {
        b = new wd2(new xd2(new LocaleList(new Locale[0])));
    }

    public wd2(xd2 r1) {
        this.a = r1;
    }

    public static wd2 a(String r4) {
        if (r4 == null) goto L12;
        if (r4.isEmpty() == true) goto L12;
        String[] r5 = r4.split(",", -1);
        int r0 = r5.length;
        Locale[] r1 = new Locale[r0];
        int r2 = 0;
    L7:
        if (r2 >= r0) goto L10;
        r1[r2] = Locale.forLanguageTag(r5[r2]);
        r2 = r2 + 1;
        goto L7
    L10:
        return new wd2(new xd2(new LocaleList(r1)));
    L12:
        return b;
    }

    public final int b() {
        return this.a.a.size();
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof wd2) == false) goto L8;
        xd2 r3 = ((wd2) r2).a;
        if (this.a.equals(r3) == false) goto L10;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
