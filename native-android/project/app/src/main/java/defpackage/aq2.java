package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class aq2 extends dg {
    public boolean A;
    public wq2 B;
    public final long C;
    public long D;
    public final zk E;
    public final yq2 t;
    public final ap2 u;
    public final Context v;
    public rq2 w;
    public ArrayList x;
    public zp2 y;
    public RecyclerView z;

    public aq2(Context r3) {
        ContextThemeWrapper r4 = fu.o(r3, false);
        int r0 = fu.B(r4, R.attr.mediaRouteTheme);
        if (r0 != 0) goto L5;
        r0 = fu.z(r4);
    L5:
        super(r4, r0);
        this.w = rq2.c;
        this.E = new zk(6, this);
        Context r5 = getContext();
        this.t = yq2.d(r5);
        this.u = new ap2(this, 3);
        this.v = r5;
        this.C = r5.getResources().getInteger(R.integer.mr_update_routes_delay_ms);
    }

    public final void i() {
        if (this.B == null) goto L6;
        return;
    L6:
        if (this.A == false) goto L28;
        this.t.getClass();
        yq2.b();
        ArrayList r0 = new ArrayList(yq2.c().h);
        int r1 = r0.size();
    L8:
        int r2 = r1 - 1;
        if (r1 <= 0) goto L19;
        wq2 r3 = (wq2) r0.get(r2);
        if (r3.d() == false) goto L13;
    L17:
        r0.remove(r2);
    L18:
        r1 = r2;
        goto L8
    L13:
        if (r3.g == false) goto L17;
        if (r3.h(this.w) == false) goto L17;
    L19:
        Collections.sort(r0, ca1.r);
        long r4 = SystemClock.uptimeMillis() - this.D;
        long r5 = this.C;
        if (r4 < r5) goto L23;
        this.D = SystemClock.uptimeMillis();
        this.x.clear();
        this.x.addAll(r0);
        this.y.p();
        return;
    L23:
        zk r6 = this.E;
        r6.removeMessages(1);
        r6.sendMessageAtTime(r6.obtainMessage(1, r0), this.D + r5);
        return;
    }

    public final void j(rq2 r4) {
        if (r4 != null) goto L4;
        kf2.n("selector must not be null");
        return;
    L4:
        if (this.w.equals(r4) == true) goto L12;
        this.w = r4;
        if (this.A == false) goto L8;
        yq2 r0 = this.t;
        ap2 r1 = this.u;
        r0.e(r1);
        r0.a(r4, r1, 1);
    L8:
        i();
        return;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A = true;
        rq2 r1 = this.w;
        ap2 r2 = this.u;
        this.t.a(r1, r2, 1);
        i();
    }

    @Override // defpackage.dg, defpackage.n70, android.app.Dialog
    public final void onCreate(Bundle r4) {
        super.onCreate(r4);
        setContentView(R.layout.mr_picker_dialog);
        View r5 = getWindow().getDecorView();
        Context r0 = this.v;
        if (fu.D(r0) == false) goto L5;
        int r1 = R.color.mr_dynamic_dialog_background_light;
    L6:
        r5.setBackgroundColor(r0.getColor(r1));
        this.x = new ArrayList();
        ((ImageButton) findViewById(R.id.mr_picker_close_button)).setOnClickListener(new i4(6, this));
        this.y = new zp2(this);
        RecyclerView r6 = (RecyclerView) findViewById(R.id.mr_picker_list);
        this.z = r6;
        r6.setAdapter(this.y);
        this.z.setLayoutManager(new LinearLayoutManager(1));
        int r2 = -1;
        if (r0.getResources().getBoolean(R.bool.is_tablet) == true) goto L9;
        int r7 = -1;
    L11:
        if (r0.getResources().getBoolean(R.bool.is_tablet) == false) goto L14;
        r2 = -2;
    L14:
        getWindow().setLayout(r7, r2);
        return;
    L9:
        r7 = xl.p(r0);
        goto L11
    L5:
        r1 = R.color.mr_dynamic_dialog_background_dark;
        goto L6
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A = false;
        this.t.e(this.u);
        this.E.removeMessages(1);
    }
}
