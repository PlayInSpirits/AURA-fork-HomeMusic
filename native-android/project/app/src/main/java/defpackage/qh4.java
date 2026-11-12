package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qh4 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public static rh4 a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = qh4.class.getClassLoader();
        }
        int i = parcel.readInt();
        if (i == 0) {
            return new rh4();
        }
        xf3 xf3VarF = og4.o.f();
        for (int i2 = 0; i2 < i; i2++) {
            xf3VarF.add(parcel.readValue(classLoader));
        }
        return new rh4(xf3VarF.d());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            case 1:
                return new vt(parcel, null);
            case 2:
                return new he0(parcel, null);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return new b51(parcel, null);
            case 4:
                return new fh2(parcel, null);
            case 5:
                return new r43(parcel, null);
            case 6:
                return new vw3(parcel, null);
            case 7:
                return new w74(parcel, null);
            case 8:
                return new rd4(parcel, null);
            default:
                return new bv4(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new rh4[i];
            case 1:
                return new vt[i];
            case 2:
                return new he0[i];
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return new b51[i];
            case 4:
                return new fh2[i];
            case 5:
                return new r43[i];
            case 6:
                return new vw3[i];
            case 7:
                return new w74[i];
            case 8:
                return new rd4[i];
            default:
                return new bv4[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                return new vt(parcel, classLoader);
            case 2:
                return new he0(parcel, classLoader);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return new b51(parcel, classLoader);
            case 4:
                return new fh2(parcel, classLoader);
            case 5:
                return new r43(parcel, classLoader);
            case 6:
                return new vw3(parcel, classLoader);
            case 7:
                return new w74(parcel, classLoader);
            case 8:
                return new rd4(parcel, classLoader);
            default:
                return new bv4(parcel, classLoader);
        }
    }
}
