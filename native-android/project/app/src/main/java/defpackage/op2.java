package defpackage;

import android.widget.SeekBar;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class op2 implements SeekBar.OnSeekBarChangeListener {
    public final g5 a;
    public final /* synthetic */ qp2 b;

    public op2(qp2 r2) {
        this.b = r2;
        this.a = new g5(22, this);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar r1, int r2, boolean r3) {
        if (r3 == false) goto L5;
        wq2 r0 = (wq2) r1.getTag();
        int r4 = qp2.B0;
        r0.j(r2);
        return;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar r3) {
        qp2 r0 = this.b;
        if (r0.Z == null) goto L5;
        r0.X.removeCallbacks(this.a);
    L5:
        r0.Z = (wq2) r3.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar r3) {
        this.b.X.postDelayed(this.a, 500);
    }
}
