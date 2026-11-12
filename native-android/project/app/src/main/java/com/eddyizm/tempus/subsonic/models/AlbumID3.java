package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ka4;
import defpackage.w4;
import defpackage.xa3;
import defpackage.xj0;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class AlbumID3 implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AlbumID3> CREATOR = null;
    private String artist;
    private String artistId;
    private List<? extends ArtistID3> artists;

    @ka4("coverArt")
    private String coverArtId;
    private Date created;
    private List<? extends DiscTitle> discTitles;
    private String displayArtist;
    private Integer duration;
    private String genre;
    private List<? extends ItemGenre> genres;
    private String id;
    private Boolean isCompilation;
    private List<String> moods;
    private String musicBrainzId;
    private String name;
    private ItemDate originalReleaseDate;
    private Long playCount;
    private Date played;
    private List<? extends RecordLabel> recordLabels;
    private ItemDate releaseDate;
    private List<String> releaseTypes;
    private Integer songCount;
    private String sortName;
    private Date starred;
    private Integer userRating;
    private int year;

    static {
        CREATOR = new w4(2);
    }

    public /* synthetic */ AlbumID3(String r27, String r28, String r29, String r30, String r31, Integer r32, Integer r33, Long r34, Date r35, Date r36, int r37, String r38, Date r39, Integer r40, List r41, String r42, List r43, List r44, String r45, List r46, List r47, String r48, ItemDate r49, ItemDate r50, Boolean r51, List r52, int r53, xj0 r54) {
        Integer r2 = 0;
        if ((r53 & 1) == 0) goto L5;
        String r3 = null;
    L7:
        if ((r53 & 2) == 0) goto L9;
        String r5 = null;
    L11:
        if ((r53 & 4) == 0) goto L13;
        String r6 = null;
    L15:
        if ((r53 & 8) == 0) goto L17;
        String r7 = null;
    L19:
        if ((r53 & 16) == 0) goto L21;
        String r8 = null;
    L23:
        if ((r53 & 32) == 0) goto L25;
        Integer r9 = r2;
    L27:
        if ((r53 & 64) == 0) goto L29;
        Integer r10 = r2;
    L31:
        if ((r53 & 128) == 0) goto L33;
        Long r11 = 0L;
    L35:
        if ((r53 & 256) == 0) goto L37;
        Date r14 = null;
    L39:
        if ((r53 & 512) == 0) goto L41;
        Date r15 = null;
    L43:
        if ((r53 & 1024) == 0) goto L45;
        int r1 = 0;
    L47:
        if ((r53 & 2048) == 0) goto L49;
        String r4 = null;
    L51:
        if ((r53 & 4096) == 0) goto L53;
        Date r12 = new Date(0);
    L55:
        if ((r53 & 8192) != 0) goto L59;
        r2 = r40;
    L59:
        if ((r53 & 16384) == 0) goto L61;
        List r13 = null;
    L63:
        if ((32768 & r53) == 0) goto L65;
        String r16 = null;
    L67:
        if ((r53 & 65536) == 0) goto L69;
        List r17 = null;
    L71:
        if ((r53 & 131072) == 0) goto L73;
        List r18 = null;
    L75:
        if ((r53 & 262144) == 0) goto L77;
        String r19 = null;
    L79:
        if ((r53 & 524288) == 0) goto L81;
        List r110 = null;
    L83:
        if ((r53 & 1048576) == 0) goto L85;
        List r20 = null;
    L87:
        if ((r53 & 2097152) == 0) goto L89;
        String r21 = null;
    L91:
        if ((r53 & 4194304) == 0) goto L93;
        ItemDate r22 = null;
    L95:
        if ((r53 & 8388608) == 0) goto L97;
        ItemDate r23 = null;
    L99:
        if ((r53 & 16777216) == 0) goto L101;
        Boolean r24 = null;
    L103:
        if ((r53 & 33554432) == 0) goto L106;
        List r55 = null;
    L107:
        this(r3, r5, r6, r7, r8, r9, r10, r11, r14, r15, r1, r4, r12, r2, r13, r16, r17, r18, r19, r110, r20, r21, r22, r23, r24, r55);
        return;
    L106:
        r55 = r52;
        goto L107
    L101:
        r24 = r51;
        goto L103
    L97:
        r23 = r50;
        goto L99
    L93:
        r22 = r49;
        goto L95
    L89:
        r21 = r48;
        goto L91
    L85:
        r20 = r47;
        goto L87
    L81:
        r110 = r46;
        goto L83
    L77:
        r19 = r45;
        goto L79
    L73:
        r18 = r44;
        goto L75
    L69:
        r17 = r43;
        goto L71
    L65:
        r16 = r42;
        goto L67
    L61:
        r13 = r41;
        goto L63
    L53:
        r12 = r39;
        goto L55
    L49:
        r4 = r38;
        goto L51
    L45:
        r1 = r37;
        goto L47
    L41:
        r15 = r36;
        goto L43
    L37:
        r14 = r35;
        goto L39
    L33:
        r11 = r34;
        goto L35
    L29:
        r10 = r33;
        goto L31
    L25:
        r9 = r32;
        goto L27
    L21:
        r8 = r31;
        goto L23
    L17:
        r7 = r30;
        goto L19
    L13:
        r6 = r29;
        goto L15
    L9:
        r5 = r28;
        goto L11
    L5:
        r3 = r27;
        goto L7
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getArtist() {
        return this.artist;
    }

    public final String getArtistId() {
        return this.artistId;
    }

    public final List<ArtistID3> getArtists() {
        return this.artists;
    }

    public final String getCoverArtId() {
        return this.coverArtId;
    }

    public final Date getCreated() {
        return this.created;
    }

    public final List<DiscTitle> getDiscTitles() {
        return this.discTitles;
    }

    public final String getDisplayArtist() {
        return this.displayArtist;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final String getGenre() {
        return this.genre;
    }

    public final List<ItemGenre> getGenres() {
        return this.genres;
    }

    public final String getId() {
        return this.id;
    }

    public final List<String> getMoods() {
        return this.moods;
    }

    public final String getMusicBrainzId() {
        return this.musicBrainzId;
    }

    public final String getName() {
        return this.name;
    }

    public final ItemDate getOriginalReleaseDate() {
        return this.originalReleaseDate;
    }

    public final Long getPlayCount() {
        return this.playCount;
    }

    public final Date getPlayed() {
        return this.played;
    }

    public final List<RecordLabel> getRecordLabels() {
        return this.recordLabels;
    }

    public final ItemDate getReleaseDate() {
        return this.releaseDate;
    }

    public final List<String> getReleaseTypes() {
        return this.releaseTypes;
    }

    public final Integer getSongCount() {
        return this.songCount;
    }

    public final String getSortName() {
        return this.sortName;
    }

    public final Date getStarred() {
        return this.starred;
    }

    public final Integer getUserRating() {
        return this.userRating;
    }

    public final int getYear() {
        return this.year;
    }

    public final Boolean isCompilation() {
        return this.isCompilation;
    }

    public final void setArtist(String r1) {
        this.artist = r1;
    }

    public final void setArtistId(String r1) {
        this.artistId = r1;
    }

    public final void setArtists(List<? extends ArtistID3> r1) {
        this.artists = r1;
    }

    public final void setCompilation(Boolean r1) {
        this.isCompilation = r1;
    }

    public final void setCoverArtId(String r1) {
        this.coverArtId = r1;
    }

    public final void setCreated(Date r1) {
        this.created = r1;
    }

    public final void setDiscTitles(List<? extends DiscTitle> r1) {
        this.discTitles = r1;
    }

    public final void setDisplayArtist(String r1) {
        this.displayArtist = r1;
    }

    public final void setDuration(Integer r1) {
        this.duration = r1;
    }

    public final void setGenre(String r1) {
        this.genre = r1;
    }

    public final void setGenres(List<? extends ItemGenre> r1) {
        this.genres = r1;
    }

    public final void setId(String r1) {
        this.id = r1;
    }

    public final void setMoods(List<String> r1) {
        this.moods = r1;
    }

    public final void setMusicBrainzId(String r1) {
        this.musicBrainzId = r1;
    }

    public final void setName(String r1) {
        this.name = r1;
    }

    public final void setOriginalReleaseDate(ItemDate r1) {
        this.originalReleaseDate = r1;
    }

    public final void setPlayCount(Long r1) {
        this.playCount = r1;
    }

    public final void setPlayed(Date r1) {
        this.played = r1;
    }

    public final void setRecordLabels(List<? extends RecordLabel> r1) {
        this.recordLabels = r1;
    }

    public final void setReleaseDate(ItemDate r1) {
        this.releaseDate = r1;
    }

    public final void setReleaseTypes(List<String> r1) {
        this.releaseTypes = r1;
    }

    public final void setSongCount(Integer r1) {
        this.songCount = r1;
    }

    public final void setSortName(String r1) {
        this.sortName = r1;
    }

    public final void setStarred(Date r1) {
        this.starred = r1;
    }

    public final void setUserRating(Integer r1) {
        this.userRating = r1;
    }

    public final void setYear(int r1) {
        this.year = r1;
    }

    public final AlbumID3 strippedForNav() {
        List r15 = null;
        List r17 = null;
        List r18 = null;
        List r20 = null;
        List r21 = null;
        return new AlbumID3(this.id, this.name, this.artist, this.artistId, this.coverArtId, this.songCount, this.duration, this.playCount, this.created, this.starred, this.year, this.genre, this.played, this.userRating, r15, this.musicBrainzId, r17, r18, this.displayArtist, r20, r21, this.sortName, this.originalReleaseDate, this.releaseDate, this.isCompilation, this.discTitles, 1785856, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r6, int r7) {
        r6.getClass();
        r6.writeString(this.id);
        r6.writeString(this.name);
        r6.writeString(this.artist);
        r6.writeString(this.artistId);
        r6.writeString(this.coverArtId);
        Integer r0 = this.songCount;
        if (r0 != null) goto L5;
        r6.writeInt(0);
    L6:
        Integer r1 = this.duration;
        if (r1 != null) goto L9;
        r6.writeInt(0);
    L10:
        Long r2 = this.playCount;
        if (r2 != null) goto L13;
        r6.writeInt(0);
    L14:
        r6.writeSerializable(this.created);
        r6.writeSerializable(this.starred);
        r6.writeInt(this.year);
        r6.writeString(this.genre);
        r6.writeSerializable(this.played);
        Integer r3 = this.userRating;
        if (r3 != null) goto L17;
        r6.writeInt(0);
    L18:
        List<? extends RecordLabel> r4 = this.recordLabels;
        if (r4 != null) goto L21;
        r6.writeInt(0);
    L25:
        r6.writeString(this.musicBrainzId);
        List<? extends ItemGenre> r5 = this.genres;
        if (r5 != null) goto L28;
        r6.writeInt(0);
    L32:
        List<? extends ArtistID3> r8 = this.artists;
        if (r8 != null) goto L35;
        r6.writeInt(0);
    L39:
        r6.writeString(this.displayArtist);
        r6.writeStringList(this.releaseTypes);
        r6.writeStringList(this.moods);
        r6.writeString(this.sortName);
        r6.writeParcelable(this.originalReleaseDate, r7);
        r6.writeParcelable(this.releaseDate, r7);
        Boolean r9 = this.isCompilation;
        if (r9 != null) goto L42;
        r6.writeInt(0);
    L43:
        List<? extends DiscTitle> r10 = this.discTitles;
        if (r10 != null) goto L47;
        r6.writeInt(0);
        return;
    L47:
        r6.writeInt(1);
        r6.writeInt(r10.size());
        Iterator<? extends DiscTitle> r11 = r10.iterator();
    L49:
        if (r11.hasNext() == false) goto L51;
        r6.writeParcelable(r11.next(), r7);
        goto L49
    L51:
        return;
    L42:
        r6.writeInt(1);
        r6.writeInt(r9.booleanValue() ? 1 : 0);
        goto L43
    L35:
        r6.writeInt(1);
        r6.writeInt(r8.size());
        Iterator<? extends ArtistID3> r12 = r8.iterator();
    L37:
        if (r12.hasNext() == false) goto L39;
        r6.writeParcelable(r12.next(), r7);
        goto L37
    L28:
        r6.writeInt(1);
        r6.writeInt(r5.size());
        Iterator<? extends ItemGenre> r13 = r5.iterator();
    L30:
        if (r13.hasNext() == false) goto L32;
        r6.writeParcelable(r13.next(), r7);
        goto L30
    L21:
        r6.writeInt(1);
        r6.writeInt(r4.size());
        Iterator<? extends RecordLabel> r14 = r4.iterator();
    L23:
        if (r14.hasNext() == false) goto L25;
        r6.writeParcelable(r14.next(), r7);
        goto L23
    L17:
        xa3.q(r6, 1, r3);
        goto L18
    L13:
        r6.writeInt(1);
        r6.writeLong(r2.longValue());
        goto L14
    L9:
        xa3.q(r6, 1, r1);
        goto L10
    L5:
        xa3.q(r6, 1, r0);
        goto L6
    }

    public AlbumID3(String r1, String r2, String r3, String r4, String r5, Integer r6, Integer r7, Long r8, Date r9, Date r10, int r11, String r12, Date r13, Integer r14, List<? extends RecordLabel> r15, String r16, List<? extends ItemGenre> r17, List<? extends ArtistID3> r18, String r19, List<String> r20, List<String> r21, String r22, ItemDate r23, ItemDate r24, Boolean r25, List<? extends DiscTitle> r26) {
        this.id = r1;
        this.name = r2;
        this.artist = r3;
        this.artistId = r4;
        this.coverArtId = r5;
        this.songCount = r6;
        this.duration = r7;
        this.playCount = r8;
        this.created = r9;
        this.starred = r10;
        this.year = r11;
        this.genre = r12;
        this.played = r13;
        this.userRating = r14;
        this.recordLabels = r15;
        this.musicBrainzId = r16;
        this.genres = r17;
        this.artists = r18;
        this.displayArtist = r19;
        this.releaseTypes = r20;
        this.moods = r21;
        this.sortName = r22;
        this.originalReleaseDate = r23;
        this.releaseDate = r24;
        this.isCompilation = r25;
        this.discTitles = r26;
    }

    public AlbumID3() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        Integer r6 = null;
        Integer r7 = null;
        Long r8 = null;
        Date r9 = null;
        Date r10 = null;
        int r11 = 0;
        String r12 = null;
        Date r13 = null;
        Integer r14 = null;
        List r15 = null;
        String r16 = null;
        List r17 = null;
        List r18 = null;
        String r19 = null;
        List r20 = null;
        List r21 = null;
        String r22 = null;
        ItemDate r23 = null;
        ItemDate r24 = null;
        Boolean r25 = null;
        List r26 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, 67108863, null);
    }
}
