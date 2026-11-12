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
    public static final Parcelable.Creator<AlbumID3> CREATOR = new w4(2);
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

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AlbumID3(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Long l, Date date, Date date2, int i, String str6, Date date3, Integer num3, List list, String str7, List list2, List list3, String str8, List list4, List list5, String str9, ItemDate itemDate, ItemDate itemDate2, Boolean bool, List list6, int i2, xj0 xj0Var) {
        Integer num4 = 0;
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? num4 : num, (i2 & 64) != 0 ? num4 : num2, (i2 & 128) != 0 ? 0L : l, (i2 & 256) != 0 ? null : date, (i2 & 512) != 0 ? null : date2, (i2 & 1024) != 0 ? 0 : i, (i2 & 2048) != 0 ? null : str6, (i2 & 4096) != 0 ? new Date(0L) : date3, (i2 & 8192) == 0 ? num3 : 0, (i2 & 16384) != 0 ? null : list, (32768 & i2) != 0 ? null : str7, (i2 & 65536) != 0 ? null : list2, (i2 & 131072) != 0 ? null : list3, (i2 & 262144) != 0 ? null : str8, (i2 & 524288) != 0 ? null : list4, (i2 & 1048576) != 0 ? null : list5, (i2 & 2097152) != 0 ? null : str9, (i2 & 4194304) != 0 ? null : itemDate, (i2 & 8388608) != 0 ? null : itemDate2, (i2 & 16777216) != 0 ? null : bool, (i2 & 33554432) != 0 ? null : list6);
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

    public final void setArtist(String str) {
        this.artist = str;
    }

    public final void setArtistId(String str) {
        this.artistId = str;
    }

    public final void setArtists(List<? extends ArtistID3> list) {
        this.artists = list;
    }

    public final void setCompilation(Boolean bool) {
        this.isCompilation = bool;
    }

    public final void setCoverArtId(String str) {
        this.coverArtId = str;
    }

    public final void setCreated(Date date) {
        this.created = date;
    }

    public final void setDiscTitles(List<? extends DiscTitle> list) {
        this.discTitles = list;
    }

    public final void setDisplayArtist(String str) {
        this.displayArtist = str;
    }

    public final void setDuration(Integer num) {
        this.duration = num;
    }

    public final void setGenre(String str) {
        this.genre = str;
    }

    public final void setGenres(List<? extends ItemGenre> list) {
        this.genres = list;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setMoods(List<String> list) {
        this.moods = list;
    }

    public final void setMusicBrainzId(String str) {
        this.musicBrainzId = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOriginalReleaseDate(ItemDate itemDate) {
        this.originalReleaseDate = itemDate;
    }

    public final void setPlayCount(Long l) {
        this.playCount = l;
    }

    public final void setPlayed(Date date) {
        this.played = date;
    }

    public final void setRecordLabels(List<? extends RecordLabel> list) {
        this.recordLabels = list;
    }

    public final void setReleaseDate(ItemDate itemDate) {
        this.releaseDate = itemDate;
    }

    public final void setReleaseTypes(List<String> list) {
        this.releaseTypes = list;
    }

    public final void setSongCount(Integer num) {
        this.songCount = num;
    }

    public final void setSortName(String str) {
        this.sortName = str;
    }

    public final void setStarred(Date date) {
        this.starred = date;
    }

    public final void setUserRating(Integer num) {
        this.userRating = num;
    }

    public final void setYear(int i) {
        this.year = i;
    }

    public final AlbumID3 strippedForNav() {
        return new AlbumID3(this.id, this.name, this.artist, this.artistId, this.coverArtId, this.songCount, this.duration, this.playCount, this.created, this.starred, this.year, this.genre, this.played, this.userRating, null, this.musicBrainzId, null, null, this.displayArtist, null, null, this.sortName, this.originalReleaseDate, this.releaseDate, this.isCompilation, this.discTitles, 1785856, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.artist);
        parcel.writeString(this.artistId);
        parcel.writeString(this.coverArtId);
        Integer num = this.songCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            xa3.q(parcel, 1, num);
        }
        Integer num2 = this.duration;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            xa3.q(parcel, 1, num2);
        }
        Long l = this.playCount;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeSerializable(this.created);
        parcel.writeSerializable(this.starred);
        parcel.writeInt(this.year);
        parcel.writeString(this.genre);
        parcel.writeSerializable(this.played);
        Integer num3 = this.userRating;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            xa3.q(parcel, 1, num3);
        }
        List<? extends RecordLabel> list = this.recordLabels;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<? extends RecordLabel> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i);
            }
        }
        parcel.writeString(this.musicBrainzId);
        List<? extends ItemGenre> list2 = this.genres;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<? extends ItemGenre> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
        }
        List<? extends ArtistID3> list3 = this.artists;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<? extends ArtistID3> it3 = list3.iterator();
            while (it3.hasNext()) {
                parcel.writeParcelable(it3.next(), i);
            }
        }
        parcel.writeString(this.displayArtist);
        parcel.writeStringList(this.releaseTypes);
        parcel.writeStringList(this.moods);
        parcel.writeString(this.sortName);
        parcel.writeParcelable(this.originalReleaseDate, i);
        parcel.writeParcelable(this.releaseDate, i);
        Boolean bool = this.isCompilation;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List<? extends DiscTitle> list4 = this.discTitles;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list4.size());
        Iterator<? extends DiscTitle> it4 = list4.iterator();
        while (it4.hasNext()) {
            parcel.writeParcelable(it4.next(), i);
        }
    }

    public AlbumID3(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Long l, Date date, Date date2, int i, String str6, Date date3, Integer num3, List<? extends RecordLabel> list, String str7, List<? extends ItemGenre> list2, List<? extends ArtistID3> list3, String str8, List<String> list4, List<String> list5, String str9, ItemDate itemDate, ItemDate itemDate2, Boolean bool, List<? extends DiscTitle> list6) {
        this.id = str;
        this.name = str2;
        this.artist = str3;
        this.artistId = str4;
        this.coverArtId = str5;
        this.songCount = num;
        this.duration = num2;
        this.playCount = l;
        this.created = date;
        this.starred = date2;
        this.year = i;
        this.genre = str6;
        this.played = date3;
        this.userRating = num3;
        this.recordLabels = list;
        this.musicBrainzId = str7;
        this.genres = list2;
        this.artists = list3;
        this.displayArtist = str8;
        this.releaseTypes = list4;
        this.moods = list5;
        this.sortName = str9;
        this.originalReleaseDate = itemDate;
        this.releaseDate = itemDate2;
        this.isCompilation = bool;
        this.discTitles = list6;
    }

    public AlbumID3() {
        this(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108863, null);
    }
}
