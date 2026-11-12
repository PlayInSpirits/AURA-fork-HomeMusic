package defpackage;

import android.transition.Transition;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bv2 {
    public static void a(PopupWindow r0, Transition r1) {
        r0.setEnterTransition(r1);
    }

    public static void b(PopupWindow r0, Transition r1) {
        r0.setExitTransition(r1);
    }
}
