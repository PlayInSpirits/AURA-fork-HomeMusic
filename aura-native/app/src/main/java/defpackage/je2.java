package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.homemusic.R;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class je2 extends kc1 {
    @Override // defpackage.kc1
    public final void F(Bundle bundle) {
        super.F(bundle);
        Bundle bundle2 = this.s;
        if (bundle2 != null) {
            bundle2.getBoolean("single_page_mode");
        }
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(app.homemusic.R.layout.fragment_login_greeter, viewGroup, false);
    }
}
