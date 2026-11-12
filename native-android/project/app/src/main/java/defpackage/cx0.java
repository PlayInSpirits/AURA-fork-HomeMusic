package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import app.homemusic.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class cx0 extends ListView {
    public final Rect n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public ax0 t;
    public boolean u;
    public final boolean v;
    public boolean w;
    public hc2 x;
    public g5 y;

    public cx0(Context r3, boolean r4) {
        super(r3, null, R.attr.dropDownListViewStyle);
        this.n = new Rect();
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.v = r4;
        setCacheColorHint(0);
    }

    public final int a(int r12, int r13) {
        int r0 = getListPaddingTop();
        int r1 = getListPaddingBottom();
        int r2 = getDividerHeight();
        Drawable r3 = getDivider();
        ListAdapter r4 = getAdapter();
        if (r4 == null) goto L5;
        int r5 = r0 + r1;
        if (r2 <= 0) goto L10;
        if (r3 == null) goto L10;
    L11:
        int r6 = r4.getCount();
        int r7 = 0;
        int r8 = 0;
        View r9 = null;
    L12:
        if (r7 >= r6) goto L30;
        int r10 = r4.getItemViewType(r7);
        if (r10 == r8) goto L16;
        r9 = null;
        r8 = r10;
    L16:
        r9 = r4.getView(r7, r9, this);
        ViewGroup.LayoutParams r11 = r9.getLayoutParams();
        if (r11 != null) goto L19;
        r11 = generateDefaultLayoutParams();
        r9.setLayoutParams(r11);
    L19:
        int r14 = r11.height;
        if (r14 <= 0) goto L22;
        int r15 = View.MeasureSpec.makeMeasureSpec(r14, 1073741824);
    L23:
        r9.measure(r12, r15);
        r9.forceLayout();
        if (r7 <= 0) goto L26;
        r5 = r5 + r2;
    L26:
        r5 = r5 + r9.getMeasuredHeight();
        if (r5 >= r13) goto L28;
        r7 = r7 + 1;
        goto L12
    L28:
        return r13;
    L22:
        r15 = View.MeasureSpec.makeMeasureSpec(0, 0);
        goto L23
    L30:
        return r5;
    L10:
        r2 = 0;
        goto L11
    L5:
        return r0 + r1;
    }

    public final boolean b(MotionEvent r18, int r19) {
        int r3 = r18.getActionMasked();
        boolean r4 = true;
        if (r3 != 1) goto L5;
        boolean r0 = false;
    L12:
        int r6 = r18.findPointerIndex(r19);
        if (r6 < 0) goto L9;
        int r7 = (int) r18.getX(r6);
        int r8 = (int) r18.getY(r6);
        int r9 = pointToPosition(r7, r8);
        if (r9 == (-1)) goto L79;
        View r10 = getChildAt(r9 - getFirstVisiblePosition());
        float r11 = r7;
        float r12 = r8;
        this.w = true;
        xw0.a(this, r11, r12);
        if (isPressed() == true) goto L21;
        setPressed(true);
    L21:
        layoutChildren();
        int r1 = this.s;
        if (r1 == (-1)) goto L29;
        View r2 = getChildAt(r1 - getFirstVisiblePosition());
        if (r2 == null) goto L29;
        if (r2 == r10) goto L29;
        if (r2.isPressed() == false) goto L29;
        r2.setPressed(false);
    L29:
        this.s = r9;
        xw0.a(r10, r11 - r10.getLeft(), r12 - r10.getTop());
        if (r10.isPressed() == true) goto L32;
        r10.setPressed(true);
    L32:
        Drawable r13 = getSelector();
        if (r13 == null) goto L36;
        if (r9 == (-1)) goto L36;
        boolean r14 = true;
    L37:
        if (r14 == false) goto L39;
        r13.setVisible(false, false);
    L39:
        int r5 = r10.getLeft();
        int r15 = r10.getTop();
        int r16 = r10.getRight();
        int r17 = r10.getBottom();
        Rect r20 = this.n;
        r20.set(r5, r15, r16, r17);
        r20.left -= this.o;
        r20.top -= this.p;
        r20.right += this.q;
        r20.bottom += this.r;
        if (Build.VERSION.SDK_INT < 33) goto L42;
        boolean r21 = zw0.a(this);
    L50:
        if (r10.isEnabled() == r21) goto L62;
        boolean r22 = !r21;
        if (Build.VERSION.SDK_INT < 33) goto L54;
        zw0.b(this, r22);
    L60:
        if (r9 == (-1)) goto L62;
        refreshDrawableState();
        goto L62
    L54:
        Field r110 = bx0.a;
        if (r110 == null) goto L60;
        r110.set(this, Boolean.valueOf(r22));     // Catch: IllegalAccessException -> L58
    L58:
        e = move-exception;
        e.printStackTrace();
    L62:
        if (r14 == false) goto L68;
        float r23 = r20.exactCenterX();
        float r24 = r20.exactCenterY();
        if (getVisibility() != 0) goto L66;
        boolean r111 = true;
    L67:
        r13.setVisible(r111, false);
        r13.setHotspot(r23, r24);
        goto L68
    L66:
        r111 = false;
    L68:
        Drawable r25 = getSelector();
        if (r25 == null) goto L72;
        if (r9 == (-1)) goto L72;
        r25.setHotspot(r11, r12);
    L72:
        ax0 r26 = this.t;
        if (r26 == null) goto L75;
        r26.o = false;
    L75:
        refreshDrawableState();
        if (r3 != 1) goto L78;
        performItemClick(r10, r9, getItemIdAtPosition(r9));
    L78:
        r4 = false;
        r0 = true;
        goto L79
    L42:
        Field r27 = bx0.a;
        if (r27 != null) goto L97;
    L48:
        r21 = false;
        goto L50
    L97:
        r21 = r27.getBoolean(this);     // Catch: IllegalAccessException -> L46
    L46:
        e = move-exception;
        e.printStackTrace();
    L36:
        r14 = false;
    L79:
        if (r0 == false) goto L81;
        if (r4 == true) goto L81;
    L84:
        hc2 r28 = this.x;
        if (r0 == false) goto L89;
        if (r28 != null) goto L88;
        this.x = new hc2(this);
    L88:
        hc2 r29 = this.x;
        boolean r30 = r29.C;
        r29.C = true;
        r29.onTouch(this, r18);
    L94:
        return r0;
    L89:
        if (r28 == null) goto L94;
        if (r28.C == false) goto L93;
        r28.d();
    L93:
        r28.C = false;
    L81:
        this.w = false;
        setPressed(false);
        drawableStateChanged();
        View r31 = getChildAt(this.s - getFirstVisiblePosition());
        if (r31 == null) goto L84;
        r31.setPressed(false);
    L9:
        r0 = false;
        r4 = false;
        goto L79
    L5:
        if (r3 != 2) goto L7;
        r0 = true;
        goto L12
    L7:
        if (r3 == 3) goto L9;
        r0 = true;
        r4 = false;
        goto L79
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas r3) {
        Rect r0 = this.n;
        if (r0.isEmpty() == true) goto L7;
        Drawable r1 = getSelector();
        if (r1 == null) goto L7;
        r1.setBounds(r0);
        r1.draw(r3);
    L7:
        super.dispatchDraw(r3);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.y != null) goto L19;
        super.drawableStateChanged();
        ax0 r0 = this.t;
        if (r0 == null) goto L8;
        r0.o = true;
    L8:
        Drawable r1 = getSelector();
        if (r1 != null) goto L11;
        return;
    L11:
        if (this.w == true) goto L13;
        return;
    L13:
        if (isPressed() == false) goto L18;
        r1.setState(getDrawableState());
        return;
    L18:
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        if (this.v == false) goto L5;
        return true;
    L5:
        if (super.hasFocus() == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        if (this.v == false) goto L5;
        return true;
    L5:
        if (super.hasWindowFocus() == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        if (this.v == false) goto L5;
        return true;
    L5:
        if (super.isFocused() == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        if (this.v == false) goto L7;
        if (this.u == false) goto L7;
        return true;
    L7:
        if (super.isInTouchMode() == true) goto L12;
        return false;
    L12:
        return true;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.y = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent r7) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 26) goto L5;
        int r1 = r7.getActionMasked();
        int r3 = 9;
        if (r1 == 10) goto L9;
    L11:
        boolean r2 = super.onHoverEvent(r7);
        if (r1 != 9) goto L14;
    L18:
        int r8 = pointToPosition((int) r7.getX(), (int) r7.getY());
        if (r8 != (-1)) goto L21;
    L45:
        return r2;
    L21:
        if (r8 == getSelectedItemPosition()) goto L45;
        View r4 = getChildAt(r8 - getFirstVisiblePosition());
        if (r4.isEnabled() == false) goto L38;
        requestFocus();
        if (r0 >= 30) goto L27;
    L37:
        setSelectionFromTop(r8, r4.getTop() - getTop());
        goto L38
    L27:
        if (yw0.d == false) goto L37;
        yw0.a.invoke(this, new Object[]{Integer.valueOf(r8), r4, Boolean.FALSE, -1, -1});     // Catch: InvocationTargetException -> L31 IllegalAccessException -> L33
        yw0.b.invoke(this, new Object[]{Integer.valueOf(r8)});     // Catch: InvocationTargetException -> L31 IllegalAccessException -> L33
        yw0.c.invoke(this, new Object[]{Integer.valueOf(r8)});     // Catch: InvocationTargetException -> L31 IllegalAccessException -> L33
    L33:
        e = move-exception;
        e.printStackTrace();
    L31:
        e = move-exception;
        e.printStackTrace();
    L38:
        Drawable r9 = getSelector();
        if (r9 == null) goto L45;
        if (this.w == false) goto L45;
        if (isPressed() == false) goto L45;
        r9.setState(getDrawableState());
        goto L45
    L14:
        if (r1 == 7) goto L18;
        setSelection(-1);
        return r2;
    L9:
        if (this.y != null) goto L11;
        g5 r5 = new g5(r3, this);
        this.y = r5;
        post(r5);
        goto L11
    L5:
        return super.onHoverEvent(r7);
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent r4) {
        if (r4.getAction() != 0) goto L6;
        this.s = pointToPosition((int) r4.getX(), (int) r4.getY());
    L6:
        g5 r0 = this.y;
        if (r0 == null) goto L10;
        cx0 r1 = (cx0) r0.o;
        r1.y = null;
        r1.removeCallbacks(r0);
    L10:
        return super.onTouchEvent(r4);
    }

    public void setListSelectionHidden(boolean r1) {
        this.u = r1;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable r4) {
        ax0 r0 = null;
        if (r4 == null) goto L8;
        ax0 r1 = new ax0();
        Drawable r2 = r1.n;
        if (r2 == null) goto L7;
        r2.setCallback(null);
    L7:
        r1.n = r4;
        r4.setCallback(r1);
        r1.o = true;
        r0 = r1;
    L8:
        this.t = r0;
        super.setSelector(r0);
        Rect r3 = new Rect();
        if (r4 == null) goto L11;
        r4.getPadding(r3);
    L11:
        this.o = r3.left;
        this.p = r3.top;
        this.q = r3.right;
        this.r = r3.bottom;
    }
}
