package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class bc2 implements nd4 {
    public static final Method N = null;
    public static final Method O = null;
    public og0 A;
    public View B;
    public AdapterView.OnItemClickListener C;
    public AdapterView.OnItemSelectedListener D;
    public final yb2 E;
    public final ac2 F;
    public final zb2 G;
    public final yb2 H;
    public final Handler I;
    public final Rect J;
    public Rect K;
    public boolean L;
    public final lg M;
    public final Context n;
    public ListAdapter o;
    public cx0 p;
    public final int q;
    public int r;
    public int s;
    public int t;
    public final int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public final int z;

    static {
        if (Build.VERSION.SDK_INT <= 28) goto L12;
        return;
    L12:
        N = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});     // Catch: NoSuchMethodException -> L7
    L14:
        O = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});     // Catch: NoSuchMethodException -> L10
        return;
    L10:
        Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        return;
    L7:
        Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        goto L14
    }

    public bc2(Context r4, AttributeSet r5, int r6, int r7) {
        this.q = -2;
        this.r = -2;
        this.u = 1002;
        this.y = 0;
        this.z = Integer.MAX_VALUE;
        this.E = new yb2(this, 1);
        this.F = new ac2(this);
        this.G = new zb2(this);
        this.H = new yb2(this, 0);
        this.J = new Rect();
        this.n = r4;
        this.I = new Handler(r4.getMainLooper());
        TypedArray r0 = r4.obtainStyledAttributes(r5, st3.p, r6, 0);
        this.s = r0.getDimensionPixelOffset(0, 0);
        int r2 = r0.getDimensionPixelOffset(1, 0);
        this.t = r2;
        if (r2 == 0) goto L5;
        this.v = true;
    L5:
        r0.recycle();
        lg r1 = new lg(r4, r5, r6, 0);
        TypedArray r8 = r4.obtainStyledAttributes(r5, st3.t, r6, 0);
        if (r8.hasValue(2) == false) goto L9;
        r1.setOverlapAnchor(r8.getBoolean(2, false));
    L9:
        if (r8.hasValue(0) == false) goto L13;
        int r9 = r8.getResourceId(0, 0);
        if (r9 == 0) goto L13;
        Drawable r10 = zz1.r(r4, r9);
    L14:
        r1.setBackgroundDrawable(r10);
        r8.recycle();
        this.M = r1;
        r1.setInputMethodMode(1);
        return;
    L13:
        r10 = r8.getDrawable(0);
        goto L14
    }

    @Override // defpackage.nd4
    public final boolean b() {
        return this.M.isShowing();
    }

    public final int c() {
        return this.s;
    }

    public final void d(int r1) {
        this.s = r1;
    }

    @Override // defpackage.nd4
    public final void dismiss() {
        lg r0 = this.M;
        r0.dismiss();
        r0.setContentView(null);
        this.p = null;
        this.I.removeCallbacks(this.E);
    }

    @Override // defpackage.nd4
    public final void f() {
        cx0 r0 = this.p;
        Context r1 = this.n;
        int r2 = 1;
        lg r3 = this.M;
        if (r0 != null) goto L8;
        cx0 r4 = q(r1, !this.L);
        this.p = r4;
        r4.setAdapter(this.o);
        this.p.setOnItemClickListener(this.C);
        this.p.setFocusable(true);
        this.p.setFocusableInTouchMode(true);
        this.p.setOnItemSelectedListener(new dx0(r2, this));
        this.p.setOnScrollListener(this.G);
        AdapterView.OnItemSelectedListener r5 = this.D;
        if (r5 == null) goto L7;
        this.p.setOnItemSelectedListener(r5);
    L7:
        r3.setContentView(this.p);
    L9:
        Drawable r6 = r3.getBackground();
        Rect r7 = this.J;
        int r8 = 0;
        if (r6 == null) goto L14;
        r6.getPadding(r7);
        int r9 = r7.top;
        int r10 = r7.bottom + r9;
        if (this.v == true) goto L16;
        this.t = -r9;
    L16:
        if (r3.getInputMethodMode() != 2) goto L18;
        boolean r11 = true;
    L19:
        int r12 = wb2.a(r3, this.B, this.t, r11);
        int r13 = this.q;
        if (r13 != (-1)) goto L22;
        int r14 = r12 + r10;
    L35:
        if (r3.getInputMethodMode() != 2) goto L37;
        boolean r15 = true;
    L38:
        r3.setWindowLayoutType(this.u);
        if (r3.isShowing() == true) goto L41;
        int r16 = this.r;
        if (r16 != (-1)) goto L74;
        r16 = -1;
    L76:
        if (r13 != (-1)) goto L78;
        r13 = -1;
    L80:
        r3.setWidth(r16);
        r3.setHeight(r13);
        if (Build.VERSION.SDK_INT > 28) goto L87;
        Method r17 = N;
        if (r17 != null) goto L111;
    L88:
        r3.setOutsideTouchable(true);
        r3.setTouchInterceptor(this.F);
        if (this.x == false) goto L92;
        r3.setOverlapAnchor(this.w);
    L92:
        if (Build.VERSION.SDK_INT > 28) goto L99;
        Method r18 = O;
        if (r18 != null) goto L113;
    L100:
        r3.showAsDropDown(this.B, this.s, this.t, this.y);
        this.p.setSelection(-1);
        if (this.L == true) goto L103;
    L104:
        cx0 r19 = this.p;
        if (r19 == null) goto L108;
        r19.setListSelectionHidden(true);
        r19.requestLayout();
    L108:
        if (this.L == true) goto L115;
        this.I.post(this.H);
        return;
    L115:
        return;
    L103:
        if (this.p.isInTouchMode() == false) goto L108;
    L113:
        r18.invoke(r3, new Object[]{this.K});     // Catch: Exception -> L97
    L97:
        e = move-exception;
        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
        goto L100
    L99:
        xb2.a(r3, this.K);
        goto L100
    L111:
        r17.invoke(r3, new Object[]{Boolean.TRUE});     // Catch: Exception -> L86
    L86:
        Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
        goto L88
    L87:
        xb2.b(r3, true);
        goto L88
    L78:
        if (r13 != (-2)) goto L80;
        r13 = r14;
        goto L80
    L74:
        if (r16 != (-2)) goto L76;
        r16 = this.B.getWidth();
        goto L76
    L41:
        if (this.B.isAttachedToWindow() == false) goto L116;
        int r20 = this.r;
        if (r20 != (-1)) goto L46;
        r20 = -1;
    L48:
        if (r13 != (-1)) goto L61;
        if (r15 == false) goto L51;
        r13 = r14;
    L52:
        int r21 = this.r;
        if (r15 == false) goto L58;
        if (r21 != (-1)) goto L56;
        int r22 = -1;
    L57:
        r3.setWidth(r22);
        r3.setHeight(0);
    L63:
        r3.setOutsideTouchable(true);
        int r23 = r20;
        View r24 = this.B;
        int r25 = this.s;
        int r26 = this.t;
        if (r23 >= 0) goto L66;
        int r27 = -1;
    L67:
        if (r13 >= 0) goto L69;
        r13 = -1;
    L69:
        r3.update(r24, r25, r26, r27, r13);
        return;
    L66:
        r27 = r23;
        goto L67
    L56:
        r22 = 0;
        goto L57
    L58:
        if (r21 != (-1)) goto L60;
        r8 = -1;
    L60:
        r3.setWidth(r8);
        r3.setHeight(-1);
        goto L63
    L51:
        r13 = -1;
        goto L52
    L61:
        if (r13 != (-2)) goto L63;
        r13 = r14;
        goto L63
    L46:
        if (r20 != (-2)) goto L48;
        r20 = this.B.getWidth();
        goto L48
    L116:
        return;
    L37:
        r15 = false;
        goto L38
    L22:
        int r110 = this.r;
        if (r110 != (-2)) goto L25;
        int r28 = View.MeasureSpec.makeMeasureSpec(r1.getResources().getDisplayMetrics().widthPixels - (r7.left + r7.right), Integer.MIN_VALUE);
    L29:
        int r29 = this.p.a(r28, r12);
        if (r29 <= 0) goto L32;
        int r30 = (this.p.getPaddingBottom() + this.p.getPaddingTop()) + r10;
    L33:
        r14 = r29 + r30;
        goto L35
    L32:
        r30 = 0;
        goto L33
    L25:
        if (r110 == (-1)) goto L27;
        r28 = View.MeasureSpec.makeMeasureSpec(r110, 1073741824);
        goto L29
    L27:
        r28 = View.MeasureSpec.makeMeasureSpec(r1.getResources().getDisplayMetrics().widthPixels - (r7.left + r7.right), 1073741824);
        goto L29
    L18:
        r11 = false;
        goto L19
    L14:
        r7.setEmpty();
        r10 = 0;
        goto L16
    L8:
        ViewGroup r31 = (ViewGroup) r3.getContentView();
        goto L9
    }

    public final Drawable g() {
        return this.M.getBackground();
    }

    public final void i(Drawable r1) {
        this.M.setBackgroundDrawable(r1);
    }

    public final void j(int r1) {
        this.t = r1;
        this.v = true;
    }

    @Override // defpackage.nd4
    public final cx0 k() {
        return this.p;
    }

    public final int o() {
        if (this.v == true) goto L7;
        return 0;
    L7:
        return this.t;
    }

    public void p(ListAdapter r3) {
        og0 r0 = this.A;
        if (r0 != null) goto L5;
        this.A = new og0(1, this);
    L8:
        this.o = r3;
        if (r3 == null) goto L11;
        r3.registerDataSetObserver(this.A);
    L11:
        cx0 r4 = this.p;
        if (r4 == null) goto L15;
        r4.setAdapter(this.o);
        return;
    L15:
        return;
    L5:
        ListAdapter r1 = this.o;
        if (r1 == null) goto L8;
        r1.unregisterDataSetObserver(r0);
        goto L8
    }

    public cx0 q(Context r1, boolean r2) {
        return new cx0(r1, r2);
    }

    public final void r(int r3) {
        Drawable r0 = this.M.getBackground();
        if (r0 == null) goto L6;
        Rect r1 = this.J;
        r0.getPadding(r1);
        this.r = (r1.left + r1.right) + r3;
        return;
    L6:
        this.r = r3;
    }
}
