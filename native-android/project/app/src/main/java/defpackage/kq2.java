package defpackage;

import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.SeekBarPreference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kq2 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kq2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                if (z) {
                    wq2 wq2Var = (wq2) seekBar.getTag();
                    dq2 dq2Var = (dq2) ((lq2) obj).J.get(wq2Var.c);
                    if (dq2Var != null) {
                        dq2Var.t(i == 0);
                    }
                    wq2Var.j(i);
                }
                break;
            default:
                SeekBarPreference seekBarPreference = (SeekBarPreference) obj;
                if (z && (seekBarPreference.k0 || !seekBarPreference.f0)) {
                    seekBarPreference.F(seekBar);
                } else {
                    int i3 = i + seekBarPreference.c0;
                    TextView textView = seekBarPreference.h0;
                    if (textView != null) {
                        textView.setText(String.valueOf(i3));
                    }
                }
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                lq2 lq2Var = (lq2) obj;
                if (lq2Var.K != null) {
                    lq2Var.F.removeMessages(2);
                }
                lq2Var.K = (wq2) seekBar.getTag();
                break;
            default:
                ((SeekBarPreference) obj).f0 = true;
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((lq2) obj).F.sendEmptyMessageDelayed(2, 500L);
                break;
            default:
                SeekBarPreference seekBarPreference = (SeekBarPreference) obj;
                seekBarPreference.f0 = false;
                if (seekBar.getProgress() + seekBarPreference.c0 != seekBarPreference.b0) {
                    seekBarPreference.F(seekBar);
                }
                break;
        }
    }
}
