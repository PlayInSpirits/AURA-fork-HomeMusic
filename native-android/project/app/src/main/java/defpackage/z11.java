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

    public z11(int i, wo0 wo0Var, short s, EqualizerFragment equalizerFragment, TextView textView) {
        this.a = i;
        this.b = wo0Var;
        this.c = s;
        this.d = equalizerFragment;
        this.e = textView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        seekBar.getClass();
        int i2 = i + this.a;
        if (z) {
            ((v11) this.b.n).v(this.c, (short) (i2 * 100));
            this.d.k0();
        }
        this.e.setText(EqualizerFragment.j0(i2));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        seekBar.getClass();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        seekBar.getClass();
    }
}
