package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ep2 extends dg {
    public TextView A;
    public TextView B;
    public LinearLayout C;
    public Button D;
    public ProgressBar E;
    public ListView F;
    public dp2 G;
    public final v9 H;
    public boolean I;
    public long J;
    public final zk K;
    public final yq2 t;
    public final ap2 u;
    public rq2 v;
    public ArrayList w;
    public TextView x;
    public TextView y;
    public RelativeLayout z;

    public ep2(Context r2) {
        ContextThemeWrapper r3 = fu.o(r2, false);
        int r0 = fu.B(r3, R.attr.mediaRouteTheme);
        if (r0 != 0) goto L5;
        r0 = fu.z(r3);
    L5:
        super(r3, r0);
        this.v = rq2.c;
        this.K = new zk(5, this);
        this.t = yq2.d(getContext());
        this.u = new ap2(this, 1);
        this.H = new v9(6, this);
    }

    @Override // defpackage.dg, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        getContext().unregisterReceiver(this.H);     // Catch: IllegalArgumentException -> L5
    L3:
        super.dismiss();
    }

    public final void i(List r5) {
        this.J = SystemClock.uptimeMillis();
        this.w.clear();
        this.w.addAll(r5);
        this.G.notifyDataSetChanged();
        zk r1 = this.K;
        r1.removeMessages(3);
        r1.removeMessages(2);
        if (r5.isEmpty() == false) goto L6;
        l(0);
        r1.sendMessageDelayed(r1.obtainMessage(2), 5000);
        return;
    L6:
        l(1);
    }

    public final void j() {
        if (this.I == false) goto L25;
        this.t.getClass();
        yq2.b();
        ArrayList r0 = new ArrayList(yq2.c().h);
        int r1 = r0.size();
    L5:
        int r2 = r1 - 1;
        if (r1 <= 0) goto L16;
        wq2 r3 = (wq2) r0.get(r2);
        if (r3.d() == false) goto L10;
    L14:
        r0.remove(r2);
    L15:
        r1 = r2;
        goto L5
    L10:
        if (r3.g == false) goto L14;
        if (r3.h(this.v) == false) goto L14;
    L16:
        Collections.sort(r0, ca1.q);
        if ((SystemClock.uptimeMillis() - this.J) < 300) goto L20;
        i(r0);
        return;
    L20:
        zk r4 = this.K;
        r4.removeMessages(1);
        r4.sendMessageAtTime(r4.obtainMessage(1, r0), this.J + 300);
        return;
    }

    public final void k(rq2 r4) {
        if (r4 != null) goto L4;
        kf2.n("selector must not be null");
        return;
    L4:
        if (this.v.equals(r4) == true) goto L12;
        this.v = r4;
        if (this.I == false) goto L8;
        yq2 r0 = this.t;
        ap2 r1 = this.u;
        r0.e(r1);
        r0.a(r4, r1, 1);
    L8:
        j();
        return;
    }

    public final void l(int r5) {
        if (r5 != 0) goto L5;
        setTitle(R.string.mr_chooser_title);
        this.F.setVisibility(8);
        this.y.setVisibility(0);
        this.E.setVisibility(0);
        this.C.setVisibility(8);
        this.D.setVisibility(8);
        this.B.setVisibility(8);
        this.z.setVisibility(8);
        return;
    L5:
        if (r5 != 1) goto L7;
        setTitle(R.string.mr_chooser_title);
        this.F.setVisibility(0);
        this.y.setVisibility(8);
        this.E.setVisibility(8);
        this.C.setVisibility(8);
        this.D.setVisibility(8);
        this.B.setVisibility(8);
        this.z.setVisibility(8);
        return;
    L7:
        if (r5 != 2) goto L9;
        setTitle(R.string.mr_chooser_title);
        this.F.setVisibility(8);
        this.y.setVisibility(8);
        this.E.setVisibility(0);
        this.C.setVisibility(8);
        this.D.setVisibility(8);
        this.B.setVisibility(4);
        this.z.setVisibility(0);
        return;
    L9:
        if (r5 == 3) goto L11;
        return;
    L11:
        setTitle(R.string.mr_chooser_zero_routes_found_title);
        this.F.setVisibility(8);
        this.y.setVisibility(8);
        this.E.setVisibility(8);
        this.C.setVisibility(0);
        this.D.setVisibility(0);
        this.B.setVisibility(0);
        this.z.setVisibility(0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        rq2 r1 = this.v;
        ap2 r2 = this.u;
        this.t.a(r1, r2, 1);
        j();
        zk r4 = this.K;
        r4.removeMessages(2);
        r4.removeMessages(3);
        r4.removeMessages(1);
        r4.sendMessageDelayed(r4.obtainMessage(2), 5000);
    }

    @Override // defpackage.dg, defpackage.n70, android.app.Dialog
    public final void onCreate(Bundle r7) {
        super.onCreate(r7);
        setContentView(R.layout.mr_chooser_dialog);
        this.w = new ArrayList();
        this.G = new dp2(getContext(), this.w);
        this.x = (TextView) findViewById(R.id.mr_chooser_title);
        this.y = (TextView) findViewById(R.id.mr_chooser_searching);
        this.z = (RelativeLayout) findViewById(R.id.mr_chooser_wifi_warning_container);
        this.A = (TextView) findViewById(R.id.mr_chooser_wifi_warning_description);
        this.B = (TextView) findViewById(R.id.mr_chooser_wifi_learn_more);
        this.C = (LinearLayout) findViewById(R.id.mr_chooser_ok_button_container);
        this.D = (Button) findViewById(R.id.mr_chooser_ok_button);
        this.E = (ProgressBar) findViewById(R.id.mr_chooser_search_progress_bar);
        Context r8 = getContext();
        boolean r2 = false;
        if (gi1.k != null) goto L19;
        if (gi1.A(r8) == true) goto L16;
        PackageManager r0 = r8.getPackageManager();
        if (gi1.o != null) goto L10;
        gi1.o = Boolean.valueOf(r0.hasSystemFeature("android.hardware.type.watch"));
    L10:
        if (gi1.o.booleanValue() == true) goto L16;
        if (gi1.x(r8) == true) goto L16;
        if (gi1.B(r8) == true) goto L16;
        boolean r1 = true;
    L17:
        gi1.k = Boolean.valueOf(r1);
    L16:
        r1 = false;
    L19:
        if (gi1.k.booleanValue() == false) goto L21;
    L51:
        String r9 = r8.getString(R.string.mr_chooser_wifi_warning_description_phone);
    L52:
        this.A.setText(r9);
        this.B.setMovementMethod(LinkMovementMethod.getInstance());
        this.D.setOnClickListener(new p6(27, this));
        ListView r10 = (ListView) findViewById(R.id.mr_chooser_list);
        this.F = r10;
        r10.setAdapter(this.G);
        this.F.setOnItemClickListener(this.G);
        this.F.setEmptyView(findViewById(android.R.id.empty));
        getWindow().setLayout(xl.p(getContext()), -2);
        getContext().registerReceiver(this.H, new IntentFilter("android.intent.action.SCREEN_OFF"));
        return;
    L21:
        if (gi1.m != null) goto L30;
        SensorManager r3 = (SensorManager) r8.getSystemService("sensor");
        if (Build.VERSION.SDK_INT < 30) goto L28;
        if (r3 == null) goto L28;
        if (r3.getDefaultSensor(36) == null) goto L28;
        r2 = true;
    L28:
        gi1.m = Boolean.valueOf(r2);
    L30:
        if (gi1.m.booleanValue() == true) goto L51;
        if (gi1.A(r8) == false) goto L35;
    L50:
        r9 = r8.getString(R.string.mr_chooser_wifi_warning_description_tablet);
        goto L52
    L35:
        if (gi1.z(r8.getResources()) == true) goto L50;
        if (gi1.B(r8) == false) goto L40;
        r9 = r8.getString(R.string.mr_chooser_wifi_warning_description_tv);
        goto L52
    L40:
        PackageManager r4 = r8.getPackageManager();
        if (gi1.o != null) goto L44;
        gi1.o = Boolean.valueOf(r4.hasSystemFeature("android.hardware.type.watch"));
    L44:
        if (gi1.o.booleanValue() == false) goto L47;
        r9 = r8.getString(R.string.mr_chooser_wifi_warning_description_watch);
        goto L52
    L47:
        if (gi1.x(r8) == false) goto L49;
        r9 = r8.getString(R.string.mr_chooser_wifi_warning_description_car);
        goto L52
    L49:
        r9 = r8.getString(R.string.mr_chooser_wifi_warning_description_unknown);
        goto L52
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.I = false;
        this.t.e(this.u);
        zk r1 = this.K;
        r1.removeMessages(1);
        r1.removeMessages(2);
        r1.removeMessages(3);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.dg, android.app.Dialog
    public final void setTitle(CharSequence r1) {
        this.x.setText(r1);
    }

    @Override // defpackage.dg, android.app.Dialog
    public final void setTitle(int r1) {
        this.x.setText(r1);
    }
}
