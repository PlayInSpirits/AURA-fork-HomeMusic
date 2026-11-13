package defpackage;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class wd1 implements a83, fg1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ if1 b;

    public /* synthetic */ wd1(if1 if1Var, int i) {
        this.a = i;
        this.b = if1Var;
    }

    @Override // defpackage.fg1
    public final sf1 a() {
        int i = this.a;
        if1 if1Var = this.b;
        switch (i) {
            case 0:
                return (ud1) if1Var;
            case 1:
                return (o) if1Var;
            case 2:
                return (x) if1Var;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return (o) if1Var;
            case 4:
                return (zr1) if1Var;
            case 5:
                return (x) if1Var;
            default:
                return (o) if1Var;
        }
    }

    @Override // defpackage.a83
    public final /* synthetic */ void b(Object obj) {
        int i = this.a;
        if1 if1Var = this.b;
        switch (i) {
            case 0:
                ((ud1) if1Var).invoke(obj);
                break;
            case 1:
                ((o) if1Var).invoke(obj);
                break;
            case 2:
                ((x) if1Var).invoke(obj);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ((o) if1Var).invoke(obj);
                break;
            case 4:
                ((zr1) if1Var).invoke(obj);
                break;
            case 5:
                ((x) if1Var).invoke(obj);
                break;
            default:
                ((o) if1Var).invoke(obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        int i = this.a;
        if1 if1Var = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof a83) || !(obj instanceof fg1) || ((ud1) if1Var) != ((fg1) obj).a()) {
                    break;
                }
                break;
            case 1:
                if (!(obj instanceof a83) || !(obj instanceof fg1) || ((o) if1Var) != ((fg1) obj).a()) {
                    break;
                }
                break;
            case 2:
                if (!(obj instanceof a83) || !(obj instanceof fg1) || ((x) if1Var) != ((fg1) obj).a()) {
                    break;
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                if (!(obj instanceof a83) || !(obj instanceof fg1) || ((o) if1Var) != ((fg1) obj).a()) {
                    break;
                }
                break;
            case 4:
                if (!(obj instanceof a83) || !(obj instanceof fg1) || ((zr1) if1Var) != ((fg1) obj).a()) {
                    break;
                }
                break;
            case 5:
                if (!(obj instanceof a83) || !(obj instanceof fg1) || ((x) if1Var) != ((fg1) obj).a()) {
                    break;
                }
                break;
            default:
                if (!(obj instanceof a83) || !(obj instanceof fg1) || ((o) if1Var) != ((fg1) obj).a()) {
                    break;
                }
                break;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        if1 if1Var = this.b;
        switch (i) {
            case 0:
                return ((ud1) if1Var).hashCode();
            case 1:
                return ((o) if1Var).hashCode();
            case 2:
                return ((x) if1Var).hashCode();
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return ((o) if1Var).hashCode();
            case 4:
                return ((zr1) if1Var).hashCode();
            case 5:
                return ((x) if1Var).hashCode();
            default:
                return ((o) if1Var).hashCode();
        }
    }
}
