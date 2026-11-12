package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class eq0 extends yo0 {
    public int m;

    public eq0(ba5 r1) {
        super(r1);
        if ((r1 instanceof up1) == false) goto L6;
        this.e = 2;
        return;
    L6:
        this.e = 3;
    }

    @Override // defpackage.yo0
    public final void d(int r3) {
        if (this.j == true) goto L8;
        this.j = true;
        this.g = r3;
        ArrayList r2 = this.k;
        int r4 = r2.size();
        int r0 = 0;
    L6:
        if (r0 >= r4) goto L10;
        Object r1 = r2.get(r0);
        r0 = r0 + 1;
        uo0 r5 = (uo0) r1;
        r5.a(r5);
        goto L6
    L10:
        return;
    }
}
