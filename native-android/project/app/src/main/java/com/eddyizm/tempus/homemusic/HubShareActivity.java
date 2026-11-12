package com.eddyizm.tempus.homemusic;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import defpackage.df;
import defpackage.h12;
import defpackage.io1;
import defpackage.jv3;
import defpackage.n3;
import defpackage.nz2;
import defpackage.p6;
import defpackage.pt0;
import defpackage.q40;
import defpackage.qm4;
import defpackage.r40;
import defpackage.t6;
import defpackage.ti;
import defpackage.uo;
import defpackage.ux3;
import defpackage.ws1;
import defpackage.xm4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class HubShareActivity extends df {
    public static final ux3 P = null;
    public jv3 N;
    public boolean O;

    static {
        P = new ux3("https?://\\S+");
    }

    public HubShareActivity() {
    }

    @Override // defpackage.nc1, defpackage.l70, defpackage.k70, android.app.Activity
    public final void onCreate(Bundle r15) {
        super.onCreate(r15);
        String r2 = null;
        int r3 = 0;
        View r0 = getLayoutInflater().inflate(R.layout.activity_hub_share, null, false);
        int r1 = R.id.hub_share_close;
        MaterialButton r4 = (MaterialButton) uo.s(r0, R.id.hub_share_close);
        if (r4 == null) goto L100;
        r1 = R.id.hub_share_progress;
        CircularProgressIndicator r5 = (CircularProgressIndicator) uo.s(r0, R.id.hub_share_progress);
        if (r5 == null) goto L100;
        r1 = R.id.hub_share_text;
        TextView r6 = (TextView) uo.s(r0, R.id.hub_share_text);
        if (r6 == null) goto L100;
        jv3 r7 = new jv3();
        r7.n = r4;
        r7.o = r5;
        r7.p = r6;
        this.N = r7;
        setContentView((LinearLayout) r0);
        jv3 r8 = this.N;
        if (r8 == null) goto L98;
        ((MaterialButton) r8.n).setOnClickListener(new p6(20, this));
        if (pt0.c() == true) goto L14;
        Toast.makeText(this, R.string.homemusic_share_login_first, 1).show();
        startActivity(new Intent(this, MainActivity.class).addFlags(268435456));
        finish();
        return;
    L14:
        if (r15 == null) goto L16;
        return;
    L16:
        if (this.O == true) goto L123;
        this.O = true;
        Intent r16 = getIntent();
        r16.getClass();
        ArrayList r9 = new ArrayList();
        String r10 = r16.getAction();
        if (r10 == null) goto L43;
        int r11 = r10.hashCode();
        if (r11 == (-1173264947)) goto L34;
        if (r11 != (-58484670)) goto L43;
        if (r10.equals("android.intent.action.SEND_MULTIPLE") == false) goto L43;
        if (Build.VERSION.SDK_INT < 33) goto L30;
        ArrayList r12 = n3.q(r16);
    L31:
        if (r12 == null) goto L43;
        r9.addAll(r12);
        goto L43
    L30:
        r12 = r16.getParcelableArrayListExtra("android.intent.extra.STREAM");
        goto L31
    L34:
        if (r10.equals("android.intent.action.SEND") == false) goto L43;
        if (Build.VERSION.SDK_INT < 33) goto L38;
        Parcelable r13 = (Parcelable) n3.o(r16);
    L39:
        Uri r14 = (Uri) r13;
        if (r14 == null) goto L43;
        r9.add(r14);
        goto L43
    L38:
        r13 = r16.getParcelableExtra("android.intent.extra.STREAM");
    L43:
        if (r9.isEmpty() == false) goto L52;
        ClipData r17 = r16.getClipData();
        if (r17 == null) goto L52;
        int r18 = r17.getItemCount();
        int r19 = 0;
    L47:
        if (r19 >= r18) goto L52;
        Uri r20 = r17.getItemAt(r19).getUri();
        if (r20 == null) goto L51;
        r9.add(r20);
    L51:
        r19 = r19 + 1;
    L52:
        List r21 = q40.t0(r9);
        ArrayList r22 = new ArrayList();
        Iterator r23 = r21.iterator();
    L53:
        String r24 = "";
        if (r23.hasNext() == false) goto L64;
        Object r25 = r23.next();
        String r26 = getContentResolver().getType((Uri) r25);
        if (r26 != null) goto L60;
        r26 = r16.getType();
        if (r26 != null) goto L60;
    L61:
        String r27 = r24.toLowerCase(Locale.ROOT);
        r27.getClass();
        if (xm4.k0(r27, "image/", false) == false) goto L53;
        r22.add(r25);
    L60:
        r24 = r26;
        goto L61
    L64:
        ArrayList r28 = new ArrayList();
        Iterator r29 = r21.iterator();
    L66:
        if (r29.hasNext() == false) goto L77;
        Object r30 = r29.next();
        String r31 = getContentResolver().getType((Uri) r30);
        if (r31 != null) goto L72;
        r31 = r16.getType();
        if (r31 != null) goto L72;
        r31 = "";
    L72:
        String r32 = r31.toLowerCase(Locale.ROOT);
        r32.getClass();
        if (xm4.k0(r32, "audio/", false) == true) goto L76;
        if (r32.equals("application/ogg") == false) goto L66;
    L76:
        r28.add(r30);
        goto L66
    L77:
        String r33 = r16.getStringExtra("android.intent.extra.SUBJECT");
        CharSequence r110 = r16.getCharSequenceExtra("android.intent.extra.TEXT");
        if (r110 == null) goto L80;
        r2 = r110.toString();
    L80:
        ArrayList r111 = ti.i0(new String[]{r33, r2});
        ArrayList r34 = new ArrayList(r40.k0(r111, 10));
        int r35 = r111.size();
        int r36 = 0;
    L81:
        if (r36 >= r35) goto L83;
        Object r37 = r111.get(r36);
        r36 = r36 + 1;
        r34.add(qm4.K0((String) r37).toString());
        goto L81
    L83:
        ArrayList r112 = new ArrayList();
        int r38 = r34.size();
    L84:
        if (r3 >= r38) goto L88;
        Object r39 = r34.get(r3);
        r3 = r3 + 1;
        if (((String) r39).length() <= 0) goto L84;
        r112.add(r39);
        goto L84
    L88:
        String r40 = q40.B0(q40.t0(r112), " ", null, null, null, 62);
        if (r22.isEmpty() == true) goto L91;
    L96:
        String r113 = getString(R.string.homemusic_share_connecting);
        r113.getClass();
        io1.b.post(new ws1(this, r113, 2));
        io1.a.execute(new t6(r22, this, r28, r40, 8));
        return;
    L91:
        if (r28.isEmpty() == false) goto L96;
        if (r40.length() != 0) goto L96;
        String r114 = getString(R.string.homemusic_share_unsupported);
        r114.getClass();
        p(r114);
        return;
    L123:
        return;
    L98:
        h12.Q("bind");
        throw null;
    L100:
        nz2.n("Missing required view with ID: ".concat(r0.getResources().getResourceName(r1)));
    }

    public final void p(String r5) {
        jv3 r0 = this.N;
        if (r0 == null) goto L14;
        ((CircularProgressIndicator) r0.o).setVisibility(8);
        jv3 r1 = this.N;
        if (r1 == null) goto L12;
        ((TextView) r1.p).setText(r5);
        jv3 r4 = this.N;
        if (r4 == null) goto L10;
        ((MaterialButton) r4.n).setVisibility(0);
        return;
    L10:
        h12.Q("bind");
        throw null;
    L12:
        h12.Q("bind");
        throw null;
    L14:
        h12.Q("bind");
        throw null;
    }
}
