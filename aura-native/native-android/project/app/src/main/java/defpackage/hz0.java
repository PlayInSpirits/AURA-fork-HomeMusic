package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.model.Favorite;
import com.eddyizm.tempus.subsonic.models.Genre;
import com.eddyizm.tempus.subsonic.models.InternetRadioStation;
import com.eddyizm.tempus.subsonic.models.ItemDate;
import com.eddyizm.tempus.subsonic.models.ItemGenre;
import com.eddyizm.tempus.subsonic.models.MusicFolder;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import defpackage.hz0;
import java.util.ArrayList;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hz0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ hz0(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayListZ = null;
        Bundle bundleU = null;
        Bundle bundleU2 = null;
        uf0 uf0Var = null;
        switch (this.a) {
            case 0:
                return new iz0(parcel);
            case 1:
                parcel.getClass();
                long j = parcel.readLong();
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean z = true;
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z = false;
                }
                return new Favorite(j, string, string2, string3, z);
            case 2:
                gd1 gd1Var = new gd1();
                gd1Var.n = parcel.readString();
                gd1Var.o = parcel.readInt();
                return gd1Var;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                nd1 nd1Var = new nd1();
                nd1Var.r = null;
                nd1Var.s = new ArrayList();
                nd1Var.t = new ArrayList();
                nd1Var.n = parcel.createStringArrayList();
                nd1Var.o = parcel.createStringArrayList();
                nd1Var.p = (qo[]) parcel.createTypedArray(qo.CREATOR);
                nd1Var.q = parcel.readInt();
                nd1Var.r = parcel.readString();
                nd1Var.s = parcel.createStringArrayList();
                nd1Var.t = parcel.createTypedArrayList(ro.CREATOR);
                nd1Var.u = parcel.createTypedArrayList(gd1.CREATOR);
                return nd1Var;
            case 4:
                return new be1(parcel);
            case 5:
                parcel.getClass();
                return new Genre(parcel.readString(), parcel.readInt(), parcel.readInt());
            case 6:
                int iP0 = l93.p0(parcel);
                Bundle bundleU3 = null;
                String strX = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < iP0) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        arrayListZ = l93.z(parcel, i, wf0.CREATOR);
                    } else if (c == 2) {
                        bundleU3 = l93.u(parcel, i);
                    } else if (c == 3) {
                        strX = l93.x(parcel, i);
                    } else if (c != 4) {
                        l93.m0(parcel, i);
                    } else {
                        resultReceiver = (ResultReceiver) l93.w(parcel, i, ResultReceiver.CREATOR);
                    }
                }
                l93.H(parcel, iP0);
                return new GetCredentialRequest(arrayListZ, bundleU3, strX, resultReceiver);
            case 7:
                int iP1 = l93.p0(parcel);
                while (parcel.dataPosition() < iP1) {
                    int i2 = parcel.readInt();
                    if (((char) i2) != 1) {
                        l93.m0(parcel, i2);
                    } else {
                        uf0Var = (uf0) l93.w(parcel, i2, uf0.CREATOR);
                    }
                }
                l93.H(parcel, iP1);
                return new lh1(uf0Var);
            case 8:
                int iP2 = l93.p0(parcel);
                while (parcel.dataPosition() < iP2) {
                    int i3 = parcel.readInt();
                    if (((char) i3) != 1) {
                        l93.m0(parcel, i3);
                    } else {
                        bundleU2 = l93.u(parcel, i3);
                    }
                }
                l93.H(parcel, iP2);
                return new qh1(bundleU2);
            case 9:
                int iP3 = l93.p0(parcel);
                while (parcel.dataPosition() < iP3) {
                    int i4 = parcel.readInt();
                    if (((char) i4) != 1) {
                        l93.m0(parcel, i4);
                    } else {
                        bundleU = l93.u(parcel, i4);
                    }
                }
                l93.H(parcel, iP3);
                return new rh1(bundleU);
            case 10:
                parcel.getClass();
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new p02((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 11:
                parcel.getClass();
                return new InternetRadioStation(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 12:
                parcel.getClass();
                return new ItemDate(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 13:
                parcel.getClass();
                return new ItemGenre(parcel.readString());
            case 14:
                bb2 bb2Var = new bb2();
                bb2Var.n = parcel.readInt();
                bb2Var.o = parcel.readInt();
                bb2Var.p = parcel.readInt() == 1;
                return bb2Var;
            case 15:
                return new cc2(parcel);
            case WaveRetry.MAX_FAILURES /* 16 */:
                rh2 rh2Var = new rh2(parcel);
                rh2Var.n = ((Integer) parcel.readValue(rh2.class.getClassLoader())).intValue();
                return rh2Var;
            case 17:
                return new ij2(parcel);
            case 18:
                return new MediaBrowserCompat$MediaItem(parcel);
            case 19:
                return pm2.a((MediaDescription) MediaDescription.CREATOR.createFromParcel(parcel));
            case 20:
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
            case 21:
                return new eo2(parcel);
            case 22:
                return new MediaMetadataCompat(parcel);
            case 23:
                return new or2(parcel);
            case 24:
                return new MediaSessionCompat$QueueItem(parcel);
            case 25:
                MediaSession.Token token = (MediaSession.Token) parcel.readParcelable(null);
                token.getClass();
                return new pr2(token, null);
            case 26:
                final Parcelable parcelable2 = parcel.readParcelable(null);
                return new Parcelable(parcelable2) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new hz0(26);
                    public final Object n = new Object();
                    public final Object o;

                    {
                        this.o = parcelable2;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof MediaSessionCompat$Token)) {
                            return false;
                        }
                        Object obj2 = ((MediaSessionCompat$Token) obj).o;
                        Object obj3 = this.o;
                        if (obj3 == null) {
                            return obj2 == null;
                        }
                        if (obj2 == null) {
                            return false;
                        }
                        return obj3.equals(obj2);
                    }

                    public final int hashCode() {
                        Object obj = this.o;
                        if (obj == null) {
                            return 0;
                        }
                        return obj.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i5) {
                        parcel2.writeParcelable((Parcelable) this.o, i5);
                    }
                };
            case 27:
                return ix2.b(parcel.readInt(), parcel.readInt());
            case 28:
                return new ez2(parcel);
            default:
                parcel.getClass();
                return new MusicFolder(parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new iz0[i];
            case 1:
                return new Favorite[i];
            case 2:
                return new gd1[i];
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return new nd1[i];
            case 4:
                return new be1[i];
            case 5:
                return new Genre[i];
            case 6:
                return new GetCredentialRequest[i];
            case 7:
                return new lh1[i];
            case 8:
                return new qh1[i];
            case 9:
                return new rh1[i];
            case 10:
                return new p02[i];
            case 11:
                return new InternetRadioStation[i];
            case 12:
                return new ItemDate[i];
            case 13:
                return new ItemGenre[i];
            case 14:
                return new bb2[i];
            case 15:
                return new cc2[i];
            case WaveRetry.MAX_FAILURES /* 16 */:
                return new rh2[i];
            case 17:
                return new ij2[i];
            case 18:
                return new MediaBrowserCompat$MediaItem[i];
            case 19:
                return new pm2[i];
            case 20:
                return new MediaDescriptionCompat[i];
            case 21:
                return new eo2[i];
            case 22:
                return new MediaMetadataCompat[i];
            case 23:
                return new or2[i];
            case 24:
                return new MediaSessionCompat$QueueItem[i];
            case 25:
                return new pr2[i];
            case 26:
                return new MediaSessionCompat$Token[i];
            case 27:
                return new ix2[i];
            case 28:
                return new ez2[i];
            default:
                return new MusicFolder[i];
        }
    }
}
