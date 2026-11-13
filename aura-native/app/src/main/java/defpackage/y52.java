package defpackage;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class y52 extends MediaSession.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y52(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static void b(kr2 kr2Var) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        MediaSession mediaSession = kr2Var.a;
        String str = null;
        try {
            str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
        } catch (Exception e) {
            l93.G("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        kr2Var.c(new ms2(str, -1, -1));
    }

    public kr2 a() {
        kr2 kr2Var;
        ir2 ir2Var;
        synchronized (((ir2) this.b).b) {
            kr2Var = (kr2) ((WeakReference) ((ir2) this.b).d).get();
        }
        if (kr2Var == null) {
            return null;
        }
        ir2 ir2Var2 = (ir2) this.b;
        synchronized (kr2Var.d) {
            ir2Var = kr2Var.l;
        }
        if (ir2Var2 == ir2Var) {
            return kr2Var;
        }
        return null;
    }

    @Override // android.media.session.MediaSession.Callback
    public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        u45 u45Var;
        switch (this.a) {
            case 1:
                kr2 a = a();
                if (a == null) {
                    return;
                }
                Bundle n = f35.n(bundle);
                b(a);
                try {
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        if (resultReceiver != null) {
                            Bundle bundle2 = new Bundle();
                            pr2 pr2Var = a.c;
                            qu1 a2 = pr2Var.a();
                            bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", a2 == null ? null : a2.asBinder());
                            synchronized (pr2Var.n) {
                                u45Var = pr2Var.q;
                            }
                            if (u45Var != null) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putParcelable("a", new ParcelImpl(u45Var));
                                bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                            }
                            resultReceiver.send(0, bundle2);
                        }
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        if (n != null) {
                            ((ir2) this.b).c((pm2) uc5.j(n.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), pm2.CREATOR));
                        }
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        if (n != null) {
                            ((ir2) this.b).d((pm2) uc5.j(n.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), pm2.CREATOR), n.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                        }
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        if (n != null) {
                            ((ir2) this.b).r((pm2) uc5.j(n.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), pm2.CREATOR));
                        }
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                        List list = a.h;
                        if (list != null && n != null) {
                            int i = n.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                            or2 or2Var = (i < 0 || i >= list.size()) ? null : (or2) list.get(i);
                            if (or2Var != null) {
                                ((ir2) this.b).r(or2Var.n);
                            }
                        }
                    } else {
                        ((ir2) this.b).e(str, n, resultReceiver);
                    }
                } catch (BadParcelableException unused) {
                    l93.F("MediaSessionCompat", "Could not unparcel the extra data.");
                }
                a.c(null);
                return;
            default:
                super.onCommand(str, bundle, resultReceiver);
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public void onCustomAction(String str, Bundle bundle) {
        switch (this.a) {
            case 1:
                ir2 ir2Var = (ir2) this.b;
                kr2 a = a();
                if (a != null) {
                    Bundle n = f35.n(bundle);
                    b(a);
                    try {
                        if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                            if (n != null) {
                                ir2Var.m((Uri) n.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), f35.n(n.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                            ir2Var.n();
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                            if (n != null) {
                                ir2Var.o(n.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"), f35.n(n.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                            if (n != null) {
                                ir2Var.p(n.getString("android.support.v4.media.session.action.ARGUMENT_QUERY"), f35.n(n.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                            if (n != null) {
                                ir2Var.q((Uri) n.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), f35.n(n.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                            if (n != null) {
                                n.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                            if (n != null) {
                                ir2Var.x(n.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                            if (n != null) {
                                ir2Var.y(n.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                            if (n != null) {
                                mu3 mu3Var = (mu3) uc5.j(n.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), mu3.CREATOR);
                                f35.n(n.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                                ir2Var.w(mu3Var);
                            }
                        } else if (!str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                            ir2Var.f(str, n);
                        } else if (n != null) {
                            ir2Var.u(n.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                        }
                    } catch (BadParcelableException unused) {
                        l93.F("MediaSessionCompat", "Could not unparcel the data.");
                    }
                    a.c(null);
                    break;
                }
                break;
            default:
                super.onCustomAction(str, bundle);
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public void onFastForward() {
        switch (this.a) {
            case 1:
                kr2 a = a();
                if (a != null) {
                    b(a);
                    ((ir2) this.b).g();
                    a.c(null);
                    break;
                }
                break;
            default:
                super.onFastForward();
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public boolean onMediaButtonEvent(Intent intent) {
        switch (this.a) {
            case 1:
                kr2 a = a();
                if (a != null) {
                    b(a);
                    boolean h = ((ir2) this.b).h(intent);
                    a.c(null);
                    if (h || super.onMediaButtonEvent(intent)) {
                        return true;
                    }
                }
                return false;
            default:
                return super.onMediaButtonEvent(intent);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (z52.a == ((MediaSession) obj)) {
                    u52.a("pause", 0L);
                    break;
                }
                break;
            default:
                kr2 a = a();
                if (a != null) {
                    b(a);
                    ((ir2) obj).i();
                    a.c(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (z52.a == ((MediaSession) obj)) {
                    u52.a("play", 0L);
                    break;
                }
                break;
            default:
                kr2 a = a();
                if (a != null) {
                    b(a);
                    ((ir2) obj).j();
                    a.c(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPlayFromMediaId(String str, Bundle bundle) {
        switch (this.a) {
            case 1:
                kr2 a = a();
                if (a != null) {
                    Bundle n = f35.n(bundle);
                    b(a);
                    ((ir2) this.b).k(str, n);
                    a.c(null);
                    break;
                }
                break;
            default:
                super.onPlayFromMediaId(str, bundle);
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPlayFromSearch(String str, Bundle bundle) {
        switch (this.a) {
            case 1:
                kr2 a = a();
                if (a != null) {
                    Bundle n = f35.n(bundle);
                    b(a);
                    ((ir2) this.b).l(str, n);
                    a.c(null);
                    break;
                }
                break;
            default:
                super.onPlayFromSearch(str, bundle);
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPlayFromUri(Uri uri, Bundle bundle) {
        switch (this.a) {
            case 1:
                kr2 a = a();
                if (a != null) {
                    Bundle n = f35.n(bundle);
                    b(a);
                    ((ir2) this.b).m(uri, n);
                    a.c(null);
                    break;
                }
                break;
            default:
                super.onPlayFromUri(uri, bundle);
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPrepare() {
        switch (this.a) {
            case 1:
                kr2 a = a();
                if (a != null) {
                    b(a);
                    ((ir2) this.b).n();
                    a.c(null);
                    break;
                }
                break;
            default:
                super.onPrepare();
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPrepareFromMediaId(String str, Bundle bundle) {
        switch (this.a) {
            case 1:
                kr2 a = a();
                if (a != null) {
                    Bundle n = f35.n(bundle);
                    b(a);
                    ((ir2) this.b).o(str, n);
                    a.c(null);
                    break;
                }
                break;
            default:
                super.onPrepareFromMediaId(str, bundle);
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPrepareFromSearch(String str, Bundle bundle) {
        switch (this.a) {
            case 1:
                kr2 a = a();
                if (a != null) {
                    Bundle n = f35.n(bundle);
                    b(a);
                    ((ir2) this.b).p(str, n);
                    a.c(null);
                    break;
                }
                break;
            default:
                super.onPrepareFromSearch(str, bundle);
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPrepareFromUri(Uri uri, Bundle bundle) {
        switch (this.a) {
            case 1:
                kr2 a = a();
                if (a != null) {
                    Bundle n = f35.n(bundle);
                    b(a);
                    ((ir2) this.b).q(uri, n);
                    a.c(null);
                    break;
                }
                break;
            default:
                super.onPrepareFromUri(uri, bundle);
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public void onRewind() {
        switch (this.a) {
            case 1:
                kr2 a = a();
                if (a != null) {
                    b(a);
                    ((ir2) this.b).s();
                    a.c(null);
                    break;
                }
                break;
            default:
                super.onRewind();
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (z52.a == ((MediaSession) obj)) {
                    u52.a("seek", j);
                    break;
                }
                break;
            default:
                kr2 a = a();
                if (a != null) {
                    b(a);
                    ((ir2) obj).t(j);
                    a.c(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSetPlaybackSpeed(float f) {
        switch (this.a) {
            case 1:
                kr2 a = a();
                if (a != null) {
                    b(a);
                    ((ir2) this.b).u(f);
                    a.c(null);
                    break;
                }
                break;
            default:
                super.onSetPlaybackSpeed(f);
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSetRating(Rating rating) {
        switch (this.a) {
            case 1:
                kr2 a = a();
                if (a != null) {
                    b(a);
                    ((ir2) this.b).v(mu3.a(rating));
                    a.c(null);
                    break;
                }
                break;
            default:
                super.onSetRating(rating);
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (z52.a == ((MediaSession) obj)) {
                    u52.a("next", 0L);
                    break;
                }
                break;
            default:
                kr2 a = a();
                if (a != null) {
                    b(a);
                    ((ir2) obj).z();
                    a.c(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (z52.a == ((MediaSession) obj)) {
                    u52.a("previous", 0L);
                    break;
                }
                break;
            default:
                kr2 a = a();
                if (a != null) {
                    b(a);
                    ((ir2) obj).A();
                    a.c(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSkipToQueueItem(long j) {
        switch (this.a) {
            case 1:
                kr2 a = a();
                if (a != null) {
                    b(a);
                    ((ir2) this.b).B(j);
                    a.c(null);
                    break;
                }
                break;
            default:
                super.onSkipToQueueItem(j);
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (z52.a == ((MediaSession) obj)) {
                    u52.f();
                    break;
                }
                break;
            default:
                kr2 a = a();
                if (a != null) {
                    b(a);
                    ((ir2) obj).C();
                    a.c(null);
                    break;
                }
                break;
        }
    }
}
