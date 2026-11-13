/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.view.View;
import android.widget.TextView;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.models.SubsonicResponse;
import com.eddyizm.tempus.ui.activity.MainActivity;
import defpackage.a83;
import defpackage.h12;
import defpackage.io1;
import defpackage.qp4;
import defpackage.ra0;
import defpackage.sa4;
import defpackage.ss0;
import defpackage.ud3;
import defpackage.v23;

public final class sf2
implements a83 {
    public final int a;
    public final MainActivity b;

    public sf2(MainActivity mainActivity, int n16) {
        this.a = n16;
        this.b = mainActivity;
    }

    @Override
    public final void b(Object object) {
        int n16 = this.a;
        boolean bl5 = true;
        boolean bl6 = true;
        MainActivity mainActivity = this.b;
        object = (SubsonicResponse)object;
        switch (n16) {
            default: {
                n16 = MainActivity.e0;
                ra0.a();
                if (object == null) {
                    if (!h12.c(ud3.u(), ud3.v()) && mainActivity.Q == null) {
                        object = io1.a;
                        object = mainActivity.R;
                        if (object != null) {
                            object = (TextView)((qp4)object).b;
                            ((TextView)object).setText(2131952137);
                            ((View)object).setVisibility(0);
                        }
                        App.b().getClass();
                        if (App.c().getLong("server_unreachable", 0L) + 86400000L < System.currentTimeMillis()) {
                            new sa4().m0(mainActivity.k(), null);
                        }
                    }
                } else {
                    bl5 = ((SubsonicResponse)object).getOpenSubsonic() != null && ((SubsonicResponse)object).getOpenSubsonic() != false ? bl6 : false;
                    ud3.p0(bl5);
                    io1.a(mainActivity);
                }
                return;
            }
            case 0: 
        }
        n16 = MainActivity.e0;
        if (object == null) {
            ra0.a();
            if (h12.c(ud3.u(), ud3.v())) {
                object = io1.a;
                object = mainActivity.R;
                if (object != null) {
                    object = (TextView)((qp4)object).b;
                    ((TextView)object).setText(2131952137);
                    ((View)object).setVisibility(0);
                }
                if ((object = ud3.D()) != null && !((String)object).equals(ud3.v())) {
                    App.b().getClass();
                    App.c().edit().putLong("next_server_switch", System.currentTimeMillis()).apply();
                    ud3.H0();
                    App.p = App.d();
                    mainActivity.G();
                    mainActivity.d().a();
                    object = (v23)((ss0)mainActivity.U.o).q;
                    n16 = ((v23)object).g().u;
                    ((v23)object).p(n16, true);
                    ((v23)object).m(n16, null, null);
                } else {
                    App.b().getClass();
                    if (App.c().getLong("server_unreachable", 0L) + 86400000L < System.currentTimeMillis()) {
                        new sa4().m0(mainActivity.k(), null);
                    }
                }
            }
        } else {
            ra0.a();
            if (((SubsonicResponse)object).getOpenSubsonic() == null || !((SubsonicResponse)object).getOpenSubsonic().booleanValue()) {
                bl5 = false;
            }
            ud3.p0(bl5);
            io1.a(mainActivity);
        }
    }
}

