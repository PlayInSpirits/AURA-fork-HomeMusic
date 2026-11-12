package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qt4 extends lu3 {
    public static final String d = null;
    public static final String e = null;
    public final boolean b;
    public final boolean c;

    static {
        String r0 = f35.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public qt4() {
        this.b = false;
        this.c = false;
    }

    @Override // defpackage.lu3
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.lu3
    public final Bundle c() {
        Bundle r0 = new Bundle();
        r0.putInt(lu3.a, 3);
        r0.putBoolean(d, this.b);
        r0.putBoolean(e, this.c);
        return r0;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof qt4) == false) goto L14;
        qt4 r4 = (qt4) r3;
        if (this.c == r4.c) goto L8;
        return false;
    L8:
        if (this.b != r4.b) goto L13;
        return true;
    L13:
        return false;
    L14:
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public qt4(boolean r2) {
        this.b = true;
        this.c = r2;
    }
}
