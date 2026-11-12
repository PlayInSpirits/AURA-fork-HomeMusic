package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteExpandCollapseButton;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import androidx.mediarouter.app.OverlayListView;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qp2 extends f9 {
    public static final int B0 = 0;
    public Button A;
    public final g5 A0;
    public Button B;
    public ImageButton C;
    public MediaRouteExpandCollapseButton D;
    public FrameLayout E;
    public LinearLayout F;
    public FrameLayout G;
    public ImageView H;
    public TextView I;
    public TextView J;
    public TextView K;
    public final boolean L;
    public final boolean M;
    public LinearLayout N;
    public RelativeLayout O;
    public LinearLayout P;
    public View Q;
    public OverlayListView R;
    public pp2 S;
    public ArrayList T;
    public HashSet U;
    public HashSet V;
    public HashSet W;
    public SeekBar X;
    public op2 Y;
    public wq2 Z;
    public int a0;
    public int b0;
    public int c0;
    public final int d0;
    public HashMap e0;
    public final np2 f0;
    public PlaybackStateCompat g0;
    public MediaDescriptionCompat h0;
    public mp2 i0;
    public Bitmap j0;
    public Uri k0;
    public boolean l0;
    public Bitmap m0;
    public int n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public int t0;
    public final yq2 u;
    public int u0;
    public final ap2 v;
    public int v0;
    public final wq2 w;
    public Interpolator w0;
    public final Context x;
    public final Interpolator x0;
    public boolean y;
    public final Interpolator y0;
    public int z;
    public final AccessibilityManager z0;

    static {
        Log.isLoggable("MediaRouteCtrlDialog", 3);
        B0 = 30000;
    }

    public qp2(Context r5) {
        boolean r0 = true;
        ContextThemeWrapper r6 = fu.o(r5, true);
        int r1 = fu.B(r6, R.attr.mediaRouteTheme);
        if (r1 != 0) goto L5;
        r1 = fu.z(r6);
    L5:
        super(r6, r1);
        this.L = true;
        this.A0 = new g5(21, this);
        Context r2 = getContext();
        this.x = r2;
        this.f0 = new np2(this, 0);
        this.u = yq2.d(r2);
        if (yq2.c != null) goto L8;
        r0 = false;
    L9:
        this.M = r0;
        this.v = new ap2(this, 2);
        yq2.b();
        this.w = yq2.c().g();
        s();
        this.d0 = r2.getResources().getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_padding_top);
        this.z0 = (AccessibilityManager) r2.getSystemService("accessibility");
        this.x0 = AnimationUtils.loadInterpolator(r6, R.interpolator.mr_linear_out_slow_in);
        this.y0 = AnimationUtils.loadInterpolator(r6, R.interpolator.mr_fast_out_slow_in);
        return;
    L8:
        yq2.c().getClass();
        goto L9
    }

    public static void r(View r1, int r2) {
        ViewGroup.LayoutParams r0 = r1.getLayoutParams();
        r0.height = r2;
        r1.setLayoutParams(r0);
    }

    public final void k(View r5, int r6) {
        jp2 r1 = new jp2(r5.getLayoutParams().height, r6, 0, r5);
        r1.setDuration(this.t0);
        r1.setInterpolator(this.w0);
        r5.startAnimation(r1);
    }

    public final boolean l() {
        if (this.h0 == null) goto L5;
        return true;
    L5:
        if (this.g0 != null) goto L11;
        return false;
    L11:
        return true;
    }

    public final void m(boolean r11) {
        int r0 = this.R.getFirstVisiblePosition();
        int r2 = 0;
    L3:
        int r3 = this.R.getChildCount();
        OverlayListView r4 = this.R;
        if (r2 >= r3) goto L14;
        View r5 = r4.getChildAt(r2);
        wq2 r6 = (wq2) this.S.getItem(r0 + r2);
        if (r11 == false) goto L12;
        HashSet r7 = this.U;
        if (r7 == null) goto L12;
        if (r7.contains(r6) == false) goto L12;
    L13:
        r2 = r2 + 1;
    L12:
        ((LinearLayout) r5.findViewById(R.id.volume_item_container)).setVisibility(0);
        AnimationSet r8 = new AnimationSet(true);
        AlphaAnimation r9 = new AlphaAnimation(1.0f, 1.0f);
        r9.setDuration(0);
        r8.addAnimation(r9);
        new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0);
        r8.setFillAfter(true);
        r8.setFillEnabled(true);
        r5.clearAnimation();
        r5.startAnimation(r8);
        goto L13
    L14:
        ArrayList r1 = r4.n;
        int r10 = r1.size();
        int r12 = 0;
    L15:
        if (r12 >= r10) goto L19;
        Object r13 = r1.get(r12);
        r12 = r12 + 1;
        pb3 r14 = (pb3) r13;
        r14.j = true;
        r14.k = true;
        hd5 r15 = r14.l;
        if (r15 == null) goto L15;
        qp2 r16 = (qp2) r15.p;
        r16.W.remove((wq2) r15.o);
        r16.S.notifyDataSetChanged();
        goto L15
    L19:
        if (r11 == true) goto L30;
        n(false);
        return;
    }

    public final void n(boolean r3) {
        this.U = null;
        this.V = null;
        this.r0 = false;
        if (this.s0 == false) goto L5;
        this.s0 = false;
        w(r3);
    L5:
        this.R.setEnabled(true);
    }

    public final int o(int r2, int r3) {
        int r1 = this.z;
        if (r2 < r3) goto L7;
        float r4 = r1 * r3;
        float r5 = r2;
    L6:
        return (int) ((r4 / r5) + 0.5f);
    L7:
        r4 = r1 * 9.0f;
        r5 = 16.0f;
        goto L6
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rq2 r0 = rq2.c;
        ap2 r1 = this.v;
        this.u.a(r0, r1, 2);
        ui1 r2 = yq2.c;
        s();
    }

    @Override // defpackage.f9, defpackage.dg, defpackage.n70, android.app.Dialog
    public final void onCreate(Bundle r11) {
        super.onCreate(r11);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setContentView(R.layout.mr_controller_material_dialog_b);
        findViewById(android.R.id.button3).setVisibility(8);
        lp2 r12 = new lp2(this, 0);
        FrameLayout r2 = (FrameLayout) findViewById(R.id.mr_expandable_area);
        this.E = r2;
        r2.setOnClickListener(new lp2(this, 1));
        LinearLayout r3 = (LinearLayout) findViewById(R.id.mr_dialog_area);
        this.F = r3;
        r3.setOnClickListener(new hp2());
        Context r4 = this.x;
        int r5 = fu.A(r4, 0, R.attr.colorPrimary);
        if (v50.d(r5, fu.A(r4, 0, android.R.attr.colorBackground)) >= 3.0d) goto L5;
        r5 = fu.A(r4, 0, R.attr.colorAccent);
    L5:
        Button r6 = (Button) findViewById(android.R.id.button2);
        this.A = r6;
        r6.setText(R.string.mr_controller_disconnect);
        this.A.setTextColor(r5);
        this.A.setOnClickListener(r12);
        Button r7 = (Button) findViewById(android.R.id.button1);
        this.B = r7;
        r7.setText(R.string.mr_controller_stop_casting);
        this.B.setTextColor(r5);
        this.B.setOnClickListener(r12);
        this.K = (TextView) findViewById(R.id.mr_name);
        ((ImageButton) findViewById(R.id.mr_close)).setOnClickListener(r12);
        FrameLayout r8 = (FrameLayout) findViewById(R.id.mr_custom_control);
        this.G = (FrameLayout) findViewById(R.id.mr_default_control);
        lp2 r9 = new lp2(this, 2);
        ImageView r10 = (ImageView) findViewById(R.id.mr_art);
        this.H = r10;
        r10.setOnClickListener(r9);
        findViewById(R.id.mr_control_title_container).setOnClickListener(r9);
        this.N = (LinearLayout) findViewById(R.id.mr_media_main_control);
        this.Q = findViewById(R.id.mr_control_divider);
        this.O = (RelativeLayout) findViewById(R.id.mr_playback_control);
        this.I = (TextView) findViewById(R.id.mr_control_title);
        this.J = (TextView) findViewById(R.id.mr_control_subtitle);
        ImageButton r13 = (ImageButton) findViewById(R.id.mr_control_playback_ctrl);
        this.C = r13;
        r13.setOnClickListener(r12);
        LinearLayout r14 = (LinearLayout) findViewById(R.id.mr_volume_control);
        this.P = r14;
        r14.setVisibility(8);
        SeekBar r15 = (SeekBar) findViewById(R.id.mr_volume_slider);
        this.X = r15;
        wq2 r0 = this.w;
        r15.setTag(r0);
        op2 r16 = new op2(this);
        this.Y = r16;
        this.X.setOnSeekBarChangeListener(r16);
        this.R = (OverlayListView) findViewById(R.id.mr_volume_group_list);
        this.T = new ArrayList();
        pp2 r17 = new pp2(this, this.R.getContext(), this.T);
        this.S = r17;
        this.R.setAdapter(r17);
        this.W = new HashSet();
        LinearLayout r18 = this.N;
        OverlayListView r19 = this.R;
        boolean r20 = q();
        int r21 = fu.A(r4, 0, R.attr.colorPrimary);
        int r22 = fu.A(r4, 0, R.attr.colorPrimaryDark);
        if (r20 == true) goto L8;
    L10:
        r18.setBackgroundColor(r21);
        r19.setBackgroundColor(r22);
        r18.setTag(Integer.valueOf(r21));
        r19.setTag(Integer.valueOf(r22));
        MediaRouteVolumeSlider r110 = (MediaRouteVolumeSlider) this.X;
        LinearLayout r23 = this.N;
        int r1 = fu.u(r4, 0);
        if (Color.alpha(r1) == 255) goto L13;
        r1 = v50.g(r1, ((Integer) r23.getTag()).intValue());
    L13:
        r110.a(r1, r1);
        HashMap r111 = new HashMap();
        this.e0 = r111;
        r111.put(r0, this.X);
        MediaRouteExpandCollapseButton r112 = (MediaRouteExpandCollapseButton) findViewById(R.id.mr_group_expand_collapse);
        this.D = r112;
        r112.v = new lp2(this, 3);
        if (this.q0 == false) goto L16;
        Interpolator r113 = this.x0;
    L17:
        this.w0 = r113;
        this.t0 = r4.getResources().getInteger(R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.u0 = r4.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.v0 = r4.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
        this.y = true;
        v();
        return;
    L16:
        r113 = this.y0;
        goto L17
    L8:
        if (fu.u(r4, 0) != (-570425344)) goto L10;
        r22 = r21;
        r21 = -1;
        goto L10
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.u.e(this.v);
        s();
        super.onDetachedFromWindow();
    }

    @Override // defpackage.f9, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r3, KeyEvent r4) {
        if (r3 == 25) goto L10;
        if (r3 == 24) goto L10;
        return super.onKeyDown(r3, r4);
    L10:
        if (this.M == false) goto L12;
    L13:
        if (r3 != 25) goto L15;
        int r5 = -1;
    L16:
        wq2 r2 = this.w;
        r2.getClass();
        yq2.b();
        if (r5 == 0) goto L21;
        oq2 r6 = yq2.c().f(r2);
        if (r6 == null) goto L21;
        r6.i(r5);
    L21:
        return true;
    L15:
        r5 = 1;
        goto L16
    L12:
        if (this.q0 == true) goto L21;
        goto L13
    }

    @Override // defpackage.f9, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int r2, KeyEvent r3) {
        if (r2 != 25) goto L5;
        return true;
    L5:
        if (r2 != 24) goto L8;
        return true;
    L8:
        return super.onKeyUp(r2, r3);
    }

    public final int p(boolean r3) {
        if (r3 == false) goto L4;
    L8:
        int r0 = this.N.getPaddingTop();
        int r1 = this.N.getPaddingBottom() + r0;
        if (r3 == false) goto L12;
        r1 = r1 + this.O.getMeasuredHeight();
    L12:
        if (this.P.getVisibility() != 0) goto L14;
        r1 = r1 + this.P.getMeasuredHeight();
    L14:
        if (r3 == true) goto L16;
    L19:
        return r1;
    L16:
        if (this.P.getVisibility() != 0) goto L19;
        return this.Q.getMeasuredHeight() + r1;
    L4:
        if (this.P.getVisibility() == 0) goto L8;
        return 0;
    }

    public final boolean q() {
        wq2 r1 = this.w;
        if (r1.e() == true) goto L5;
        return false;
    L5:
        if (Collections.unmodifiableList(r1.v).size() <= 1) goto L9;
        return true;
    L9:
        return false;
    }

    public final void s() {
    }

    public final void t(boolean r13) {
        boolean r1 = true;
        if (this.Z == null) goto L6;
        this.o0 = true;
        this.p0 = r13 | this.p0;
        return;
    L6:
        int r0 = 0;
        this.o0 = false;
        this.p0 = false;
        wq2 r2 = this.w;
        if (r2.g() == true) goto L9;
    L126:
        dismiss();
        return;
    L9:
        if (r2.d() == true) goto L126;
        if (this.y == true) goto L14;
        return;
    L14:
        this.K.setText(r2.d);
        Button r3 = this.A;
        if (r2.j == false) goto L17;
        int r4 = 0;
    L18:
        r3.setVisibility(r4);
        CharSequence r5 = null;
        if (this.l0 == false) goto L27;
        Bitmap r6 = this.m0;
        if (r6 != null) goto L23;
    L25:
        this.H.setImageBitmap(this.m0);
        this.H.setBackgroundColor(this.n0);
    L26:
        this.l0 = false;
        this.m0 = null;
        this.n0 = 0;
        goto L27
    L23:
        if (r6.isRecycled() == false) goto L25;
        Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.m0);
    L27:
        boolean r7 = this.M;
        if (r7 == true) goto L37;
        if (q() == false) goto L37;
        this.P.setVisibility(8);
        this.q0 = true;
        this.R.setVisibility(0);
        if (this.q0 == false) goto L34;
        Interpolator r8 = this.x0;
    L35:
        this.w0 = r8;
        w(false);
    L58:
        if (l() == false) goto L124;
        MediaDescriptionCompat r9 = this.h0;
        if (r9 != null) goto L62;
        CharSequence r10 = null;
    L63:
        boolean r11 = TextUtils.isEmpty(r10);
        MediaDescriptionCompat r12 = this.h0;
        if (r12 == null) goto L67;
        r5 = r12.p;
    L67:
        boolean r14 = TextUtils.isEmpty(r5);
        if (r2.r == (-1)) goto L71;
        this.I.setText(R.string.mr_controller_casting_screen);
    L70:
        boolean r15 = false;
        boolean r16 = true;
    L86:
        TextView r17 = this.I;
        if (r16 == false) goto L89;
        int r18 = 0;
    L90:
        r17.setVisibility(r18);
        TextView r19 = this.J;
        if (r15 == false) goto L93;
        int r20 = 0;
    L94:
        r19.setVisibility(r20);
        PlaybackStateCompat r21 = this.g0;
        if (r21 == null) goto L124;
        int r22 = r21.n;
        if (r22 != 6) goto L99;
    L102:
        boolean r23 = true;
    L103:
        Context r24 = this.C.getContext();
        if (r23 == true) goto L106;
    L108:
        if (r23 == true) goto L110;
    L112:
        if (r23 == false) goto L114;
    L116:
        r1 = false;
        int r25 = 0;
        int r26 = 0;
    L117:
        ImageButton r27 = this.C;
        if (r1 == true) goto L121;
        r0 = 8;
    L121:
        r27.setVisibility(r0);
        if (r1 == false) goto L124;
        this.C.setImageResource(fu.B(r24, r25));
        this.C.setContentDescription(r24.getResources().getText(r26));
        goto L124
    L114:
        if ((this.g0.r & 516) == 0) goto L116;
        r25 = R.attr.mediaRoutePlayDrawable;
        r26 = R.string.mr_controller_play;
        goto L117
    L110:
        if ((this.g0.r & 1) == 0) goto L112;
        r25 = R.attr.mediaRouteStopDrawable;
        r26 = R.string.mr_controller_stop;
        goto L117
    L106:
        if ((this.g0.r & 514) == 0) goto L108;
        r25 = R.attr.mediaRoutePauseDrawable;
        r26 = R.string.mr_controller_pause;
        goto L117
    L99:
        if (r22 == 3) goto L102;
        r23 = false;
        goto L103
    L93:
        r20 = 8;
        goto L94
    L89:
        r18 = 8;
        goto L90
    L71:
        PlaybackStateCompat r28 = this.g0;
        if (r28 != null) goto L74;
    L85:
        this.I.setText(R.string.mr_controller_no_media_selected);
        goto L70
    L74:
        if (r28.n == 0) goto L85;
        if (r11 == false) goto L79;
        if (r14 == false) goto L79;
        this.I.setText(R.string.mr_controller_no_info_available);
    L79:
        if (r11 == true) goto L81;
        this.I.setText(r10);
        r16 = true;
    L82:
        if (r14 == true) goto L84;
        this.J.setText(r5);
        r15 = true;
        goto L86
    L84:
        r15 = false;
        goto L86
    L81:
        r16 = false;
        goto L82
    L62:
        r10 = r9.o;
    L124:
        w(r13);
        return;
    L34:
        r8 = this.y0;
    L37:
        if (this.q0 == false) goto L40;
        if (r7 == true) goto L40;
    L56:
        this.P.setVisibility(8);
    L40:
        if (this.L == false) goto L56;
        if (r2.e() == true) goto L44;
    L47:
        int r29 = r2.o;
    L48:
        if (r29 != 1) goto L56;
        if (this.P.getVisibility() != 8) goto L58;
        this.P.setVisibility(0);
        this.X.setMax(r2.q);
        this.X.setProgress(r2.p);
        MediaRouteExpandCollapseButton r30 = this.D;
        if (q() == false) goto L54;
        int r31 = 0;
    L55:
        r30.setVisibility(r31);
        goto L58
    L54:
        r31 = 8;
        goto L55
    L44:
        if (yq2.c != null) goto L46;
        r29 = 0;
        goto L48
    L46:
        yq2.c().getClass();
        goto L47
    L17:
        r4 = 8;
        goto L18
    }

    public final void u() {
        MediaDescriptionCompat r0 = this.h0;
        Uri r1 = null;
        if (r0 != null) goto L5;
        Bitmap r2 = null;
    L6:
        if (r0 == null) goto L9;
        r1 = r0.s;
    L9:
        mp2 r3 = this.i0;
        if (r3 != null) goto L12;
        Bitmap r4 = this.j0;
    L13:
        if (r3 != null) goto L15;
        Uri r5 = this.k0;
    L16:
        if (r4 != r2) goto L27;
        if (r4 != null) goto L36;
        if (r5 != null) goto L21;
    L23:
        if (r5 != null) goto L27;
        if (r1 != null) goto L27;
        return;
    L21:
        if (r5.equals(r1) == false) goto L23;
        return;
    L36:
        return;
    L27:
        if (q() == true) goto L29;
    L31:
        mp2 r6 = this.i0;
        if (r6 == null) goto L34;
        r6.cancel(true);
    L34:
        mp2 r7 = new mp2(this);
        this.i0 = r7;
        r7.execute(new Void[0]);
        return;
    L29:
        if (this.M == true) goto L31;
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

    public final void v() {
        Context r0 = this.x;
        int r1 = xl.p(r0);
        getWindow().setLayout(r1, -2);
        View r2 = getWindow().getDecorView();
        this.z = (r1 - r2.getPaddingLeft()) - r2.getPaddingRight();
        Resources r3 = r0.getResources();
        this.a0 = r3.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.b0 = r3.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
        this.c0 = r3.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
        this.j0 = null;
        this.k0 = null;
        u();
        t(false);
    }

    public final void w(boolean r3) {
        this.G.requestLayout();
        this.G.getViewTreeObserver().addOnGlobalLayoutListener(new ip2(this, r3));
    }

    public final void x(boolean r5) {
        View r0 = this.Q;
        int r2 = 0;
        if (this.P.getVisibility() != 0) goto L6;
        if (r5 == false) goto L6;
        int r1 = 0;
    L7:
        r0.setVisibility(r1);
        LinearLayout r3 = this.N;
        if (this.P.getVisibility() != 8) goto L11;
        if (r5 == true) goto L11;
        r2 = 8;
    L11:
        r3.setVisibility(r2);
        return;
    L6:
        r1 = 8;
        goto L7
    }
}
