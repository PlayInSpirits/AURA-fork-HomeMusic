package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.model.Chronology;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.AlbumWithSongsID3;
import com.eddyizm.tempus.subsonic.models.Artist;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.ArtistWithAlbumsID3;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Directory;
import com.eddyizm.tempus.subsonic.models.DiscTitle;
import com.eddyizm.tempus.subsonic.models.ItemDate;
import com.eddyizm.tempus.subsonic.models.ReplayGainInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w4 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ w4(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Class cls;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        boolean zV = false;
        switch (this.a) {
            case 0:
                x4 x4Var = new x4();
                x4Var.n = parcel.readInt();
                return x4Var;
            case 1:
                parcel.getClass();
                return new o5(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 2:
                parcel.getClass();
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                Date date = (Date) parcel.readSerializable();
                Date date2 = (Date) parcel.readSerializable();
                int i = parcel.readInt();
                String string6 = parcel.readString();
                Date date3 = (Date) parcel.readSerializable();
                Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i2 = parcel.readInt();
                    arrayList = new ArrayList(i2);
                    for (int i3 = 0; i3 != i2; i3++) {
                        arrayList.add(parcel.readParcelable(AlbumID3.class.getClassLoader()));
                    }
                }
                String string7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i4 = parcel.readInt();
                    arrayList2 = new ArrayList(i4);
                    for (int i5 = 0; i5 != i4; i5++) {
                        arrayList2.add(parcel.readParcelable(AlbumID3.class.getClassLoader()));
                    }
                }
                if (parcel.readInt() == 0) {
                    cls = AlbumID3.class;
                    arrayList3 = null;
                } else {
                    int i6 = parcel.readInt();
                    arrayList3 = new ArrayList(i6);
                    cls = AlbumID3.class;
                    int i7 = 0;
                    while (i7 != i6) {
                        arrayList3.add(parcel.readParcelable(cls.getClassLoader()));
                        i7++;
                        i6 = i6;
                    }
                }
                String string8 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                String string9 = parcel.readString();
                ItemDate itemDate = (ItemDate) parcel.readParcelable(cls.getClassLoader());
                ItemDate itemDate2 = (ItemDate) parcel.readParcelable(cls.getClassLoader());
                Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                if (parcel.readInt() == 0) {
                    arrayList4 = null;
                } else {
                    int i8 = parcel.readInt();
                    ArrayList arrayList9 = new ArrayList(i8);
                    int i9 = 0;
                    while (i9 != i8) {
                        arrayList9.add(parcel.readParcelable(cls.getClassLoader()));
                        i9++;
                        i8 = i8;
                    }
                    arrayList4 = arrayList9;
                }
                return new AlbumID3(string, string2, string3, string4, string5, numValueOf, numValueOf2, lValueOf, date, date2, i, string6, date3, numValueOf3, arrayList, string7, arrayList2, arrayList3, string8, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, string9, itemDate, itemDate2, boolValueOf, arrayList4);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                parcel.getClass();
                if (parcel.readInt() == 0) {
                    arrayList5 = null;
                } else {
                    int i10 = parcel.readInt();
                    arrayList5 = new ArrayList(i10);
                    for (int i11 = 0; i11 != i10; i11++) {
                        arrayList5.add(parcel.readParcelable(AlbumWithSongsID3.class.getClassLoader()));
                    }
                }
                return new AlbumWithSongsID3(arrayList5);
            case 4:
                zg zgVar = new zg(parcel);
                zgVar.n = parcel.readByte() != 0;
                return zgVar;
            case 5:
                parcel.getClass();
                return new Artist(parcel.readString(), parcel.readString(), (Date) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
            case 6:
                parcel.getClass();
                return new ArtistID3(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), (Date) parcel.readSerializable());
            case 7:
                parcel.getClass();
                if (parcel.readInt() == 0) {
                    arrayList6 = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList6 = new ArrayList(i12);
                    for (int i13 = 0; i13 != i12; i13++) {
                        arrayList6.add(parcel.readParcelable(ArtistWithAlbumsID3.class.getClassLoader()));
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList7 = null;
                } else {
                    int i14 = parcel.readInt();
                    arrayList7 = new ArrayList(i14);
                    for (int i15 = 0; i15 != i14; i15++) {
                        arrayList7.add(parcel.readParcelable(ArtistWithAlbumsID3.class.getClassLoader()));
                    }
                }
                return new ArtistWithAlbumsID3(arrayList6, arrayList7);
            case 8:
                return new qo(parcel);
            case 9:
                return new ro(parcel);
            case 10:
                zo zoVar = new zo();
                zoVar.v = 255;
                zoVar.x = -2;
                zoVar.y = -2;
                zoVar.z = -2;
                zoVar.G = Boolean.TRUE;
                zoVar.n = parcel.readInt();
                zoVar.o = (Integer) parcel.readSerializable();
                zoVar.p = (Integer) parcel.readSerializable();
                zoVar.q = (Integer) parcel.readSerializable();
                zoVar.r = (Integer) parcel.readSerializable();
                zoVar.s = (Integer) parcel.readSerializable();
                zoVar.t = (Integer) parcel.readSerializable();
                zoVar.u = (Integer) parcel.readSerializable();
                zoVar.v = parcel.readInt();
                zoVar.w = parcel.readString();
                zoVar.x = parcel.readInt();
                zoVar.y = parcel.readInt();
                zoVar.z = parcel.readInt();
                zoVar.B = parcel.readString();
                zoVar.C = parcel.readString();
                zoVar.D = parcel.readInt();
                zoVar.F = (Integer) parcel.readSerializable();
                zoVar.H = (Integer) parcel.readSerializable();
                zoVar.I = (Integer) parcel.readSerializable();
                zoVar.J = (Integer) parcel.readSerializable();
                zoVar.K = (Integer) parcel.readSerializable();
                zoVar.L = (Integer) parcel.readSerializable();
                zoVar.M = (Integer) parcel.readSerializable();
                zoVar.P = (Integer) parcel.readSerializable();
                zoVar.N = (Integer) parcel.readSerializable();
                zoVar.O = (Integer) parcel.readSerializable();
                zoVar.G = (Boolean) parcel.readSerializable();
                zoVar.A = (Locale) parcel.readSerializable();
                zoVar.Q = (Boolean) parcel.readSerializable();
                return zoVar;
            case 11:
                tq tqVar = new tq(parcel);
                tqVar.n = parcel.readFloat();
                tqVar.o = parcel.readFloat();
                ArrayList arrayList10 = new ArrayList();
                tqVar.p = arrayList10;
                parcel.readList(arrayList10, Float.class.getClassLoader());
                tqVar.q = parcel.readFloat();
                tqVar.r = parcel.createBooleanArray()[0];
                return tqVar;
            case 12:
                return new dy((ix2) parcel.readParcelable(ix2.class.getClassLoader()), (ix2) parcel.readParcelable(ix2.class.getClassLoader()), (pi0) parcel.readParcelable(pi0.class.getClassLoader()), (ix2) parcel.readParcelable(ix2.class.getClassLoader()), parcel.readInt());
            case 13:
                parcel.getClass();
                return new Child(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (Date) parcel.readSerializable(), (Date) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : ReplayGainInfo.CREATOR.createFromParcel(parcel), parcel.readString());
            case 14:
                parcel.getClass();
                return new Chronology(parcel.readString(), parcel.readLong(), parcel.readString());
            case 15:
                int iP0 = l93.p0(parcel);
                while (parcel.dataPosition() < iP0) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        l93.m0(parcel, i16);
                    } else {
                        zV = l93.V(parcel, i16);
                    }
                }
                l93.H(parcel, iP0);
                return new o30(zV);
            case WaveRetry.MAX_FAILURES /* 16 */:
                int iP1 = l93.p0(parcel);
                Bundle bundleU = null;
                while (parcel.dataPosition() < iP1) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 1) {
                        l93.m0(parcel, i17);
                    } else {
                        bundleU = l93.u(parcel, i17);
                    }
                }
                l93.H(parcel, iP1);
                return new pf0(bundleU);
            case 17:
                int iP2 = l93.p0(parcel);
                Bundle bundleU2 = null;
                while (parcel.dataPosition() < iP2) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 1) {
                        l93.m0(parcel, i18);
                    } else {
                        bundleU2 = l93.u(parcel, i18);
                    }
                }
                l93.H(parcel, iP2);
                return new rf0(bundleU2);
            case 18:
                int iP3 = l93.p0(parcel);
                Bundle bundleU3 = null;
                String strX = null;
                while (parcel.dataPosition() < iP3) {
                    int i19 = parcel.readInt();
                    char c = (char) i19;
                    if (c == 1) {
                        strX = l93.x(parcel, i19);
                    } else if (c != 2) {
                        l93.m0(parcel, i19);
                    } else {
                        bundleU3 = l93.u(parcel, i19);
                    }
                }
                l93.H(parcel, iP3);
                return new uf0(strX, bundleU3);
            case 19:
                int iP4 = l93.p0(parcel);
                String strX2 = "";
                String strX3 = strX2;
                String strX4 = strX3;
                Bundle bundleU4 = null;
                Bundle bundleU5 = null;
                String strX5 = null;
                while (parcel.dataPosition() < iP4) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            strX2 = l93.x(parcel, i20);
                            break;
                        case 2:
                            bundleU4 = l93.u(parcel, i20);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            bundleU5 = l93.u(parcel, i20);
                            break;
                        case 4:
                            strX5 = l93.x(parcel, i20);
                            break;
                        case 5:
                            strX3 = l93.x(parcel, i20);
                            break;
                        case 6:
                            strX4 = l93.x(parcel, i20);
                            break;
                        default:
                            l93.m0(parcel, i20);
                            break;
                    }
                }
                l93.H(parcel, iP4);
                return new wf0(strX2, bundleU4, bundleU5, strX5, strX3, strX4);
            case 20:
                return new pi0(parcel.readLong());
            case 21:
                return new ql0(parcel.readInt());
            case 22:
                parcel.getClass();
                if (parcel.readInt() == 0) {
                    arrayList8 = null;
                } else {
                    int i21 = parcel.readInt();
                    ArrayList arrayList11 = new ArrayList(i21);
                    for (int i22 = 0; i22 != i21; i22++) {
                        arrayList11.add(parcel.readParcelable(Directory.class.getClassLoader()));
                    }
                    arrayList8 = arrayList11;
                }
                return new Directory(arrayList8, parcel.readString(), parcel.readString(), parcel.readString(), (Date) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            case 23:
                parcel.getClass();
                return new DiscTitle(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            case 24:
                parcel.getClass();
                return new Download(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
            case 25:
                return new tt0(parcel);
            case 26:
                return new rt0(parcel);
            case 27:
                return new st0(parcel);
            case 28:
                return new ow0(parcel);
            default:
                return new nw0(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new x4[i];
            case 1:
                return new o5[i];
            case 2:
                return new AlbumID3[i];
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return new AlbumWithSongsID3[i];
            case 4:
                return new zg[i];
            case 5:
                return new Artist[i];
            case 6:
                return new ArtistID3[i];
            case 7:
                return new ArtistWithAlbumsID3[i];
            case 8:
                return new qo[i];
            case 9:
                return new ro[i];
            case 10:
                return new zo[i];
            case 11:
                return new tq[i];
            case 12:
                return new dy[i];
            case 13:
                return new Child[i];
            case 14:
                return new Chronology[i];
            case 15:
                return new o30[i];
            case WaveRetry.MAX_FAILURES /* 16 */:
                return new pf0[i];
            case 17:
                return new rf0[i];
            case 18:
                return new uf0[i];
            case 19:
                return new wf0[i];
            case 20:
                return new pi0[i];
            case 21:
                return new ql0[i];
            case 22:
                return new Directory[i];
            case 23:
                return new DiscTitle[i];
            case 24:
                return new Download[i];
            case 25:
                return new tt0[i];
            case 26:
                return new rt0[i];
            case 27:
                return new st0[i];
            case 28:
                return new ow0[i];
            default:
                return new nw0[i];
        }
    }
}
