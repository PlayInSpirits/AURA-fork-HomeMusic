package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cw3 {
    public final /* synthetic */ RecyclerView a;

    public /* synthetic */ cw3(RecyclerView r1) {
        this.a = r1;
    }

    public void a(cx3 r8, n50 r9, n50 r10) {
        r8.p(false);
        RecyclerView r7 = this.a;
        pl0 r1 = (pl0) r7.c0;
        if (r9 == null) goto L11;
        r1.getClass();
        int r3 = r9.a;
        int r5 = r10.a;
        if (r3 == r5) goto L7;
    L10:
        boolean r11 = r1.g(r8, r3, r9.b, r5, r10.b);
    L12:
        if (r11 == false) goto L15;
        r7.Y();
        return;
    L15:
        return;
    L7:
        if (r9.b != r10.b) goto L10;
    L11:
        r1.l(r8);
        r8.a.setAlpha(0.0f);
        r1.i.add(r8);
        r11 = true;
        goto L12
    }

    public void b(cx3 r8, n50 r9, n50 r10) {
        RecyclerView r7 = this.a;
        r7.p.l(r8);
        r7.h(r8);
        r8.p(false);
        pl0 r1 = (pl0) r7.c0;
        r1.getClass();
        int r3 = r9.a;
        int r4 = r9.b;
        View r11 = r8.a;
        if (r10 != null) goto L6;
        int r0 = r11.getLeft();
    L5:
        int r5 = r0;
        if (r10 != null) goto L10;
        int r12 = r11.getTop();
    L9:
        int r6 = r12;
        if (r8.j() == true) goto L18;
        if (r3 != r5) goto L17;
        if (r4 == r6) goto L18;
    L17:
        r11.layout(r5, r6, r11.getWidth() + r5, r11.getHeight() + r6);
        boolean r13 = r1.g(r8, r3, r4, r5, r6);
    L19:
        if (r13 == false) goto L22;
        r7.Y();
        return;
    L22:
        return;
    L18:
        r1.l(r8);
        r1.h.add(r8);
        r13 = true;
        goto L19
    L10:
        r12 = r10.b;
        goto L9
    L6:
        r0 = r10.a;
        goto L5
    }
}
