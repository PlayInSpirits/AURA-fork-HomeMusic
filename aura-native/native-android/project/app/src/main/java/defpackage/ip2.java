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

    public ip2(qp2 qp2Var, boolean z) {
        this.o = qp2Var;
        this.n = z;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iO;
        HashMap map;
        HashMap map2;
        Bitmap bitmap;
        qp2 qp2Var = this.o;
        qp2Var.G.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (qp2Var.r0) {
            qp2Var.s0 = true;
            return;
        }
        wq2 wq2Var = qp2Var.w;
        int i = qp2Var.N.getLayoutParams().height;
        qp2.r(qp2Var.N, -1);
        qp2Var.x(qp2Var.l());
        View decorView = qp2Var.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(qp2Var.getWindow().getAttributes().width, 1073741824), 0);
        qp2.r(qp2Var.N, i);
        if (!(qp2Var.H.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) qp2Var.H.getDrawable()).getBitmap()) == null) {
            iO = 0;
        } else {
            iO = qp2Var.o(bitmap.getWidth(), bitmap.getHeight());
            qp2Var.H.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int iP = qp2Var.p(qp2Var.l());
        int size = qp2Var.T.size();
        int size2 = qp2Var.q() ? Collections.unmodifiableList(wq2Var.v).size() * qp2Var.b0 : 0;
        if (size > 0) {
            size2 += qp2Var.d0;
        }
        int iMin = Math.min(size2, qp2Var.c0);
        if (!qp2Var.q0) {
            iMin = 0;
        }
        int iMax = Math.max(iO, iMin) + iP;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height() - (qp2Var.F.getMeasuredHeight() - qp2Var.G.getMeasuredHeight());
        if (iO <= 0 || iMax > iHeight) {
            if (qp2Var.N.getMeasuredHeight() + qp2Var.R.getLayoutParams().height >= qp2Var.G.getMeasuredHeight()) {
                qp2Var.H.setVisibility(8);
            }
            iMax = iMin + iP;
            iO = 0;
        } else {
            qp2Var.H.setVisibility(0);
            qp2.r(qp2Var.H, iO);
        }
        if (!qp2Var.l() || iMax > iHeight) {
            qp2Var.O.setVisibility(8);
        } else {
            qp2Var.O.setVisibility(0);
        }
        qp2Var.x(qp2Var.O.getVisibility() == 0);
        int iP2 = qp2Var.p(qp2Var.O.getVisibility() == 0);
        int iMax2 = Math.max(iO, iMin) + iP2;
        if (iMax2 > iHeight) {
            iMin -= iMax2 - iHeight;
        } else {
            iHeight = iMax2;
        }
        qp2Var.N.clearAnimation();
        qp2Var.R.clearAnimation();
        qp2Var.G.clearAnimation();
        LinearLayout linearLayout = qp2Var.N;
        boolean z = this.n;
        if (z) {
            qp2Var.k(linearLayout, iP2);
            qp2Var.k(qp2Var.R, iMin);
            qp2Var.k(qp2Var.G, iHeight);
        } else {
            qp2.r(linearLayout, iP2);
            qp2.r(qp2Var.R, iMin);
            qp2.r(qp2Var.G, iHeight);
        }
        qp2.r(qp2Var.E, rect.height());
        List listUnmodifiableList = Collections.unmodifiableList(wq2Var.v);
        boolean zIsEmpty = listUnmodifiableList.isEmpty();
        ArrayList arrayList = qp2Var.T;
        if (zIsEmpty) {
            arrayList.clear();
            qp2Var.S.notifyDataSetChanged();
            return;
        }
        if (new HashSet(arrayList).equals(new HashSet(listUnmodifiableList))) {
            qp2Var.S.notifyDataSetChanged();
            return;
        }
        if (z) {
            OverlayListView overlayListView = qp2Var.R;
            pp2 pp2Var = qp2Var.S;
            map = new HashMap();
            int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
            for (int i2 = 0; i2 < overlayListView.getChildCount(); i2++) {
                Object item = pp2Var.getItem(firstVisiblePosition + i2);
                View childAt = overlayListView.getChildAt(i2);
                map.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
            }
        } else {
            map = null;
        }
        if (z) {
            Context context = qp2Var.x;
            OverlayListView overlayListView2 = qp2Var.R;
            pp2 pp2Var2 = qp2Var.S;
            map2 = new HashMap();
            int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
            for (int i3 = 0; i3 < overlayListView2.getChildCount(); i3++) {
                Object item2 = pp2Var2.getItem(firstVisiblePosition2 + i3);
                View childAt2 = overlayListView2.getChildAt(i3);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                childAt2.draw(new Canvas(bitmapCreateBitmap));
                map2.put(item2, new BitmapDrawable(context.getResources(), bitmapCreateBitmap));
            }
        } else {
            map2 = null;
        }
        ArrayList arrayList2 = qp2Var.T;
        HashSet hashSet = new HashSet(listUnmodifiableList);
        hashSet.removeAll(arrayList2);
        qp2Var.U = hashSet;
        HashSet hashSet2 = new HashSet(qp2Var.T);
        hashSet2.removeAll(listUnmodifiableList);
        qp2Var.V = hashSet2;
        qp2Var.T.addAll(0, qp2Var.U);
        qp2Var.T.removeAll(qp2Var.V);
        qp2Var.S.notifyDataSetChanged();
        if (z && qp2Var.q0) {
            if (qp2Var.V.size() + qp2Var.U.size() > 0) {
                qp2Var.R.setEnabled(false);
                qp2Var.R.requestLayout();
                qp2Var.r0 = true;
                qp2Var.R.getViewTreeObserver().addOnGlobalLayoutListener(new kp2(qp2Var, map, map2));
                return;
            }
        }
        qp2Var.U = null;
        qp2Var.V = null;
    }
}
