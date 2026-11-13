package defpackage;

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class gd implements m65 {
    public final ViewConfiguration a;

    public gd(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.m65
    public final float b() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.m65
    public final float c() {
        return this.a.getScaledTouchSlop();
    }
}
