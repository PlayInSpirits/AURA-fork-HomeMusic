package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.model.Server;
import com.eddyizm.tempus.subsonic.models.Share;
import com.eddyizm.tempus.subsonic.models.SimilarArtistID3;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Date;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j84 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iW = 0;
        boolean zV = false;
        boolean zV2 = false;
        boolean zV3 = false;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        int iW5 = 0;
        int iW6 = 0;
        ArrayList arrayList = null;
        PendingIntent pendingIntent = null;
        vd4 vd4Var = null;
        byte[] bArrV = null;
        String strX = null;
        PendingIntent pendingIntent2 = null;
        GoogleSignInAccount googleSignInAccount = null;
        Account account = null;
        ka0 ka0Var = null;
        ArrayList arrayListZ = null;
        Intent intent = null;
        ArrayList arrayListZ2 = null;
        Bundle bundleU = null;
        switch (this.a) {
            case 0:
                return new k84(parcel);
            case 1:
                parcel.getClass();
                return new Server(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0, parcel.readString());
            case 2:
                parcel.getClass();
                if (parcel.readInt() != 0) {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(parcel.readParcelable(Share.class.getClassLoader()));
                    }
                }
                return new Share(arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable(), parcel.readInt());
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                parcel.getClass();
                parcel.readInt();
                return new SimilarArtistID3();
            case 4:
                ze4 ze4Var = new ze4();
                ze4Var.n = (Long) parcel.readValue(Long.class.getClassLoader());
                return ze4Var;
            case 5:
                pk4 pk4Var = new pk4();
                pk4Var.n = parcel.readInt();
                pk4Var.o = parcel.readInt();
                pk4Var.q = parcel.readInt() == 1;
                int i3 = parcel.readInt();
                if (i3 > 0) {
                    int[] iArr = new int[i3];
                    pk4Var.p = iArr;
                    parcel.readIntArray(iArr);
                }
                return pk4Var;
            case 6:
                qk4 qk4Var = new qk4();
                qk4Var.n = parcel.readInt();
                qk4Var.o = parcel.readInt();
                int i4 = parcel.readInt();
                qk4Var.p = i4;
                if (i4 > 0) {
                    int[] iArr2 = new int[i4];
                    qk4Var.q = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i5 = parcel.readInt();
                qk4Var.r = i5;
                if (i5 > 0) {
                    int[] iArr3 = new int[i5];
                    qk4Var.s = iArr3;
                    parcel.readIntArray(iArr3);
                }
                qk4Var.u = parcel.readInt() == 1;
                qk4Var.v = parcel.readInt() == 1;
                qk4Var.w = parcel.readInt() == 1;
                qk4Var.t = parcel.readArrayList(pk4.class.getClassLoader());
                return qk4Var;
            case 7:
                return new fm4(parcel);
            case 8:
                return new op4(parcel);
            case 9:
                return new zy4(parcel);
            case 10:
                int iP0 = l93.p0(parcel);
                int iW7 = 0;
                while (parcel.dataPosition() < iP0) {
                    int i6 = parcel.readInt();
                    char c = (char) i6;
                    if (c == 1) {
                        iW6 = l93.W(parcel, i6);
                    } else if (c == 2) {
                        iW7 = l93.W(parcel, i6);
                    } else if (c != 3) {
                        l93.m0(parcel, i6);
                    } else {
                        bundleU = l93.u(parcel, i6);
                    }
                }
                l93.H(parcel, iP0);
                return new nj1(iW6, iW7, bundleU);
            case 11:
                int iP1 = l93.p0(parcel);
                while (parcel.dataPosition() < iP1) {
                    int i7 = parcel.readInt();
                    char c2 = (char) i7;
                    if (c2 == 1) {
                        iW5 = l93.W(parcel, i7);
                    } else if (c2 != 2) {
                        l93.m0(parcel, i7);
                    } else {
                        arrayListZ2 = l93.z(parcel, i7, iw2.CREATOR);
                    }
                }
                l93.H(parcel, iP1);
                return new kr4(arrayListZ2, iW5);
            case 12:
                int iP2 = l93.p0(parcel);
                int iW8 = 0;
                while (parcel.dataPosition() < iP2) {
                    int i8 = parcel.readInt();
                    char c3 = (char) i8;
                    if (c3 == 1) {
                        iW4 = l93.W(parcel, i8);
                    } else if (c3 == 2) {
                        iW8 = l93.W(parcel, i8);
                    } else if (c3 != 3) {
                        l93.m0(parcel, i8);
                    } else {
                        intent = (Intent) l93.w(parcel, i8, Intent.CREATOR);
                    }
                }
                l93.H(parcel, iP2);
                return new bf5(iW4, iW8, intent);
            case 13:
                int iP3 = l93.p0(parcel);
                long jX = 0;
                int iW9 = 0;
                String strX2 = null;
                String strX3 = null;
                String strX4 = null;
                String strX5 = null;
                Uri uri = null;
                String strX6 = null;
                String strX7 = null;
                ArrayList arrayListZ3 = null;
                String strX8 = null;
                String strX9 = null;
                while (parcel.dataPosition() < iP3) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            iW9 = l93.W(parcel, i9);
                            break;
                        case 2:
                            strX2 = l93.x(parcel, i9);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            strX3 = l93.x(parcel, i9);
                            break;
                        case 4:
                            strX4 = l93.x(parcel, i9);
                            break;
                        case 5:
                            strX5 = l93.x(parcel, i9);
                            break;
                        case 6:
                            uri = (Uri) l93.w(parcel, i9, Uri.CREATOR);
                            break;
                        case 7:
                            strX6 = l93.x(parcel, i9);
                            break;
                        case '\b':
                            jX = l93.X(parcel, i9);
                            break;
                        case '\t':
                            strX7 = l93.x(parcel, i9);
                            break;
                        case '\n':
                            arrayListZ3 = l93.z(parcel, i9, Scope.CREATOR);
                            break;
                        case 11:
                            strX8 = l93.x(parcel, i9);
                            break;
                        case '\f':
                            strX9 = l93.x(parcel, i9);
                            break;
                        default:
                            l93.m0(parcel, i9);
                            break;
                    }
                }
                l93.H(parcel, iP3);
                return new GoogleSignInAccount(iW9, strX2, strX3, strX4, strX5, uri, strX6, jX, strX7, arrayListZ3, strX8, strX9);
            case 14:
                int iP4 = l93.p0(parcel);
                int iW10 = 0;
                boolean zV4 = false;
                boolean zV5 = false;
                boolean zV6 = false;
                ArrayList arrayListZ4 = null;
                Account account2 = null;
                String strX10 = null;
                String strX11 = null;
                String strX12 = null;
                while (parcel.dataPosition() < iP4) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iW10 = l93.W(parcel, i10);
                            break;
                        case 2:
                            arrayListZ4 = l93.z(parcel, i10, Scope.CREATOR);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            account2 = (Account) l93.w(parcel, i10, Account.CREATOR);
                            break;
                        case 4:
                            zV4 = l93.V(parcel, i10);
                            break;
                        case 5:
                            zV5 = l93.V(parcel, i10);
                            break;
                        case 6:
                            zV6 = l93.V(parcel, i10);
                            break;
                        case 7:
                            strX10 = l93.x(parcel, i10);
                            break;
                        case '\b':
                            strX11 = l93.x(parcel, i10);
                            break;
                        case '\t':
                            arrayListZ = l93.z(parcel, i10, nj1.CREATOR);
                            break;
                        case '\n':
                            strX12 = l93.x(parcel, i10);
                            break;
                        default:
                            l93.m0(parcel, i10);
                            break;
                    }
                }
                l93.H(parcel, iP4);
                return new GoogleSignInOptions(iW10, arrayListZ4, account2, zV4, zV5, zV6, strX10, strX11, GoogleSignInOptions.c(arrayListZ), strX12);
            case 15:
                int iP5 = l93.p0(parcel);
                ArrayList<String> arrayList2 = null;
                String strX13 = null;
                while (parcel.dataPosition() < iP5) {
                    int i11 = parcel.readInt();
                    char c4 = (char) i11;
                    if (c4 == 1) {
                        int iZ = l93.Z(parcel, i11);
                        int iDataPosition = parcel.dataPosition();
                        if (iZ == 0) {
                            arrayList2 = null;
                        } else {
                            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(iDataPosition + iZ);
                            arrayList2 = arrayListCreateStringArrayList;
                        }
                    } else if (c4 != 2) {
                        l93.m0(parcel, i11);
                    } else {
                        strX13 = l93.x(parcel, i11);
                    }
                }
                l93.H(parcel, iP5);
                return new yf5(strX13, arrayList2);
            case WaveRetry.MAX_FAILURES /* 16 */:
                int iP6 = l93.p0(parcel);
                ig5 ig5Var = null;
                while (parcel.dataPosition() < iP6) {
                    int i12 = parcel.readInt();
                    char c5 = (char) i12;
                    if (c5 == 1) {
                        iW3 = l93.W(parcel, i12);
                    } else if (c5 == 2) {
                        ka0Var = (ka0) l93.w(parcel, i12, ka0.CREATOR);
                    } else if (c5 != 3) {
                        l93.m0(parcel, i12);
                    } else {
                        ig5Var = (ig5) l93.w(parcel, i12, ig5.CREATOR);
                    }
                }
                l93.H(parcel, iP6);
                return new dg5(iW3, ka0Var, ig5Var);
            case 17:
                int iP7 = l93.p0(parcel);
                long jX2 = 0;
                long jX3 = 0;
                int iW11 = -1;
                int iW12 = 0;
                int iW13 = 0;
                int iW14 = 0;
                int iW15 = 0;
                String strX14 = null;
                String strX15 = null;
                while (parcel.dataPosition() < iP7) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            iW12 = l93.W(parcel, i13);
                            break;
                        case 2:
                            iW13 = l93.W(parcel, i13);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            iW14 = l93.W(parcel, i13);
                            break;
                        case 4:
                            jX2 = l93.X(parcel, i13);
                            break;
                        case 5:
                            jX3 = l93.X(parcel, i13);
                            break;
                        case 6:
                            strX14 = l93.x(parcel, i13);
                            break;
                        case 7:
                            strX15 = l93.x(parcel, i13);
                            break;
                        case '\b':
                            iW15 = l93.W(parcel, i13);
                            break;
                        case '\t':
                            iW11 = l93.W(parcel, i13);
                            break;
                        default:
                            l93.m0(parcel, i13);
                            break;
                    }
                }
                l93.H(parcel, iP7);
                return new iw2(iW12, iW13, iW14, jX2, jX3, strX14, strX15, iW15, iW11);
            case 18:
                int iP8 = l93.p0(parcel);
                int iW16 = 0;
                GoogleSignInAccount googleSignInAccount2 = null;
                while (parcel.dataPosition() < iP8) {
                    int i14 = parcel.readInt();
                    char c6 = (char) i14;
                    if (c6 == 1) {
                        iW2 = l93.W(parcel, i14);
                    } else if (c6 == 2) {
                        account = (Account) l93.w(parcel, i14, Account.CREATOR);
                    } else if (c6 == 3) {
                        iW16 = l93.W(parcel, i14);
                    } else if (c6 != 4) {
                        l93.m0(parcel, i14);
                    } else {
                        googleSignInAccount2 = (GoogleSignInAccount) l93.w(parcel, i14, GoogleSignInAccount.CREATOR);
                    }
                }
                l93.H(parcel, iP8);
                return new hg5(iW2, account, iW16, googleSignInAccount2);
            case 19:
                int iP9 = l93.p0(parcel);
                int iW17 = 0;
                boolean zV7 = false;
                boolean zV8 = false;
                IBinder iBinder = null;
                ka0 ka0Var2 = null;
                while (parcel.dataPosition() < iP9) {
                    int i15 = parcel.readInt();
                    char c7 = (char) i15;
                    if (c7 == 1) {
                        iW17 = l93.W(parcel, i15);
                    } else if (c7 == 2) {
                        int iZ2 = l93.Z(parcel, i15);
                        int iDataPosition2 = parcel.dataPosition();
                        if (iZ2 == 0) {
                            iBinder = null;
                        } else {
                            IBinder strongBinder = parcel.readStrongBinder();
                            parcel.setDataPosition(iDataPosition2 + iZ2);
                            iBinder = strongBinder;
                        }
                    } else if (c7 == 3) {
                        ka0Var2 = (ka0) l93.w(parcel, i15, ka0.CREATOR);
                    } else if (c7 == 4) {
                        zV7 = l93.V(parcel, i15);
                    } else if (c7 != 5) {
                        l93.m0(parcel, i15);
                    } else {
                        zV8 = l93.V(parcel, i15);
                    }
                }
                l93.H(parcel, iP9);
                return new ig5(iW17, iBinder, ka0Var2, zV7, zV8);
            case 20:
                int iP10 = l93.p0(parcel);
                String strX16 = "";
                String strX17 = "";
                while (parcel.dataPosition() < iP10) {
                    int i16 = parcel.readInt();
                    char c8 = (char) i16;
                    if (c8 == 4) {
                        strX16 = l93.x(parcel, i16);
                    } else if (c8 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) l93.w(parcel, i16, GoogleSignInAccount.CREATOR);
                    } else if (c8 != '\b') {
                        l93.m0(parcel, i16);
                    } else {
                        strX17 = l93.x(parcel, i16);
                    }
                }
                l93.H(parcel, iP10);
                return new SignInAccount(strX16, googleSignInAccount, strX17);
            case 21:
                int iP11 = l93.p0(parcel);
                boolean zV9 = false;
                int iW18 = 0;
                boolean zV10 = false;
                bs bsVar = null;
                yr yrVar = null;
                String strX18 = null;
                as asVar = null;
                zr zrVar = null;
                while (parcel.dataPosition() < iP11) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            bsVar = (bs) l93.w(parcel, i17, bs.CREATOR);
                            break;
                        case 2:
                            yrVar = (yr) l93.w(parcel, i17, yr.CREATOR);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            strX18 = l93.x(parcel, i17);
                            break;
                        case 4:
                            zV9 = l93.V(parcel, i17);
                            break;
                        case 5:
                            iW18 = l93.W(parcel, i17);
                            break;
                        case 6:
                            asVar = (as) l93.w(parcel, i17, as.CREATOR);
                            break;
                        case 7:
                            zrVar = (zr) l93.w(parcel, i17, zr.CREATOR);
                            break;
                        case '\b':
                            zV10 = l93.V(parcel, i17);
                            break;
                        default:
                            l93.m0(parcel, i17);
                            break;
                    }
                }
                l93.H(parcel, iP11);
                return new cs(bsVar, yrVar, strX18, zV9, iW18, asVar, zrVar, zV10);
            case 22:
                int iP12 = l93.p0(parcel);
                while (parcel.dataPosition() < iP12) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 1) {
                        l93.m0(parcel, i18);
                    } else {
                        pendingIntent2 = (PendingIntent) l93.w(parcel, i18, PendingIntent.CREATOR);
                    }
                }
                l93.H(parcel, iP12);
                return new ds(pendingIntent2);
            case 23:
                int iP13 = l93.p0(parcel);
                boolean zV11 = false;
                int iW19 = 0;
                String strX19 = null;
                String strX20 = null;
                String strX21 = null;
                String strX22 = null;
                while (parcel.dataPosition() < iP13) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            strX19 = l93.x(parcel, i19);
                            break;
                        case 2:
                            strX20 = l93.x(parcel, i19);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            strX21 = l93.x(parcel, i19);
                            break;
                        case 4:
                            strX22 = l93.x(parcel, i19);
                            break;
                        case 5:
                            zV11 = l93.V(parcel, i19);
                            break;
                        case 6:
                            iW19 = l93.W(parcel, i19);
                            break;
                        default:
                            l93.m0(parcel, i19);
                            break;
                    }
                }
                l93.H(parcel, iP13);
                return new th1(strX19, strX20, strX21, strX22, zV11, iW19);
            case 24:
                int iP14 = l93.p0(parcel);
                boolean zV12 = false;
                boolean zV13 = false;
                boolean zV14 = false;
                String strX23 = null;
                String strX24 = null;
                String strX25 = null;
                ArrayList<String> arrayList3 = null;
                while (parcel.dataPosition() < iP14) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            zV12 = l93.V(parcel, i20);
                            break;
                        case 2:
                            strX23 = l93.x(parcel, i20);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            strX24 = l93.x(parcel, i20);
                            break;
                        case 4:
                            zV13 = l93.V(parcel, i20);
                            break;
                        case 5:
                            strX25 = l93.x(parcel, i20);
                            break;
                        case 6:
                            int iZ3 = l93.Z(parcel, i20);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iZ3 == 0) {
                                arrayList3 = null;
                            } else {
                                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                                parcel.setDataPosition(iDataPosition3 + iZ3);
                                arrayList3 = arrayListCreateStringArrayList2;
                            }
                            break;
                        case 7:
                            zV14 = l93.V(parcel, i20);
                            break;
                        default:
                            l93.m0(parcel, i20);
                            break;
                    }
                }
                l93.H(parcel, iP14);
                return new yr(zV12, strX23, strX24, zV13, strX25, arrayList3, zV14);
            case 25:
                int iP15 = l93.p0(parcel);
                while (parcel.dataPosition() < iP15) {
                    int i21 = parcel.readInt();
                    char c9 = (char) i21;
                    if (c9 == 1) {
                        zV3 = l93.V(parcel, i21);
                    } else if (c9 != 2) {
                        l93.m0(parcel, i21);
                    } else {
                        strX = l93.x(parcel, i21);
                    }
                }
                l93.H(parcel, iP15);
                return new zr(zV3, strX);
            case 26:
                int iP16 = l93.p0(parcel);
                String strX26 = null;
                while (parcel.dataPosition() < iP16) {
                    int i22 = parcel.readInt();
                    char c10 = (char) i22;
                    if (c10 == 1) {
                        zV2 = l93.V(parcel, i22);
                    } else if (c10 == 2) {
                        bArrV = l93.v(parcel, i22);
                    } else if (c10 != 3) {
                        l93.m0(parcel, i22);
                    } else {
                        strX26 = l93.x(parcel, i22);
                    }
                }
                l93.H(parcel, iP16);
                return new as(zV2, bArrV, strX26);
            case 27:
                int iP17 = l93.p0(parcel);
                while (parcel.dataPosition() < iP17) {
                    int i23 = parcel.readInt();
                    if (((char) i23) != 1) {
                        l93.m0(parcel, i23);
                    } else {
                        zV = l93.V(parcel, i23);
                    }
                }
                l93.H(parcel, iP17);
                return new bs(zV);
            case 28:
                int iP18 = l93.p0(parcel);
                String strX27 = null;
                while (parcel.dataPosition() < iP18) {
                    int i24 = parcel.readInt();
                    char c11 = (char) i24;
                    if (c11 == 1) {
                        vd4Var = (vd4) l93.w(parcel, i24, vd4.CREATOR);
                    } else if (c11 == 2) {
                        strX27 = l93.x(parcel, i24);
                    } else if (c11 != 3) {
                        l93.m0(parcel, i24);
                    } else {
                        iW = l93.W(parcel, i24);
                    }
                }
                l93.H(parcel, iP18);
                return new r44(vd4Var, strX27, iW);
            default:
                int iP19 = l93.p0(parcel);
                while (parcel.dataPosition() < iP19) {
                    int i25 = parcel.readInt();
                    if (((char) i25) != 1) {
                        l93.m0(parcel, i25);
                    } else {
                        pendingIntent = (PendingIntent) l93.w(parcel, i25, PendingIntent.CREATOR);
                    }
                }
                l93.H(parcel, iP19);
                return new s44(pendingIntent);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new k84[i];
            case 1:
                return new Server[i];
            case 2:
                return new Share[i];
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return new SimilarArtistID3[i];
            case 4:
                return new ze4[i];
            case 5:
                return new pk4[i];
            case 6:
                return new qk4[i];
            case 7:
                return new fm4[i];
            case 8:
                return new op4[i];
            case 9:
                return new zy4[i];
            case 10:
                return new nj1[i];
            case 11:
                return new kr4[i];
            case 12:
                return new bf5[i];
            case 13:
                return new GoogleSignInAccount[i];
            case 14:
                return new GoogleSignInOptions[i];
            case 15:
                return new yf5[i];
            case WaveRetry.MAX_FAILURES /* 16 */:
                return new dg5[i];
            case 17:
                return new iw2[i];
            case 18:
                return new hg5[i];
            case 19:
                return new ig5[i];
            case 20:
                return new SignInAccount[i];
            case 21:
                return new cs[i];
            case 22:
                return new ds[i];
            case 23:
                return new th1[i];
            case 24:
                return new yr[i];
            case 25:
                return new zr[i];
            case 26:
                return new as[i];
            case 27:
                return new bs[i];
            case 28:
                return new r44[i];
            default:
                return new s44[i];
        }
    }
}
