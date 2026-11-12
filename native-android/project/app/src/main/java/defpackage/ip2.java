package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.mediarouter.app.OverlayListView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ip2 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ boolean n;
    public final /* synthetic */ qp2 o;

    public ip2(qp2 r1, boolean r2) {
        this.o = r1;
        this.n = r2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        qp2 r1 = this.o;
        r1.G.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (r1.r0 == false) goto L6;
        r1.s0 = true;
        return;
    L6:
        wq2 r2 = r1.w;
        int r4 = r1.N.getLayoutParams().height;
        qp2.r(r1.N, -1);
        r1.x(r1.l());
        View r5 = r1.getWindow().getDecorView();
        r5.measure(View.MeasureSpec.makeMeasureSpec(r1.getWindow().getAttributes().width, 1073741824), 0);
        qp2.r(r1.N, r4);
        if ((r1.H.getDrawable() instanceof BitmapDrawable) == false) goto L15;
        Bitmap r6 = ((BitmapDrawable) r1.H.getDrawable()).getBitmap();
        if (r6 == null) goto L15;
        int r7 = r1.o(r6.getWidth(), r6.getHeight());
        ImageView r8 = r1.H;
        if (r6.getWidth() < r6.getHeight()) goto L13;
        ImageView.ScaleType r9 = ImageView.ScaleType.FIT_XY;
    L14:
        r8.setScaleType(r9);
    L16:
        int r10 = r1.p(r1.l());
        int r11 = r1.T.size();
        if (r1.q() == false) goto L19;
        int r12 = Collections.unmodifiableList(r2.v).size() * r1.b0;
    L20:
        if (r11 <= 0) goto L22;
        r12 = r12 + r1.d0;
    L22:
        int r13 = Math.min(r12, r1.c0);
        if (r1.q0 == true) goto L26;
        r13 = 0;
    L26:
        int r14 = Math.max(r7, r13) + r10;
        Rect r15 = new Rect();
        r5.getWindowVisibleDisplayFrame(r15);
        int r16 = r15.height() - (r1.F.getMeasuredHeight() - r1.G.getMeasuredHeight());
        if (r7 <= 0) goto L31;
        if (r14 > r16) goto L31;
        r1.H.setVisibility(0);
        qp2.r(r1.H, r7);
    L35:
        if (r1.l() == false) goto L38;
        if (r14 > r16) goto L38;
        r1.O.setVisibility(0);
    L40:
        if (r1.O.getVisibility() != 0) goto L42;
        boolean r17 = true;
    L43:
        r1.x(r17);
        if (r1.O.getVisibility() != 0) goto L46;
        boolean r18 = true;
    L47:
        int r19 = r1.p(r18);
        int r20 = Math.max(r7, r13) + r19;
        if (r20 <= r16) goto L50;
        r13 = r13 - (r20 - r16);
    L51:
        r1.N.clearAnimation();
        r1.R.clearAnimation();
        r1.G.clearAnimation();
        LinearLayout r21 = r1.N;
        boolean r0 = this.n;
        if (r0 == false) goto L54;
        r1.k(r21, r19);
        r1.k(r1.R, r13);
        r1.k(r1.G, r16);
    L55:
        qp2.r(r1.E, r15.height());
        List r3 = Collections.unmodifiableList(r2.v);
        boolean r22 = r3.isEmpty();
        ArrayList r23 = r1.T;
        if (r22 == false) goto L60;
        r23.clear();
        r1.S.notifyDataSetChanged();
        return;
    L60:
        if (new HashSet(r23).equals(new HashSet(r3)) == false) goto L63;
        r1.S.notifyDataSetChanged();
        return;
    L63:
        if (r0 == false) goto L68;
        OverlayListView r24 = r1.R;
        pp2 r25 = r1.S;
        HashMap r26 = new HashMap();
        int r27 = r24.getFirstVisiblePosition();
        int r110 = 0;
    L66:
        if (r110 >= r24.getChildCount()) goto L69;
        Object r111 = r25.getItem(r27 + r110);
        View r112 = r24.getChildAt(r110);
        r26.put(r111, new Rect(r112.getLeft(), r112.getTop(), r112.getRight(), r112.getBottom()));
        r110 = r110 + 1;
    L69:
        if (r0 == false) goto L74;
        Context r28 = r1.x;
        OverlayListView r29 = r1.R;
        pp2 r30 = r1.S;
        HashMap r31 = new HashMap();
        int r113 = r29.getFirstVisiblePosition();
        int r114 = 0;
    L72:
        if (r114 >= r29.getChildCount()) goto L75;
        Object r115 = r30.getItem(r113 + r114);
        View r116 = r29.getChildAt(r114);
        Bitmap r32 = Bitmap.createBitmap(r116.getWidth(), r116.getHeight(), Bitmap.Config.ARGB_8888);
        r116.draw(new Canvas(r32));
        r31.put(r115, new BitmapDrawable(r28.getResources(), r32));
        r114 = r114 + 1;
    L75:
        ArrayList r33 = r1.T;
        HashSet r34 = new HashSet(r3);
        r34.removeAll(r33);
        r1.U = r34;
        HashSet r35 = new HashSet(r1.T);
        r35.removeAll(r3);
        r1.V = r35;
        r1.T.addAll(0, r1.U);
        r1.T.removeAll(r1.V);
        r1.S.notifyDataSetChanged();
        if (r0 == true) goto L78;
    L83:
        r1.U = null;
        r1.V = null;
        return;
    L78:
        if (r1.q0 == false) goto L83;
        if ((r1.V.size() + r1.U.size()) <= 0) goto L83;
        r1.R.setEnabled(false);
        r1.R.requestLayout();
        r1.r0 = true;
        r1.R.getViewTreeObserver().addOnGlobalLayoutListener(new kp2(r1, r26, r31));
        return;
    L74:
        r31 = null;
        goto L75
    L68:
        r26 = null;
        goto L69
    L54:
        qp2.r(r21, r19);
        qp2.r(r1.R, r13);
        qp2.r(r1.G, r16);
        goto L55
    L50:
        r16 = r20;
        goto L51
    L46:
        r18 = false;
        goto L47
    L42:
        r17 = false;
    L38:
        r1.O.setVisibility(8);
    L31:
        if ((r1.N.getMeasuredHeight() + r1.R.getLayoutParams().height) < r1.G.getMeasuredHeight()) goto L33;
        r1.H.setVisibility(8);
    L33:
        r14 = r13 + r10;
        r7 = 0;
        goto L35
    L19:
        r12 = 0;
        goto L20
    L13:
        r9 = ImageView.ScaleType.FIT_CENTER;
    L15:
        r7 = 0;
        goto L16
    }
}
