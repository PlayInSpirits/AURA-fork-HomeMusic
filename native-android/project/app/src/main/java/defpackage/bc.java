package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import app.homemusic.R;
import com.google.android.material.search.SearchBar;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bc implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ bc(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    private final void a(View r1) {
    }

    private final void b(View r1) {
    }

    private final void c(View r1) {
    }

    private final void d(View r1) {
    }

    private final void e(View r1) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r3) {
        int r0 = this.n;
        Object r1 = this.o;
        switch(r0) {
            case 0: goto L18;
            case 1: goto L22;
            case 2: goto L11;
            case 3: goto L9;
            case 4: goto L7;
            case 5: goto L5;
            case 6: goto L4;
            case 7: goto L4;
            default: goto L4;
        };
    L4:
        return;
    L5:
        SearchBar r2 = (SearchBar) r1;
        r2.x0.addTouchExplorationStateChangeListener(new h3(r2.y0));
        return;
    L7:
        r3.getClass();
        lt1 r4 = (lt1) r1;
        n61.f.addIfAbsent(r4);
        r4.run();
        return;
    L9:
        View r5 = (View) r1;
        r5.removeOnAttachStateChangeListener(this);
        WeakHashMap r6 = j65.a;
        r5.requestApplyInsets();
        return;
    L11:
        g11 r7 = (g11) r1;
        AccessibilityManager r8 = r7.G;
        if (r7.H == null) goto L23;
        if (r8 == null) goto L24;
        WeakHashMap r9 = j65.a;
        if (r7.isAttachedToWindow() == false) goto L25;
        r8.addTouchExplorationStateChangeListener(new h3(r7.H));
        return;
    L25:
        return;
    L24:
        return;
    L23:
        return;
    L18:
        jw r10 = (jw) r1;
        Context r11 = r3.getContext();
        if (r10.n == true) goto L26;
        r11.getApplicationContext().registerComponentCallbacks((ac) r10.r);
        r10.n = true;
        return;
    L26:
        return;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r5) {
        int r0 = this.n;
        Object r3 = this.o;
        switch(r0) {
            case 0: goto L48;
            case 1: goto L40;
            case 2: goto L34;
            case 3: goto L59;
            case 4: goto L32;
            case 5: goto L30;
            case 6: goto L22;
            case 7: goto L6;
            default: goto L4;
        };
    L4:
        r5.removeOnAttachStateChangeListener(this);
        ((sk4) r3).f(null);
        return;
    L6:
        b0 r4 = (b0) r3;
        Iterator r6 = fa4.c0(s65.n, r4.getParent()).iterator();
    L8:
        if (r6.hasNext() == false) goto L20;
        Object r7 = (ViewParent) r6.next();
        if ((r7 instanceof View) == false) goto L8;
        View r8 = (View) r7;
        r8.getClass();
        Object r9 = r8.getTag(R.id.is_pooling_container_tag);
        if ((r9 instanceof Boolean) == false) goto L14;
        Boolean r10 = (Boolean) r9;
    L15:
        if (r10 == null) goto L17;
        boolean r11 = r10.booleanValue();
    L18:
        if (r11 == false) goto L8;
        return;
    L17:
        r11 = false;
        goto L18
    L14:
        r10 = null;
        goto L15
    L20:
        r4.d();
        return;
    L22:
        wk4 r12 = (wk4) r3;
        ViewTreeObserver r1 = r12.B;
        if (r1 != null) goto L25;
    L28:
        r5.removeOnAttachStateChangeListener(this);
        return;
    L25:
        if (r1.isAlive() == true) goto L27;
        r12.B = r5.getViewTreeObserver();
    L27:
        r12.B.removeGlobalOnLayoutListener(r12.v);
        goto L28
    L30:
        SearchBar r13 = (SearchBar) r3;
        r13.x0.removeTouchExplorationStateChangeListener(new h3(r13.y0));
        return;
    L32:
        r5.getClass();
        n61.f.remove((lt1) r3);
        return;
    L34:
        g11 r14 = (g11) r3;
        g3 r15 = r14.H;
        if (r15 == null) goto L60;
        AccessibilityManager r16 = r14.G;
        if (r16 == null) goto L61;
        r16.removeTouchExplorationStateChangeListener(new h3(r15));
        return;
    L61:
        return;
    L60:
        return;
    L40:
        uz r17 = (uz) r3;
        ViewTreeObserver r2 = r17.K;
        if (r2 != null) goto L43;
    L46:
        r5.removeOnAttachStateChangeListener(this);
        return;
    L43:
        if (r2.isAlive() == true) goto L45;
        r17.K = r5.getViewTreeObserver();
    L45:
        r17.K.removeGlobalOnLayoutListener(r17.v);
        goto L46
    L48:
        jw r18 = (jw) r3;
        Context r19 = r5.getContext();
        if (r18.n == false) goto L62;
        r19.getApplicationContext().unregisterComponentCallbacks((ac) r18.r);
        r18.n = false;
        return;
    L62:
        return;
    }
}
