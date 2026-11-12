package com.eddyizm.tempus.homemusic;

import defpackage.gi1;
import defpackage.h12;
import defpackage.k62;
import defpackage.kh3;
import defpackage.q40;
import defpackage.qm4;
import defpackage.ti;
import defpackage.ux3;
import defpackage.v40;
import defpackage.xj0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class SmartSession {
    public static final int LOW_WATER = 1;
    public static final int MAX_SONGS = 5000;
    private boolean again;
    private final String context;
    private int failures;
    private String id;
    private boolean inFlight;
    private final HashSet<String> listed;
    private final List<String> original;
    private final HashSet<String> ownIds;
    private int polls;
    private final HashMap<String, String> recs;
    private final String title;
    private final ArrayList<PlayEvent> unsent;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Set<String> REACTIONS = ti.t0(new String[]{PlayEvent.SKIP, PlayEvent.FINISH, PlayEvent.LIKE, PlayEvent.DISLIKE});

    public SmartSession(String str, String str2, String str3, List<String> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.context = str2;
        this.title = str3;
        this.original = list;
        this.id = str;
        this.recs = new HashMap<>();
        HashSet<String> hashSet = new HashSet<>();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(SmartContexts.INSTANCE.mediaId((String) it.next()));
        }
        this.listed = hashSet;
        this.ownIds = new HashSet<>(hashSet);
        this.unsent = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sent$lambda$1(HashSet hashSet, PlayEvent playEvent) {
        playEvent.getClass();
        return hashSet.contains(playEvent.getEventId());
    }

    public final void accept(String str) {
        str.getClass();
        String str2 = this.recs.get(str);
        if (str2 == null) {
            return;
        }
        this.recs.remove(str);
        this.recs.remove("hub:".concat(str2));
        this.ownIds.add(str);
    }

    public final void expire() {
        this.unsent.clear();
    }

    public final boolean getAgain() {
        return this.again;
    }

    public final String getContext() {
        return this.context;
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

    public final List<String> getOriginal() {
        return this.original;
    }

    public final int getPolls() {
        return this.polls;
    }

    public final String getRecContext() {
        return SmartContexts.INSTANCE.recommendation(this.id);
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isListed(String str) {
        return str != null && this.listed.contains(str);
    }

    public final boolean isOwn(String str) {
        return str != null && this.ownIds.contains(str);
    }

    public final boolean isRec(String str) {
        return str != null && this.recs.containsKey(str);
    }

    public final boolean onEvent(PlayEvent playEvent) {
        playEvent.getClass();
        boolean zC = h12.c(playEvent.getContext(), getRecContext());
        if (!zC && !h12.c(playEvent.getContext(), this.context)) {
            return false;
        }
        if (zC) {
            this.unsent.add(playEvent);
        }
        if (h12.c(playEvent.getKind(), PlayEvent.START)) {
            return true;
        }
        return zC && REACTIONS.contains(playEvent.getKind());
    }

    public final Set<String> recIds() {
        Set<String> setKeySet = this.recs.keySet();
        setKeySet.getClass();
        return q40.T0(setKeySet);
    }

    public final String refOf(String str) {
        str.getClass();
        return this.recs.get(str);
    }

    public final List<String> register(List<SmartRec> list) {
        String queueId;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (SmartRec smartRec : list) {
            String ref = smartRec.getRef();
            String str = null;
            if (ref != null) {
                if (qm4.u0(ref)) {
                    ref = null;
                }
                if (ref != null && (queueId = smartRec.getQueueId()) != null) {
                    this.recs.put(queueId, ref);
                    this.recs.put("hub:".concat(ref), ref);
                    str = queueId;
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final void sent(SmartNextIn smartNextIn) {
        smartNextIn.getClass();
        List<PlayEvent> played = smartNextIn.getPlayed();
        HashSet hashSet = new HashSet();
        Iterator<T> it = played.iterator();
        while (it.hasNext()) {
            hashSet.add(((PlayEvent) it.next()).getEventId());
        }
        v40.p0(this.unsent, new kh3(hashSet, 1));
    }

    public final void setAgain(boolean z) {
        this.again = z;
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

    public final SmartNextIn snapshot(String str) {
        return new SmartNextIn(q40.Q0(this.unsent), str);
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class Companion {
        public /* synthetic */ Companion(xj0 xj0Var) {
            this();
        }

        public final Map<String, Object> startBody(String str, List<String> list, String str2, String str3, String str4, String str5) {
            str.getClass();
            list.getClass();
            HashMap map = new HashMap();
            map.put("context", str);
            map.put("songs", q40.L0(list, SmartSession.MAX_SONGS));
            if (str2 != null) {
                if (qm4.u0(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    map.put("current", qm4.J0(80, str2));
                }
            }
            if (str3 != null) {
                if (qm4.u0(str3)) {
                    str3 = null;
                }
                if (str3 != null) {
                    map.put("title", qm4.J0(256, str3));
                }
            }
            ux3 ux3Var = k62.c;
            String strB0 = gi1.b0(str4);
            if (strB0 != null) {
                map.put("origin", strB0);
            }
            if (str5 != null) {
                if (qm4.u0(str5)) {
                    str5 = null;
                }
                if (str5 != null) {
                    map.put("client", qm4.J0(32, str5));
                }
            }
            return map;
        }

        private Companion() {
        }
    }
}
