package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yd3 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ yd3(int i) {
        this.a = i;
    }

    public static zd3 a(Parcel parcel, ClassLoader classLoader) {
        rv2 rv2Var;
        if (classLoader == null) {
            classLoader = yd3.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            rv2Var = rv2.s;
        } else if (i == 1) {
            rv2Var = rv2.D;
        } else {
            if (i != 2) {
                kf2.o(b11.j(i, "Unsupported MutableState policy ", " was restored"));
                return null;
            }
            rv2Var = rv2.A;
        }
        return new zd3(value, rv2Var);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return k.o;
                }
                kf2.o("superState must be null");
                return null;
            case 2:
                return new z10(parcel, null);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return new iw0(parcel, null);
            case 4:
                return new jc1(parcel, null);
            case 5:
                return new r33(parcel, null);
            case 6:
                return new ae3(parcel, null);
            case 7:
                return new j74(parcel, null);
            case 8:
                return new x74(parcel, null);
            case 9:
                return new hs4(parcel, null);
            default:
                q75 q75Var = new q75(parcel, null);
                q75Var.n = parcel.readInt();
                q75Var.o = parcel.readInt();
                q75Var.p = parcel.readParcelable(null);
                return q75Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new zd3[i];
            case 1:
                return new k[i];
            case 2:
                return new z10[i];
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return new iw0[i];
            case 4:
                return new jc1[i];
            case 5:
                return new r33[i];
            case 6:
                return new ae3[i];
            case 7:
                return new j74[i];
            case 8:
                return new x74[i];
            case 9:
                return new hs4[i];
            default:
                return new q75[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return k.o;
                }
                kf2.o("superState must be null");
                return null;
            case 2:
                return new z10(parcel, classLoader);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return new iw0(parcel, classLoader);
            case 4:
                return new jc1(parcel, classLoader);
            case 5:
                return new r33(parcel, classLoader);
            case 6:
                return new ae3(parcel, classLoader);
            case 7:
                return new j74(parcel, classLoader);
            case 8:
                return new x74(parcel, classLoader);
            case 9:
                return new hs4(parcel, classLoader);
            default:
                q75 q75Var = new q75(parcel, classLoader);
                q75Var.n = parcel.readInt();
                q75Var.o = parcel.readInt();
                q75Var.p = parcel.readParcelable(classLoader);
                return q75Var;
        }
    }
}
