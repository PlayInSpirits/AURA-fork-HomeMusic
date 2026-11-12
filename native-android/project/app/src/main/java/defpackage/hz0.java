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
import com.eddyizm.tempus.model.Favorite;
import com.eddyizm.tempus.subsonic.models.Genre;
import com.eddyizm.tempus.subsonic.models.InternetRadioStation;
import com.eddyizm.tempus.subsonic.models.ItemDate;
import com.eddyizm.tempus.subsonic.models.ItemGenre;
import com.eddyizm.tempus.subsonic.models.MusicFolder;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hz0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ hz0(int r1) {
        this.a = r1;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r11) {
        boolean r0 = false;
        ArrayList r2 = null;
        Integer r3 = null;
        Bundle r4 = null;
        Bundle r5 = null;
        uf0 r6 = null;
        switch(this.a) {
            case 0: goto L119;
            case 1: goto L112;
            case 2: goto L110;
            case 3: goto L108;
            case 4: goto L107;
            case 5: goto L104;
            case 6: goto L86;
            case 7: goto L77;
            case 8: goto L68;
            case 9: goto L59;
            case 10: goto L57;
            case 11: goto L55;
            case 12: goto L41;
            case 13: goto L39;
            case 14: goto L34;
            case 15: goto L33;
            case 16: goto L30;
            case 17: goto L29;
            case 18: goto L27;
            case 19: goto L25;
            case 20: goto L23;
            case 21: goto L21;
            case 22: goto L19;
            case 23: goto L17;
            case 24: goto L15;
            case 25: goto L12;
            case 26: goto L10;
            case 27: goto L9;
            case 28: goto L7;
            default: goto L4;
        };
    L4:
        r11.getClass();
        return new MusicFolder(r11.readString(), r11.readString());
    L10:
        final Parcelable r10 = r11.readParcelable(null);
        return new MediaSessionCompat$Token(r10);
    L12:
        MediaSession.Token r12 = (MediaSession.Token) r11.readParcelable(null);
        r12.getClass();
        return new pr2(r12, null);
    L30:
        rh2 r13 = new rh2(r11);
        r13.n = ((Integer) r11.readValue(rh2.class.getClassLoader())).intValue();
        return r13;
    L34:
        bb2 r14 = new bb2();
        r14.n = r11.readInt();
        r14.o = r11.readInt();
        if (r11.readInt() != 1) goto L37;
        r0 = true;
    L37:
        r14.p = r0;
        return r14;
    L39:
        r11.getClass();
        return new ItemGenre(r11.readString());
    L41:
        r11.getClass();
        if (r11.readInt() != 0) goto L44;
        Integer r1 = null;
    L46:
        if (r11.readInt() != 0) goto L48;
        Integer r7 = null;
    L50:
        if (r11.readInt() == 0) goto L54;
        r3 = Integer.valueOf(r11.readInt());
    L54:
        return new ItemDate(r1, r7, r3);
    L48:
        r7 = Integer.valueOf(r11.readInt());
        goto L50
    L44:
        r1 = Integer.valueOf(r11.readInt());
        goto L46
    L55:
        r11.getClass();
        return new InternetRadioStation(r11.readString(), r11.readString(), r11.readString(), r11.readString(), r11.readString(), r11.readString());
    L57:
        r11.getClass();
        Parcelable r8 = r11.readParcelable(IntentSender.class.getClassLoader());
        r8.getClass();
        return new p02((IntentSender) r8, (Intent) r11.readParcelable(Intent.class.getClassLoader()), r11.readInt(), r11.readInt());
    L59:
        int r15 = l93.p0(r11);
    L61:
        if (r11.dataPosition() >= r15) goto L66;
        int r9 = r11.readInt();
        if (((char) r9) != 1) goto L64;
        r4 = l93.u(r11, r9);
        goto L61
    L64:
        l93.m0(r11, r9);
        goto L61
    L66:
        l93.H(r11, r15);
        return new rh1(r4);
    L68:
        int r16 = l93.p0(r11);
    L70:
        if (r11.dataPosition() >= r16) goto L75;
        int r17 = r11.readInt();
        if (((char) r17) != 1) goto L73;
        r5 = l93.u(r11, r17);
        goto L70
    L73:
        l93.m0(r11, r17);
        goto L70
    L75:
        l93.H(r11, r16);
        return new qh1(r5);
    L77:
        int r18 = l93.p0(r11);
    L79:
        if (r11.dataPosition() >= r18) goto L84;
        int r19 = r11.readInt();
        if (((char) r19) != 1) goto L82;
        r6 = (uf0) l93.w(r11, r19, uf0.CREATOR);
        goto L79
    L82:
        l93.m0(r11, r19);
        goto L79
    L84:
        l93.H(r11, r18);
        return new lh1(r6);
    L86:
        int r110 = l93.p0(r11);
        Bundle r20 = null;
        String r21 = null;
        ResultReceiver r22 = null;
    L88:
        if (r11.dataPosition() >= r110) goto L102;
        int r23 = r11.readInt();
        char r24 = (char) r23;
        if (r24 != 1) goto L92;
        r2 = l93.z(r11, r23, wf0.CREATOR);
        goto L88
    L92:
        if (r24 != 2) goto L94;
        r20 = l93.u(r11, r23);
        goto L88
    L94:
        if (r24 != 3) goto L96;
        r21 = l93.x(r11, r23);
        goto L88
    L96:
        if (r24 != 4) goto L97;
        r22 = (ResultReceiver) l93.w(r11, r23, ResultReceiver.CREATOR);
        goto L88
    L97:
        l93.m0(r11, r23);
        goto L88
    L102:
        l93.H(r11, r110);
        return new GetCredentialRequest(r2, r20, r21, r22);
    L104:
        r11.getClass();
        return new Genre(r11.readString(), r11.readInt(), r11.readInt());
    L108:
        nd1 r111 = new nd1();
        r111.r = null;
        r111.s = new ArrayList();
        r111.t = new ArrayList();
        r111.n = r11.createStringArrayList();
        r111.o = r11.createStringArrayList();
        r111.p = (qo[]) r11.createTypedArray(qo.CREATOR);
        r111.q = r11.readInt();
        r111.r = r11.readString();
        r111.s = r11.createStringArrayList();
        r111.t = r11.createTypedArrayList(ro.CREATOR);
        r111.u = r11.createTypedArrayList(gd1.CREATOR);
        return r111;
    L110:
        gd1 r112 = new gd1();
        r112.n = r11.readString();
        r112.o = r11.readInt();
        return r112;
    L112:
        r11.getClass();
        long r25 = r11.readLong();
        String r26 = r11.readString();
        String r27 = r11.readString();
        boolean r28 = true;
        String r29 = r11.readString();
        if (r11.readInt() != 0) goto L117;
        r28 = false;
    L117:
        return new Favorite(r25, r26, r27, r29, r28);
    L7:
        return new ez2(r11);
    L9:
        return ix2.b(r11.readInt(), r11.readInt());
    L15:
        return new MediaSessionCompat$QueueItem(r11);
    L17:
        return new or2(r11);
    L19:
        return new MediaMetadataCompat(r11);
    L21:
        return new eo2(r11);
    L23:
        return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(r11));
    L25:
        return pm2.a((MediaDescription) MediaDescription.CREATOR.createFromParcel(r11));
    L27:
        return new MediaBrowserCompat$MediaItem(r11);
    L29:
        return new ij2(r11);
    L33:
        return new cc2(r11);
    L107:
        return new be1(r11);
    L119:
        return new iz0(r11);
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
        return new MusicFolder[r1];
    L7:
        return new ez2[r1];
    L9:
        return new ix2[r1];
    L11:
        return new MediaSessionCompat$Token[r1];
    L13:
        return new pr2[r1];
    L15:
        return new MediaSessionCompat$QueueItem[r1];
    L17:
        return new or2[r1];
    L19:
        return new MediaMetadataCompat[r1];
    L21:
        return new eo2[r1];
    L23:
        return new MediaDescriptionCompat[r1];
    L25:
        return new pm2[r1];
    L27:
        return new MediaBrowserCompat$MediaItem[r1];
    L29:
        return new ij2[r1];
    L31:
        return new rh2[r1];
    L33:
        return new cc2[r1];
    L35:
        return new bb2[r1];
    L37:
        return new ItemGenre[r1];
    L39:
        return new ItemDate[r1];
    L41:
        return new InternetRadioStation[r1];
    L43:
        return new p02[r1];
    L45:
        return new rh1[r1];
    L47:
        return new qh1[r1];
    L49:
        return new lh1[r1];
    L51:
        return new GetCredentialRequest[r1];
    L53:
        return new Genre[r1];
    L55:
        return new be1[r1];
    L57:
        return new nd1[r1];
    L59:
        return new gd1[r1];
    L61:
        return new Favorite[r1];
    L63:
        return new iz0[r1];
    }
}
