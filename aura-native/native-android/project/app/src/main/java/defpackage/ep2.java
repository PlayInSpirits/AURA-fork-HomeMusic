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
import android.widget.ListAdapter;
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

    /* JADX WARN: Illegal instructions before constructor call */
    public ep2(Context context) {
        ContextThemeWrapper contextThemeWrapperO = fu.o(context, false);
        int iB = fu.B(contextThemeWrapperO, R.attr.mediaRouteTheme);
        super(contextThemeWrapperO, iB == 0 ? fu.z(contextThemeWrapperO) : iB);
        this.v = rq2.c;
        this.K = new zk(5, this);
        this.t = yq2.d(getContext());
        this.u = new ap2(this, 1);
        this.H = new v9(6, this);
    }

    @Override // defpackage.dg, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            getContext().unregisterReceiver(this.H);
        } catch (IllegalArgumentException unused) {
        }
        super.dismiss();
    }

    public final void i(List list) {
        this.J = SystemClock.uptimeMillis();
        this.w.clear();
        this.w.addAll(list);
        this.G.notifyDataSetChanged();
        zk zkVar = this.K;
        zkVar.removeMessages(3);
        zkVar.removeMessages(2);
        if (!list.isEmpty()) {
            l(1);
        } else {
            l(0);
            zkVar.sendMessageDelayed(zkVar.obtainMessage(2), 5000L);
        }
    }

    public final void j() {
        if (this.I) {
            this.t.getClass();
            yq2.b();
            ArrayList arrayList = new ArrayList(yq2.c().h);
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                wq2 wq2Var = (wq2) arrayList.get(i);
                if (wq2Var.d() || !wq2Var.g || !wq2Var.h(this.v)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, ca1.q);
            if (SystemClock.uptimeMillis() - this.J >= 300) {
                i(arrayList);
                return;
            }
            zk zkVar = this.K;
            zkVar.removeMessages(1);
            zkVar.sendMessageAtTime(zkVar.obtainMessage(1, arrayList), this.J + 300);
        }
    }

    public final void k(rq2 rq2Var) {
        if (rq2Var == null) {
            kf2.n("selector must not be null");
            return;
        }
        if (this.v.equals(rq2Var)) {
            return;
        }
        this.v = rq2Var;
        if (this.I) {
            yq2 yq2Var = this.t;
            ap2 ap2Var = this.u;
            yq2Var.e(ap2Var);
            yq2Var.a(rq2Var, ap2Var, 1);
        }
        j();
    }

    public final void l(int i) {
        if (i == 0) {
            setTitle(R.string.mr_chooser_title);
            this.F.setVisibility(8);
            this.y.setVisibility(0);
            this.E.setVisibility(0);
            this.C.setVisibility(8);
            this.D.setVisibility(8);
            this.B.setVisibility(8);
            this.z.setVisibility(8);
            return;
        }
        if (i == 1) {
            setTitle(R.string.mr_chooser_title);
            this.F.setVisibility(0);
            this.y.setVisibility(8);
            this.E.setVisibility(8);
            this.C.setVisibility(8);
            this.D.setVisibility(8);
            this.B.setVisibility(8);
            this.z.setVisibility(8);
            return;
        }
        if (i == 2) {
            setTitle(R.string.mr_chooser_title);
            this.F.setVisibility(8);
            this.y.setVisibility(8);
            this.E.setVisibility(0);
            this.C.setVisibility(8);
            this.D.setVisibility(8);
            this.B.setVisibility(4);
            this.z.setVisibility(0);
            return;
        }
        if (i != 3) {
            return;
        }
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
        this.t.a(this.v, this.u, 1);
        j();
        zk zkVar = this.K;
        zkVar.removeMessages(2);
        zkVar.removeMessages(3);
        zkVar.removeMessages(1);
        zkVar.sendMessageDelayed(zkVar.obtainMessage(2), 5000L);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00af  */
    /* JADX WARN: Code duplicated, block: B:51:0x0149  */
    @Override // defpackage.dg, defpackage.n70, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String string;
        boolean z;
        super.onCreate(bundle);
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
        Context context = getContext();
        boolean z2 = false;
        if (gi1.k == null) {
            if (gi1.A(context)) {
                z = false;
            } else {
                PackageManager packageManager = context.getPackageManager();
                if (gi1.o == null) {
                    gi1.o = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                }
                if (gi1.o.booleanValue() || gi1.x(context) || gi1.B(context)) {
                    z = false;
                } else {
                    z = true;
                }
            }
            gi1.k = Boolean.valueOf(z);
        }
        if (gi1.k.booleanValue()) {
            string = context.getString(R.string.mr_chooser_wifi_warning_description_phone);
        } else {
            if (gi1.m == null) {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (Build.VERSION.SDK_INT >= 30 && sensorManager != null && sensorManager.getDefaultSensor(36) != null) {
                    z2 = true;
                }
                gi1.m = Boolean.valueOf(z2);
            }
            if (gi1.m.booleanValue()) {
                string = context.getString(R.string.mr_chooser_wifi_warning_description_phone);
            } else if (gi1.A(context) || gi1.z(context.getResources())) {
                string = context.getString(R.string.mr_chooser_wifi_warning_description_tablet);
            } else if (gi1.B(context)) {
                string = context.getString(R.string.mr_chooser_wifi_warning_description_tv);
            } else {
                PackageManager packageManager2 = context.getPackageManager();
                if (gi1.o == null) {
                    gi1.o = Boolean.valueOf(packageManager2.hasSystemFeature("android.hardware.type.watch"));
                }
                if (gi1.o.booleanValue()) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_watch);
                } else {
                    string = gi1.x(context) ? context.getString(R.string.mr_chooser_wifi_warning_description_car) : context.getString(R.string.mr_chooser_wifi_warning_description_unknown);
                }
            }
        }
        this.A.setText(string);
        this.B.setMovementMethod(LinkMovementMethod.getInstance());
        this.D.setOnClickListener(new p6(27, this));
        ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
        this.F = listView;
        listView.setAdapter((ListAdapter) this.G);
        this.F.setOnItemClickListener(this.G);
        this.F.setEmptyView(findViewById(android.R.id.empty));
        getWindow().setLayout(xl.p(getContext()), -2);
        getContext().registerReceiver(this.H, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.I = false;
        this.t.e(this.u);
        zk zkVar = this.K;
        zkVar.removeMessages(1);
        zkVar.removeMessages(2);
        zkVar.removeMessages(3);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.dg, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.x.setText(charSequence);
    }

    @Override // defpackage.dg, android.app.Dialog
    public final void setTitle(int i) {
        this.x.setText(i);
    }
}
