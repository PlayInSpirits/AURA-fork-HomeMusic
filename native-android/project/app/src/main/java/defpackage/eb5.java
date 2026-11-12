package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class eb5 extends db5 {
    public eb5(pb5 r1, WindowInsets r2) {
        super(r1, r2);
    }

    @Override // defpackage.mb5
    public pb5 a() {
        return pb5.g(vl4.d(this.c), null);
    }

    @Override // defpackage.cb5, defpackage.mb5
    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof eb5) == true) goto L8;
        return false;
    L8:
        eb5 r6 = (eb5) r5;
        if (Objects.equals(this.c, r6.c) == true) goto L11;
    L15:
        return false;
    L11:
        if (Objects.equals(this.g, r6.g) == false) goto L15;
        if (cb5.L(this.h, r6.h) == false) goto L15;
        return true;
    }

    @Override // defpackage.mb5
    public tr0 g() {
        DisplayCutout r1 = vl4.c(this.c);
        if (r1 != null) goto L7;
        return null;
    L7:
        return new tr0(r1);
    }

    @Override // defpackage.mb5
    public int hashCode() {
        return this.c.hashCode();
    }
}
