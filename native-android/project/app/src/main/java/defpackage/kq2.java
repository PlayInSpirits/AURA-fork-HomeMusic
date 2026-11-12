package defpackage;

import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.SeekBarPreference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kq2 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kq2(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar r2, int r3, boolean r4) {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L15;
            default: goto L4;
        };
    L4:
        SeekBarPreference r5 = (SeekBarPreference) r1;
        if (r4 == true) goto L7;
    L11:
        int r6 = r3 + r5.c0;
        TextView r7 = r5.h0;
        if (r7 == null) goto L25;
        r7.setText(String.valueOf(r6));
        return;
    L25:
        return;
    L7:
        if (r5.k0 == false) goto L9;
    L10:
        r5.F(r2);
        return;
    L9:
        if (r5.f0 == true) goto L11;
    L15:
        if (r4 == false) goto L26;
        wq2 r8 = (wq2) r2.getTag();
        dq2 r9 = (dq2) ((lq2) r1).J.get(r8.c);
        if (r9 == null) goto L22;
        if (r3 != 0) goto L20;
        boolean r10 = true;
    L21:
        r9.t(r10);
        goto L22
    L20:
        r10 = false;
    L22:
        r8.j(r3);
        return;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar r3) {
        int r0 = this.a;
        Object r2 = this.b;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((SeekBarPreference) r2).f0 = true;
        return;
    L6:
        lq2 r4 = (lq2) r2;
        if (r4.K == null) goto L9;
        r4.F.removeMessages(2);
    L9:
        r4.K = (wq2) r3.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar r3) {
        int r0 = this.a;
        Object r2 = this.b;
        switch(r0) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        SeekBarPreference r4 = (SeekBarPreference) r2;
        r4.f0 = false;
        if ((r3.getProgress() + r4.c0) == r4.b0) goto L10;
        r4.F(r3);
        return;
    L10:
        return;
    L8:
        ((lq2) r2).F.sendEmptyMessageDelayed(2, 500);
    }
}
