package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.versionedparcelable.ParcelImpl;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.model.Queue;
import com.eddyizm.tempus.model.RecentSearch;
import com.eddyizm.tempus.subsonic.models.NowPlayingEntry;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.eddyizm.tempus.subsonic.models.PlaylistWithSongs;
import com.eddyizm.tempus.subsonic.models.PodcastChannel;
import com.eddyizm.tempus.subsonic.models.PodcastEpisode;
import com.eddyizm.tempus.subsonic.models.RecordLabel;
import com.eddyizm.tempus.subsonic.models.ReplayGainInfo;
import java.util.ArrayList;
import java.util.Date;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b23 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ b23(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        boolean z2;
        boolean z3;
        Integer num;
        PendingIntent pendingIntent = null;
        PendingIntent pendingIntent2 = null;
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new c23(parcel);
            case 1:
                n33 n33Var = new n33();
                n33Var.n = parcel.readInt();
                n33Var.o = (ae3) parcel.readParcelable(n33.class.getClassLoader());
                return n33Var;
            case 2:
                h53 h53Var = new h53(parcel);
                h53Var.n = parcel.readInt();
                return h53Var;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                parcel.getClass();
                return new NowPlayingEntry(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
            case 4:
                return new ParcelImpl(parcel);
            case 5:
                return new vd3(parcel.readFloat());
            case 6:
                return new wd3(parcel.readInt());
            case 7:
                return new xd3(parcel.readLong());
            case 8:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.n = parcel.readInt();
                parcelableVolumeInfo.p = parcel.readInt();
                parcelableVolumeInfo.q = parcel.readInt();
                parcelableVolumeInfo.r = parcel.readInt();
                parcelableVolumeInfo.o = parcel.readInt();
                return parcelableVolumeInfo;
            case 9:
                int iP0 = l93.p0(parcel);
                while (parcel.dataPosition() < iP0) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        l93.m0(parcel, i);
                    } else {
                        pendingIntent = (PendingIntent) l93.w(parcel, i, PendingIntent.CREATOR);
                    }
                }
                l93.H(parcel, iP0);
                return new hf3(pendingIntent);
            case 10:
                int iP1 = l93.p0(parcel);
                while (parcel.dataPosition() < iP1) {
                    int i2 = parcel.readInt();
                    if (((char) i2) != 1) {
                        l93.m0(parcel, i2);
                    } else {
                        pendingIntent2 = (PendingIntent) l93.w(parcel, i2, PendingIntent.CREATOR);
                    }
                }
                l93.H(parcel, iP1);
                return new if3(pendingIntent2);
            case 11:
                return new ei3(parcel);
            case 12:
                return new PlaybackStateCompat(parcel);
            case 13:
                return new di3(parcel);
            case 14:
                parcel.getClass();
                return new Playlist(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString());
            case 15:
                parcel.getClass();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i3 = parcel.readInt();
                    arrayList = new ArrayList(i3);
                    for (int i4 = 0; i4 != i3; i4++) {
                        arrayList.add(parcel.readParcelable(PlaylistWithSongs.class.getClassLoader()));
                    }
                }
                return new PlaylistWithSongs(arrayList);
            case WaveRetry.MAX_FAILURES /* 16 */:
                parcel.getClass();
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i5 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i5);
                    for (int i6 = 0; i6 != i5; i6++) {
                        arrayList3.add(PodcastEpisode.CREATOR.createFromParcel(parcel));
                    }
                    arrayList2 = arrayList3;
                }
                return new PodcastChannel(arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 17:
                parcel.getClass();
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z2 = false;
                    z = true;
                } else {
                    z = false;
                    z2 = false;
                }
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf3 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                String string10 = parcel.readString();
                if (parcel.readInt() != 0) {
                    num = numValueOf2;
                    z3 = true;
                } else {
                    Integer num2 = numValueOf2;
                    z3 = z2;
                    num = num2;
                }
                return new PodcastEpisode(string, string2, z, string3, string4, string5, numValueOf, string6, string7, lValueOf, string8, string9, num, numValueOf3, string10, z3, (Date) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Date) parcel.readSerializable());
            case 18:
                return new ap3(parcel);
            case 19:
                return new lp3(parcel);
            case 20:
                parcel.getClass();
                return new Queue(parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readString());
            case 21:
                return new mu3(parcel.readInt(), parcel.readFloat());
            case 22:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 23:
                parcel.getClass();
                return new RecentSearch(parcel.readString(), parcel.readLong());
            case 24:
                parcel.getClass();
                return new RecordLabel(parcel.readString());
            case 25:
                int iP2 = l93.p0(parcel);
                while (parcel.dataPosition() < iP2) {
                    l93.m0(parcel, parcel.readInt());
                }
                l93.H(parcel, iP2);
                return new vx3();
            case 26:
                int iP3 = l93.p0(parcel);
                while (parcel.dataPosition() < iP3) {
                    l93.m0(parcel, parcel.readInt());
                }
                l93.H(parcel, iP3);
                return new dy3();
            case 27:
                parcel.getClass();
                return new ReplayGainInfo(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            case 28:
                return new h04(parcel.readInt());
            default:
                return new v14(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new c23[i];
            case 1:
                return new n33[i];
            case 2:
                return new h53[i];
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return new NowPlayingEntry[i];
            case 4:
                return new ParcelImpl[i];
            case 5:
                return new vd3[i];
            case 6:
                return new wd3[i];
            case 7:
                return new xd3[i];
            case 8:
                return new ParcelableVolumeInfo[i];
            case 9:
                return new hf3[i];
            case 10:
                return new if3[i];
            case 11:
                return new ei3[i];
            case 12:
                return new PlaybackStateCompat[i];
            case 13:
                return new di3[i];
            case 14:
                return new Playlist[i];
            case 15:
                return new PlaylistWithSongs[i];
            case WaveRetry.MAX_FAILURES /* 16 */:
                return new PodcastChannel[i];
            case 17:
                return new PodcastEpisode[i];
            case 18:
                return new ap3[i];
            case 19:
                return new lp3[i];
            case 20:
                return new Queue[i];
            case 21:
                return new mu3[i];
            case 22:
                return new RatingCompat[i];
            case 23:
                return new RecentSearch[i];
            case 24:
                return new RecordLabel[i];
            case 25:
                return new vx3[i];
            case 26:
                return new dy3[i];
            case 27:
                return new ReplayGainInfo[i];
            case 28:
                return new h04[i];
            default:
                return new v14[i];
        }
    }
}
