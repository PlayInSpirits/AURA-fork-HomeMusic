package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yq implements Handler.Callback {
    public final /* synthetic */ int n;

    public /* synthetic */ yq(int r1) {
        this.n = r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message r9) {
        int r1 = 0;
        Object[] r2 = 0;
        Object[] r3 = 0;
        Object[] r4 = 0;
        Object[] r5 = 0;
        switch(this.n) {
            case 0: goto L9;
            default: goto L5;
        };
    L9:
        int r8 = r9.what;
        int r6 = 2;
        if (r8 == 0) goto L30;
        if (r8 != 1) goto L48;
        fr r10 = (fr) r9.obj;
        int r11 = r9.arg1;
        er r7 = r10.i;
        AccessibilityManager r12 = r10.u;
        if (r12 == null) goto L21;
        List<AccessibilityServiceInfo> r13 = r12.getEnabledAccessibilityServiceList(1);
        if (r13 != null) goto L19;
    L29:
        r10.c();
        return true;
    L19:
        if (r13.isEmpty() == false) goto L29;
    L21:
        if (r7.getVisibility() != 0) goto L29;
        if (r7.getAnimationMode() != 1) goto L25;
        ValueAnimator r14 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        r14.setInterpolator(r10.d);
        r14.addUpdateListener(new xq(r10, r5 == true ? 1 : 0, r4 == true ? 1 : 0));
        r14.setDuration(r10.b);
        r14.addListener(new wq(r10, r11, r3 == true ? 1 : 0));
        r14.start();
        return true;
    L25:
        ValueAnimator r15 = new ValueAnimator();
        er r16 = r10.i;
        int r17 = r16.getHeight();
        ViewGroup.LayoutParams r18 = r16.getLayoutParams();
        if ((r18 instanceof ViewGroup.MarginLayoutParams) == false) goto L28;
        r17 = r17 + ((ViewGroup.MarginLayoutParams) r18).bottomMargin;
    L28:
        r15.setIntValues(new int[]{0, r17});
        r15.setInterpolator(r10.e);
        r15.setDuration(r10.c);
        r15.addListener(new wq(r10, r11, r6));
        r15.addUpdateListener(new xq(r10, 3, r2 == true ? 1 : 0));
        r15.start();
        return true;
    L48:
        return false;
    L30:
        fr r19 = (fr) r9.obj;
        er r20 = r19.i;
        ViewGroup r21 = r19.g;
        if (r20.getParent() != null) goto L42;
        ViewGroup.LayoutParams r22 = r20.getLayoutParams();
        if ((r22 instanceof ge0) == false) goto L37;
        ge0 r23 = (ge0) r22;
        BaseTransientBottomBar$Behavior r24 = new BaseTransientBottomBar$Behavior();
        d34 r25 = r24.v;
        r25.getClass();
        r25.o = r19.v;
        r24.o = new zg5(r19);
        r23.b(r24);
        if (r19.b() != null) goto L37;
        r23.g = 80;
    L37:
        r20.x = true;
        r21.addView(r20);
        r20.x = false;
        if (r19.b() == null) goto L41;
        int[] r26 = new int[2];
        r19.b().getLocationOnScreen(r26);
        int r27 = r26[1];
        int[] r28 = new int[2];
        r21.getLocationOnScreen(r28);
        r1 = (r21.getHeight() + r28[1]) - r27;
    L41:
        r19.q = r1;
        r19.g();
        r20.setVisibility(4);
    L42:
        WeakHashMap r29 = j65.a;
        if (r20.isLaidOut() == false) goto L45;
        r19.f();
        return true;
    L45:
        r19.t = true;
        return true;
    L5:
        if (r9.what != 1) goto L8;
        ((q04) r9.obj).b();
        return true;
    L8:
        return false;
    }
}
