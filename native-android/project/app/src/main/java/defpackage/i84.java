package defpackage;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i84 implements View.OnKeyListener {
    public final /* synthetic */ SeekBarPreference n;

    public i84(SeekBarPreference r1) {
        this.n = r1;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View r2, int r3, KeyEvent r4) {
        if (r4.getAction() != 0) goto L23;
        SeekBarPreference r1 = this.n;
        if (r1.i0 == true) goto L13;
        if (r3 == 21) goto L23;
        if (r3 == 22) goto L23;
    L13:
        if (r3 == 23) goto L23;
        if (r3 == 66) goto L23;
        SeekBar r5 = r1.g0;
        if (r5 != null) goto L22;
        Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
        return false;
    L22:
        return r5.onKeyDown(r3, r4);
    L23:
        return false;
    }
}
