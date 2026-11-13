package com.eddyizm.tempus.helper.recyclerview;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.eddyizm.tempus.subsonic.models.Artist;
import defpackage.b03;
import defpackage.c61;
import defpackage.j65;
import defpackage.l4;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class FastScrollbar extends LinearLayout {
    public static final /* synthetic */ int t = 0;
    public TextView n;
    public View o;
    public RecyclerView p;
    public int q;
    public ObjectAnimator r;
    public final c61 s;

    public FastScrollbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.r = null;
        this.s = new c61(0, this);
        setOrientation(0);
        setClipChildren(false);
    }

    private void setBubbleAndHandlePosition(float f) {
        int height = this.o.getHeight();
        View view = this.o;
        int i = this.q - height;
        int i2 = height / 2;
        view.setY(Math.min(Math.max(0, (int) (f - i2)), i));
        TextView textView = this.n;
        if (textView != null) {
            int height2 = textView.getHeight();
            this.n.setY(Math.min(Math.max(0, (int) (f - height2)), (this.q - height2) - i2));
        }
    }

    private void setRecyclerViewPosition(float f) {
        String str;
        RecyclerView recyclerView = this.p;
        if (recyclerView != null) {
            int a = recyclerView.getAdapter().a();
            float f2 = 0.0f;
            if (this.o.getY() != 0.0f) {
                float y = this.o.getY() + this.o.getHeight();
                int i = this.q;
                f2 = y >= ((float) (i + (-5))) ? 1.0f : f / i;
            }
            int min = Math.min(Math.max(0, (int) (f2 * a)), a - 1);
            ((LinearLayoutManager) this.p.getLayoutManager()).f1(min, 0);
            b03 b03Var = (b03) this.p.getAdapter();
            List list = b03Var.r;
            if (list == null || list.isEmpty()) {
                str = null;
            } else {
                String upperCase = ((Artist) b03Var.r.get(min)).getName().toUpperCase();
                Objects.requireNonNull(upperCase);
                str = Character.toString(upperCase.charAt(0));
            }
            TextView textView = this.n;
            if (textView != null) {
                textView.setText(str);
                if (TextUtils.isEmpty(str)) {
                    a();
                } else if (this.n.getVisibility() == 4) {
                    b();
                }
            }
        }
    }

    public final void a() {
        if (this.n == null) {
            return;
        }
        ObjectAnimator objectAnimator = this.r;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.n, "alpha", 1.0f, 0.0f).setDuration(100L);
        this.r = duration;
        duration.addListener(new l4(7, this));
        this.r.start();
    }

    public final void b() {
        TextView textView = this.n;
        if (textView == null) {
            return;
        }
        textView.setVisibility(0);
        ObjectAnimator objectAnimator = this.r;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.n, "alpha", 0.0f, 1.0f).setDuration(100L);
        this.r = duration;
        duration.start();
    }

    public final void c() {
        if (this.n == null || this.o.isSelected()) {
            return;
        }
        int computeVerticalScrollOffset = this.p.computeVerticalScrollOffset();
        float computeVerticalScrollRange = this.p.computeVerticalScrollRange();
        int i = this.q;
        setBubbleAndHandlePosition(i * (computeVerticalScrollOffset / (computeVerticalScrollRange - i)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        RecyclerView recyclerView = this.p;
        if (recyclerView != null) {
            ArrayList arrayList = recyclerView.w0;
            if (arrayList != null) {
                arrayList.remove(this.s);
            }
            this.p = null;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.q = i2;
        c();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                }
            }
            this.o.setSelected(false);
            a();
            return true;
        }
        float x = motionEvent.getX();
        float x2 = this.o.getX();
        View view = this.o;
        WeakHashMap weakHashMap = j65.a;
        if (x < x2 - view.getPaddingStart()) {
            return false;
        }
        ObjectAnimator objectAnimator = this.r;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        TextView textView = this.n;
        if (textView != null && textView.getVisibility() == 4) {
            b();
        }
        this.o.setSelected(true);
        float y = motionEvent.getY();
        setBubbleAndHandlePosition(y);
        setRecyclerViewPosition(y);
        return true;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        ArrayList arrayList;
        RecyclerView recyclerView2 = this.p;
        if (recyclerView2 != recyclerView) {
            c61 c61Var = this.s;
            if (recyclerView2 != null && (arrayList = recyclerView2.w0) != null) {
                arrayList.remove(c61Var);
            }
            this.p = recyclerView;
            if (recyclerView == null) {
                return;
            }
            recyclerView.j(c61Var);
        }
    }

    public FastScrollbar(Context context) {
        super(context);
        this.r = null;
        this.s = new c61(0, this);
        setOrientation(0);
        setClipChildren(false);
    }

    public FastScrollbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r = null;
        this.s = new c61(0, this);
        setOrientation(0);
        setClipChildren(false);
    }
}
