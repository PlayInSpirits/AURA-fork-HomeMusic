package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xa4 {
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    public final int a;
    public final String b;
    public final Bundle c;

    static {
        String r0 = f35.a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
    }

    public xa4(String r2, int r3, Bundle r4) {
        boolean r0 = true;
        if (r3 < 0) goto L7;
        if (r3 == 1) goto L7;
        r0 = false;
    L7:
        rr2.l(r0);
        this.a = r3;
        this.b = r2;
        this.c = r4;
    }

    public static xa4 a(Bundle r3) {
        int r0 = r3.getInt(d, 1000);
        String r1 = r3.getString(e, "");
        Bundle r4 = f35.n(r3.getBundle(f));
        if (r4 != null) goto L6;
        r4 = Bundle.EMPTY;
    L6:
        return new xa4(r1, r0, r4);
    }

    public final Bundle b() {
        Bundle r0 = new Bundle();
        r0.putInt(d, this.a);
        r0.putString(e, this.b);
        Bundle r3 = this.c;
        if (r3.isEmpty() == true) goto L5;
        r0.putBundle(f, r3);
    L5:
        return r0;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof xa4) == true) goto L8;
        return false;
    L8:
        xa4 r6 = (xa4) r5;
        if (this.a == r6.a) goto L11;
    L13:
        return false;
    L11:
        if (Objects.equals(this.b, r6.b) == false) goto L13;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public xa4(int r2, String r3) {
        this(r3, r2, Bundle.EMPTY);
    }
}
