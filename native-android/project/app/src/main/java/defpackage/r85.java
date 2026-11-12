package defpackage;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
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
        byte b = -1;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    b = 0;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    b = 1;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    b = 2;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    b = 3;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    b = 4;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b = 5;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b = 6;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    b = 7;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b = 8;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b = 9;
                }
                break;
        }
        String str2 = this.b;
        switch (b) {
            case 0:
                Integer numO = jz4.O(str2);
                if (numO != null) {
                    co2Var.o = numO;
                }
                break;
            case 1:
                Integer numO2 = jz4.O(str2);
                if (numO2 != null) {
                    co2Var.C = numO2;
                }
                break;
            case 2:
                Integer numO3 = jz4.O(str2);
                if (numO3 != null) {
                    co2Var.n = numO3;
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
                Integer numO4 = jz4.O(str2);
                if (numO4 != null) {
                    co2Var.B = numO4;
                }
                break;
            case 8:
                co2Var.d = str2;
                break;
            case 9:
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
