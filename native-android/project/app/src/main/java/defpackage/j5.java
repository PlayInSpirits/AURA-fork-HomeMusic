package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j5 extends r23 {
    public Intent x;
    public String y;

    public static String g(Context r1, String r2) {
        if (r2 == null) goto L5;
        String r3 = r1.getPackageName();
        r3.getClass();
        return xm4.i0(r2, "${applicationId}", r3);
    L5:
        return null;
    }

    @Override // defpackage.r23
    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L23:
        return false;
    L8:
        if ((r5 instanceof j5) == false) goto L23;
        if (super.equals(r5) == false) goto L23;
        Intent r2 = this.x;
        if (r2 == null) goto L16;
        boolean r3 = r2.filterEquals(((j5) r5).x);
    L19:
        if (r3 == false) goto L23;
        if (h12.c(this.y, ((j5) r5).y) == false) goto L23;
        return true;
    L16:
        if (((j5) r5).x != null) goto L18;
        r3 = true;
        goto L19
    L18:
        r3 = false;
        goto L19
    }

    @Override // defpackage.r23
    public final void f(Context r4, AttributeSet r5) {
        super.f(r4, r5);
        TypedArray r6 = r4.getResources().obtainAttributes(r5, rt3.a);
        r6.getClass();
        String r0 = g(r4, r6.getString(4));
        if (this.x != null) goto L5;
        this.x = new Intent();
    L5:
        Intent r1 = this.x;
        r1.getClass();
        r1.setPackage(r0);
        String r2 = r6.getString(0);
        if (r2 != null) goto L8;
    L14:
        String r3 = r6.getString(1);
        if (this.x != null) goto L17;
        this.x = new Intent();
    L17:
        Intent r7 = this.x;
        r7.getClass();
        r7.setAction(r3);
        String r8 = g(r4, r6.getString(2));
        if (r8 == null) goto L23;
        Uri r9 = Uri.parse(r8);
        if (this.x != null) goto L22;
        this.x = new Intent();
    L22:
        Intent r10 = this.x;
        r10.getClass();
        r10.setData(r9);
    L23:
        this.y = g(r4, r6.getString(3));
        r6.recycle();
        return;
    L8:
        if (r2.charAt(0) != '.') goto L10;
        r2 = r4.getPackageName() + r2;
    L10:
        ComponentName r11 = new ComponentName(r4, r2);
        if (this.x != null) goto L13;
        this.x = new Intent();
    L13:
        Intent r12 = this.x;
        r12.getClass();
        r12.setComponent(r11);
        goto L14
    }

    @Override // defpackage.r23
    public final int hashCode() {
        int r0 = super.hashCode() * 31;
        Intent r1 = this.x;
        int r2 = 0;
        if (r1 == null) goto L5;
        int r3 = r1.filterHashCode();
    L6:
        int r4 = (r0 + r3) * 31;
        String r5 = this.y;
        if (r5 == null) goto L10;
        r2 = r5.hashCode();
    L10:
        return r4 + r2;
    L5:
        r3 = 0;
        goto L6
    }

    @Override // defpackage.r23
    public final String toString() {
        Intent r0 = this.x;
        String r1 = null;
        if (r0 == null) goto L5;
        ComponentName r2 = r0.getComponent();
    L6:
        StringBuilder r3 = new StringBuilder();
        r3.append(super.toString());
        if (r2 == null) goto L9;
        r3.append(" class=");
        r3.append(r2.getClassName());
    L15:
        return r3.toString();
    L9:
        Intent r4 = this.x;
        if (r4 == null) goto L12;
        r1 = r4.getAction();
    L12:
        if (r1 == null) goto L15;
        r3.append(" action=");
        r3.append(r1);
        goto L15
    L5:
        r2 = null;
        goto L6
    }
}
