package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class li3 extends x65 {
    public final k03 b;
    public final k03 c;

    public li3() {
        this.b = new k03(null);
        this.c = new k03(Boolean.FALSE);
    }

    public final void c(String r3, boolean r4) {
        k03 r0 = this.b;
        if (Objects.equals(r0.d(), r3) == true) goto L5;
        r0.i(r3);
    L5:
        k03 r2 = this.c;
        if (Objects.equals(r2.d(), Boolean.valueOf(r4)) == true) goto L9;
        r2.i(Boolean.valueOf(r4));
        return;
    }
}
