package com.eddyizm.tempus.homemusic;

import defpackage.gi1;
import defpackage.h12;
import defpackage.k62;
import defpackage.kh3;
import defpackage.q40;
import defpackage.qm4;
import defpackage.ti;
import defpackage.u01;
import defpackage.ux3;
import defpackage.v40;
import defpackage.xa3;
import defpackage.xj0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class WaveSession {
    public static final String CONTEXT_PREFIX = "wave:";
    public static final int LOW_WATER = 2;
    private static final int MAX_EVENTS = 500;
    private static final int MAX_QUEUED = 50;
    private boolean again;
    private String askedFor;
    private int failures;
    private String id;
    private boolean inFlight;
    private final String mode;
    private int polls;
    private final HashMap<String, String> refs;
    private final Map<String, Object> seed;
    private String settledFor;
    private final String title;
    private final ArrayList<PlayEvent> unsent;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Set<String> ASKING = ti.t0(new String[]{PlayEvent.START, PlayEvent.LIKE, PlayEvent.DISLIKE});

    public WaveSession(String str, String str2, Map<String, ? extends Object> map, String str3) {
        str.getClass();
        this.title = str2;
        this.seed = map;
        this.mode = str3;
        this.id = str;
        this.refs = new HashMap<>();
        this.unsent = new ArrayList<>();
    }

    public static /* synthetic */ WaveNextIn request$default(WaveSession waveSession, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = z;
        }
        return waveSession.request(list, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sent$lambda$1(HashSet hashSet, PlayEvent playEvent) {
        playEvent.getClass();
        return hashSet.contains(playEvent.getEventId());
    }

    public final boolean getAgain() {
        return this.again;
    }

    public final String getAskedFor() {
        return this.askedFor;
    }

    public final String getContext() {
        return xa3.g(CONTEXT_PREFIX, this.id);
    }

    public final int getFailures() {
        return this.failures;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getInFlight() {
        return this.inFlight;
    }

    public final String getMode() {
        return this.mode;
    }

    public final int getPolls() {
        return this.polls;
    }

    public final Map<String, Object> getSeed() {
        return this.seed;
    }

    public final String getSettledFor() {
        return this.settledFor;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Set<String> ids() {
        Set<String> setKeySet = this.refs.keySet();
        setKeySet.getClass();
        return q40.T0(setKeySet);
    }

    public final boolean isWave(String str) {
        return str != null && this.refs.containsKey(str);
    }

    public final boolean onEvent(PlayEvent playEvent) {
        playEvent.getClass();
        if (!h12.c(playEvent.getContext(), getContext())) {
            return false;
        }
        this.unsent.add(playEvent);
        return ASKING.contains(playEvent.getKind());
    }

    public final String refOf(String str) {
        str.getClass();
        return this.refs.get(str);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [u01] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    public final List<String> register(List<? extends WaveTrack> list) {
        ?? I0;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (WaveTrack waveTrack : list) {
            String ref = waveTrack.getRef();
            if (ref == null) {
                I0 = u01.n;
            } else {
                if (qm4.u0(ref)) {
                    ref = null;
                }
                if (ref == null) {
                    I0 = u01.n;
                } else {
                    I0 = ti.i0(new String[]{waveTrack.getSongId(), "hub:".concat(ref)});
                    int size = I0.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = I0.get(i);
                        i++;
                        this.refs.put((String) obj, ref);
                    }
                }
            }
            v40.n0(I0, arrayList);
        }
        return arrayList;
    }

    public final void renew(String str) {
        str.getClass();
        this.id = str;
        this.unsent.clear();
        this.failures = 0;
        this.polls = 0;
    }

    public final WaveNextIn request(List<String> list, boolean z, boolean z2) {
        list.getClass();
        ArrayList<PlayEvent> arrayList = this.unsent;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            PlayEvent playEvent = arrayList.get(i);
            i++;
            boolean z3 = z;
            boolean z4 = z2;
            if (PlayEvent.supported$default(playEvent, z3, z4, false, 4, null)) {
                arrayList2.add(playEvent);
            }
            z = z3;
            z2 = z4;
        }
        List listL0 = q40.L0(arrayList2, 500);
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String str = this.refs.get((String) it.next());
            if (str != null) {
                arrayList3.add(str);
            }
        }
        return new WaveNextIn(listL0, q40.L0(q40.t0(arrayList3), MAX_QUEUED));
    }

    public final void sent(WaveNextIn waveNextIn) {
        waveNextIn.getClass();
        List<PlayEvent> played = waveNextIn.getPlayed();
        HashSet hashSet = new HashSet();
        Iterator<T> it = played.iterator();
        while (it.hasNext()) {
            hashSet.add(((PlayEvent) it.next()).getEventId());
        }
        v40.p0(this.unsent, new kh3(hashSet, 2));
    }

    public final void setAgain(boolean z) {
        this.again = z;
    }

    public final void setAskedFor(String str) {
        this.askedFor = str;
    }

    public final void setFailures(int i) {
        this.failures = i;
    }

    public final void setInFlight(boolean z) {
        this.inFlight = z;
    }

    public final void setPolls(int i) {
        this.polls = i;
    }

    public final void setSettledFor(String str) {
        this.settledFor = str;
    }

    public final boolean settled(String str) {
        if (this.failures <= 0) {
            return str != null && h12.c(this.settledFor, str);
        }
        return true;
    }

    public final WaveNextIn snapshot(List<String> list) {
        list.getClass();
        List listQ0 = q40.Q0(this.unsent);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String str = this.refs.get((String) it.next());
            if (str != null) {
                arrayList.add(str);
            }
        }
        return new WaveNextIn(listQ0, q40.L0(q40.t0(arrayList), MAX_QUEUED));
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class Companion {
        public /* synthetic */ Companion(xj0 xj0Var) {
            this();
        }

        public static /* synthetic */ Map startBody$default(Companion companion, Map map, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            if ((i & 16) != 0) {
                str4 = null;
            }
            return companion.startBody(map, str, str2, str3, str4);
        }

        public final Map<String, Object> startBody(Map<String, ? extends Object> map, String str, String str2, String str3, String str4) {
            HashMap map2 = new HashMap();
            Object obj = map != null ? map.get("ref") : null;
            String str5 = obj instanceof String ? (String) obj : null;
            Object obj2 = map != null ? map.get("artist_ref") : null;
            String str6 = obj2 instanceof String ? (String) obj2 : null;
            Object obj3 = map != null ? map.get("nd_artist_id") : null;
            String str7 = obj3 instanceof String ? (String) obj3 : null;
            if (str5 != null && !qm4.u0(str5)) {
                Map mapSingletonMap = Collections.singletonMap("ref", str5);
                mapSingletonMap.getClass();
                map2.put(WaveTrack.SEED, mapSingletonMap);
            } else if (str7 != null && !qm4.u0(str7)) {
                Map mapSingletonMap2 = Collections.singletonMap("nd_artist_id", str7);
                mapSingletonMap2.getClass();
                map2.put(WaveTrack.SEED, mapSingletonMap2);
            } else if (str6 != null && !qm4.u0(str6)) {
                Map mapSingletonMap3 = Collections.singletonMap("artist_ref", str6);
                mapSingletonMap3.getClass();
                map2.put(WaveTrack.SEED, mapSingletonMap3);
            }
            if (str != null && !qm4.u0(str)) {
                map2.put("mode", str);
            }
            ux3 ux3Var = k62.c;
            String strB0 = gi1.b0(str2);
            if (strB0 != null) {
                map2.put("origin", strB0);
            }
            if (str3 != null) {
                if (qm4.u0(str3)) {
                    str3 = null;
                }
                if (str3 != null) {
                    map2.put("restart_of", qm4.J0(32, str3));
                }
            }
            if (str4 != null) {
                if (qm4.u0(str4)) {
                    str4 = null;
                }
                if (str4 != null) {
                    map2.put("client", qm4.J0(32, str4));
                }
            }
            return map2;
        }

        private Companion() {
        }
    }
}
