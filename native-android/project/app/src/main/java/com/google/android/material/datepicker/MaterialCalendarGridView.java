package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import defpackage.a35;
import defpackage.c6;
import defpackage.ey;
import defpackage.fw0;
import defpackage.ix2;
import defpackage.j65;
import defpackage.jx2;
import defpackage.ld3;
import defpackage.vr1;
import defpackage.xh2;
import defpackage.ze4;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class MaterialCalendarGridView extends GridView {
    public final Calendar n;
    public final boolean o;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = a35.e(null);
        if (xh2.q0(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(app.homemusic.R.id.cancel_button);
            setNextFocusRightId(app.homemusic.R.id.confirm_button);
        }
        this.o = xh2.q0(getContext(), app.homemusic.R.attr.nestedScrollable);
        j65.o(this, new fw0(3));
    }

    public final jx2 a() {
        return (jx2) super.getAdapter();
    }

    public final View b(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (jx2) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((jx2) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iA;
        int width;
        int iA2;
        int width2;
        int width3;
        int i;
        int right;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        jx2 jx2Var = (jx2) super.getAdapter();
        ze4 ze4Var = jx2Var.o;
        ix2 ix2Var = jx2Var.n;
        ey eyVar = jx2Var.q;
        int iMax = Math.max(jx2Var.a(), materialCalendarGridView.getFirstVisiblePosition());
        int iMin = Math.min(jx2Var.c(), materialCalendarGridView.getLastVisiblePosition());
        Long item = jx2Var.getItem(iMax);
        Long item2 = jx2Var.getItem(iMin);
        ze4Var.getClass();
        ArrayList arrayList = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ld3 ld3Var = (ld3) obj;
            Object obj2 = ld3Var.a;
            Object obj3 = ld3Var.b;
            if (obj2 == null) {
                materialCalendarGridView = this;
            } else if (obj3 != null) {
                Long l = (Long) obj2;
                long jLongValue = l.longValue();
                Long l2 = (Long) obj3;
                long jLongValue2 = l2.longValue();
                if (item == null || item2 == null || l.longValue() > item2.longValue() || l2.longValue() < item.longValue()) {
                    materialCalendarGridView = this;
                    ix2Var = ix2Var;
                    i2 = i2;
                    arrayList = arrayList;
                    jx2Var = jx2Var;
                } else {
                    boolean z = vr1.z(materialCalendarGridView);
                    long jLongValue3 = item.longValue();
                    ArrayList arrayList2 = arrayList;
                    Calendar calendar = materialCalendarGridView.n;
                    if (jLongValue < jLongValue3) {
                        if (iMax % ix2Var.q == 0) {
                            right = 0;
                        } else {
                            right = !z ? materialCalendarGridView.b(iMax - 1).getRight() : materialCalendarGridView.b(iMax - 1).getLeft();
                        }
                        width = right;
                        iA = iMax;
                    } else {
                        calendar.setTimeInMillis(jLongValue);
                        iA = jx2Var.a() + (calendar.get(5) - 1);
                        View viewB = materialCalendarGridView.b(iA);
                        width = (viewB.getWidth() / 2) + viewB.getLeft();
                    }
                    if (jLongValue2 > item2.longValue()) {
                        if ((iMin + 1) % ix2Var.q == 0) {
                            width2 = materialCalendarGridView.getWidth();
                        } else {
                            width2 = !z ? materialCalendarGridView.b(iMin).getRight() : materialCalendarGridView.b(iMin).getLeft();
                        }
                        iA2 = iMin;
                    } else {
                        calendar.setTimeInMillis(jLongValue2);
                        iA2 = jx2Var.a() + (calendar.get(5) - 1);
                        View viewB2 = materialCalendarGridView.b(iA2);
                        width2 = (viewB2.getWidth() / 2) + viewB2.getLeft();
                    }
                    int i3 = width2;
                    ix2 ix2Var2 = ix2Var;
                    int itemId = (int) jx2Var.getItemId(iA);
                    int itemId2 = (int) jx2Var.getItemId(iA2);
                    int i4 = itemId;
                    while (i4 <= itemId2) {
                        jx2 jx2Var2 = jx2Var;
                        int numColumns = materialCalendarGridView.getNumColumns() * i4;
                        int i5 = itemId2;
                        int numColumns2 = (materialCalendarGridView.getNumColumns() + numColumns) - 1;
                        View viewB3 = materialCalendarGridView.b(numColumns);
                        int top = viewB3.getTop() + ((Rect) ((c6) eyVar.a).b).top;
                        int i6 = i4;
                        int bottom = viewB3.getBottom() - ((Rect) ((c6) eyVar.a).b).bottom;
                        if (z) {
                            int i7 = iA2 > numColumns2 ? 0 : i3;
                            width3 = numColumns > iA ? getWidth() : width;
                            i = i7;
                        } else {
                            i = numColumns > iA ? 0 : width;
                            width3 = iA2 > numColumns2 ? getWidth() : i3;
                        }
                        canvas.drawRect(i, top, width3, bottom, (Paint) eyVar.h);
                        i4 = i6 + 1;
                        materialCalendarGridView = this;
                        jx2Var = jx2Var2;
                        itemId2 = i5;
                    }
                    materialCalendarGridView = this;
                    ix2Var = ix2Var2;
                    i2 = i2;
                    arrayList = arrayList2;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((jx2) super.getAdapter()).c());
        } else if (i == 130) {
            setSelection(((jx2) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((jx2) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((jx2) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.o) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof jx2)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), jx2.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((jx2) super.getAdapter()).a()) {
            super.setSelection(((jx2) super.getAdapter()).a());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (jx2) super.getAdapter();
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }
}
