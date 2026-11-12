package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class va4 {
    public static final gy3 d = null;
    public static final gy3 e = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public final int a;
    public final String b;
    public final Bundle c;

    static {
        d = yw1.o(40010);
        Object[] r0 = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        gh0.f(7, r0);
        e = yw1.i(7, r0);
        String r1 = f35.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public va4(int r3) {
        if (r3 == 0) goto L5;
        boolean r0 = true;
    L6:
        rr2.k("commandCode shouldn't be COMMAND_CODE_CUSTOM", r0);
        this.a = r3;
        this.b = "";
        this.c = Bundle.EMPTY;
        return;
    L5:
        r0 = false;
        goto L6
    }

    public static va4 a(Bundle r2) {
        int r0 = r2.getInt(f, 0);
        if (r0 != 0) goto L5;
        String r1 = r2.getString(g);
        r1.getClass();
        Bundle r3 = f35.n(r2.getBundle(h));
        if (r3 != null) goto L10;
        r3 = Bundle.EMPTY;
    L10:
        return new va4(r1, r3);
    L5:
        return new va4(r0);
    }

    public final Bundle b() {
        Bundle r0 = new Bundle();
        r0.putInt(f, this.a);
        r0.putString(g, this.b);
        r0.putBundle(h, this.c);
        return r0;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof va4) == true) goto L5;
        return false;
    L5:
        va4 r5 = (va4) r4;
        if (this.a == r5.a) goto L8;
    L11:
        return false;
    L8:
        if (TextUtils.equals(this.b, r5.b) == false) goto L11;
        return true;
    }

    public final int hashCode() {
        Integer r0 = Integer.valueOf(this.a);
        return Objects.hash(new Object[]{this.b, r0});
    }

    public va4(String r2, Bundle r3) {
        this.a = 0;
        r2.getClass();
        this.b = r2;
        r3.getClass();
        this.c = new Bundle(r3);
    }
}
