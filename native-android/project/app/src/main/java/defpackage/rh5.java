package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException;
import com.google.android.gms.fido.fido2.api.common.ErrorCode$UnsupportedErrorCodeException;
import java.util.ArrayList;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rh5 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ rh5(int i) {
        this.a = i;
    }

    public static void a(sh1 sh1Var, Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        int i2 = sh1Var.n;
        ud3.T0(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = sh1Var.o;
        ud3.T0(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = sh1Var.p;
        ud3.T0(parcel, 3, 4);
        parcel.writeInt(i4);
        ud3.O0(parcel, 4, sh1Var.q);
        IBinder iBinder = sh1Var.r;
        if (iBinder != null) {
            int iR1 = ud3.R0(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            ud3.S0(parcel, iR1);
        }
        ud3.P0(parcel, 6, sh1Var.s, i);
        ud3.K0(parcel, 7, sh1Var.t);
        ud3.M0(parcel, 8, sh1Var.u, i);
        ud3.P0(parcel, 10, sh1Var.v, i);
        ud3.P0(parcel, 11, sh1Var.w, i);
        boolean z = sh1Var.x;
        ud3.T0(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = sh1Var.y;
        ud3.T0(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = sh1Var.z;
        ud3.T0(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        ud3.O0(parcel, 15, sh1Var.A);
        ud3.S0(parcel, iR0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        boolean zV = false;
        boolean zV2 = false;
        int iW4 = 0;
        String strX = null;
        String strX2 = null;
        ArrayList arrayListZ = null;
        String strX3 = null;
        Bundle bundleU = null;
        switch (this.a) {
            case 0:
                int iP0 = l93.p0(parcel);
                short s = 0;
                short s2 = 0;
                while (parcel.dataPosition() < iP0) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iW = l93.W(parcel, i);
                    } else if (c == 2) {
                        l93.t0(parcel, i, 4);
                        s = (short) parcel.readInt();
                    } else if (c != 3) {
                        l93.m0(parcel, i);
                    } else {
                        l93.t0(parcel, i, 4);
                        s2 = (short) parcel.readInt();
                    }
                }
                l93.H(parcel, iP0);
                return new h35(iW, s, s2);
            case 1:
                int iP1 = l93.p0(parcel);
                g35 g35Var = null;
                zi5 zi5Var = null;
                in inVar = null;
                sj5 sj5Var = null;
                String strX4 = null;
                while (parcel.dataPosition() < iP1) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        g35Var = (g35) l93.w(parcel, i2, g35.CREATOR);
                    } else if (c2 == 2) {
                        zi5Var = (zi5) l93.w(parcel, i2, zi5.CREATOR);
                    } else if (c2 == 3) {
                        inVar = (in) l93.w(parcel, i2, in.CREATOR);
                    } else if (c2 == 4) {
                        sj5Var = (sj5) l93.w(parcel, i2, sj5.CREATOR);
                    } else if (c2 != 5) {
                        l93.m0(parcel, i2);
                    } else {
                        strX4 = l93.x(parcel, i2);
                    }
                }
                l93.H(parcel, iP1);
                return new hn(g35Var, zi5Var, inVar, sj5Var, strX4);
            case 2:
                int iP2 = l93.p0(parcel);
                long jX = -1;
                while (parcel.dataPosition() < iP2) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 1) {
                        strX = l93.x(parcel, i3);
                    } else if (c3 == 2) {
                        iW4 = l93.W(parcel, i3);
                    } else if (c3 != 3) {
                        l93.m0(parcel, i3);
                    } else {
                        jX = l93.X(parcel, i3);
                    }
                }
                l93.H(parcel, iP2);
                return new p61(iW4, jX, strX);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                int iP3 = l93.p0(parcel);
                s61 s61Var = null;
                rk5 rk5Var = null;
                y25 y25Var = null;
                wk5 wk5Var = null;
                gh5 gh5Var = null;
                hh5 hh5Var = null;
                uk5 uk5Var = null;
                kh5 kh5Var = null;
                pj1 pj1Var = null;
                mh5 mh5Var = null;
                nh5 nh5Var = null;
                lh5 lh5Var = null;
                while (parcel.dataPosition() < iP3) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 2:
                            s61Var = (s61) l93.w(parcel, i4, s61.CREATOR);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            rk5Var = (rk5) l93.w(parcel, i4, rk5.CREATOR);
                            break;
                        case 4:
                            y25Var = (y25) l93.w(parcel, i4, y25.CREATOR);
                            break;
                        case 5:
                            wk5Var = (wk5) l93.w(parcel, i4, wk5.CREATOR);
                            break;
                        case 6:
                            gh5Var = (gh5) l93.w(parcel, i4, gh5.CREATOR);
                            break;
                        case 7:
                            hh5Var = (hh5) l93.w(parcel, i4, hh5.CREATOR);
                            break;
                        case '\b':
                            uk5Var = (uk5) l93.w(parcel, i4, uk5.CREATOR);
                            break;
                        case '\t':
                            kh5Var = (kh5) l93.w(parcel, i4, kh5.CREATOR);
                            break;
                        case '\n':
                            pj1Var = (pj1) l93.w(parcel, i4, pj1.CREATOR);
                            break;
                        case 11:
                            mh5Var = (mh5) l93.w(parcel, i4, mh5.CREATOR);
                            break;
                        case '\f':
                            nh5Var = (nh5) l93.w(parcel, i4, nh5.CREATOR);
                            break;
                        case '\r':
                            lh5Var = (lh5) l93.w(parcel, i4, lh5.CREATOR);
                            break;
                        default:
                            l93.m0(parcel, i4);
                            break;
                    }
                }
                l93.H(parcel, iP3);
                return new gn(s61Var, rk5Var, y25Var, wk5Var, gh5Var, hh5Var, uk5Var, kh5Var, pj1Var, mh5Var, nh5Var, lh5Var);
            case 4:
                int iP4 = l93.p0(parcel);
                while (parcel.dataPosition() < iP4) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 1) {
                        l93.m0(parcel, i5);
                    } else {
                        zV2 = l93.V(parcel, i5);
                    }
                }
                l93.H(parcel, iP4);
                return new in(zV2);
            case 5:
                int iP5 = l93.p0(parcel);
                byte[] bArrV = null;
                byte[] bArrV2 = null;
                while (parcel.dataPosition() < iP5) {
                    int i6 = parcel.readInt();
                    char c4 = (char) i6;
                    if (c4 == 1) {
                        bArrV = l93.v(parcel, i6);
                    } else if (c4 != 2) {
                        l93.m0(parcel, i6);
                    } else {
                        bArrV2 = l93.v(parcel, i6);
                    }
                }
                l93.H(parcel, iP5);
                return new zi5(bArrV == null ? null : rj5.i(bArrV.length, bArrV), bArrV2 != null ? rj5.i(bArrV2.length, bArrV2) : null);
            case 6:
                int iP6 = l93.p0(parcel);
                byte[] bArrV3 = null;
                while (parcel.dataPosition() < iP6) {
                    int i7 = parcel.readInt();
                    char c5 = (char) i7;
                    if (c5 == 1) {
                        zV = l93.V(parcel, i7);
                    } else if (c5 != 2) {
                        l93.m0(parcel, i7);
                    } else {
                        bArrV3 = l93.v(parcel, i7);
                    }
                }
                l93.H(parcel, iP6);
                return new sj5(zV, bArrV3 != null ? rj5.i(bArrV3.length, bArrV3) : null);
            case 7:
                int iP7 = l93.p0(parcel);
                byte[] bArrV4 = null;
                byte[] bArrV5 = null;
                byte[] bArrV6 = null;
                byte[] bArrV7 = null;
                byte[] bArrV8 = null;
                while (parcel.dataPosition() < iP7) {
                    int i8 = parcel.readInt();
                    char c6 = (char) i8;
                    if (c6 == 2) {
                        bArrV4 = l93.v(parcel, i8);
                    } else if (c6 == 3) {
                        bArrV5 = l93.v(parcel, i8);
                    } else if (c6 == 4) {
                        bArrV6 = l93.v(parcel, i8);
                    } else if (c6 == 5) {
                        bArrV7 = l93.v(parcel, i8);
                    } else if (c6 != 6) {
                        l93.m0(parcel, i8);
                    } else {
                        bArrV8 = l93.v(parcel, i8);
                    }
                }
                l93.H(parcel, iP7);
                return new jn(bArrV4, bArrV5, bArrV6, bArrV7, bArrV8);
            case 8:
                int iP8 = l93.p0(parcel);
                byte[] bArrV9 = null;
                byte[] bArrV10 = null;
                byte[] bArrV11 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < iP8) {
                    int i9 = parcel.readInt();
                    char c7 = (char) i9;
                    if (c7 == 2) {
                        bArrV9 = l93.v(parcel, i9);
                    } else if (c7 == 3) {
                        bArrV10 = l93.v(parcel, i9);
                    } else if (c7 == 4) {
                        bArrV11 = l93.v(parcel, i9);
                    } else if (c7 != 5) {
                        l93.m0(parcel, i9);
                    } else {
                        int iZ = l93.Z(parcel, i9);
                        int iDataPosition = parcel.dataPosition();
                        if (iZ == 0) {
                            strArr = null;
                        } else {
                            String[] strArrCreateStringArray = parcel.createStringArray();
                            parcel.setDataPosition(iDataPosition + iZ);
                            strArr = strArrCreateStringArray;
                        }
                    }
                }
                l93.H(parcel, iP8);
                return new kn(bArrV9, bArrV10, bArrV11, strArr);
            case 9:
                int iP9 = l93.p0(parcel);
                p61[] p61VarArr = null;
                pa0 pa0Var = null;
                while (parcel.dataPosition() < iP9) {
                    int i10 = parcel.readInt();
                    char c8 = (char) i10;
                    if (c8 == 1) {
                        bundleU = l93.u(parcel, i10);
                    } else if (c8 == 2) {
                        p61VarArr = (p61[]) l93.y(parcel, i10, p61.CREATOR);
                    } else if (c8 == 3) {
                        iW3 = l93.W(parcel, i10);
                    } else if (c8 != 4) {
                        l93.m0(parcel, i10);
                    } else {
                        pa0Var = (pa0) l93.w(parcel, i10, pa0.CREATOR);
                    }
                }
                l93.H(parcel, iP9);
                jk5 jk5Var = new jk5();
                jk5Var.n = bundleU;
                jk5Var.o = p61VarArr;
                jk5Var.p = iW3;
                jk5Var.q = pa0Var;
                return jk5Var;
            case 10:
                int iP10 = l93.p0(parcel);
                int iW5 = 0;
                while (parcel.dataPosition() < iP10) {
                    int i11 = parcel.readInt();
                    char c9 = (char) i11;
                    if (c9 == 2) {
                        iW2 = l93.W(parcel, i11);
                    } else if (c9 == 3) {
                        strX3 = l93.x(parcel, i11);
                    } else if (c9 != 4) {
                        l93.m0(parcel, i11);
                    } else {
                        iW5 = l93.W(parcel, i11);
                    }
                }
                l93.H(parcel, iP10);
                return new ln(strX3, iW2, iW5);
            case 11:
                int iP11 = l93.p0(parcel);
                boolean zV3 = false;
                boolean zV4 = false;
                int iW6 = 0;
                e34 e34Var = null;
                int[] iArr = null;
                int[] iArr2 = null;
                while (parcel.dataPosition() < iP11) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            e34Var = (e34) l93.w(parcel, i12, e34.CREATOR);
                            break;
                        case 2:
                            zV3 = l93.V(parcel, i12);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            zV4 = l93.V(parcel, i12);
                            break;
                        case 4:
                            int iZ2 = l93.Z(parcel, i12);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iZ2 != 0) {
                                int[] iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition2 + iZ2);
                                iArr = iArrCreateIntArray;
                            } else {
                                iArr = null;
                            }
                            break;
                        case 5:
                            iW6 = l93.W(parcel, i12);
                            break;
                        case 6:
                            int iZ3 = l93.Z(parcel, i12);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iZ3 != 0) {
                                int[] iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition3 + iZ3);
                                iArr2 = iArrCreateIntArray2;
                            } else {
                                iArr2 = null;
                            }
                            break;
                        default:
                            l93.m0(parcel, i12);
                            break;
                    }
                }
                l93.H(parcel, iP11);
                return new pa0(e34Var, zV3, zV4, iArr, iW6, iArr2);
            case 12:
                int iP12 = l93.p0(parcel);
                String strX5 = null;
                Boolean boolValueOf = null;
                String strX6 = null;
                String strX7 = null;
                while (parcel.dataPosition() < iP12) {
                    int i13 = parcel.readInt();
                    char c10 = (char) i13;
                    if (c10 == 2) {
                        strX5 = l93.x(parcel, i13);
                    } else if (c10 == 3) {
                        int iZ4 = l93.Z(parcel, i13);
                        if (iZ4 == 0) {
                            boolValueOf = null;
                        } else {
                            l93.s0(parcel, iZ4, 4);
                            boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                        }
                    } else if (c10 == 4) {
                        strX6 = l93.x(parcel, i13);
                    } else if (c10 != 5) {
                        l93.m0(parcel, i13);
                    } else {
                        strX7 = l93.x(parcel, i13);
                    }
                }
                l93.H(parcel, iP12);
                return new nn(strX5, boolValueOf, strX6, strX7);
            case 13:
                int iP13 = l93.p0(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = sh1.B;
                int iW7 = 0;
                int iW8 = 0;
                int iW9 = 0;
                boolean zV5 = false;
                int iW10 = 0;
                boolean zV6 = false;
                p61[] p61VarArr2 = sh1.C;
                p61[] p61VarArr3 = p61VarArr2;
                String strX8 = null;
                IBinder iBinder = null;
                Account account = null;
                String strX9 = null;
                while (parcel.dataPosition() < iP13) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            iW7 = l93.W(parcel, i14);
                            break;
                        case 2:
                            iW8 = l93.W(parcel, i14);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            iW9 = l93.W(parcel, i14);
                            break;
                        case 4:
                            strX8 = l93.x(parcel, i14);
                            break;
                        case 5:
                            int iZ5 = l93.Z(parcel, i14);
                            int iDataPosition4 = parcel.dataPosition();
                            if (iZ5 != 0) {
                                IBinder strongBinder = parcel.readStrongBinder();
                                parcel.setDataPosition(iDataPosition4 + iZ5);
                                iBinder = strongBinder;
                            } else {
                                iBinder = null;
                            }
                            break;
                        case 6:
                            scopeArr = (Scope[]) l93.y(parcel, i14, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = l93.u(parcel, i14);
                            break;
                        case '\b':
                            account = (Account) l93.w(parcel, i14, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            l93.m0(parcel, i14);
                            break;
                        case '\n':
                            p61VarArr2 = (p61[]) l93.y(parcel, i14, p61.CREATOR);
                            break;
                        case 11:
                            p61VarArr3 = (p61[]) l93.y(parcel, i14, p61.CREATOR);
                            break;
                        case '\f':
                            zV5 = l93.V(parcel, i14);
                            break;
                        case '\r':
                            iW10 = l93.W(parcel, i14);
                            break;
                        case 14:
                            zV6 = l93.V(parcel, i14);
                            break;
                        case 15:
                            strX9 = l93.x(parcel, i14);
                            break;
                    }
                }
                l93.H(parcel, iP13);
                return new sh1(iW7, iW8, iW9, strX8, iBinder, scopeArr, bundle, account, p61VarArr2, p61VarArr3, zV5, iW10, zV6, strX9);
            case 14:
                try {
                    return bx.a(parcel.readInt());
                } catch (COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException e) {
                    er1.m(e);
                    return null;
                }
            case 15:
                int iP14 = l93.p0(parcel);
                byte[] bArrV12 = null;
                byte[] bArrV13 = null;
                byte[] bArrV14 = null;
                long jX2 = 0;
                while (parcel.dataPosition() < iP14) {
                    int i15 = parcel.readInt();
                    char c11 = (char) i15;
                    if (c11 == 1) {
                        jX2 = l93.X(parcel, i15);
                    } else if (c11 == 2) {
                        bArrV12 = l93.v(parcel, i15);
                    } else if (c11 == 3) {
                        bArrV13 = l93.v(parcel, i15);
                    } else if (c11 != 4) {
                        l93.m0(parcel, i15);
                    } else {
                        bArrV14 = l93.v(parcel, i15);
                    }
                }
                l93.H(parcel, iP14);
                return new qk5(jX2, bArrV12, bArrV13, bArrV14);
            case WaveRetry.MAX_FAILURES /* 16 */:
                int iP15 = l93.p0(parcel);
                while (parcel.dataPosition() < iP15) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        l93.m0(parcel, i16);
                    } else {
                        arrayListZ = l93.z(parcel, i16, qk5.CREATOR);
                    }
                }
                l93.H(parcel, iP15);
                return new rk5(arrayListZ);
            case 17:
                int iP16 = l93.p0(parcel);
                while (parcel.dataPosition() < iP16) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 1) {
                        l93.m0(parcel, i17);
                    } else {
                        l93.V(parcel, i17);
                    }
                }
                l93.H(parcel, iP16);
                return new uk5();
            case 18:
                try {
                    return c21.a(parcel.readInt());
                } catch (ErrorCode$UnsupportedErrorCodeException e2) {
                    throw new IllegalArgumentException(e2);
                }
            default:
                int iP17 = l93.p0(parcel);
                while (parcel.dataPosition() < iP17) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 2) {
                        l93.m0(parcel, i18);
                    } else {
                        strX2 = l93.x(parcel, i18);
                    }
                }
                l93.H(parcel, iP17);
                return new s61(strX2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new h35[i];
            case 1:
                return new hn[i];
            case 2:
                return new p61[i];
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return new gn[i];
            case 4:
                return new in[i];
            case 5:
                return new zi5[i];
            case 6:
                return new sj5[i];
            case 7:
                return new jn[i];
            case 8:
                return new kn[i];
            case 9:
                return new jk5[i];
            case 10:
                return new ln[i];
            case 11:
                return new pa0[i];
            case 12:
                return new nn[i];
            case 13:
                return new sh1[i];
            case 14:
                return new bx[i];
            case 15:
                return new qk5[i];
            case WaveRetry.MAX_FAILURES /* 16 */:
                return new rk5[i];
            case 17:
                return new uk5[i];
            case 18:
                return new c21[i];
            default:
                return new s61[i];
        }
    }
}
