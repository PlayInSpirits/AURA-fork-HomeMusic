package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class mn1 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public mn1(int i, int i2, String str, String str2, String str3, String str4) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mn1.class == obj.getClass()) {
            mn1 mn1Var = (mn1) obj;
            if (this.a == mn1Var.a && this.b == mn1Var.b && TextUtils.equals(this.c, mn1Var.c) && TextUtils.equals(this.d, mn1Var.d) && TextUtils.equals(this.e, mn1Var.e) && TextUtils.equals(this.f, mn1Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        String str = this.c;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
