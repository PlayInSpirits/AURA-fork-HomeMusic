package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ol extends AudioDeviceCallback {
    public final /* synthetic */ ql a;

    public ol(ql qlVar) {
        this.a = qlVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        ql qlVar = this.a;
        qlVar.a(nl.b(qlVar.a, qlVar.i, qlVar.h));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        ql qlVar = this.a;
        if (f35.m(audioDeviceInfoArr, qlVar.h)) {
            qlVar.h = null;
        }
        qlVar.a(nl.b(qlVar.a, qlVar.i, qlVar.h));
    }
}
