package defpackage;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.text.TextUtils;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y52 extends MediaSession.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y52(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    public static void b(kr2 r4) {
        if (Build.VERSION.SDK_INT < 28) goto L5;
        return;
    L5:
        MediaSession r0 = r4.a;
        String r1 = null;
        r1 = (String) r0.getClass().getMethod("getCallingPackage", null).invoke(r0, null);     // Catch: Exception -> L8
    L11:
        if (TextUtils.isEmpty(r1) == false) goto L13;
        r1 = "android.media.session.MediaController";
    L13:
        r4.c(new ms2(r1, -1, -1));
        return;
    L8:
        e = move-exception;
        l93.G("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
        goto L11
    }

    public kr2 a() {
        Object r0 = ((ir2) this.b).b;
        monitor-enter(r0);
        kr2 r1 = (kr2) ((WeakReference) ((ir2) this.b).d).get();     // Catch: Throwable -> L18
        monitor-exit(r0);     // Catch: Throwable -> L18
        if (r1 == null) goto L16;
        ir2 r3 = (ir2) this.b;
        Object r2 = r1.d;
        monitor-enter(r2);
        ir2 r4 = r1.l;     // Catch: Throwable -> L13
        monitor-exit(r2);     // Catch: Throwable -> L13
        if (r3 != r4) goto L25;
        return r1;
    L25:
        return null;
    L13:
        th = move-exception;
        throw th;
    L16:
        return null;
    L18:
        th = move-exception;
        throw th;
    }

    @Override // android.media.session.MediaSession.Callback
    public void onCommand(String r6, Bundle r7, ResultReceiver r8) {
        switch(this.a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onCommand(r6, r7, r8);
        return;
    L6:
        kr2 r0 = a();
        if (r0 == null) goto L63;
        Bundle r9 = f35.n(r7);
        b(r0);
    L57:
        l93.F("MediaSessionCompat", "Could not unparcel the extra data.");
    L58:
        r0.c(null);
        return;
    L11:
        if (r6.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER") == false) goto L31;
        if (r8 == null) goto L58;
        Bundle r5 = new Bundle();     // Catch: BadParcelableException -> L57
        pr2 r10 = r0.c;     // Catch: BadParcelableException -> L57
        qu1 r11 = r10.a();     // Catch: BadParcelableException -> L57
        if (r11 != null) goto L16;
        IBinder r12 = null;
    L17:
        r5.putBinder("android.support.v4.media.session.EXTRA_BINDER", r12);     // Catch: BadParcelableException -> L57
        Object r13 = r10.n;     // Catch: BadParcelableException -> L57
        monitor-enter(r13);     // Catch: BadParcelableException -> L57
        u45 r14 = r10.q;     // Catch: Throwable -> L27
        monitor-exit(r13);     // Catch: Throwable -> L27
    L22:
        if (r14 == null) goto L25;
        Bundle r2 = new Bundle();     // Catch: BadParcelableException -> L57
        r2.putParcelable("a", new ParcelImpl(r14));     // Catch: BadParcelableException -> L57
        r5.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", r2);     // Catch: BadParcelableException -> L57
    L25:
        r8.send(0, r5);     // Catch: BadParcelableException -> L57
    L27:
        th = move-exception;
        throw th;     // Catch: BadParcelableException -> L57
    L16:
        r12 = r11.asBinder();     // Catch: BadParcelableException -> L57
        goto L17
    L31:
        if (r6.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM") == false) goto L35;
        if (r9 == null) goto L58;
        ((ir2) this.b).c((pm2) uc5.j(r9.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), pm2.CREATOR));     // Catch: BadParcelableException -> L57
        goto L58
    L35:
        if (r6.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT") == false) goto L39;
        if (r9 == null) goto L58;
        ((ir2) this.b).d((pm2) uc5.j(r9.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), pm2.CREATOR), r9.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));     // Catch: BadParcelableException -> L57
        goto L58
    L39:
        if (r6.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM") == false) goto L43;
        if (r9 == null) goto L58;
        ((ir2) this.b).r((pm2) uc5.j(r9.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), pm2.CREATOR));     // Catch: BadParcelableException -> L57
        goto L58
    L43:
        if (r6.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT") == false) goto L55;
        List r15 = r0.h;     // Catch: BadParcelableException -> L57
        if (r15 == null) goto L58;
        if (r9 == null) goto L58;
        int r16 = r9.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);     // Catch: BadParcelableException -> L57
        if (r16 >= 0) goto L50;
    L52:
        or2 r17 = null;
    L53:
        if (r17 == null) goto L58;
        ((ir2) this.b).r(r17.n);     // Catch: BadParcelableException -> L57
        goto L58
    L50:
        if (r16 >= r15.size()) goto L52;
        r17 = (or2) r15.get(r16);     // Catch: BadParcelableException -> L57
        goto L53
    L55:
        ((ir2) this.b).e(r6, r9, r8);     // Catch: BadParcelableException -> L57
        goto L58
    }

    @Override // android.media.session.MediaSession.Callback
    public void onCustomAction(String r5, Bundle r6) {
        switch(this.a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onCustomAction(r5, r6);
        return;
    L6:
        ir2 r0 = (ir2) this.b;
        kr2 r4 = a();
        if (r4 == null) goto L58;
        Bundle r7 = f35.n(r6);
        b(r4);
    L52:
        l93.F("MediaSessionCompat", "Could not unparcel the data.");
    L53:
        r4.c(null);
        return;
    L12:
        if (r5.equals("android.support.v4.media.session.action.PLAY_FROM_URI") == false) goto L16;
        if (r7 == null) goto L55;
        r0.m((Uri) r7.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), f35.n(r7.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));     // Catch: BadParcelableException -> L52
    L55:
        goto L53
    L16:
        if (r5.equals("android.support.v4.media.session.action.PREPARE") == false) goto L19;
        r0.n();     // Catch: BadParcelableException -> L52
        goto L55
    L19:
        if (r5.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID") == false) goto L23;
        if (r7 == null) goto L55;
        r0.o(r7.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"), f35.n(r7.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));     // Catch: BadParcelableException -> L52
        goto L55
    L23:
        if (r5.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH") == false) goto L27;
        if (r7 == null) goto L55;
        r0.p(r7.getString("android.support.v4.media.session.action.ARGUMENT_QUERY"), f35.n(r7.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));     // Catch: BadParcelableException -> L52
        goto L55
    L27:
        if (r5.equals("android.support.v4.media.session.action.PREPARE_FROM_URI") == false) goto L31;
        if (r7 == null) goto L55;
        r0.q((Uri) r7.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), f35.n(r7.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));     // Catch: BadParcelableException -> L52
        goto L55
    L31:
        if (r5.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED") == false) goto L35;
        if (r7 == null) goto L55;
        r7.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");     // Catch: BadParcelableException -> L52
        goto L55
    L35:
        if (r5.equals("android.support.v4.media.session.action.SET_REPEAT_MODE") == false) goto L39;
        if (r7 == null) goto L55;
        r0.x(r7.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));     // Catch: BadParcelableException -> L52
        goto L55
    L39:
        if (r5.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE") == false) goto L43;
        if (r7 == null) goto L55;
        r0.y(r7.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));     // Catch: BadParcelableException -> L52
        goto L55
    L43:
        if (r5.equals("android.support.v4.media.session.action.SET_RATING") == false) goto L47;
        if (r7 == null) goto L55;
        mu3 r8 = (mu3) uc5.j(r7.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), mu3.CREATOR);     // Catch: BadParcelableException -> L52
        f35.n(r7.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));     // Catch: BadParcelableException -> L52
        r0.w(r8);     // Catch: BadParcelableException -> L52
        goto L55
    L47:
        if (r5.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED") == false) goto L50;
        if (r7 == null) goto L55;
        r0.u(r7.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));     // Catch: BadParcelableException -> L52
        goto L55
    L50:
        r0.f(r5, r7);     // Catch: BadParcelableException -> L52
        goto L55
    }

    @Override // android.media.session.MediaSession.Callback
    public void onFastForward() {
        switch(this.a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onFastForward();
        return;
    L6:
        kr2 r0 = a();
        if (r0 == null) goto L11;
        b(r0);
        ((ir2) this.b).g();
        r0.c(null);
        return;
    }

    @Override // android.media.session.MediaSession.Callback
    public boolean onMediaButtonEvent(Intent r4) {
        switch(this.a) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        kr2 r0 = a();
        if (r0 == null) goto L14;
        b(r0);
        boolean r1 = ((ir2) this.b).h(r4);
        r0.c(null);
        if (r1 == false) goto L12;
    L15:
        return true;
    L12:
        if (super.onMediaButtonEvent(r4) == true) goto L15;
    L14:
        return false;
    L5:
        return super.onMediaButtonEvent(r4);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        kr2 r2 = a();
        if (r2 == null) goto L13;
        b(r2);
        ((ir2) r1).i();
        r2.c(null);
        return;
    L13:
        return;
    L10:
        if (z52.a != ((MediaSession) r1)) goto L14;
        u52.a("pause", 0);
        return;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        kr2 r2 = a();
        if (r2 == null) goto L13;
        b(r2);
        ((ir2) r1).j();
        r2.c(null);
        return;
    L13:
        return;
    L10:
        if (z52.a != ((MediaSession) r1)) goto L14;
        u52.a("play", 0);
        return;
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPlayFromMediaId(String r2, Bundle r3) {
        switch(this.a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onPlayFromMediaId(r2, r3);
        return;
    L6:
        kr2 r0 = a();
        if (r0 == null) goto L11;
        Bundle r4 = f35.n(r3);
        b(r0);
        ((ir2) this.b).k(r2, r4);
        r0.c(null);
        return;
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPlayFromSearch(String r2, Bundle r3) {
        switch(this.a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onPlayFromSearch(r2, r3);
        return;
    L6:
        kr2 r0 = a();
        if (r0 == null) goto L11;
        Bundle r4 = f35.n(r3);
        b(r0);
        ((ir2) this.b).l(r2, r4);
        r0.c(null);
        return;
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPlayFromUri(Uri r2, Bundle r3) {
        switch(this.a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onPlayFromUri(r2, r3);
        return;
    L6:
        kr2 r0 = a();
        if (r0 == null) goto L11;
        Bundle r4 = f35.n(r3);
        b(r0);
        ((ir2) this.b).m(r2, r4);
        r0.c(null);
        return;
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPrepare() {
        switch(this.a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onPrepare();
        return;
    L6:
        kr2 r0 = a();
        if (r0 == null) goto L11;
        b(r0);
        ((ir2) this.b).n();
        r0.c(null);
        return;
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPrepareFromMediaId(String r2, Bundle r3) {
        switch(this.a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onPrepareFromMediaId(r2, r3);
        return;
    L6:
        kr2 r0 = a();
        if (r0 == null) goto L11;
        Bundle r4 = f35.n(r3);
        b(r0);
        ((ir2) this.b).o(r2, r4);
        r0.c(null);
        return;
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPrepareFromSearch(String r2, Bundle r3) {
        switch(this.a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onPrepareFromSearch(r2, r3);
        return;
    L6:
        kr2 r0 = a();
        if (r0 == null) goto L11;
        Bundle r4 = f35.n(r3);
        b(r0);
        ((ir2) this.b).p(r2, r4);
        r0.c(null);
        return;
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPrepareFromUri(Uri r2, Bundle r3) {
        switch(this.a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onPrepareFromUri(r2, r3);
        return;
    L6:
        kr2 r0 = a();
        if (r0 == null) goto L11;
        Bundle r4 = f35.n(r3);
        b(r0);
        ((ir2) this.b).q(r2, r4);
        r0.c(null);
        return;
    }

    @Override // android.media.session.MediaSession.Callback
    public void onRewind() {
        switch(this.a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onRewind();
        return;
    L6:
        kr2 r0 = a();
        if (r0 == null) goto L11;
        b(r0);
        ((ir2) this.b).s();
        r0.c(null);
        return;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long r3) {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        kr2 r2 = a();
        if (r2 == null) goto L13;
        b(r2);
        ((ir2) r1).t(r3);
        r2.c(null);
        return;
    L13:
        return;
    L10:
        if (z52.a != ((MediaSession) r1)) goto L14;
        u52.a("seek", r3);
        return;
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSetPlaybackSpeed(float r2) {
        switch(this.a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onSetPlaybackSpeed(r2);
        return;
    L6:
        kr2 r0 = a();
        if (r0 == null) goto L11;
        b(r0);
        ((ir2) this.b).u(r2);
        r0.c(null);
        return;
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSetRating(Rating r2) {
        switch(this.a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onSetRating(r2);
        return;
    L6:
        kr2 r0 = a();
        if (r0 == null) goto L11;
        b(r0);
        ((ir2) this.b).v(mu3.a(r2));
        r0.c(null);
        return;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        kr2 r2 = a();
        if (r2 == null) goto L13;
        b(r2);
        ((ir2) r1).z();
        r2.c(null);
        return;
    L13:
        return;
    L10:
        if (z52.a != ((MediaSession) r1)) goto L14;
        u52.a("next", 0);
        return;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        kr2 r2 = a();
        if (r2 == null) goto L13;
        b(r2);
        ((ir2) r1).A();
        r2.c(null);
        return;
    L13:
        return;
    L10:
        if (z52.a != ((MediaSession) r1)) goto L14;
        u52.a("previous", 0);
        return;
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSkipToQueueItem(long r2) {
        switch(this.a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onSkipToQueueItem(r2);
        return;
    L6:
        kr2 r0 = a();
        if (r0 == null) goto L11;
        b(r0);
        ((ir2) this.b).B(r2);
        r0.c(null);
        return;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        kr2 r2 = a();
        if (r2 == null) goto L13;
        b(r2);
        ((ir2) r1).C();
        r2.c(null);
        return;
    L13:
        return;
    L10:
        if (z52.a != ((MediaSession) r1)) goto L14;
        u52.f();
        return;
    }
}
