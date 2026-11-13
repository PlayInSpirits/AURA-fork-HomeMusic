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

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class j84 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ j84(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        ArrayList arrayList = null;
        PendingIntent pendingIntent = null;
        vd4 vd4Var = null;
        byte[] bArr = null;
        String str = null;
        PendingIntent pendingIntent2 = null;
        GoogleSignInAccount googleSignInAccount = null;
        Account account = null;
        ka0 ka0Var = null;
        ArrayList arrayList2 = null;
        Intent intent = null;
        ArrayList arrayList3 = null;
        Bundle bundle = null;
        switch (this.a) {
            case 0:
                return new k84(parcel);
            case 1:
                parcel.getClass();
                return new Server(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0, parcel.readString());
            case 2:
                parcel.getClass();
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    for (int i7 = 0; i7 != readInt; i7++) {
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
                int readInt2 = parcel.readInt();
                if (readInt2 > 0) {
                    int[] iArr = new int[readInt2];
                    pk4Var.p = iArr;
                    parcel.readIntArray(iArr);
                }
                return pk4Var;
            case 6:
                qk4 qk4Var = new qk4();
                qk4Var.n = parcel.readInt();
                qk4Var.o = parcel.readInt();
                int readInt3 = parcel.readInt();
                qk4Var.p = readInt3;
                if (readInt3 > 0) {
                    int[] iArr2 = new int[readInt3];
                    qk4Var.q = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt4 = parcel.readInt();
                qk4Var.r = readInt4;
                if (readInt4 > 0) {
                    int[] iArr3 = new int[readInt4];
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
                int p0 = l93.p0(parcel);
                int i8 = 0;
                while (parcel.dataPosition() < p0) {
                    int readInt5 = parcel.readInt();
                    char c = (char) readInt5;
                    if (c == 1) {
                        i6 = l93.W(parcel, readInt5);
                    } else if (c == 2) {
                        i8 = l93.W(parcel, readInt5);
                    } else if (c != 3) {
                        l93.m0(parcel, readInt5);
                    } else {
                        bundle = l93.u(parcel, readInt5);
                    }
                }
                l93.H(parcel, p0);
                return new nj1(i6, i8, bundle);
            case 11:
                int p02 = l93.p0(parcel);
                while (parcel.dataPosition() < p02) {
                    int readInt6 = parcel.readInt();
                    char c2 = (char) readInt6;
                    if (c2 == 1) {
                        i5 = l93.W(parcel, readInt6);
                    } else if (c2 != 2) {
                        l93.m0(parcel, readInt6);
                    } else {
                        arrayList3 = l93.z(parcel, readInt6, iw2.CREATOR);
                    }
                }
                l93.H(parcel, p02);
                return new kr4(arrayList3, i5);
            case 12:
                int p03 = l93.p0(parcel);
                int i9 = 0;
                while (parcel.dataPosition() < p03) {
                    int readInt7 = parcel.readInt();
                    char c3 = (char) readInt7;
                    if (c3 == 1) {
                        i4 = l93.W(parcel, readInt7);
                    } else if (c3 == 2) {
                        i9 = l93.W(parcel, readInt7);
                    } else if (c3 != 3) {
                        l93.m0(parcel, readInt7);
                    } else {
                        intent = (Intent) l93.w(parcel, readInt7, Intent.CREATOR);
                    }
                }
                l93.H(parcel, p03);
                return new bf5(i4, i9, intent);
            case 13:
                int p04 = l93.p0(parcel);
                long j = 0;
                int i10 = 0;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                Uri uri = null;
                String str6 = null;
                String str7 = null;
                ArrayList arrayList4 = null;
                String str8 = null;
                String str9 = null;
                while (parcel.dataPosition() < p04) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i10 = l93.W(parcel, readInt8);
                            break;
                        case 2:
                            str2 = l93.x(parcel, readInt8);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            str3 = l93.x(parcel, readInt8);
                            break;
                        case 4:
                            str4 = l93.x(parcel, readInt8);
                            break;
                        case 5:
                            str5 = l93.x(parcel, readInt8);
                            break;
                        case 6:
                            uri = (Uri) l93.w(parcel, readInt8, Uri.CREATOR);
                            break;
                        case 7:
                            str6 = l93.x(parcel, readInt8);
                            break;
                        case '\b':
                            j = l93.X(parcel, readInt8);
                            break;
                        case '\t':
                            str7 = l93.x(parcel, readInt8);
                            break;
                        case '\n':
                            arrayList4 = l93.z(parcel, readInt8, Scope.CREATOR);
                            break;
                        case 11:
                            str8 = l93.x(parcel, readInt8);
                            break;
                        case '\f':
                            str9 = l93.x(parcel, readInt8);
                            break;
                        default:
                            l93.m0(parcel, readInt8);
                            break;
                    }
                }
                l93.H(parcel, p04);
                return new GoogleSignInAccount(i10, str2, str3, str4, str5, uri, str6, j, str7, arrayList4, str8, str9);
            case 14:
                int p05 = l93.p0(parcel);
                int i11 = 0;
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                ArrayList arrayList5 = null;
                Account account2 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                while (parcel.dataPosition() < p05) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            i11 = l93.W(parcel, readInt9);
                            break;
                        case 2:
                            arrayList5 = l93.z(parcel, readInt9, Scope.CREATOR);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            account2 = (Account) l93.w(parcel, readInt9, Account.CREATOR);
                            break;
                        case 4:
                            z4 = l93.V(parcel, readInt9);
                            break;
                        case 5:
                            z5 = l93.V(parcel, readInt9);
                            break;
                        case 6:
                            z6 = l93.V(parcel, readInt9);
                            break;
                        case 7:
                            str10 = l93.x(parcel, readInt9);
                            break;
                        case '\b':
                            str11 = l93.x(parcel, readInt9);
                            break;
                        case '\t':
                            arrayList2 = l93.z(parcel, readInt9, nj1.CREATOR);
                            break;
                        case '\n':
                            str12 = l93.x(parcel, readInt9);
                            break;
                        default:
                            l93.m0(parcel, readInt9);
                            break;
                    }
                }
                l93.H(parcel, p05);
                return new GoogleSignInOptions(i11, arrayList5, account2, z4, z5, z6, str10, str11, GoogleSignInOptions.c(arrayList2), str12);
            case 15:
                int p06 = l93.p0(parcel);
                ArrayList<String> arrayList6 = null;
                String str13 = null;
                while (parcel.dataPosition() < p06) {
                    int readInt10 = parcel.readInt();
                    char c4 = (char) readInt10;
                    if (c4 == 1) {
                        int Z = l93.Z(parcel, readInt10);
                        int dataPosition = parcel.dataPosition();
                        if (Z == 0) {
                            arrayList6 = null;
                        } else {
                            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(dataPosition + Z);
                            arrayList6 = createStringArrayList;
                        }
                    } else if (c4 != 2) {
                        l93.m0(parcel, readInt10);
                    } else {
                        str13 = l93.x(parcel, readInt10);
                    }
                }
                l93.H(parcel, p06);
                return new yf5(str13, arrayList6);
            case WaveRetry.MAX_FAILURES /* 16 */:
                int p07 = l93.p0(parcel);
                ig5 ig5Var = null;
                while (parcel.dataPosition() < p07) {
                    int readInt11 = parcel.readInt();
                    char c5 = (char) readInt11;
                    if (c5 == 1) {
                        i3 = l93.W(parcel, readInt11);
                    } else if (c5 == 2) {
                        ka0Var = (ka0) l93.w(parcel, readInt11, ka0.CREATOR);
                    } else if (c5 != 3) {
                        l93.m0(parcel, readInt11);
                    } else {
                        ig5Var = (ig5) l93.w(parcel, readInt11, ig5.CREATOR);
                    }
                }
                l93.H(parcel, p07);
                return new dg5(i3, ka0Var, ig5Var);
            case 17:
                int p08 = l93.p0(parcel);
                long j2 = 0;
                long j3 = 0;
                int i12 = -1;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                String str14 = null;
                String str15 = null;
                while (parcel.dataPosition() < p08) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            i13 = l93.W(parcel, readInt12);
                            break;
                        case 2:
                            i14 = l93.W(parcel, readInt12);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            i15 = l93.W(parcel, readInt12);
                            break;
                        case 4:
                            j2 = l93.X(parcel, readInt12);
                            break;
                        case 5:
                            j3 = l93.X(parcel, readInt12);
                            break;
                        case 6:
                            str14 = l93.x(parcel, readInt12);
                            break;
                        case 7:
                            str15 = l93.x(parcel, readInt12);
                            break;
                        case '\b':
                            i16 = l93.W(parcel, readInt12);
                            break;
                        case '\t':
                            i12 = l93.W(parcel, readInt12);
                            break;
                        default:
                            l93.m0(parcel, readInt12);
                            break;
                    }
                }
                l93.H(parcel, p08);
                return new iw2(i13, i14, i15, j2, j3, str14, str15, i16, i12);
            case 18:
                int p09 = l93.p0(parcel);
                int i17 = 0;
                GoogleSignInAccount googleSignInAccount2 = null;
                while (parcel.dataPosition() < p09) {
                    int readInt13 = parcel.readInt();
                    char c6 = (char) readInt13;
                    if (c6 == 1) {
                        i2 = l93.W(parcel, readInt13);
                    } else if (c6 == 2) {
                        account = (Account) l93.w(parcel, readInt13, Account.CREATOR);
                    } else if (c6 == 3) {
                        i17 = l93.W(parcel, readInt13);
                    } else if (c6 != 4) {
                        l93.m0(parcel, readInt13);
                    } else {
                        googleSignInAccount2 = (GoogleSignInAccount) l93.w(parcel, readInt13, GoogleSignInAccount.CREATOR);
                    }
                }
                l93.H(parcel, p09);
                return new hg5(i2, account, i17, googleSignInAccount2);
            case 19:
                int p010 = l93.p0(parcel);
                int i18 = 0;
                boolean z7 = false;
                boolean z8 = false;
                IBinder iBinder = null;
                ka0 ka0Var2 = null;
                while (parcel.dataPosition() < p010) {
                    int readInt14 = parcel.readInt();
                    char c7 = (char) readInt14;
                    if (c7 == 1) {
                        i18 = l93.W(parcel, readInt14);
                    } else if (c7 == 2) {
                        int Z2 = l93.Z(parcel, readInt14);
                        int dataPosition2 = parcel.dataPosition();
                        if (Z2 == 0) {
                            iBinder = null;
                        } else {
                            IBinder readStrongBinder = parcel.readStrongBinder();
                            parcel.setDataPosition(dataPosition2 + Z2);
                            iBinder = readStrongBinder;
                        }
                    } else if (c7 == 3) {
                        ka0Var2 = (ka0) l93.w(parcel, readInt14, ka0.CREATOR);
                    } else if (c7 == 4) {
                        z7 = l93.V(parcel, readInt14);
                    } else if (c7 != 5) {
                        l93.m0(parcel, readInt14);
                    } else {
                        z8 = l93.V(parcel, readInt14);
                    }
                }
                l93.H(parcel, p010);
                return new ig5(i18, iBinder, ka0Var2, z7, z8);
            case 20:
                int p011 = l93.p0(parcel);
                String str16 = "";
                String str17 = "";
                while (parcel.dataPosition() < p011) {
                    int readInt15 = parcel.readInt();
                    char c8 = (char) readInt15;
                    if (c8 == 4) {
                        str16 = l93.x(parcel, readInt15);
                    } else if (c8 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) l93.w(parcel, readInt15, GoogleSignInAccount.CREATOR);
                    } else if (c8 != '\b') {
                        l93.m0(parcel, readInt15);
                    } else {
                        str17 = l93.x(parcel, readInt15);
                    }
                }
                l93.H(parcel, p011);
                return new SignInAccount(str16, googleSignInAccount, str17);
            case 21:
                int p012 = l93.p0(parcel);
                boolean z9 = false;
                int i19 = 0;
                boolean z10 = false;
                bs bsVar = null;
                yr yrVar = null;
                String str18 = null;
                as asVar = null;
                zr zrVar = null;
                while (parcel.dataPosition() < p012) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 1:
                            bsVar = (bs) l93.w(parcel, readInt16, bs.CREATOR);
                            break;
                        case 2:
                            yrVar = (yr) l93.w(parcel, readInt16, yr.CREATOR);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            str18 = l93.x(parcel, readInt16);
                            break;
                        case 4:
                            z9 = l93.V(parcel, readInt16);
                            break;
                        case 5:
                            i19 = l93.W(parcel, readInt16);
                            break;
                        case 6:
                            asVar = (as) l93.w(parcel, readInt16, as.CREATOR);
                            break;
                        case 7:
                            zrVar = (zr) l93.w(parcel, readInt16, zr.CREATOR);
                            break;
                        case '\b':
                            z10 = l93.V(parcel, readInt16);
                            break;
                        default:
                            l93.m0(parcel, readInt16);
                            break;
                    }
                }
                l93.H(parcel, p012);
                return new cs(bsVar, yrVar, str18, z9, i19, asVar, zrVar, z10);
            case 22:
                int p013 = l93.p0(parcel);
                while (parcel.dataPosition() < p013) {
                    int readInt17 = parcel.readInt();
                    if (((char) readInt17) != 1) {
                        l93.m0(parcel, readInt17);
                    } else {
                        pendingIntent2 = (PendingIntent) l93.w(parcel, readInt17, PendingIntent.CREATOR);
                    }
                }
                l93.H(parcel, p013);
                return new ds(pendingIntent2);
            case 23:
                int p014 = l93.p0(parcel);
                boolean z11 = false;
                int i20 = 0;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                while (parcel.dataPosition() < p014) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 1:
                            str19 = l93.x(parcel, readInt18);
                            break;
                        case 2:
                            str20 = l93.x(parcel, readInt18);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            str21 = l93.x(parcel, readInt18);
                            break;
                        case 4:
                            str22 = l93.x(parcel, readInt18);
                            break;
                        case 5:
                            z11 = l93.V(parcel, readInt18);
                            break;
                        case 6:
                            i20 = l93.W(parcel, readInt18);
                            break;
                        default:
                            l93.m0(parcel, readInt18);
                            break;
                    }
                }
                l93.H(parcel, p014);
                return new th1(str19, str20, str21, str22, z11, i20);
            case 24:
                int p015 = l93.p0(parcel);
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                ArrayList<String> arrayList7 = null;
                while (parcel.dataPosition() < p015) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 1:
                            z12 = l93.V(parcel, readInt19);
                            break;
                        case 2:
                            str23 = l93.x(parcel, readInt19);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            str24 = l93.x(parcel, readInt19);
                            break;
                        case 4:
                            z13 = l93.V(parcel, readInt19);
                            break;
                        case 5:
                            str25 = l93.x(parcel, readInt19);
                            break;
                        case 6:
                            int Z3 = l93.Z(parcel, readInt19);
                            int dataPosition3 = parcel.dataPosition();
                            if (Z3 == 0) {
                                arrayList7 = null;
                                break;
                            } else {
                                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                                parcel.setDataPosition(dataPosition3 + Z3);
                                arrayList7 = createStringArrayList2;
                                break;
                            }
                        case 7:
                            z14 = l93.V(parcel, readInt19);
                            break;
                        default:
                            l93.m0(parcel, readInt19);
                            break;
                    }
                }
                l93.H(parcel, p015);
                return new yr(z12, str23, str24, z13, str25, arrayList7, z14);
            case 25:
                int p016 = l93.p0(parcel);
                while (parcel.dataPosition() < p016) {
                    int readInt20 = parcel.readInt();
                    char c9 = (char) readInt20;
                    if (c9 == 1) {
                        z3 = l93.V(parcel, readInt20);
                    } else if (c9 != 2) {
                        l93.m0(parcel, readInt20);
                    } else {
                        str = l93.x(parcel, readInt20);
                    }
                }
                l93.H(parcel, p016);
                return new zr(z3, str);
            case 26:
                int p017 = l93.p0(parcel);
                String str26 = null;
                while (parcel.dataPosition() < p017) {
                    int readInt21 = parcel.readInt();
                    char c10 = (char) readInt21;
                    if (c10 == 1) {
                        z2 = l93.V(parcel, readInt21);
                    } else if (c10 == 2) {
                        bArr = l93.v(parcel, readInt21);
                    } else if (c10 != 3) {
                        l93.m0(parcel, readInt21);
                    } else {
                        str26 = l93.x(parcel, readInt21);
                    }
                }
                l93.H(parcel, p017);
                return new as(z2, bArr, str26);
            case 27:
                int p018 = l93.p0(parcel);
                while (parcel.dataPosition() < p018) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 1) {
                        l93.m0(parcel, readInt22);
                    } else {
                        z = l93.V(parcel, readInt22);
                    }
                }
                l93.H(parcel, p018);
                return new bs(z);
            case 28:
                int p019 = l93.p0(parcel);
                String str27 = null;
                while (parcel.dataPosition() < p019) {
                    int readInt23 = parcel.readInt();
                    char c11 = (char) readInt23;
                    if (c11 == 1) {
                        vd4Var = (vd4) l93.w(parcel, readInt23, vd4.CREATOR);
                    } else if (c11 == 2) {
                        str27 = l93.x(parcel, readInt23);
                    } else if (c11 != 3) {
                        l93.m0(parcel, readInt23);
                    } else {
                        i = l93.W(parcel, readInt23);
                    }
                }
                l93.H(parcel, p019);
                return new r44(vd4Var, str27, i);
            default:
                int p020 = l93.p0(parcel);
                while (parcel.dataPosition() < p020) {
                    int readInt24 = parcel.readInt();
                    if (((char) readInt24) != 1) {
                        l93.m0(parcel, readInt24);
                    } else {
                        pendingIntent = (PendingIntent) l93.w(parcel, readInt24, PendingIntent.CREATOR);
                    }
                }
                l93.H(parcel, p020);
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
