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

    /* JADX WARN: Illegal instructions before constructor call */
    public aq2(Context context) {
        ContextThemeWrapper contextThemeWrapperO = fu.o(context, false);
        int iB = fu.B(contextThemeWrapperO, R.attr.mediaRouteTheme);
        super(contextThemeWrapperO, iB == 0 ? fu.z(contextThemeWrapperO) : iB);
        this.w = rq2.c;
        this.E = new zk(6, this);
        Context context2 = getContext();
        this.t = yq2.d(context2);
        this.u = new ap2(this, 3);
        this.v = context2;
        this.C = context2.getResources().getInteger(R.integer.mr_update_routes_delay_ms);
    }

    public final void i() {
        if (this.B == null && this.A) {
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
                if (wq2Var.d() || !wq2Var.g || !wq2Var.h(this.w)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, ca1.r);
            long jUptimeMillis = SystemClock.uptimeMillis() - this.D;
            long j = this.C;
            if (jUptimeMillis < j) {
                zk zkVar = this.E;
                zkVar.removeMessages(1);
                zkVar.sendMessageAtTime(zkVar.obtainMessage(1, arrayList), this.D + j);
            } else {
                this.D = SystemClock.uptimeMillis();
                this.x.clear();
                this.x.addAll(arrayList);
                this.y.p();
            }
        }
    }

    public final void j(rq2 rq2Var) {
        if (rq2Var == null) {
            kf2.n("selector must not be null");
            return;
        }
        if (this.w.equals(rq2Var)) {
            return;
        }
        this.w = rq2Var;
        if (this.A) {
            yq2 yq2Var = this.t;
            ap2 ap2Var = this.u;
            yq2Var.e(ap2Var);
            yq2Var.a(rq2Var, ap2Var, 1);
        }
        i();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A = true;
        this.t.a(this.w, this.u, 1);
        i();
    }

    @Override // defpackage.dg, defpackage.n70, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_picker_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.v;
        decorView.setBackgroundColor(context.getColor(fu.D(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        this.x = new ArrayList();
        ((ImageButton) findViewById(R.id.mr_picker_close_button)).setOnClickListener(new i4(6, this));
        this.y = new zp2(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_picker_list);
        this.z = recyclerView;
        recyclerView.setAdapter(this.y);
        this.z.setLayoutManager(new LinearLayoutManager(1));
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : xl.p(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A = false;
        this.t.e(this.u);
        this.E.removeMessages(1);
    }
}
