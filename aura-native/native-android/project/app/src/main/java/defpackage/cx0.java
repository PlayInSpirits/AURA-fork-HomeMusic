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

    public cx0(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.n = new Rect();
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.v = z;
        setCacheColorHint(0);
    }

    public final int a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x014a  */
    /* JADX WARN: Code duplicated, block: B:83:0x015f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0168  */
    /* JADX WARN: Code duplicated, block: B:89:0x017a  */
    /* JADX WARN: Code duplicated, block: B:90:0x017c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0180  */
    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    public final boolean b(MotionEvent motionEvent, int i) {
        boolean z;
        boolean zA;
        View childAt;
        View childAt2;
        hc2 hc2Var;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z = true;
            } else if (actionMasked != 3) {
                z = true;
                z2 = false;
            } else {
                z = false;
                z2 = false;
            }
            if (z || z2) {
                this.w = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.s - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            hc2Var = this.x;
            if (z) {
                if (hc2Var == null) {
                    this.x = new hc2(this);
                }
                hc2 hc2Var2 = this.x;
                boolean z3 = hc2Var2.C;
                hc2Var2.C = true;
                hc2Var2.onTouch(this, motionEvent);
            } else if (hc2Var != null) {
                if (hc2Var.C) {
                    hc2Var.d();
                }
                hc2Var.C = false;
            }
            return z;
        }
        z = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z = false;
            z2 = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition != -1) {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.w = true;
                xw0.a(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.s;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.s = iPointToPosition;
                xw0.a(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z4 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z4) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.n;
                rect.set(left, top, right, bottom);
                rect.left -= this.o;
                rect.top -= this.p;
                rect.right += this.q;
                rect.bottom += this.r;
                if (Build.VERSION.SDK_INT >= 33) {
                    zA = zw0.a(this);
                } else {
                    Field field = bx0.a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z5 = !zA;
                    if (Build.VERSION.SDK_INT >= 33) {
                        zw0.b(this, z5);
                    } else {
                        Field field2 = bx0.a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z5));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z4) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                ax0 ax0Var = this.t;
                if (ax0Var != null) {
                    ax0Var.o = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z2 = false;
                z = true;
            }
        }
        if (z) {
            this.w = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.s - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.w = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.s - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        hc2Var = this.x;
        if (z) {
            if (hc2Var == null) {
                this.x = new hc2(this);
            }
            hc2 hc2Var3 = this.x;
            boolean z6 = hc2Var3.C;
            hc2Var3.C = true;
            hc2Var3.onTouch(this, motionEvent);
        } else if (hc2Var != null) {
            if (hc2Var.C) {
                hc2Var.d();
            }
            hc2Var.C = false;
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.n;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.y != null) {
            return;
        }
        super.drawableStateChanged();
        ax0 ax0Var = this.t;
        if (ax0Var != null) {
            ax0Var.o = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.w && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.v || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.v || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.v || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.v && this.u) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.y = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        int i2 = 9;
        if (actionMasked == 10 && this.y == null) {
            g5 g5Var = new g5(i2, this);
            this.y = g5Var;
            post(g5Var);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !yw0.d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        yw0.a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        yw0.b.invoke(this, Integer.valueOf(iPointToPosition));
                        yw0.c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.w && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.s = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        g5 g5Var = this.y;
        if (g5Var != null) {
            cx0 cx0Var = (cx0) g5Var.o;
            cx0Var.y = null;
            cx0Var.removeCallbacks(g5Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.u = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        ax0 ax0Var = null;
        if (drawable != null) {
            ax0 ax0Var2 = new ax0();
            Drawable drawable2 = ax0Var2.n;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            ax0Var2.n = drawable;
            drawable.setCallback(ax0Var2);
            ax0Var2.o = true;
            ax0Var = ax0Var2;
        }
        this.t = ax0Var;
        super.setSelector(ax0Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.o = rect.left;
        this.p = rect.top;
        this.q = rect.right;
        this.r = rect.bottom;
    }
}
