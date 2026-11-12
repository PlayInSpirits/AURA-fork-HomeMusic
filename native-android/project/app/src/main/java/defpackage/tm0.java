package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tm0 extends b3 {
    public final boolean c;
    public boolean d;
    public xc5 e;

    public tm0(pj4 r1, gz r2, boolean r3) {
        super(r1, r2);
        this.c = r3;
    }

    public final xc5 o(Context r9) {
        if (this.d == true) goto L5;
        pj4 r0 = (pj4) this.a;
        kc1 r1 = r0.c;
        if (r0.a != 2) goto L9;
        boolean r2 = true;
    L10:
        hc1 r3 = r1.W;
        if (r3 != null) goto L13;
        int r5 = 0;
    L15:
        if (this.c == false) goto L23;
        if (r2 == false) goto L20;
        if (r3 != null) goto L19;
    L18:
        int r4 = 0;
    L30:
        r1.b0(0, 0, 0, 0);
        ViewGroup r6 = r1.S;
        xc5 r7 = null;
        if (r6 != null) goto L33;
    L35:
        ViewGroup r8 = r1.S;
        if (r8 != null) goto L38;
    L40:
        if (r4 != 0) goto L69;
        if (r5 == 0) goto L69;
        if (r5 != 4097) goto L45;
        if (r2 == false) goto L68;
        int r10 = R.animator.fragment_open_enter;
    L53:
        r4 = r10;
        goto L69
    L68:
        r10 = R.animator.fragment_open_exit;
        goto L53
    L45:
        if (r5 != 8194) goto L47;
        if (r2 == false) goto L65;
        r10 = R.animator.fragment_close_enter;
        goto L53
    L65:
        r10 = R.animator.fragment_close_exit;
        goto L53
    L47:
        if (r5 != 8197) goto L49;
        if (r2 == false) goto L62;
        r10 = bu.D(r9, android.R.attr.activityCloseEnterAnimation);
        goto L53
    L62:
        r10 = bu.D(r9, android.R.attr.activityCloseExitAnimation);
        goto L53
    L49:
        if (r5 != 4099) goto L51;
        if (r2 == false) goto L59;
        r10 = R.animator.fragment_fade_enter;
        goto L53
    L59:
        r10 = R.animator.fragment_fade_exit;
        goto L53
    L51:
        if (r5 == 4100) goto L54;
        r10 = -1;
        goto L53
    L54:
        if (r2 == false) goto L56;
        r10 = bu.D(r9, android.R.attr.activityOpenEnterAnimation);
        goto L53
    L56:
        r10 = bu.D(r9, android.R.attr.activityOpenExitAnimation);
    L69:
        if (r4 == 0) goto L88;
        boolean r11 = "anim".equals(r9.getResources().getResourceTypeName(r4));
        if (r11 == true) goto L93;
    L91:
        Animator r12 = AnimatorInflater.loadAnimator(r9, r4);     // Catch: RuntimeException -> L82
        if (r12 == null) goto L88;
        xc5 r13 = new xc5(r12);     // Catch: RuntimeException -> L82
    L75:
        r7 = r13;
    L82:
        e = move-exception;
        if (r11 == true) goto L87;
        Animation r14 = AnimationUtils.loadAnimation(r9, r4);
        if (r14 == null) goto L88;
        r7 = new xc5(r14);
        goto L88
    L87:
        throw e;
    L93:
        Animation r15 = AnimationUtils.loadAnimation(r9, r4);     // Catch: Resources.NotFoundException -> L76 RuntimeException -> L90
        if (r15 == null) goto L88;
        r13 = new xc5(r15);     // Catch: Resources.NotFoundException -> L76 RuntimeException -> L90
    L76:
        e = move-exception;
        throw e;
    L88:
        this.e = r7;
        this.d = true;
        return r7;
    L38:
        if (r8.getLayoutTransition() == null) goto L40;
    L33:
        if (r6.getTag(R.id.visible_removing_fragment_view_tag) == null) goto L35;
        r1.S.setTag(R.id.visible_removing_fragment_view_tag, null);
        goto L35
    L19:
        r4 = r3.d;
        goto L30
    L20:
        if (r3 == null) goto L18;
        r4 = r3.e;
        goto L30
    L23:
        if (r2 == false) goto L27;
        if (r3 == null) goto L18;
        r4 = r3.b;
        goto L30
    L27:
        if (r3 == null) goto L18;
        r4 = r3.c;
        goto L30
    L13:
        r5 = r3.f;
        goto L15
    L9:
        r2 = false;
        goto L10
    L5:
        return this.e;
    }
}
