package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jd1 implements id1 {
    public final String a;
    public final int b;
    public final /* synthetic */ ld1 c;

    public jd1(ld1 r1, String r2, int r3) {
        this.c = r1;
        this.a = r2;
        this.b = r3;
    }

    @Override // defpackage.id1
    public final boolean a(ArrayList r10, ArrayList r11) {
        kc1 r0 = this.c.y;
        if (r0 != null) goto L5;
    L11:
        int r7 = this.b;
        return this.c.S(r10, r11, this.a, r7, 1);
    L5:
        if (this.b >= 0) goto L11;
        if (this.a != null) goto L11;
        if (r0.m().R(-1, 0) == false) goto L11;
        return false;
    }
}
