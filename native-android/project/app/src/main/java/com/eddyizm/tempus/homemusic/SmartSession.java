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
    public static final int $stable = 0;
    public static final Companion Companion = null;
    public static final int LOW_WATER = 1;
    public static final int MAX_SONGS = 5000;
    private static final Set<String> REACTIONS = null;
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

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class Companion {
        public /* synthetic */ Companion(xj0 r1) {
            this();
        }

        public final Map<String, Object> startBody(String r2, List<String> r3, String r4, String r5, String r6, String r7) {
            r2.getClass();
            r3.getClass();
            HashMap r1 = new HashMap();
            r1.put("context", r2);
            r1.put("songs", q40.L0(r3, SmartSession.MAX_SONGS));
            if (r4 != null) goto L5;
        L10:
            if (r5 != null) goto L12;
        L17:
            ux3 r8 = k62.c;
            String r9 = gi1.b0(r6);
            if (r9 == null) goto L20;
            r1.put("origin", r9);
        L20:
            if (r7 != null) goto L22;
        L27:
            return r1;
        L22:
            if (qm4.u0(r7) == false) goto L25;
            r7 = null;
        L25:
            if (r7 == null) goto L27;
            r1.put("client", qm4.J0(32, r7));
            goto L27
        L12:
            if (qm4.u0(r5) == false) goto L15;
            r5 = null;
        L15:
            if (r5 == null) goto L17;
            r1.put("title", qm4.J0(256, r5));
            goto L17
        L5:
            if (qm4.u0(r4) == false) goto L8;
            r4 = null;
        L8:
            if (r4 == null) goto L10;
            r1.put("current", qm4.J0(80, r4));
            goto L10
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        REACTIONS = ti.t0(new String[]{PlayEvent.SKIP, PlayEvent.FINISH, PlayEvent.LIKE, PlayEvent.DISLIKE});
    }

    public SmartSession(String r1, String r2, String r3, List<String> r4) {
        r1.getClass();
        r2.getClass();
        r4.getClass();
        this.context = r2;
        this.title = r3;
        this.original = r4;
        this.id = r1;
        this.recs = new HashMap();
        HashSet<String> r5 = new HashSet();
        Iterator<T> r6 = r4.iterator();
    L4:
        if (r6.hasNext() == false) goto L6;
        String r7 = (String) r6.next();
        r5.add(SmartContexts.INSTANCE.mediaId(r7));
        goto L4
    L6:
        this.listed = r5;
        this.ownIds = new HashSet(r5);
        this.unsent = new ArrayList();
    }

    public static /* synthetic */ boolean a(HashSet r0, PlayEvent r1) {
        return sent$lambda$1(r0, r1);
    }

    private static final boolean sent$lambda$1(HashSet r0, PlayEvent r1) {
        r1.getClass();
        return r0.contains(r1.getEventId());
    }

    public final void accept(String r4) {
        r4.getClass();
        String r0 = this.recs.get(r4);
        if (r0 != null) goto L5;
        return;
    L5:
        this.recs.remove(r4);
        this.recs.remove("hub:".concat(r0));
        this.ownIds.add(r4);
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

    public final boolean isListed(String r1) {
        if (r1 != null) goto L4;
        return false;
    L4:
        if (this.listed.contains(r1) == false) goto L9;
        return true;
    L9:
        return false;
    }

    public final boolean isOwn(String r1) {
        if (r1 != null) goto L4;
        return false;
    L4:
        if (this.ownIds.contains(r1) == false) goto L9;
        return true;
    L9:
        return false;
    }

    public final boolean isRec(String r1) {
        if (r1 != null) goto L4;
        return false;
    L4:
        if (this.recs.containsKey(r1) == false) goto L9;
        return true;
    L9:
        return false;
    }

    public final boolean onEvent(PlayEvent r5) {
        r5.getClass();
        boolean r0 = h12.c(r5.getContext(), getRecContext());
        if (r0 == false) goto L5;
    L7:
        if (r0 == false) goto L10;
        this.unsent.add(r5);
    L10:
        if (h12.c(r5.getKind(), PlayEvent.START) == true) goto L16;
        if (r0 == true) goto L13;
    L15:
        return false;
    L13:
        if (REACTIONS.contains(r5.getKind()) == false) goto L15;
        return true;
    L16:
        return true;
    L5:
        if (h12.c(r5.getContext(), this.context) == true) goto L7;
        return false;
    }

    public final Set<String> recIds() {
        Set<String> r0 = this.recs.keySet();
        r0.getClass();
        return q40.T0(r0);
    }

    public final String refOf(String r1) {
        r1.getClass();
        return this.recs.get(r1);
    }

    public final List<String> register(List<SmartRec> r6) {
        r6.getClass();
        ArrayList r0 = new ArrayList();
        Iterator<T> r7 = r6.iterator();
    L4:
        if (r7.hasNext() == false) goto L19;
        SmartRec r1 = (SmartRec) r7.next();
        String r2 = r1.getRef();
        String r3 = null;
        if (r2 != null) goto L8;
    L17:
        if (r3 == null) goto L4;
        r0.add(r3);
        goto L4
    L8:
        if (qm4.u0(r2) == false) goto L11;
        r2 = null;
    L11:
        if (r2 == null) goto L17;
        String r4 = r1.getQueueId();
        if (r4 == null) goto L17;
        this.recs.put(r4, r2);
        this.recs.put("hub:".concat(r2), r2);
        r3 = r4;
        goto L17
    L19:
        return r0;
    }

    public final void sent(SmartNextIn r3) {
        r3.getClass();
        List<PlayEvent> r4 = r3.getPlayed();
        HashSet r0 = new HashSet();
        Iterator<T> r5 = r4.iterator();
    L4:
        if (r5.hasNext() == false) goto L6;
        r0.add(((PlayEvent) r5.next()).getEventId());
        goto L4
    L6:
        v40.p0(this.unsent, new kh3(r0, 1));
    }

    public final void setAgain(boolean r1) {
        this.again = r1;
    }

    public final void setFailures(int r1) {
        this.failures = r1;
    }

    public final void setInFlight(boolean r1) {
        this.inFlight = r1;
    }

    public final void setPolls(int r1) {
        this.polls = r1;
    }

    public final SmartNextIn snapshot(String r2) {
        return new SmartNextIn(q40.Q0(this.unsent), r2);
    }
}
