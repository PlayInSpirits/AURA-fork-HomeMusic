package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.media3.ui.PlayerControlView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dj3 implements oi3, View.OnClickListener, PopupWindow.OnDismissListener {
    public final /* synthetic */ PlayerControlView n;

    public dj3(PlayerControlView r1) {
        this.n = r1;
    }

    @Override // defpackage.oi3
    public final void B(qi3 r4, ni3 r5) {
        w71 r6 = r5.a;
        boolean r2 = r6.a(new int[]{4, 5, 13});
        PlayerControlView r3 = this.n;
        if (r2 == false) goto L6;
        float[] r7 = PlayerControlView.U0;
        r3.l();
    L6:
        if (r6.a(new int[]{4, 5, 7, 13}) == false) goto L9;
        float[] r8 = PlayerControlView.U0;
        r3.n();
    L9:
        if (r6.a(new int[]{8, 13}) == false) goto L12;
        float[] r9 = PlayerControlView.U0;
        r3.o();
    L12:
        if (r6.a(new int[]{9, 13}) == false) goto L15;
        float[] r10 = PlayerControlView.U0;
        r3.q();
    L15:
        if (r6.a(new int[]{8, 9, 11, 0, 16, 17, 13}) == false) goto L18;
        float[] r11 = PlayerControlView.U0;
        r3.k();
    L18:
        if (r6.a(new int[]{11, 0, 13}) == false) goto L21;
        float[] r12 = PlayerControlView.U0;
        r3.r();
    L21:
        if (r6.a(new int[]{12, 13}) == false) goto L24;
        float[] r13 = PlayerControlView.U0;
        r3.m();
    L24:
        if (r6.a(new int[]{2, 13}) == false) goto L27;
        float[] r14 = PlayerControlView.U0;
        r3.s();
        return;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r9) {
        PlayerControlView r8 = this.n;
        ImageView r0 = r8.Q;
        View r1 = r8.V;
        View r2 = r8.U;
        View r3 = r8.T;
        qj3 r4 = r8.n;
        qi3 r5 = r8.D0;
        if (r5 == null) goto L97;
        r4.g();
        if (r8.H != r9) goto L12;
        if (r5.S0(9) == false) goto L88;
        r5.H0();
        return;
    L88:
        return;
    L12:
        if (r8.G != r9) goto L18;
        if (r5.S0(7) == false) goto L89;
        r5.S();
        return;
    L89:
        return;
    L18:
        if (r8.J != r9) goto L26;
        if (r5.g() != 4) goto L22;
        return;
    L22:
        if (r5.S0(12) == false) goto L91;
        r5.I0();
        return;
    L91:
        return;
    L26:
        if (r8.K != r9) goto L32;
        if (r5.S0(11) == false) goto L92;
        r5.J0();
        return;
    L92:
        return;
    L32:
        if (r8.I != r9) goto L42;
        if (f35.d0(r5, r8.H0) == false) goto L38;
        f35.I(r5);
        return;
    L38:
        if (r5.S0(1) == false) goto L93;
        r5.c();
        return;
    L93:
        return;
    L42:
        if (r8.N != r9) goto L64;
        if (r5.S0(15) == false) goto L94;
        int r10 = r5.h();
        int r11 = r8.N0;
        int r6 = 1;
    L47:
        if (r6 > 2) goto L61;
        int r7 = (r10 + r6) % 3;
        if (r7 == 0) goto L60;
        if (r7 == 1) goto L57;
        if (r7 != 2) goto L59;
        if ((r11 & 2) != 0) goto L60;
    L59:
        r6 = r6 + 1;
        goto L47
    L57:
        if ((r11 & 1) == 0) goto L59;
    L60:
        r10 = r7;
    L61:
        r5.p0(r10);
        return;
    L94:
        return;
    L64:
        if (r8.O == r9) goto L66;
        if (r3 != r9) goto L72;
        r4.f();
        r8.d(r8.z, r3);
        return;
    L72:
        if (r2 != r9) goto L75;
        r4.f();
        r8.d(r8.A, r2);
        return;
    L75:
        if (r1 != r9) goto L78;
        r4.f();
        r8.d(r8.C, r1);
        return;
    L78:
        if (r0 != r9) goto L96;
        r4.f();
        r8.d(r8.B, r0);
        return;
    L96:
        return;
    L66:
        if (r5.S0(14) == false) goto L95;
        r5.s(!r5.D0());
        return;
    L95:
        return;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        PlayerControlView r1 = this.n;
        if (r1.T0 == false) goto L6;
        r1.n.g();
        return;
    }
}
