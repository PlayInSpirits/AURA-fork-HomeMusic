package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import defpackage.a0;
import defpackage.cn0;
import defpackage.dj3;
import defpackage.er1;
import defpackage.f35;
import defpackage.l93;
import defpackage.pt3;
import defpackage.qi3;
import defpackage.rr2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class DefaultTimeBar extends View {
    public static final /* synthetic */ int f0 = 0;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final StringBuilder H;
    public final Formatter I;
    public final a0 J;
    public final CopyOnWriteArraySet K;
    public final Point L;
    public final float M;
    public int N;
    public long O;
    public int P;
    public Rect Q;
    public final ValueAnimator R;
    public float S;
    public boolean T;
    public boolean U;
    public long V;
    public long W;
    public long a0;
    public long b0;
    public int c0;
    public long[] d0;
    public boolean[] e0;
    public final Rect n;
    public final Rect o;
    public final Rect p;
    public final Rect q;
    public final Paint r;
    public final Paint s;
    public final Paint t;
    public final Paint u;
    public final Paint v;
    public final Paint w;
    public final Drawable x;
    public final int y;
    public final int z;

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        this.n = new Rect();
        this.o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        Paint paint = new Paint();
        this.r = paint;
        Paint paint2 = new Paint();
        this.s = paint2;
        Paint paint3 = new Paint();
        this.t = paint3;
        Paint paint4 = new Paint();
        this.u = paint4;
        Paint paint5 = new Paint();
        this.v = paint5;
        Paint paint6 = new Paint();
        this.w = paint6;
        paint6.setAntiAlias(true);
        this.K = new CopyOnWriteArraySet();
        this.L = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.M = f;
        this.G = a(-50, f);
        int iA = a(4, f);
        int iA2 = a(26, f);
        int iA3 = a(4, f);
        int iA4 = a(12, f);
        int iA5 = a(0, f);
        int iA6 = a(16, f);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, pt3.a, i, i2);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.x = drawable;
                if (drawable != null) {
                    drawable.setLayoutDirection(getLayoutDirection());
                    iA2 = Math.max(drawable.getMinimumHeight(), iA2);
                }
                this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iA);
                this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iA2);
                this.A = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iA3);
                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iA4);
                this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iA5);
                this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iA6);
                int i3 = typedArrayObtainStyledAttributes.getInt(6, -1);
                int i4 = typedArrayObtainStyledAttributes.getInt(7, -1);
                int i5 = typedArrayObtainStyledAttributes.getInt(4, -855638017);
                int i6 = typedArrayObtainStyledAttributes.getInt(13, 872415231);
                int i7 = typedArrayObtainStyledAttributes.getInt(0, -1291845888);
                int i8 = typedArrayObtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i3);
                paint6.setColor(i4);
                paint2.setColor(i5);
                paint3.setColor(i6);
                paint4.setColor(i7);
                paint5.setColor(i8);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.y = iA;
            this.z = iA2;
            this.A = 0;
            this.B = iA3;
            this.C = iA4;
            this.D = iA5;
            this.E = iA6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.x = null;
        }
        StringBuilder sb = new StringBuilder();
        this.H = sb;
        this.I = new Formatter(sb, Locale.getDefault());
        this.J = new a0(20, this);
        Drawable drawable2 = this.x;
        if (drawable2 != null) {
            this.F = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.F = (Math.max(this.D, Math.max(this.C, this.E)) + 1) / 2;
        }
        this.S = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.R = valueAnimator;
        valueAnimator.addUpdateListener(new cn0(0, this));
        this.W = -9223372036854775807L;
        this.O = -9223372036854775807L;
        this.N = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int a(int i, float f) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.O;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.W;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / ((long) this.N);
    }

    private String getProgressText() {
        return f35.F(this.H, this.I, this.a0);
    }

    private long getScrubberPosition() {
        Rect rect = this.o;
        if (rect.width() <= 0 || this.W == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.q.width()) * this.W) / ((long) rect.width());
    }

    public final boolean b(long j) {
        long j2 = this.W;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.U ? this.V : this.a0;
        long jK = f35.k(j3 + j, 0L, j2);
        if (jK == j3) {
            return false;
        }
        if (this.U) {
            f(jK);
        } else {
            c(jK);
        }
        e();
        return true;
    }

    public final void c(long j) {
        this.V = j;
        this.U = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.K.iterator();
        while (it.hasNext()) {
            PlayerControlView playerControlView = ((dj3) it.next()).n;
            playerControlView.J0 = true;
            TextView textView = playerControlView.a0;
            if (textView != null) {
                textView.setText(f35.F(playerControlView.c0, playerControlView.d0, j));
            }
            playerControlView.n.f();
            qi3 qi3Var = playerControlView.D0;
            if (qi3Var != null && playerControlView.L0) {
                if (playerControlView.g(qi3Var)) {
                    try {
                        Method method = playerControlView.s;
                        method.getClass();
                        method.invoke(playerControlView.D0, Boolean.TRUE);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        er1.m(e);
                        return;
                    }
                } else if (playerControlView.f(playerControlView.D0)) {
                    try {
                        Method method2 = playerControlView.v;
                        method2.getClass();
                        method2.invoke(playerControlView.D0, Boolean.TRUE);
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        er1.m(e2);
                        return;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Time bar scrubbing is enabled, but player is not an ExoPlayer or CompositionPlayer instance, so ignoring (because we can't enable scrubbing mode). player.class=");
                    qi3 qi3Var2 = playerControlView.D0;
                    qi3Var2.getClass();
                    sb.append(qi3Var2.getClass());
                    l93.q0("PlayerControlView", sb.toString());
                }
            }
            if (playerControlView.h(playerControlView.D0)) {
                PlayerControlView.a(playerControlView, playerControlView.D0, j);
            }
        }
    }

    public final void d(boolean z) {
        removeCallbacks(this.J);
        this.U = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        for (dj3 dj3Var : this.K) {
            long j = this.V;
            PlayerControlView playerControlView = dj3Var.n;
            playerControlView.J0 = false;
            qi3 qi3Var = playerControlView.D0;
            if (qi3Var != null) {
                if (!z) {
                    PlayerControlView.a(playerControlView, qi3Var, j);
                }
                if (playerControlView.g(playerControlView.D0)) {
                    try {
                        Method method = playerControlView.s;
                        method.getClass();
                        method.invoke(playerControlView.D0, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        er1.m(e);
                        return;
                    }
                } else if (playerControlView.f(playerControlView.D0)) {
                    try {
                        Method method2 = playerControlView.v;
                        method2.getClass();
                        method2.invoke(playerControlView.D0, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        er1.m(e2);
                        return;
                    }
                } else {
                    continue;
                }
            }
            playerControlView.n.g();
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.x;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e() {
        Rect rect = this.p;
        Rect rect2 = this.o;
        rect.set(rect2);
        Rect rect3 = this.q;
        rect3.set(rect2);
        long j = this.U ? this.V : this.a0;
        if (this.W > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.b0) / this.W)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j) / this.W)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.n);
    }

    public final void f(long j) {
        if (this.V == j) {
            return;
        }
        this.V = j;
        Iterator it = this.K.iterator();
        while (it.hasNext()) {
            PlayerControlView playerControlView = ((dj3) it.next()).n;
            TextView textView = playerControlView.a0;
            if (textView != null) {
                textView.setText(f35.F(playerControlView.c0, playerControlView.d0, j));
            }
            if (playerControlView.h(playerControlView.D0)) {
                PlayerControlView.a(playerControlView, playerControlView.D0, j);
            }
        }
    }

    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.o.width() / this.M);
        if (iWidth == 0) {
            return Long.MAX_VALUE;
        }
        long j = this.W;
        if (j == 0 || j == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j / ((long) iWidth);
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i;
        canvas.save();
        Rect rect = this.o;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i2 = iCenterY + iHeight;
        long j = this.W;
        Paint paint = this.t;
        Rect rect2 = this.q;
        if (j <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, iCenterY, rect.right, i2, paint);
        } else {
            Rect rect3 = this.p;
            int i3 = rect3.left;
            int i4 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i4), rect2.right);
            int i5 = rect.right;
            if (iMax < i5) {
                canvas.drawRect(iMax, iCenterY, i5, i2, paint);
            }
            int iMax2 = Math.max(i3, rect2.right);
            if (i4 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i4, i2, this.s);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i2, this.r);
            }
            if (this.c0 != 0) {
                long[] jArr = this.d0;
                jArr.getClass();
                boolean[] zArr = this.e0;
                zArr.getClass();
                int i6 = this.B;
                int i7 = i6 / 2;
                int i8 = 0;
                int i9 = 0;
                while (i9 < this.c0) {
                    int iMin = Math.min(rect.width() - i6, Math.max(i8, ((int) ((((long) rect.width()) * f35.k(jArr[i9], 0L, this.W)) / this.W)) - i7)) + rect.left;
                    int i10 = i9;
                    canvas.drawRect(iMin, iCenterY, iMin + i6, i2, zArr[i9] ? this.v : this.u);
                    i9 = i10 + 1;
                    i8 = i8;
                }
            }
            canvas2 = canvas;
        }
        if (this.W > 0) {
            int iJ = f35.j(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.x;
            if (drawable == null) {
                if (this.U || isFocused()) {
                    i = this.E;
                } else {
                    i = isEnabled() ? this.C : this.D;
                }
                canvas2.drawCircle(iJ, iCenterY2, (int) ((i * this.S) / 2.0f), this.w);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.S)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.S)) / 2;
                drawable.setBounds(iJ - intrinsicWidth, iCenterY2 - intrinsicHeight, iJ + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.U || z) {
            return;
        }
        d(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.W <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i != 66) {
                switch (i) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (b(positionIncrement)) {
                            a0 a0Var = this.J;
                            removeCallbacks(a0Var);
                            postDelayed(a0Var, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (b(positionIncrement)) {
                            a0 a0Var2 = this.J;
                            removeCallbacks(a0Var2);
                            postDelayed(a0Var2, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.U) {
                            d(false);
                            return true;
                        }
                        break;
                }
            } else if (this.U) {
                d(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i7 = this.T ? 0 : this.F;
        int i8 = this.A;
        int i9 = this.y;
        int i10 = this.z;
        if (i8 == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - i10;
            paddingBottom2 = ((i6 - getPaddingBottom()) - i9) - Math.max(i7 - (i9 / 2), 0);
        } else {
            paddingBottom = (i6 - i10) / 2;
            paddingBottom2 = (i6 - i9) / 2;
        }
        Rect rect2 = this.n;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i10 + paddingBottom);
        this.o.set(rect2.left + i7, paddingBottom2, rect2.right - i7, i9 + paddingBottom2);
        if (Build.VERSION.SDK_INT >= 29 && ((rect = this.Q) == null || rect.width() != i5 || this.Q.height() != i6)) {
            Rect rect3 = new Rect(0, 0, i5, i6);
            this.Q = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        e();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.z;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.x;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.x;
        if (drawable == null || !drawable.setLayoutDirection(i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.W > 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            Point point = this.L;
            point.set(x, y);
            int i = point.x;
            int i2 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.o;
            Rect rect2 = this.q;
            if (action == 0) {
                int i3 = i;
                if (this.n.contains(i3, i2)) {
                    rect2.right = f35.j(i3, rect.left, rect.right);
                    c(getScrubberPosition());
                    e();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.U) {
                    d(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.U) {
                        d(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.U) {
                if (i2 < this.G) {
                    int i4 = this.P;
                    rect2.right = f35.j(((i - i4) / 3) + i4, rect.left, rect.right);
                } else {
                    this.P = i;
                    rect2.right = f35.j(i, rect.left, rect.right);
                }
                f(getScrubberPosition());
                e();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.W <= 0) {
            return false;
        }
        if (i == 8192) {
            if (b(-getPositionIncrement())) {
                d(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (b(getPositionIncrement())) {
                d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i) {
        this.u.setColor(i);
        invalidate(this.n);
    }

    public void setBufferedColor(int i) {
        this.s.setColor(i);
        invalidate(this.n);
    }

    public void setBufferedPosition(long j) {
        if (this.b0 == j) {
            return;
        }
        this.b0 = j;
        e();
    }

    public void setDuration(long j) {
        if (this.W == j) {
            return;
        }
        this.W = j;
        if (this.U && j == -9223372036854775807L) {
            d(true);
        }
        e();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.U || z) {
            return;
        }
        d(true);
    }

    public void setKeyCountIncrement(int i) {
        rr2.l(i > 0);
        this.N = i;
        this.O = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        rr2.l(j > 0);
        this.N = -1;
        this.O = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.v.setColor(i);
        invalidate(this.n);
    }

    public void setPlayedColor(int i) {
        this.r.setColor(i);
        invalidate(this.n);
    }

    public void setPosition(long j) {
        if (this.a0 == j) {
            return;
        }
        this.a0 = j;
        setContentDescription(getProgressText());
        e();
    }

    public void setScrubberColor(int i) {
        this.w.setColor(i);
        invalidate(this.n);
    }

    public void setUnplayedColor(int i) {
        this.t.setColor(i);
        invalidate(this.n);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        this(context, attributeSet, i, attributeSet2, 0);
    }

    public DefaultTimeBar(Context context) {
        this(context, null);
    }
}
