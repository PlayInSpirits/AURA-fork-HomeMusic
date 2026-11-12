package defpackage;

import android.os.Bundle;
import app.homemusic.R;
import com.eddyizm.tempus.ui.login.LoginActivity;
import com.google.android.material.appbar.MaterialToolbar;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class he2 extends ee1 {
    public final /* synthetic */ LoginActivity z;

    public he2(LoginActivity r1, LoginActivity r2) {
        this.z = r1;
        super(r2.k(), r2.n);
    }

    @Override // defpackage.dw3
    public final int a() {
        return 4;
    }

    @Override // defpackage.ee1
    public final kc1 r(int r5) {
        LoginActivity r4 = this.z;
        if (r5 != 0) goto L5;
        na4 r6 = r4.N;
        if (r6 == null) goto L34;
        ((MaterialToolbar) r6.p).setTitle(r4.getString(R.string.la_appbar_greeter_title));
        boolean r7 = r4.O;
        je2 r8 = new je2();
        Bundle r0 = new Bundle();
        r0.putBoolean("single_page_mode", r7);
        r8.c0(r0);
        return r8;
    L34:
        h12.Q("binding");
        throw null;
    L5:
        if (r5 != 1) goto L7;
        na4 r9 = r4.N;
        if (r9 == null) goto L28;
        ((MaterialToolbar) r9.p).setTitle(r4.getString(R.string.la_appbar_permission_title));
        boolean r10 = r4.O;
        le2 r11 = new le2();
        Bundle r1 = new Bundle();
        r1.putBoolean("single_page_mode", r10);
        r11.c0(r1);
        return r11;
    L28:
        h12.Q("binding");
        throw null;
    L7:
        if (r5 != 2) goto L9;
        na4 r12 = r4.N;
        if (r12 == null) goto L22;
        ((MaterialToolbar) r12.p).setTitle(r4.getString(R.string.la_appbar_themes_title));
        boolean r13 = r4.O;
        re2 r14 = new re2();
        Bundle r2 = new Bundle();
        r2.putBoolean("single_page_mode", r13);
        r14.c0(r2);
        return r14;
    L22:
        h12.Q("binding");
        throw null;
    L9:
        if (r5 == 3) goto L12;
        boolean r15 = r4.O;
        je2 r16 = new je2();
        Bundle r3 = new Bundle();
        r3.putBoolean("single_page_mode", r15);
        r16.c0(r3);
        return r16;
    L12:
        na4 r17 = r4.N;
        if (r17 == null) goto L16;
        ((MaterialToolbar) r17.p).setTitle(r4.getString(R.string.la_appbar_server_title));
        boolean r18 = r4.O;
        oe2 r19 = new oe2();
        Bundle r20 = new Bundle();
        r20.putBoolean("single_page_mode", r18);
        r19.c0(r20);
        return r19;
    L16:
        h12.Q("binding");
        throw null;
    }
}
