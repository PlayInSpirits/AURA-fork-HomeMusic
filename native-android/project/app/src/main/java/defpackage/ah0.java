package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ah0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int n;
    public final Object o;

    public ah0(bh0 r2) {
        this.n = 0;
        this.o = new WeakReference(r2);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int r0 = this.n;
        int r6 = 0;
        Object r7 = this.o;
        switch(r0) {
            case 0: goto L36;
            case 1: goto L7;
            default: goto L4;
        };
    L4:
        ((CoordinatorLayout) r7).q(0);
        return true;
    L7:
        if (Log.isLoggable("ViewTarget", 2) == false) goto L9;
        Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
    L9:
        x75 r10 = (x75) ((WeakReference) r7).get();
        if (r10 == null) goto L34;
        ArrayList r1 = r10.b;
        View r3 = r10.a;
        if (r1.isEmpty() == true) goto L34;
        int r8 = r3.getPaddingRight() + r3.getPaddingLeft();
        ViewGroup.LayoutParams r4 = r3.getLayoutParams();
        if (r4 == null) goto L17;
        int r5 = r4.width;
    L18:
        int r9 = r10.a(r3.getWidth(), r5, r8);
        int r11 = r3.getPaddingBottom() + r3.getPaddingTop();
        ViewGroup.LayoutParams r12 = r3.getLayoutParams();
        if (r12 == null) goto L21;
        int r13 = r12.height;
    L22:
        int r14 = r10.a(r3.getHeight(), r13, r11);
        if (r9 > 0) goto L25;
        if (r9 != Integer.MIN_VALUE) goto L34;
    L25:
        if (r14 > 0) goto L27;
        if (r14 != Integer.MIN_VALUE) goto L34;
    L27:
        ArrayList r2 = new ArrayList(r1);
        int r15 = r2.size();
    L28:
        if (r6 >= r15) goto L30;
        Object r16 = r2.get(r6);
        r6 = r6 + 1;
        ((cf4) r16).m(r9, r14);
        goto L28
    L30:
        ViewTreeObserver r17 = r3.getViewTreeObserver();
        if (r17.isAlive() == false) goto L33;
        r17.removeOnPreDrawListener(r10.c);
    L33:
        r10.c = null;
        r1.clear();
        goto L34
    L21:
        r13 = 0;
        goto L22
    L17:
        r5 = 0;
    L34:
        return true;
    L36:
        if (Log.isLoggable("CustomViewTarget", 2) == false) goto L38;
        Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
    L38:
        bh0 r18 = (bh0) ((WeakReference) r7).get();
        if (r18 == null) goto L63;
        ArrayList r19 = r18.b;
        View r20 = r18.a;
        if (r19.isEmpty() == true) goto L63;
        int r21 = r20.getPaddingRight() + r20.getPaddingLeft();
        ViewGroup.LayoutParams r22 = r20.getLayoutParams();
        if (r22 == null) goto L46;
        int r23 = r22.width;
    L47:
        int r24 = r18.a(r20.getWidth(), r23, r21);
        int r25 = r20.getPaddingBottom() + r20.getPaddingTop();
        ViewGroup.LayoutParams r26 = r20.getLayoutParams();
        if (r26 == null) goto L50;
        int r27 = r26.height;
    L51:
        int r28 = r18.a(r20.getHeight(), r27, r25);
        if (r24 > 0) goto L54;
        if (r24 != Integer.MIN_VALUE) goto L63;
    L54:
        if (r28 > 0) goto L56;
        if (r28 != Integer.MIN_VALUE) goto L63;
    L56:
        ArrayList r29 = new ArrayList(r19);
        int r30 = r29.size();
    L57:
        if (r6 >= r30) goto L59;
        Object r31 = r29.get(r6);
        r6 = r6 + 1;
        ((cf4) r31).m(r24, r28);
        goto L57
    L59:
        ViewTreeObserver r32 = r20.getViewTreeObserver();
        if (r32.isAlive() == false) goto L62;
        r32.removeOnPreDrawListener(r18.c);
    L62:
        r18.c = null;
        r19.clear();
        goto L63
    L50:
        r27 = 0;
        goto L51
    L46:
        r23 = 0;
    L63:
        return true;
    }

    public ah0(x75 r2) {
        this.n = 1;
        this.o = new WeakReference(r2);
    }

    public ah0(CoordinatorLayout r2) {
        this.n = 2;
        this.o = r2;
    }
}
