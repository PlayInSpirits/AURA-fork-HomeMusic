package defpackage;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import app.homemusic.R;
import com.eddyizm.tempus.ui.crash.CrashActivity;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class if0 extends kc1 {
    public oz l0;
    public Button m0;
    public Button n0;
    public TextView o0;

    public if0() {
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r2, ViewGroup r3, Bundle r4) {
        View r5 = r2.inflate(R.layout.fragment_crash_info, r3, false);
        this.m0 = (Button) r5.findViewById(R.id.crashInfoButtonClose);
        this.n0 = (Button) r5.findViewById(R.id.crashInfoButtonRestart);
        this.o0 = (TextView) r5.findViewById(R.id.crashInfoDeviceData);
        return r5;
    }

    @Override // defpackage.kc1
    public final void T(View r2, Bundle r3) {
        this.l0 = ((CrashActivity) l()).O;
        final int r0 = 0;
        this.m0.setOnClickListener(new hf0(this, r0));
        final int r1 = 1;
        this.n0.setOnClickListener(new hf0(this, r1));
        this.o0.setText(bu.m(Z()));
        this.o0.setTypeface(Typeface.MONOSPACE);
        this.o0.setMovementMethod(new ScrollingMovementMethod());
    }
}
