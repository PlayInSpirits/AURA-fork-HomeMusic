package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lq2 extends dg {
    public static final /* synthetic */ int g0 = 0;
    public final ArrayList A;
    public final Context B;
    public boolean C;
    public boolean D;
    public long E;
    public final zk F;
    public RecyclerView G;
    public jq2 H;
    public kq2 I;
    public HashMap J;
    public wq2 K;
    public HashMap L;
    public boolean M;
    public boolean N;
    public boolean O;
    public ImageButton P;
    public Button Q;
    public ImageView R;
    public View S;
    public ImageView T;
    public TextView U;
    public TextView V;
    public String W;
    public final np2 X;
    public MediaDescriptionCompat Y;
    public cq2 Z;
    public Bitmap a0;
    public Uri b0;
    public boolean c0;
    public Bitmap d0;
    public int e0;
    public final boolean f0;
    public final yq2 t;
    public final ap2 u;
    public rq2 v;
    public wq2 w;
    public final ArrayList x;
    public final ArrayList y;
    public final ArrayList z;

    static {
        Log.isLoggable("MediaRouteCtrlDialog", 3);
    }

    public lq2(Context r3) {
        boolean r0 = false;
        ContextThemeWrapper r4 = fu.o(r3, false);
        int r1 = fu.B(r4, R.attr.mediaRouteTheme);
        if (r1 != 0) goto L5;
        r1 = fu.z(r4);
    L5:
        super(r4, r1);
        this.v = rq2.c;
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.z = new ArrayList();
        this.A = new ArrayList();
        this.F = new zk(7, this);
        Context r5 = getContext();
        this.B = r5;
        this.t = yq2.d(r5);
        if (yq2.c == null) goto L9;
        yq2.c().getClass();
        r0 = true;
    L9:
        this.f0 = r0;
        this.u = new ap2(this, 4);
        yq2.b();
        this.w = yq2.c().g();
        this.X = new np2(this, 1);
        k();
    }

    public final void i(List r4) {
        int r0 = r4.size() - 1;
    L3:
        if (r0 < 0) goto L15;
        wq2 r1 = (wq2) r4.get(r0);
        if (r1.d() == false) goto L7;
    L13:
        r4.remove(r0);
    L14:
        r0 = r0 - 1;
        goto L3
    L7:
        if (r1.g == false) goto L13;
        if (r1.h(this.v) == false) goto L13;
        if (this.w == r1) goto L13;
    }

    public final void j() {
        MediaDescriptionCompat r0 = this.Y;
        Uri r1 = null;
        if (r0 != null) goto L5;
        Bitmap r2 = null;
    L6:
        if (r0 == null) goto L9;
        r1 = r0.s;
    L9:
        cq2 r3 = this.Z;
        if (r3 != null) goto L12;
        Bitmap r4 = this.a0;
    L13:
        if (r3 != null) goto L15;
        Uri r5 = this.b0;
    L16:
        if (r4 != r2) goto L21;
        if (r4 == null) goto L19;
        return;
    L19:
        if (Objects.equals(r5, r1) == false) goto L21;
        return;
    L21:
        cq2 r6 = this.Z;
        if (r6 == null) goto L24;
        r6.cancel(true);
    L24:
        cq2 r7 = new cq2(this);
        this.Z = r7;
        r7.execute(new Void[0]);
        return;
    L15:
        r5 = r3.b;
        goto L16
    L12:
        r4 = r3.a;
        goto L13
    L5:
        r2 = r0.r;
        goto L6
    }

    public final void k() {
    }

    public final void l(rq2 r4) {
        if (r4 != null) goto L4;
        kf2.n("selector must not be null");
        return;
    L4:
        if (this.v.equals(r4) == true) goto L11;
        this.v = r4;
        if (this.D == false) goto L12;
        yq2 r0 = this.t;
        ap2 r1 = this.u;
        r0.e(r1);
        r0.a(r4, r1, 1);
        o();
        return;
    L12:
        return;
    }

    public final void m() {
        Context r0 = this.B;
        int r3 = -1;
        if (r0.getResources().getBoolean(R.bool.is_tablet) == true) goto L5;
        int r1 = -1;
    L7:
        if (r0.getResources().getBoolean(R.bool.is_tablet) == false) goto L10;
        r3 = -2;
    L10:
        getWindow().setLayout(r1, r3);
        this.a0 = null;
        this.b0 = null;
        j();
        n();
        p();
        return;
    L5:
        r1 = xl.p(r0);
        goto L7
    }

    public final void n() {
        if (this.K == null) goto L5;
    L8:
        boolean r0 = true;
    L9:
        if (r0 == false) goto L12;
        this.O = true;
        return;
    L12:
        this.O = false;
        if (this.w.g() == true) goto L15;
    L16:
        dismiss();
    L17:
        CharSequence r3 = null;
        if (this.c0 == false) goto L27;
        Bitmap r2 = this.d0;
        if (r2 == null) goto L25;
        if (r2.isRecycled() == true) goto L27;
    L25:
        if (this.d0 == null) goto L27;
        this.T.setVisibility(0);
        this.T.setImageBitmap(this.d0);
        this.T.setBackgroundColor(this.e0);
        this.S.setVisibility(0);
        Bitmap r4 = this.d0;
        RenderScript r5 = RenderScript.create(this.B);
        Allocation r6 = Allocation.createFromBitmap(r5, r4);
        Allocation r7 = Allocation.createTyped(r5, r6.getType());
        ScriptIntrinsicBlur r8 = ScriptIntrinsicBlur.create(r5, Element.U8_4(r5));
        r8.setRadius(10.0f);
        r8.setInput(r6);
        r8.forEach(r7);
        Bitmap r1 = r4.copy(r4.getConfig(), true);
        r7.copyTo(r1);
        r6.destroy();
        r7.destroy();
        r8.destroy();
        r5.destroy();
        this.R.setImageBitmap(r1);
    L33:
        this.c0 = false;
        this.d0 = null;
        this.e0 = 0;
        MediaDescriptionCompat r9 = this.Y;
        if (r9 != null) goto L36;
        CharSequence r10 = null;
    L37:
        boolean r11 = TextUtils.isEmpty(r10);
        MediaDescriptionCompat r12 = this.Y;
        if (r12 == null) goto L41;
        r3 = r12.p;
    L41:
        boolean r13 = TextUtils.isEmpty(r3);
        TextView r14 = this.U;
        if (r11 == true) goto L44;
        r14.setText(r10);
    L45:
        TextView r15 = this.V;
        if (r13 == true) goto L49;
        r15.setText(r3);
        this.V.setVisibility(0);
        return;
    L49:
        r15.setVisibility(8);
        return;
    L44:
        r14.setText(this.W);
        goto L45
    L36:
        r10 = r9.o;
    L27:
        Bitmap r16 = this.d0;
        if (r16 != null) goto L30;
    L32:
        this.T.setVisibility(8);
        this.S.setVisibility(8);
        this.R.setImageBitmap(null);
        goto L33
    L30:
        if (r16.isRecycled() == false) goto L32;
        Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.d0);
        goto L32
    L15:
        if (this.w.d() == false) goto L17;
    L5:
        if (this.M == true) goto L8;
        r0 = !this.C;
        goto L9
    }

    public final void o() {
        ArrayList r0 = this.x;
        r0.clear();
        ArrayList r1 = this.y;
        r1.clear();
        ArrayList r2 = this.z;
        r2.clear();
        r0.addAll(Collections.unmodifiableList(this.w.v));
        tq2 r3 = this.w.a();
        if (r3 == null) goto L15;
        vq2 r4 = this.w.a;
        r4.getClass();
        yq2.b();
        Iterator r5 = Collections.unmodifiableList(r4.b).iterator();
    L6:
        if (r5.hasNext() == false) goto L15;
        wq2 r6 = (wq2) r5.next();
        if (r3.n(r6) == false) goto L10;
        r1.add(r6);
    L10:
        mq2 r7 = (mq2) r3.x.get(r6.c);
        if (r7 == null) goto L6;
        if (r7.e == false) goto L6;
        r2.add(r6);
    L15:
        i(r1);
        i(r2);
        ca1 r8 = ca1.s;
        Collections.sort(r0, r8);
        Collections.sort(r1, r8);
        Collections.sort(r2, r8);
        this.H.s();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D = true;
        rq2 r1 = this.v;
        ap2 r2 = this.u;
        this.t.a(r1, r2, 1);
        o();
        ui1 r0 = yq2.c;
        k();
    }

    @Override // defpackage.dg, defpackage.n70, android.app.Dialog
    public final void onCreate(Bundle r6) {
        super.onCreate(r6);
        setContentView(R.layout.mr_cast_dialog);
        View r7 = getWindow().getDecorView();
        Context r0 = this.B;
        if (fu.D(r0) == false) goto L5;
        int r1 = R.color.mr_dynamic_dialog_background_light;
    L6:
        r7.setBackgroundColor(r0.getColor(r1));
        ImageButton r8 = (ImageButton) findViewById(R.id.mr_cast_close_button);
        this.P = r8;
        r8.setColorFilter(-1);
        this.P.setOnClickListener(new bq2(this, 0));
        Button r9 = (Button) findViewById(R.id.mr_cast_stop_button);
        this.Q = r9;
        r9.setTextColor(-1);
        this.Q.setOnClickListener(new bq2(this, 1));
        this.H = new jq2(this);
        RecyclerView r10 = (RecyclerView) findViewById(R.id.mr_cast_list);
        this.G = r10;
        r10.setAdapter(this.H);
        this.G.setLayoutManager(new LinearLayoutManager(1));
        this.I = new kq2(0, this);
        this.J = new HashMap();
        this.L = new HashMap();
        this.R = (ImageView) findViewById(R.id.mr_cast_meta_background);
        this.S = findViewById(R.id.mr_cast_meta_black_scrim);
        this.T = (ImageView) findViewById(R.id.mr_cast_meta_art);
        TextView r11 = (TextView) findViewById(R.id.mr_cast_meta_title);
        this.U = r11;
        r11.setTextColor(-1);
        TextView r12 = (TextView) findViewById(R.id.mr_cast_meta_subtitle);
        this.V = r12;
        r12.setTextColor(-1);
        this.W = r0.getResources().getString(R.string.mr_cast_dialog_title_view_placeholder);
        this.C = true;
        m();
        return;
    L5:
        r1 = R.color.mr_dynamic_dialog_background_dark;
        goto L6
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D = false;
        this.t.e(this.u);
        this.F.removeCallbacksAndMessages(null);
        k();
    }

    public final void p() {
        if (this.D == true) goto L5;
        return;
    L5:
        if ((SystemClock.uptimeMillis() - this.E) >= 300) goto L7;
        zk r0 = this.F;
        r0.removeMessages(1);
        r0.sendEmptyMessageAtTime(1, this.E + 300);
        return;
    L7:
        if (this.K == null) goto L9;
    L12:
        boolean r1 = true;
    L13:
        if (r1 == false) goto L16;
        this.N = true;
        return;
    L16:
        this.N = false;
        if (this.w.g() == true) goto L19;
    L20:
        dismiss();
    L21:
        this.E = SystemClock.uptimeMillis();
        this.H.r();
        return;
    L19:
        if (this.w.d() == false) goto L21;
    L9:
        if (this.M == true) goto L12;
        r1 = !this.C;
        goto L13
    }

    public final void q() {
        if (this.N == false) goto L6;
        p();
    L6:
        if (this.O == false) goto L9;
        n();
        return;
    }
}
