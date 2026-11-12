package defpackage;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ae0 {
    public static final Pattern k = null;
    public static final Pattern l = null;
    public static final Pattern m = null;
    public static final Pattern n = null;
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;

    static {
        k = Pattern.compile("(\\d{2,4})[^\\d]*");
        l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
        m = Pattern.compile("(\\d{1,2})[^\\d]*");
        n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    }

    public ae0(String r1, String r2, long r3, String r5, String r6, boolean r7, boolean r8, boolean r9, boolean r10, String r11) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r5;
        this.e = r6;
        this.f = r7;
        this.g = r8;
        this.h = r9;
        this.i = r10;
        this.j = r11;
    }

    public final boolean equals(Object r5) {
        if ((r5 instanceof ae0) == false) goto L26;
        ae0 r6 = (ae0) r5;
        if (r6.a.equals(this.a) == true) goto L7;
        return false;
    L7:
        if (r6.b.equals(this.b) == true) goto L9;
        return false;
    L9:
        if (r6.c == this.c) goto L11;
        return false;
    L11:
        if (r6.d.equals(this.d) == true) goto L13;
        return false;
    L13:
        if (r6.e.equals(this.e) == true) goto L15;
        return false;
    L15:
        if (r6.f == this.f) goto L17;
        return false;
    L17:
        if (r6.g == this.g) goto L19;
        return false;
    L19:
        if (r6.h == this.h) goto L21;
        return false;
    L21:
        if (r6.i == this.i) goto L23;
        return false;
    L23:
        if (h12.c(r6.j, this.j) == false) goto L37;
        return true;
    L37:
        return false;
    L26:
        return false;
    }

    public final int hashCode() {
        int r0 = f34.e(this.a, 527, 31);
        int r1 = xa3.b(f34.e(this.b, r0, 31), 31, this.c);
        int r2 = f34.e(this.d, r1, 31);
        int r3 = xa3.c(xa3.c(xa3.c(xa3.c(f34.e(this.e, r2, 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String r5 = this.j;
        if (r5 == null) goto L5;
        int r6 = r5.hashCode();
    L7:
        return r3 + r6;
    L5:
        r6 = 0;
        goto L7
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(this.a);
        r0.append('=');
        r0.append(this.b);
        if (this.h == false) goto L9;
        long r3 = this.c;
        if (r3 != Long.MIN_VALUE) goto L7;
        r0.append("; max-age=0");
        goto L9
    L7:
        r0.append("; expires=");
        Date r1 = new Date(r3);
        String r2 = ((DateFormat) mi0.a.get()).format(r1);
        r2.getClass();
        r0.append(r2);
    L9:
        if (this.i == true) goto L11;
        r0.append("; domain=");
        r0.append(this.d);
    L11:
        r0.append("; path=");
        r0.append(this.e);
        if (this.f == false) goto L15;
        r0.append("; secure");
    L15:
        if (this.g == false) goto L17;
        r0.append("; httponly");
    L17:
        String r5 = this.j;
        if (r5 == null) goto L21;
        r0.append("; samesite=");
        r0.append(r5);
    L21:
        return r0.toString();
    }
}
