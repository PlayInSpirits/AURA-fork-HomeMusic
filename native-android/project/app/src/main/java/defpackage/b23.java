package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.versionedparcelable.ParcelImpl;
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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b23 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ b23(int r1) {
        this.a = r1;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r28) {
        PendingIntent r4 = null;
        Float r5 = null;
        PendingIntent r6 = null;
        switch(this.a) {
            case 0: goto L147;
            case 1: goto L145;
            case 2: goto L143;
            case 3: goto L141;
            case 4: goto L140;
            case 5: goto L138;
            case 6: goto L136;
            case 7: goto L134;
            case 8: goto L131;
            case 9: goto L122;
            case 10: goto L113;
            case 11: goto L112;
            case 12: goto L110;
            case 13: goto L108;
            case 14: goto L105;
            case 15: goto L97;
            case 16: goto L88;
            case 17: goto L60;
            case 18: goto L59;
            case 19: goto L57;
            case 20: goto L54;
            case 21: goto L53;
            case 22: goto L51;
            case 23: goto L48;
            case 24: goto L46;
            case 25: goto L40;
            case 26: goto L34;
            case 27: goto L8;
            case 28: goto L7;
            default: goto L5;
        };
    L8:
        r28.getClass();
        if (r28.readInt() != 0) goto L11;
        Float r3 = null;
    L13:
        if (r28.readInt() != 0) goto L15;
        Float r0 = null;
    L17:
        if (r28.readInt() != 0) goto L19;
        Float r7 = null;
    L21:
        if (r28.readInt() != 0) goto L23;
        Float r8 = null;
    L25:
        if (r28.readInt() != 0) goto L27;
        Float r9 = null;
    L29:
        if (r28.readInt() == 0) goto L33;
        r5 = Float.valueOf(r28.readFloat());
    L33:
        return new ReplayGainInfo(r3, r0, r7, r8, r9, r5);
    L27:
        r9 = Float.valueOf(r28.readFloat());
        goto L29
    L23:
        r8 = Float.valueOf(r28.readFloat());
        goto L25
    L19:
        r7 = Float.valueOf(r28.readFloat());
        goto L21
    L15:
        r0 = Float.valueOf(r28.readFloat());
        goto L17
    L11:
        r3 = Float.valueOf(r28.readFloat());
        goto L13
    L34:
        int r1 = l93.p0(r28);
    L36:
        if (r28.dataPosition() >= r1) goto L38;
        l93.m0(r28, r28.readInt());
        goto L36
    L38:
        l93.H(r28, r1);
        return new dy3();
    L40:
        int r2 = l93.p0(r28);
    L42:
        if (r28.dataPosition() >= r2) goto L44;
        l93.m0(r28, r28.readInt());
        goto L42
    L44:
        l93.H(r28, r2);
        return new vx3();
    L46:
        r28.getClass();
        return new RecordLabel(r28.readString());
    L48:
        r28.getClass();
        return new RecentSearch(r28.readString(), r28.readLong());
    L54:
        r28.getClass();
        return new Queue(r28.readString(), r28.readInt(), r28.readLong(), r28.readLong(), r28.readString());
    L60:
        r28.getClass();
        String r10 = r28.readString();
        String r11 = r28.readString();
        if (r28.readInt() == 0) goto L63;
        boolean r12 = false;
        boolean r13 = true;
    L64:
        String r14 = r28.readString();
        String r15 = r28.readString();
        String r16 = r28.readString();
        if (r28.readInt() != 0) goto L68;
        Integer r17 = null;
    L69:
        String r18 = r28.readString();
        String r19 = r28.readString();
        if (r28.readInt() != 0) goto L73;
        Long r110 = null;
    L74:
        String r111 = r28.readString();
        Integer r112 = null;
        String r113 = r28.readString();
        if (r28.readInt() != 0) goto L77;
        Integer r114 = null;
    L79:
        if (r28.readInt() == 0) goto L82;
        r112 = Integer.valueOf(r28.readInt());
    L82:
        String r115 = r28.readString();
        if (r28.readInt() == 0) goto L85;
        Integer r116 = r114;
        boolean r117 = true;
    L87:
        return new PodcastEpisode(r10, r11, r13, r14, r15, r16, r17, r18, r19, r110, r111, r113, r116, r112, r115, r117, (Date) r28.readSerializable(), r28.readString(), r28.readString(), r28.readString(), r28.readString(), r28.readString(), r28.readString(), (Date) r28.readSerializable());
    L85:
        Integer r26 = r114;
        r117 = r12;
        r116 = r26;
        goto L87
    L77:
        r114 = Integer.valueOf(r28.readInt());
        goto L79
    L73:
        r110 = Long.valueOf(r28.readLong());
        goto L74
    L68:
        r17 = Integer.valueOf(r28.readInt());
        goto L69
    L63:
        r13 = false;
        r12 = false;
        goto L64
    L88:
        r28.getClass();
        if (r28.readInt() != 0) goto L91;
        ArrayList r20 = null;
    L96:
        return new PodcastChannel(r20, r28.readString(), r28.readString(), r28.readString(), r28.readString(), r28.readString(), r28.readString(), r28.readString(), r28.readString());
    L91:
        int r21 = r28.readInt();
        ArrayList r22 = new ArrayList(r21);
        int r23 = 0;
    L92:
        if (r23 == r21) goto L94;
        r22.add(PodcastEpisode.CREATOR.createFromParcel(r28));
        r23 = r23 + 1;
        goto L92
    L94:
        r20 = r22;
        goto L96
    L97:
        r28.getClass();
        if (r28.readInt() != 0) goto L100;
        ArrayList r24 = null;
    L104:
        return new PlaylistWithSongs(r24);
    L100:
        int r25 = r28.readInt();
        r24 = new ArrayList(r25);
        int r27 = 0;
    L101:
        if (r27 == r25) goto L104;
        r24.add(r28.readParcelable(PlaylistWithSongs.class.getClassLoader()));
        r27 = r27 + 1;
        goto L101
    L105:
        r28.getClass();
        return new Playlist(r28.readString(), r28.readString(), r28.readLong(), r28.readString());
    L113:
        int r29 = l93.p0(r28);
    L115:
        if (r28.dataPosition() >= r29) goto L120;
        int r30 = r28.readInt();
        if (((char) r30) != 1) goto L118;
        r6 = (PendingIntent) l93.w(r28, r30, PendingIntent.CREATOR);
        goto L115
    L118:
        l93.m0(r28, r30);
        goto L115
    L120:
        l93.H(r28, r29);
        return new if3(r6);
    L122:
        int r31 = l93.p0(r28);
    L124:
        if (r28.dataPosition() >= r31) goto L129;
        int r32 = r28.readInt();
        if (((char) r32) != 1) goto L127;
        r4 = (PendingIntent) l93.w(r28, r32, PendingIntent.CREATOR);
        goto L124
    L127:
        l93.m0(r28, r32);
        goto L124
    L129:
        l93.H(r28, r31);
        return new hf3(r4);
    L131:
        ParcelableVolumeInfo r33 = new ParcelableVolumeInfo();
        r33.n = r28.readInt();
        r33.p = r28.readInt();
        r33.q = r28.readInt();
        r33.r = r28.readInt();
        r33.o = r28.readInt();
        return r33;
    L141:
        r28.getClass();
        return new NowPlayingEntry(r28.readString(), r28.readString(), r28.readInt(), r28.readInt(), r28.readString());
    L143:
        h53 r34 = new h53(r28);
        r34.n = r28.readInt();
        return r34;
    L145:
        n33 r35 = new n33();
        r35.n = r28.readInt();
        r35.o = (ae3) r28.readParcelable(n33.class.getClassLoader());
        return r35;
    L147:
        r28.getClass();
        return new c23(r28);
    L5:
        return new v14(r28);
    L7:
        return new h04(r28.readInt());
    L51:
        return new RatingCompat(r28.readInt(), r28.readFloat());
    L53:
        return new mu3(r28.readInt(), r28.readFloat());
    L57:
        return new lp3(r28);
    L59:
        return new ap3(r28);
    L108:
        return new di3(r28);
    L110:
        return new PlaybackStateCompat(r28);
    L112:
        return new ei3(r28);
    L134:
        return new xd3(r28.readLong());
    L136:
        return new wd3(r28.readInt());
    L138:
        return new vd3(r28.readFloat());
    L140:
        return new ParcelImpl(r28);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r1) {
        switch(this.a) {
            case 0: goto L63;
            case 1: goto L61;
            case 2: goto L59;
            case 3: goto L57;
            case 4: goto L55;
            case 5: goto L53;
            case 6: goto L51;
            case 7: goto L49;
            case 8: goto L47;
            case 9: goto L45;
            case 10: goto L43;
            case 11: goto L41;
            case 12: goto L39;
            case 13: goto L37;
            case 14: goto L35;
            case 15: goto L33;
            case 16: goto L31;
            case 17: goto L29;
            case 18: goto L27;
            case 19: goto L25;
            case 20: goto L23;
            case 21: goto L21;
            case 22: goto L19;
            case 23: goto L17;
            case 24: goto L15;
            case 25: goto L13;
            case 26: goto L11;
            case 27: goto L9;
            case 28: goto L7;
            default: goto L5;
        };
    L5:
        return new v14[r1];
    L7:
        return new h04[r1];
    L9:
        return new ReplayGainInfo[r1];
    L11:
        return new dy3[r1];
    L13:
        return new vx3[r1];
    L15:
        return new RecordLabel[r1];
    L17:
        return new RecentSearch[r1];
    L19:
        return new RatingCompat[r1];
    L21:
        return new mu3[r1];
    L23:
        return new Queue[r1];
    L25:
        return new lp3[r1];
    L27:
        return new ap3[r1];
    L29:
        return new PodcastEpisode[r1];
    L31:
        return new PodcastChannel[r1];
    L33:
        return new PlaylistWithSongs[r1];
    L35:
        return new Playlist[r1];
    L37:
        return new di3[r1];
    L39:
        return new PlaybackStateCompat[r1];
    L41:
        return new ei3[r1];
    L43:
        return new if3[r1];
    L45:
        return new hf3[r1];
    L47:
        return new ParcelableVolumeInfo[r1];
    L49:
        return new xd3[r1];
    L51:
        return new wd3[r1];
    L53:
        return new vd3[r1];
    L55:
        return new ParcelImpl[r1];
    L57:
        return new NowPlayingEntry[r1];
    L59:
        return new h53[r1];
    L61:
        return new n33[r1];
    L63:
        return new c23[r1];
    }
}
