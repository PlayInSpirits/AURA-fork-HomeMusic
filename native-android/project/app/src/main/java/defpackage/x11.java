package defpackage;

import android.view.View;
import android.widget.SeekBar;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.EqualizerFragment;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x11 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ EqualizerFragment o;

    public /* synthetic */ x11(EqualizerFragment r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r7) {
        int r8 = this.n;
        EqualizerFragment r6 = this.o;
        switch(r8) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        MainActivity r9 = r6.l0;
        if (r9 == null) goto L8;
        r9.T.o();
        return;
    L8:
        h12.Q("activity");
        throw null;
    L10:
        wo0 r10 = r6.n0;
        if (r10 == null) goto L23;
        v11 r11 = (v11) r10.n;
        int r0 = r11.b();
        short[] r1 = r11.d();
        if (r1 != null) goto L16;
        r1 = new short[]{-1500, 1500};
    L16:
        int r2 = r1[0] / 100;
        int r3 = 0;
    L17:
        if (r3 >= r0) goto L22;
        r11.v((short) r3, 0);
        SeekBar r4 = (SeekBar) q40.y0(r6.s0, r3);
        if (r4 == null) goto L21;
        r4.setProgress(0 - r2);
    L21:
        r3 = r3 + 1;
        goto L17
    L22:
        ud3.k0(new short[r0]);
    L23:
        r6.k0();
    }
}
