package defpackage;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uk2 extends MediaController.Callback {
    public final /* synthetic */ int a;
    public final WeakReference b;

    public uk2(gm2 r2) {
        this.a = 0;
        this.b = new WeakReference(r2);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo r18) {
        int r1 = this.a;
        WeakReference r0 = this.b;
        switch(r1) {
            case 0: goto L12;
            default: goto L5;
        };
    L12:
        gm2 r2 = (gm2) r0.get();
        if (r2 == null) goto L28;
        if (r18 == null) goto L29;
        int r3 = r18.getPlaybackType();
        if (Build.VERSION.SDK_INT < 30) goto L19;
        String r4 = l3.q(r18);
    L18:
        String r7 = r4;
        boolean r5 = true;
        if (r3 != 1) goto L25;
        if (r7 == null) goto L25;
        r5 = false;
    L25:
        rr2.l(r5);
        fg4 r6 = new fg4(r3, il.b(r18.getAudioAttributes()), r18.getVolumeControl(), r18.getMaxVolume(), r18.getCurrentVolume(), r7);
        im2 r8 = r2.e;
        hm2 r9 = r8.n;
        r8.n = new hm2(r6, (ei3) r9.e, (eo2) r9.f, r9.a, (CharSequence) r9.g, r9.b, r9.c, (Bundle) r9.h);
        r2.e();
        return;
    L19:
        r4 = null;
        goto L18
    L29:
        return;
    L28:
        return;
    L5:
        if (((np2) r0.get()) == null) goto L27;
        r18.getPlaybackType();
        r18.getAudioAttributes();
        if (Build.VERSION.SDK_INT >= 26) goto L10;
    L10:
        r18.getVolumeControl();
        r18.getMaxVolume();
        r18.getCurrentVolume();
        return;
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle r11) {
        int r0 = this.a;
        WeakReference r10 = this.b;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        rr2.z(r11);
        np2 r12 = (np2) r10.get();
        return;
    L6:
        Bundle r13 = f35.n(r11);
        gm2 r14 = (gm2) r10.get();
        if (r14 == null) goto L13;
        im2 r1 = r14.e;
        if (r13 != null) goto L11;
        r13 = new Bundle();
    L11:
        Bundle r9 = r13;
        hm2 r15 = r1.n;
        r1.n = new hm2((fg4) r15.d, (ei3) r15.e, (eo2) r15.f, r15.a, (CharSequence) r15.g, r15.b, r15.c, r9);
        r1.o = true;
        r14.e();
        return;
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata r13) {
        int r0 = this.a;
        WeakReference r12 = this.b;
        eo2 r2 = null;
        MediaDescriptionCompat r3 = null;
        MediaDescriptionCompat r4 = null;
        switch(r0) {
            case 0: goto L19;
            default: goto L4;
        };
    L4:
        np2 r14 = (np2) r12.get();
        if (r14 == null) goto L26;
        MediaMetadataCompat r15 = MediaMetadataCompat.a(r13);
        switch(r14.a) {
            case 0: goto L13;
            default: goto L8;
        };
    L8:
        lq2 r16 = (lq2) r14.b;
        if (r15 == null) goto L12;
        r3 = r15.b();
    L12:
        r16.Y = r3;
        r16.j();
        r16.n();
        return;
    L13:
        qp2 r17 = (qp2) r14.b;
        if (r15 == null) goto L17;
        r4 = r15.b();
    L17:
        r17.h0 = r4;
        r17.u();
        r17.t(false);
        return;
    L26:
        return;
    L19:
        gm2 r18 = (gm2) r12.get();
        if (r18 == null) goto L28;
        oi r1 = eo2.q;
        if (r13 == null) goto L24;
        Parcel r5 = Parcel.obtain();
        r13.writeToParcel(r5, 0);
        r5.setDataPosition(0);
        r2 = eo2.CREATOR.createFromParcel(r5);
        r5.recycle();
        r2.o = r13;
    L24:
        im2 r19 = r18.e;
        hm2 r6 = r19.n;
        fg4 r7 = (fg4) r6.d;
        ei3 r8 = (ei3) r6.e;
        r19.n = new hm2(r7, r8, r2, r6.a, (CharSequence) r6.g, r6.b, r6.c, (Bundle) r6.h);
        r18.e();
        return;
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState r24) {
        int r1 = this.a;
        WeakReference r0 = this.b;
        switch(r1) {
            case 0: goto L26;
            default: goto L4;
        };
    L4:
        np2 r2 = (np2) r0.get();
        if (r2 == null) goto L36;
        PlaybackStateCompat r3 = null;
        if (r24 == null) goto L22;
        List<PlaybackState.CustomAction> r4 = bi3.j(r24);
        if (r4 == null) goto L19;
        ArrayList r5 = new ArrayList(r4.size());
        Iterator<PlaybackState.CustomAction> r6 = r4.iterator();
    L12:
        if (r6.hasNext() == false) goto L18;
        PlaybackState.CustomAction r7 = r6.next();
        if (r7 == null) goto L16;
        PlaybackState.CustomAction r8 = r7;
        Bundle r9 = bi3.l(r8);
        rr2.z(r9);
        PlaybackStateCompat.CustomAction r10 = new PlaybackStateCompat.CustomAction(bi3.f(r8), bi3.o(r8), bi3.m(r8), r9);
    L17:
        r5.add(r10);
        goto L12
    L16:
        r10 = null;
        goto L17
    L18:
        ArrayList r19 = r5;
    L20:
        Bundle r22 = ci3.a(r24);
        rr2.z(r22);
        r3 = new PlaybackStateCompat(bi3.r(r24), bi3.q(r24), bi3.i(r24), bi3.p(r24), bi3.g(r24), bi3.k(r24), bi3.n(r24), r19, bi3.h(r24), r22);
        goto L22
    L19:
        r19 = null;
    L22:
        switch(r2.a) {
            case 0: goto L24;
            default: goto L37;
        };
    L24:
        qp2 r11 = (qp2) r2.b;
        r11.g0 = r3;
        r11.t(false);
        return;
    L37:
        return;
    L36:
        return;
    L26:
        gm2 r12 = (gm2) r0.get();
        if (r12 != null) goto L29;
        return;
    L29:
        if (r12.c != null) goto L39;
        r12.b(ei3.a(r24));
        return;
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List r12) {
        int r0 = this.a;
        WeakReference r11 = this.b;
        switch(r0) {
            case 0: goto L16;
            default: goto L5;
        };
    L16:
        gm2 r13 = (gm2) r11.get();
        if (r13 == null) goto L25;
        ArrayList r14 = or2.a(r12);
        im2 r1 = r13.e;
        hm2 r2 = r1.n;
        List r6 = im2.X0(r14);
        r1.n = new hm2((fg4) r2.d, (ei3) r2.e, (eo2) r2.f, r6, (CharSequence) r2.g, r2.b, r2.c, (Bundle) r2.h);
        r13.e();
        return;
    L25:
        return;
    L5:
        if (((np2) r11.get()) == null) goto L15;
        if (r12 == null) goto L23;
        ArrayList r15 = new ArrayList(r12.size());
        Iterator r16 = r12.iterator();
    L9:
        if (r16.hasNext() == false) goto L24;
        Object r3 = r16.next();
        if (r3 == null) goto L13;
        MediaSession.QueueItem r4 = (MediaSession.QueueItem) r3;
        MediaSessionCompat$QueueItem r5 = new MediaSessionCompat$QueueItem(MediaDescriptionCompat.a(nr2.b(r4)), nr2.c(r4));
    L14:
        r15.add(r5);
        goto L9
    L13:
        r5 = null;
        goto L14
    L24:
        return;
    L23:
        return;
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence r12) {
        int r0 = this.a;
        WeakReference r11 = this.b;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        np2 r13 = (np2) r11.get();
        return;
    L6:
        gm2 r14 = (gm2) r11.get();
        if (r14 == null) goto L10;
        im2 r1 = r14.e;
        hm2 r2 = r1.n;
        r1.n = new hm2((fg4) r2.d, (ei3) r2.e, (eo2) r2.f, r2.a, r12, r2.b, r2.c, (Bundle) r2.h);
        r14.e();
        return;
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
        int r0 = this.a;
        WeakReference r1 = this.b;
        switch(r0) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        np2 r2 = (np2) r1.get();
        if (r2 != null) goto L7;
        return;
    L7:
        switch(r2.a) {
            case 0: goto L13;
            default: goto L13;
        };
    L13:
        return;
    L9:
        gm2 r3 = (gm2) r1.get();
        if (r3 == null) goto L14;
        r3.e.a1().Y0();
        return;
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String r3, Bundle r4) {
        int r0 = this.a;
        WeakReference r2 = this.b;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        rr2.z(r4);
        np2 r5 = (np2) r2.get();
        return;
    L6:
        Bundle r6 = f35.n(r4);
        gm2 r7 = (gm2) r2.get();
        if (r7 == null) goto L19;
        im2 r8 = r7.e;
        if (r3 == null) goto L20;
        if (r6 != null) goto L13;
        r6 = Bundle.EMPTY;
    L13:
        sk2 r9 = r8.a1();
        r9.getClass();
        if (Looper.myLooper() != r9.f.getLooper()) goto L16;
        boolean r1 = true;
    L17:
        rr2.w(r1);
        r9.e.y(new va4(r3, r6));
        return;
    L16:
        r1 = false;
        goto L17
    L20:
        return;
    }

    public uk2(np2 r2) {
        this.a = 1;
        this.b = new WeakReference(r2);
    }
}
