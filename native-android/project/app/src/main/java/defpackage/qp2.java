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
import android.widget.ListAdapter;
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
    public static final int B0;
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

    /* JADX WARN: Illegal instructions before constructor call */
    public qp2(Context context) {
        boolean z = true;
        ContextThemeWrapper contextThemeWrapperO = fu.o(context, true);
        int iB = fu.B(contextThemeWrapperO, R.attr.mediaRouteTheme);
        super(contextThemeWrapperO, iB == 0 ? fu.z(contextThemeWrapperO) : iB);
        this.L = true;
        this.A0 = new g5(21, this);
        Context context2 = getContext();
        this.x = context2;
        this.f0 = new np2(this, 0);
        this.u = yq2.d(context2);
        if (yq2.c == null) {
            z = false;
        } else {
            yq2.c().getClass();
        }
        this.M = z;
        this.v = new ap2(this, 2);
        yq2.b();
        this.w = yq2.c().g();
        s();
        this.d0 = context2.getResources().getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_padding_top);
        this.z0 = (AccessibilityManager) context2.getSystemService("accessibility");
        this.x0 = AnimationUtils.loadInterpolator(contextThemeWrapperO, R.interpolator.mr_linear_out_slow_in);
        this.y0 = AnimationUtils.loadInterpolator(contextThemeWrapperO, R.interpolator.mr_fast_out_slow_in);
    }

    public static void r(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public final void k(View view, int i) {
        jp2 jp2Var = new jp2(view.getLayoutParams().height, i, 0, view);
        jp2Var.setDuration(this.t0);
        jp2Var.setInterpolator(this.w0);
        view.startAnimation(jp2Var);
    }

    public final boolean l() {
        return (this.h0 == null && this.g0 == null) ? false : true;
    }

    public final void m(boolean z) {
        OverlayListView overlayListView;
        HashSet hashSet;
        int firstVisiblePosition = this.R.getFirstVisiblePosition();
        int i = 0;
        while (true) {
            int childCount = this.R.getChildCount();
            overlayListView = this.R;
            if (i >= childCount) {
                break;
            }
            View childAt = overlayListView.getChildAt(i);
            wq2 wq2Var = (wq2) this.S.getItem(firstVisiblePosition + i);
            if (!z || (hashSet = this.U) == null || !hashSet.contains(wq2Var)) {
                ((LinearLayout) childAt.findViewById(R.id.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
            i++;
        }
        ArrayList arrayList = overlayListView.n;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            pb3 pb3Var = (pb3) obj;
            pb3Var.j = true;
            pb3Var.k = true;
            hd5 hd5Var = pb3Var.l;
            if (hd5Var != null) {
                qp2 qp2Var = (qp2) hd5Var.p;
                qp2Var.W.remove((wq2) hd5Var.o);
                qp2Var.S.notifyDataSetChanged();
            }
        }
        if (z) {
            return;
        }
        n(false);
    }

    public final void n(boolean z) {
        this.U = null;
        this.V = null;
        this.r0 = false;
        if (this.s0) {
            this.s0 = false;
            w(z);
        }
        this.R.setEnabled(true);
    }

    public final int o(int i, int i2) {
        float f;
        float f2;
        int i3 = this.z;
        if (i >= i2) {
            f = i3 * i2;
            f2 = i;
        } else {
            f = i3 * 9.0f;
            f2 = 16.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.u.a(rq2.c, this.v, 2);
        ui1 ui1Var = yq2.c;
        s();
    }

    @Override // defpackage.f9, defpackage.dg, defpackage.n70, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setContentView(R.layout.mr_controller_material_dialog_b);
        findViewById(android.R.id.button3).setVisibility(8);
        lp2 lp2Var = new lp2(this, 0);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mr_expandable_area);
        this.E = frameLayout;
        frameLayout.setOnClickListener(new lp2(this, 1));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mr_dialog_area);
        this.F = linearLayout;
        linearLayout.setOnClickListener(new hp2());
        Context context = this.x;
        int iA = fu.A(context, 0, R.attr.colorPrimary);
        if (v50.d(iA, fu.A(context, 0, android.R.attr.colorBackground)) < 3.0d) {
            iA = fu.A(context, 0, R.attr.colorAccent);
        }
        Button button = (Button) findViewById(android.R.id.button2);
        this.A = button;
        button.setText(R.string.mr_controller_disconnect);
        this.A.setTextColor(iA);
        this.A.setOnClickListener(lp2Var);
        Button button2 = (Button) findViewById(android.R.id.button1);
        this.B = button2;
        button2.setText(R.string.mr_controller_stop_casting);
        this.B.setTextColor(iA);
        this.B.setOnClickListener(lp2Var);
        this.K = (TextView) findViewById(R.id.mr_name);
        ((ImageButton) findViewById(R.id.mr_close)).setOnClickListener(lp2Var);
        this.G = (FrameLayout) findViewById(R.id.mr_default_control);
        lp2 lp2Var2 = new lp2(this, 2);
        ImageView imageView = (ImageView) findViewById(R.id.mr_art);
        this.H = imageView;
        imageView.setOnClickListener(lp2Var2);
        findViewById(R.id.mr_control_title_container).setOnClickListener(lp2Var2);
        this.N = (LinearLayout) findViewById(R.id.mr_media_main_control);
        this.Q = findViewById(R.id.mr_control_divider);
        this.O = (RelativeLayout) findViewById(R.id.mr_playback_control);
        this.I = (TextView) findViewById(R.id.mr_control_title);
        this.J = (TextView) findViewById(R.id.mr_control_subtitle);
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_control_playback_ctrl);
        this.C = imageButton;
        imageButton.setOnClickListener(lp2Var);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.mr_volume_control);
        this.P = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(R.id.mr_volume_slider);
        this.X = seekBar;
        wq2 wq2Var = this.w;
        seekBar.setTag(wq2Var);
        op2 op2Var = new op2(this);
        this.Y = op2Var;
        this.X.setOnSeekBarChangeListener(op2Var);
        this.R = (OverlayListView) findViewById(R.id.mr_volume_group_list);
        this.T = new ArrayList();
        pp2 pp2Var = new pp2(this, this.R.getContext(), this.T);
        this.S = pp2Var;
        this.R.setAdapter((ListAdapter) pp2Var);
        this.W = new HashSet();
        LinearLayout linearLayout3 = this.N;
        OverlayListView overlayListView = this.R;
        boolean zQ = q();
        int iA2 = fu.A(context, 0, R.attr.colorPrimary);
        int iA3 = fu.A(context, 0, R.attr.colorPrimaryDark);
        if (zQ && fu.u(context, 0) == -570425344) {
            iA3 = iA2;
            iA2 = -1;
        }
        linearLayout3.setBackgroundColor(iA2);
        overlayListView.setBackgroundColor(iA3);
        linearLayout3.setTag(Integer.valueOf(iA2));
        overlayListView.setTag(Integer.valueOf(iA3));
        MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) this.X;
        LinearLayout linearLayout4 = this.N;
        int iU = fu.u(context, 0);
        if (Color.alpha(iU) != 255) {
            iU = v50.g(iU, ((Integer) linearLayout4.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(iU, iU);
        HashMap map = new HashMap();
        this.e0 = map;
        map.put(wq2Var, this.X);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(R.id.mr_group_expand_collapse);
        this.D = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.v = new lp2(this, 3);
        this.w0 = this.q0 ? this.x0 : this.y0;
        this.t0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.u0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.v0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
        this.y = true;
        v();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.u.e(this.v);
        s();
        super.onDetachedFromWindow();
    }

    @Override // defpackage.f9, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        oq2 oq2VarF;
        if (i != 25 && i != 24) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.M || !this.q0) {
            int i2 = i == 25 ? -1 : 1;
            wq2 wq2Var = this.w;
            wq2Var.getClass();
            yq2.b();
            if (i2 != 0 && (oq2VarF = yq2.c().f(wq2Var)) != null) {
                oq2VarF.i(i2);
            }
        }
        return true;
    }

    @Override // defpackage.f9, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public final int p(boolean z) {
        if (!z && this.P.getVisibility() != 0) {
            return 0;
        }
        int paddingBottom = this.N.getPaddingBottom() + this.N.getPaddingTop();
        if (z) {
            paddingBottom += this.O.getMeasuredHeight();
        }
        if (this.P.getVisibility() == 0) {
            paddingBottom += this.P.getMeasuredHeight();
        }
        return (z && this.P.getVisibility() == 0) ? this.Q.getMeasuredHeight() + paddingBottom : paddingBottom;
    }

    public final boolean q() {
        wq2 wq2Var = this.w;
        return wq2Var.e() && Collections.unmodifiableList(wq2Var.v).size() > 1;
    }

    public final void s() {
    }

    /* JADX WARN: Code duplicated, block: B:102:0x016e  */
    /* JADX WARN: Code duplicated, block: B:108:0x018b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x018d  */
    /* JADX WARN: Code duplicated, block: B:112:0x019f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:116:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:120:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:88:0x014f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0151  */
    /* JADX WARN: Code duplicated, block: B:92:0x0159  */
    /* JADX WARN: Code duplicated, block: B:93:0x015b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0163  */
    public final void t(boolean z) {
        int i;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        PlaybackStateCompat playbackStateCompat;
        int i4;
        boolean z4;
        Context context;
        int i5;
        int i6;
        boolean z5 = true;
        if (this.Z != null) {
            this.o0 = true;
            this.p0 = z | this.p0;
            return;
        }
        this.o0 = false;
        this.p0 = false;
        wq2 wq2Var = this.w;
        if (!wq2Var.g() || wq2Var.d()) {
            dismiss();
            return;
        }
        if (this.y) {
            this.K.setText(wq2Var.d);
            this.A.setVisibility(wq2Var.j ? 0 : 8);
            if (this.l0) {
                Bitmap bitmap = this.m0;
                if (bitmap == null || !bitmap.isRecycled()) {
                    this.H.setImageBitmap(this.m0);
                    this.H.setBackgroundColor(this.n0);
                } else {
                    Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.m0);
                }
                this.l0 = false;
                this.m0 = null;
                this.n0 = 0;
            }
            boolean z6 = this.M;
            if (!z6 && q()) {
                this.P.setVisibility(8);
                this.q0 = true;
                this.R.setVisibility(0);
                this.w0 = this.q0 ? this.x0 : this.y0;
                w(false);
            } else if ((!this.q0 || z6) && this.L) {
                if (!wq2Var.e()) {
                    i = wq2Var.o;
                } else if (yq2.c == null) {
                    i = 0;
                } else {
                    yq2.c().getClass();
                    i = wq2Var.o;
                }
                if (i != 1) {
                    this.P.setVisibility(8);
                } else if (this.P.getVisibility() == 8) {
                    this.P.setVisibility(0);
                    this.X.setMax(wq2Var.q);
                    this.X.setProgress(wq2Var.p);
                    this.D.setVisibility(q() ? 0 : 8);
                }
            } else {
                this.P.setVisibility(8);
            }
            if (l()) {
                MediaDescriptionCompat mediaDescriptionCompat = this.h0;
                CharSequence charSequence = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.o;
                boolean zIsEmpty = TextUtils.isEmpty(charSequence);
                MediaDescriptionCompat mediaDescriptionCompat2 = this.h0;
                CharSequence charSequence2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.p : null;
                boolean zIsEmpty2 = TextUtils.isEmpty(charSequence2);
                if (wq2Var.r != -1) {
                    this.I.setText(R.string.mr_controller_casting_screen);
                } else {
                    PlaybackStateCompat playbackStateCompat2 = this.g0;
                    if (playbackStateCompat2 == null || playbackStateCompat2.n == 0) {
                        this.I.setText(R.string.mr_controller_no_media_selected);
                    } else {
                        if (zIsEmpty && zIsEmpty2) {
                            this.I.setText(R.string.mr_controller_no_info_available);
                        } else {
                            if (zIsEmpty) {
                                z2 = false;
                            } else {
                                this.I.setText(charSequence);
                                z2 = true;
                            }
                            if (zIsEmpty2) {
                                z3 = false;
                            } else {
                                this.J.setText(charSequence2);
                                z3 = true;
                            }
                        }
                        TextView textView = this.I;
                        if (z2) {
                            i2 = 0;
                        } else {
                            i2 = 8;
                        }
                        textView.setVisibility(i2);
                        TextView textView2 = this.J;
                        if (z3) {
                            i3 = 0;
                        } else {
                            i3 = 8;
                        }
                        textView2.setVisibility(i3);
                        playbackStateCompat = this.g0;
                        if (playbackStateCompat != null) {
                            i4 = playbackStateCompat.n;
                            if (i4 != 6 || i4 == 3) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            context = this.C.getContext();
                            if (!z4 && (this.g0.r & 514) != 0) {
                                i5 = R.attr.mediaRoutePauseDrawable;
                                i6 = R.string.mr_controller_pause;
                            } else if (!z4 && (this.g0.r & 1) != 0) {
                                i5 = R.attr.mediaRouteStopDrawable;
                                i6 = R.string.mr_controller_stop;
                            } else if (!z4 || (this.g0.r & 516) == 0) {
                                z5 = false;
                                i5 = 0;
                                i6 = 0;
                            } else {
                                i5 = R.attr.mediaRoutePlayDrawable;
                                i6 = R.string.mr_controller_play;
                            }
                            this.C.setVisibility(z5 ? 0 : 8);
                            if (z5) {
                                this.C.setImageResource(fu.B(context, i5));
                                this.C.setContentDescription(context.getResources().getText(i6));
                            }
                        }
                    }
                }
                z3 = false;
                z2 = true;
                TextView textView3 = this.I;
                if (z2) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                textView3.setVisibility(i2);
                TextView textView4 = this.J;
                if (z3) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                textView4.setVisibility(i3);
                playbackStateCompat = this.g0;
                if (playbackStateCompat != null) {
                    i4 = playbackStateCompat.n;
                    if (i4 != 6) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    context = this.C.getContext();
                    if (!z4) {
                        if (!z4) {
                            if (z4) {
                                z5 = false;
                                i5 = 0;
                                i6 = 0;
                            } else {
                                z5 = false;
                                i5 = 0;
                                i6 = 0;
                            }
                        } else if (z4) {
                            z5 = false;
                            i5 = 0;
                            i6 = 0;
                        } else {
                            z5 = false;
                            i5 = 0;
                            i6 = 0;
                        }
                    } else if (!z4) {
                        if (z4) {
                            z5 = false;
                            i5 = 0;
                            i6 = 0;
                        } else {
                            z5 = false;
                            i5 = 0;
                            i6 = 0;
                        }
                    } else if (z4) {
                        z5 = false;
                        i5 = 0;
                        i6 = 0;
                    } else {
                        z5 = false;
                        i5 = 0;
                        i6 = 0;
                    }
                    this.C.setVisibility(z5 ? 0 : 8);
                    if (z5) {
                        this.C.setImageResource(fu.B(context, i5));
                        this.C.setContentDescription(context.getResources().getText(i6));
                    }
                }
            }
            w(z);
        }
    }

    public final void u() {
        MediaDescriptionCompat mediaDescriptionCompat = this.h0;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.r;
        Uri uri = mediaDescriptionCompat != null ? mediaDescriptionCompat.s : null;
        mp2 mp2Var = this.i0;
        Bitmap bitmap2 = mp2Var == null ? this.j0 : mp2Var.a;
        Uri uri2 = mp2Var == null ? this.k0 : mp2Var.b;
        if (bitmap2 == bitmap) {
            if (bitmap2 != null) {
                return;
            }
            if (uri2 != null && uri2.equals(uri)) {
                return;
            }
            if (uri2 == null && uri == null) {
                return;
            }
        }
        if (!q() || this.M) {
            mp2 mp2Var2 = this.i0;
            if (mp2Var2 != null) {
                mp2Var2.cancel(true);
            }
            mp2 mp2Var3 = new mp2(this);
            this.i0 = mp2Var3;
            mp2Var3.execute(new Void[0]);
        }
    }

    public final void v() {
        Context context = this.x;
        int iP = xl.p(context);
        getWindow().setLayout(iP, -2);
        View decorView = getWindow().getDecorView();
        this.z = (iP - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = context.getResources();
        this.a0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.b0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
        this.c0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
        this.j0 = null;
        this.k0 = null;
        u();
        t(false);
    }

    public final void w(boolean z) {
        this.G.requestLayout();
        this.G.getViewTreeObserver().addOnGlobalLayoutListener(new ip2(this, z));
    }

    public final void x(boolean z) {
        int i = 0;
        this.Q.setVisibility((this.P.getVisibility() == 0 && z) ? 0 : 8);
        LinearLayout linearLayout = this.N;
        if (this.P.getVisibility() == 8 && !z) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }
}
