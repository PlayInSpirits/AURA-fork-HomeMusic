package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dc4 extends jc4 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public dc4(ArrayList r1, Matrix r2) {
        this.c = r1;
        this.d = r2;
    }

    @Override // defpackage.jc4
    public final void a(Matrix r5, yb4 r6, int r7, Canvas r8) {
        ArrayList r9 = this.c;
        int r0 = r9.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        Object r2 = r9.get(r1);
        r1 = r1 + 1;
        ((jc4) r2).a(this.d, r6, r7, r8);
        goto L3
    }
}
