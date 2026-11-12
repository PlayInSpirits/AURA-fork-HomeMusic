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

    public /* synthetic */ yq(int i) {
        this.n = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int height = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        switch (this.n) {
            case 0:
                int i = message.what;
                int i2 = 2;
                if (i != 0) {
                    if (i != 1) {
                        return false;
                    }
                    fr frVar = (fr) message.obj;
                    int i3 = message.arg1;
                    er erVar = frVar.i;
                    AccessibilityManager accessibilityManager = frVar.u;
                    if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || erVar.getVisibility() != 0) {
                        frVar.c();
                        return true;
                    }
                    if (erVar.getAnimationMode() == 1) {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        valueAnimatorOfFloat.setInterpolator(frVar.d);
                        valueAnimatorOfFloat.addUpdateListener(new xq(frVar, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0));
                        valueAnimatorOfFloat.setDuration(frVar.b);
                        valueAnimatorOfFloat.addListener(new wq(frVar, i3, objArr2 == true ? 1 : 0));
                        valueAnimatorOfFloat.start();
                        return true;
                    }
                    ValueAnimator valueAnimator = new ValueAnimator();
                    er erVar2 = frVar.i;
                    int height2 = erVar2.getHeight();
                    ViewGroup.LayoutParams layoutParams = erVar2.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        height2 += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    }
                    valueAnimator.setIntValues(0, height2);
                    valueAnimator.setInterpolator(frVar.e);
                    valueAnimator.setDuration(frVar.c);
                    valueAnimator.addListener(new wq(frVar, i3, i2));
                    valueAnimator.addUpdateListener(new xq(frVar, 3, objArr == true ? 1 : 0));
                    valueAnimator.start();
                    return true;
                }
                fr frVar2 = (fr) message.obj;
                er erVar3 = frVar2.i;
                ViewGroup viewGroup = frVar2.g;
                if (erVar3.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams2 = erVar3.getLayoutParams();
                    if (layoutParams2 instanceof ge0) {
                        ge0 ge0Var = (ge0) layoutParams2;
                        BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                        d34 d34Var = baseTransientBottomBar$Behavior.v;
                        d34Var.getClass();
                        d34Var.o = frVar2.v;
                        baseTransientBottomBar$Behavior.o = new zg5(frVar2);
                        ge0Var.b(baseTransientBottomBar$Behavior);
                        if (frVar2.b() == null) {
                            ge0Var.g = 80;
                        }
                    }
                    erVar3.x = true;
                    viewGroup.addView(erVar3);
                    erVar3.x = false;
                    if (frVar2.b() != null) {
                        int[] iArr = new int[2];
                        frVar2.b().getLocationOnScreen(iArr);
                        int i4 = iArr[1];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        height = (viewGroup.getHeight() + iArr2[1]) - i4;
                    }
                    frVar2.q = height;
                    frVar2.g();
                    erVar3.setVisibility(4);
                }
                WeakHashMap weakHashMap = j65.a;
                if (erVar3.isLaidOut()) {
                    frVar2.f();
                    return true;
                }
                frVar2.t = true;
                return true;
            default:
                if (message.what != 1) {
                    return false;
                }
                ((q04) message.obj).b();
                return true;
        }
    }
}
