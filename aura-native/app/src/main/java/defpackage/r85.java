package defpackage;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class r85 implements pv2 {
    public final String a;
    public final String b;

    public r85(String str, String str2) {
        this.a = rr2.V(str);
        this.b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.pv2
    public final void b(co2 co2Var) {
        String str = this.a;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c = 0;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c = 1;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c = 2;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 3;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c = 4;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 5;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 6;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c = 7;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = '\b';
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = '\t';
                    break;
                }
                break;
        }
        String str2 = this.b;
        switch (c) {
            case 0:
                Integer O = jz4.O(str2);
                if (O != null) {
                    co2Var.o = O;
                    break;
                }
                break;
            case 1:
                Integer O2 = jz4.O(str2);
                if (O2 != null) {
                    co2Var.C = O2;
                    break;
                }
                break;
            case 2:
                Integer O3 = jz4.O(str2);
                if (O3 != null) {
                    co2Var.n = O3;
                    break;
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                co2Var.c = str2;
                break;
            case 4:
                co2Var.D = str2;
                break;
            case 5:
                co2Var.a = str2;
                break;
            case 6:
                co2Var.g = str2;
                break;
            case 7:
                Integer O4 = jz4.O(str2);
                if (O4 != null) {
                    co2Var.B = O4;
                    break;
                }
                break;
            case '\b':
                co2Var.d = str2;
                break;
            case '\t':
                co2Var.b = str2;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r85.class == obj.getClass()) {
            r85 r85Var = (r85) obj;
            if (this.a.equals(r85Var.a) && this.b.equals(r85Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + f34.e(this.a, 527, 31);
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}
