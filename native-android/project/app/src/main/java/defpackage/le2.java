package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class le2 extends kc1 {
    public ey l0;
    public final dc1 m0;

    public le2() {
        q5 r0 = new q5(1);
        this.m0 = W(new cn(22, this), r0);
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
    public final View H(LayoutInflater r11, ViewGroup r12, Bundle r13) {
        r11.getClass();
        View r14 = r11.inflate(R.layout.fragment_login_permission, r12, false);
        int r15 = R.id.btnRequestInternet;
        Button r2 = (Button) uo.s(r14, R.id.btnRequestInternet);
        if (r2 == null) goto L20;
        r15 = R.id.btnRequestLocalNetwork;
        Button r3 = (Button) uo.s(r14, R.id.btnRequestLocalNetwork);
        if (r3 == null) goto L20;
        r15 = R.id.btnRequestNearbyDevices;
        Button r4 = (Button) uo.s(r14, R.id.btnRequestNearbyDevices);
        if (r4 == null) goto L20;
        r15 = R.id.btnRequestNotification;
        Button r5 = (Button) uo.s(r14, R.id.btnRequestNotification);
        if (r5 == null) goto L20;
        r15 = R.id.tvInternetProvided;
        TextView r6 = (TextView) uo.s(r14, R.id.tvInternetProvided);
        if (r6 == null) goto L20;
        r15 = R.id.tvLocalNetworkProvided;
        TextView r7 = (TextView) uo.s(r14, R.id.tvLocalNetworkProvided);
        if (r7 == null) goto L20;
        r15 = R.id.tvNearbyDevicesProvided;
        TextView r8 = (TextView) uo.s(r14, R.id.tvNearbyDevicesProvided);
        if (r8 == null) goto L20;
        r15 = R.id.tvNotificationProvided;
        TextView r9 = (TextView) uo.s(r14, R.id.tvNotificationProvided);
        if (r9 == null) goto L20;
        LinearLayout r1 = (LinearLayout) r14;
        this.l0 = new ey(r1, r2, r3, r4, r5, r6, r7, r8, r9);
        r1.getClass();
        return r1;
    L20:
        nz2.n("Missing required view with ID: ".concat(r14.getResources().getResourceName(r15)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    @Override // defpackage.kc1
    public final void P() {
        this.R = true;
        h0();
    }

    @Override // defpackage.kc1
    public final void T(View r2, Bundle r3) {
        r2.getClass();
        ey r4 = this.l0;
        r4.getClass();
        final int r0 = 0;
        ((Button) r4.a).setOnClickListener(new ke2(this, r0));
        ey r5 = this.l0;
        r5.getClass();
        final int r1 = 1;
        ((Button) r5.d).setOnClickListener(new ke2(this, r1));
        ey r6 = this.l0;
        r6.getClass();
        final int r7 = 2;
        ((Button) r6.b).setOnClickListener(new ke2(this, r7));
        ey r8 = this.l0;
        r8.getClass();
        final int r9 = 3;
        ((Button) r8.c).setOnClickListener(new ke2(this, r9));
        h0();
    }

    public final void h0() {
        boolean r1 = true;
        int r2 = 0;
        if (ud3.c(Z(), "android.permission.INTERNET") != 0) goto L5;
        boolean r0 = true;
    L6:
        ey r3 = this.l0;
        r3.getClass();
        TextView r4 = (TextView) r3.e;
        if (r0 == false) goto L9;
        int r5 = 0;
    L10:
        r4.setVisibility(r5);
        ey r6 = this.l0;
        r6.getClass();
        Button r7 = (Button) r6.a;
        if (r0 == false) goto L13;
        int r8 = 8;
    L14:
        r7.setVisibility(r8);
        int r9 = Build.VERSION.SDK_INT;
        if (r9 >= 33) goto L17;
    L20:
        boolean r10 = true;
    L21:
        ey r11 = this.l0;
        r11.getClass();
        TextView r12 = (TextView) r11.h;
        if (r10 == false) goto L24;
        int r13 = 0;
    L25:
        r12.setVisibility(r13);
        ey r14 = this.l0;
        r14.getClass();
        Button r15 = (Button) r14.d;
        if (r10 == false) goto L28;
        int r16 = 8;
    L29:
        r15.setVisibility(r16);
        if (r9 >= 37) goto L32;
    L35:
        boolean r17 = true;
    L36:
        ey r18 = this.l0;
        r18.getClass();
        TextView r19 = (TextView) r18.f;
        if (r17 == false) goto L39;
        int r20 = 0;
    L40:
        r19.setVisibility(r20);
        ey r21 = this.l0;
        r21.getClass();
        Button r22 = (Button) r21.b;
        if (r17 == false) goto L43;
        int r23 = 8;
    L44:
        r22.setVisibility(r23);
        if (r9 >= 33) goto L47;
    L50:
        ey r24 = this.l0;
        r24.getClass();
        TextView r25 = (TextView) r24.g;
        if (r1 == false) goto L53;
        int r26 = 0;
    L54:
        r25.setVisibility(r26);
        ey r27 = this.l0;
        r27.getClass();
        Button r28 = (Button) r27.c;
        if (r1 == false) goto L57;
        r2 = 8;
    L57:
        r28.setVisibility(r2);
        return;
    L53:
        r26 = 8;
        goto L54
    L47:
        if (ud3.c(Z(), "android.permission.NEARBY_WIFI_DEVICES") == 0) goto L50;
        r1 = false;
        goto L50
    L43:
        r23 = 0;
        goto L44
    L39:
        r20 = 8;
        goto L40
    L32:
        if (ud3.c(Z(), "android.permission.ACCESS_LOCAL_NETWORK") == 0) goto L35;
        r17 = false;
        goto L36
    L28:
        r16 = 0;
        goto L29
    L24:
        r13 = 8;
        goto L25
    L17:
        if (ud3.c(Z(), "android.permission.POST_NOTIFICATIONS") == 0) goto L20;
        r10 = false;
        goto L21
    L13:
        r8 = 0;
        goto L14
    L9:
        r5 = 8;
        goto L10
    L5:
        r0 = false;
        goto L6
    }
}
