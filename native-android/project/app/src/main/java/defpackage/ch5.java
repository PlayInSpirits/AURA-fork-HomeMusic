package defpackage;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment$UnsupportedAttachmentException;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement$UnsupportedResidentKeyRequirementException;
import com.google.android.gms.fido.fido2.api.common.TokenBinding$UnsupportedTokenBindingStatusException;
import com.google.android.gms.fido.fido2.api.common.zzbc;
import java.util.ArrayList;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ch5 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ ch5(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iW = 0;
        boolean zV = false;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        boolean zV2 = false;
        boolean zV3 = false;
        boolean zV4 = false;
        String strX = null;
        ArrayList arrayListZ = null;
        PendingIntent pendingIntent = null;
        String strX2 = null;
        String strX3 = null;
        String strX4 = null;
        byte[] bArrV = null;
        String strX5 = null;
        String strX6 = null;
        String strX7 = null;
        String strX8 = null;
        String strX9 = null;
        switch (this.a) {
            case 0:
                int iP0 = l93.p0(parcel);
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iP0) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 2) {
                        strX = l93.x(parcel, i);
                    } else if (c != 5) {
                        l93.m0(parcel, i);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) l93.w(parcel, i, GoogleSignInOptions.CREATOR);
                    }
                }
                l93.H(parcel, iP0);
                return new SignInConfiguration(strX, googleSignInOptions);
            case 1:
                int iP1 = l93.p0(parcel);
                String strX10 = null;
                String strX11 = null;
                String strX12 = null;
                String strX13 = null;
                Uri uri = null;
                String strX14 = null;
                String strX15 = null;
                String strX16 = null;
                vr3 vr3Var = null;
                while (parcel.dataPosition() < iP1) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 1:
                            strX10 = l93.x(parcel, i2);
                            break;
                        case 2:
                            strX11 = l93.x(parcel, i2);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            strX12 = l93.x(parcel, i2);
                            break;
                        case 4:
                            strX13 = l93.x(parcel, i2);
                            break;
                        case 5:
                            uri = (Uri) l93.w(parcel, i2, Uri.CREATOR);
                            break;
                        case 6:
                            strX14 = l93.x(parcel, i2);
                            break;
                        case 7:
                            strX15 = l93.x(parcel, i2);
                            break;
                        case '\b':
                            strX16 = l93.x(parcel, i2);
                            break;
                        case '\t':
                            vr3Var = (vr3) l93.w(parcel, i2, vr3.CREATOR);
                            break;
                        default:
                            l93.m0(parcel, i2);
                            break;
                    }
                }
                l93.H(parcel, iP1);
                return new td4(strX10, strX11, strX12, strX13, uri, strX14, strX15, strX16, vr3Var);
            case 2:
                int iP2 = l93.p0(parcel);
                String strX17 = null;
                while (parcel.dataPosition() < iP2) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 1) {
                        strX9 = l93.x(parcel, i3);
                    } else if (c2 != 2) {
                        l93.m0(parcel, i3);
                    } else {
                        strX17 = l93.x(parcel, i3);
                    }
                }
                l93.H(parcel, iP2);
                return new vd4(strX9, strX17);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                try {
                    return gl.a(parcel.readString());
                } catch (Attachment$UnsupportedAttachmentException e) {
                    er1.m(e);
                    return null;
                }
            case 4:
                int iP3 = l93.p0(parcel);
                while (parcel.dataPosition() < iP3) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 1) {
                        iW = l93.W(parcel, i4);
                    } else if (c3 != 2) {
                        l93.m0(parcel, i4);
                    } else {
                        strX8 = l93.x(parcel, i4);
                    }
                }
                l93.H(parcel, iP3);
                return new Scope(iW, strX8);
            case 5:
                int iP4 = l93.p0(parcel);
                while (parcel.dataPosition() < iP4) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 1) {
                        l93.m0(parcel, i5);
                    } else {
                        zV4 = l93.V(parcel, i5);
                    }
                }
                l93.H(parcel, iP4);
                return new wk5(zV4);
            case 6:
                int iP5 = l93.p0(parcel);
                long jX = 0;
                while (parcel.dataPosition() < iP5) {
                    int i6 = parcel.readInt();
                    if (((char) i6) != 1) {
                        l93.m0(parcel, i6);
                    } else {
                        jX = l93.X(parcel, i6);
                    }
                }
                l93.H(parcel, iP5);
                return new gh5(jX);
            case 7:
                int iP6 = l93.p0(parcel);
                while (parcel.dataPosition() < iP6) {
                    int i7 = parcel.readInt();
                    if (((char) i7) != 1) {
                        l93.m0(parcel, i7);
                    } else {
                        zV3 = l93.V(parcel, i7);
                    }
                }
                l93.H(parcel, iP6);
                return new hh5(zV3);
            case 8:
                int iP7 = l93.p0(parcel);
                while (parcel.dataPosition() < iP7) {
                    int i8 = parcel.readInt();
                    if (((char) i8) != 1) {
                        l93.m0(parcel, i8);
                    } else {
                        zV2 = l93.V(parcel, i8);
                    }
                }
                l93.H(parcel, iP7);
                return new pj1(zV2);
            case 9:
                int iP8 = l93.p0(parcel);
                while (parcel.dataPosition() < iP8) {
                    int i9 = parcel.readInt();
                    if (((char) i9) != 1) {
                        l93.m0(parcel, i9);
                    } else {
                        strX7 = l93.x(parcel, i9);
                    }
                }
                l93.H(parcel, iP8);
                return new kh5(strX7);
            case 10:
                int iP9 = l93.p0(parcel);
                byte[] bArrV2 = null;
                byte[] bArrV3 = null;
                byte[] bArrV4 = null;
                while (parcel.dataPosition() < iP9) {
                    int i10 = parcel.readInt();
                    char c4 = (char) i10;
                    if (c4 == 1) {
                        bArrV2 = l93.v(parcel, i10);
                    } else if (c4 == 2) {
                        bArrV3 = l93.v(parcel, i10);
                    } else if (c4 == 3) {
                        bArrV4 = l93.v(parcel, i10);
                    } else if (c4 != 4) {
                        l93.m0(parcel, i10);
                    } else {
                        iW4 = l93.W(parcel, i10);
                    }
                }
                l93.H(parcel, iP9);
                return new lh5(bArrV2 == null ? null : rj5.i(bArrV2.length, bArrV2), bArrV3 == null ? null : rj5.i(bArrV3.length, bArrV3), bArrV4 != null ? rj5.i(bArrV4.length, bArrV4) : null, iW4);
            case 11:
                int iP10 = l93.p0(parcel);
                int iW5 = 0;
                boolean zV5 = false;
                boolean zV6 = false;
                int iW6 = 0;
                int iW7 = 0;
                while (parcel.dataPosition() < iP10) {
                    int i11 = parcel.readInt();
                    char c5 = (char) i11;
                    if (c5 == 1) {
                        iW5 = l93.W(parcel, i11);
                    } else if (c5 == 2) {
                        zV5 = l93.V(parcel, i11);
                    } else if (c5 == 3) {
                        zV6 = l93.V(parcel, i11);
                    } else if (c5 == 4) {
                        iW6 = l93.W(parcel, i11);
                    } else if (c5 != 5) {
                        l93.m0(parcel, i11);
                    } else {
                        iW7 = l93.W(parcel, i11);
                    }
                }
                l93.H(parcel, iP10);
                return new e34(iW5, zV5, zV6, iW6, iW7);
            case 12:
                int iP11 = l93.p0(parcel);
                while (true) {
                    byte[][] bArr = null;
                    while (true) {
                        if (parcel.dataPosition() >= iP11) {
                            l93.H(parcel, iP11);
                            return new mh5(bArr);
                        }
                        int i12 = parcel.readInt();
                        if (((char) i12) != 1) {
                            l93.m0(parcel, i12);
                        } else {
                            int iZ = l93.Z(parcel, i12);
                            int iDataPosition = parcel.dataPosition();
                            if (iZ == 0) {
                            }
                            int i13 = parcel.readInt();
                            byte[][] bArr2 = new byte[i13][];
                            for (int i14 = 0; i14 < i13; i14++) {
                                bArr2[i14] = parcel.createByteArray();
                            }
                            parcel.setDataPosition(iDataPosition + iZ);
                            bArr = bArr2;
                        }
                        break;
                    }
                }
                break;
            case 13:
                int iP12 = l93.p0(parcel);
                as3 as3Var = null;
                cs3 cs3Var = null;
                byte[] bArrV5 = null;
                ArrayList arrayListZ2 = null;
                Double dValueOf = null;
                ArrayList arrayListZ3 = null;
                nn nnVar = null;
                Integer numValueOf = null;
                su4 su4Var = null;
                String strX18 = null;
                gn gnVar = null;
                String strX19 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < iP12) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 2:
                            as3Var = (as3) l93.w(parcel, i15, as3.CREATOR);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            cs3Var = (cs3) l93.w(parcel, i15, cs3.CREATOR);
                            break;
                        case 4:
                            bArrV5 = l93.v(parcel, i15);
                            break;
                        case 5:
                            arrayListZ2 = l93.z(parcel, i15, zr3.CREATOR);
                            break;
                        case 6:
                            int iZ2 = l93.Z(parcel, i15);
                            if (iZ2 == 0) {
                                dValueOf = null;
                            } else {
                                l93.s0(parcel, iZ2, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            }
                            break;
                        case 7:
                            arrayListZ3 = l93.z(parcel, i15, yr3.CREATOR);
                            break;
                        case '\b':
                            nnVar = (nn) l93.w(parcel, i15, nn.CREATOR);
                            break;
                        case '\t':
                            int iZ3 = l93.Z(parcel, i15);
                            if (iZ3 == 0) {
                                numValueOf = null;
                            } else {
                                l93.s0(parcel, iZ3, 4);
                                numValueOf = Integer.valueOf(parcel.readInt());
                            }
                            break;
                        case '\n':
                            su4Var = (su4) l93.w(parcel, i15, su4.CREATOR);
                            break;
                        case 11:
                            strX18 = l93.x(parcel, i15);
                            break;
                        case '\f':
                            gnVar = (gn) l93.w(parcel, i15, gn.CREATOR);
                            break;
                        case '\r':
                            strX19 = l93.x(parcel, i15);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) l93.w(parcel, i15, ResultReceiver.CREATOR);
                            break;
                        default:
                            l93.m0(parcel, i15);
                            break;
                    }
                }
                l93.H(parcel, iP12);
                return new xr3(as3Var, cs3Var, bArrV5, arrayListZ2, dValueOf, arrayListZ3, nnVar, numValueOf, su4Var, strX18, gnVar, strX19, resultReceiver);
            case 14:
                int iP13 = l93.p0(parcel);
                String strX20 = null;
                String strX21 = null;
                byte[] bArrV6 = null;
                kn knVar = null;
                jn jnVar = null;
                ln lnVar = null;
                hn hnVar = null;
                String strX22 = null;
                while (parcel.dataPosition() < iP13) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            strX20 = l93.x(parcel, i16);
                            break;
                        case 2:
                            strX21 = l93.x(parcel, i16);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            bArrV6 = l93.v(parcel, i16);
                            break;
                        case 4:
                            knVar = (kn) l93.w(parcel, i16, kn.CREATOR);
                            break;
                        case 5:
                            jnVar = (jn) l93.w(parcel, i16, jn.CREATOR);
                            break;
                        case 6:
                            lnVar = (ln) l93.w(parcel, i16, ln.CREATOR);
                            break;
                        case 7:
                            hnVar = (hn) l93.w(parcel, i16, hn.CREATOR);
                            break;
                        case '\b':
                            strX22 = l93.x(parcel, i16);
                            break;
                        case '\t':
                            l93.x(parcel, i16);
                            break;
                        default:
                            l93.m0(parcel, i16);
                            break;
                    }
                }
                l93.H(parcel, iP13);
                return new vr3(strX20, strX21, bArrV6, knVar, jnVar, lnVar, hnVar, strX22);
            case 15:
                int iP14 = l93.p0(parcel);
                byte[] bArrV7 = null;
                ArrayList arrayListZ4 = null;
                while (parcel.dataPosition() < iP14) {
                    int i17 = parcel.readInt();
                    char c6 = (char) i17;
                    if (c6 == 2) {
                        strX6 = l93.x(parcel, i17);
                    } else if (c6 == 3) {
                        bArrV7 = l93.v(parcel, i17);
                    } else if (c6 != 4) {
                        l93.m0(parcel, i17);
                    } else {
                        arrayListZ4 = l93.z(parcel, i17, Transport.CREATOR);
                    }
                }
                l93.H(parcel, iP14);
                return new yr3(strX6, bArrV7, arrayListZ4);
            case WaveRetry.MAX_FAILURES /* 16 */:
                int iP15 = l93.p0(parcel);
                String strX23 = null;
                Integer numValueOf2 = null;
                while (parcel.dataPosition() < iP15) {
                    int i18 = parcel.readInt();
                    char c7 = (char) i18;
                    if (c7 == 2) {
                        strX23 = l93.x(parcel, i18);
                    } else if (c7 != 3) {
                        l93.m0(parcel, i18);
                    } else {
                        int iZ4 = l93.Z(parcel, i18);
                        if (iZ4 == 0) {
                            numValueOf2 = null;
                        } else {
                            l93.s0(parcel, iZ4, 4);
                            numValueOf2 = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                l93.H(parcel, iP15);
                return new zr3(numValueOf2.intValue(), strX23);
            case 17:
                int iP16 = l93.p0(parcel);
                String strX24 = null;
                String strX25 = null;
                while (parcel.dataPosition() < iP16) {
                    int i19 = parcel.readInt();
                    char c8 = (char) i19;
                    if (c8 == 2) {
                        strX5 = l93.x(parcel, i19);
                    } else if (c8 == 3) {
                        strX24 = l93.x(parcel, i19);
                    } else if (c8 != 4) {
                        l93.m0(parcel, i19);
                    } else {
                        strX25 = l93.x(parcel, i19);
                    }
                }
                l93.H(parcel, iP16);
                return new as3(strX5, strX24, strX25);
            case 18:
                try {
                    return bs3.a(parcel.readString());
                } catch (PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException e2) {
                    er1.m(e2);
                    return null;
                }
            case 19:
                int iP17 = l93.p0(parcel);
                String strX26 = null;
                String strX27 = null;
                String strX28 = null;
                while (parcel.dataPosition() < iP17) {
                    int i20 = parcel.readInt();
                    char c9 = (char) i20;
                    if (c9 == 2) {
                        bArrV = l93.v(parcel, i20);
                    } else if (c9 == 3) {
                        strX26 = l93.x(parcel, i20);
                    } else if (c9 == 4) {
                        strX27 = l93.x(parcel, i20);
                    } else if (c9 != 5) {
                        l93.m0(parcel, i20);
                    } else {
                        strX28 = l93.x(parcel, i20);
                    }
                }
                l93.H(parcel, iP17);
                return new cs3(strX26, strX27, strX28, bArrV);
            case 20:
                String string = parcel.readString();
                if (string == null) {
                    string = "";
                }
                try {
                    return l04.a(string);
                } catch (ResidentKeyRequirement$UnsupportedResidentKeyRequirementException e3) {
                    er1.m(e3);
                    return null;
                }
            case 21:
                int iP18 = l93.p0(parcel);
                while (parcel.dataPosition() < iP18) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 1) {
                        l93.m0(parcel, i21);
                    } else {
                        strX4 = l93.x(parcel, i21);
                    }
                }
                l93.H(parcel, iP18);
                return new nh5(strX4);
            case 22:
                try {
                    return ru4.a(parcel.readString());
                } catch (TokenBinding$UnsupportedTokenBindingStatusException e4) {
                    er1.m(e4);
                    return null;
                }
            case 23:
                int iP19 = l93.p0(parcel);
                String strX29 = null;
                while (parcel.dataPosition() < iP19) {
                    int i22 = parcel.readInt();
                    char c10 = (char) i22;
                    if (c10 == 2) {
                        strX3 = l93.x(parcel, i22);
                    } else if (c10 != 3) {
                        l93.m0(parcel, i22);
                    } else {
                        strX29 = l93.x(parcel, i22);
                    }
                }
                l93.H(parcel, iP19);
                return new su4(strX3, strX29);
            case 24:
                int iP20 = l93.p0(parcel);
                PendingIntent pendingIntent2 = null;
                ka0 ka0Var = null;
                while (parcel.dataPosition() < iP20) {
                    int i23 = parcel.readInt();
                    char c11 = (char) i23;
                    if (c11 == 1) {
                        iW3 = l93.W(parcel, i23);
                    } else if (c11 == 2) {
                        strX2 = l93.x(parcel, i23);
                    } else if (c11 == 3) {
                        pendingIntent2 = (PendingIntent) l93.w(parcel, i23, PendingIntent.CREATOR);
                    } else if (c11 != 4) {
                        l93.m0(parcel, i23);
                    } else {
                        ka0Var = (ka0) l93.w(parcel, i23, ka0.CREATOR);
                    }
                }
                l93.H(parcel, iP20);
                return new Status(iW3, strX2, pendingIntent2, ka0Var);
            case 25:
                try {
                    return hl.a(parcel.readString());
                } catch (AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException e5) {
                    er1.m(e5);
                    return null;
                }
            case 26:
                int iP21 = l93.p0(parcel);
                int iW8 = 0;
                String strX30 = null;
                while (parcel.dataPosition() < iP21) {
                    int i24 = parcel.readInt();
                    char c12 = (char) i24;
                    if (c12 == 1) {
                        iW2 = l93.W(parcel, i24);
                    } else if (c12 == 2) {
                        iW8 = l93.W(parcel, i24);
                    } else if (c12 == 3) {
                        pendingIntent = (PendingIntent) l93.w(parcel, i24, PendingIntent.CREATOR);
                    } else if (c12 != 4) {
                        l93.m0(parcel, i24);
                    } else {
                        strX30 = l93.x(parcel, i24);
                    }
                }
                l93.H(parcel, iP21);
                return new ka0(iW2, iW8, pendingIntent, strX30);
            case 27:
                int iP22 = l93.p0(parcel);
                while (parcel.dataPosition() < iP22) {
                    int i25 = parcel.readInt();
                    if (((char) i25) != 1) {
                        l93.m0(parcel, i25);
                    } else {
                        zV = l93.V(parcel, i25);
                    }
                }
                l93.H(parcel, iP22);
                return new y25(zV);
            case 28:
                try {
                    return z25.a(parcel.readString());
                } catch (zzbc e6) {
                    er1.m(e6);
                    return null;
                }
            default:
                int iP23 = l93.p0(parcel);
                while (parcel.dataPosition() < iP23) {
                    int i26 = parcel.readInt();
                    if (((char) i26) != 1) {
                        l93.m0(parcel, i26);
                    } else {
                        arrayListZ = l93.z(parcel, i26, h35.CREATOR);
                    }
                }
                l93.H(parcel, iP23);
                return new g35(arrayListZ);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new SignInConfiguration[i];
            case 1:
                return new td4[i];
            case 2:
                return new vd4[i];
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return new gl[i];
            case 4:
                return new Scope[i];
            case 5:
                return new wk5[i];
            case 6:
                return new gh5[i];
            case 7:
                return new hh5[i];
            case 8:
                return new pj1[i];
            case 9:
                return new kh5[i];
            case 10:
                return new lh5[i];
            case 11:
                return new e34[i];
            case 12:
                return new mh5[i];
            case 13:
                return new xr3[i];
            case 14:
                return new vr3[i];
            case 15:
                return new yr3[i];
            case WaveRetry.MAX_FAILURES /* 16 */:
                return new zr3[i];
            case 17:
                return new as3[i];
            case 18:
                return new bs3[i];
            case 19:
                return new cs3[i];
            case 20:
                return new l04[i];
            case 21:
                return new nh5[i];
            case 22:
                return new ru4[i];
            case 23:
                return new su4[i];
            case 24:
                return new Status[i];
            case 25:
                return new hl[i];
            case 26:
                return new ka0[i];
            case 27:
                return new y25[i];
            case 28:
                return new z25[i];
            default:
                return new g35[i];
        }
    }
}
