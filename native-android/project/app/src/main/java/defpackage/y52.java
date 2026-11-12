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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
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
                kr2 kr2VarA = a();
                if (kr2VarA == null) {
                    return;
                }
                Bundle bundleN = f35.n(bundle);
                b(kr2VarA);
                try {
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        if (resultReceiver != null) {
                            Bundle bundle2 = new Bundle();
                            pr2 pr2Var = kr2VarA.c;
                            qu1 qu1VarA = pr2Var.a();
                            bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", qu1VarA == null ? null : qu1VarA.asBinder());
                            synchronized (pr2Var.n) {
                                u45Var = pr2Var.q;
                                break;
                            }
                            if (u45Var != null) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putParcelable("a", new ParcelImpl(u45Var));
                                bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                            }
                            resultReceiver.send(0, bundle2);
                        }
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        if (bundleN != null) {
                            ((ir2) this.b).c((pm2) uc5.j(bundleN.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), pm2.CREATOR));
                        }
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        if (bundleN != null) {
                            ((ir2) this.b).d((pm2) uc5.j(bundleN.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), pm2.CREATOR), bundleN.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                        }
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        if (bundleN != null) {
                            ((ir2) this.b).r((pm2) uc5.j(bundleN.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), pm2.CREATOR));
                        }
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                        List list = kr2VarA.h;
                        if (list != null && bundleN != null) {
                            int i = bundleN.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                            or2 or2Var = (i < 0 || i >= list.size()) ? null : (or2) list.get(i);
                            if (or2Var != null) {
                                ((ir2) this.b).r(or2Var.n);
                            }
                        }
                    } else {
                        ((ir2) this.b).e(str, bundleN, resultReceiver);
                    }
                } catch (BadParcelableException unused) {
                    l93.F("MediaSessionCompat", "Could not unparcel the extra data.");
                }
                kr2VarA.c(null);
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
                kr2 kr2VarA = a();
                if (kr2VarA != null) {
                    Bundle bundleN = f35.n(bundle);
                    b(kr2VarA);
                    try {
                        if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                            if (bundleN != null) {
                                ir2Var.m((Uri) bundleN.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), f35.n(bundleN.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                            ir2Var.n();
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                            if (bundleN != null) {
                                ir2Var.o(bundleN.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"), f35.n(bundleN.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                            if (bundleN != null) {
                                ir2Var.p(bundleN.getString("android.support.v4.media.session.action.ARGUMENT_QUERY"), f35.n(bundleN.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                            if (bundleN != null) {
                                ir2Var.q((Uri) bundleN.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), f35.n(bundleN.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                            if (bundleN != null) {
                                bundleN.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                            if (bundleN != null) {
                                ir2Var.x(bundleN.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                            if (bundleN != null) {
                                ir2Var.y(bundleN.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                            if (bundleN != null) {
                                mu3 mu3Var = (mu3) uc5.j(bundleN.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), mu3.CREATOR);
                                f35.n(bundleN.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                                ir2Var.w(mu3Var);
                            }
                        } else if (!str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                            ir2Var.f(str, bundleN);
                        } else if (bundleN != null) {
                            ir2Var.u(bundleN.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                        }
                    } catch (BadParcelableException unused) {
                        l93.F("MediaSessionCompat", "Could not unparcel the data.");
                    }
                    kr2VarA.c(null);
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
                kr2 kr2VarA = a();
                if (kr2VarA != null) {
                    b(kr2VarA);
                    ((ir2) this.b).g();
                    kr2VarA.c(null);
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
                kr2 kr2VarA = a();
                if (kr2VarA != null) {
                    b(kr2VarA);
                    boolean zH = ((ir2) this.b).h(intent);
                    kr2VarA.c(null);
                    if (zH || super.onMediaButtonEvent(intent)) {
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
                }
                break;
            default:
                kr2 kr2VarA = a();
                if (kr2VarA != null) {
                    b(kr2VarA);
                    ((ir2) obj).i();
                    kr2VarA.c(null);
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
                }
                break;
            default:
                kr2 kr2VarA = a();
                if (kr2VarA != null) {
                    b(kr2VarA);
                    ((ir2) obj).j();
                    kr2VarA.c(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPlayFromMediaId(String str, Bundle bundle) {
        switch (this.a) {
            case 1:
                kr2 kr2VarA = a();
                if (kr2VarA != null) {
                    Bundle bundleN = f35.n(bundle);
                    b(kr2VarA);
                    ((ir2) this.b).k(str, bundleN);
                    kr2VarA.c(null);
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
                kr2 kr2VarA = a();
                if (kr2VarA != null) {
                    Bundle bundleN = f35.n(bundle);
                    b(kr2VarA);
                    ((ir2) this.b).l(str, bundleN);
                    kr2VarA.c(null);
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
                kr2 kr2VarA = a();
                if (kr2VarA != null) {
                    Bundle bundleN = f35.n(bundle);
                    b(kr2VarA);
                    ((ir2) this.b).m(uri, bundleN);
                    kr2VarA.c(null);
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
                kr2 kr2VarA = a();
                if (kr2VarA != null) {
                    b(kr2VarA);
                    ((ir2) this.b).n();
                    kr2VarA.c(null);
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
                kr2 kr2VarA = a();
                if (kr2VarA != null) {
                    Bundle bundleN = f35.n(bundle);
                    b(kr2VarA);
                    ((ir2) this.b).o(str, bundleN);
                    kr2VarA.c(null);
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
                kr2 kr2VarA = a();
                if (kr2VarA != null) {
                    Bundle bundleN = f35.n(bundle);
                    b(kr2VarA);
                    ((ir2) this.b).p(str, bundleN);
                    kr2VarA.c(null);
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
                kr2 kr2VarA = a();
                if (kr2VarA != null) {
                    Bundle bundleN = f35.n(bundle);
                    b(kr2VarA);
                    ((ir2) this.b).q(uri, bundleN);
                    kr2VarA.c(null);
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
                kr2 kr2VarA = a();
                if (kr2VarA != null) {
                    b(kr2VarA);
                    ((ir2) this.b).s();
                    kr2VarA.c(null);
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
                }
                break;
            default:
                kr2 kr2VarA = a();
                if (kr2VarA != null) {
                    b(kr2VarA);
                    ((ir2) obj).t(j);
                    kr2VarA.c(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSetPlaybackSpeed(float f) {
        switch (this.a) {
            case 1:
                kr2 kr2VarA = a();
                if (kr2VarA != null) {
                    b(kr2VarA);
                    ((ir2) this.b).u(f);
                    kr2VarA.c(null);
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
                kr2 kr2VarA = a();
                if (kr2VarA != null) {
                    b(kr2VarA);
                    ((ir2) this.b).v(mu3.a(rating));
                    kr2VarA.c(null);
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
                }
                break;
            default:
                kr2 kr2VarA = a();
                if (kr2VarA != null) {
                    b(kr2VarA);
                    ((ir2) obj).z();
                    kr2VarA.c(null);
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
                }
                break;
            default:
                kr2 kr2VarA = a();
                if (kr2VarA != null) {
                    b(kr2VarA);
                    ((ir2) obj).A();
                    kr2VarA.c(null);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSkipToQueueItem(long j) {
        switch (this.a) {
            case 1:
                kr2 kr2VarA = a();
                if (kr2VarA != null) {
                    b(kr2VarA);
                    ((ir2) this.b).B(j);
                    kr2VarA.c(null);
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
                }
                break;
            default:
                kr2 kr2VarA = a();
                if (kr2VarA != null) {
                    b(kr2VarA);
                    ((ir2) obj).C();
                    kr2VarA.c(null);
                    break;
                }
                break;
        }
    }
}
