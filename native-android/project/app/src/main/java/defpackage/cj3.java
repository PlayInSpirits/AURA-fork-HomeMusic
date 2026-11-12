package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.media3.ui.PlayerControlView;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cj3 extends dw3 {
    public List q;
    public final /* synthetic */ PlayerControlView r;
    public final /* synthetic */ int s;
    public final /* synthetic */ PlayerControlView t;

    public cj3(PlayerControlView r1, int r2) {
        this.s = r2;
        this.t = r1;
        this.r = r1;
        this.q = new ArrayList();
    }

    private final void t(String r1) {
    }

    @Override // defpackage.dw3
    public final int a() {
        if (this.q.isEmpty() == false) goto L7;
        return 0;
    L7:
        return this.q.size() + 1;
    }

    @Override // defpackage.dw3
    public /* bridge */ /* synthetic */ void g(cx3 r2, int r3) {
        switch(this.s) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        r((kj3) r2, r3);
        return;
    L6:
        r((kj3) r2, r3);
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup r2, int r3) {
        return new kj3(LayoutInflater.from(this.r.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, r2, false));
    }

    public boolean p(cw4 r5) {
        int r1 = 0;
    L4:
        if (r1 >= this.q.size()) goto L10;
        if (r5.H.containsKey(((lj3) this.q.get(r1)).a.b) == true) goto L7;
        r1 = r1 + 1;
        goto L4
    L7:
        return true;
    L10:
        return false;
    }

    public void q(List r7) {
        PlayerControlView r0 = this.t;
        ImageView r1 = r0.Q;
        boolean r2 = false;
        int r3 = 0;
    L4:
        if (r3 >= ((gy3) r7).q) goto L9;
        lj3 r4 = (lj3) ((gy3) r7).get(r3);
        iw4 r5 = r4.a;
        if (r5.e[r4.b] == true) goto L7;
        r3 = r3 + 1;
        goto L4
    L7:
        r2 = true;
    L9:
        if (r1 == null) goto L18;
        if (r2 == false) goto L12;
        Drawable r6 = r0.v0;
    L13:
        r1.setImageDrawable(r6);
        if (r2 == false) goto L16;
        String r8 = r0.x0;
    L17:
        r1.setContentDescription(r8);
        goto L18
    L16:
        r8 = r0.y0;
        goto L17
    L12:
        r6 = r0.w0;
    L18:
        this.q = r7;
    }

    public void r(kj3 r2, int r3) {
        switch(this.s) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        s(r2, r3);
        return;
    L6:
        s(r2, r3);
        if (r3 <= 0) goto L14;
        lj3 r1 = (lj3) this.q.get(r3 - 1);
        View r4 = r2.v;
        iw4 r5 = r1.a;
        if (r5.e[r1.b] == false) goto L11;
        int r6 = 0;
    L12:
        r4.setVisibility(r6);
        return;
    L11:
        r6 = 4;
        goto L12
    }

    public final void s(kj3 r8, int r9) {
        qi3 r3 = this.r.D0;
        if (r3 != null) goto L5;
        return;
    L5:
        int r0 = 4;
        int r1 = 0;
        boolean r2 = true;
        if (r9 == 0) goto L8;
        lj3 r5 = (lj3) this.q.get(r9 - 1);
        sv4 r4 = r5.a.b;
        if (r3.E0().H.get(r4) == null) goto L31;
        iw4 r10 = r5.a;
        if (r10.e[r5.b] == false) goto L31;
    L32:
        r8.u.setText(r5.c);
        View r11 = r8.v;
        if (r2 == false) goto L35;
        r0 = 0;
    L35:
        r11.setVisibility(r0);
        r8.a.setOnClickListener(new a7(this, r3, r4, r5, 1));
        return;
    L31:
        r2 = false;
        goto L32
    L8:
        switch(this.s) {
            case 0: goto L20;
            default: goto L9;
        };
    L9:
        r8.u.setText(R.string.exo_track_selection_none);
        int r12 = 0;
    L11:
        if (r12 >= this.q.size()) goto L16;
        lj3 r6 = (lj3) this.q.get(r12);
        iw4 r7 = r6.a;
        if (r7.e[r6.b] == true) goto L14;
        r12 = r12 + 1;
        goto L11
    L14:
        r2 = false;
    L16:
        View r13 = r8.v;
        if (r2 == false) goto L19;
        r0 = 0;
    L19:
        r13.setVisibility(r0);
        r8.a.setOnClickListener(new bj3(2, this));
        return;
    L20:
        r8.u.setText(R.string.exo_track_selection_auto);
        qi3 r14 = this.t.D0;
        r14.getClass();
        boolean r15 = p(r14.E0());
        View r16 = r8.v;
        if (r15 == true) goto L24;
        r0 = 0;
    L24:
        r16.setVisibility(r0);
        r8.a.setOnClickListener(new bj3(r1, this));
    }
}
