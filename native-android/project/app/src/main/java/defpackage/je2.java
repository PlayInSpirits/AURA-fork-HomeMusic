package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class je2 extends kc1 {
    public je2() {
    }

    @Override // defpackage.kc1
    public final void F(Bundle r1) {
        super.F(r1);
        Bundle r0 = this.s;
        if (r0 == null) goto L6;
        r0.getBoolean("single_page_mode");
        return;
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r1, ViewGroup r2, Bundle r3) {
        r1.getClass();
        return r1.inflate(R.layout.fragment_login_greeter, r2, false);
    }
}
