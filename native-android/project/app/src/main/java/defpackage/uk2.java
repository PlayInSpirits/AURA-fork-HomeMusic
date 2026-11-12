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
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uk2 extends MediaController.Callback {
    public final /* synthetic */ int a = 0;
    public final WeakReference b;

    public uk2(gm2 gm2Var) {
        this.b = new WeakReference(gm2Var);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        int i = this.a;
        WeakReference weakReference = this.b;
        switch (i) {
            case 0:
                gm2 gm2Var = (gm2) weakReference.get();
                if (gm2Var != null && playbackInfo != null) {
                    int playbackType = playbackInfo.getPlaybackType();
                    String volumeControlId = Build.VERSION.SDK_INT >= 30 ? playbackInfo.getVolumeControlId() : null;
                    boolean z = true;
                    if (playbackType == 1 && volumeControlId != null) {
                        z = false;
                    }
                    rr2.l(z);
                    fg4 fg4Var = new fg4(playbackType, il.b(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume(), volumeControlId);
                    im2 im2Var = gm2Var.e;
                    hm2 hm2Var = im2Var.n;
                    im2Var.n = new hm2(fg4Var, (ei3) hm2Var.e, (eo2) hm2Var.f, hm2Var.a, (CharSequence) hm2Var.g, hm2Var.b, hm2Var.c, (Bundle) hm2Var.h);
                    gm2Var.e();
                    break;
                }
                break;
            default:
                if (((np2) weakReference.get()) != null) {
                    playbackInfo.getPlaybackType();
                    playbackInfo.getAudioAttributes();
                    if (Build.VERSION.SDK_INT >= 26) {
                    }
                    playbackInfo.getVolumeControl();
                    playbackInfo.getMaxVolume();
                    playbackInfo.getCurrentVolume();
                }
                break;
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle bundle) {
        int i = this.a;
        WeakReference weakReference = this.b;
        switch (i) {
            case 0:
                Bundle bundleN = f35.n(bundle);
                gm2 gm2Var = (gm2) weakReference.get();
                if (gm2Var != null) {
                    im2 im2Var = gm2Var.e;
                    if (bundleN == null) {
                        bundleN = new Bundle();
                    }
                    Bundle bundle2 = bundleN;
                    hm2 hm2Var = im2Var.n;
                    im2Var.n = new hm2((fg4) hm2Var.d, (ei3) hm2Var.e, (eo2) hm2Var.f, hm2Var.a, (CharSequence) hm2Var.g, hm2Var.b, hm2Var.c, bundle2);
                    im2Var.o = true;
                    gm2Var.e();
                }
                break;
            default:
                rr2.z(bundle);
                break;
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        int i = this.a;
        WeakReference weakReference = this.b;
        eo2 eo2VarCreateFromParcel = null;
        switch (i) {
            case 0:
                gm2 gm2Var = (gm2) weakReference.get();
                if (gm2Var != null) {
                    oi oiVar = eo2.q;
                    if (mediaMetadata != null) {
                        Parcel parcelObtain = Parcel.obtain();
                        mediaMetadata.writeToParcel(parcelObtain, 0);
                        parcelObtain.setDataPosition(0);
                        eo2VarCreateFromParcel = eo2.CREATOR.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        eo2VarCreateFromParcel.o = mediaMetadata;
                    }
                    im2 im2Var = gm2Var.e;
                    hm2 hm2Var = im2Var.n;
                    im2Var.n = new hm2((fg4) hm2Var.d, (ei3) hm2Var.e, eo2VarCreateFromParcel, hm2Var.a, (CharSequence) hm2Var.g, hm2Var.b, hm2Var.c, (Bundle) hm2Var.h);
                    gm2Var.e();
                }
                break;
            default:
                np2 np2Var = (np2) weakReference.get();
                if (np2Var != null) {
                    MediaMetadataCompat mediaMetadataCompatA = MediaMetadataCompat.a(mediaMetadata);
                    switch (np2Var.a) {
                        case 0:
                            qp2 qp2Var = (qp2) np2Var.b;
                            qp2Var.h0 = mediaMetadataCompatA != null ? mediaMetadataCompatA.b() : null;
                            qp2Var.u();
                            qp2Var.t(false);
                            break;
                        default:
                            lq2 lq2Var = (lq2) np2Var.b;
                            lq2Var.Y = mediaMetadataCompatA != null ? mediaMetadataCompatA.b() : null;
                            lq2Var.j();
                            lq2Var.n();
                            break;
                    }
                }
                break;
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        ArrayList arrayList;
        PlaybackStateCompat.CustomAction customAction;
        int i = this.a;
        WeakReference weakReference = this.b;
        switch (i) {
            case 0:
                gm2 gm2Var = (gm2) weakReference.get();
                if (gm2Var != null && gm2Var.c == null) {
                    gm2Var.b(ei3.a(playbackState));
                    break;
                }
                break;
            default:
                np2 np2Var = (np2) weakReference.get();
                if (np2Var != null) {
                    PlaybackStateCompat playbackStateCompat = null;
                    if (playbackState != null) {
                        List<PlaybackState.CustomAction> listJ = bi3.j(playbackState);
                        if (listJ != null) {
                            ArrayList arrayList2 = new ArrayList(listJ.size());
                            for (PlaybackState.CustomAction customAction2 : listJ) {
                                if (customAction2 != null) {
                                    PlaybackState.CustomAction customAction3 = customAction2;
                                    Bundle bundleL = bi3.l(customAction3);
                                    rr2.z(bundleL);
                                    customAction = new PlaybackStateCompat.CustomAction(bi3.f(customAction3), bi3.o(customAction3), bi3.m(customAction3), bundleL);
                                } else {
                                    customAction = null;
                                }
                                arrayList2.add(customAction);
                            }
                            arrayList = arrayList2;
                        } else {
                            arrayList = null;
                        }
                        Bundle bundleA = ci3.a(playbackState);
                        rr2.z(bundleA);
                        playbackStateCompat = new PlaybackStateCompat(bi3.r(playbackState), bi3.q(playbackState), bi3.i(playbackState), bi3.p(playbackState), bi3.g(playbackState), bi3.k(playbackState), bi3.n(playbackState), arrayList, bi3.h(playbackState), bundleA);
                    }
                    switch (np2Var.a) {
                        case 0:
                            qp2 qp2Var = (qp2) np2Var.b;
                            qp2Var.g0 = playbackStateCompat;
                            qp2Var.t(false);
                    }
                }
                break;
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem;
        int i = this.a;
        WeakReference weakReference = this.b;
        switch (i) {
            case 0:
                gm2 gm2Var = (gm2) weakReference.get();
                if (gm2Var != null) {
                    ArrayList arrayListA = or2.a(list);
                    im2 im2Var = gm2Var.e;
                    hm2 hm2Var = im2Var.n;
                    im2Var.n = new hm2((fg4) hm2Var.d, (ei3) hm2Var.e, (eo2) hm2Var.f, im2.X0(arrayListA), (CharSequence) hm2Var.g, hm2Var.b, hm2Var.c, (Bundle) hm2Var.h);
                    gm2Var.e();
                }
                break;
            default:
                if (((np2) weakReference.get()) != null && list != null) {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (Object obj : list) {
                        if (obj != null) {
                            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
                            mediaSessionCompat$QueueItem = new MediaSessionCompat$QueueItem(MediaDescriptionCompat.a(nr2.b(queueItem)), nr2.c(queueItem));
                        } else {
                            mediaSessionCompat$QueueItem = null;
                        }
                        arrayList.add(mediaSessionCompat$QueueItem);
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
        int i = this.a;
        WeakReference weakReference = this.b;
        switch (i) {
            case 0:
                gm2 gm2Var = (gm2) weakReference.get();
                if (gm2Var != null) {
                    im2 im2Var = gm2Var.e;
                    hm2 hm2Var = im2Var.n;
                    im2Var.n = new hm2((fg4) hm2Var.d, (ei3) hm2Var.e, (eo2) hm2Var.f, hm2Var.a, charSequence, hm2Var.b, hm2Var.c, (Bundle) hm2Var.h);
                    gm2Var.e();
                }
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0011. Please report as an issue. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1068)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
        /*
            r1 = this;
            int r0 = r1.a
            java.lang.ref.WeakReference r1 = r1.b
            switch(r0) {
                case 0: goto L15;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r1.get()
            np2 r1 = (defpackage.np2) r1
            if (r1 == 0) goto L14
            int r1 = r1.a
            switch(r1) {
                case 0: goto L14;
                default: goto L14;
            }
        L14:
            return
        L15:
            java.lang.Object r1 = r1.get()
            gm2 r1 = (defpackage.gm2) r1
            if (r1 == 0) goto L26
            im2 r1 = r1.e
            sk2 r1 = r1.a1()
            r1.Y0()
        L26:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uk2.onSessionDestroyed():void");
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        int i = this.a;
        WeakReference weakReference = this.b;
        switch (i) {
            case 0:
                Bundle bundleN = f35.n(bundle);
                gm2 gm2Var = (gm2) weakReference.get();
                if (gm2Var != null) {
                    im2 im2Var = gm2Var.e;
                    if (str != null) {
                        if (bundleN == null) {
                            bundleN = Bundle.EMPTY;
                        }
                        sk2 sk2VarA1 = im2Var.a1();
                        sk2VarA1.getClass();
                        rr2.w(Looper.myLooper() == sk2VarA1.f.getLooper());
                        sk2VarA1.e.y(new va4(str, bundleN));
                        break;
                    }
                }
                break;
            default:
                rr2.z(bundle);
                break;
        }
    }

    public uk2(np2 np2Var) {
        this.b = new WeakReference(np2Var);
    }
}
