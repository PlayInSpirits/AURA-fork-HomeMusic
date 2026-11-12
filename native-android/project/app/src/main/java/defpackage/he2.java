package defpackage;

import android.os.Bundle;
import app.homemusic.R;
import com.eddyizm.tempus.ui.login.LoginActivity;
import com.google.android.material.appbar.MaterialToolbar;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class he2 extends ee1 {
    public final /* synthetic */ LoginActivity z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he2(LoginActivity loginActivity, LoginActivity loginActivity2) {
        super(loginActivity2.k(), loginActivity2.n);
        this.z = loginActivity;
    }

    @Override // defpackage.dw3
    public final int a() {
        return 4;
    }

    @Override // defpackage.ee1
    public final kc1 r(int i) {
        LoginActivity loginActivity = this.z;
        if (i == 0) {
            na4 na4Var = loginActivity.N;
            if (na4Var == null) {
                h12.Q("binding");
                throw null;
            }
            ((MaterialToolbar) na4Var.p).setTitle(loginActivity.getString(R.string.la_appbar_greeter_title));
            boolean z = loginActivity.O;
            je2 je2Var = new je2();
            Bundle bundle = new Bundle();
            bundle.putBoolean("single_page_mode", z);
            je2Var.c0(bundle);
            return je2Var;
        }
        if (i == 1) {
            na4 na4Var2 = loginActivity.N;
            if (na4Var2 == null) {
                h12.Q("binding");
                throw null;
            }
            ((MaterialToolbar) na4Var2.p).setTitle(loginActivity.getString(R.string.la_appbar_permission_title));
            boolean z2 = loginActivity.O;
            le2 le2Var = new le2();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("single_page_mode", z2);
            le2Var.c0(bundle2);
            return le2Var;
        }
        if (i == 2) {
            na4 na4Var3 = loginActivity.N;
            if (na4Var3 == null) {
                h12.Q("binding");
                throw null;
            }
            ((MaterialToolbar) na4Var3.p).setTitle(loginActivity.getString(R.string.la_appbar_themes_title));
            boolean z3 = loginActivity.O;
            re2 re2Var = new re2();
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("single_page_mode", z3);
            re2Var.c0(bundle3);
            return re2Var;
        }
        if (i != 3) {
            boolean z4 = loginActivity.O;
            je2 je2Var2 = new je2();
            Bundle bundle4 = new Bundle();
            bundle4.putBoolean("single_page_mode", z4);
            je2Var2.c0(bundle4);
            return je2Var2;
        }
        na4 na4Var4 = loginActivity.N;
        if (na4Var4 == null) {
            h12.Q("binding");
            throw null;
        }
        ((MaterialToolbar) na4Var4.p).setTitle(loginActivity.getString(R.string.la_appbar_server_title));
        boolean z5 = loginActivity.O;
        oe2 oe2Var = new oe2();
        Bundle bundle5 = new Bundle();
        bundle5.putBoolean("single_page_mode", z5);
        oe2Var.c0(bundle5);
        return oe2Var;
    }
}
