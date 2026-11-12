package defpackage;

import android.app.Activity;
import android.util.SparseBooleanArray;
import android.view.View;
import app.homemusic.R;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.homemusic.HubAuthOptions;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ct0 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ ct0(ft0 r2, String r3, et0 r4, int r5) {
        this.n = 0;
        this.q = r2;
        this.p = r3;
        this.r = r4;
        this.o = r5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        int r1 = 2;
        Object r4 = this.r;
        Object r5 = this.p;
        int r6 = this.o;
        Object r9 = this.q;
        switch(r0) {
            case 0: goto L25;
            case 1: goto L14;
            case 2: goto L10;
            default: goto L4;
        };
    L4:
        List r7 = (List) r5;
        fr2 r8 = (fr2) r4;
        tn2 r10 = ((ls2) ((ue1) r9).q).g;
        if (r6 != (-1)) goto L7;
        r10.s.w0(r7);
    L8:
        SparseBooleanArray r2 = new SparseBooleanArray();
        r2.append(20, true);
        r10.v(r8, new mi3(new w71(r2)));
        return;
    L7:
        r10.s.N0(r7, r6);
        goto L8
    L10:
        lo2 r11 = (lo2) r9;
        kn2 r12 = (kn2) r5;
        rm2 r13 = (rm2) r4;
        if (r6 != r11.v) goto L31;
        r11.e(r12, r13, r11.c(false));
        return;
    L31:
        return;
    L14:
        fo1 r14 = (fo1) r9;
        String r15 = (String) r5;
        HubAuthOptions r16 = (HubAuthOptions) r4;
        boolean r3 = r14.c();
        uc1 r17 = (uc1) r14.c;
        if (r3 == false) goto L34;
        r14.r(false);
        if (r6 == 0) goto L23;
        TextInputLayout r18 = r17.u;
        if (r6 == 2) goto L22;
        r18.setError(r14.v(R.string.homemusic_login_server_unreachable, new Object[0]));
        return;
    L22:
        r18.setError(r14.v(R.string.homemusic_login_server_not_music, new Object[0]));
        return;
    L23:
        r14.e = r15;
        r14.i = r16;
        r17.r.setText(r15);
        r14.s(co1.o);
        return;
    L34:
        return;
    L25:
        ft0 r19 = (ft0) r9;
        String r20 = (String) r5;
        View r21 = ((et0) r4).a;
        String r22 = (String) xl.E((s24) AppDatabase.y().C().a, true, false, new rs0(13, r20));
        if (r22 == null) goto L35;
        r19.x.put(r20, r22);
        if ((r21.getContext() instanceof Activity) == false) goto L36;
        ((Activity) r21.getContext()).runOnUiThread(new ul(r6, r1, r19));
        return;
    L36:
        return;
    }

    public /* synthetic */ ct0(Object r1, int r2, Object r3, Object r4, int r5) {
        this.n = r5;
        this.q = r1;
        this.o = r2;
        this.p = r3;
        this.r = r4;
    }
}
