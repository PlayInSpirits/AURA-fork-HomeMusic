package defpackage;

import android.widget.SeekBar;
import android.widget.TextView;
import com.eddyizm.tempus.ui.fragment.EqualizerFragment;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z11 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wo0 b;
    public final /* synthetic */ short c;
    public final /* synthetic */ EqualizerFragment d;
    public final /* synthetic */ TextView e;

    public z11(int r1, wo0 r2, short r3, EqualizerFragment r4, TextView r5) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar r2, int r3, boolean r4) {
        r2.getClass();
        int r5 = r3 + this.a;
        if (r4 == false) goto L5;
        v11 r6 = (v11) this.b.n;
        short r0 = this.c;
        r6.v(r0, (short) (r5 * 100));
        this.d.k0();
    L5:
        this.e.setText(EqualizerFragment.j0(r5));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar r1) {
        r1.getClass();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar r1) {
        r1.getClass();
    }
}
