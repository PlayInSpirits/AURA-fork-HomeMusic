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

    /* JADX WARN: Illegal instructions before constructor call */
    public lq2(Context context) {
        boolean z = false;
        ContextThemeWrapper contextThemeWrapperO = fu.o(context, false);
        int iB = fu.B(contextThemeWrapperO, R.attr.mediaRouteTheme);
        super(contextThemeWrapperO, iB == 0 ? fu.z(contextThemeWrapperO) : iB);
        this.v = rq2.c;
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.z = new ArrayList();
        this.A = new ArrayList();
        this.F = new zk(7, this);
        Context context2 = getContext();
        this.B = context2;
        this.t = yq2.d(context2);
        if (yq2.c != null) {
            yq2.c().getClass();
            z = true;
        }
        this.f0 = z;
        this.u = new ap2(this, 4);
        yq2.b();
        this.w = yq2.c().g();
        this.X = new np2(this, 1);
        k();
    }

    public final void i(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            wq2 wq2Var = (wq2) list.get(size);
            if (wq2Var.d() || !wq2Var.g || !wq2Var.h(this.v) || this.w == wq2Var) {
                list.remove(size);
            }
        }
    }

    public final void j() {
        MediaDescriptionCompat mediaDescriptionCompat = this.Y;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.r;
        Uri uri = mediaDescriptionCompat != null ? mediaDescriptionCompat.s : null;
        cq2 cq2Var = this.Z;
        Bitmap bitmap2 = cq2Var == null ? this.a0 : cq2Var.a;
        Uri uri2 = cq2Var == null ? this.b0 : cq2Var.b;
        if (bitmap2 != bitmap || (bitmap2 == null && !Objects.equals(uri2, uri))) {
            cq2 cq2Var2 = this.Z;
            if (cq2Var2 != null) {
                cq2Var2.cancel(true);
            }
            cq2 cq2Var3 = new cq2(this);
            this.Z = cq2Var3;
            cq2Var3.execute(new Void[0]);
        }
    }

    public final void k() {
    }

    public final void l(rq2 rq2Var) {
        if (rq2Var == null) {
            kf2.n("selector must not be null");
            return;
        }
        if (this.v.equals(rq2Var)) {
            return;
        }
        this.v = rq2Var;
        if (this.D) {
            yq2 yq2Var = this.t;
            ap2 ap2Var = this.u;
            yq2Var.e(ap2Var);
            yq2Var.a(rq2Var, ap2Var, 1);
            o();
        }
    }

    public final void m() {
        Context context = this.B;
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : xl.p(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        this.a0 = null;
        this.b0 = null;
        j();
        n();
        p();
    }

    public final void n() {
        Bitmap bitmap;
        if ((this.K != null || this.M) ? true : !this.C) {
            this.O = true;
            return;
        }
        this.O = false;
        if (!this.w.g() || this.w.d()) {
            dismiss();
        }
        if (!this.c0 || (((bitmap = this.d0) != null && bitmap.isRecycled()) || this.d0 == null)) {
            Bitmap bitmap2 = this.d0;
            if (bitmap2 != null && bitmap2.isRecycled()) {
                Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.d0);
            }
            this.T.setVisibility(8);
            this.S.setVisibility(8);
            this.R.setImageBitmap(null);
        } else {
            this.T.setVisibility(0);
            this.T.setImageBitmap(this.d0);
            this.T.setBackgroundColor(this.e0);
            this.S.setVisibility(0);
            Bitmap bitmap3 = this.d0;
            RenderScript renderScriptCreate = RenderScript.create(this.B);
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap3);
            Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            scriptIntrinsicBlurCreate.setRadius(10.0f);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
            Bitmap bitmapCopy = bitmap3.copy(bitmap3.getConfig(), true);
            allocationCreateTyped.copyTo(bitmapCopy);
            allocationCreateFromBitmap.destroy();
            allocationCreateTyped.destroy();
            scriptIntrinsicBlurCreate.destroy();
            renderScriptCreate.destroy();
            this.R.setImageBitmap(bitmapCopy);
        }
        this.c0 = false;
        this.d0 = null;
        this.e0 = 0;
        MediaDescriptionCompat mediaDescriptionCompat = this.Y;
        CharSequence charSequence = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.o;
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.Y;
        CharSequence charSequence2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.p : null;
        boolean zIsEmpty2 = TextUtils.isEmpty(charSequence2);
        TextView textView = this.U;
        if (zIsEmpty) {
            textView.setText(this.W);
        } else {
            textView.setText(charSequence);
        }
        TextView textView2 = this.V;
        if (zIsEmpty2) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(charSequence2);
            this.V.setVisibility(0);
        }
    }

    public final void o() {
        ArrayList arrayList = this.x;
        arrayList.clear();
        ArrayList arrayList2 = this.y;
        arrayList2.clear();
        ArrayList arrayList3 = this.z;
        arrayList3.clear();
        arrayList.addAll(Collections.unmodifiableList(this.w.v));
        tq2 tq2VarA = this.w.a();
        if (tq2VarA != null) {
            vq2 vq2Var = this.w.a;
            vq2Var.getClass();
            yq2.b();
            for (wq2 wq2Var : Collections.unmodifiableList(vq2Var.b)) {
                if (tq2VarA.n(wq2Var)) {
                    arrayList2.add(wq2Var);
                }
                mq2 mq2Var = (mq2) tq2VarA.x.get(wq2Var.c);
                if (mq2Var != null && mq2Var.e) {
                    arrayList3.add(wq2Var);
                }
            }
        }
        i(arrayList2);
        i(arrayList3);
        ca1 ca1Var = ca1.s;
        Collections.sort(arrayList, ca1Var);
        Collections.sort(arrayList2, ca1Var);
        Collections.sort(arrayList3, ca1Var);
        this.H.s();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D = true;
        this.t.a(this.v, this.u, 1);
        o();
        ui1 ui1Var = yq2.c;
        k();
    }

    @Override // defpackage.dg, defpackage.n70, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_cast_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.B;
        decorView.setBackgroundColor(context.getColor(fu.D(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_cast_close_button);
        this.P = imageButton;
        imageButton.setColorFilter(-1);
        this.P.setOnClickListener(new bq2(this, 0));
        Button button = (Button) findViewById(R.id.mr_cast_stop_button);
        this.Q = button;
        button.setTextColor(-1);
        this.Q.setOnClickListener(new bq2(this, 1));
        this.H = new jq2(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_cast_list);
        this.G = recyclerView;
        recyclerView.setAdapter(this.H);
        this.G.setLayoutManager(new LinearLayoutManager(1));
        this.I = new kq2(0, this);
        this.J = new HashMap();
        this.L = new HashMap();
        this.R = (ImageView) findViewById(R.id.mr_cast_meta_background);
        this.S = findViewById(R.id.mr_cast_meta_black_scrim);
        this.T = (ImageView) findViewById(R.id.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(R.id.mr_cast_meta_title);
        this.U = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(R.id.mr_cast_meta_subtitle);
        this.V = textView2;
        textView2.setTextColor(-1);
        this.W = context.getResources().getString(R.string.mr_cast_dialog_title_view_placeholder);
        this.C = true;
        m();
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
        if (this.D) {
            if (SystemClock.uptimeMillis() - this.E < 300) {
                zk zkVar = this.F;
                zkVar.removeMessages(1);
                zkVar.sendEmptyMessageAtTime(1, this.E + 300);
                return;
            }
            if ((this.K != null || this.M) ? true : !this.C) {
                this.N = true;
                return;
            }
            this.N = false;
            if (!this.w.g() || this.w.d()) {
                dismiss();
            }
            this.E = SystemClock.uptimeMillis();
            this.H.r();
        }
    }

    public final void q() {
        if (this.N) {
            p();
        }
        if (this.O) {
            n();
        }
    }
}
