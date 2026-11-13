package defpackage;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class o10 extends q10 {
    public static final o10 p = new o10(0, "CharMatcher.any()");
    public static final o10 q = new o10(1, "CharMatcher.ascii()");
    public static final o10 r = new o10(2, "CharMatcher.javaIsoControl()");
    public static final o10 s = new o10(3, "CharMatcher.none()");
    public final String n;
    public final /* synthetic */ int o;

    public o10(int i, String str) {
        this.o = i;
        this.n = str;
    }

    @Override // defpackage.u10
    public final boolean c(char c) {
        switch (this.o) {
            case 0:
                return true;
            case 1:
                return c <= 127;
            case 2:
                return c <= 31 || (c >= 127 && c <= 159);
            default:
                return false;
        }
    }

    @Override // defpackage.q10, defpackage.u10
    public u10 d() {
        switch (this.o) {
            case 0:
                return s;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return p;
            default:
                return super.d();
        }
    }

    public final String toString() {
        return this.n;
    }
}
