package com.eddyizm.tempus.subsonic.models;

import java.util.Date;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class User {
    public static final int $stable = 8;
    private Date avatarLastChanged;
    private String email;
    private List<Integer> folders;
    private boolean isAdminRole;
    private boolean isCommentRole;
    private boolean isCoverArtRole;
    private boolean isDownloadRole;
    private boolean isJukeboxRole;
    private boolean isPlaylistRole;
    private boolean isPodcastRole;
    private boolean isScrobblingEnabled;
    private boolean isSettingsRole;
    private boolean isShareRole;
    private boolean isStreamRole;
    private boolean isUploadRole;
    private boolean isVideoConversionRole;
    private Integer maxBitRate;
    private String username;

    public final Date getAvatarLastChanged() {
        return this.avatarLastChanged;
    }

    public final String getEmail() {
        return this.email;
    }

    public final List<Integer> getFolders() {
        return this.folders;
    }

    public final Integer getMaxBitRate() {
        return this.maxBitRate;
    }

    public final String getUsername() {
        return this.username;
    }

    public final boolean isAdminRole() {
        return this.isAdminRole;
    }

    public final boolean isCommentRole() {
        return this.isCommentRole;
    }

    public final boolean isCoverArtRole() {
        return this.isCoverArtRole;
    }

    public final boolean isDownloadRole() {
        return this.isDownloadRole;
    }

    public final boolean isJukeboxRole() {
        return this.isJukeboxRole;
    }

    public final boolean isPlaylistRole() {
        return this.isPlaylistRole;
    }

    public final boolean isPodcastRole() {
        return this.isPodcastRole;
    }

    public final boolean isScrobblingEnabled() {
        return this.isScrobblingEnabled;
    }

    public final boolean isSettingsRole() {
        return this.isSettingsRole;
    }

    public final boolean isShareRole() {
        return this.isShareRole;
    }

    public final boolean isStreamRole() {
        return this.isStreamRole;
    }

    public final boolean isUploadRole() {
        return this.isUploadRole;
    }

    public final boolean isVideoConversionRole() {
        return this.isVideoConversionRole;
    }

    public final void setAdminRole(boolean z) {
        this.isAdminRole = z;
    }

    public final void setAvatarLastChanged(Date date) {
        this.avatarLastChanged = date;
    }

    public final void setCommentRole(boolean z) {
        this.isCommentRole = z;
    }

    public final void setCoverArtRole(boolean z) {
        this.isCoverArtRole = z;
    }

    public final void setDownloadRole(boolean z) {
        this.isDownloadRole = z;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final void setFolders(List<Integer> list) {
        this.folders = list;
    }

    public final void setJukeboxRole(boolean z) {
        this.isJukeboxRole = z;
    }

    public final void setMaxBitRate(Integer num) {
        this.maxBitRate = num;
    }

    public final void setPlaylistRole(boolean z) {
        this.isPlaylistRole = z;
    }

    public final void setPodcastRole(boolean z) {
        this.isPodcastRole = z;
    }

    public final void setScrobblingEnabled(boolean z) {
        this.isScrobblingEnabled = z;
    }

    public final void setSettingsRole(boolean z) {
        this.isSettingsRole = z;
    }

    public final void setShareRole(boolean z) {
        this.isShareRole = z;
    }

    public final void setStreamRole(boolean z) {
        this.isStreamRole = z;
    }

    public final void setUploadRole(boolean z) {
        this.isUploadRole = z;
    }

    public final void setUsername(String str) {
        this.username = str;
    }

    public final void setVideoConversionRole(boolean z) {
        this.isVideoConversionRole = z;
    }
}
