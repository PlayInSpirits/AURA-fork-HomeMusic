package defpackage;

import android.view.View;
import android.widget.SeekBar;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.EqualizerFragment;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class x11 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ EqualizerFragment o;

    public /* synthetic */ x11(EqualizerFragment equalizerFragment, int i) {
        this.n = i;
        this.o = equalizerFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.n;
        EqualizerFragment equalizerFragment = this.o;
        switch (i) {
            case 0:
                wo0 wo0Var = equalizerFragment.n0;
                if (wo0Var != null) {
                    v11 v11Var = (v11) wo0Var.n;
                    int b = v11Var.b();
                    short[] d = v11Var.d();
                    if (d == null) {
                        d = new short[]{-1500, 1500};
                    }
                    int i2 = d[0] / 100;
                    for (int i3 = 0; i3 < b; i3++) {
                        v11Var.v((short) i3, (short) 0);
                        SeekBar seekBar = (SeekBar) q40.y0(equalizerFragment.s0, i3);
                        if (seekBar != null) {
                            seekBar.setProgress(0 - i2);
                        }
                    }
                    ud3.k0(new short[b]);
                }
                equalizerFragment.k0();
                return;
            default:
                MainActivity mainActivity = equalizerFragment.l0;
                if (mainActivity != null) {
                    mainActivity.T.o();
                    return;
                } else {
                    h12.Q("activity");
                    throw null;
                }
        }
    }
}
