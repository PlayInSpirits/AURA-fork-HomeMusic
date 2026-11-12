package defpackage;

import android.app.Application;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class iu3 extends hd {
    public final hh3 c;
    public final k03 d;

    public iu3(Application r2) {
        super(r2);
        this.d = new k03(null);
        this.c = new hh3(10);
    }

    public final k03 c(le1 r4) {
        k03 r0 = this.c.j();
        k03 r3 = this.d;
        Objects.requireNonNull(r3);
        r0.e(r4, new g7(r3, 0));
        return r3;
    }
}
