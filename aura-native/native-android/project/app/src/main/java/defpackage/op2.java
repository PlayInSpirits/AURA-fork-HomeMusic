package defpackage;

import android.widget.SeekBar;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class op2 implements SeekBar.OnSeekBarChangeListener {
    public final g5 a = new g5(22, this);
    public final /* synthetic */ qp2 b;

    public op2(qp2 qp2Var) {
        this.b = qp2Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            wq2 wq2Var = (wq2) seekBar.getTag();
            int i2 = qp2.B0;
            wq2Var.j(i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        qp2 qp2Var = this.b;
        if (qp2Var.Z != null) {
            qp2Var.X.removeCallbacks(this.a);
        }
        qp2Var.Z = (wq2) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.b.X.postDelayed(this.a, 500L);
    }
}
