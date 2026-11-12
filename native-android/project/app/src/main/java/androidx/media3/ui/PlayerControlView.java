package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.SmartSession;
import defpackage.bu4;
import defpackage.cj3;
import defpackage.cs1;
import defpackage.cu4;
import defpackage.cw4;
import defpackage.dj3;
import defpackage.dw3;
import defpackage.ej3;
import defpackage.er1;
import defpackage.f35;
import defpackage.g14;
import defpackage.gj3;
import defpackage.gy3;
import defpackage.hj3;
import defpackage.hn2;
import defpackage.ic2;
import defpackage.iw4;
import defpackage.jj3;
import defpackage.jw4;
import defpackage.kf2;
import defpackage.lg1;
import defpackage.lj3;
import defpackage.lw2;
import defpackage.nk2;
import defpackage.p6;
import defpackage.pt3;
import defpackage.qa1;
import defpackage.qh3;
import defpackage.qi3;
import defpackage.qj3;
import defpackage.qw1;
import defpackage.rr2;
import defpackage.tb1;
import defpackage.uc5;
import defpackage.v75;
import defpackage.x5;
import defpackage.yc5;
import defpackage.ym;
import defpackage.yw1;
import defpackage.z5;
import defpackage.zg5;
import defpackage.zt4;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class PlayerControlView extends FrameLayout {
    public static final float[] U0;
    public final gj3 A;
    public final Drawable A0;
    public final cj3 B;
    public final String B0;
    public final cj3 C;
    public final String C0;
    public final zg5 D;
    public qi3 D0;
    public final PopupWindow E;
    public boolean E0;
    public final int F;
    public boolean F0;
    public final ImageView G;
    public boolean G0;
    public final ImageView H;
    public boolean H0;
    public final ImageView I;
    public boolean I0;
    public final View J;
    public boolean J0;
    public final View K;
    public int K0;
    public final TextView L;
    public boolean L0;
    public final TextView M;
    public int M0;
    public final ImageView N;
    public int N0;
    public final ImageView O;
    public long[] O0;
    public final ImageView P;
    public boolean[] P0;
    public final ImageView Q;
    public final long[] Q0;
    public final ImageView R;
    public final boolean[] R0;
    public final ImageView S;
    public long S0;
    public final View T;
    public boolean T0;
    public final View U;
    public final View V;
    public final TextView W;
    public final TextView a0;
    public final DefaultTimeBar b0;
    public final StringBuilder c0;
    public final Formatter d0;
    public final zt4 e0;
    public final bu4 f0;
    public final qa1 g0;
    public final Drawable h0;
    public final Drawable i0;
    public final Drawable j0;
    public final Drawable k0;
    public final Drawable l0;
    public final String m0;
    public final qj3 n;
    public final String n0;
    public final Resources o;
    public final String o0;
    public final Handler p;
    public final Drawable p0;
    public final dj3 q;
    public final Drawable q0;
    public final Class r;
    public final float r0;
    public final Method s;
    public final float s0;
    public final Method t;
    public final String t0;
    public final Class u;
    public final String u0;
    public final Method v;
    public final Drawable v0;
    public final Method w;
    public final Drawable w0;
    public final CopyOnWriteArrayList x;
    public final String x0;
    public final RecyclerView y;
    public final String y0;
    public final jj3 z;
    public final Drawable z0;

    static {
        hn2.a("media3.ui");
        U0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PlayerControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) throws NoSuchMethodException {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int resourceId;
        int resourceId2;
        int resourceId3;
        int resourceId4;
        int resourceId5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z7;
        boolean z8;
        int i13;
        Class<ExoPlayer> cls;
        Method method;
        Method method2;
        Class<?> cls2;
        Method method3;
        Method method4;
        DefaultTimeBar defaultTimeBar;
        int i14;
        int i15;
        nk2 nk2Var;
        super(context, attributeSet, i);
        Class cls3 = Boolean.TYPE;
        this.H0 = true;
        this.K0 = SmartSession.MAX_SONGS;
        this.N0 = 0;
        this.M0 = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, pt3.b, i, 0);
            try {
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(6, R.layout.exo_player_control_view);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(12, R.drawable.exo_styled_controls_play);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(11, R.drawable.exo_styled_controls_pause);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(10, R.drawable.exo_styled_controls_next);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(7, R.drawable.exo_styled_controls_simple_fastforward);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(15, R.drawable.exo_styled_controls_previous);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(20, R.drawable.exo_styled_controls_simple_rewind);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(9, R.drawable.exo_styled_controls_fullscreen_exit);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(8, R.drawable.exo_styled_controls_fullscreen_enter);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(17, R.drawable.exo_styled_controls_repeat_off);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(18, R.drawable.exo_styled_controls_repeat_one);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(16, R.drawable.exo_styled_controls_repeat_all);
                resourceId2 = typedArrayObtainStyledAttributes.getResourceId(35, R.drawable.exo_styled_controls_shuffle_on);
                resourceId3 = typedArrayObtainStyledAttributes.getResourceId(34, R.drawable.exo_styled_controls_shuffle_off);
                resourceId4 = typedArrayObtainStyledAttributes.getResourceId(37, R.drawable.exo_styled_controls_subtitle_on);
                resourceId5 = typedArrayObtainStyledAttributes.getResourceId(36, R.drawable.exo_styled_controls_subtitle_off);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(42, R.drawable.exo_styled_controls_vr);
                this.K0 = typedArrayObtainStyledAttributes.getInt(32, this.K0);
                this.N0 = typedArrayObtainStyledAttributes.getInt(19, this.N0);
                z2 = typedArrayObtainStyledAttributes.getBoolean(29, true);
                z3 = typedArrayObtainStyledAttributes.getBoolean(26, true);
                z4 = typedArrayObtainStyledAttributes.getBoolean(28, true);
                z5 = typedArrayObtainStyledAttributes.getBoolean(27, true);
                z8 = typedArrayObtainStyledAttributes.getBoolean(30, false);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(31, false);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(33, false);
                this.L0 = typedArrayObtainStyledAttributes.getBoolean(39, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(38, this.M0));
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                typedArrayObtainStyledAttributes.recycle();
                z6 = z11;
                i12 = resourceId6;
                i3 = resourceId8;
                i4 = resourceId9;
                i5 = resourceId10;
                i6 = resourceId11;
                i8 = resourceId16;
                i9 = resourceId17;
                i13 = resourceId12;
                i7 = resourceId15;
                i10 = resourceId14;
                i2 = resourceId7;
                z7 = z10;
                i11 = resourceId13;
                z = z9;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = R.drawable.exo_styled_controls_play;
            i3 = R.drawable.exo_styled_controls_pause;
            i4 = R.drawable.exo_styled_controls_next;
            i5 = R.drawable.exo_styled_controls_simple_fastforward;
            i6 = R.drawable.exo_styled_controls_previous;
            i7 = R.drawable.exo_styled_controls_repeat_off;
            i8 = R.drawable.exo_styled_controls_repeat_one;
            resourceId = R.drawable.exo_styled_controls_repeat_all;
            resourceId2 = R.drawable.exo_styled_controls_shuffle_on;
            resourceId3 = R.drawable.exo_styled_controls_shuffle_off;
            resourceId4 = R.drawable.exo_styled_controls_subtitle_on;
            resourceId5 = R.drawable.exo_styled_controls_subtitle_off;
            z = false;
            z2 = true;
            z3 = true;
            z4 = true;
            z5 = true;
            z6 = true;
            i9 = R.drawable.exo_styled_controls_vr;
            i10 = R.drawable.exo_styled_controls_fullscreen_enter;
            i11 = R.drawable.exo_styled_controls_fullscreen_exit;
            i12 = R.layout.exo_player_control_view;
            z7 = false;
            z8 = false;
            i13 = R.drawable.exo_styled_controls_simple_rewind;
        }
        LayoutInflater.from(context).inflate(i12, this);
        setDescendantFocusability(262144);
        this.q = new dj3(this);
        this.x = new CopyOnWriteArrayList();
        this.e0 = new zt4();
        this.f0 = new bu4();
        StringBuilder sb = new StringBuilder();
        this.c0 = sb;
        this.d0 = new Formatter(sb, Locale.getDefault());
        this.O0 = new long[0];
        this.P0 = new boolean[0];
        this.Q0 = new long[0];
        this.R0 = new boolean[0];
        this.g0 = new qa1(26, this);
        Method method5 = null;
        try {
            cls = ExoPlayer.class;
            int i16 = ExoPlayer.a;
            try {
                method = cls.getMethod("setScrubbingModeEnabled", cls3);
                try {
                    method5 = cls.getMethod("isScrubbingModeEnabled", null);
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                method = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused3) {
            cls = null;
            method = null;
        }
        this.r = cls;
        this.s = method;
        this.t = method5;
        try {
            cls2 = Class.forName("androidx.media3.transformer.CompositionPlayer");
            try {
                method3 = cls2.getMethod("setScrubbingModeEnabled", cls3);
                method2 = null;
                defaultTimeBar = 0;
                try {
                    method4 = cls2.getMethod("isScrubbingModeEnabled", null);
                } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                    method4 = method2;
                    defaultTimeBar = method2;
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused5) {
                method2 = null;
                method3 = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused6) {
            method2 = null;
            cls2 = null;
            method3 = null;
        }
        this.u = cls2;
        this.v = method3;
        this.w = method4;
        this.W = (TextView) findViewById(R.id.exo_duration);
        this.a0 = (TextView) findViewById(R.id.exo_position);
        ImageView imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.Q = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(this.q);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.R = imageView2;
        int i17 = 29;
        p6 p6Var = new p6(i17, this);
        if (imageView2 == null) {
            i14 = 8;
        } else {
            i14 = 8;
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(p6Var);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.S = imageView3;
        p6 p6Var2 = new p6(i17, this);
        if (imageView3 != null) {
            imageView3.setVisibility(i14);
            imageView3.setOnClickListener(p6Var2);
        }
        View viewFindViewById = findViewById(R.id.exo_settings);
        this.T = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(this.q);
        }
        View viewFindViewById2 = findViewById(R.id.exo_playback_speed);
        this.U = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(this.q);
        }
        View viewFindViewById3 = findViewById(R.id.exo_audio_track);
        this.V = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(this.q);
        }
        DefaultTimeBar defaultTimeBar2 = (DefaultTimeBar) findViewById(R.id.exo_progress);
        View viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (defaultTimeBar2 != null) {
            this.b0 = defaultTimeBar2;
            i15 = i3;
            nk2Var = defaultTimeBar;
        } else if (viewFindViewById4 != null) {
            i15 = i3;
            DefaultTimeBar defaultTimeBar3 = new DefaultTimeBar(context, null, 0, attributeSet2, R.style.ExoStyledControls_TimeBar);
            defaultTimeBar3.setId(R.id.exo_progress);
            defaultTimeBar3.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(defaultTimeBar3, iIndexOfChild);
            this.b0 = defaultTimeBar3;
            nk2Var = 0;
        } else {
            i15 = i3;
            this.b0 = defaultTimeBar;
            nk2Var = defaultTimeBar;
        }
        DefaultTimeBar defaultTimeBar4 = this.b0;
        if (defaultTimeBar4 != null) {
            dj3 dj3Var = this.q;
            dj3Var.getClass();
            defaultTimeBar4.K.add(dj3Var);
        }
        this.p = f35.p(nk2Var);
        Resources resources = context.getResources();
        this.o = resources;
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
        this.I = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(this.q);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_prev);
        this.G = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(resources.getDrawable(i6, context.getTheme()));
            imageView5.setOnClickListener(this.q);
        }
        ImageView imageView6 = (ImageView) findViewById(R.id.exo_next);
        this.H = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(resources.getDrawable(i4, context.getTheme()));
            imageView6.setOnClickListener(this.q);
        }
        ThreadLocal threadLocal = g14.a;
        Typeface typefaceA = context.isRestricted() ? null : g14.a(context, R.font.roboto_medium_numbers, new TypedValue(), 0, null, false, false);
        ImageView imageView7 = (ImageView) findViewById(R.id.exo_rew);
        TextView textView = (TextView) findViewById(R.id.exo_rew_with_amount);
        if (imageView7 != null) {
            imageView7.setImageDrawable(resources.getDrawable(i13, context.getTheme()));
            this.K = imageView7;
            this.M = null;
        } else if (textView != null) {
            textView.setTypeface(typefaceA);
            this.M = textView;
            this.K = textView;
        } else {
            this.M = null;
            this.K = null;
        }
        View view = this.K;
        if (view != null) {
            view.setOnClickListener(this.q);
        }
        ImageView imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
        TextView textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(resources.getDrawable(i5, context.getTheme()));
            this.J = imageView8;
            this.L = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceA);
            this.L = textView2;
            this.J = textView2;
        } else {
            this.L = null;
            this.J = null;
        }
        View view2 = this.J;
        if (view2 != null) {
            view2.setOnClickListener(this.q);
        }
        ImageView imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.N = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(this.q);
        }
        ImageView imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
        this.O = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(this.q);
        }
        this.r0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.s0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        ImageView imageView11 = (ImageView) findViewById(R.id.exo_vr);
        this.P = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(resources.getDrawable(i9, context.getTheme()));
            j(imageView11, false);
        }
        qj3 qj3Var = new qj3(this);
        this.n = qj3Var;
        qj3Var.D = z6;
        jj3 jj3Var = new jj3(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
        this.z = jj3Var;
        this.F = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.y = recyclerView;
        recyclerView.setAdapter(jj3Var);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.E = popupWindow;
        popupWindow.setOnDismissListener(this.q);
        this.T0 = true;
        Resources resources2 = getResources();
        zg5 zg5Var = new zg5();
        resources2.getClass();
        zg5Var.n = resources2;
        this.D = zg5Var;
        this.v0 = resources.getDrawable(resourceId4, context.getTheme());
        this.w0 = resources.getDrawable(resourceId5, context.getTheme());
        this.x0 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.y0 = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.B = new cj3(this, 1);
        this.C = new cj3(this, 0);
        this.A = new gj3(this, resources.getStringArray(R.array.exo_controls_playback_speeds), U0);
        this.h0 = resources.getDrawable(i2, context.getTheme());
        this.i0 = resources.getDrawable(i15, context.getTheme());
        this.z0 = resources.getDrawable(i11, context.getTheme());
        this.A0 = resources.getDrawable(i10, context.getTheme());
        this.j0 = resources.getDrawable(i7, context.getTheme());
        this.k0 = resources.getDrawable(i8, context.getTheme());
        this.l0 = resources.getDrawable(resourceId, context.getTheme());
        this.p0 = resources.getDrawable(resourceId2, context.getTheme());
        this.q0 = resources.getDrawable(resourceId3, context.getTheme());
        this.B0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.C0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.m0 = resources.getString(R.string.exo_controls_repeat_off_description);
        this.n0 = resources.getString(R.string.exo_controls_repeat_one_description);
        this.o0 = resources.getString(R.string.exo_controls_repeat_all_description);
        this.t0 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.u0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        qj3Var.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        qj3Var.h(this.J, z3);
        qj3Var.h(this.K, z2);
        qj3Var.h(imageView5, z4);
        qj3Var.h(imageView6, z5);
        qj3Var.h(imageView10, z8);
        qj3Var.h(this.Q, z);
        qj3Var.h(imageView11, z7);
        qj3Var.h(imageView9, this.N0 != 0);
        addOnLayoutChangeListener(new cs1(1, this));
    }

    public static void a(PlayerControlView playerControlView, qi3 qi3Var, long j) {
        if (playerControlView.I0) {
            if (qi3Var.S0(17) && qi3Var.S0(10)) {
                cu4 cu4VarX0 = qi3Var.x0();
                int iO = cu4VarX0.o();
                int i = 0;
                while (true) {
                    long jI0 = f35.i0(cu4VarX0.m(i, playerControlView.f0, 0L).l);
                    if (j < jI0) {
                        break;
                    }
                    if (i == iO - 1) {
                        j = jI0;
                        break;
                    } else {
                        j -= jI0;
                        i++;
                    }
                }
                qi3Var.n(i, j);
            }
        } else if (qi3Var.S0(5)) {
            qi3Var.O(j);
        }
        playerControlView.n();
    }

    public static boolean c(qi3 qi3Var, bu4 bu4Var) {
        cu4 cu4VarX0;
        int iO;
        if (!qi3Var.S0(17) || (iO = (cu4VarX0 = qi3Var.x0()).o()) <= 1 || iO > 100) {
            return false;
        }
        for (int i = 0; i < iO; i++) {
            if (cu4VarX0.m(i, bu4Var, 0L).l == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        qi3 qi3Var = this.D0;
        if (qi3Var == null || !qi3Var.S0(13)) {
            return;
        }
        qi3 qi3Var2 = this.D0;
        qi3Var2.d(new qh3(f, qi3Var2.i().b));
    }

    public final void d(dw3 dw3Var, View view) {
        this.y.setAdapter(dw3Var);
        p();
        this.T0 = false;
        PopupWindow popupWindow = this.E;
        popupWindow.dismiss();
        this.T0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = this.F;
        popupWindow.showAsDropDown(view, width - i, (-popupWindow.getHeight()) - i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        qi3 qi3Var = this.D0;
        if (qi3Var == null || !(keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88)) {
            if (!super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
        } else if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (qi3Var.g() != 4 && qi3Var.S0(12)) {
                    qi3Var.I0();
                }
            } else if (keyCode == 89 && qi3Var.S0(11)) {
                qi3Var.J0();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    if (f35.d0(qi3Var, this.H0)) {
                        f35.I(qi3Var);
                    } else if (qi3Var.S0(1)) {
                        qi3Var.c();
                    }
                } else if (keyCode != 87) {
                    if (keyCode != 88) {
                        if (keyCode == 126) {
                            f35.I(qi3Var);
                        } else if (keyCode == 127) {
                            String str = f35.a;
                            if (qi3Var.S0(1)) {
                                qi3Var.c();
                            }
                        }
                    } else if (qi3Var.S0(7)) {
                        qi3Var.S();
                    }
                } else if (qi3Var.S0(9)) {
                    qi3Var.H0();
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    public final gy3 e(jw4 jw4Var, int i) {
        String strN;
        String string;
        String strD;
        String str;
        int i2 = 4;
        uc5.f(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        yw1 yw1Var = jw4Var.a;
        int i3 = 0;
        int i4 = 0;
        while (i3 < yw1Var.size()) {
            iw4 iw4Var = (iw4) yw1Var.get(i3);
            if (iw4Var.b.c == i) {
                int i5 = 0;
                while (i5 < iw4Var.a) {
                    if (iw4Var.d[i5] == i2) {
                        tb1 tb1VarA = iw4Var.a(i5);
                        int i6 = tb1VarA.e;
                        int i7 = tb1VarA.j;
                        if ((i6 & 2) == 0) {
                            zg5 zg5Var = this.D;
                            Resources resources = (Resources) zg5Var.n;
                            Resources resources2 = (Resources) zg5Var.n;
                            String str2 = tb1VarA.n;
                            int i8 = tb1VarA.F;
                            int i9 = tb1VarA.v;
                            int i10 = tb1VarA.u;
                            int i11 = i4;
                            String str3 = tb1VarA.k;
                            int iH = lw2.h(str2);
                            if (iH == -1) {
                                if (str3 != null) {
                                    String[] strArrE0 = f35.e0(str3);
                                    int length = strArrE0.length;
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < length) {
                                            strD = lw2.d(strArrE0[i12]);
                                            if (strD != null && lw2.l(strD)) {
                                                break;
                                            }
                                            i12++;
                                        } else {
                                            strD = null;
                                            break;
                                        }
                                    }
                                } else {
                                    strD = null;
                                    break;
                                }
                                if (strD == null) {
                                    if (str3 != null) {
                                        String[] strArrE1 = f35.e0(str3);
                                        int length2 = strArrE1.length;
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 < length2) {
                                                String strD2 = lw2.d(strArrE1[i13]);
                                                if (strD2 != null && lw2.i(strD2)) {
                                                    str = strD2;
                                                    break;
                                                }
                                                i13++;
                                            } else {
                                                str = null;
                                                break;
                                            }
                                        }
                                    } else {
                                        str = null;
                                        break;
                                    }
                                    if (str != null) {
                                        iH = 1;
                                    } else if (i10 != -1 || i9 != -1) {
                                        iH = 2;
                                    } else if (i8 == -1 && tb1VarA.G == -1) {
                                        iH = -1;
                                    } else {
                                        iH = 1;
                                    }
                                } else {
                                    iH = 2;
                                }
                            }
                            if (iH == 2) {
                                strN = zg5Var.x(zg5Var.o(tb1VarA), (i10 == -1 || i9 == -1) ? "" : resources.getString(R.string.exo_track_resolution, Integer.valueOf(i10), Integer.valueOf(i9)), i7 != -1 ? resources2.getString(R.string.exo_track_bitrate, Float.valueOf(i7 / 1000000.0f)) : "");
                            } else if (iH == 1) {
                                String strN2 = zg5Var.n(tb1VarA);
                                if (i8 == -1 || i8 < 1) {
                                    string = "";
                                } else if (i8 == 1) {
                                    string = resources.getString(R.string.exo_track_mono);
                                } else if (i8 == 2) {
                                    string = resources.getString(R.string.exo_track_stereo);
                                } else if (i8 == 6 || i8 == 7) {
                                    string = resources.getString(R.string.exo_track_surround_5_point_1);
                                } else {
                                    string = i8 != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1);
                                }
                                strN = zg5Var.x(strN2, string, i7 != -1 ? resources2.getString(R.string.exo_track_bitrate, Float.valueOf(i7 / 1000000.0f)) : "");
                            } else {
                                strN = zg5Var.n(tb1VarA);
                            }
                            if (strN.isEmpty()) {
                                String str4 = tb1VarA.d;
                                strN = (str4 == null || str4.trim().isEmpty()) ? resources.getString(R.string.exo_track_unknown) : resources.getString(R.string.exo_track_unknown_name, str4);
                            }
                            lj3 lj3Var = new lj3(jw4Var, i3, i5, strN);
                            i4 = i11 + 1;
                            int iB = qw1.b(objArrCopyOf.length, i4);
                            if (iB > objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                            }
                            objArrCopyOf[i11] = lj3Var;
                        }
                    }
                    i5++;
                    yw1Var = yw1Var;
                    iw4Var = iw4Var;
                    i2 = 4;
                }
            }
            i3++;
            yw1Var = yw1Var;
            i2 = 4;
        }
        return yw1.i(i4, objArrCopyOf);
    }

    public final boolean f(qi3 qi3Var) {
        Class cls;
        return (qi3Var == null || (cls = this.u) == null || !cls.isAssignableFrom(qi3Var.getClass())) ? false : true;
    }

    public final boolean g(qi3 qi3Var) {
        Class cls;
        return (qi3Var == null || (cls = this.r) == null || !cls.isAssignableFrom(qi3Var.getClass())) ? false : true;
    }

    public qi3 getPlayer() {
        return this.D0;
    }

    public int getRepeatToggleModes() {
        return this.N0;
    }

    public boolean getShowShuffleButton() {
        return this.n.b(this.O);
    }

    public boolean getShowSubtitleButton() {
        return this.n.b(this.Q);
    }

    public int getShowTimeoutMs() {
        return this.K0;
    }

    public boolean getShowVrButton() {
        return this.n.b(this.P);
    }

    public final boolean h(qi3 qi3Var) {
        try {
            if (g(qi3Var)) {
                Method method = this.t;
                method.getClass();
                Object objInvoke = method.invoke(qi3Var, null);
                objInvoke.getClass();
                if (((Boolean) objInvoke).booleanValue()) {
                    return true;
                }
            }
            if (f(qi3Var)) {
                Method method2 = this.w;
                method2.getClass();
                Object objInvoke2 = method2.invoke(qi3Var, null);
                objInvoke2.getClass();
                if (((Boolean) objInvoke2).booleanValue()) {
                    return true;
                }
            }
            return false;
        } catch (IllegalAccessException e) {
            e = e;
            er1.m(e);
            return false;
        } catch (InvocationTargetException e2) {
            e = e2;
            er1.m(e);
            return false;
        }
    }

    public final boolean i() {
        return getVisibility() == 0;
    }

    public final void j(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.r0 : this.s0);
    }

    public final void k() {
        boolean zS0;
        boolean zS1;
        boolean zS2;
        boolean zS3;
        boolean zS4;
        if (i() && this.F0) {
            qi3 qi3Var = this.D0;
            if (qi3Var != null) {
                zS0 = (this.G0 && c(qi3Var, this.f0)) ? qi3Var.S0(10) : qi3Var.S0(5);
                zS2 = qi3Var.S0(7);
                zS3 = qi3Var.S0(11);
                zS4 = qi3Var.S0(12);
                zS1 = qi3Var.S0(9);
            } else {
                zS0 = false;
                zS1 = false;
                zS2 = false;
                zS3 = false;
                zS4 = false;
            }
            Resources resources = this.o;
            View view = this.K;
            if (zS3) {
                qi3 qi3Var2 = this.D0;
                int iO0 = (int) ((qi3Var2 != null ? qi3Var2.O0() : 5000L) / 1000);
                TextView textView = this.M;
                if (textView != null) {
                    textView.setText(String.valueOf(iO0));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, iO0, Integer.valueOf(iO0)));
                }
            }
            View view2 = this.J;
            if (zS4) {
                qi3 qi3Var3 = this.D0;
                int iX = (int) ((qi3Var3 != null ? qi3Var3.X() : 15000L) / 1000);
                TextView textView2 = this.L;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(iX));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, iX, Integer.valueOf(iX)));
                }
            }
            j(this.G, zS2);
            j(view, zS3);
            j(view2, zS4);
            j(this.H, zS1);
            DefaultTimeBar defaultTimeBar = this.b0;
            if (defaultTimeBar != null) {
                defaultTimeBar.setEnabled(zS0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    public final void l() {
        ImageView imageView;
        boolean z;
        if (i() && this.F0 && (imageView = this.I) != null) {
            boolean zD0 = f35.d0(this.D0, this.H0);
            Drawable drawable = zD0 ? this.h0 : this.i0;
            int i = zD0 ? R.string.exo_controls_play_description : R.string.exo_controls_pause_description;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.o.getString(i));
            qi3 qi3Var = this.D0;
            if (qi3Var != null) {
                z = true;
                if (!qi3Var.S0(1) || (qi3Var.S0(17) && qi3Var.x0().p())) {
                    z = false;
                }
            } else {
                z = false;
            }
            j(imageView, z);
        }
    }

    public final void m() {
        gj3 gj3Var;
        qi3 qi3Var = this.D0;
        if (qi3Var == null) {
            return;
        }
        float f = qi3Var.i().a;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        while (true) {
            gj3Var = this.A;
            float[] fArr = gj3Var.r;
            if (i >= fArr.length) {
                break;
            }
            float fAbs = Math.abs(f - fArr[i]);
            if (fAbs < f2) {
                i2 = i;
                f2 = fAbs;
            }
            i++;
        }
        gj3Var.s = i2;
        String str = gj3Var.q[i2];
        jj3 jj3Var = this.z;
        jj3Var.r[0] = str;
        j(this.T, jj3Var.p(1) || jj3Var.p(0));
    }

    public final void n() {
        long jZ;
        long jF0;
        if (i() && this.F0) {
            qi3 qi3Var = this.D0;
            if (qi3Var == null || !qi3Var.S0(16)) {
                jZ = 0;
                jF0 = 0;
            } else {
                jZ = qi3Var.Z() + this.S0;
                jF0 = qi3Var.F0() + this.S0;
            }
            TextView textView = this.a0;
            if (textView != null && !this.J0) {
                textView.setText(f35.F(this.c0, this.d0, jZ));
            }
            DefaultTimeBar defaultTimeBar = this.b0;
            if (defaultTimeBar != null) {
                defaultTimeBar.setPosition(jZ);
                if (h(qi3Var)) {
                    jF0 = jZ;
                }
                defaultTimeBar.setBufferedPosition(jF0);
            }
            qa1 qa1Var = this.g0;
            removeCallbacks(qa1Var);
            int iG = qi3Var == null ? 1 : qi3Var.g();
            if (qi3Var != null && qi3Var.h0()) {
                long jMin = Math.min(defaultTimeBar != null ? defaultTimeBar.getPreferredUpdateDelay() : 1000L, 1000 - (jZ % 1000));
                float f = qi3Var.i().a;
                postDelayed(qa1Var, f35.k(f > 0.0f ? (long) (jMin / f) : 1000L, this.M0, 1000L));
            } else {
                if (iG == 4 || iG == 1) {
                    return;
                }
                postDelayed(qa1Var, 1000L);
            }
        }
    }

    public final void o() {
        ImageView imageView;
        if (i() && this.F0 && (imageView = this.N) != null) {
            if (this.N0 == 0) {
                j(imageView, false);
                return;
            }
            qi3 qi3Var = this.D0;
            String str = this.m0;
            Drawable drawable = this.j0;
            if (qi3Var == null || !qi3Var.S0(15)) {
                j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            j(imageView, true);
            int iH = qi3Var.h();
            if (iH == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (iH == 1) {
                imageView.setImageDrawable(this.k0);
                imageView.setContentDescription(this.n0);
            } else {
                if (iH != 2) {
                    return;
                }
                imageView.setImageDrawable(this.l0);
                imageView.setContentDescription(this.o0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qj3 qj3Var = this.n;
        qj3Var.a.addOnLayoutChangeListener(qj3Var.y);
        this.F0 = true;
        if (qj3Var.A == 0 && qj3Var.a.i()) {
            qj3Var.g();
        }
        l();
        k();
        o();
        q();
        s();
        m();
        r();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qj3 qj3Var = this.n;
        qj3Var.a.removeOnLayoutChangeListener(qj3Var.y);
        this.F0 = false;
        removeCallbacks(this.g0);
        qj3Var.f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.n.b;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public final void p() {
        RecyclerView recyclerView = this.y;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i = this.F;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i * 2));
        PopupWindow popupWindow = this.E;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i * 2), recyclerView.getMeasuredHeight()));
    }

    public final void q() {
        ImageView imageView;
        if (i() && this.F0 && (imageView = this.O) != null) {
            qi3 qi3Var = this.D0;
            if (!this.n.b(imageView)) {
                j(imageView, false);
                return;
            }
            String str = this.u0;
            Drawable drawable = this.q0;
            if (qi3Var == null || !qi3Var.S0(14)) {
                j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            j(imageView, true);
            if (qi3Var.D0()) {
                drawable = this.p0;
            }
            imageView.setImageDrawable(drawable);
            if (qi3Var.D0()) {
                str = this.t0;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    /* JADX WARN: Code duplicated, block: B:76:0x014a  */
    public final void r() {
        boolean z;
        long jQ;
        int i;
        long j;
        long[] jArr;
        x5 x5VarA;
        int i2;
        int i3;
        cu4 cu4Var;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        int length;
        qi3 qi3Var = this.D0;
        if (qi3Var == null) {
            return;
        }
        boolean z4 = this.G0;
        bu4 bu4Var = this.f0;
        boolean z5 = false;
        boolean z6 = true;
        this.I0 = z4 && c(qi3Var, bu4Var);
        long j2 = 0;
        this.S0 = 0L;
        cu4 cu4VarX0 = qi3Var.S0(17) ? qi3Var.x0() : cu4.a;
        long j3 = -9223372036854775807L;
        if (cu4VarX0.p()) {
            z = true;
            if (qi3Var.S0(16)) {
                long jX = qi3Var.x();
                if (jX != -9223372036854775807L) {
                    jQ = f35.Q(jX);
                } else {
                    jQ = 0;
                }
            } else {
                jQ = 0;
            }
            i = 0;
        } else {
            int iO0 = qi3Var.o0();
            boolean z7 = this.I0;
            int i6 = z7 ? 0 : iO0;
            int iO = z7 ? cu4VarX0.o() - 1 : iO0;
            i = 0;
            long j4 = 0;
            while (i6 <= iO) {
                long j5 = j2;
                if (i6 == iO0) {
                    this.S0 = f35.i0(j4);
                }
                cu4VarX0.n(i6, bu4Var);
                if (bu4Var.l == j3) {
                    rr2.w(this.I0 ^ z6);
                    break;
                }
                int i7 = bu4Var.m;
                while (i7 <= bu4Var.n) {
                    zt4 zt4Var = this.e0;
                    cu4VarX0.f(i7, zt4Var, z5);
                    long j6 = j3;
                    z5 z5Var = zt4Var.g;
                    int i8 = z5Var.d;
                    int i9 = z5Var.a;
                    while (i8 < i9) {
                        long jD = zt4Var.d(i8);
                        if (jD == Long.MIN_VALUE) {
                            long j7 = zt4Var.d;
                            if (j7 == j6) {
                                cu4Var = cu4VarX0;
                                z2 = true;
                            } else {
                                jD = j7;
                                j = jD + zt4Var.e;
                                if (j >= j5) {
                                    jArr = this.O0;
                                    if (i == jArr.length) {
                                        if (jArr.length == 0) {
                                            length = 1;
                                        } else {
                                            length = jArr.length * 2;
                                        }
                                        this.O0 = Arrays.copyOf(jArr, length);
                                        this.P0 = Arrays.copyOf(this.P0, length);
                                    }
                                    this.O0[i] = f35.i0(j4 + j);
                                    boolean[] zArr = this.P0;
                                    x5VarA = zt4Var.g.a(i8);
                                    i2 = x5VarA.b;
                                    if (i2 != -1) {
                                        i3 = 0;
                                        while (true) {
                                            if (i3 < i2) {
                                                cu4Var = cu4VarX0;
                                                z2 = true;
                                                z3 = false;
                                                break;
                                            }
                                            i4 = i3;
                                            i5 = x5VarA.f[i4];
                                            cu4Var = cu4VarX0;
                                            z2 = true;
                                            if (i5 != 0 || i5 == 1) {
                                                z3 = true;
                                                break;
                                            } else {
                                                i3 = i4 + 1;
                                                cu4VarX0 = cu4Var;
                                            }
                                        }
                                    } else {
                                        cu4Var = cu4VarX0;
                                        z2 = true;
                                        z3 = true;
                                    }
                                    zArr[i] = !z3;
                                    i++;
                                } else {
                                    cu4Var = cu4VarX0;
                                    z2 = true;
                                }
                            }
                        } else {
                            j = jD + zt4Var.e;
                            if (j >= j5) {
                                jArr = this.O0;
                                if (i == jArr.length) {
                                    if (jArr.length == 0) {
                                        length = 1;
                                    } else {
                                        length = jArr.length * 2;
                                    }
                                    this.O0 = Arrays.copyOf(jArr, length);
                                    this.P0 = Arrays.copyOf(this.P0, length);
                                }
                                this.O0[i] = f35.i0(j4 + j);
                                boolean[] zArr2 = this.P0;
                                x5VarA = zt4Var.g.a(i8);
                                i2 = x5VarA.b;
                                if (i2 != -1) {
                                    cu4Var = cu4VarX0;
                                    z2 = true;
                                    z3 = true;
                                } else {
                                    i3 = 0;
                                    while (true) {
                                        if (i3 < i2) {
                                            cu4Var = cu4VarX0;
                                            z2 = true;
                                            z3 = false;
                                            break;
                                        } else {
                                            i4 = i3;
                                            i5 = x5VarA.f[i4];
                                            cu4Var = cu4VarX0;
                                            z2 = true;
                                            if (i5 != 0) {
                                            }
                                            z3 = true;
                                            break;
                                        }
                                        i3 = i4 + 1;
                                        cu4VarX0 = cu4Var;
                                    }
                                }
                                zArr2[i] = !z3;
                                i++;
                            } else {
                                cu4Var = cu4VarX0;
                                z2 = true;
                            }
                        }
                        i8++;
                        z6 = z2;
                        iO0 = iO0;
                        cu4VarX0 = cu4Var;
                        j5 = 0;
                    }
                    i7++;
                    j3 = j6;
                    cu4VarX0 = cu4VarX0;
                    z5 = false;
                    j5 = 0;
                }
                j4 += bu4Var.l;
                i6++;
                z6 = z6;
                cu4VarX0 = cu4VarX0;
                z5 = false;
                j2 = 0;
            }
            z = z6;
            jQ = j4;
        }
        long jI0 = f35.i0(jQ);
        TextView textView = this.W;
        if (textView != null) {
            textView.setText(f35.F(this.c0, this.d0, jI0));
        }
        DefaultTimeBar defaultTimeBar = this.b0;
        if (defaultTimeBar != null) {
            defaultTimeBar.setDuration(jI0);
            long[] jArr2 = this.Q0;
            int length2 = jArr2.length;
            int i10 = i + length2;
            long[] jArr3 = this.O0;
            if (i10 > jArr3.length) {
                this.O0 = Arrays.copyOf(jArr3, i10);
                this.P0 = Arrays.copyOf(this.P0, i10);
            }
            System.arraycopy(jArr2, 0, this.O0, i, length2);
            System.arraycopy(this.R0, 0, this.P0, i, length2);
            long[] jArr4 = this.O0;
            boolean[] zArr3 = this.P0;
            if (i10 != 0 && (jArr4 == null || zArr3 == null)) {
                z = false;
            }
            rr2.l(z);
            defaultTimeBar.c0 = i10;
            defaultTimeBar.d0 = jArr4;
            defaultTimeBar.e0 = zArr3;
            defaultTimeBar.e();
        }
        n();
    }

    public final void s() {
        cj3 cj3Var = this.B;
        cj3Var.getClass();
        List list = Collections.EMPTY_LIST;
        cj3Var.q = list;
        cj3 cj3Var2 = this.C;
        cj3Var2.getClass();
        cj3Var2.q = list;
        qi3 qi3Var = this.D0;
        ImageView imageView = this.Q;
        if (qi3Var != null && qi3Var.S0(30) && this.D0.S0(29)) {
            jw4 jw4VarE0 = this.D0.e0();
            gy3 gy3VarE = e(jw4VarE0, 1);
            cj3Var2.q = gy3VarE;
            PlayerControlView playerControlView = cj3Var2.t;
            qi3 qi3Var2 = playerControlView.D0;
            jj3 jj3Var = playerControlView.z;
            qi3Var2.getClass();
            cw4 cw4VarE0 = qi3Var2.E0();
            if (gy3VarE.isEmpty()) {
                jj3Var.r[1] = playerControlView.getResources().getString(R.string.exo_track_selection_none);
            } else if (cj3Var2.p(cw4VarE0)) {
                for (int i = 0; i < gy3VarE.q; i++) {
                    lj3 lj3Var = (lj3) gy3VarE.get(i);
                    if (lj3Var.a.e[lj3Var.b]) {
                        jj3Var.r[1] = lj3Var.c;
                        break;
                    }
                }
            } else {
                jj3Var.r[1] = playerControlView.getResources().getString(R.string.exo_track_selection_auto);
            }
            if (this.n.b(imageView)) {
                cj3Var.q(e(jw4VarE0, 3));
            } else {
                cj3Var.q(gy3.r);
            }
        }
        j(imageView, cj3Var.a() > 0);
        jj3 jj3Var2 = this.z;
        j(this.T, jj3Var2.p(1) || jj3Var2.p(0));
    }

    public void setAnimationEnabled(boolean z) {
        this.n.D = z;
    }

    public void setMediaRouteButtonViewProvider(v75 v75Var) {
        View viewFindViewById = findViewById(R.id.exo_media_route_button_placeholder);
        if (viewFindViewById == null) {
            kf2.o("The media route button placeholder is missing.");
            return;
        }
        if (v75Var == null) {
            viewFindViewById.setVisibility(8);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
        if (viewGroup == null) {
            kf2.o("The media route button placeholder has no parent view.");
            return;
        }
        ic2 ic2VarA = v75Var.a();
        yc5 yc5Var = new yc5(this, viewFindViewById, viewGroup);
        Handler handler = this.p;
        Objects.requireNonNull(handler);
        ic2VarA.f(new lg1(0, ic2VarA, yc5Var), new ym(handler, 1));
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(ej3 ej3Var) {
        boolean z = ej3Var != null;
        ImageView imageView = this.R;
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z2 = ej3Var != null;
        ImageView imageView2 = this.S;
        if (imageView2 == null) {
            return;
        }
        if (z2) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(qi3 qi3Var) {
        rr2.w(Looper.myLooper() == Looper.getMainLooper());
        rr2.l(qi3Var == null || qi3Var.U0() == Looper.getMainLooper());
        qi3 qi3Var2 = this.D0;
        if (qi3Var2 == qi3Var) {
            return;
        }
        dj3 dj3Var = this.q;
        if (qi3Var2 != null) {
            qi3Var2.r0(dj3Var);
        }
        this.D0 = qi3Var;
        if (qi3Var != null) {
            qi3Var.v(dj3Var);
        }
        l();
        k();
        o();
        q();
        s();
        m();
        r();
    }

    public void setProgressUpdateListener(hj3 hj3Var) {
    }

    public void setRepeatToggleModes(int i) {
        this.N0 = i;
        qi3 qi3Var = this.D0;
        if (qi3Var != null && qi3Var.S0(15)) {
            int iH = this.D0.h();
            if (i == 0 && iH != 0) {
                this.D0.p0(0);
            } else if (i == 1 && iH == 2) {
                this.D0.p0(1);
            } else if (i == 2 && iH == 1) {
                this.D0.p0(2);
            }
        }
        this.n.h(this.N, i != 0);
        o();
    }

    public void setShowFastForwardButton(boolean z) {
        this.n.h(this.J, z);
        k();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.G0 = z;
        r();
    }

    public void setShowNextButton(boolean z) {
        this.n.h(this.H, z);
        k();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.H0 = z;
        l();
    }

    public void setShowPreviousButton(boolean z) {
        this.n.h(this.G, z);
        k();
    }

    public void setShowRewindButton(boolean z) {
        this.n.h(this.K, z);
        k();
    }

    public void setShowShuffleButton(boolean z) {
        this.n.h(this.O, z);
        q();
    }

    public void setShowSubtitleButton(boolean z) {
        this.n.h(this.Q, z);
    }

    public void setShowTimeoutMs(int i) {
        this.K0 = i;
        qj3 qj3Var = this.n;
        if (qj3Var.A == 0 && qj3Var.a.i()) {
            qj3Var.g();
        }
    }

    public void setShowVrButton(boolean z) {
        this.n.h(this.P, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.M0 = f35.j(i, 16, 1000);
    }

    public void setTimeBarScrubbingEnabled(boolean z) {
        this.L0 = z;
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.P;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            j(imageView, onClickListener != null);
        }
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }
}
