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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class FastScrollbar extends LinearLayout {
    public static final /* synthetic */ int t = 0;
    public TextView n;
    public View o;
    public RecyclerView p;
    public int q;
    public ObjectAnimator r;
    public final c61 s;

    public FastScrollbar(Context r1, AttributeSet r2, int r3) {
        super(r1, r2, r3);
        this.r = null;
        this.s = new c61(0, this);
        setOrientation(0);
        setClipChildren(false);
    }

    private void setBubbleAndHandlePosition(float r6) {
        int r0 = this.o.getHeight();
        View r1 = this.o;
        int r2 = this.q - r0;
        int r3 = r0 / 2;
        r1.setY(Math.min(Math.max(0, (int) (r6 - r3)), r2));
        TextView r4 = this.n;
        if (r4 == null) goto L6;
        int r5 = r4.getHeight();
        this.n.setY(Math.min(Math.max(0, (int) (r6 - r5)), (this.q - r5) - r3));
        return;
    }

    private void setRecyclerViewPosition(float r5) {
        RecyclerView r0 = this.p;
        if (r0 == null) goto L27;
        int r1 = r0.getAdapter().a();
        float r2 = 0.0f;
        if (this.o.getY() == 0.0f) goto L11;
        float r3 = this.o.getY() + this.o.getHeight();
        int r4 = this.q;
        if (r3 < (r4 - 5)) goto L10;
        r2 = 1.0f;
        goto L11
    L10:
        r2 = r5 / r4;
    L11:
        int r6 = Math.min(Math.max(0, (int) (r2 * r1)), r1 - 1);
        ((LinearLayoutManager) this.p.getLayoutManager()).f1(r6, 0);
        b03 r7 = (b03) this.p.getAdapter();
        List r8 = r7.r;
        if (r8 != null) goto L14;
    L16:
        String r9 = null;
    L17:
        TextView r10 = this.n;
        if (r10 == null) goto L28;
        r10.setText(r9);
        if (TextUtils.isEmpty(r9) == false) goto L24;
        a();
        return;
    L24:
        if (this.n.getVisibility() != 4) goto L29;
        b();
        return;
    L29:
        return;
    L28:
        return;
    L14:
        if (r8.isEmpty() == true) goto L16;
        String r11 = ((Artist) r7.r.get(r6)).getName().toUpperCase();
        Objects.requireNonNull(r11);
        r9 = Character.toString(r11.charAt(0));
        goto L17
    }

    public final void a() {
        if (this.n != null) goto L5;
        return;
    L5:
        ObjectAnimator r0 = this.r;
        if (r0 == null) goto L8;
        r0.cancel();
    L8:
        ObjectAnimator r1 = ObjectAnimator.ofFloat(this.n, "alpha", new float[]{1.0f, 0.0f}).setDuration(100);
        this.r = r1;
        r1.addListener(new l4(7, this));
        this.r.start();
    }

    public final void b() {
        TextView r0 = this.n;
        if (r0 != null) goto L5;
        return;
    L5:
        r0.setVisibility(0);
        ObjectAnimator r1 = this.r;
        if (r1 == null) goto L8;
        r1.cancel();
    L8:
        ObjectAnimator r2 = ObjectAnimator.ofFloat(this.n, "alpha", new float[]{0.0f, 1.0f}).setDuration(100);
        this.r = r2;
        r2.start();
    }

    public final void c() {
        if (this.n != null) goto L5;
        return;
    L5:
        if (this.o.isSelected() == true) goto L10;
        int r0 = this.p.computeVerticalScrollOffset();
        float r1 = this.p.computeVerticalScrollRange();
        int r2 = this.q;
        setBubbleAndHandlePosition(r2 * (r0 / (r1 - r2)));
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        RecyclerView r0 = this.p;
        if (r0 == null) goto L9;
        ArrayList r1 = r0.w0;
        if (r1 == null) goto L7;
        r1.remove(this.s);
    L7:
        this.p = null;
        return;
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        this.q = r2;
        c();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent r7) {
        int r0 = r7.getAction();
        if (r0 == 0) goto L13;
        if (r0 != 1) goto L6;
    L11:
        this.o.setSelected(false);
        a();
        return true;
    L6:
        if (r0 != 2) goto L8;
    L25:
        float r8 = r7.getY();
        setBubbleAndHandlePosition(r8);
        setRecyclerViewPosition(r8);
        return true;
    L8:
        if (r0 == 3) goto L11;
        return super.onTouchEvent(r7);
    L13:
        float r1 = r7.getX();
        float r3 = this.o.getX();
        View r4 = this.o;
        WeakHashMap r5 = j65.a;
        if (r1 >= (r3 - r4.getPaddingStart())) goto L16;
        return false;
    L16:
        ObjectAnimator r2 = this.r;
        if (r2 == null) goto L19;
        r2.cancel();
    L19:
        TextView r6 = this.n;
        if (r6 != null) goto L22;
    L24:
        this.o.setSelected(true);
        goto L25
    L22:
        if (r6.getVisibility() != 4) goto L24;
        b();
        goto L24
    }

    public void setRecyclerView(RecyclerView r3) {
        RecyclerView r0 = this.p;
        if (r0 == r3) goto L14;
        c61 r1 = this.s;
        if (r0 == null) goto L9;
        ArrayList r2 = r0.w0;
        if (r2 == null) goto L9;
        r2.remove(r1);
    L9:
        this.p = r3;
        if (r3 == null) goto L15;
        r3.j(r1);
        return;
    L15:
        return;
    }

    public FastScrollbar(Context r2) {
        super(r2);
        this.r = null;
        this.s = new c61(0, this);
        setOrientation(0);
        setClipChildren(false);
    }

    public FastScrollbar(Context r1, AttributeSet r2) {
        super(r1, r2);
        this.r = null;
        this.s = new c61(0, this);
        setOrientation(0);
        setClipChildren(false);
    }
}
